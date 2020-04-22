/*
	nama : ilfah sahra
	kelas : B1
	waktu : 16.30
*/


abstract public class Mobil implements PropertiInM{
 abstract public void injakPedalGas(); 
public void injakRem(){ 
 System.out.println("Mobil berhenti!"); 
 }
 } 
class Kijang extends Mobil{
 public void injakPedalGas(){ 
System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam..."); 
 } 
 
@Override public int berukuran(int ukuran) {  
// TODO Auto-generated method 
stub return ukuran;  
} 
 
@Override public int berkekuatan(int kekuatan)
 { 
 // TODO Auto-generated method 
stub return kekuatan; 
 }
 } 
class BMW extends Mobil {  
public void injakPedalGas(){
 System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam..."); 
 } 
 
@Override  public int berukuran(int ukuran) {  
// TODO Auto-generated method stub return ukuran;
  } 
 
@Override public int berkekuatan(int kekuatan) { 
// TODO Auto-generated method 
stub return kekuatan;  } 
} 




interface PropertiOutM { 
public String tipeMobil(String tipe); 
public int nomorPlat(int no);
 } interface PropertiInM
 {
public int berukuran(int ukuran); 
public int berkekuatan(int kekuatan); 
 } 
public class TestMobil { 
 public static void main(String[] args){ 
Mobil mobil = new Mobil()
{
 public void injakPedalGas(){ 
 System.out.println("Mobil berjalan..."); 
} 
@Override public
 int berukuran(int ukuran) {  
// TODO Auto-generated method stub return ukuran*10; 
 } 
 
@Override  public
 int berkekuatan(int kekuatan) { 
 // TODO Auto-generated method stub return kekuatan*10; 
 } 
}; 


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
 
} 
} 





import java.io.*; 
import java.util.Scanner; 
 
//deklarasi class utama 
 public class BookStore { 
 
public static void main(String[] args){  
//deklarasi variablel
 int menu, choice=0; 
 String read; 
BufferedWriter outs;
 BufferedReader ins;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
Scanner input = new Scanner(System.in);

System.out.println(" Memasukkan menu ");
 System.out.println(" 1. Tambah buku "); 
 System.out.println(" 2. Tampil Daftar Book ");
 System.out.print("Pilih menu: ");  
menu = input.nextInt();


switch(menu){ 
 //pilih 1
 case 1: 
 while(choice != 2){
 try{
 System.out.println("");  
System.out.println("Masukkan Data buku"); 
System.out.print("Judul: "); 
String title = br.readLine();  
System.out.print("Pengarang: "); 
String writer = br.readLine();
 System.out.print("Tahun: "); 
String year = br.readLine(); 
try{

outs = new BufferedWriter(new FileWriter("PenjualanBuku.txt",true));
  outs.write("Judul " + title + " ditulis oleh " + writer + " pada tahun " + year + "."); 
outs.newLine(); 
outs.close(); 
}catch(IOException e){ 
System.out.println("Ada masalah ditemukan: " + e);
 } 

}catch(IOException e){
 System.out.println( "Ada masalah ditemukan: " + e); 
 } 
System.out.print("Masukan buku yang lain? (1. Ya 2. Tidak) :"); 
choice = input.nextInt(); 
 } 
break;

 ins = new BufferedReader(new FileReader("PenjualanBuku.txt"));
 while((read = ins.readLine()) != null){ 
System.out.println(read); 
read+=read+"\n"; 

}
 ins.close(); 
}catch(IOException e){
 System.out.println("Ada masalah ditemukan: " + e);
 } 
 } 
}
 } 


 