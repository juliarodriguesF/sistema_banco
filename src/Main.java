import java.awt.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double saldo = 0.0;
    double valor;
    String opcaoSelecionada = "";
    boolean encerrar = false;
    Funcoes funcoes = new Funcoes();

    while (!encerrar){
        opcaoSelecionada = funcoes.menu(opcaoSelecionada);
        switch(opcaoSelecionada){
            case "a":
                System.out.println("Seu saldo atual é:  " + saldo); break;
            case "b":
                System.out.println("Digite o valor para depositar:");
                valor = sc.nextDouble();
                saldo += valor;
                System.out.println("Depósito realizado. Seu novo saldo é: " + saldo);
                break;
            case "c":
                System.out.println("Digite o valor para sacar:");
                valor = sc.nextDouble();
                if (valor <= saldo) {
                    saldo -= valor;
                    System.out.println("Saque realizado. Seu novo saldo é: " + saldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
                break;
            case "d":
                encerrar = true;
                System.out.println("Encerrando...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;        }
    } sc.close();


        }
    }

class Funcoes {
    static Scanner sc = new Scanner(System.in);
    public static String menu(String opcaoEscolhida){
        System.out.println("Menu de Opções");
        System.out.println("[a] Consultar Saldo");
        System.out.println("[b] Realizar Deposito");
        System.out.println("[c] Efetuar Saque");
        System.out.println("[d] Encerrar");
        opcaoEscolhida = sc.next();
        return opcaoEscolhida;
    }
}

