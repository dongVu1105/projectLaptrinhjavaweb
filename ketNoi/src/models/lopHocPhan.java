package models;

public class lopHocPhan {
	String ID;
	String tenLop;
	String malop;

	public lopHocPhan(String iD, String tenLop, String malop) {
		super();
		ID = iD;
		this.tenLop = tenLop;
		this.malop = malop;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getMalop() {
		return malop;
	}

	public void setMalop(String malop) {
		this.malop = malop;
	}

}
