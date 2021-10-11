import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Atm {

    public void calis(Hesap hesap) {


        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza hoşgeldiniz");

        System.out.println("**************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("**************************");

        int giris_hakki = 3;


        while(true){

            if(login.login(hesap)) {
                System.out.println("Giriş başarılı" );
                break;
            }

            else{

                giris_hakki--;
                System.out.println("Giriş başarısız Kalan giriş hakkı " + giris_hakki);
            }

            if(giris_hakki == 0){

                System.out.println("Giriş hakkınız bitti");
                return;
            }


        }

        System.out.println("************************************************");
        String islemler = "1. Bakiye görüntüle \n"
                +         "2. Para yatırma     \n"
                +         "3. Para çekme       \n"
                +         "Çıkış için q'ya basın\n";

        System.out.println(islemler);
        System.out.println("*************************************************");


        while(true){
            System.out.println("İşlemi seçiniz");
            String islem = scanner.nextLine();

            if(islem.equals("q"))
                break;

            else if (islem.equals("1")){
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
            }

            else if (islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutarı giriniz");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);

            }

            else if (islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutarı giriniz");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraÇek(tutar);
            }

            else
                System.out.println("Geçersiz işlem");


        }
    }
}
