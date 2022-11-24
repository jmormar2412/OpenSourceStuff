import java.util.Scanner;

public class toIntArrayfromString {
    //Made by jmormar2004 in 2022
    static int[] toIntArray(String num){
        char[] chars=num.toCharArray();
        int i=0;

        Boolean error=false;
        while(error==false&&i<=chars.length-1){
            if(chars[i]<48||chars[i]>57){
                error=true;
            }
            i++;
        }

        int[] temparray=new int[chars.length];

        if(error==false){
            for(int j=0; j<=temparray.length-1; j++){
                temparray[j]=chars[j]-48;
            }
        }
        else{
            System.out.println("Error, there was a character in your input which wasn't a number");
            for(int j=0; j<=temparray.length-1; j++){
                temparray[j]=0;
            }
        }
        
        return temparray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number to convert it to int[]");
        String num=sc.nextLine();
        sc.close();
        int[] array=toIntArray(num);
        for(int i=0; i<=array.length-1; i++){
            System.out.println(array[i]);
        }
    }
}
