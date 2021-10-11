public class Main {


    public static void main(String[] args) {

        Atm atm = new Atm();

        Hesap hesap = new Hesap("kalplan", "30745",3000);
        atm.calis(hesap);


        System.out.println("Programdan çıkılıyor");

    }
}
