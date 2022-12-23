package ccc;
import java.util.*;
public class DanhSachSinhVien 
{
	private ArrayList<SinhVien> danhSach;
	public DanhSachSinhVien() 
    {
		this.danhSach = new ArrayList<SinhVien>();
	}
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) 
    {
		this.danhSach = danhSach;
	}
	public void themSinhVien(SinhVien sv) 
    {
		this.danhSach.add(sv);
	}
	public void inDS()
    {
		for (SinhVien sinhVien : danhSach) 
        {
			System.out.println(sinhVien.toString());
		}
	}
	public boolean rong() 
    {
		return this.danhSach.isEmpty();
	}
	public int soLuong() 
    {
		return this.danhSach.size();
	}
	public void lamRong() 
    {
		this.danhSach.removeAll(danhSach);
	}
	public boolean kiemTra(SinhVien o) 
    {
		return this.danhSach.contains(o);
	} 
	public void xoaSinhVien(SinhVien sv) 
    {
		this.danhSach.remove(sv);
	}
}