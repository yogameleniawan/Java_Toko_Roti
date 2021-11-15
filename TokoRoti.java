import java.util.Scanner;


public class TokoRoti {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String jenisRoti;
       String jenisLapis;
       String rasaLapis;
       int harga = 0;
       int harga1 = 0;
       int totalBayar = 0;
       System.out.println("================================");
       System.out.println("SELAMAT DATANG DI TOKO ROTI");
       System.out.println("Pilih jenis roti pertama");
       System.out.println("================================");
       System.out.println("Coklat");
       System.out.println("Pandan");
       System.out.println("Strawberry");
       System.out.println("Vanila");
       System.out.println("Keju");
       System.out.println("================================");
       System.out.print("Tulis disini ");
       jenisRoti = sc.nextLine();
       if(jenisRoti.equalsIgnoreCase("coklat")){
           harga = 10000;
       } else if(jenisRoti.equalsIgnoreCase("pandan")){
           harga = 8000;
       } else if(jenisRoti.equalsIgnoreCase("strawberry")){
           harga = 13000;
       } else if(jenisRoti.equalsIgnoreCase("vanila")){
           harga = 9000;
       } else if(jenisRoti.equalsIgnoreCase("keju")){
           harga = 15000;
       } 
       System.out.println("Pilih jenis roti kedua");
       System.out.println("================================");
       System.out.println("Coklat");
       System.out.println("Pandan");
       System.out.println("Strawberry");
       System.out.println("Vanila");
       System.out.println("Keju");
       System.out.println("================================");
       System.out.print("Tulis disini ");
       jenisRoti = sc.nextLine();
       if(jenisRoti.equalsIgnoreCase("coklat")){
           harga1 = 10000;
       } else if(jenisRoti.equalsIgnoreCase("pandan")){
           harga1 = 8000;
       } else if(jenisRoti.equalsIgnoreCase("strawberry")){
           harga1 = 13000;
       } else if(jenisRoti.equalsIgnoreCase("vanila")){
           harga1 = 9000;
       } else if(jenisRoti.equalsIgnoreCase("keju")){
           harga1 = 15000;
       } 
       int harga2 = harga+harga1;
        System.out.println("================================");
        if (harga2>25000){
            System.out.println("Anda mendapatkan toping");
            System.out.println("Pilih jenis roti : Lapis/Tidak");
            jenisLapis = sc.nextLine();
            if(jenisLapis.equalsIgnoreCase("lapis")){
                System.out.println("Pilih mau roti lapis varian apa?");
                System.out.println("a. Keju + Pandan");
                System.out.println("b. Keju + Vanila");
                System.out.println("c. Keju + Coklat");
                System.out.println("d. Keju + Strawberi");
                System.out.println("Pilih : a/b/c/d");
                rasaLapis = sc.nextLine();
                if(rasaLapis.equalsIgnoreCase("a")){
                    totalBayar = harga2 + 5000;
                } else{
                    totalBayar = harga2 + 1000;
                } System.out.println("Harga yang anda bayar");
                System.out.println("Rp. "+totalBayar);
            } else if(jenisLapis.equalsIgnoreCase("tidak")){
                System.out.println("Harga yang anda bayar ");
                System.out.println("Rp. "+harga2);
            }
        } else{
            System.out.println("Anda mendapatkan meses");
            System.out.println("Harga yang anda bayar ");
            System.out.println("Rp. "+harga2);
        }
    }
    
}
