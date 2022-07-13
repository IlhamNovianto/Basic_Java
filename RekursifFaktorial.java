package rekursiffaktorial;

import java.util.Scanner;

public class RekursifFaktorial {

    public static void main(String[] args) {
        Scanner saya = new Scanner(System.in);
        
        int n = saya.nextInt();
        System.out.print("Masukan angka : ");
        int hasil = faktorial(n);
        System.out.println(hasil + " hasil rekursif ");
        
        int hasilfaktor = faktorialBiasa(n);
        System.out.println(hasilfaktor + " hasil faktotrial biasa ");
    }
    
     public static int faktorial(int angka){
        int hasil;
        if(angka == 1){
            hasil = 1;
        }
        else{
             hasil = angka * faktorial(angka- 1);
        }
        return hasil;
    }
     
     public static int faktorialBiasa(int angka){
        int hasil;
        hasil = 1;
      for(int i = angka; i > 1; i--){
          hasil = hasil * angka;
          System.out.println ("hasil dari hasil "+ hasil);
          angka--;
       }
        return hasil;
     }
}
