import java.util.Scanner;

class progamHadiah {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("===PROGAM HADIAH===");
        System.out.println("Silahkan Pilih Hadiah (A/B/C/D/E/F)");
        char hadiah = input.next().charAt(0);

    switch (hadiah) {

      case 'A':
      case 'a':
        System.out.println("Anda mendaptakan BUKU");
        break;

      case 'B':
      case 'b':
        System.out.println("Anda mendaptakan PAYUNG");
        break;

      case 'C':
      case 'c':
        System.out.println("Anda mendaptakan MOTOR");
        break;

      case 'D':
      case 'd':
        System.out.println("Anda mendaptakan KIPAS ANGIN");
        break;

      case 'E':
      case 'e':
        System.out.println("Anda mendaptakan ZONKK");
        break;

      case 'F':
      case 'f':
        System.out.println("Anda mendaptakan SEPATU");
        break;
      
      default:
        System.out.println("Anda Salah memasukan Pilihan Hadiah : Pilih Hadiah A/B/C/D/E/F");
        break;

    }
  }
}