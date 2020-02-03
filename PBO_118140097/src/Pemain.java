import java.util.Scanner;

public class Pemain {
    String chara;
    String tipe;
    String weapon;
    int HP = 100;
    int armor;
    int helmet;

    public void printData(){
        Scanner APA = new Scanner(System.in);
        System.out.print ("Nama Character : ");
        chara = APA.nextLine();
        System.out.print ("Tipe Character : ");
        tipe = APA.nextLine();
        System.out.println ("Health Point : "+this.HP);
        System.out.print("Senjata Yang Digunakan : ");
        weapon = APA.nextLine();
    }

    public void explore(){
        if (this.armor == 0 && this.helmet == 0) {
            System.out.println (this.chara + " Sedang menjelajahi sebuah dunia Monster Hunter's");
        }else if (this.armor == 100 && this.helmet == 3){
            System.out.println (this.chara+" Mendapatkan ARMOR VEST dan HELMET");
            System.out.println ( "KARAKTER "+this.chara+" SUDAH MENCAPAI MAXIMUM, MARI MENCARI MONSTER");
        }else if (this.armor == 0 && this.HP == 0){
            System.out.println ( "GAME OVER !!");
        }
    }
    public void run(){
        if(this.HP <= 100){
            System.out.println (this.chara+ " Mulai mencari seekor monster, Karena "+this.chara+" kelelahan, HP-nya berkurang menjadi "+this.HP);
            System.out.println (this.chara+ " Menemukan seekor monster Naga yang besar di dalam hutan");
        }
    }

    public void fight() {
        if (this.HP <= 100 && this.HP > 0) {
            System.out.println("Anda menembak monster Naga dengan " + this.weapon + " tetapi anda kalah dalam pertempuran sehingga HP anda 0");
        } else if (this.HP == 0) {
            System.out.println("GAME OVER !!");
        }
    }
    public static void main(String[] args) {
        Pemain Deo = new Pemain();
        Deo.armor = 0;
        Deo.helmet= 0;
        Deo.printData();
        Deo.explore();
        Deo.armor=100;
        Deo.helmet=3;
        Deo.explore();
        Deo.HP = 96;
        Deo.run();
        Deo.fight();
        Deo.HP = 0;
        Deo.fight();

    }

}
