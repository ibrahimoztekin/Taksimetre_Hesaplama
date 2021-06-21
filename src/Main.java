import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mesafe,tutar,acılıs=10, KM= 2.20;
        System.out.print("Mesafe Giriniz: ");
        mesafe=input.nextDouble();

        tutar=((mesafe*KM)+acılıs);

        tutar=(tutar<20)? 20:tutar;

        System.out.println("Ödenecek Tutar: "+tutar+" Tl");

}}
