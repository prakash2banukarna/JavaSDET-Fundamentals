package concepts;

public class function_learning {

    public void greeting(){
        System.out.println("Vanakkam");
    }

    public void Namstay(){
        System.out.println("Namstay");
        greeting(); //non static function can be called to non static function directly
    }

    public static void dummy(){
        System.out.println("I am dummy");
    }

    int sumNumbers(int a,int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] arg){
        dummy(); // static function can be called directly into another static function
        // greeting() - Non-static cant be called directly into static function
        function_learning learn = new function_learning();
        learn.greeting(); // Have to create obj to access Class

        int x=learn.sumNumbers(10,5);
        System.out.println("return value " +x);

    }
}
