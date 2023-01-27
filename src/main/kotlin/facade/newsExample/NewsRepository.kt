package facade.newsExample

class NewsRepository(
    private val newsDao: NewsDao,
    private val newsApi: NewsApi,
    private val newsCache: NewsCache,
) {

    fun getNews(): List<NewsModel> {
        var news = newsCache.getAll()
        if (news.isEmpty()) {
            news = newsDao.getAll()
            if (news.isEmpty()) {
                news = newsApi.fetchNews()
                newsDao.insertAll(news)
                newsCache.insertAll(news)
            }
        }
        return news
    }

    fun getNewsById(id: Int): NewsModel {
        var news = newsCache.getById(id)
        if (news == null) {
            news = newsApi.fetchNewById(id)
            newsDao.insert(news)
            newsCache.insert(news)
        }
        return news
    }
}