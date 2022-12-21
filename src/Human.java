public class Human {
    String name;
    int age;
    String nation;
    public  Human(String ten,int tuoi,String quocTich){
        this.name=ten;
        this.age=tuoi;
        this.nation=quocTich;

    }
    public Human(){

    }

    public void talk(){
        System.out.println("hi i'm human");
    }
    public void sleep(){
        System.out.println("zzz");
    }
    public  void eat(){
        System.out.println("mum mum");
    }
}
