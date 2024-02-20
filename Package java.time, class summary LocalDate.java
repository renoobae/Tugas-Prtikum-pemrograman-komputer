import java.time.LocalDate;

public class javalocaldate {

    public static void main(String[] args) {
        // Mendapatkan tanggal saat ini
        LocalDate currentDate = LocalDate.now();

        // Mendapatkan tahun, bulan, dan hari dari tanggal saat ini
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();

        // Menampilkan output
        System.out.println("Tahun: " + year);
        System.out.println("Bulan: " + month);
        System.out.println("Hari: " + day);
    }
}
