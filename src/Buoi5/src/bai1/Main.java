
package bai1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Nhập thông tin của 1 cây lúa từ bàn phím và in ra màn hình.
        Scanner sc=new Scanner(System.in);
         ///ma - String, ten - String, gioiTinh -boolean, canNang - double, chieuCao - int, loai - String
        System.out.println("Mời nhập mã:");
        String ma=sc.nextLine();
        System.out.println("Mời nhập tên:");
        String ten=sc.nextLine();
        System.out.println("Mời nhập giới tính:");
        boolean gt=Boolean.valueOf(sc.nextLine());
        System.out.println("Mời nhập cân nặng:");
        double canNang=Double.parseDouble(sc.nextLine());//đối với số luôn ép kiểu để tránh trôi lệnh
        System.out.println("Mời nhập chiều cao:");
        int chieuCao=Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập loài:");
        String loai=sc.nextLine();
        System.out.println("Mời nhập sản lượng:");
        int sanLuong=Integer.parseInt(sc.nextLine());
        //khai báo đối tượng và truyền giá trị nhập vào
        CayLua cayLua=new CayLua(sanLuong, ma, ten, gt, canNang, chieuCao, loai);
        //gọi ra hàm in thông tin
        System.out.println("Thông tin bạn vừa nhập là:");
        cayLua.display();
    }
}
