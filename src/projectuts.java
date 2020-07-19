
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author irsyad99
 */
public class projectuts {
    public static void main(String[] args) {
       
        //Nama Pemesan dan Nomor Kursi
        String nama_penumpang, tgl_brangkat;
        
       
       //Java Library Scanner
       Scanner scan = new Scanner(System.in);
       for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.print("Masukkan Nama Penumpang : ");
        nama_penumpang = scan.nextLine();
        System.out.print("Masukkan Tanggat Keberangkatan : ");
        tgl_brangkat = scan.nextLine();
        //Header Tiket Bus
        System.out.println("======================================");
        System.out.println("|           APLIKASI PEMESANAN       |");
        System.out.println("|               TIKET BUS            |");
        System.out.println("======================================");
        System.out.println("|o JURUSAN         | HARGA           |");
        System.out.println("|1 Mjk - Sby       |   Rp 5.000      |");
        System.out.println("|2 Mjk - Mlg       |   Rp 10.000     |");
        System.out.println("|3 Mjk - Kdr       |   Rp 12.000     |");
        System.out.println("|4 Mjk - Jkt       |   Rp 100.000    |");
        System.out.println("|5 Mjk - Bdg       |   Rp 25.000     |");
        System.out.println("======================================");
        
        
        //Tanggal
        String months[] = {
         "Januari", "Februari", "Maret", "April",
        "Mei", "Juni", "Juli", "Agustus",
        "September", "Oktober", "November", "December"};
        int year;
        
        GregorianCalendar gcalendar = new GregorianCalendar();
        
        //Pembayaran & kembalian
        int bayar, kembalian;
        //Harga awal
        int harga  = 0;
        //Harga Per-Item Menu
        int m1 = 5000, m2 = 10000, m3 = 12000, m4 = 100000, m5 = 25000;
        String pilih = null;
        
        //Variable Menu
        int mnNomor = 0, mnJumlah = 0;
        
        
        
        
    
        //Input pilihan jurusan
        System.out.print("Pilih Nomor Tiket Jurusan yang akan di pesan : ");
        mnNomor = scan.nextInt();
        System.out.print("Masukkan Jumlah Tiket Pesanan : ");
        mnJumlah = scan.nextInt();
        System.out.println("_____________________________________");
        
            switch (mnNomor) {
                case 1:
                    //jika di pilih nomor satu, yang akan muncul adalah jurusan Mjk - Sby, dan hargan yang  harus di bayar pada int m1.
                    pilih = " Mjk - Sby";
                    System.out.println("Pilihan anda nomor " +mnNomor + " Jurusan" + pilih);
                    harga = harga + m1 * mnJumlah;
                    break;
                case 2:
                    //jika di pilih nomor dua, yang akan muncul adalah jurusan Mjk - Mlg, dan hargan yang  harus di bayar pada int m2.
                    pilih = " Mjk - Mlg";
                    System.out.println("Pilihan anda nomor " +mnNomor + " Jurusan" + pilih);
                    harga = harga + m2 * mnJumlah;
                    break;
                case 3:
                    //jika di pilih nomor tiga, yang akan muncul adalah jurusan Mjk - Kdr, dan hargan yang  harus di bayar pada int m3.
                    pilih = " Mjk - Kdr";
                    System.out.println("Pilihan anda nomor " +mnNomor + " Jurusan" + pilih);
                    harga = harga + m3 * mnJumlah;
                    break;
                case 4:
                    //jika di pilih nomor empat, yang akan muncul adalah jurusan Mjk - Jkt, dan hargan yang  harus di bayar pada int m4.
                    pilih = " Mjk - Jkt";
                    System.out.println("Pilihan anda nomor " +mnNomor + " Jurusan" + pilih);
                    harga = harga + m4 * mnJumlah;
                    break;
                case 5:
                    //jika di pilih nomor lima, yang akan muncul adalah jurusan Mjk - Bdg, dan hargan yang  harus di bayar pada int m5.
                    pilih = " Mjk - Bdg";
                    System.out.println("Pilihan anda nomor " +mnNomor + " Jurusan" + pilih);
                    harga = harga + m5 * mnJumlah;
                    break;
                default:
                    System.out.println("Nomor Jurusan yang dipilih tidak ada pada daftar di atas.");
                    break;
            }
            
            System.out.println("Total Yang harus anda bayar = Rp."+harga);
            System.out.print("Masukkan Jumlah Uang : ");
            bayar = scan.nextInt();
            kembalian = bayar-harga;

            System.out.println("======================================");
            System.out.println("|           APLIKASI PEMESANAN       |");
            System.out.println("|               TIKET BUS            |");
            System.out.print("||        "+gcalendar.get(Calendar.DATE));
            System.out.print("-"+ months[gcalendar.get(Calendar.MONTH)]);
            System.out.print("-"+gcalendar.get(Calendar.YEAR)+", ");
            System.out.print(gcalendar.get(Calendar.HOUR) + ":");
            System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
            System.out.println(gcalendar.get(Calendar.SECOND)+"      ||");
            System.out.println("======================================");
            System.out.println("Nama Penumpang : "+nama_penumpang);
            System.out.println("Tanggat Brangkat : "+tgl_brangkat);
            System.out.println("--------------------------------------");
            System.out.println("Jurusan Tiket Anda :                        ");
            System.out.println(" " + pilih +"   " + "X"+mnJumlah +"   " + "Rp"+ harga);
            System.out.println("--------------------------------------");
            System.out.println("Total                " + "Rp" + harga);
            System.out.println("Jumlah Uang          " + "Rp" + bayar);
            System.out.println("Kembalian            " + "Rp" + kembalian);
            System.out.println("======================================");
            System.out.println("||            Terima Kasih           ||");
            System.out.println("||        Selamat Sampai Tujuan      ||");
            System.out.println("======================================");

            
            System.out.print("Apakah anda ingin Memesan tiket Lagi? [Y/T] : ");
            i = scan.next();
            
        }
        
        
    }
}
