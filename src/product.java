
public class product {
    public product(){
        System.out.println("Yeni bir ders:");
    }
    public product(String dersBasligi,String ogretmenAdi, int tamamlanmaOranÄ±){
      this();
      this.dersBasligi=dersBasligi;
      this.ogretmenAdi=ogretmenAdi;
      this.tamamlanmaOranÄ±=tamamlanmaOranÄ±;
    }
    String dersBasligi;
    String ogretmenAdi;
    int tamamlanmaOranÄ±;
}
