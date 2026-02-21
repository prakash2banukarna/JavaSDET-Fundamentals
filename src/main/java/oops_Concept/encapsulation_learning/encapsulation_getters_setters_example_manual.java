package oops_Concept.encapsulation_learning;

/*
Wrapping up variables and methods into a single unit(class)
- getters and setters used

- All variables should be private
-Every variable should have 2 methods (get and set)
- variables should be operated only thorugh methods
 */
public class encapsulation_getters_setters_example_manual {

    private int EmployeeNum; // Class variable

    // Setter
    void setEmployeeNum(int num) // Local variable , Dont give local varaible same name as class variable
    {
        this.EmployeeNum=num; // word this refers to class
    }

    // Getter
    int getEmployeeNum(){
        return EmployeeNum;
    }

}
