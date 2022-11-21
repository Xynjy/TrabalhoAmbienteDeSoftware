package main;
import java.util.ArrayList;
import java.util.Scanner;
import util.Calculadora;
import historico.Historico;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        ArrayList<Historico> h = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1, i=0;
        double numeroA, numeroB,resultado;

        while (true) {
            System.out.print("Select the option (1-soma, 2-subtracao, 3-multiplicacao, 4-divisao, 5-exponenciação, 6-raiz quadrada,"
                    + "7-teto e piso, 0-sair): ");
            opcao = scanner.nextInt();

            if(opcao ==0)
                break;
            if(opcao >=1 && opcao<=7) {
                switch(opcao) {
                    case 1:
                        System.out.printf("Digite o primeiro valor: ");
                        numeroA = scanner.nextDouble();
                        System.out.printf("Digite o segundo valor: ");
                        numeroB = scanner.nextDouble();
                        resultado = calculadora.soma(numeroA, numeroB);
                        h.add(new Historico(i, Double.toString(resultado)));
                        i++;
                        break;

                    case 2:
                        System.out.printf("Digite o primeiro valor: ");
                        numeroA = scanner.nextDouble();
                        System.out.printf("Digite o segundo valor: ");
                        numeroB = scanner.nextDouble();
                        resultado = calculadora.subtracao(numeroA, numeroB);
                        h.add(new Historico(i, Double.toString(resultado)));
                        i++;
                        break;
                    case 3:
                        System.out.printf("Digite o primeiro valor: ");
                        numeroA = scanner.nextDouble();
                        System.out.printf("Digite o segundo valor: ");
                        numeroB = scanner.nextDouble();
                        resultado = calculadora.multiplicacao(numeroA, numeroB);
                        h.add(new Historico(i, Double.toString(resultado)));
                        i++;
                        break;
                    case 4:
                        System.out.printf("Digite o primeiro valor: ");
                        numeroA = scanner.nextDouble();
                        System.out.printf("Digite o segundo valor: ");
                        numeroB = scanner.nextDouble();
                        resultado = calculadora.divisao(numeroA, numeroB);
                        h.add(new Historico(i, Double.toString(resultado)));
                        i++;
                        break;
                    case 5:
                        System.out.printf("Digite o primeiro valor: ");
                        numeroA = scanner.nextDouble();
                        System.out.printf("Digite o segundo valor: ");
                        numeroB = scanner.nextDouble();
                        resultado = calculadora.expo(numeroA, numeroB);
                        h.add(new Historico(i, Double.toString(resultado)));
                        i++;
                        break;
                    case 6:
                        System.out.printf("Digite o primeiro valor: ");
                        numeroA = scanner.nextDouble();
                        resultado = calculadora.sqrt(numeroA);
                        h.add(new Historico(i, Double.toString(resultado)));
                        i++;
                        break;
                    case 7:
                        System.out.printf("Digite o primeiro valor: ");
                        numeroA = scanner.nextDouble();
                        resultado = calculadora.tetopiso(numeroA);
                        h.add(new Historico(i, Double.toString(resultado)));
                        i++;
                        break;
                }
            }
            show(h);
        }scanner.close();
    }
    public static void show(ArrayList<Historico> list){
        for(Historico item: list) {
            System.out.printf("%s\n", item.toString());
        }
    }
}
