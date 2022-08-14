import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");

        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Girilen tutar " + tutar);
        System.out.println("Kdv oranı " + kdvOran);
        System.out.println("Kdv tutarı " + kdvTutar);
        System.out.println("Kdvli tutar " + kdvliTutar);
}
}














