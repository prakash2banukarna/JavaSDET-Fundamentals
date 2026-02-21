package concepts;

/*
4 type of access modifers:
- Public (Can be accessed in other packages)
- Protected
- Private
- Default  (Cannot be accessed in other packages)

One class should only have one public



 */
class Teacher{
    public String myName="Prakash";
    private String yourName="Rudhran";

     void yourName(){ // function within the Teacher class
        System.out.println(yourName); // Private  is  accessible within the  same class
    }

}

public class accessModifier_learning {

    public static void main(String[] arg){
        Teacher teach =new Teacher();
        System.out.println(teach.myName); // public is accessible
        // System.out.println(teach.yourName); // Private  is not accessible outside the class
    }

}
