/*
	nama : ilfah sahra
	kelas : B1
	waktu : 16.30
*/


public class TestMobil {  
Mobil mobil = new Mobil(){ public void injakPedalGas(){ 
 System.out.println("Mobil berjalan..."); 
} 
 
@Override public int berukuran(int ukuran) { 
 
method stub return ukuran*10;  
} 
 
@Override  public int berkekuatan(int kekuatan) {  

method stub return kekuatan*10;  
} };
Kijang kijang = new Kijang(); 
 
BMW bmw = new BMW();
mobil.injakPedalGas();  
System.out.println("Kekuatan BMW: "+ mobil.berkekuatan(100)+"\nBerukuran : "+ mobil.berukuran(100)); 
mobil = kijang;
 mobil.injakPedalGas(); 
System.out.println("Kekuatan Kijang: "+ mobil.berkekuatan(150)+"\nBerukuran : "+ mobil.berukuran(100));

mobil = bmw;
mobil.injakPedalGas(); 

System.out.println("Kekuatan BMW: "+ mobil.berkekuatan(150)+"\nBerukuran :  "+ mobil.berukuran(100)); 
 
 
} } 