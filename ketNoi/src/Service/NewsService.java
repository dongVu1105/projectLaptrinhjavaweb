package Service;

import java.util.List;

import DAO.INewsDAO;
import DAO.NewsDAO;
import models.NewsModel;

public class NewsService implements INewsService {
	
	INewsDAO newsDAO = new NewsDAO();

	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		return newsDAO.findByCategoryId(categoryId);
	}

	@Override
	public NewsModel save(NewsModel newModel) {
		return null;
	}

	@Override
	public NewsModel update(NewsModel updateNew) {
		return null;
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTotalItem() {
		return newsDAO.getTotalItem();
	}

	@Override
	public NewsModel findOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
