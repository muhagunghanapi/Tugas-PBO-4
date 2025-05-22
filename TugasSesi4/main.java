class Diskon {
    public double hitungDiskon(double harga) {
        return harga * 0.1;
    }

    public double hitungDiskon(double harga, double persentase) {
        return harga * (persentase / 100);
    }

    public double hitungDiskon(double harga, double persentase, int jumlah) {
        return (harga * (persentase / 100)) * jumlah;
    }
}

public class main {
    public static void main(String[] args) {
        Diskon d = new Diskon();
        System.out.println("Diskon untuk harga 10000: " + d.hitungDiskon(10000));
        System.out.println("Diskon untuk harga 10000 dengan persentase 20%: " + d.hitungDiskon(10000, 20));
        System.out.println("Diskon untuk harga 10000 dengan persentase 15% dan jumlah 3: " + d.hitungDiskon(10000, 15, 3));
    }
}