public class Main {
    public static void main(String[] args) {
        int sayi = 0;
        int currentSayi=10;
        int karsilatirmasayisi=8;
        PozitifNrgatif(sayi);
        karsilastir(currentSayi,karsilatirmasayisi);
    }
public  static void PozitifNrgatif(int sayi){
    if (sayi > 0) {
        System.out.println("Pozitif bir sayıdır.");
    } else{
        System.out.println("Sayı negatiftir.");
    }
}
public static void karsilastir(int curSayi, int karSayi){
        if (karSayi>curSayi){
            System.out.println(karSayi+"Sayısı"+curSayi+"Sayısıdan büyüktür");
        } else if (karSayi==curSayi) {
            System.out.println(karSayi+"Sayısı ile"+curSayi+"eşittir");
        }else {
            System.out.println(karSayi+"Sayısı dan"+curSayi+"küçüktür.");
        }
}
}