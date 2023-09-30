
import java.util.Scanner;

public class javaExerc02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double primeiraNota;
        double segundaNota;
        double media;


        System.out.println("Digite a primeira Nota");
        primeiraNota = scanner.nextDouble();
        System.out.println("digite a segunda Nota");
        segundaNota = scanner.nextDouble();

        media = (primeiraNota + segundaNota) /2 ;


        if ( media >= 6) {

            System.out.println("meus parabens voce atingiu a nota");


        }else  {
            System.out.println("voce nao atingiu a nota");
        }

    }
}



