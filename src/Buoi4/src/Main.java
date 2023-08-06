
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("====================MENU==================");
        System.out.println("1.Thêm thực vật");
        System.out.println("2.Hiển thị dsach thực vật");
        System.out.println("3.Tìm kiếm tên thực vật bắt đầu bằng 'c'");
        System.out.println("4.Hiển thị dsach các thực vật ở vị trí chẵn");
        System.out.println("5.Sắp xếp danh sách thực vật tăng dần theo tên");
        System.out.println("8.Hiển thị danh sách thực vật có tên kết thúc là “e”");
        System.out.println("9.Hiển thị danh sách thực vật mà trong tên chứa chữ “a”");
        System.out.println("0.Thoát");
        System.out.println("===========================================");
        System.out.println("Mời bạn chọn chương trình: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        ///để gọi được các hàm bên QLyThucVat => cần phải khởi tạo đối tượng QLyThucVat
        QLyThucVat ql = new QLyThucVat();
        ArrayList<ThucVat> list = new ArrayList<>();
        while (true) {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn chương trình 1");
                    ql.nhapThongTin(list);
                    break;
                case 2:
                    System.out.println("Bạn chọn chương trình 2");
                    ql.inThongTin(list);
                    break;
                case 3:
                    System.out.println("Bạn chọn chương trình 3");
                    //tìm có trả về
//                    if (ql.timTenBatDau(list).isEmpty()) {
//                        System.out.println("Không tìm thấy thực vật nào có tên bắt đầu bằng 'c'");
//                    } else {
//                        ql.inThongTin(ql.timTenBatDau(list));
//                    }
                    
                    //tìm k trả về
                    ql.timTenBatDauC(list);
                    break;
                case 4:
                    System.out.println("Bạn chọn chương trình 4");
                    ql.hienThiChan(list);
                    break;    
                case 5:
                    System.out.println("Bạn chọn chương trình 5");
                    ql.sapXepTen(list);
                    ql.inThongTin(list);
                    break;    
                case 8:
                    System.out.println("Bạn chọn chương trình 8");
                    if (ql.timKiemTenKT(list).isEmpty()) {
                        System.out.println("Không tìm thấy thực vật nào có tên kết thúc bằng 'e'");
                    } else {
                        ql.inThongTin(ql.timKiemTenKT(list));
                    }
                    break;    
                case 9:
                    System.out.println("Bạn chọn chương trình 9");
                    if (ql.timTenChua(list).isEmpty()) {
                        System.out.println("Không tìm thấy thực vật nào có tên chứa 'a'");
                    } else {
                        ql.inThongTin(ql.timTenChua(list));
                    }
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
