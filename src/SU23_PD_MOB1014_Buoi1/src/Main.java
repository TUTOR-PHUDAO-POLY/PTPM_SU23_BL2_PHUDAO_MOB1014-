
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // Nhập thông tin của 1 cây lúa từ bàn phím và in ra màn hình thông tin của cây lúa  và sử dụng contructor full tham số
       CayLua cayLua=new CayLua("Lua1", "Lua chin", "Ngon", 45, "HN");//sử dụng constructor full tham số
       //in ra mh
       cayLua.inThongTin();
       //Nhập thông tin của 1 cây lúa từ bàn phím và in ra màn hình và sử dụng contructor không tham số
       CayLua cay2=new CayLua();
        System.out.println("Mời nhập Mã: ");
        cay2.setMa(sc.nextLine());
        System.out.println("Mời nhập Tên: ");
        cay2.setTen(sc.nextLine());
        System.out.println("Mời nhập Loại: ");
        cay2.setLoai(sc.nextLine());
        System.out.println("Mời nhập chiều cao: ");
        cay2.setChieuCao(Double.valueOf(sc.nextLine()));
        System.out.println("Mời nhập khu vực sống: ");
        cay2.setKhuVucSong(sc.nextLine());
        cay2.inThongTin();
    }
}
