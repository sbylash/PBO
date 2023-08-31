package speakerDemo;

public class Speaker {

    private String merek;
    private int volume;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void tambahVolume(int increment) {
        volume = volume + increment;
    }

    public void kurangVolume(int decrement) {
        volume = volume - decrement;
    }

    public void cetakInformasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Volume: " + volume);
    }
}