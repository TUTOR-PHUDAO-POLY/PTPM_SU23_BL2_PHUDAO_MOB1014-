
public class SinhVien {
    //thuộc tính
    private String maSV;
    private String hoTen;
    private String chuyenNganh;
    //constructor

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String chuyenNganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }
    //getter and setter 

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    //hàm inThongTin: void
    public void inThongTin(){
        System.out.println("Mã SV: "+maSV);
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Chuyên ngành: "+chuyenNganh);
    }
}
