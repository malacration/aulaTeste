import java.util.Scanner;

public class NumeroInteiorV3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe um numero: ");
        Integer numero = scanner.nextInt();

        if(!(numero > 10))
        {
            System.out.println("O nomero informado e menor ou igual a 10");
        }
        else
        {
            System.out.println("O numero informado e maior do que 10");
        }
    }
}
