package leetcode.Operators_Example;

public class AddDigits {
    public void addDigits(int num) {
//num = 3897
       int processValue=num;
       while(processValue>9){
           int quatent=processValue / 10;
           int remainder=processValue %10;

           while(quatent>9){
               quatent=quatent / 10;
               remainder=quatent %10;
           }
           processValue=quatent + remainder;
       }

        System.out.println(processValue);
    }

    public static void main(String[] arg){
        int num=389;
        AddDigits obj = new AddDigits();
        obj.addDigits(num);
    }
}
