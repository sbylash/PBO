package setrikaDemo;

public class SetrikaDemo {
    public static void main(String[] args) {
        Setrika s = new Setrika();

        s.setMerek("Philips");
        s.tambahSuhu(205);
        System.out.println("Suhu awal");
        s.cetakInformasi();
        s.kurangSuhu(15);
        System.out.println("Suhu setelah dikurangi");
        s.cetakInformasi();

    }
}
