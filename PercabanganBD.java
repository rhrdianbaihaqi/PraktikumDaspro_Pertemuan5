import java.util.Scanner;

class PercabanganBD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("===PROGAM MENGHITUNG BANGUN DATAR");
        System.out.println("Pilih Bangun Datar (1. Persegi, 2. Segitiga, 3. Lingkaran)");
        int pilihan = scanner.nextInt();


      if (pilihan == 1) {
      // Persegi
        System.out.println("PROGAM MENGHITUNG PERSEGI");
        System.out.println("1. Luas Persegi, 2. Keliling Persegi");
        System.out.println("Silahkan pilih 1/2");
        int persegi = scanner.nextInt();

        if (persegi == 1){
            System.out.println("Menghitung luas Persegi");
        } 
        else if (persegi == 2){
            System.out.println("Menghitung Keliling Persegi");
        }
        else {
            System.out.println("Pilihan anda tidak valid");
        }

      
      } else if (pilihan == 2) {
      // Segitiga
        System.out.println("PROGAM MENGHITUNG SEGITIGA");
        System.out.println("1. Luas Segitiga, 2. Keliling Segitiga");
        System.out.println("Silahkan pilih 1/2");
        int segitiga = scanner.nextInt();

        if (segitiga == 1){
            System.out.println("Menghitung luas Segitiga");
        } 
        else if (segitiga == 2){
            System.out.println("Menghitung Keliling Segitiga");
        }
        else {
            System.out.println("Pilihan anda tidak valid");
        }

    }  else if (pilihan == 3) {
      // Lingkaran
        System.out.println("PROGAM MENGHITUNG LINGKARAN");
        System.out.println("1. Luas Lingkaran, 2. Keliling Lingakaran");
        System.out.println("Silahkan pilih 1/2");
        int segitiga = scanner.nextInt();

        if (segitiga == 1){
            System.out.println("Menghitung luas Lingakaran");
        } 
        else if (segitiga == 2){
            System.out.println("Menghitung Keliling Lingakaran");
        }
        else {
            System.out.println("Pilihan anda tidak valid");
        }
    }
}
}
