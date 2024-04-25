import java.time.LocalDate;
public class Mains {
    public static void main(String[] args) {

        System.out.println("==== Inheritance ====");
        
        System.out.println("Manusia");
        System.out.println("------------------------");
        Manusia lakiMenikah = new Manusia("Abe", true, "1830564890", true);
        System.out.println(lakiMenikah.toString());

        System.out.println();
        Manusia perempuanMenikah = new Manusia("Jiwon", false, "0987654321", true);
        System.out.println(perempuanMenikah.toString());

        System.out.println();
        Manusia belumMenikah = new Manusia("Hyuno", true, "9235236831", false);
        System.out.println(belumMenikah.toString());
        System.out.println("------------------------");

        System.out.println();
        System.out.println("Mahasiswa FILKOM");
        System.out.println("------------------------");
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("235150401111031", "Zahra", false, "0847293549", 2.9);
        System.out.println(mahasiswa1.toString());
        
        System.out.println();
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("235150401111031", "Zahra", false, "0847293549", 3.47);
        System.out.println(mahasiswa2.toString());

        System.out.println();
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("235150401111031", "Zahra", false, "0847293549", 3.7);
        System.out.println(mahasiswa3.toString());
        System.out.println("------------------------");

        System.out.println();
        System.out.println("Pekerja");
        System.out.println("------------------------");
        Pekerja pekerja1 = new Pekerja("Miko", true, "8930461254", true, 1000, LocalDate.of(2022, 3, 2), 2);
        System.out.println(pekerja1.toString());

        System.out.println();
        Pekerja pekerja2 = new Pekerja("Joysie", false, "9821304927", false, 2000, LocalDate.of(2015, 3, 2), 0);
        System.out.println(pekerja2.toString());

        System.out.println();
        Pekerja pekerja3 = new Pekerja("Tamoro", true, "7830194628", true, 3000, LocalDate.of(2004, 3, 2), 10);
        System.out.println(pekerja3.toString());
        System.out.println("------------------------");

        System.out.println();
        System.out.println("Manager");
        System.out.println("------------------------");
        Manager manager = new Manager("Juno", true, "9832085741", false, 7500, LocalDate.of(2009, 3, 2), 0, "IT");
        System.out.println(manager.toString());
        System.out.println("------------------------");
    }
}
