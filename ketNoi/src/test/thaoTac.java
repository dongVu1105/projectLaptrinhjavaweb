package test;

import java.util.ArrayList;

import DAO.sinhVienDAO;
import models.sinhVien;

public class thaoTac {
	public static void main(String[] args) {
		/* Them sv
		sinhVien sv = new sinhVien("Hoang", "Quan", "10", 2002, 2025);
		sinhVienDAO.getInstance().insert(sv);
		*/
		/* sua sv
		sinhVien sv = new sinhVien("Hoang", "Minh", "10", 2002, 2025);
		sinhVienDAO.getInstance().update(sv);
		*/
		/* xoa sv
		sinhVien sv = new sinhVien("Hoang", "Minh", "10", 2002, 2025);
		sinhVienDAO.getInstance().delete(sv);
		*/
		/* lay tat ca
		ArrayList<sinhVien> list = sinhVienDAO.getInstance().selectAll();
		for(sinhVien sv : list) {
			System.out.println(sv.toString());
		}
		*/ 
		/* lay sinh vien theo ID
		sinhVien sv = new sinhVien("1");
		sinhVien kq = sinhVienDAO.getInstance().selectByID(sv);
		System.out.println(kq.toString());
		*/
		String dk=" namNhapHoc=2023 ";
		ArrayList<sinhVien> kq = sinhVienDAO.getInstance().selectByCondition(dk);
		for(sinhVien sv : kq) {
			System.out.println(sv.toString());
		}
	}
}
