import java.util.Scanner;

public class NumeroInteiorV1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe um numero: ");
        Integer numero = scanner.nextInt();

        if(numero > 10)
        {
            System.out.println("O numero informado é maior do que 10");
        }
        if(numero < 10)
        {
            System.out.println("O nomero informado é menor do que 10");
        }
        if(numero == 10)
        {
            System.out.println("O nomero informado é 10");
        }
    }
}
