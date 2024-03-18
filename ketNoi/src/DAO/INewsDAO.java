package DAO;

import java.util.List;

import models.NewsModel;

public interface INewsDAO extends GenericDAO<NewsModel> {
	NewsModel findOne(Long id);
	List<NewsModel> findByCategoryId(Long categoryId);
	Long save(NewsModel newModel);
	void update(NewsModel updateNew);
	void delete(long id);
	int getTotalItem();
}
