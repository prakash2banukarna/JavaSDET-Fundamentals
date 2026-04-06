package leetcode.Operators_Example;

// Prakash solved it
// https://leetcode.com/problems/add-digits/description/

/*
I initially struggled, then i wrote the input in notepad and tried to derive the solution
389 ==> 3+8+9 ==> 20 ==> 2+0 ===> 2
Also can be done like below
389 ===> 9+38 (i.e lastdigit + remaining) ===> 47 ===> 4 + 7 ===> 11 ====> 1 +1 ==> 2
 */
public class AddDigits {
    public int addDigits(int num) {
// 389
        int temp=num;
        int sumDigit=0;
        while(temp>9){
            sumDigit=  (temp %10) + temp/10 ; //remove the last digit + remaining digits

            temp =sumDigit ;
        }
        return temp;
    }

    public static void main(String[] arg){
        int num=389;
        AddDigits obj = new AddDigits();
        obj.addDigits(num);
    }
}
