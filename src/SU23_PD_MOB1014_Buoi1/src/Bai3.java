
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Phanh
 */
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//tạo ra đối tượng scanner
        int chon;//chọn chức năng
        while (true) {//chạy menu liên tục
            menu();
            chon = Integer.parseInt(sc.nextLine());//nhập từ bàn phím chức năng muốn sd
            switch (chon) {
                case 1:
                    System.out.println("Chào mừng bạn đã đến với chức năng 1");
                    System.out.println("Moi ban nhap so a:");
                    int a = Integer.valueOf(sc.nextLine());
                    System.out.println("Moi ban nhap so b:");
                    int b = Integer.valueOf(sc.nextLine());
                    System.out.println("Tổng 2 số:" + (a + b));
                    System.out.println("Hiệu 2 số:" + (a - b));
                    System.out.println("Tích 2 số:" + (a * b));
                    System.out.println("Thương 2 số:" + ((float) a / b));
                    break;
                case 2:
                    System.out.println("Chào mừng bạn đến với chức năng 2");
                    //gồm tên, tuổi, địa chỉ, quê quán, năm sinh, trường học, chuyên ngành
                    String ten,diaChi,queQuan,truongHoc,chuyenNganh;
                    int tuoi,namSinh;
                    //nhập thông tin
                    System.out.println("Mời nhập tên:");
                    ten=sc.nextLine();
                    System.out.println("Mời nhập tuổi:");
                    tuoi=Integer.parseInt(sc.nextLine());//nên sử dụng ép kiểu để trống trôi lệnh
                    System.out.println("Mời nhập địa chỉ:");
                    diaChi=sc.nextLine();
                    System.out.println("Mời nhập quê quán:");
                    queQuan=sc.nextLine();
                    System.out.println("Mời nhập năm sinh:");
                    namSinh=Integer.parseInt(sc.nextLine());
                    System.out.println("Mời nhập trường học:");
                    truongHoc=sc.nextLine();                    
                    System.out.println("Mời nhập chuyên ngành:");
                    chuyenNganh=sc.nextLine();
                    //in thông tin vừa nhập ra màn hình
                    System.out.println("Thông tin bản thân : ");
                    System.out.println("Tên:"+ten);
                    System.out.println("Tuổi:"+tuoi);
                    System.out.println("Địa chỉ:"+diaChi);
                    System.out.println("Quê quán:"+queQuan);
                    System.out.println("Năm sinh:"+namSinh);
                    System.out.println("Trường học:"+truongHoc);
                    System.out.println("Chuyên ngành:"+chuyenNganh);
                    break;
                case 3:
                    System.out.println("Chào mừng bạn đến với chức năng 3");
                    System.out.println("Mời nhập số nguyên n");
                    int n=Integer.parseInt(sc.nextLine());
                    int tich=1;
                    for (int i = 1; i < n; i++) {//duyệt dãy số từ 1 đến n
                        if(i%2!=0){//kiểm tra lần lượt xem trong dãy có số nào không chia hết cho 2 => số lẻ
                            tich *=i;//nếu như là số lẻ thì nhân với tích
                        }
                    }
                    System.out.println("Tích các số lẻ từ 1-"+n+" là: "+tich);
                    break;
                case 0:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0);//lệnh thoát
                    break;
                default:
                    System.out.println("Chức năng bạn chọn không có.Vui lòng chọn lại");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("===================MENU=====================");
        System.out.println("1.Nhập 2 số nguyên từ bàn phím và tính tổng, hiệu tích thương");
        System.out.println("2.Nhập vào thông tin cá nhân và in ra màn hình");
        System.out.println("3.Nhập vào số nguyên n. Tính tích các số lẻ từ 1-n");
        System.out.println("0.Thoát");
        System.out.println("==============================================");
        System.out.println("Mời chọn chức năng:");
    }
}
