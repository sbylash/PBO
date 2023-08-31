package setrikaDemo;

public class Setrika {

    private String merek;
    private int suhu;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void tambahSuhu(int increment) {
        suhu = suhu + increment;
    }

    public void kurangSuhu(int decrement) {
        suhu = suhu - decrement;
    }

    public void cetakInformasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Suhu: " + suhu);
    }

}