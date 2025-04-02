import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        //Entrada
        double valordahora, numerodehorastrabalho, descontoinss;
        double salariobruto, salarioliquido;


        System.out.println("digite o valor da hora trabalhada -> ");
        numerodehorastrabalho = sc.nextDouble();

        System.out.println("digite o valor ganho por hora -> ");
        valordahora = sc.nextDouble();

        //Processamento
        salariobruto = numerodehorastrabalho*valordahora;

        descontoinss = salariobruto * 0.12;

        salarioliquido = salariobruto - descontoinss;



        //Saida
        System.out.println("salario bruto: " + salariobruto);

        System.out.println("o valor do inss ->" + descontoinss);

        System.out.println("salario liquido -> " + df.format(salarioliquido) );


    }
}
