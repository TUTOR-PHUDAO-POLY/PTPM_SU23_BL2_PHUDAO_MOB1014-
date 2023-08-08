
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void menu() {
        System.out.println("==============MENU============");
        System.out.println("1. Nhập 1 danh sách đối tượng");
        System.out.println("2. Xuất danh sách đối tượng");
        System.out.println("3. Tìm kiếm SV theo mã nhập từ bàn phím");
        System.out.println("4. Sắp xếp danh sách các SV theo thuộc tính chuyenNganh");
        System.out.println("5. Kế thừa");
        System.out.println("0. Thoát");
        System.out.println("===============================");
        System.out.println("Mời bạn chọn chức năng:");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //để sử dụng đc các hàm bên SinhVienService => phải khai báo đối tượng
        SinhVienService svs=new SinhVienService();
        ArrayList<SinhVien> list=new ArrayList<>();
        int chon;
        //để menu chạy liên tục => vòng lặp
        while (true) {            
            menu();
            chon=Integer.parseInt(sc.nextLine());//đối vs nhập số thì luôn ép kiểu
            switch (chon) {
                case 1:
                    svs.nhapThongTin(list);
                    break;
                case 2:
                    svs.inThongTin(list);
                    break;
                case 3:
                    System.out.println("Mời nhập mã sinh viên cần tìm:");
                    String ma=sc.nextLine();
                    if(svs.timTheoMa(list, ma).isEmpty()){//nếu list tìm trống
                        System.out.println("Không tìm thấy sinh viên có mã "+ma);
                    }else{
                        svs.inThongTin(svs.timTheoMa(list, ma));//in ra list tìm thấy
                    }
                    break;
                case 4:
                    svs.sapXepTheoNganh(list);
                    svs.inThongTin(list);
                    break;
                case 5:
                    svs.keThua();
                    break;
                case 0:
                    System.out.println("Bạn chọn thoát");
                    System.exit(0);//lệnh thoát
                    break;
                default://nếu k có case nào đc chọn thì rơi vào default
                    throw new AssertionError();
            }
        }
    }
}
