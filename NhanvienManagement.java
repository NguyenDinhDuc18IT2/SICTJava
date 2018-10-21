package duc;
import java.text.SimpleDateFormat; 
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class NhanvienManagement {
	Vector list = new Vector();
	public NhanvienManagement() {
		while(true) {
			System.out.println("******Quan ly nhan vien******");
			System.out.println("1. Nhap nhan vien");
			System.out.println("2. Xem nhan vien");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("-----------Moi ban chon chuc nang ----------");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
			}
		}
	}
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong nhan vien= ");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap ma nhan vien= ");
			String maNV=key.nextLine();
			System.out.println("Nhap ten nhan vien= ");
			String tenNV=key.nextLine();
			System.out.println("Nhap so luong nhan vien= ");
			int sl=Integer.parseInt(key.nextLine());
			System.out.println("Nam sinh= ");
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String namSinh=key.nextLine();	
			Quanlynhanvien a = new Quanlynhanvien(maNV,tenNV,sl,namSinh);
			list.add(a);
		}	
		
	}
	public void InTT() {
		Enumeration enumerationnhanvien = list.elements();
		int i=1;
		while(enumerationnhanvien.hasMoreElements()) {
			Quanlynhanvien nhanvien = (Quanlynhanvien)enumerationnhanvien.nextElement();
			System.out.println("Ma NV ="+nhanvien.getMaNV()+" va ten NV la "+nhanvien.getTenNV());
		}
	}
	public static void main(String[] args) {
         new NhanvienManagement();
	}

}

