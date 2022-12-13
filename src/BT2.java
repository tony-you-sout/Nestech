import java.util.Scanner;

public class BT2 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        double math,physic,chemist;
        System.out.println("nhap diem toan");
        math=Double.parseDouble(scan.nextLine());
        System.out.println("nhap diem ly");
        physic=Double.parseDouble(scan.nextLine());
        System.out.println("nhap diem hoa");
        chemist=Double.parseDouble(scan.nextLine());
        double result=calGPA(math,physic,chemist);
        System.out.println(Math.round(result));
        classify(result);
    }
    public static double calGPA(double math,double physic,double chemist){
        return (math+physic+chemist)/3;

    }
    public static void classify(double GPA){
        if(GPA>=9)
            System.out.println("xuat xac");
        else if(GPA>=8 && GPA<9)
            System.out.println("Gioi");
        else if(GPA>7&&GPA<8)
            System.out.println("kha");
        else if(GPA>=5&&GPA<6.5)
            System.out.println("trung binh");
        else
            System.out.println("yeu");

    }
}
