/*
	nama : ilfah sahra
	kelas : B1
	waktu : 16.30
*/

public abstract class MakhlukHidup {
   public abstract void berdiri ();
   public void oksigen(){
       System.out.println("- butuh Makanan");
       System.out.println("- butuh oksigen");
       System.out.println("- butuh air");
   }     
}
public class Manusia extends MakhlukHidup {
    private String duaKaki;
    public Manusia(String duaKaki){
        this.duaKaki = duaKaki;
    }
    public void berdiri (){
        System.out.println("Manusia berdiri menggunakan :  "+duaKaki);
    }
}
public class Hewan extends MakhlukHidup {
    private String kakiEmpat, kakiDua ;
    public Hewan(String kakiEmpat, String kakiDua){
        this.kakiEmpat = kakiEmpat;
        this.kakiDua   = kakiDua;
    } 
    public void berdiri (){
        System.out.println("Kambing berdiri menggunakan :  " +kakiEmpat);
        System.out.println("Ayam berdiri menggunakan    :  " + kakiDua);
    }    
}
public class Tumbuhan extends MakhlukHidup {
    private String Akar;
    public Tumbuhan (String Akar){
        this.Akar = Akar;
    }
    public void berdiri (){
        System.out.println("Tumbuhan berdiri dengan     :  "+Akar);
    }
}
public class MainMakhlukHidup {
    public void cekMakhlukHidup (MakhlukHidup mHidup){
        mHidup.berdiri();
        mHidup.oksigen();
    }
    public static void main(String[] args) {
        MainMakhlukHidup tMakhlukHidup = new MainMakhlukHidup();       
        tMakhlukHidup.cekMakhlukHidup(new Manusia("Dua Kaki"));       
        
        System.out.println("-----------------------------------------");                              
        tMakhlukHidup.cekMakhlukHidup(new Hewan ("Empat Kaki","Dua Kaki"));
        System.out.println("-----------------------------------------");        
        tMakhlukHidup.cekMakhlukHidup(new Tumbuhan ("Akar")); 
    }
}


