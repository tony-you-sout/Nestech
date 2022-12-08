import java.util.Scanner;

public class Recap {
    public static void main(String [] args){

        /*
        * Cú pháp khai báo biến:
        * kieu_du_lieu ten_bien = gia_tri_khoi_tao
        * exp:
        *   String name="Nestech";
        *   int age=18;
        *   char rank='A';
        * */
        String name="Nestech";
        char rank='a';
        int age=18;
        //System.out.println dùng để in chuỗi "hello world"
        System.out.println("Hello world");
        //System.out.printf dùng để in chuỗi với format định trước
        //%s tương ứng với giá trị từ biến name kiểu String, %d ứng với biến age kiểu int,d=decimal \n dùng để xuống dòng
        System.out.printf("Hello %s age %d\n",name,age);
        //từ khóa final dùng để khai báo hằng số
        final double Pi=3.14;
        System.out.printf("pi=%f\n",Pi); //%f tương ứng với hàng số Pi kiểu double f=float


        /*
            Cách Khai báo nhập từ bàn phím:
                Scanner ten_bien=new Scanner(System.in);

         */
        //tạo 1 scanner cho phép người dùng nhập từ bàn phím
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name");
        //hàm nextLine trả về giá trị kiểu String
        name=scan.nextLine();
        // biến name nhận được giá trị kểu String trả về từ hàm nextLine
        // sau đó thực hiện việc ghép chuỗi "name:"+ biến name<=>"name"+chuỗi nằm trong biến name mà người dùng nhập vào
        // exp: người dùng nhập vào "Nestech" =>có chuỗi "name:"+"Nestech"="name:Nestech"
        System.out.println("name:"+name);

        double GPA;
        System.out.println("enter GPA");
        // do hàm nextLine trả về giá trị kiểu String nên ko thể gán vào biến GPA kiểu double
        // cần chuyển giá trị kiểu String sang kiểu double=> dùng hàm parseDouble từ lớp Double để convert từ String sang double
        GPA=Double.parseDouble(scan.nextLine());
        // trong trường hợp biến nhận giá trị kiểu int thì dùng Integer.parseInt, kiểu long dùng Long.parseLong
        System.out.println("GPA:"+GPA);

        //các phép tính
        /*
            java hỗ trợ các phép tính +,-,*,/,%(chia lấy dư)

         */
        int sum=0;
        sum=10+20;
        System.out.println(sum);//30
        int subtract=0;
        subtract=10-100;
        System.out.println(subtract);//-90

        double multiply=10*2.5;
        System.out.println(multiply);//25.0
        double divide=17/2;//chia lấy phần nguyên
        System.out.println(divide);//8.0
        double divide2=17%2;
        System.out.println(divide2);//1.0

        int a=0;
        int i=1;
        a=i++;//i++ thực hiện việc trả về giá trị của i=1 rồi sau đó thực hiện tăng i lên 1
        System.out.println(a);//1

        a=++i;//thực hiện việc tăng giá trị của i lên 1 sau đó mới trả về giá trị hiện tại của i
        System.out.println(a);//3


        //gọi hàm
        printHello();
        int tong=sum(100,88);//kết quả trả về từ hàm sum được gán vào biến tổng
        System.out.println(tong);//188
    }
    /*
    *   cách khai báo 1 hàm:
    *   public static kieu_du_lieu_tra_ve ten_bien (kieu_du_lieu tham_so1,kieu_du_lieu tham_so2)){ return giá trị có kiểu dữ liệu cùng với kiểu dữ liệu trả về }
    * */
    public static void printHello(){
        // phần nằm sau { } dùng để định nghĩa hàm=> body của hàm
        System.out.println("Hello Java");
        // tất cả các hàm đều phải trả về 1 giá trị có kiểu dữ liệu giống với kiểu dữ liệu đã khai báo ở tên hàm trừ kiểu void
        // do hàm này có kiểu dữ liệu trả về là void (nghĩa là không có gì cả) nên có thể trả về hoặc không
        // dùng từ khóa return đ trả về giá trị
    }
    public static int sum(int number1,int number2){
        int sum=number1+number2;

        return sum;//giá trị trả về là sum có kiểu dữu liệu int
    }

//    việc gọi hàm sẽ được tiến hành ở hàm main
}
