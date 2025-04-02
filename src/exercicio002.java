import java.util.Scanner;

public class exercicio002 {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner sc = new Scanner(System.in);
        double grausC , grausF;

        //Processamento
        System.out.println("Coloque o graus Celcius ->");
        grausC = sc.nextDouble();

        grausF= grausC*9/5+32;

        //Saida de dados
        System.out.println("Graus em Fahrenheit: " + grausF);
    }
}
