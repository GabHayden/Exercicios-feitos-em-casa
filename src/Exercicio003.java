import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Entrada de dados
        double vm, tempo, qntddegasolina;
        System.out.println("Digite a velocidade -> ");
        vm = sc.nextDouble();
        System.out.println("Digite o tempo -> ");
        tempo = sc.nextDouble();

        //Processamento de dados
        qntddegasolina = vm*tempo/10.5;

        //Saida de dados
        System.out.println("quantidade de gasosa" + qntddegasolina);



    }
}
