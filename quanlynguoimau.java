package thigiuaki;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class quanlynguoimau {
	Vector list = new Vector();
	public quanlynguoimau() {
		while(true) {
			System.out.println("**CHƯƠNG TRÌNH QUẢN LỸ NGƯỜI MẪU**");
			System.out.println("**--Các chức năng--**");
			System.out.println(" 1. Nhập danh sách người mẫu ");
			System.out.println(" 2. Xem danh sách người mẫu ");
			System.out.println(" 3. Sắp xếp danh sách người mẫu có chiều cao tăng dần ");
			System.out.println(" 4. Tìm người mẫu theo tên ");
			System.out.println(" 5. Tìm người mẫu theo tuổi ");
			System.out.println(" 6. Thoát ");
			
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println(" Nhập một số để chọn chức năng: ");
			n = key.nextInt();
			switch(n)
			{
			case 1:
				this.InTT();
				break;
			case 2:
				this.NhapTT();
				break;
			case 3:
				sort();
				break;
			case 4:
				search();
				break;
			case 5:
				System.out.println("****Chương trình kết thúc****");
			return;
				
			}
			
			
		}
	}
	public void InTT() {
		int n;
		Scanner key = new Scanner(System.in);
		System.out.println(" Nhập số lượng người mẫu: ");
		n = key.nextInt();
		for( int i=1;i<=n;i++) {
			System.out.println(" Nhập thông tin người mẫu thứ: "+i);
			System.out.print(" Mã số: ");
			int maSo = Integer.parseInt(key.next());
			key.nextLine();
			System.out.print(" Tên: ");
			String name = key.nextLine();
			System.out.print(" Chiều cao: ");
			float tall = key.nextFloat();
			System.out.print(" Tuổi: ");
			int age = key.nextInt();
			Model md = new Model(maSo,name,tall,age);
			list.add(md);
		}
		System.out.println("\n*******\n");
	}
	public void NhapTT() {
		System.out.println(" Thông tin danh sách người mẫu");
		Enumeration vEnum = list.elements();
		int i=1;
		while(vEnum.hasMoreElements())
		{
			Model mds = (Model)vEnum.nextElement();
			System.out.println("   "+i+". Mã số="+mds.getMaSo()+",Tên="+mds.getName()+", Chiều cao="+mds.getTall()+", Tuổi="+mds.getAge());
			i++;
			
		}
		System.out.println("\n*******\n");
	}
	public void sort() {
		Model[] mds = new Model[list.size()];
		int index=0;
		Enumeration vEnum = list.elements();
		while(vEnum.hasMoreElements()) {
			mds[index] = (Model)vEnum.nextElement();
			index++;
		}
	Arrays.sort(mds);	
	System.out.println("\n**Danh sách người mẫu khi đã sắp xếp**");
	for(index=0; index < mds.length; index++) 
	   {
		System.out.println("    "+(index+1)+".Mã số="+mds[index].getMaSo()+", Tên"+mds[index].getName()+", Chiều cao="+mds[index].getTall()+", Tuổi="+mds[index].getAge());
	  }
	System.out.println("\n********\n");
	}
    
    public void search() {
    	Scanner key = new Scanner(System.in);
    	System.out.println(" Nhập tên người mẫu muốn tìm: ");
    	String name = key.nextLine();
    	Enumeration vEnum = list.elements();
    	System.out.println("\n **Thông tin tìm được là**");
    	while(vEnum.hasMoreElements())
    	{
    		Model mds = (Model)vEnum.nextElement();
    		if(mds.getName().indexOf(name)!=-1)
    			System.out.println("Mã số="+mds.getMaSo()+",Tên="+mds.getName()+", Chiều cao="+mds.getTall()+", Tuổi="+mds.getAge());
    			
    	}
    	System.out.println("\n*******\n");
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new quanlynguoimau();

	}

}
