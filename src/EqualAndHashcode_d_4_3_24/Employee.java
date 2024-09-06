package EqualAndHashcode_d_4_3_24;

import java.util.Objects;

public class Employee {
    private Integer id;
    private String name;


    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //this = e1
    //o = e2
    //e1.equals(e2);
    //Object is a parent
    //Employee is a child
    @Override
    public boolean equals(Object o) {
        if (this == o) //e1 == e2 // checking memory address of both the objects
        {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) // if e2 is null
        {               // e1.getClass() != c1.getClass() -> return false -> not equal
            return false;
        }
        Employee employee = (Employee) o; //e2

        if(Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int empHashCode = Objects.hash(id, name);
        return empHashCode;
    }
}

