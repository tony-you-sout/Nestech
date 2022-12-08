import java.util.Scanner;

public class BT1 {
    public static void main(String [] args){
        double canhHV,banKinhHinhTron;
        float vnd,usd;
        Scanner scan=new Scanner(System.in);
        System.out.println("nhap canh hinh vuong");
        canhHV=Double.parseDouble(scan.nextLine());
        System.out.printf("dien tich hinh vuong la:%f\n",dienTichHinhVuong(canhHV));
        System.out.println("nhap ban kinh hin tron");
        banKinhHinhTron=Double.parseDouble(scan.nextLine());
        System.out.printf("dien tich hinh tron là:%f\n",dienTichHinhTron(banKinhHinhTron));
        System.out.println("nhap so tien ban muon doi");
        vnd=Float.parseFloat(scan.nextLine());
        System.out.println("nhap giá 1 usd/vnd");
        usd=Float.parseFloat(scan.nextLine());
        System.out.printf("USD:%f",vndToUSD(vnd,usd));
    }
    public static double dienTichHinhVuong(double canh){
        return  Math.pow(canh,2); //Math.pow để tính mũ với tham số thứ nhất là cơ số, tham số thứ 2 là lũy thừa
    }
    public static double dienTichHinhTron(double r){
        return  Math.pow(r,2)*3.14;

    }
    public static float vndToUSD(float vnd,float usd){
        return vnd/usd;

    }
}
