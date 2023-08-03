import java.util.Arrays;
public class metodos {
    public static void main(String[] args){

        final int tam=10;
        int[] num={7, 8, 4, 3, 6, 0, 10, 5};
        int[] numeros=new int[tam];

        //Arrays.sort(num);
        //Arrays.fill(numeros,10);
        //System.arraycopy(num, tam, numeros, tam, tam);
        Arrays.equals(num, numeros);

        System.out.printf("Arrays são %s%n", Arrays.equals(num, numeros) ? "Iguais" : "Diferentes");

        for(int n:numeros){
            System.out.printf("%d -", n);
        }

    }
}
