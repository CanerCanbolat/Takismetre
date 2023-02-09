import java.util.Scanner;
public class Taksimetre {
    public static void main (String[] args) {
        int yol;
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi Km  cinsinden giriniz : ");
        yol = input.nextInt();
        double ucret = 10 + (yol*2.2);
        String str = ucret >= 20.01 ? "Ödeyeceğiniz ücret : "+ ucret+"TL" : "Ödeyeceğiniz ücret 20 TL'dir." ;
        System.out.print(str);
    }
}
