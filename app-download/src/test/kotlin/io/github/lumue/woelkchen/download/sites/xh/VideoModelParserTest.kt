package io.github.lumue.woelkchen.download.sites.xh


import org.junit.Assert
import org.junit.Test
import org.apache.commons.io.FileUtils
import java.io.File


class VideoModelParserTest {

    val htmlString = FileUtils.readFileToString(
                File(javaClass.classLoader.getResource("io/github/lumue/woelkchen/download/sites/xh/xhpage.html").toURI()
                ),
                "UTF-8"
        )


    @Test
    fun testParsePage() {
        val videoModel = VideoModelParser().fromHtml(htmlString)
        Assert.assertNotNull(videoModel)
    }


}