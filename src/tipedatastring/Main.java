package tipedatastring;

public class Main {
    public static void main(String[] args) {
        //  Contoh sintaks untuk mendeklarasikan sebuah string
        String greeting = "Hello World!";
        System.out.println(greeting);

        // membuat variabel String dari sebuah array character
        char[] dicodingChars = { 'd', 'i', 'c', 'o', 'd', 'i', 'n', 'g' };
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);

        // Mengetahui Panjang String
        String dicoding = "dicoding";
        int length = dicoding.length();
        System.out.println(length);

        // Mengambil Karakter Dari Sebuah String
        String dicoding2 = "dicoding";
        char result = dicoding2.charAt(7);
        System.out.println(result);
    }
}
