
package bai1;

import java.util.ArrayList;
import java.util.Scanner;


public class QLyLopHoc {
    public void nhapThongTin(ArrayList<LopHoc> list){
        Scanner sc=new Scanner(System.in);//khai báo ra đối tượng scanner
        //maLop - String , tenLop - String , dienTich - int, diaDiemLopHoc - String
        System.out.println("Mời nhập mã:");
        String ma=sc.nextLine();
        System.out.println("Mời nhập tên:");
        String ten=sc.nextLine();
        System.out.println("Mời nhập diện tích:");
        int dienTich=Integer.parseInt(sc.nextLine());//nên sử dụng ép kiểu để tránh trôi lệnh
        //lớp bao: int-Integer, double-Double, float-Float
        //parse... hoặc valueOf 
        System.out.println("Mời nhập địa điểm:");
        String diaDiem=sc.nextLine();
        //tạo ra đối tượng lp học và truyền các thông tin vừa nhập vào
        LopHoc lop=new LopHoc(ma, ten, dienTich, diaDiem);
        //add lớp học vào list
        list.add(lop);
    }
    public void inThongTin(ArrayList<LopHoc> list){
        for (LopHoc lopHoc : list) {//forEach
            lopHoc.inThongTin();
        }
       
    }
}
