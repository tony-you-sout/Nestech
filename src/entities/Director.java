package entities;

import java.util.UUID;

public class Director extends Employee{


    public Director(String name, String dateOfBirth, UUID uid) {
        super(name, dateOfBirth);
        setMaNV(uid);

    }
    @Override
    public long caculateSalary(){
        return getBaseSalary()*3;
    }
}
