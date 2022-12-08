import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a;
        System.out.println("nhap 1 so");
        a=Integer.parseInt(scan.nextLine());
//        System.out.println("nhap b");
//        b=Integer.parseInt(scan.nextLine());
//        int max=soSanh(a,b);
//        System.out.printf("Max=%d",max);
//        checkChanLe(a);
//            String result=checkChanLeRutGon(a);
//        System.out.println(result);
//        checkThu(a);

        boolean result= checkNam(a);
        System.out.println(result);
    }

    public static int soSanh(int number1,int number2){
        int max=number1;
        if(number1>number2){
            max=number1;

        }
        else{
            max=number2;
        }
        return max;
    }
//     viết chương trình cho người dùng nhập vào 1 số kiểm tra số đó có phải là số chẵn
    public static void checkChanLe(int number){
        if(number==0){
            System.out.println("ko chan ko le");
        }
        else if(number %2==0){
            System.out.println("so chan");
        }
        else{
            System.out.println("so le");
        }
    }
    public static String checkChanLeRutGon(int number){

        String result= number%2==0?"so chan":"so le";
        return result;
    }

//    viết chương trình cho người dùng nhập vào 1 số nguyeen từ 0-6 in ra thứ trong tuần tương ứng
// nếu nhập 0-> cn, nhập giá trị >6 thì báo sai
        public static void checkThu(int number){
            switch (number){
                case 0:
                    System.out.println("chu nhat");
                    break;
                case 2:
                    System.out.println("thu hai");
                    break;
                case 3:
                    System.out.println("thu ba");
                    break;
                case 4:
                    System.out.println("thu tu");
                    break;
                case 5:
                    System.out.println("thu nam");
                    break;
                case 6:
                    System.out.println("thu sau");
                    break;
                case 7:
                    System.out.println("thu bay");
                    break;
                default:
                    System.out.println("nhap sai");
            }
        }
/// viết chương trình kiểm tra 1 năm có phải năm nhuận ko
    public static boolean checkNam(int year){

        boolean test1=year%4==0?true:false;
        boolean test2=year%100!=0?true:false;
        boolean test3=year%100==0?true:false;
        boolean test4=year%400==0?true:false;
        if(test1&&(test2||(test3&&test4)))
            return  true;
        return false;
    }



}