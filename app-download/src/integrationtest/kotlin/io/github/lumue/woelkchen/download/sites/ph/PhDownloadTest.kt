package io.github.lumue.woelkchen.download.sites.ph


import io.github.lumue.woelkchen.download.AbstractDownloadTest
import io.github.lumue.woelkchen.download.BasicHttpDownload
import io.github.lumue.woelkchen.download.DownloadFileStep
import io.github.lumue.woelkchen.download.ResolveMetadataStep

class PhDownloadTest : AbstractDownloadTest() {

    val httpClient : PhHttpClient = PhHttpClient()

    override val downloader: DownloadFileStep = BasicHttpDownload(httpClient)
    override val resolver: ResolveMetadataStep = PhResolver(httpClient)
    override val urlList = listOf(
            "https://www.pornhub.com/view_video.php?viewkey=ph5757d65b3b72d")



}