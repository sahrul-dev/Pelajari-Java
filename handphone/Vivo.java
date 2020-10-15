
// package handphone;

//Subclass

public class Vivo extends Handphone{

    public static void main(String[] args) {
       
          
        Vivo hp1 = new Vivo();
        hp1.Hp("Vivo", "android", 2000000);
        
        System.out.println("Merk :"+hp1.getMerk()+"\nTipe : "+hp1.getTipe()+"\nHarga : "+hp1.getHarga());
        
        
    }
    
}
