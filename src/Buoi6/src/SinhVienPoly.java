
public class SinhVienPoly extends SinhVien{
    private String chuyenNganhHep;
    //constructor

    public SinhVienPoly() {
    }

    public SinhVienPoly(String chuyenNganhHep, String maSV, String hoTen, String chuyenNganh) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }
    //getter and setter

    public String getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(String chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }
    //hàm in thông tin
    @Override
    public void inThongTin(){
        super.inThongTin();//gọi ra hàm in thông tin của lớp cha
        System.out.println("chuyên ngành hẹp: "+chuyenNganhHep);
    }
}
