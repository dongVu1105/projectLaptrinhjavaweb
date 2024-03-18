package Service;

import java.util.List;

import models.NewsModel;

public interface INewsService {
	List<NewsModel> findByCategoryId(Long categoryId);
	NewsModel save(NewsModel newModel);
	NewsModel update(NewsModel updateNew);
	void delete(long[] ids);
	int getTotalItem();
	NewsModel findOne(long id);
}
