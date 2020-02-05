public class Mahasiswa {
    String nama;
    String NIM;
    double IP;
    public Mahasiswa (String nmMHS, String nimMHS, double ipMHS){
        nama = nmMHS;
        NIM = nimMHS;
        IP = ipMHS;
    }
    public void PrintData(){
        System.out.println (" Nama : "+this.nama);
        System.out.println (" NIM  : "+this.NIM);
        System.out.println (" IP   : "+this.IP);
        System.out.println (" ");
    }
    public void UbahNama (String nwNama){
        nama = nwNama;
    }
    public String GetNama (){
        return nama;
    }
}
