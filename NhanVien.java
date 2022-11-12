package learnjava.QLNS;

import java.util.Scanner;
public class NhanVien {
    private String Hoten;
    private String MaNV;
    private String Gioitinh;
    private String Diachi;
    private String Sdt;
    
    public NhanVien(){}
    public NhanVien(String t, String m, String g, String dc, String dt){
        this.Hoten = t;
        this.MaNV = m;
        this.Gioitinh = g;
        this.Diachi = dc;
        this.Sdt = dt;
    }
    public NhanVien (NhanVien nv){
        Hoten = nv.Hoten;
        MaNV = nv.MaNV;
        Gioitinh = nv.Gioitinh;
        Diachi = nv.Diachi;
        Sdt = nv.Sdt;

    }
    public void setHoten(String Hoten){
        this.Hoten = Hoten;
    }
    public String getHoten(){
        return Hoten;
    }
    public void setMaNV(String MaNV){
        this.MaNV = MaNV;
    }
    public String getMaNV(){
        return MaNV;
    }
    public void setGioitinh(String Gioitinh){
        this.Gioitinh = Gioitinh;
    }
    public String getGioitinh(){
        return Gioitinh;
    }
    public void setDiachi(String Diachi){
        this.Diachi = Diachi;
    }
    public String getDiachi(){
        return Diachi;
    }
    public void setSdt(String Sdt){
        this.Sdt = Sdt;
    }
    public String getSdt(){
        return Sdt;
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Ma Nhan Vien: ");
        MaNV = input.nextLine();
        System.out.println("Nhap Ho va ten: ");
        Hoten = input.nextLine();
        System.out.println("Nhap Gioi tinh: ");
        Gioitinh = input.nextLine();
        System.out.println("Nhap Dia chi: ");
        Diachi = input.nextLine();
        System.out.println("Nhap So dien thoai: ");
        Sdt = input.nextLine();
    }
    public void xuat(){
        System.out.println("MA NV: "+MaNV+" Ho ten: "+Hoten+" Gioi tinh: "+Gioitinh+
        " Dia chi: "+Diachi+" So dt: "+Sdt);
    }
}
