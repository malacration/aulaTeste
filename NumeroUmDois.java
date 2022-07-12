import java.util.Scanner;

public class NumeroUmDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe um numero: ");
        Integer numero = scanner.nextInt();

        if(numero == 10 || numero == 50 )
        {
            System.out.println("O nomero informado é 10 ou 50");
        }
        else
        {
            System.out.println("O numero informado não é um dos valores esperado");
        }
    }
}
