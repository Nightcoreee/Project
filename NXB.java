package learnjava.QLNS;
import java.util.Scanner;

import javax.print.DocFlavor.READER;
public class NXB {
    protected String TenNXB;
    protected String WebNXB;

    public NXB(){}
    public NXB(String txb, String wxb){
        this.TenNXB = txb;
        this.WebNXB = wxb;
    }
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten xb: ");
        TenNXB = input.nextLine();
        System.out.println("Nhap Web xb:");
        WebNXB = input.nextLine();
    }
    public void xuat(){
        System.out.println("Ten nxb: "+TenNXB+"; Web nxb: "+WebNXB);
    }
    public void setTenNXB(String TenNXB){
        this.TenNXB = TenNXB;
    }
    public String getTenNXB(){
        return TenNXB;
    }
    public void setWebNXB(String WebNXB){
        this.WebNXB = WebNXB;
    }
    public String getWebNXB(){
        return WebNXB;
    }
}
