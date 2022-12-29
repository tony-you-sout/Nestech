package entities;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Employee {
    private String name;

    public String getPosition() {
        return position;
    }

    private String dateOfBirth;
    private  UUID maNV=UUID.randomUUID();
    private static String companyName="Nestech";
    private  String position="Employee";
    private long baseSalary=500;


    public Employee(String name, String dateOfBirth) {
        this.name=name;
        this.dateOfBirth=dateOfBirth;
    }
    public String getName(){
        return this.name;
    }
    public String getDateOfBirth(){
        return this.dateOfBirth;
    }
    public UUID getMaNV(){
        return this.maNV;
    }
    public String setName(String name){
        if(!name.equals("")){
            this.name=name;
            return this.name;
        }
        return this.name=this.getName();



    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    public String setDateOfBirth(String dateOfBirth) {
        if(!dateOfBirth.equals("")){
            this.dateOfBirth=dateOfBirth;
            return this.getDateOfBirth();
        }
            return this.dateOfBirth=this.getDateOfBirth();

    }
    public void setMaNV(UUID maNV){
        this.maNV=maNV;
    }
    public long caculateSalary(){
        return this.getBaseSalary();
    }
}
