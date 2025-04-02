import java.util.Scanner;

public class Exercico04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario,qntdwatts, valordecada, desconto, total;
        System.out.println("Salario: ");
        salario = sc.nextDouble();

        System.out.println("QUuanto consumiu no mes -> ");
        qntdwatts = sc.nextDouble();

        //Processamento
        valordecada=salario/7/100;

        total=valordecada*qntdwatts;

        desconto= total*0.9;
        //Saida
        System.out.println("Valor em reais de cada quilowat" + valordecada);

        System.out.println("Valor usado em um mes -> " + total);

        System.out.println("com desconto -> " + desconto);
    }
}
