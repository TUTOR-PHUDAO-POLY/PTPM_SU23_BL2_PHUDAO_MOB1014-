package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("===============MENU===============");
        System.out.println("1.Thêm động vật");
        System.out.println("2.Hiển thị danh sách");
        System.out.println("3.Tìm theo tên");
        System.out.println("4.Liệt kê danh sách động vật có khoảng cân nặng nhập từ bàn phím");
        System.out.println("5.Kế thừa");
        System.out.println("0.Thoát");
        System.out.println("===================================");
        System.out.println("Mời bạn chọn chức năng:");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //để sử dụng đc các hàm của QuanLyDongVatService=> khai báo đối tượng
        QuanLyDongVatService ql = new QuanLyDongVatService();
        ArrayList<DongVat> list = new ArrayList<>();
        while (true) {
            menu();
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ql.nhapThongTin(list);
                    break;
                case 2:
                    ql.inThongTin(list);
                    break;
                case 3:
                    System.out.println("Mời nhập tên cần tìm:");
                    String ten = sc.nextLine();
                    if (ql.timTheoTen(list, ten).isEmpty()) {//nếu listTim trống
                        System.out.println("Không tìm thấy động vật nào có tên " + ten);
                    } else {
                        System.out.println("Danh sách động vật có tên " + ten);
                        ql.inThongTin(ql.timTheoTen(list, ten));
                    }
                    break;
                case 4:
                    System.out.println("Mời nhập cân nặng min:");
                    int min = Integer.parseInt(sc.nextLine());
                    System.out.println("Mời nhập cân nặng max:");
                    int max = Integer.parseInt(sc.nextLine());
                    if (ql.timTheoCanNang(list, min, max).isEmpty()) {//nếu listTim trống
                        System.out.println("Không tìm thấy động vật nào có cân nặng trong khoảng  " + min + "-" + max);
                    } else {
                        System.out.println("Danh sách động vật có cân nặng trong khoảng " + min + "-" + max);
                        ql.inThongTin(ql.timTheoCanNang(list, min, max));
                    }
                    break;
                case 5:
                    ql.keThua();
                    break;
                case 0:
                    System.exit(0);//lệnh thoát
                    break;
                default://khi k có case nào đc chọn thì nhảy vào default
                    System.out.println("Chức năng bạn chọn k có. Vui lòng chọn lại");
                    break;
            }
        }
    }
}
