
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SinhVienService {
    //chức năng 1: 1,5đ
    public void nhapThongTin(ArrayList<SinhVien> list){
        ///để nhập từ bàn phím
        Scanner sc=new Scanner(System.in);
        //để nhập danh sách và khi nhập có hỏi => sd vòng lặp
        while (true) {            
            //nhập thông tin từ bàn phím
            System.out.println("Mời nhập mã SV:");
            String ma=sc.nextLine();
            System.out.println("Mời nhập họ tên SV:");
            String hoTen=sc.nextLine();
            System.out.println("Mời nhập chuyên ngành:");
            String chuyenNganh=sc.nextLine();
            //khai báo ra đối tượng và gán các gtri nhập vào cho đối tượng
            SinhVien sv=new SinhVien(ma, hoTen, chuyenNganh);
            ///add đối tượng vào list
            list.add(sv);
            //hỏi xem có tiếp tục nhập hay không
            System.out.println("Bạn có muốn nhập tiếp hay không (Y/N):");
            String chon=sc.nextLine();
            //nếu lựa chọn mà là 'N' hoặc 'n' thì dừng việc nhập lại
            if(chon.equalsIgnoreCase("N")){//so sánh chuỗi k phân biệt viết hoa hay viết thường
                break;//dừng vc nhập lại
            }
        }
    }
    //chức năng số 2:1đ
    public void inThongTin(ArrayList<SinhVien> list){
        for (SinhVien sv : list) {
            sv.inThongTin();//in ra thông tin của đối tượng
            System.out.println("================================");//ngăn cách giữa các đối tượng
        }
    }
    //chức năng số 3:1đ
    //có trả về: trả về ArrayList:1đ
    public ArrayList<SinhVien> timTheoMa(ArrayList<SinhVien> list,String ma){
        //khai báo mảng chứa sinh viên được tìm thấy theo mã
        ArrayList<SinhVien> listTim=new ArrayList<>();
        for (SinhVien sv : list) {
            if(sv.getMaSV().equalsIgnoreCase(ma)){//nếu mã sinh viên của SV trùng với mã nhập vào
                listTim.add(sv);//lưu sinh viên vào list tìm
            }
        }
        return listTim;//nhớ trả về list tìm thấy      
    }
    //chức năng 4: 1đ
    public void sapXepTheoNganh(ArrayList<SinhVien> list){
        //c1: 
        list.sort((o1, o2) -> {
            return o1.getChuyenNganh().compareTo(o2.getChuyenNganh()); 
        });
        //c2: sd collections
        Collections.sort(list, (o1, o2) -> o1.getChuyenNganh().compareTo(o2.getChuyenNganh()));
    }
    //chức năng 5:0.5đ
    public void keThua(){
        //khai báo đối tượng sd constructor có tham số
        SinhVienPoly sv=new SinhVienPoly("ptpm", "SV1", "Nguyễn Văn A", "CNTT");
        sv.inThongTin();
    }
    
}
