package behaviour.association.aggregation;

import java.util.List;

/**
 * Association : is an independent class, each entity have a loosely coupled in between
 * If department class have deleted then Employee can join the another department.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Asim");
        Employee employee2=new Employee(2,"Sara");
        
        Department department=new Department("IT", List.of(employee1,employee2));

        
    }
}
