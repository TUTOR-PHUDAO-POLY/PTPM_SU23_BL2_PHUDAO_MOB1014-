
import java.util.Scanner;


public class Bai1 {
    //Tạo menu gồm các chức năng (menu lặp lại cho đến khi chọn " 0 - Thoát"):

//1.Nhập thông tin tên, tuổi, giới tính, quê quán, ngành học của bản thân và in ra màn hình
//
//2.Nhập số nguyên a, kiểm tra xem đó là số nguyên âm hay số dương
//
//0.Thoát
    public static void menu(){
        System.out.println("====================MENU==================");
        System.out.println("1.Nhập thông tin và in ra màn hình");
        System.out.println("2.Nhập số nguyên a, kiểm tra xem là số âm hay dương");
        System.out.println("0.Thoát");
        System.out.println("===========================================");
        System.out.println("Mời bạn chọn chương trình: ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);///khai báo đối tượng scanner để nhập từ bàn phím
        int chon;
        while(true){
            menu();
            chon=Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Bạn chọn chương trình 1");
                    String ten,gioiTinh,queQuan,nganhHoc;
                    int tuoi;
                    System.out.println("Mời nhập tên:");
                    ten=sc.nextLine();                   
                    System.out.println("Mời nhập tuổi:");
                    tuoi=Integer.parseInt(sc.nextLine());
                    System.out.println("Mời nhập giới tính:");
                    gioiTinh=sc.nextLine();                   
                    System.out.println("Mời nhập quê quán:");
                    queQuan=sc.nextLine();
                    System.out.println("Mời nhập ngành học:");
                    nganhHoc=sc.nextLine();
                    
                    System.out.println("\nThông tin bạn vừa nhập là:");
                    System.out.println("Tên: "+ten);
                    System.out.println("Tuổi: "+tuoi);
                    System.out.println("giới tính: "+gioiTinh);
                    System.out.println("Quê quán: "+queQuan);
                    System.out.println("Ngành học: "+nganhHoc);
                    break;
                case 2:
                    System.out.println("Bạn chọn chương trình 2");
                    int a;
                    System.out.println("Mời nhập số nguyên a:");
                    a=Integer.parseInt(sc.nextLine());
                    if(a<0){
                        System.out.printf("%d là số âm\n",a);
                    }else{
                        System.out.printf("%d là số dương\n",a);
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
