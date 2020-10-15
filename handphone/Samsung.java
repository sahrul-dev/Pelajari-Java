
// package handphone;

//Subclass

public class Samsung extends Handphone{

    
    public static void main(String[] args) {
        
        Samsung hp1 = new Samsung();
        hp1.Hp("Samsung", "android", 7000000);
        
        System.out.println("Merk :"+hp1.getMerk()+"\nTipe : "+hp1.getTipe()+"\nHarga : "+hp1.getHarga());
        
    }
    
}
