
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Phanh
 */
public class Bai2 {
    public static void main(String[] args) {
        //Nhập 2 số dương a,b tính tổng, hiệu tích thương và in các kết quả ra màn hình.
        Scanner sc=new Scanner(System.in);
        System.out.println("Moi ban nhap so duong a:");
        int a = Integer.valueOf(sc.nextLine());
        System.out.println("Moi ban nhap so duong b:");
        int b = Integer.valueOf(sc.nextLine());
        System.out.println("Tổng 2 số:"+(a+b));
        System.out.println("Hiệu 2 số:"+(a-b));
        System.out.println("Tích 2 số:"+(a*b));
        System.out.println("Thương 2 số:"+((float)a/b));
    }
}
