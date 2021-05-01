
public class Main {
    public static void main(String[] args)
    {
    product ders1=new product("Yazılım geliştirici Yetiştirme Kampı(c#+ ANGULAR)","Engin Demiroğ",18);
    product ders2=new product("Yazılım geliştirici Yetiştirme Kampı(JAVA+REACT)","Engin Demiroğ",28);
    product ders3=new product("Programlamaya Giriş için Temel Kurs","Engin Demiroğ",0);
    product[] products={ders1,ders2,ders3};
    for(product Product : products ){
        System.out.println("Ders Adı:"+Product.dersBasligi);
        System.out.println("Öğretmen Adı:"+Product.ogretmenAdi);
        System.out.println("Tamamlanma Oranı:"+Product.tamamlanmaOranı);
    }
   ProductManager pm=new ProductManager();
   pm.dersEkle(ders1);
   pm.dersEkle(ders2);
   pm.dersEkle(ders3);
   pm.dersSil(ders1);
   pm.dersSil(ders3);
    }


}