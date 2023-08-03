
package bai3;

import java.util.ArrayList;
import java.util.Scanner;


public class DongHoService {
    public void nhapThongTin(ArrayList<DongHo> list){
        //Nhập thông tin của điện thoại
        Scanner sc=new Scanner(System.in);
       //maDongHo - int, theLoai - String, mauSac- String, kichThuoc - int, chatLieu -String, gia-int
        System.out.println("Mời nhập mã:");
        int ma=Integer.valueOf(sc.nextLine());
        System.out.println("Mời nhập thể loại:");
        String theLoai=sc.nextLine();
        System.out.println("Mời nhập màu sắc:");
        String mauSac=sc.nextLine();
        System.out.println("Mời nhập kích thước:");
        int kichThuoc=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập chất liệu:");
        String chatLieu=sc.nextLine();
        System.out.println("Mời nhập giá:");
        int gia=Integer.parseInt(sc.nextLine());
        //Khởi tạo ra đối tượng mới và lưu những thông tin vừa nhập cho đối tượng
        DongHo dh=new DongHo(ma, theLoai, mauSac, kichThuoc, chatLieu, gia);
        //thêm đối tượng vào mảng
        list.add(dh);
    }
    public void inThongTin(ArrayList<DongHo> listDH){
        //Cách 1: forEach
        for (DongHo dh : listDH) {
            dh.inThongTin();
        }
        //Cách 2: fori
        for (int i = 0; i < listDH.size(); i++) {
            DongHo dh1=listDH.get(i);//lấy ra đối tượng theo vị trí
            dh1.inThongTin();
        }
    }
}
