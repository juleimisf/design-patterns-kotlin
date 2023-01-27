package facade.newsExample

class NewsCache {
    fun getAll() = arrayListOf(NewsModel(id = 0, title = "Title fake", content = "Content fake"))
    fun insertAll(news: ArrayList<NewsModel>) {}
    fun getById(id: Int) = NewsModel(id = 0, title = "Title fake", content = "Content fake")
    fun insert(news: NewsModel) {}
}
