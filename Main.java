package com.tutorial;

class mahasiswa {
    String nama;
    String nim;
    String prodi;
}

public class Main {
   public static void main(String[] args) {
      // instansiasi objek dari class Mahasiswa
      mahasiswa mhs1 = new mahasiswa(); // proses instansiasi

      //memberi inisisasi pada objek baru
      mhs1.nama = "sola";
      mhs1.nim = "557858757";
      mhs1.prodi = "teknik ";

      System.out.println("Nama :"+mhs1.nama);
      System.out.println("NIM :"+mhs1.nim);
      System.out.println("Prodi :"+mhs1.prodi);
   } 
}
