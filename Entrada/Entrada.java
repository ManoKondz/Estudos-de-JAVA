import java.util.Scanner;
public class Entrada{
    public static void main(String[] args){

        Scanner tcld = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, nota = 0;
        String nome = "", res = "";

        System.out.println("Digite o nome do aluno: ");
        nome = tcld.nextLine();
        System.out.println("Digite sua primeira nota: ");
        n1 = tcld.nextInt();
        System.out.println("Digite sua segunda nota: ");
        n2 = tcld.nextInt();
        System.out.println("Digite sua terceira nota: ");
        n3 = tcld.nextInt();
        System.out.println("Digite sua quarta nota: ");
        n4 = tcld.nextInt();
        nota = (n1 + n2 + n3 + n4)/4;
        if(nota >= 6){
            res = "Aprovado";
        }else{
            res = "Reprovado";
        }
        System.out.printf("Aluno: %s%nNotas:%nn1:%d%nn2:%d%nn3:%d%nn4:%d%nO aluno foi %s com média %s", 
        nome, n1, n2, n3, n4, res, nota);
    }
}
