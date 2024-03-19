package DAO;

import java.util.List;

import mapper.NewsMapper;
import models.NewsModel;

public class NewsDAO extends AbstractDAO<NewsModel> implements INewsDAO {

	@Override
	public NewsModel findOne(Long id) {
		String sql = "SELECT * FROM news WHERE id = ?";
		List<NewsModel> news = query(sql, new NewsMapper(), id);
		if (news.isEmpty()) {
			return null;
		} else {
			return news.get(0);
		}
	}

	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE id = ?";
		List<NewsModel> news = query(sql, new NewsMapper(), categoryId);
		return news;
	}

	@Override
	public Long save(NewsModel newsModel) {
		// dung String cung duoc
		StringBuilder sql = new StringBuilder(
				"INSERT INTO news(title, content, thumbnail, shortdescription, categoryid, createddate, createdby) VALUES (?,?,?,?,?,?,?)");
		return insert(sql.toString(), newsModel.getTitle(), newsModel.getContent(), newsModel.getThumbnail(),
				newsModel.getShortDescription(), newsModel.getCategoryId(), newsModel.getCreatedDate(),
				newsModel.getCreatedBy());
	}

	@Override
	public void update(NewsModel updateNew) {
		StringBuilder sql = new StringBuilder(
				"UPDATE news SET title = ?, thumbnail = ?, shortdescription = ?, content = ?, categoryid = ?,  createddate = ?, createdby = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");
		update(sql.toString(), updateNew.getTitle(), updateNew.getThumbnail(), updateNew.getShortDescription(),
				updateNew.getContent(), updateNew.getCategoryId(), updateNew.getCreatedDate(), updateNew.getCreatedBy(),
				updateNew.getModifiedDate(), updateNew.getModifiedBy(), updateNew.getId());
	}

	@Override
	public void delete(long id) {
		String sql = new String("DELETE FROM news WHERE id=?");
		update(sql, id);
	}

	@Override
	public int getTotalItem() {
		String sql = "SELECT COUNT(*) FROM news";
		return count(sql);
	}

}
