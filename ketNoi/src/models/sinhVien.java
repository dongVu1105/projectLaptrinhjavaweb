package models;

public class sinhVien {
	String hoDem;
	String Ten;
	String ID;
	int ngaySinh;
	int namNhapHoc;

	public sinhVien(String ID) {
		super();
		this.ID = ID;
	}

	public sinhVien(String hoDem, String ten, String iD, int ngaySinh, int namNhapHoc) {
		super();
		this.hoDem = hoDem;
		Ten = ten;
		ID = iD;
		this.ngaySinh = ngaySinh;
		this.namNhapHoc = namNhapHoc;
	}

	public String getHoDem() {
		return hoDem;
	}

	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}

	public String getTen() {
		return Ten;
	}

	public void setTen(String ten) {
		Ten = ten;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(int ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public int getNamNhapHoc() {
		return namNhapHoc;
	}

	public void setNamNhapHoc(int namNhapHoc) {
		this.namNhapHoc = namNhapHoc;
	}

	@Override
	public String toString() {
		return "sinhVien [hoDem=" + hoDem + ", Ten=" + Ten + ", ID=" + ID + ", ngaySinh=" + ngaySinh + ", namNhapHoc="
				+ namNhapHoc + "]";
	}

}
