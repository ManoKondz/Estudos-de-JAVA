import java.util.Scanner;
public class Arrays{
    public static void main(String[] args){

        int[] num=new int[5];

        num[0]=1;
        num[1]=2;
        num[2]=4;
        num[3]=8;
        num[4]=16;

        int[] numeros={1, 2, 4, 8, 16, 32, 64 , 128, 256};

        System.out.printf("Array num:%d, %d, %d, %d, %d%n", num[0], num[1], num[2], num[3], num[4]);
        System.out.printf("Array numeros:%d, %d, %d, %d, %d%n", numeros[0], numeros[1], numeros[2], 
        numeros[3], numeros[4]);

        for(int i=0; i<numeros.length; i++){

            System.out.printf("Array numeros em FOR:%d%n", numeros[i]);

        }
    }
}