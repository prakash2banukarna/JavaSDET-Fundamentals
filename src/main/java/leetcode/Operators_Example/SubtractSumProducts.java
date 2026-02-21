package leetcode.Operators_Example;
// Prakash solved it
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
// Practice solution 2
public class SubtractSumProducts {

    public int subtractProductAndSum_Solution2(int n) {

        if(n<10){ // If the number is less than 10, then its going to be zero
//            return n-n;
            return 0;
        }

        int product=1;
        int sum=0;
        int temp=n;

        while(temp>9){

            int remainder=temp%10; // Remainder will always be less than 10, which needs to be added into sum and product
            product=product*remainder;
            sum=sum+remainder;

            int quotient=temp/10;
            /*
            - If quotient <= 9, then it needs to be added into sum and product.
            If not, this needs to be added into while loop again, so  temp=quotient;
             */
            if(quotient<=9){
                product=product*quotient;
                sum=sum+quotient;
            }
            temp=quotient;


        }
        System.out.println(product - sum);
        return product - sum;
    }


    public int subtractProductAndSum_Solution1(int n) {
// int n = 234;
        String[] str=String.valueOf(n).split("");
        int product=1;
        int sum=0;

        for(int i=0;i<str.length;i++){
            int temp=Integer.parseInt(str[i]);
            product=product*temp;
            sum=sum+temp;
        }

        return product - sum;
    }

    public static void main(String[] arg){
//        int n = 4421;
//        int n = 234;
        int n = 91;
        SubtractSumProducts obj =new SubtractSumProducts();
        obj.subtractProductAndSum_Solution2(n);
    }
}
