
public class product {
    public product(){
        System.out.println("Yeni bir ders:");
    }
    public product(String dersBasligi,String ogretmenAdi, int tamamlanmaOranı){
      this();
      this.dersBasligi=dersBasligi;
      this.ogretmenAdi=ogretmenAdi;
      this.tamamlanmaOranı=tamamlanmaOranı;
    }
    String dersBasligi;
    String ogretmenAdi;
    int tamamlanmaOranı;
}
