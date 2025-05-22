class BangunRuang {
    public double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public double hitungVolume(double  panjang, double  lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }
}

public class Ba {
    public static void main(String[] args) {
        BangunRuang br = new BangunRuang();

        System.out.println("Volume Kubus: " + br.hitungVolume(4));
        System.out.println("Volume Balok: " + br.hitungVolume(4, 5, 6));
    }
}