import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner sc = new Scanner(System.in);
        double grauF, grauc;

        //Processamento de dados
        System.out.println("Insira o valor do graus: ");
        grauc = sc.nextByte();

        //Saida de dados
        grauF = grauc*9/5+32;
        System.out.println("Grau em F:" + grauF);

    }
}
