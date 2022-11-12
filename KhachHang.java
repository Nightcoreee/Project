package learnjava.QLNS;

import java.util.Scanner;
public class KhachHang {
    private String TenKH;
    private String MaKH;
    private String Diachi;
    private String Sdt;

    public KhachHang(){}
    public KhachHang(String tkh, String mkh, String dc, String dt){
        this.TenKH = tkh;
        this.MaKH = mkh;
        this.Diachi = dc;
        this.Sdt = dt;
    }
    public KhachHang(KhachHang KH){
        TenKH = KH.TenKH;
        MaKH = KH.MaKH;
        Diachi = KH.Diachi;
        Sdt = KH.Sdt;
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten kh: ");
        TenKH = input.nextLine();
        System.out.println("Nhap ma kh: ");
        MaKH = input.nextLine();
        System.out.println("Nhap dia chi: ");
        Diachi = input.nextLine();
        System.out.println("Nhap So dien thoai: ");
        Sdt = input.nextLine();
    }
    public void xuat(){
        System.out.println("Ten KH: " +TenKH+"; Ma KH: " +MaKH+"; Dia chi: " +Diachi+"; So dien thoai: "+Sdt);
    }
    public void setTenKH(String TenKH){
        this.TenKH = TenKH;
    }
    public String getTenKH(){
        return TenKH;
    }
    public void setMaKH(String MaKH){
        this.MaKH = MaKH;
    }
    public String getMaKH(){
        return MaKH;
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

}
