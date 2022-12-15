import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //viết chương trình in từ các số từ 1-1000
        for(int i=0;i<=1000;i++) {
            System.out.println(i);
        }

//        Mảng
        int [] numbers=new int[10];//khởi tạo mảng với [10] là số phần tử của mảng=> mảng có 10 phần tử
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<10;i++){
            /*
                vòng lặp thực hiện từ 0 =>int i=0
                sau mỗi lần lặp i tăng lên 1 đơn =>i++
                sau đó kiểm tra điều kiện nếu i hiện tại vẫn <10 thì tiếp tục lặp,nếu i hiện tại >10 thì dừng =>i<10
             */
            System.out.println("nhap phan tu vao mang");
            numbers[i]=Integer.parseInt(scan.nextLine());//ở mỗi lần lặp sẽ thực hiện cho người dùng nhập giá trị từ bàn phím và gán giá trị đó vào phần tử thứ i của mảng
        }
        for(int i=0;i<10;i++){
//            thực hiện vòng lặp để in các phần tử của mảng ra màng hình
            System.out.println(numbers[i]);
        }




//    viết chương trình nhập vào n số nguyên tìm số lớn nhất,nhỏ nhất trong mảng
        int n=0;

        System.out.println("nhap so luong phan tu");
        n=Integer.parseInt(scan.nextLine());//nhập số lượng phần tử mong muốn
        //int [] numbers1 = {1,2,3,4,5};//khai baó giá trị mặt định cho mảng
        int [] numbers2=new int[n];// khởi tạo mảng numbers2 mảng này có n phần tử với n là số do người dùng nhập vào
        for(int i=0;i<numbers2.length;i++){//numbers.length sẽ trả về số lượng phần tử của mảng
            System.out.printf("nhap phan tu thu %d\n",i);
            numbers2[i]=Integer.parseInt(scan.nextLine());//gán giá trị cho từng phần tử trong mảng
        }
//        thực hiện vòng lặp để in các phần tử của mảng ra màng hình
        for (int i=0;i<numbers2.length;i++){
            System.out.printf("a[%d]=%d\n",i,numbers[i]);
        }
        int max=findMax(numbers2); //gọi hàm tìm số lớn nhất trong mảng
        int min=findMin(numbers);// gọi hàm tìm số nhỏ nhất trong mảng
        System.out.printf("so lon nhat la %d so nho nhat la %d",max,min); //in ra kết quả




//        mảng 2 chiều
            int [][] matrix=new int[3][3]; //khai báo mảng 2 chiều=> mảng này là 1 ma trận 3*3 do [3][3]
//        nhập giá trị từng phần tử cho ma trận
//        sử dụng 2 vòng lặp
//        mảng 2 chiều sẽ duyệt theo thứ tự từ trái sang phải, từ trên xuống dưới của ma trận có i hàng và j cột
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.println("nhap phan tu");
                    matrix[i][j]=Integer.parseInt(scan.nextLine());
                }

            }
            for (int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.printf("matrix[%d][%d]=%d\n",i,j,matrix[i][j]);
                }
            }




//        vòng lặp for cải tiến
        int [] numbers3=new int[n];
        for(int ele:numbers3){
//            vòng lặp for cải tiến sẽ ko lặp theo chỉ mục của mảng mà lặp theo các phần tử có trong mảng
//            với ele đại diện cho 1 phần tử trong mảng-> int là kiểu dữ liệu của 1 phần t mảng
//             numbers3 là mảng muốn duyệt
            System.out.println(ele);//in ra phần tử hiện tại trong mảng
        }



//        Nhập vào 1 số nguyên tìm số nguyên đó trong mảng
        System.out.println("nhap so can tim");
        int soCanTim=Integer.parseInt(scan.nextLine());
        int result=findNumber(numbers,soCanTim);
        System.out.println("so can tim="+ result);




//        Viết chương trình nhập vào các số nguyên và tính tổng các số đó, nếu tổng lớn hơn > 100
//thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập
        int sum=tongSoNguyen();
        System.out.printf("tong=%d",sum);


    }
    public static int findNumber(int [] numbers,int number){
        for(int ele:numbers){
            if(number==ele)
                return ele;
        }
        return 0;
    }
    public static int findMax(int [] numbers){
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(max<numbers[i])
                max=numbers[i];

        }
        return max;

    }
    public static int findMin(int [] numbers){
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(min>numbers[i])
                min=numbers[i];

        }
        return min;

    }
    public static int tongSoNguyen(){
        int sum=0;
        Scanner scan=new Scanner(System.in);
        while(sum<=100){
            System.out.println("nhap 1 so nguyen");
            int number=Integer.parseInt(scan.nextLine());
            sum+=number;//sum=sum+number

        }
        return sum;
    }
}