public class MainAkademik {

    public static void main(String[] args) {

        // Membuat 2 objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa(
            "12046125018",
            "Meicha Heli Aulia",
            20,
            3.80
        );
        
        Mahasiswa mhs2 = new Mahasiswa(
            "12046125007",
            "Keni Cahyani",
            20,
            3.50
        );

         // Menampilkan data sebelum nilai ditambahkan
        System.out.println("=== DATA SEBELUM NILAI DITAMBAHKAN ===");

        System.out.println("\nMahasiswa 1");
        mhs1.tampilkanData();

        System.out.println("\nMahasiswa 2");
        mhs2.tampilkanData();

        // Memanggil overloading versi 1
        mhs1.hitungIPKSemester(3.80);

        // Memanggil overloading versi 2
        mhs2.hitungIPKSemester(3.80, 4);

        // Menampilkan data setelah nilai ditambahkan
        System.out.println("\n=== DATA SESUDAH NILAI DITAMBAHKAN ===");

        System.out.println("\nMahasiswa 1");
        mhs1.tampilkanData();

        System.out.println("\nMahasiswa 2");
        mhs2.tampilkanData();


    }
}