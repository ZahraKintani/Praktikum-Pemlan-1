package HeroBattle;
import java.util.Scanner;


public class MainHero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Permainan adu hero");
        System.out.println("Player 1 : Silahkan masukkan hero anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("==================================");

        System.out.print(String.format("%-20s%-1s", "Nama Hero", ": "));
        String n1 = scn.nextLine();
        System.out.print(String.format("%-20s%-1s", "Health Point", ": "));
        double h1 = scn.nextDouble();
        System.out.print(String.format("%-20s%-1s", "Attack", ": "));
        double a1 = scn.nextDouble();
        System.out.print(String.format("%-20s%-1s", "Defense", ": "));
        double d1 = scn.nextDouble();

        System.out.println();

        System.out.println("Permainan adu hero");
        System.out.println("Player 2 : Silahkan masukkan hero anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("==================================");

        System.out.print(String.format("%-20s%-1s", "Nama Hero", ": "));
        String n2 = scn.nextLine();
        System.out.print(String.format("%-20s%-1s", "Health Point", ": "));
        double h2 = scn.nextDouble();
        System.out.print(String.format("%-20s%-1s", "Attack", ": "));
        double a2 = scn.nextDouble();
        System.out.print(String.format("%-20s%-1s", "Defense", ": "));
        double d2 = scn.nextDouble();

        Hero hero1 = new Hero(n1, h1, a1, d1);
        Hero hero2 = new Hero(n2, h2, a2, d2);

        int i=1;
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            System.out.println("==================================");
            System.out.println("Ronde " + i);

            hero2.attack(hero1);
            if (hero1.getHp() <= 0) {
                System.out.println("Pertarungan telah usai!");
                System.out.println(hero1.getName() + " telah kalah!");
                System.out.println("==================================");
                System.out.println(hero2.getName() + " adalah pemenangnya");
                break;
            }

            hero1.attack(hero2);
            System.out.println("==================================");
            if (hero2.getHp() <= 0) {
                System.out.println();
                System.out.println("Pertarungan telah usai!");
                System.out.println(hero2.getName() + " telah kalah!");
                System.out.println("==================================");
                System.out.println(hero1.getName() + " adalah pemenangnya");
                break;
            }
            i++;
        }
    }
}