
package bai1;


public class LopHoc {
    //maLop - String , tenLop - String , dienTich - int, diaDiemLopHoc - String
    private String maLop;
    private String tenLop;
    private int dienTich;
    private String diaDiemLopHoc;
    //constructor

    public LopHoc() {
    }

    public LopHoc(String maLop, String tenLop, int dienTich, String diaDiemLopHoc) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.dienTich = dienTich;
        this.diaDiemLopHoc = diaDiemLopHoc;
    }
    //getter and setter

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public String getDiaDiemLopHoc() {
        return diaDiemLopHoc;
    }

    public void setDiaDiemLopHoc(String diaDiemLopHoc) {
        this.diaDiemLopHoc = diaDiemLopHoc;
    }
    //hàm void inThongTin()
    public void inThongTin(){
        System.out.println("Mã lớp học: "+maLop);
        System.out.println("Tên lớp học: "+tenLop);
        System.out.println("Diện tích lớp học: "+dienTich);
        System.out.println("Địa điểm lớp học: "+diaDiemLopHoc);
    }
}
