import java.util.Scanner;

public class Daire {
    //Yarıçapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan program.
    //Alan Formülü : π * r * r;
    //Çevre Formülü : 2 * π * r;
    public static void main(String[] args) {
        double r,alan,cevre;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        alan = Math.PI * Math.pow(r,2);
        cevre = 2 * Math.PI * r;
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin cevresi: "+cevre);

    }



}
