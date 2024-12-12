package oop.accessmodifier.protect.package3;

public class Perhitungan {
        /*
        * Final
        * */
        //    final int nilai = 5;
        //
        //    void ubahNilai(){
        //        // Kode di bawah akan menampilkan error
        //        nilai = 10;
        //    }

    public static int nilai = 0;

    protected static int getNilai(){
        return nilai;
    }

    Perhitungan() {
        nilai++;
    }
}
