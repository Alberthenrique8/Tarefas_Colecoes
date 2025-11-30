import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite Seu nome: ");
        String nome = s.nextLine();

        List<String> masculino = new ArrayList<String>();
        List<String> feminino = new ArrayList<String>();

        System.out.println("Digite Seu Sexo (Masculino/Feminino): ");
        String nomes = s.nextLine();
        if (nomes.equalsIgnoreCase("Masculino")) {
            masculino.add(nome);
            System.out.println("voce é do Sexo:" + nomes );
        }else if (nomes.equalsIgnoreCase("Feminino")) {
            feminino.add(nome);
            System.out.println("voce é do Sexo: "  + nomes );
        }else {
            System.out.println("Sexo Digitado Invalido" );
        }
    }
}
