public class Main {
    public static void main(String[] args) {
             Guru guru1 = new Guru();

        guru1.setNamaGuru("Muhammad Ustman M, S. Kom.");
        guru1.setNIP(11111111);
        guru1.setNUPTK(22222222);
        guru1.setPendidikan("S1");
        guru1.setKontak(33333333);

        System.out.println("Nama Guru           : " + guru1.getNamaGuru());
        System.out.println("NIP                 : " + guru1.getNIP());
        System.out.println("NUPTK               : " + guru1.getNUPTK());
        System.out.println("Pendidikan terakhir : " + guru1.getPendidikan());
        System.out.println("Nomor telfon        : " + guru1.getKontak());
        }
}
