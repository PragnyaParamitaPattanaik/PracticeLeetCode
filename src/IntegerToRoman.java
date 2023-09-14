import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        integerToRoman(25);
        integerToRoman(36);
        integerToRoman(1023);
        integerToRoman(542);
    }
    public static void integerToRoman(int num){
        String[]  strs={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] value={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<value.length;i++){
            while(num>=value[i]){
                num-=value[i];
                sb.append(strs[i]);

            }

        }
        System.out.println("Roman: " + sb.toString());
        System.out.println("---------------------------------------------------");
    }
}