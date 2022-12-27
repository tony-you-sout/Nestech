package entities;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Employee {
    private String name;
    private String dateOfBirth;
    private final UUID maNV=UUID.randomUUID();
    private static String companyName="Nestech";


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

    public String setDateOfBirth(String dateOfBirth) {
        if(!dateOfBirth.equals("")){
            this.dateOfBirth=dateOfBirth;
            return this.getDateOfBirth();
        }
            return this.dateOfBirth=this.getDateOfBirth();

    }
}
