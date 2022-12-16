public class Main {
    public static void main(String[] args) {
        //JAVA case senstive (küçük büyük harfe duyarlı) bir dildir.
        //systems çalışmaz
        int totalStudents; //Javada tam sayılar int anahtar kelimesi ile tanımlanır. camelCase yazımı kullanılır.
        String message="Öğrennci Sayısı : ";// Javada metinsel ifadeler String anahtar kelimesi ile tanımlanır.
        totalStudents=10;
        System.out.println("Öğrenci Sayısı:"+totalStudents);//tanımladığımız totalStudents değişkenini burada çağırarak ekrana basmaktayız.
        System.out.println(message+totalStudents);
        //yukarıda string ve int topladık burada prntln  int bir string olarak görerek metinsel bir toplama işlemi yaptık
        /*
        reusability : tekrar tekrar kulanabilirlik. Bir kez tanımlamadıktan sonra bir çok kullanabilmektir.
        refactoring: kod temizlemek.

         */
    }
}