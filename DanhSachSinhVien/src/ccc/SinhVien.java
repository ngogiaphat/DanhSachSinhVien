package ccc;
public class SinhVien implements Comparable<SinhVien> 
{
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private float diemTB;
	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTB) 
    {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}
	public String getMaSinhVien() 
    {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien)
    {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() 
    {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) 
    {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() 
    {
		return namSinh;
	}
	public void setNamSinh(int namSinh) 
    {
		this.namSinh = namSinh;
	}
	public float getDiemTB() 
    {
		return diemTB;
	}
	public void setDiemTB(float diemTB) 
    {
		this.diemTB = diemTB;
	}
	@Override
	public String toString() 
    {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", diemTB="
				+ diemTB + "]";
	}
	@Override
	public int compareTo(SinhVien o) 
    {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}
}