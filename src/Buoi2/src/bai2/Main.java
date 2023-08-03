
package bai2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nhập thông tin sv vs constructor đầy đủ tham số
        SinhVien sv=new SinhVien("SV1", "Nguyen Van A", 15, true);
        sv.inThongTin();
        //nhập thông tin sv với constructor không tham số
        SinhVien sv1=new SinhVien();
        System.out.println("Mời nhập mã:");
        sv1.setMa(sc.nextLine());
        System.out.println("Mời nhập tên:");
        sv1.setTen(sc.nextLine());
        System.out.println("Mời nhập tuổi:");
        sv1.setTuoi(Integer.parseInt(sc.nextLine()));
        System.out.println("Mời nhập giới tính:");
        sv1.setGioiTinh(Boolean.valueOf(sc.nextLine()));
        sv1.inThongTin();
    }
}
