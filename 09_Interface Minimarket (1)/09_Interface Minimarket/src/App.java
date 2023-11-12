public class App {
    public static void main(String[] args) throws Exception {
        Member nana = new MemberSilver();
        nana.hitungTotalBayar(800000); 
        nana.getPoin(); 
        ((MemberSilver)nana).hitungOngkir(9.0); 


        Member lala = new MemberReguler();
        ((MemberReguler)lala).hitungTotalBayar(5000000);
        lala.hitungTotalBayar(900000); 
        lala.getPoin();  
       
        // Menampilkan properti yang diperbarui
        System.out.println("nana Total Bayar: " + nana.totalBayar);
        System.out.println("nana Poin: " + nana.getPoin());
        System.out.println("nana Ongkir: " + ((MemberSilver)nana).ongkir);

        System.out.println("\nlala Total Bayar: " + lala.totalBayar);
        System.out.println("lala Poin: " + lala.getPoin());
    }
}
