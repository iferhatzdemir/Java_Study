import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String str = generateRandomString() + "|";
        String str2 = generateRandomString();
        System.out.println(str.charAt(9));
        System.out.println(str.length());//uzunluk
        System.out.println(str.concat(str2));//birletirme
        System.out.println(str.startsWith("b"));
        System.out.println(str.endsWith("p"));
        char[] strChar = new char[5];
        str2.getChars(0, 5, strChar, 0);
        System.out.println(strChar);
        System.out.println(str.indexOf("a"));//baştan aramaya başlar
        System.out.println(str.lastIndexOf("a"));//sondan aramaya başlar
        System.out.println(str.replace("|", "-"));//value değişmez çıktı üretir
        System.out.println(str.substring(0, 5));
        String newstr = "   Oğuz Bugün Çok Yakışıklı    ";
        int spaceIndex = newstr.indexOf(" ");
        System.out.println(newstr.substring(0, spaceIndex));
        for (String kelime:newstr.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(newstr.toLowerCase());
        System.out.println(newstr.toUpperCase());
        System.out.println(newstr.trim());
        /*
    charAt(int index): Belirtilen indeksteki karakteri döndürür.
concat(String str): Geçerli diziyle belirtilen diziyi birleştirir ve yeni bir dize oluşturur.
endsWith(String suffix): Dize, belirtilen dizeyle bitiyorsa doğru, aksi takdirde yanlış döndürür.
indexOf(String str): Belirtilen dizinin, geçerli dizideki ilk görünümünün indeksini döndürür.
lastIndexOf(String str): Belirtilen dizinin, geçerli dizideki son görünümünün indeksini döndürür.
length(): Dizinin uzunluğunu döndürür.
replace(char oldChar, char newChar): Geçerli dizideki tüm eski karakterleri, belirtilen yeni karakterlerle değiştirir ve yeni bir dize oluşturur.
startsWith(String prefix): Dize, belirtilen diziyle başlıyorsa doğru, aksi takdirde yanlış döndürür.
substring(int beginIndex): Dizinin, belirtilen indeksten başlayarak sonuna kadar olan bir alt dizisini döndürür.
toLowerCase(): Dizinin tüm karakterlerini küçük harfe dönüştürür ve yeni bir dize oluşturur.
toUpperCase(): Dizinin tüm karakterlerini büyük harfe dönüştürür ve yeni bir dize oluşturur.
trim(): Dizinin başındaki ve sonundaki boşlukları siler ve yeni bir dize oluşturur.*/
    }


    private static final String CHAR_LIST =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int RANDOM_STRING_LENGTH = 10;

    /**
     * Bu metod, rastgele bir string oluşturur.
     *
     * @return Oluşturulan string
     */
    public static String generateRandomString() {
        StringBuilder randStr = new StringBuilder();
        for (int i = 0; i < RANDOM_STRING_LENGTH; i++) {
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }

    /**
     * Bu metod, 0 ile CHAR_LIST dizisinin uzunluğu arasında bir rastgele sayı döndürür.
     *
     * @return Rastgele sayı
     */
    private static int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }
}