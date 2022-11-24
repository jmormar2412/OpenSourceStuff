import java.util.Scanner;

public class toIntArrayfunction {
    //Made by jmormar2004 in 2022
    static int[] toIntArray(int num){
        //Declaring variables
        int div=1;
        int length=1;
        
        //Taking the length of the number in order of tens.
        while(num/div>10){
            div*=10;
            length++;
        }

        //We now declare the array and an int to track the position in the array.
        int[] temparray=new int[length];
        int positioninarray=0;

        //Lastly, we divide the number and extract the digit by doing a module operation. Then we store the number in the array.
        while(div>=1){
            int digitnum=num/div%10;
            temparray[positioninarray]=digitnum;
            positioninarray++;
            div/=10;
        }
        //And we return the array.
        return temparray;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number to convert it to int[]");
        int num=sc.nextInt();
        int[] digits=toIntArray(num);

        //Print all the elements on the array.
        for(int i=0;i<=digits.length-1; i++){
            System.out.println(digits[i]);
        }

        sc.close();
    }
}
