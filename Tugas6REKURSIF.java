package tugas6rekursif;

import java.util.Scanner;

public class Tugas6REKURSIF {

  
    public static void main(String[] args) {
        
   
        Scanner input = new Scanner(System.in);
        System.out.print("Berikan batas deret fibbonaci: ");
        int BatasAngka, a, i;
        BatasAngka = input.nextInt();
    //menampilkan dari{1,2,3,4 dst} sesuai dengan inputan batas angka, jika di mulai dari 0
    // maka pertambahan nya(0+1= 1, 1+1= 2, 1+2=3, 2+3=5 dst ) hasilnya seperti {0,1,1,2,3,5,8} 
           for(i=0; i<=BatasAngka; i++)
           {
           //memanggil fungsi fibbo(i) = menampilkan hasil yang sudah di olah pada fungsi 
           //fibbo tadi
        a = Fibbo(i);
        //menampilkan hasil return.
        System.out.print(a+ " ");
        
           }  
    }
    
    public static int Fibbo(int n){
        
        int fibo;
//menampilkan jika angka nol, karna for berawal dari angka 1, maka langsung di tampilkan 
//dari angka {1,1,2,3} jika tidak {0,1,1,2,3}. jika di hapus dapat menyebabkan overflow karna
//angka yang di tampilkan tidak lagi sesuai dengan yang dimasukan/tidak pernah ada habisnya.
// sehingga fungsi akan masuk ke dalam else yang berisi penambahan antara N(angka masukan atau deret masukan).
// penambahan dilakukan dr 0(0+1, 1+1, 1+2, 2+3, dst), maka jika fungsi return 0, di hapus maka akan overflow.
        if(n==0){
            return 0;
        }
        //sama seperti di atas fungsinya menampilkan (0+1, 1+1)
        if(n==1){
            return(1);
        }
        //fungsi else di bawah sangat lah penting karna akan menjumlah angka yang sudah ada, dan akan di tambah
        //ke baris selanjutnya hingga baris deret sama seperti masukan, logikanya hasil ditambah hasil akhir dst.
        else{
            fibo = Fibbo(n-1) + Fibbo(n-2);
        }                          
        return fibo;
        
    }
     
}