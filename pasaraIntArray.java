import java.util.Scanner;

public class pasaraIntArray {
    //Hecho por jmormar2004 en 2022
    static int[] toIntArray(int num){
        int div=1;
        int longitud=1;
        
        while(num/div>10){
            div*=10;
            longitud++;
        }

        int[] temparray=new int[longitud];
        int posinarray=0;

        while(div>=1){
            int digitnum=num/div%10;
            temparray[posinarray]=digitnum;
            posinarray++;
            div/=10;
        }
        return temparray;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número para pasarlo a int array.");
        int num=sc.nextInt();
        int[] digitos=toIntArray(num);

        for(int i=0;i<=digitos.length-1; i++){
            System.out.println(digitos[i]);
        }

        sc.close();
    }
}
