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
}
