/*
	nama : ilfah sahra
	kelas : B1
	waktu : 16.30
*/


public interface InterfaceBahasaProgram {
    public void fungsi();
    public void methode();    
}
public class Java implements InterfaceBahasaProgram{
    @Override
    public void fungsi() {
        System.out.println("Fungsi java");
    }
    @Override
    public void methode() {
        System.out.println("Methode java");
    }
}
public class TurboC implements InterfaceBahasaProgram{
    @Override
    public void fungsi() {
        System.out.println("Fungsi Turbo C");
    }

    @Override
    public void methode() {
        System.out.println("Methode Turbo C");
    }
}
public class Main {
    public static void main(String[] args){
     
        InterfaceBahasaProgram bahasaJava = new Java();
        bahasaJava.fungsi();  //Fungsi java
        bahasaJava.methode();  //Methode java
        
        InterfaceBahasaProgram bahasaC = new TurboC();
        bahasaC.fungsi();   //Fungsi Turbo C
        bahasaC.methode();  //Methode Turbo C
    }
}


