package learnjava.QLNS;
import java.util.Scanner;
public class SanPham {
    private String MaSP;
    private String TenSP;
    private String Donvi;
    private String Giaban;

    public SanPham(){}
    public SanPham(String ma, String tsp, String dv, String g){
        this.MaSP = ma;
        this.TenSP = tsp;
        this.Donvi = dv;
        this.Giaban = g;
    }
    public SanPham(SanPham Sp){
        MaSP = Sp.MaSP;
        TenSP = Sp.TenSP;
        Donvi = Sp.Donvi;
        Giaban = Sp.Giaban;
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap MaSp: ");
        MaSP = input.nextLine();
        System.out.println("Nhap Tensp: ");
        TenSP = input.nextLine();
        System.out.println("Nhap Donvi: ");
        Donvi = input.nextLine();
        System.out.println("Nhap Gia ban: ");
        Giaban = input.nextLine();
    }
    public void xuat(){
        System.out.println("MaSp: " +MaSP+ "; TenSp: "+TenSP+"; Donvi: " +Donvi+"; Giaban: " +Giaban);
    }
    public void setMaSP(String MaSP){
        this.MaSP = MaSP;
    }
    public String getMaSP(){
        return MaSP;
    }
    public void setTenSP(String TenSP){
        this.TenSP = TenSP;
    }
    public String getTenSP(){
        return TenSP;
    }
    public void setDonvi(String Donvi){
        this.Donvi = Donvi;
    }
    public String getDonvi(){
        return Donvi;
    }
    public void setGiaban(String Giaban){
        this.Giaban = Giaban;
    }
    public String getGiaban(){
        return Giaban;
    }
}
