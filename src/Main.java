import oop.Car;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       Car c=new Car();
       c.run();
       c.honk();
       Car vinfast=new Car();
       vinfast.honk();
        Human tony=new Human("Tan",26,"VN");
        Human phat=new Human("Phat",20,"VN");
        Human h=new Human();
        System.out.println(tony.name);
        System.out.println(phat.name);
        Dev d=new Dev();
        System.out.println(d.name);
        System.out.println(d.nation);
        d.talk();

    }
}