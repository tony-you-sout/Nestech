import java.util.Scanner;

public class SuaBT {
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
//        Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
//        Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.
//        System.out.println("nhập vào số nguyên n");
//        int n=Integer.parseInt(scan.nextLine());
//        bai1(n);

//        Viết chương trình cho phép nhập vào một số nguyên dương n, tính tổng tất cả số chẵn trong khoảng từ 0 - n.
//        int numberOfElement;
//        System.out.println("nhập vào số phần tử mảng");
//        numberOfElement=Integer.parseInt(scan.nextLine());
//        int [] arr=new int[numberOfElement];
//        for(int i=0;i<arr.length;i++){
//            System.out.printf("nhập vào phần tử thứ %d\n",i);
//            arr[i]=Integer.parseInt(scan.nextLine());
//
//        }
//       int resultBai2= bai2(arr);
//        System.out.printf("tong=%d",resultBai2);

//        Viết chương trình để nhập nhập một số nguyên, tìm kết quả phép nhân của số đó với các số từ 1 - 20 , sau đó in kết quả ra màn hình.
//        System.out.println("nhập vào số nguyên n");
//        int number=Integer.parseInt(scan.nextLine());
//        int[] result=bai3(number);
//        for(int e:result){
//            System.out.println(e);
//        }
//        Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 )
//        In ra tất cả số nguyên trong khoảng từ 0 - n.
//        System.out.println("nhập số n <1000");
//        int n=Integer.parseInt(scan.nextLine());
//        while (n>=1000){
//            System.out.println("nhập số n <1000");
//            n=Integer.parseInt(scan.nextLine());
//
//        }
//        bai4(n);

//        Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm).
//        Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất.
//        System.out.println("nhập n");
//        int n=Integer.parseInt(scan.nextLine());
//        System.out.println("nhập vào số phần tử mảng");
//       int numberOfElement=Integer.parseInt(scan.nextLine());
//        int [] arr=new int[numberOfElement];
//        for(int i=0;i<arr.length;i++){
//            System.out.printf("nhập vào phần tử thứ %d\n",i);
//            arr[i]=Integer.parseInt(scan.nextLine());
//        }
//        int result=bai5(arr);
//        System.out.printf("min=%d",result);
//        Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên.
//         Sắp xếp các phần tử trong mảng theo thứ tự ngược lại.
//        System.out.println("nhập n");
//      int n=Integer.parseInt(scan.nextLine());
//        int [] arr=new int[n];//array
//        for(int i=0;i<arr.length;i++){
//            System.out.printf("nhập vào phần tử thứ %d\n",i);
//            arr[i]=Integer.parseInt(scan.nextLine());
//        }
//        bai6(arr);
//        Viết chương trình cho phép nhập vào một chuỗi
//        Kiểm tra xem chuỗi này ký tự “a” xuất hiện bao nhiêu lần
//        In ra số lần đó.
//        System.out.println("nhập chuỗi");
//        String text= scan.nextLine();
//        int count= bai7(text);
//        System.out.printf("a xuất hiện:%d lần\n",count);
//        Chương trình nhập vào một chuỗi và in ra chuỗi nghịch đảo của chuỗi nhập.
        System.out.println("nhập vào chuỗi ");
        String text= scan.nextLine();
            bai8(text);
    }

    private static void bai8(String text) {
        for(int i=text.length()-1;i>-1;i--){
            System.out.print(text.charAt(i));
        }
    }

    private static int bai7(String text) {
        int count=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }

    private static void bai6(int [] numbers) {
            for(int i=numbers.length-1;i>=0;i--){
                System.out.printf("numbers[%d]=%d\n",i,numbers[i]);
            }
    }

    public static void bai1(int n){
        if(n>=0)
            System.out.println("số dương");
        else
            System.out.println("số âm");

    }
    public static int bai2(int [] numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0)
                sum+=numbers[i];//sum=sum+number[i]
        }
        return sum;

    }
    public static int [] bai3(int number){
        int [] arrResult=new int[20];
        int temp=0;
        for(int i=0;i<20;i++){
            temp=number*(i+1);
            arrResult[i]=temp;
        }
        return arrResult;

    }
    public static void bai4(int number){
        for(int i=0;i<=number;i++){
            System.out.println(i);
        }

    }
    public static int bai5(int [] numbers){
        int min=numbers[0];
        for(int ele:numbers){
                if(min>ele)
                    min=ele;
        }
        return min;

    }
}
