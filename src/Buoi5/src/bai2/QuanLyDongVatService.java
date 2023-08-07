
package bai2;

import java.util.ArrayList;
import java.util.Scanner;


public class QuanLyDongVatService {
    public void nhapThongTin(ArrayList<DongVat> list){
        Scanner sc=new Scanner(System.in);
        while (true) {  
            //nhập từ bàn phím
            System.out.println("Mời nhập mã:");
            String ma=sc.nextLine();
            System.out.println("Mời nhập tên:");
            String ten=sc.nextLine();
            System.out.println("Mời nhập giới tính (1-đực,2-cái):");
            int gioiTinh=Integer.parseInt(sc.nextLine());//đối với kiểu số thì luôn phải ép kiểu để tránh trôi lệnh
            System.out.println("Mời nhập cân nặng:");
            int canNang=Integer.parseInt(sc.nextLine());
            ///khai báo đối tượng và gán giá trị nhập vào cho đối tượng
            DongVat dv=new DongVat(ma, ten, gioiTinh, canNang);
            list.add(dv);
            System.out.println("Bạn có muốn nhập tiếp hay không(Y/N):");
            String chon=sc.nextLine();
            if(chon.equalsIgnoreCase("N")){//so sánh chuỗi k phân biệt hoa thươngf
                break;
            }
        }
    }
    public void inThongTin(ArrayList<DongVat> list){
        for (DongVat dv : list) {
            dv.inThongTin();
            System.out.println("===========================================");
        }
    }
    ///tìm theo tên có trả về
    ///////HÀM TRẢ VỀ
    public ArrayList<DongVat> timTheoTen(ArrayList<DongVat> list,String ten){
        //khai báo 1 list để chứa những động vật có tên được tìm thấy
        ArrayList<DongVat> listTim=new ArrayList<>();
        for (DongVat dv : list) {
            if(dv.getTen().equalsIgnoreCase(ten)){//tìm kiếm k phân biệt hoa thươnggf
                listTim.add(dv);//nếu tìm thấy thì add vào list Tìm
            }             
        }
        return listTim;//nhớ phải trả về list tìm
    }
    //tìm theo khoảng cân nặng
    public ArrayList<DongVat> timTheoCanNang(ArrayList<DongVat> list,int min,int max){
         //khai báo 1 list để chứa những động vật có cân nặng nằm trong khoảng min-max
        ArrayList<DongVat> listTim=new ArrayList<>();
        for (DongVat dv : list) {
            if(min<=dv.getCanNang() && dv.getCanNang()<= max){
                listTim.add(dv);
            }
        }
        return listTim;
    }
    public void keThua(){
        Meo meo=new Meo("meo meo", "dv1", "meo", 1, 4);
        meo.inThongTin();
    }
}
