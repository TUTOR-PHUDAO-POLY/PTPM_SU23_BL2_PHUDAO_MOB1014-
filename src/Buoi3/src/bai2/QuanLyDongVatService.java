
package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDongVatService {
    public void nhapThongTin(ArrayList<DongVat> list){
        //khai báo Scanner 
        Scanner sc=new Scanner(System.in);
        //Sau khi thêm hỏi có muốn thêm tiếp hay ko? Y/N
         //ma- String , ten-String , gioiTinh-int (1-Đức, 2- Cái), canNang- int
        //muốn nhập được nhiều lần,liên tục=> sử dụng vòng lặp
        while(true){
            System.out.println("Mời nhập mã:");
            String ma = sc.nextLine();
            System.out.println("Mời nhập tên:");
            String ten = sc.nextLine();
            System.out.println("Mời nhập giới tính (1-Đực,2-Cái):");
            int gioiTinh = Integer.parseInt(sc.nextLine());//luôn ép kiểu khi nhập số để tránh trôi lệnh
            System.out.println("Mời nhập cân nặng:");
            int canNang = Integer.parseInt(sc.nextLine());
            //tạo ra đối tượng và truyền các dữ liệu nhập vào
            DongVat dv = new DongVat(ma, ten, gioiTinh, canNang);
            //add đối tượng vào list
            list.add(dv);
            //Sau khi thêm hỏi có muốn thêm tiếp hay ko? Y/N
            System.out.println("Bạn có muốn nhập tiếp hay không? (Y/N):");
            String luaChon=sc.nextLine();
            if(luaChon.equalsIgnoreCase("N")){//nếu lựa chọn nhập vào trùng với N
                //equalsIgnoreCase: so sánh chuỗi bằng k phân biệt hoa thường
                break;
            }
        }
    }
    public void inThongTin(ArrayList<DongVat> list){
        for (DongVat dongVat : list) {
            dongVat.inThongTin();
        }
    }
}
