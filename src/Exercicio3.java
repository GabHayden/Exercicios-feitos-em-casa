import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //insira dados
        Scanner sc = new Scanner(System.in);
        double Vm, tempogasto, qntddegasolina;

        System.out.println("insira o valor da velocidade média ");
        Vm = sc.nextDouble();

        System.out.println("Insira o tempo gasto ");
        tempogasto = sc.nextDouble();

        //Saida
        qntddegasolina = Vm*tempogasto/10.5;

        System.out.println("Total de litros consumidos " + qntddegasolina);


    }
}
