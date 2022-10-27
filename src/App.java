import java.util.Locale;
import java.util.Scanner;

import entity.Diametro;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(new Locale("us", "US"));
        Diametro diametro = new Diametro();

        System.out.println("Digite o valor de aro:");
        diametro.aro = sc.nextDouble();

        System.out.println("Digite a ponte:");
        diametro.ponte = sc.nextDouble();

        System.out.println("Digite a menor Dnp:");
        diametro.menorDnp = sc.nextDouble();

        System.out.println("Digite a maior diagonal:");
        diametro.maiorDiagonal = sc.nextDouble();

        diametro.calcular();

        System.out.println(diametro);

        sc.close();
    }
}
