package principal;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o número final: ");
        int fim = sc.nextInt();

        CalculoPrimo calculo = new CalculoPrimo();

        AtomicInteger contador = new AtomicInteger(inicio);

        Runnable tarefa = () -> {
            int numero;
            while ((numero = contador.getAndIncrement()) <= fim) {
                calculo.calculandoPrimo(numero);  
            }
        };

        new Thread(tarefa, "T1").start();
        new Thread(tarefa, "T2").start();
        new Thread(tarefa, "T3").start(); 
    }

}

