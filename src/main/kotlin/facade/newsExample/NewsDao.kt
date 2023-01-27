package facade.newsExample

class NewsDao {
    fun getAll() = arrayListOf(NewsModel(id = 0, title = "Title fake", content = "Content fake"))
    fun insertAll(news: ArrayList<NewsModel>) {}
    fun insert(news: NewsModel) {}
}