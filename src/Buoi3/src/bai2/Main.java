
package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     public static void menu(){
        System.out.println("====================MENU==================");
        System.out.println("1.Nhập thông tin ");
        System.out.println("2.In thông tin");
        System.out.println("3.Thoát");
        System.out.println("===========================================");
        System.out.println("Mời bạn chọn chương trình: ");
    }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int chon;
        ///để gọi được các hàm bên QLyDongVat => cần phải khởi tạo đối tượng QLyDongVat
        QuanLyDongVatService ql=new QuanLyDongVatService();
        ArrayList<DongVat> list=new ArrayList<>();
        while (true) {//vòng lặp true-luôn đúng        
            menu();//lặp lại liên tục
            chon=Integer.parseInt(sc.nextLine());//luôn ép kiểu với kiểu số để tránh trôi lệnh
             switch (chon) {//để chọn được chức năng=>switch...case
                case 1:
                    System.out.println("Bạn chọn chương trình 1");
                    ql.nhapThongTin(list);
                    break;//k đc quên break ở tất cả các case
                case 2:
                     System.out.println("Bạn chọn chương trình 2");
                    ql.inThongTin(list);
                    break;
                case 3:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0);//lệnh thoát
                    break;
                default://khi k có case nào được chọn thì sẽ nhảy vào default
                    System.out.println("Chương trình bạn chọn k có.Vui lòng chọn lại");
                    break;
            }
        }   
    }
}
