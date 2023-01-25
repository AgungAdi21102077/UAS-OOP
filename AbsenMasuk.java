
package com.mycompany.absensidosen;

/**
 *
 * @author Acer
 */
public class AbsenMasuk extends Absensi {
    private String nip,hari, nama,jnskel,tgl,jam;
    
    
    public void Settgl(String Tgl){
        this.tgl = Tgl;
    }
    public void Sethari(String Hari){
        this.hari = Hari;
    }
    public void Setjam(String Jam){
        this.jam = Jam;
    }    
    public void Setnama(String Nama){
        this.nama = Nama;
    }
    public void Setnip(String Nip){
        this.nip = Nip;
    }
    public void Setjnskel(String Jnskel){
        this.jnskel = Jnskel;
    }
    public String Gettgl(){
        return this.tgl;
    }
    public String Gethari(){
        return this.hari;
    }
     public String Getjam(){
        return this.jam;
    }
     public String Getnama(){
        return this.nama;
    }
     public String Getjnskel(){
        return this.jnskel;
    }
    public String Getnip(){
        return this.nip;
    
    }
}