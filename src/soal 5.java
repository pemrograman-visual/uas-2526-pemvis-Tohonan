import java.util.*;
import java.lang.Math;

public class soal 5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, tanggungan, total;
        String nama;
        double iPK, gaji;

        n = Integer.parseInt(input.nextLine());
        for (i = 1; i <= n; i++) {
            nama = input.nextLine();
            iPK = Double.parseDouble(input.nextLine());
            gaji = Double.parseDouble(input.nextLine());
            tanggungan = Integer.parseInt(input.nextLine());
            if (iPK >= 3.0 && gaji <= 3000000 && tanggungan >= 3) {
                System.out.println("Lolos");
            } else {
                System.out.println("Tidak Lolos");
            }
        }
    }
}
