

package com.mycompany.absensidosen;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nim
 */
public class AbsensiDosen {

    public static void main(String[] args) {
        String pil="";
        String ulang="ya";
        String hari,nama,jnskel, nip, jam, tgl;
        
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        
        while("ya".equals(ulang)){
        System.out.println("---------------------------------------------------");
        System.out.println("                  Absensi Dosen ");
        System.out.println("---------------------------------------------------");
        System.out.println("1. Absensi Masuk");
        System.out.println("2. Absensi Pulang");
        System.out.println("3. Selesai");
        System.out.println("");
        System.out.print("pilihan: ");
        try{
            pil = dtIN.readLine();
        }catch(IOException e){
            System.out.println("Terjadi kendala");
        }
        switch(pil){
        case "1":
            System.out.println("Absensi Masuk");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("Input Nip Anda: ");
                try{
                    nip = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                System.out.print("Input Nama Anda : ");
                try{
                    nama = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                System.out.print("Input Jenis Kelamin : ");
                try{
                    jnskel = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                System.out.print("Input Hari : ");
                try{
                    hari = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                 System.out.print("Input Tanggal/Bulan/Tahun Absen : ");
                try{
                    tgl = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                System.out.print("Input Jam Masuk : ");
                try{
                    jam = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                    ulang="tidak";
                }
                System.out.println("=============================");
                System.out.println("  Absensi Masuk Tersimpan");
                System.out.println("=============================");
                break;
        case "2":
                System.out.println("Absensi Pulang");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.print("Input Nip Anda: ");
                try{
                    nip = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                System.out.print("Input Nama Anda : ");
                try{
                    nama = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                System.out.print("Input Jenis Kelamin : ");
                try{
                    jnskel = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                System.out.print("Input Hari : ");
                try{
                    hari = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                 System.out.print("Input Tanggal/Bulan/Tahun Absen : ");
                try{
                    tgl = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");
                }
                System.out.print("Input Jam Pulang : ");
                try{
                    jam = dtIN.readLine();
                }catch(IOException e){
                    System.out.println("Terjadi kendala");    
                }
                System.out.println("=============================");
                System.out.println("  Absensi Pulang Tersimpan");
                System.out.println("=============================");
               
        case "3":
                System.out.println("");
                System.out.println(" Terimakasi Semangat Bekerja Kembali");
                System.out.println("");
                ulang="tidak";
                break;
            default:
                System.out.println("Pilihan anda tidak ada di daftar, silahkan pilih 1/2/3");
                break;
               
        }
        }
    }
}