import java.util.Scanner;

public class toIntArrayfunction {
    //Made by jmormar2004 in 2022
    static int[] toIntArray(int num){
        int div=1;
        int length=1;
        
        while(num/div>10){
            div*=10;
            length++;
        }

        int[] temparray=new int[length];
        int positioninarray=0;

        while(div>=1){
            int digitnum=num/div%10;
            temparray[positioninarray]=digitnum;
            positioninarray++;
            div/=10;
        }
        return temparray;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number to convert it to int[]");
        int num=sc.nextInt();
        int[] digits=toIntArray(num);

        for(int i=0;i<=digits.length-1; i++){
            System.out.println(digits[i]);
        }

        sc.close();
    }
}
