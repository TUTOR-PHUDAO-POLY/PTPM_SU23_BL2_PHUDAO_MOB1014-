
package bai3;


public class DongHo {
    //:maDongHo - int, theLoai - String, mauSac- String, kichThuoc - int, chatLieu -String, gia-int
    private int maDongHo;
    private String theLoai;
    private String mauSac;
    private int kichThuoc;
    private String chatLieu;
    private int gia;
    //constructor

    public DongHo() {
    }

    public DongHo(int maDongHo, String theLoai, String mauSac, int kichThuoc, String chatLieu, int gia) {
        this.maDongHo = maDongHo;
        this.theLoai = theLoai;
        this.mauSac = mauSac;
        this.kichThuoc = kichThuoc;
        this.chatLieu = chatLieu;
        this.gia = gia;
    }
    //getter and setter

    public int getMaDongHo() {
        return maDongHo;
    }

    public void setMaDongHo(int maDongHo) {
        this.maDongHo = maDongHo;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    //hàm inThongTin

    @Override
    public String toString() {
        return "DongHo{" + "maDongHo=" + maDongHo + ", theLoai=" + theLoai + ", mauSac=" + mauSac + ", kichThuoc=" + kichThuoc + ", chatLieu=" + chatLieu + ", gia=" + gia + '}';
    }
    
    public void inThongTin(){
        System.out.println(toString());
    }
    public String inThongTin2(){
        return "Mã đồng hồ:"+maDongHo+"\n"+"The loai: "+theLoai;
    }
}
