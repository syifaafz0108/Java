public class Mahasiswa {

    // Atribut
    String nim;
    String nama;
    int sks;
    double ipk;

    // Constructor
public Mahasiswa(String nim, String nama, int sks, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.sks = sks;
    this.ipk = ipk;
}

    // Method Overloading versi 1 (Hitung IPK)
public void hitungIPKSemester(double nilaiAkhir) {
    this.ipk = (this.ipk + nilaiAkhir) / 2;
}

    // Method Overloading versi 2 (Hitung IPK)
          
public void hitungIPKSemester(double nilaiAkhir, int bobotSks) {
    this.ipk = ((this.ipk * this.sks) + (nilaiAkhir * bobotSks))
        / (this.sks + bobotSks);

 this.sks = this.sks + bobotSks;   
}

    // Method menampilkan data
public void tampilkanData() {
    System.out.println("NIM : " + this.nim);
    System.out.println("Nama : " + this.nama);
    System.out.println("Total SKS : " + this.sks);
    System.out.println("IPK : " + this.ipk);
}

    

}