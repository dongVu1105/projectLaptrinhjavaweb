package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import database.JDBCUtil;

import models.sinhVien;

public class sinhVienDAO implements DAOinterfaces<sinhVien> {
	
	public static sinhVienDAO getInstance() {
		return new sinhVienDAO();
	}

	@Override
	public int insert(sinhVien t) {
		int kq = 0;
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql = "INSERT INTO sinhvien (ID, hoDem, Ten, ngaySinh, namNhapHoc) " + "VALUES (?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, t.getID());
			pst.setString(2, t.getHoDem());
			pst.setString(3, t.getTen());
			pst.setInt(4, t.getNgaySinh());
			pst.setInt(5, t.getNamNhapHoc());
			kq = pst.executeUpdate();
			System.out.println("Ban da thuc thi: " + sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return kq;
	}

	@Override
	public int update(sinhVien t) {
		int kq = 0;
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql = "UPDATE sinhvien SET hoDem = ?, Ten = ? , ngaySinh= ?, namNhapHoc=? WHERE ID=?";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, t.getHoDem());
			pst.setString(2, t.getTen());
			pst.setInt(3, t.getNgaySinh());
			pst.setInt(4, t.getNamNhapHoc());
			pst.setString(5, t.getID());
			kq = pst.executeUpdate();
			System.out.println("Ban da thuc thi: " + sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public int delete(sinhVien t) {
		int kq = 0;
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql = "DELETE FROM sinhvien WHERE (ID = ?)";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, t.getID());
			kq = pst.executeUpdate();
			System.out.println("Ban da thuc thi: " + sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<sinhVien> selectAll() {
		ArrayList<sinhVien> list = new ArrayList<sinhVien>();
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql = "SELECT * FROM sinhvien";
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String ID = rs.getString("ID");
				String hoDem = rs.getString("hoDem");
				String Ten = rs.getString("Ten");
				int ngaySinh = rs.getInt("ngaySinh");
				int namNhapHoc = rs.getInt("namNhapHoc");
				sinhVien sv = new sinhVien(hoDem, Ten, ID, ngaySinh, namNhapHoc);
				list.add(sv);
			}
			System.out.println("Ban da thuc thi: " + sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public sinhVien selectByID(sinhVien t) {
		sinhVien kq=null;
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql = "SELECT * FROM sinhvien WHERE ID = ?";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, t.getID());

			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String ID = rs.getString("ID");
				String hoDem = rs.getString("hoDem");
				String Ten = rs.getString("Ten");
				int ngaySinh = rs.getInt("ngaySinh");
				int namNhapHoc = rs.getInt("namNhapHoc");
				kq = new sinhVien(hoDem, Ten, ID, ngaySinh, namNhapHoc);
			}
			System.out.println("Ban da thuc thi: " + sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public ArrayList<sinhVien> selectByCondition(String condition) {
		ArrayList<sinhVien> list = new ArrayList<sinhVien>();
		try {
			Connection connection = JDBCUtil.getConnection();
			Statement st = connection.createStatement();
			String sql = "SELECT * FROM sinhvien WHERE "+condition;
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String ID = rs.getString("ID");
				String hoDem = rs.getString("hoDem");
				String Ten = rs.getString("Ten");
				int ngaySinh = rs.getInt("ngaySinh");
				int namNhapHoc = rs.getInt("namNhapHoc");
				sinhVien sv = new sinhVien(hoDem, Ten, ID, ngaySinh, namNhapHoc);
				list.add(sv);
			}
			System.out.println("Ban da thuc thi: " + sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
