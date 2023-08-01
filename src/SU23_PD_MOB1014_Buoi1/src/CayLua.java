/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class CayLua {
    // ma – String, ten – String, loai – String, chieuCao – double, khuVucSong – String
    private String ma;
    private String ten;
    private String loai;
    private double chieuCao;
    private String khuVucSong;
    
    //constructor

    public CayLua() {
    }

    public CayLua(String ma, String ten, String loai, double chieuCao, String khuVucSong) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.chieuCao = chieuCao;
        this.khuVucSong = khuVucSong;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }
    //inThongTin(): void
    public void inThongTin(){
        System.out.println("Thông tin cây lúa:");
        System.out.println("Mã: "+ma);
        System.out.println("Tên: "+ten);
        System.out.println("Loại: "+loai);
        System.out.println("Chiều cao: "+chieuCao);
        System.out.println("Khu vực sống: "+khuVucSong);
    }
    
}
