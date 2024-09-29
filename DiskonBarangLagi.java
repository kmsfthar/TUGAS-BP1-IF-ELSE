package diskonbaranglagi;
import java.util.Scanner;
public class DiskonBarangLagi {
    public static void main(String[] args) {
       //pilihan barang
        int jumlah, harga;
        double diskon, total=0,kembalian;
         Scanner sc= new Scanner(System.in);
          System.out.println("SISTEM PEMBELIAN BARANG");
          System.out.println("=========================");
        System.out.println("1.Sandal [50000] [5%]");
        System.out.println("2.Sepatu [150000][10%]");
        System.out.println("3.Tas [200000] [15%]");
        System.out.println("");
        System.out.println();
//memilih barang
        System.out.print("Pilih barang yang anda inginkan : ");
        int pilih=sc.nextInt();
        switch (pilih){
            case 1:
            harga=50000;
            System.out.print("Jumlah = ");
            jumlah=sc.nextInt();
            total = harga*jumlah;
            System.out.println("Total = "+total);
            diskon=0.05*total;
            System.out.println("Diskon = "+diskon);
            total=total-diskon;
            System.out.println("TOTAL AKHIR = "+total);
                break;
            case 2:
            harga=150000;
            System.out.print("Jumlah = ");
            jumlah=sc.nextInt();
            total = harga*jumlah;
            System.out.println("Total = "+total);
            diskon=0.1*total;
            System.out.println("Diskon = "+diskon);
            total=total-diskon;
            System.out.println("TOTAL AKHIR = "+total);
                break;
            case 3:
            harga=200000;
            System.out.print("Jumlah = ");
            jumlah=sc.nextInt();
            total = harga*jumlah;
            System.out.println("Total = "+total);
            diskon=0.15*total;
            System.out.println("Diskon = "+diskon);
            total=total-diskon;
            System.out.println("TOTAL AKHIR = "+total);
                break;
            default:
                System.out.println("PILIHAN TIDAK TERSEDIA");
                
        }
        System.out.println("");
                System.out.println("=======================");
        //diskon tambahan
        if (total>=100000 && total<=200000){
            System.out.println("DISKON KHUSUS");
            System.out.println("JUMLAH DISKON = 5%");
            diskon = total*0.05;
            System.out.println("Diskon = "+diskon);
            total = total-diskon;
            System.out.println("HARGA AKHIR = "+total);
                    
        }else if (total>200000 && total<=300000){
            System.out.println("DISKON KHUSUS");
            System.out.println("JUMLAH DISKON = 10%");
            diskon = total*0.1;
            System.out.println("Diskon = "+diskon);
            total = total-diskon;
            System.out.println("HARGA AKHIR = "+total);
        }else if (total>300000 && total<=400000){
            System.out.println("DISKON KHUSUS");
            System.out.println("JUMLAH DISKON = 15%");
            diskon = total*0.15;
            System.out.println("Diskon = "+diskon);
            total = total-diskon;
            System.out.println("HARGA AKHIR = "+total);
        }else if (total>400000 && total<=500000){
            System.out.println("DISKON KHUSUS");
            System.out.println("JUMLAH DISKON = 20%");
            diskon = total*0.2;
            System.out.println("Diskon = "+diskon);
            total = total-diskon;
            System.out.println("HARGA AKHIR = "+total);
        }else if (total >500000){
            System.out.println("DISKON KHUSUS");
            System.out.println("JUMLAH DISKON = 25%");
            diskon = total*0.25;
            System.out.println("Diskon = "+diskon);
            total = total-diskon;
            System.out.println("HARGA AKHIR = "+total);
            
            
          
        }
            System.out.println("");
            System.out.println("=======================");
            //pembayaran
            System.out.print("JUMLAH UANG YANG DITERIMA : ");
            double Uang=sc.nextDouble();
           
            if (Uang==total){
                System.out.println("UANG YANG DITERIMA PAS");
            }else if (Uang>total){
                kembalian = Uang-total;
                System.out.println("KEMBALIAN = "+kembalian);
            }
            //transaksi selesai
            System.out.println("");
            System.out.println("TRANSAKSI SELESAI");    
           
        }
       
        

        
    }
