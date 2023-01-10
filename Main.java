import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int a,b;
        double c;
        Scanner input=new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz:");
        a=input.nextInt();
        System.out.println("2. Kenarı Giriniz:");
        b=input.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs:"+c);*/

        int a,b,c,cevre;
        double u;
        Scanner input=new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz:");
        a=input.nextInt();
        System.out.println("2. Kenarı Giriniz:");
        b=input.nextInt();
        System.out.println("3. Kenarı Giriniz:");
        c=input.nextInt();

        System.out.println("Cevre:"+(a+b+c));
        u=(a+b+c)/2;
        System.out.println("Alan:"+Math.sqrt(u*(u-a)*(u-b)*(u-c)));
    }
}