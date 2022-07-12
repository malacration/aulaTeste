import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("Digite um numero para escolher uma das opções");
        System.out.println("1 - Executar o programa nome bonito");
        System.out.println("2 - Executar o programa Numero maior que 10");

        Scanner scanner = new Scanner(System.in);
        Integer opcaoMenu = scanner.nextInt();

        if(opcaoMenu == 1){
            System.out.println("informe seu nome: ");
            String nome = scanner.next();

            if(nome.equals("andrew"))
            {
                System.out.println("Esse nome ("+nome+") é bonito");
            }
            else
            {
                System.out.println("Esse nome ("+nome+") não é bonito");
            }
        }
        else if(opcaoMenu == 2){
            System.out.println("informe um numero: ");
            Integer numero = scanner.nextInt();

            if(numero > 10)
            {
                System.out.println("O numero informado e maior do que 10");
            }
            else
            {
                System.out.println("O nomero informado e menor ou igual a 10");
            }
        }else{
            System.out.println("Nenhuma seleção foi realizada");
        }
    }
}
