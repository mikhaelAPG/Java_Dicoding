package casting;

public class Main {
    public static void main(String[] args) {
        //        double a = 3.14;
        //        String hasil = String.valueOf(a);
        //        System.out.println(hasil);

        Kucing anggora = new Kucing();

        Hewan hewan = anggora; //secara implisit upcasting
        hewan = (Hewan) anggora; //secara explisit melakukan casting dari subclass ke superclass

        Hewan hewan2 = new Kucing();
        ((Kucing) hewan2).meow(); //downcast hewan ke kucing, casting dari superclass ke subclass
    }
}
