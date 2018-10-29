package io.github.lumue.woelkchen.download

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.Duration
import java.time.LocalDateTime

data class MediaLocation(val url: String,
                         val added: LocalDateTime = LocalDateTime.now())

data class LocationMetadata(@JsonProperty("url") val url: String,
                            @JsonProperty("contentMetadata") val contentMetadata: ContentMetadata,
                            @JsonProperty("downloadMetadata") val downloadMetadata : DownloadMetadata) {

    data class DownloadMetadata(@JsonProperty("selectedStreams") val selectedStreams: List<MediaStreamMetadata>,
                                @JsonProperty("additionalStreams") val additionalStreams: List<MediaStreamMetadata> )


    data class MediaStreamMetadata (@JsonProperty("id") val id:String,
                                    @JsonProperty("url") val url:String,
                                    @JsonProperty("headers") val headers: Map<String,String>,
                                    @JsonProperty("contentType") val contentType: ContentType,
                                    @JsonProperty("codec") val codec: String,
                                    @JsonProperty("filenameExtension") val filenameExtension : String,
                                    @JsonProperty("expectedSize") val expectedSize: Long)


    enum class ContentType {AUDIO,VIDEO,CONTAINER}

    data class ContentMetadata(@JsonProperty("title") val title: String,
                               @JsonProperty("description") val description: String = "",
                               @JsonProperty("tags") val tags: Set<Tag> = setOf(),
                               @JsonProperty("actors") val actors: Set<Actor> = setOf(),
                               @JsonProperty("duration") val duration: Duration = Duration.ZERO,
                               @JsonProperty("views") val views: Int = 0,
                               @JsonProperty("downloaded") val downloaded: LocalDateTime?,
                               @JsonProperty("uploaded") val uploaded: LocalDateTime?,
                               @JsonProperty("hoster") val hoster: String?,
                               @JsonProperty("votes") val votes: Int?

    ){


        data class Tag(@JsonProperty("id") val id: String,@JsonProperty("name") val name:String)
        data class Actor(@JsonProperty("id") val id: String,@JsonProperty("name") val name: String)
    }

}