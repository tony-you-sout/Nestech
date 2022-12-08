//import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        printHelloWorld();
//
//        System.out.println(sum(10,20));
//        System.out.println(sum(10,20,30));
//        System.out.println("diem tb:"+tinhDiemTB());

        Scanner scan=new Scanner(System.in);
//        System.out.println("nhap vao ten cua ban");
//        String name= scan.nextLine();
//        System.out.println("hell0 "+name);
        System.out.println("Nhap cd");
    double cd=Double.parseDouble(scan.nextLine());
        System.out.println("nhap cr");
    double cr=Double.parseDouble(scan.nextLine());
   double dienTich= tinhDienTichHinhChuNhat(cd,cr);
        System.out.println("dien tich la "+dienTich);


    }
    public static double tinhDienTichHinhChuNhat(double cd,double cr){
        return cd*cr;
    }
    public static void printHelloWorld(){
        System.out.println("hello world");

    }

    public static int sum(int a,int b){
        return a+b;

    }
//   viết hàm tính tổng 3 so

    public static int sum(int a,int b,int c){
        return  a+b+c;

    }
//    viết chương trình tính điểm trung bình 2 môn toán, lý hóa
    public static double tinhDiemTB(){
        Scanner scan =new Scanner(System.in);
        System.out.println("nhap diem toan");
        double toan=Double.parseDouble(scan.nextLine());
        System.out.println("nhap diem ly");
        double ly=Double.parseDouble(scan.nextLine());
        System.out.println("nhap diem hoa");
        double hoa=Double.parseDouble(scan.nextLine());
        return (toan+ly+hoa)/3;

    }
//    viết chương trình tính diện tích hình chữ nhật

}