
package bai2;

public class SinhVien {
    //ma-String, ten- String, tuoi - int, gioiTinh- boolean
    private String ma;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    //constructor

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, int tuoi, boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public void inThongTin(){
        System.out.println("Mã SV: "+ma);
        System.out.println("Tên SV: "+ten);
        System.out.println("Tuổi SV: "+tuoi);
        //cách 1:(sử dụng if else)
        if(gioiTinh==true){
            System.out.println("giới tính: Nam");
        }else{
            System.out.println("giới tính: Nữ");
        }
        //cách 2:(sử dụng toán tử 3 ngôi
        System.out.println("giới tính: "+(gioiTinh==true?"Nam":"Nữ"));
    }
}
