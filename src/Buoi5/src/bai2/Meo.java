
package bai2;


public class Meo extends DongVat{
    private String tiengKeu;
    //constructor

    public Meo() {
    }

    public Meo(String tiengKeu, String ma, String ten, int gioiTinh, int canNang) {
        super(ma, ten, gioiTinh, canNang);
        this.tiengKeu = tiengKeu;
    }
    //getter and setter

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }
    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("Tiếng kêu:"+tiengKeu);
    }
}
