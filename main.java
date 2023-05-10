import java.util.Scanner;

public class main {

    static int sum(int a , int b){
        int result = a +b;
        System.out.println("Toplam : "+ result);
        return  result;
    }

    static int minnus(int a, int b){
        int result = a - b;
        System.out.println("Sonuç" + result);
        return result;


        }
    static int times(int a, int b){
        int result = a * b;
        System.out.println("Sonuç " + result);
        return result;
    }
    static int divided(int a ,int b){
        if (b ==0){
            System.out.println("İkinci Sayı 0'dan farklı olmalı");
            return 0;
        }


        int result = a/b;
        System.out.println("Bölme " + result);
        return result;
    }
    static  int power (int a, int b){
        int result = 1;
        for (int  i=1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b ){
        return  a % b;
    }
    static  void calculate(int a, int b){


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select ;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n";
        System.out.println(menu);
        while (true){
            System.out.println("Bir İşlem Seçiniz : ");
            select= scan.nextInt();
            if(select == 7){
                System.out.println("Birinci Kenarı Giriniz :");
                int a = scan.nextInt();
                System.out.println("İkinci Kenarı Giriniz");
                int b = scan.nextInt();
                System.out.println("Çevresi : " + (2 * (a + b)));
                System.out.println("Alanı : " + (a * b));
                return;
            }
            if (select == 0){
                break;
            }
            System.out.println("İlk Sayı :");
            int a = scan.nextInt();
            System.out.println("İkinci Say :");
            int b = scan.nextInt();
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minnus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı" +power(a,b));
                case 6:
                    System.out.println("Mod İşlemi " + mod(a,b));
                case 7:
                    calculate(a,b);
                    break;
                default:
                    System.out.println("Geçersiz Bir İşlem Girdiniz !");
        }

            }
            System.out.println("Güle Güle !");
    }
}
