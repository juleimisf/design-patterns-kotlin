package facade.newsExample

class NewsApi {
    fun fetchNews() = arrayListOf(NewsModel(id = 0, title = "Title fake", content = "Content fake"))
    fun fetchNewById(id: Int) = NewsModel(id = 0, title = "Title fake", content = "Content fake")
}