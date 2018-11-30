package io.github.lumue.woelkchen.download.tasks

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import io.github.lumue.nfotools.Movie
import io.github.lumue.woelkchen.download.LocationMetadataReader
import io.github.lumue.woelkchen.download.isMetadataJson
import io.github.lumue.woelkchen.download.locationMetadataFileSuffix
import io.github.lumue.woelkchen.download.util.configureMovieBuilderWithLocationMetadata
import kotlinx.coroutines.newFixedThreadPoolContext
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import javax.xml.bind.JAXBContext
import kotlin.coroutines.CoroutineContext


private val objectMapper: ObjectMapper = ObjectMapper().registerModule(JavaTimeModule())


private val locationMetadataReader: LocationMetadataReader = LocationMetadataReader(objectMapper)


private val threadpoolContext: CoroutineContext = newFixedThreadPoolContext(30, "load-meta-json-worker")


private val nfoSerializer = io.github.lumue.nfotools.NfoMovieSerializer(
        JAXBContext.newInstance(Movie::class.java, Movie.Actor::class.java)
)

fun main(args: Array<String>) {


    val fileProcessor =
            newFileProcessor(filter = { it.isMetadataJson })
            {
                val instream = FileInputStream(it)
                val locationMetadata = locationMetadataReader.read(instream)
                instream.close()
                val movieBuilder = Movie.MovieBuilder()
                locationMetadata.configureMovieBuilderWithLocationMetadata(movieBuilder)
                val out = FileOutputStream(it.absolutePath.replace(locationMetadataFileSuffix, ".nfo"))
                nfoSerializer.serialize(movieBuilder.build(), out)
                out.close()
            }


    fileProcessor(path = "/mnt/nasbox/media/adult")


}

private fun newFileProcessor(
        context: CoroutineContext = threadpoolContext,
        filter: (file: File) -> Boolean,
        block: suspend (file: File) -> Any)
        : ProcessFiles {
    return ProcessFiles(
            context = context,
            fileFilter = filter,
            handleFile = block
    )
}


