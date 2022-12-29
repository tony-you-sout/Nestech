package entities;

import java.util.UUID;

public class Manager  extends Employee{

    public Manager(String name, String dateOfBirth, UUID uid) {
        super(name, dateOfBirth);
        setMaNV(uid);
    }
    @Override
    public long caculateSalary(){
        return getBaseSalary()*2;
    }
}
