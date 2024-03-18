package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import models.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel> {

	@Override
	public CategoryModel mapRow(ResultSet rs) {

		try {
			CategoryModel categoryModal = new CategoryModel();
			categoryModal.setId(rs.getLong("id"));
			categoryModal.setCode(rs.getString("code"));
			categoryModal.setName(rs.getString("name"));
			return categoryModal;
		} catch (SQLException e) {
			return null;
		}
	}

}
