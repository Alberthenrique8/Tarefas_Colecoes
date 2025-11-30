import java.util.Arrays;
import java.util.Scanner;

public class Colecoes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seus nomes : ");
        String nome = s.nextLine();

        String[] nomesArray = nome.split(", ");
        Arrays.sort(nomesArray);
        System.out.println(Arrays.toString(nomesArray));



    }
}
