package strukturdasar;

import strukturdasar.kendaraan.Kereta;
import strukturdasar.kendaraan.Mobil;
import strukturdasar.kendaraan.Motor;
import strukturdasar.musik.Gitar;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Gitar.bunyi();

        Mobil.tampilkanJumlahBan();
        Motor.tampilkanJumlahBan();
        Kereta.tampilkanJumlahBan();
    }
}