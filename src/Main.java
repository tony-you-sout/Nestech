public class Main {
    public static void main(String[] args) {

        Demo d=new Demo();
        d.displayName();
        d.displayName("Phát",20);
        d.displayName(20,"Tấn");
        d.displayName("Duyệt");
        DemoChild demoChild=new DemoChild();
        demoChild.displayName();
    }
}