import java.util.Scanner;

public class Dairedilimi {
    public static void main(String[] args) {
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //𝜋 sayısını = 3.14 alınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        int r , aci;
        double pi =3.14, alan ;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Lütfen daire diliminin açısını derece cinsinden giriniz: ");
        aci = input.nextInt();
        alan = (aci * pi * Math.pow(r,2))/360;
        System.out.println("Daire diliminin alanı: "+alan);


    }
}
