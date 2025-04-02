import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner sc = new Scanner(System.in);
        double Base, Altura;
        double Perimetro, Area;

        //Processamento de dados
        System.out.println("Digiyr o valor da Base: ");
        Base = sc.nextDouble();

        System.out.println("Digiyr o valor da Altura: ");
        Altura = sc.nextDouble();

        //Saida de dados
        Perimetro = Base*2 + Altura*2;
        Area = Perimetro*Base;

        System.out.println("Perimetro: "+ Perimetro);
        System.out.println("Area: "+ Area);


    }
}
