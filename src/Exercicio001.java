import java.util.Scanner;

public class Exercicio001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //entrada de dados
        double base, altura, Perimetro, Area;
        System.out.println("Coloque a base -> ");
        base = sc.nextDouble();

        System.out.println("Coloque a Altura -> ");
        altura = sc.nextDouble();

         //processamneto dos dadu
        Perimetro=2* base+ 2*altura;

        Area= base*altura;

        //Saida de dados
        System.out.println("Perimetro: " + Perimetro);
        System.out.println("Area: " + Area);
    }
}
