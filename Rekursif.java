package rekursif;

public class Rekursif {

    public static void main(String[] args) {
        
        long hasilrekursif = pangkatRekursif(2,4);
        System.out.println(hasilrekursif);
        
        long hasilPangkat = pangkatBiasa(2,4);
        System.out.println(hasilPangkat);
        
    }
    public static int pangkatRekursif(int angka, int pangkat){
        int hasil;
        if(pangkat == 0){
            hasil = 1;
        }
        else{
             hasil = angka * pangkatRekursif(angka, pangkat - 1);
             System.out.print(angka);
        }
        return hasil;
    }
     
    public static int pangkatBiasa(int angka, int pangkat){
    int hasil;
    int i;
    
    hasil = 1;
    for(i = 1; i<=pangkat; i++){
        hasil =hasil * angka;
    }
    return hasil;
    }
}
