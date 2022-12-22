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
        this.name="Default";
        this.nation="Default";
        this.age=0;
        System.out.println("ông nội");
    }
    public Human(Human human){
        System.out.println("human construc with this param");
    }
    public void printHumanInfo(Human human){
        System.out.println(human.name);
        System.out.println(human.nation);
        System.out.println(human.age);

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
