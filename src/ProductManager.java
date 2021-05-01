
public class ProductManager {
public void dersEkle(product Product){
     System.out.println("Eklenen ders bilgisi:  "+Product.dersBasligi+""+Product.ogretmenAdi+
     " "+Product.tamamlanmaOranı);
}
public void dersSil(product Product){
    System.out.println(" Eğitmeni  "+Product.ogretmenAdi+" olan "+Product.dersBasligi+" %"+ 
    Product.tamamlanmaOranı+" tamamlamış  kursunuz silinmiştir.");
}


}
