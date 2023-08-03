package condicionais;
public class condicionais {
    public static void main(String[] args){

        int chc = 2;
        int nota = 85, media = 60, faltas = 10, maxFaltas = 5;
        String res;
        switch(chc){
            case 1:
                res = (nota >= media ? "Aprovado" : "Reprovado");
                System.out.println("Resultado:" + res);
                break;
            case 2:
                if((nota >= media) && (faltas <= maxFaltas)){
                System.out.println("Passou");
                }else if(nota >= 40){
                    System.out.println("Recuperação");
                }else{
                    System.out.println("Reprovou");
                }

                System.out.println("Fim do Programa");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }    
}
