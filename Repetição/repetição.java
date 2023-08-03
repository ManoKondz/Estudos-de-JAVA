import java.util.Scanner;
public class repetição {
    public static void main(String[] args){

        Scanner tcld = new Scanner(System.in);

        for(int cont=0 ; cont < 10 ; cont++){

            System.out.println("Repetição por estrutura for");

        }
        System.out.println("Quantas vezes quer que repita?");
        int maximo = tcld.nextInt();
        int cont = 0;

        while(cont < maximo){

            System.out.println("Repetição por estrutura while");
            cont++;

        }
        int count = 0;
        do{
            System.out.println("Repetição por estrutura do-while");
            count++;
        }while(count < 5);
        System.out.println("Fim do Programa");
    }

}
