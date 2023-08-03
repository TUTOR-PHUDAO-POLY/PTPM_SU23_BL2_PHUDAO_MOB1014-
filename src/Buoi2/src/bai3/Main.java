
package bai3;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void menu(){
        System.out.println("====================MENU==================");
        System.out.println("1.Nhập thông tin ");
        System.out.println("2.In thông tin");
        System.out.println("0.Thoát");
        System.out.println("===========================================");
        System.out.println("Mời bạn chọn chương trình: ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chon;
        ///để gọi được các hàm bên DongHoService => cần phải khởi tạo đối tượng DongHoService
        DongHoService dhs=new DongHoService();
        ArrayList<DongHo> list=new ArrayList<>();
        while (true) {            
            menu();
            chon=Integer.parseInt(sc.nextLine());
             switch (chon) {
                case 1:
                    System.out.println("Bạn chọn chương trình 1");
                    dhs.nhapThongTin(list);
                    break;
                case 2:
                     System.out.println("Bạn chọn chương trình 2");
                     dhs.inThongTin(list);
                    break;
                case 0:
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
