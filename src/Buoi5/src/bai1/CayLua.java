
package bai1;


public class CayLua extends ThucVat{
    //sanLuongMoiNam - int
    private int sanLuongMoiNam;
    //constructor

    public CayLua() {
    }

    public CayLua(int sanLuongMoiNam, String ma, String ten, boolean gioiTinh, double canNang, int chieuCao, String loai) {
        super(ma, ten, gioiTinh, canNang, chieuCao, loai);
        this.sanLuongMoiNam = sanLuongMoiNam;
    }
    //getter and setter
    public int getSanLuongMoiNam() {
        return sanLuongMoiNam;
    }

    public void setSanLuongMoiNam(int sanLuongMoiNam) {
        this.sanLuongMoiNam = sanLuongMoiNam;
    }
    //void display
    @Override
    public void display(){
        super.display();//gọi hàm display của lớp cha
        System.out.println("Sản lượng Mỗi năm: "+sanLuongMoiNam);
    }
}
