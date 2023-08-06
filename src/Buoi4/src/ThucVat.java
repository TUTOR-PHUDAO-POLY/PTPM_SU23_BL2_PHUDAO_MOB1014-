
public class ThucVat {
    ///ma - String , ten - String , loaiCay - String, khuVucSong- String, chieuCao - int
    private String ma;
    private String ten;
    private String loaiCay;
    private String khuVucSong;
    private int chieuCao;
    //constructor

    public ThucVat() {
    }

    public ThucVat(String ma, String ten, String loaiCay, String khuVucSong, int chieuCao) {
        this.ma = ma;
        this.ten = ten;
        this.loaiCay = loaiCay;
        this.khuVucSong = khuVucSong;
        this.chieuCao = chieuCao;
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

    public String getLoaiCay() {
        return loaiCay;
    }

    public void setLoaiCay(String loaiCay) {
        this.loaiCay = loaiCay;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }
    //hàm inThongTin: void
    public void inThongTin(){
         ///ma - String , ten - String , loaiCay - String, khuVucSong- String, chieuCao - int
         System.out.println("Mã cây:"+ma);
         System.out.println("Tên cây:"+ten);
         System.out.println("Loại cây:"+loaiCay);
         System.out.println("Khu vực sống của cây:"+khuVucSong);
         System.out.println("Chiều cao cây:"+chieuCao);
    }
}
