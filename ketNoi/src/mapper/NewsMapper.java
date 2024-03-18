package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import models.NewsModel;

public class NewsMapper implements RowMapper<NewsModel> {

	@Override
	public NewsModel mapRow(ResultSet rs) {
		try {
			NewsModel newsModel = new NewsModel();
			newsModel.setId(rs.getLong("id"));
			newsModel.setTitle(rs.getString("title"));
			newsModel.setCategoryId(rs.getLong("categoryId"));
			newsModel.setContent(rs.getString("content"));
			newsModel.setThumbnail(rs.getString("thumbnail"));
			newsModel.setShortDescription(rs.getString("shortdescription"));
			newsModel.setCreatedDate(rs.getTimestamp("createddate"));
			newsModel.setCreatedBy(rs.getString("createdby"));
			if (rs.getTimestamp("modifieddate") != null) {
				newsModel.setModifiedDate(rs.getTimestamp("modifieddate"));
			}
			if (rs.getString("modifiedby") != null) {
				newsModel.setModifiedBy(rs.getString("modifiedby"));
			}
			return newsModel;

		} catch (SQLException e) {
			return null;
		}
	}

}
