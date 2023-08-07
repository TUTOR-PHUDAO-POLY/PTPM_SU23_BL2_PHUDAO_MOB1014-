
package bai2;


public class DongVat {
   //ma- String , ten-String , gioiTinh-int (1-Đức, 2- Cái), canNang- int
    private String ma;
    private String ten;
    private int gioiTinh;
    private int canNang;
    //constructor

    public DongVat() {
    }

    public DongVat(String ma, String ten, int gioiTinh, int canNang) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
    }
    //getter and setter

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }
    //hàm inThongTin: void
    public void inThongTin(){
        System.out.println("Mã: "+ma);
        System.out.println("Ten: "+ten);
        System.out.println("giới tính: "+(gioiTinh==1?"Đực":"Cái"));
        System.out.println("Cân nặng: "+canNang);
    }
}
