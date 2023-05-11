package nest;

public class Percabangan {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 53000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan anda");
        } else if (uangDiDompet > totalBelanja){
            double angsul = uangDiDompet - totalBelanja;
            System.out.println("Uang cukup, angsul "+ angsul);
        } else {
            System.out.println("Uang pas, selamat menikmati");
        }
    }
}
