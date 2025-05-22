class Kendaraan {
    public void kecepatan() {
        System.out.println("Kendaraan bergerak");
    }
}

class Mobil extends Kendaraan {
    @Override
    public void kecepatan() {
        System.out.println("Mobil: Kecepatan 100 km/jam");
    }
}

class SepedaMotor extends Kendaraan {
    @Override
    public void kecepatan() {
        System.out.println("Sepeda motor: kecepatan 80 km/jam");
    }
}

public class Ma {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil();
        Kendaraan kendaraan2 = new SepedaMotor();

        kendaraan1.kecepatan();
        kendaraan2.kecepatan();
    }
}