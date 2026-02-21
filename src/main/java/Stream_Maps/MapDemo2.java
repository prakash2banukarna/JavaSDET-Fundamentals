package Stream_Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empid;
    String empname;
    int salary;

    Employee(int empid,String empname,int salary){
        this.empid=empid;
        this.empname=empname;
        this.salary=salary;
    }
}


public class MapDemo2 {

    public static void main(String[] arg){

        List<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee(100,"Messi",60000));
        emp.add(new Employee(101,"Ronaldo",50000));
        emp.add(new Employee(102,"Kane",20000));
        emp.add(new Employee(103,"Neymar",30000));


        // Filter and Map together
        List<String> empNames=emp.stream().filter(e->e.salary>=50000).map(e->e.empname).collect(Collectors.toList());
        System.out.println("EmpNames :" +empNames);



    }

}
