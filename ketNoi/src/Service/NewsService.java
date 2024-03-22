package Service;

import java.sql.Timestamp;
import java.util.List;

import DAO.CategoryDAO;
import DAO.ICategoryDAO;
import DAO.INewsDAO;
import DAO.NewsDAO;
import models.CategoryModel;
import models.NewsModel;

public class NewsService implements INewsService {

	INewsDAO newsDAO = new NewsDAO();
	ICategoryDAO categoryDAO = new CategoryDAO();

	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		return newsDAO.findByCategoryId(categoryId);
	}

	@Override
	public NewsModel save(NewsModel newModel) {
		newModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		newModel.setCreatedBy("");
		CategoryModel categoryModel = new CategoryModel();
		categoryModel = categoryDAO.findOneByCode(newModel.getCategoryCode());
		newModel.setCategoryId(categoryModel.getId());
		Long id = newsDAO.save(newModel);
		newModel = newsDAO.findOne(id);
		return newModel;
	}

	@Override
	public NewsModel update(NewsModel updateNew) {
		NewsModel oldNews = newsDAO.findOne(updateNew.getId());
		updateNew.setCreatedDate(oldNews.getCreatedDate());
		updateNew.setCreatedBy(oldNews.getCreatedBy());
		updateNew.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		updateNew.setModifiedBy("");
		newsDAO.update(updateNew);
		return newsDAO.findOne(updateNew.getId());
	}

	@Override
	public void delete(long[] ids) {
		for (int i = 0; i < ids.length; i++) {
			newsDAO.delete(ids[i]);
		}
	}

	@Override
	public int getTotalItem() {
		return newsDAO.getTotalItem();
	}

	@Override
	public NewsModel findOne(long id) {
		return newsDAO.findOne(id);
	}

}
