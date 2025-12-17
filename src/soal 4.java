import java.util.*;
import java.lang.Math;

public class soal 4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, totalShift, maxShift, minShift;
        String[] nama = new String[8];
        double rata;
        int[] shift = new int[8];
        String namaMax, namaMin;

        n = Integer.parseInt(input.nextLine());
        totalShift = 0;
        for (i = 1; i <= n; i++) {
            nama[i] = input.nextLine();
            shift[i] = Integer.parseInt(input.nextLine());
            totalShift = totalShift + shift[i];
        }
        maxShift = shift[1];
        minShift = shift[1];
        namaMax = nama[1];
        namaMin = nama[1];
        for (i = 1; i <= n; i++) {
            if (shift[i] > maxShift) {
                maxShift = shift[i];
                namaMax = nama[i];
            }
            if (shift[i] < minShift) {
                minShift = shift[i];
                namaMin = nama[i];
            }
        }
        rata = (double) totalShift / n;
        System.out.println("Daftar Shift:");
        for (i = 1; i <= n; i++) {
            System.out.println(nama[i] + "=" + shift[i]);
        }
        System.out.println("Total Shift = " + totalShift);
        System.out.println("Rata-rata = " + rata);
        System.out.println("Shift Terbanyak = " + namaMax + "[" + maxShift + "]");
        System.out.println("Shift Tersedikit = " + namaMin + "[" + minShift + "]");
        System.out.println("Distribusi Shift tidak merata, beberapa asisten terbebani.");
    }
}
