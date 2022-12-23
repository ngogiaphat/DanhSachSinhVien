package Test;
import java.util.*;
import ccc.*;
public class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon=0;
		do 
		{
			System.out.println("------------MENU---------");
			System.out.println("1. Them sinh vien");
			System.out.println("2. In danh sach");
			System.out.println("3. Kiem tra rong");
			System.out.println("4. Lay so luong sinh vien");
			System.out.println("5. Lam rong");
			System.out.println("6. Kiem tra co ton tai hay khong");
			System.out.println("7. Xoa sinh vien");
			System.out.println("8. Tim");
			System.out.println("9. Xuat");
			System.out.println("0. Thoat");
			luaChon=sc.nextInt();
			switch (luaChon) 
			{
				case 1: 
				{
					sc.nextLine();
					System.out.println("Nhap ma sinh vien: ");
					String maSV = sc.nextLine();
					System.out.println("Nhap ho va ten: ");
					String hoVaTen = sc.nextLine();
					System.out.println("Nhap nam sinh: ");
					int namSinh = sc.nextInt();
					System.out.println("Nhap diem trung binh");
					float diemTB = sc.nextFloat();
					SinhVien sv = new SinhVien(maSV, hoVaTen, namSinh, diemTB);
					dssv.themSinhVien(sv);
					break;
				}
				case 2:
				{
					dssv.inDS();
					break;
				}
				case 3:
				{
					boolean ck =dssv.rong();
					if (ck==true) System.out.println("Rong!");
					else System.out.println("Khong rong!");
					break;
				}
				case 4:
				{
					System.out.println("So luong sinh vien: "+dssv.soLuong());
					break;
				}
				case 5:
				{
					dssv.lamRong();
				}
			}
		} 
		while(luaChon!=0);
	}
}