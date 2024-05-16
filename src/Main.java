import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            int i = 1;
            while (true) {
                System.out.print("Masukkan nama " + i + " : ");
                String input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                }

                if (input.equalsIgnoreCase("selesai")) {
                    break;
                }

                daftarMahasiswa.add(input);
                i++;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nDaftar mahasiswa yang Diinputkan:");
        for (String nama : daftarMahasiswa) {
            System.out.println("- " + nama);
        }
    }
}