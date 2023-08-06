
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QLyThucVat {

    public void nhapThongTin(ArrayList<ThucVat> list) {
        Scanner sc = new Scanner(System.in);//khai báo đối tượng scanner
        ///ma - String , ten - String , loaiCay - String, khuVucSong- String, chieuCao - int
        //nhập thông tin
        while (true) {
            System.out.println("Mời nhập mã:");
            String ma = sc.nextLine();
            System.out.println("Mời nhập tên:");
            String ten = sc.nextLine();
            System.out.println("Mời nhập loại cây:");
            String loai = sc.nextLine();
            System.out.println("Mời nhập khu vực sống:");
            String khuVuc = sc.nextLine();
            System.out.println("Mời nhập chiều cao:");
            int chieuCao = Integer.parseInt(sc.nextLine());//đối với kiểu số thì luôn phải ép kiểu tránh trôi lệnh
            //sử dụng lớp bao: int-Integer,double-Double,float-Float
            //và sử dụng 2 phương thức : <LớpBao>.parse... hoặc <LớpBao>.valueOf
            //VD: double canNang=Double.parseDouble(sc.nextLine());
            //VD: float gia=Float.parseFloat(sc.nextLine());

            //khai báo đôí tượng vào truyền giá trị vừa nhập cho đối tượng
            ThucVat tv = new ThucVat(ma, ten, loai, khuVuc, chieuCao);
            //add đối tượng vào list
            list.add(tv);
            //hỏi có nhập tiếp hay k
            System.out.println("Bạn có muốn nhập tiếp k?(Y/N)");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("N")) {//so sánh chuỗi không phân biệt hoa thươngf
                break;
            }
        }//ngoặc của while true
    }

    public void inThongTin(ArrayList<ThucVat> list) {
        for (ThucVat tv : list) {
            tv.inThongTin();
            System.out.println("=================================");
        }
    }

    //hàm trả về 1 arrayList: sẽ là trả về list các thực vật đc tìm thấy với tên bắt đầu bằng 'c'
    public ArrayList<ThucVat> timTenBatDau(ArrayList<ThucVat> list) {//list truyền vào: chính là list mình nhập (getALL)
        //khởi tạo 1 list để lưu các thực vật có tên bắt đầu bằng 'c'
        ArrayList<ThucVat> listTim = new ArrayList<>();
        for (ThucVat tv : list) {//duyệt mảng tìm các thực vật có tên bắt đầu bằng 'c'
            if (tv.getTen().startsWith("c")) {//startsWith: bắt đầu bằng.....
                listTim.add(tv);//add thực vật đc tìm thấy vào danh sách tìm
            }
        }
        return listTim;//nhớ return về cái list tìm thấy
    }

    //hàm tìm kiếm k trả về
    public void timTenBatDauC(ArrayList<ThucVat> list) {
        //khởi tạo 1 list để lưu các thực vật có tên bắt đầu bằng 'c'
        ArrayList<ThucVat> listTim = new ArrayList<>();
        for (ThucVat tv : list) {//duyệt mảng tìm các thực vật có tên bắt đầu bằng 'c'
            if (tv.getTen().startsWith("c")) {//startsWith: bắt đầu bằng.....
                listTim.add(tv);//add thực vật đc tìm thấy vào danh sách tìm
            }
        }
        if (listTim.isEmpty()) {
            System.out.println("Không tìm thấy thực vật có tên bắt đầu bằng c");
        } else {
            for (ThucVat tv : listTim) {
                tv.inThongTin();
                System.out.println("=======================");
            }
        }
    }

    public void hienThiChan(ArrayList<ThucVat> list) {
        System.out.println("Danh sách vị trí chẵn");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {//vị trí chẵn
                System.out.println("Vị trí: " + i);
                list.get(i).inThongTin();
                System.out.println("=================================");
            }
        }
    }
    ///case 8

    public ArrayList<ThucVat> timKiemTenKT(ArrayList<ThucVat> list) {
        //khởi tạo 1 list để lưu các thực vật có tên kết thúc bằng e
        ArrayList<ThucVat> listTim = new ArrayList<>();
        for (ThucVat tv : list) {//duyệt mảng tìm các thực vật có tên kết thúc bằng e
            if (tv.getTen().endsWith("e")) {//endsWith: kết thúc bằng.....
                listTim.add(tv);//add thực vật đc tìm thấy vào danh sách tìm
            }
        }

        return listTim;//nhớ return về cái list tìm thấy
    }

    ///case 9
    public ArrayList<ThucVat> timTenChua(ArrayList<ThucVat> list) {
        //khởi tạo 1 list để lưu các thực vật có tên chứa 'a'
        ArrayList<ThucVat> listTim = new ArrayList<>();
        for (ThucVat tv : list) {//duyệt mảng tìm các thực vật có tên chứa 'a'
            if (tv.getTen().contains("a")) {//contains: chứa....
                listTim.add(tv);//add thực vật đc tìm thấy vào danh sách tìm
            }
        }

        return listTim;//nhớ return về cái list tìm thấy
    }
    //case 5
    public void sapXepTen(ArrayList<ThucVat> list){
        ///c1:
        list.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen()); 
        });
        ///c2:
        Collections.sort(list,(o1,o2)->o1.getTen().compareTo(o2.getTen()) );
    }
}
