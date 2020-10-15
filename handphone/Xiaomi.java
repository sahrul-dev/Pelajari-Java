
// package handphone;

//Subclass

public class Xiaomi extends Handphone{

    public static void main(String[] args) {
       
        Xiaomi hp1 = new Xiaomi();
        hp1.Hp("Xiaomi", "android", 1000000);
        
        System.out.println("Merk :"+hp1.getMerk()+"\nTipe : "+hp1.getTipe()+"\nHarga : "+hp1.getHarga());
        
        
    }
    
}
