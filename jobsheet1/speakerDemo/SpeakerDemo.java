package speakerDemo;

public class SpeakerDemo {
    public static void main(String[] args) {
        Speaker s = new Speaker();

        s.setMerek("Sony");
        s.tambahVolume(85);
        System.out.println("Volume awal");
        s.cetakInformasi();
        s.kurangVolume(20);
        System.out.println("Volume setelah dikurangi");
        s.cetakInformasi();

    }
}
