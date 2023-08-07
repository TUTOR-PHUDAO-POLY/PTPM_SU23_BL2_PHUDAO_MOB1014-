
package bai1;


public class ThucVat {
    ///ma - String, ten - String, gioiTinh -boolean, canNang - double, chieuCao - int, loai - String
    private String ma;
    private String ten;
    private boolean gioiTinh;
    private double canNang;
    private int chieuCao;
    private String loai;
    //constructor

    public ThucVat() {
    }

    public ThucVat(String ma, String ten, boolean gioiTinh, double canNang, int chieuCao, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.loai = loai;
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

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    //void display
    public void display(){
        ///ma - String, ten - String, gioiTinh -boolean, canNang - double, chieuCao - int, loai - String
        System.out.println("Mã: "+ma);
        System.out.println("Tên: "+ten);
        if(gioiTinh==true){
            System.out.println("giới tính: đực");
        }else{
            System.out.println("giới tính: cái");
        }
        System.out.println("Cân nặng: "+canNang);
        System.out.println("Chiều cao: "+chieuCao);
        System.out.println("Loài: "+loai);
    }
}
