import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Menghapus spasi dan mengubah input menjadi huruf kecil
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Memanggil metode untuk mengecek palindrom
        if (isPalindrom(cleanedInput)) {
            System.out.println("'" + input + "' kata tersebut adalah palindrom.");
        } else {
            System.out.println("'" + input + "' kata tersebut bukan palindrom.");
        }

        scanner.close();
    }

    // Metode untuk mengecek apakah suatu kata adalah palindrom
    private static boolean isPalindrom(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
