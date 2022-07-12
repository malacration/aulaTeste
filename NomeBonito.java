import java.util.Scanner;

public class NomeBonito {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
}
