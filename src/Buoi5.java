import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Buoi5 {
    public  static void main(String [] args){
        List<Integer> lst=new LinkedList<>();
        Scanner scan=new Scanner(System.in);
        Integer temp;


//        viét chương trình nhập vào b số nguyên tìm số lớn nhất tronh danh sách,
//        nếu nhập 0 thì dùng việc nhập
//        while (true){
//            System.out.println("nhập phần tử vào danh sách");
//            temp=Integer.parseInt(scan.nextLine());
//            lst.add(temp);
//            if(temp==0)
//                break;
//        }
//        Integer result=findMax(lst);
//        System.out.printf("max=%d",result);
        List<Integer> arrList=new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        for(Integer i:arrList){
            System.out.printf("arr=%d\n",i);
        }
//        viét chương trình nhập vào b số nguyên tìm số lớn nhất tronh danh sách,
//        nếu nhập 0 thì dùng việc nhập
    }
    public static Integer findMax(List<Integer> lst){
        Integer max=0;
        for(Integer i:lst){
            if(max<i)
                max=i;
        }
        return max;

    }
}
