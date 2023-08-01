
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class Bai1 {
    //Nhập thông tin gồm mã, tên, chiều cao, khu vực sống , cân nặng,
    //loài, thức ăn yêu thích của con chó người yêu cũ và in ra màn hình
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);// tạo đối tượng Scanner
        String ma;
        String ten;
        double chieuCao;
        String khuVucSong;
        double canNang;
        String loai;
        String thucAnYT;
        //Nhập thông tin từ bàn phím
        System.out.println("Mời nhập mã:");
        ma=sc.nextLine();//sc.nextLine(): sử dụng cho nhập chuỗi
        System.out.println("Mời nhập tên:");
        ten=sc.nextLine();
        System.out.println("Mời nhập chiều cao:");
        chieuCao=Double.valueOf(sc.nextLine());
        System.out.println("Mời nhập khu vực sống:");
        khuVucSong=sc.nextLine();
        System.out.println("Mời nhập cân nặng:");
        canNang=Double.valueOf(sc.nextLine());
        System.out.println("Mời nhập loài:");
        loai=sc.nextLine();
        System.out.println("Mời nhập thức ăn yêu thích:");
        thucAnYT=sc.nextLine();
        
        //xuất ra thông tin vừa nhập
        System.out.println("Thông tin bạn vừa nhập là:");
        System.out.printf("Mã: %s",ma);
        System.out.println("Tên:"+ten);
        System.out.println("Chiều cao:"+chieuCao);
        System.out.println("Khu vực sống:"+khuVucSong);
        System.out.println("Cân nặng:"+canNang);
        System.out.println("Loài:"+loai);
        System.out.println("Thức ăn yêu thích:"+thucAnYT);
        
    }
}
