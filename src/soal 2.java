import java.util.*;
import java.lang.Math;

public class soal 2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n, sisa, stokAwal, terjual;
        String nama, status;

        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            stokAwal = Integer.parseInt(input.nextLine());
            terjual = Integer.parseInt(input.nextLine());
            sisa = stokAwal - terjual;
            if (sisa > 5) {
                status = "Stok aman";
            } else {
                if (sisa >= 1) {
                    status = "Stok menipis";
                } else {
                    status = "Habis, segera restock!";
                }
            }
            System.out.println(nama);
            System.out.println(stokAwal);
            System.out.println(terjual);
            System.out.println(sisa);
            System.out.println(status);
        }
    }
    
    public static String status(int n, int i, int stokAwal, int terjual, int sisa, String nama) {
        
        return l;
    }
}
