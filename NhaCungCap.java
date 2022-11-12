package learnjava.QLNS;
import java.util.Scanner;
public class NhaCungCap {
    protected String Tencc;
    protected String Macc;
    protected String Sdtcc;
    protected String Diachi;

    public NhaCungCap(){}

    public NhaCungCap(String T, String M, String dt, String Dc){
        this.Tencc = T;
        this.Macc = M;
        this.Sdtcc = dt;
        this.Diachi = Dc;
    }
    public NhaCungCap(NhaCungCap NCC){
        Tencc = NCC.Tencc;
        Macc = NCC.Macc;
        Sdtcc = NCC.Sdtcc;
        Diachi = NCC.Diachi;
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Ten nha cung cap: ");
        Tencc = input.nextLine();
        System.out.println("Nhap Ma nha cung cap: ");
        Macc = input.nextLine();
        System.out.println("Nhap So dien thoai: ");
        Sdtcc = input.nextLine();
        System.out.println("Nhap dia chi: ");
        Diachi = input.nextLine();
    }
    public void xuat(){
        System.out.println("Ten nha cung cap: "+Tencc+"; Ma nha cung cap: "
        +Macc+"; So dien thoai: "+Sdtcc+"; Dia chi" +Diachi);
    }
    public void setTencc(String Tencc){
        this.Tencc = Tencc;
    }
    public String getTencc(){
        return Tencc;
    }
    public void setMacc(String Macc){
        this.Macc = Macc;
    }
    public String getMacc(){
        return Macc;
    }
    public void setSdtcc(String Sdtcc){
        this.Sdtcc = Sdtcc;
    }
    public String getSdtcc(){
        return Sdtcc;
    }
    public void setDiachi(String Diachi){
        this.Diachi = Diachi;
    }
    public String getDiachi(){
        return Diachi;
    }
}
