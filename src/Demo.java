public class Demo {
        private String name="Nestech";
        private int age=100;
//        overloading là việc tạo ra nhiều method có tên giôống nhau nhưng logic và số lượng đối số truyền vào khác nhau

    public void displayName(){
        System.out.println("overload 1");
        System.out.println(this.name);
    }

    public void displayName(String name){
        System.out.println("overload 2");
        System.out.println(name);

    }
    public void displayName(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("overload 3");
        System.out.println(this.name);
    }
    public void displayName(int age,String name){
        this.name=name;
        this.age=age;
        System.out.println("overload 4");
        System.out.println(this.name);
    }


}
