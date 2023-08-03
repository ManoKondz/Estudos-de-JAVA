import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args){

        Scanner tlcd=new Scanner(System.in);
        final int tam=5;
        char[] gabarito={'a', 'a', 'd', 'b', 'c'};
        char[] respostas=new char[tam];
        int nota=0;

        for(int i=0; i<tam; i++){
            System.out.printf("Digite sua %dº Resposta:", i+1);
            respostas[i]=tlcd.nextLine().charAt(0); 
            // "tlcd.nextLine()" utiliza a variável tipo str pra entrar e ".charAt(0)" pega um caracter de posição "(#)"
        }

        for(int i=0; i<tam; i++){
            if(respostas[i]==gabarito[i]){
                nota+=2;
            }
        }
        System.out.printf("A nota do aluno é: %d%n", nota);
        System.out.print("Fim do Programa");
    }
}
