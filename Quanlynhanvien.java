package duc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Quanlynhanvien {
	String maNV;
    String tenNV;
	int sl;
	String namSinh;
	
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public String getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}
	public Quanlynhanvien() {
		
	}
	public Quanlynhanvien(String maNV,String tenNV,int sl,String namSinh) {
		this.maNV=maNV;
		this.tenNV=tenNV;
		this.sl=sl;
		this.namSinh=namSinh;
	}
}

