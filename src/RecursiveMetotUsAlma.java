import java.util.Scanner;

/*
    @author Zeki AYNAL
    Girilen sayi 0 dan büyük tamsayı olduğu referans alındı.
    Girilen uslu sayi 0 dan büyük tamsayı olduğu referans alındı.
    Bu projenin amacı recursive metotların kullanımını göstermektir.
*/
public class RecursiveMetotUsAlma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int sayi = scanner.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int UsSayisi = scanner.nextInt();
        System.out.println(SayininUssunuAl(sayi, UsSayisi));

    }

    public static int SayininUssunuAl(int sayi,int sayininUssu){

        if (sayininUssu > 0) {
            return sayi*SayininUssunuAl(sayi,sayininUssu-1);
        }
        else {
            return 1;
        }

    }
}
