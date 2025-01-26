import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner latf=new Scanner(System.in);
        System.out.println("lütfen vize notunu giriniz");
        double vize=latf.nextDouble();

        System.out.println("lütfen final notunu giriniz");
        double ffinal= latf.nextDouble();

        double sonuc=(ffinal*0.6+vize*0.4);
        System.out.println("Sonucunuz :"+sonuc);
    }
}