//import java.util.Scanner;

import java.util.Scanner;

public class BTBuoi1 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        double canhHV;
        double dienTichHV;


        System.out.println("nhap vao canh hinh vuong");
        canhHV=Double.parseDouble(scan.nextLine());
        dienTichHV=tinhDienTichHinhVuong(canhHV);
        System.out.printf("dien tich hv la:%f\n",dienTichHV);
        System.out.println("nhap vao ban kinh hinh tron");
        double banKinhHinhTron=Double.parseDouble(scan.nextLine());

        double dienTichHinhTron=tinhDienTichHinhTron(banKinhHinhTron);
        System.out.printf("dien tich hinh tron %f\n",dienTichHinhTron);
        System.out.println("nhap vao so tien ban muon chuyen");
        double vnd=Double.parseDouble(scan.nextLine());
        System.out.println("nhap vao gia 1 usd/vnd");
        double usd=Double.parseDouble(scan.nextLine());
        System.out.printf("usd=%f",vndToUsd(vnd,usd));
    }

    public static double tinhDienTichHinhVuong(double canh){
        return  Math.pow(canh,2);

    }
    public static double tinhDienTichHinhTron(double canh){
        return  Math.pow(canh,2)*Math.PI;

    }
    public static  double vndToUsd(double vnd,double usd){

        return  vnd/usd;

    }
}
