import oop.Car;

public class JuniorDev extends Dev {
    public JuniorDev(){
            this.experienceYear=1;
            this.skill="Java";
    }
    public JuniorDev(String name){
//        dùng this như 1 constructor
        //this() phải là câu lệnh đầu tiên trong constructor
        this();//JuniorDev();
        this.name=name;
        System.out.println("cháu");

    }
  public JuniorDev(int age){

        this("dasdsa");//JuniorDev("dasda")
      //dùng this để chỉ đến thuộc tính của lớp hiện tại
        this.age=26;

  }
  public JuniorDev(int expYear,String skill){
        //dùng để gọi hàm của lớp hiện tại
        this.printDevInfo();
        this.skill=skill;
        this.experienceYear=expYear;
      System.out.println(this.skill);
      System.out.println(this.experienceYear);

  }
  public JuniorDev getJuniorDev(){
        //trả về 1 đối tượng của lớp hiện tại
        return this;
  }
public void demo(){
//        dùng this như  tham số của constructor
        new Human(this);
}
public void printDevInfo(){
        //this được dùng như 1 tham số của phương thức
        printHumanInfo(this);//printHumanInfo(JuniorDev)


}



}
