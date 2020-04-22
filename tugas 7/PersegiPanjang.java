/*
	nama : ilfah sahra
	kelas : B1
	waktu : 16.30
*/

public class PersegiPanjang {
   // Data field PersegiPanjang
   double panjang = 1.0;
   double lebar = 1.0;
   // Konstruktor pertama
   PersegiPanjang() {
   }
   // Konstruktor kedua
   PersegiPanjang(double x) {
      panjang = x;
   }
   // Kondtruktor kedua
   PersegiPanjang(double x, double y) {
      panjang = x;
      lebar = y;
   }
   // Metoda mencari keliling
   double mencariKelilingPP() {
      return 2 * (panjang * lebar);
   }
 
   // Metoda memcari luas
   double mencariLuasPP() {
      return panjang * lebar;
   }
}
package bangun.ruang; 
import bangun.datar.PersegiPanjang;
public class Balok extends PersegiPanjang {
   private double tinggi = 1.0;
   // Accessor data field tinggi
   public double getTinggi() {
      return tinggi;
   }
   // Mutator data field tinggi
   public void setTinggi(double tinggi) {
      this.tinggi = (tinggi > 1) ? tinggi : 1;
   }
   // Mencari volume balok
   public double mencariVolumeB() {
      return mencariLuasPP() * tinggi;
   }
}
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import bangun.ruang.Balok;
 
public class DemoBalok {
   public static void main(String[ ] args) {
      DecimalFormat decimalFormat;
      JTextArea textArea;
      Balok balok;
 
      // Membuat obyek Balok
      balok = new Balok();
 
      decimalFormat = new DecimalFormat("0.00");
      String string = "Menggunakan Kelas Balok\n";
 
      string += "\nPanjang balok : " + decimalFormat.format(balok.getPanjang());
      string += "\nLebar balok : " + decimalFormat.format(balok.getLebar());
      string += "\nTinggi balok : " + decimalFormat.format(balok.getTinggi());
      string += "\nVolume balok : " + decimalFormat.format(balok.mencariVolumeB());
 
      // Memodifikasi panjang dan lebar
      string += "\n\nMemodifikasi panjang = 5 dan lebar = 3";
      balok.setPanjang(5);
      balok.setLebar(3);
      string += "\nPanjang balok : " + decimalFormat.format(balok.getPanjang());
      string += "\nLebar balok : " + decimalFormat.format(balok.getLebar());
      string += "\nTinggi balok : " + decimalFormat.format(balok.getTinggi());
      string += "\nVolume balok : " + decimalFormat.format(balok.mencariVolumeB());
 
      // Membuat obyek JTextArea
      textArea = new JTextArea();
 
      // Menampilkan hasil
      textArea.setText(string);
      JOptionPane.showMessageDialog(null, textArea, "Kelas Balok",
         JOptionPane.INFORMATION_MESSAGE);
 
      // Mengakhiri program berpenampilan GUI
      System.exit(0);
   }
}
