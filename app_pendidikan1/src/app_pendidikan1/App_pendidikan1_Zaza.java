/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app_pendidikan1;

/**
 *
 * @author Lenovo
 */
public class App_pendidikan1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Buat objek dari kelas lainnya
        MataPelajaran jarkom = new MataPelajaran ("Jaringan Komputer","MP001");
        MataPelajaran pbo = new MataPelajaran ("PBO","MP002");
        RuangUjian ruangjarkom = new RuangUjian ("R101",40);
        RuangUjian ruangpbo = new RuangUjian ("R102",30);
        Jadwal jadwaljarkom = new Jadwal ("Senin","10:00 - 12:00");
        Jadwal jadwalpbo = new Jadwal ("Selasa","09:30 - 11:30");
        
        //Buat Penjadwalan 
        Penjadwalan penjadwalan = new Penjadwalan (jarkom,pbo,ruangjarkom,ruangpbo,jadwaljarkom,jadwalpbo);
        
        //Tampilan informasi penjadwalan
        penjadwalan.tampilkanDetailPenjadwalan();
    }
}

//MataPelajaran.java
class MataPelajaran {
    private String nama;
    private String kode;
    
    public MataPelajaran(String nama,String kode){
        this.nama = nama;
        this.kode = kode;
    }
    
    public String getNama(){
        return nama;
    }
    public String getKode(){
        return kode;
    }
}

//RuangUji.java
class RuangUjian {
    private String namaRuang;
    private int kapasitas;
    
    public RuangUjian(String namaRuang,int kapasitas){
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
    }
    
    public String getNamaRuang(){
        return namaRuang;
    }
    public int getKapasitas(){
        return kapasitas;
    }
}

//Jadwal.java
class Jadwal{
    private String hari;
    private String waktu;
    
    public Jadwal(String hari,String waktu){
        this.hari = hari;
        this.waktu = waktu;
    }
    
    public String getHari(){
        return hari;
    }
    public String getWaktu(){
        return waktu;
    }
}

//Penjadwalan.java
class Penjadwalan{
    private MataPelajaran jarkom;
    private MataPelajaran pbo;
    private RuangUjian ruangjarkom;
    private RuangUjian ruangpbo;
    private Jadwal jadwaljarkom;
    private Jadwal jadwalpbo;
    
    public Penjadwalan(MataPelajaran jarkom, MataPelajaran pbo, RuangUjian ruangjarkom, RuangUjian ruangpbo, Jadwal jadwaljarkom, Jadwal jadwalpbo){
        this.jarkom = jarkom;
        this.pbo = pbo;
        this.ruangjarkom = ruangjarkom;
        this.ruangpbo = ruangpbo;
        this.jadwaljarkom = jadwaljarkom;
        this.jadwalpbo = jadwalpbo;
    }
    
    public void tampilkanDetailPenjadwalan(){
        System.out.println("---JADWAL UJIAN---");
        System.out.println("Mata Pelajaran: " + jarkom.getNama() + " (" + jarkom.getKode() + ")");
        System.out.println("Ruang: " + ruangjarkom.getNamaRuang() + " (Kapasitas: " + ruangjarkom.getKapasitas() + ")");
        System.out.println("Hari: " + jadwaljarkom.getHari());
        System.out.println("Waktu: " + jadwaljarkom.getWaktu());
        System.out.println("");
        System.out.println("");
        System.out.println("---JADWAL UJIAN---");
        System.out.println("Mata Pelajaran: " + pbo.getNama() + " (" + pbo.getKode() + ")");
        System.out.println("Ruang: " + ruangpbo.getNamaRuang() + " (Kapasitas: " + ruangpbo.getKapasitas() + ")");
        System.out.println("Hari: " + jadwalpbo.getHari());
        System.out.println("Waktu: " + jadwalpbo.getWaktu());
    }
}