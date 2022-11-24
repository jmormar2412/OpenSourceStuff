import java.util.Scanner;

public class toIntArrayfromString {
    //Made by jmormar2004 in 2022

    //*DECLARING A FUNCTION */
    static int[] toIntArray(String num){
        //To start off, we convert the string to a char array with the .toCharArray() method.
        //We also declare an int i, which will be useful in checking whether the String has chars other than numbers.
        char[] chars=num.toCharArray();
        int i=0;

        //Here we will check whether the string has chars different than numbers.
        Boolean error=false;
        while(error==false&&i<=chars.length-1){
            if(chars[i]<48||chars[i]>57){
                error=true;
            }
            i++;
        }

        //Now we declare the array that will be returned, which will be of the same length as the previous one.
        //The length will be set only when there have been no errors.
        int[] temparray={};
        if(error==false){
            temparray=new int[chars.length];
        }
        

        //Here we check if there was an error in the String, and add elements to the int[].
        if(error==false){
            for(int j=0; j<=temparray.length-1; j++){
                temparray[j]=chars[j]-48;
            }
        }
        else{
            System.out.println("Error, there was a character in your input which wasn't a number");
        }
        //Now we return the array.
        return temparray;
    }

    //*ACTUAL PROGRAM */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number to convert it to int[]");
        String num=sc.nextLine();
        sc.close();
        int[] array=toIntArray(num);

        //Print all the elements in the array.
        for(int i=0; i<=array.length-1; i++){
            System.out.println(array[i]);
        }
    }
}
