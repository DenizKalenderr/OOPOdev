
package paket;
class ucuncuKat {

    int daire9Kadin;
    int daire9Erkek;
    double daire9Kadinmaas;
    double daire9Erkekmaas;
    double daire10Annemaas;
    double daire10Babamaas;
    double daire10Cocukmaas;
   
    int daire10Anne;
    int daire10Baba;
    int daire10Cocuk;
    public double parayrd;
 public boolean daire9gıdayrd;
    public boolean daire10gıdayrd;
   public boolean daire9maskedgt;
    private boolean daire10maskedgt;
    
    public ucuncuKat() {
        
    }
    
    ucuncuKat(int daire9Kadin, int daire9Erkek) {
        this.daire9Kadin = 58;
        this.daire9Erkek = 59;
    }
   ucuncuKat(int daire10Anne, int daire10Baba, int daire10Cocuk) {
       this.daire10Anne = 35; 
       this.daire10Baba = 40 ;
       this.daire10Cocuk = 19;
   }
   
  public void daire9maskedgt() {
      if(daire9Kadin<60 && daire9Erkek<60){
          System.out.println("Maske yardımı yapılacak.");
      } else{
          System.out.println("Maske yardımı yapılmayacak.");
      }}
   
  private void daire10maskedgt() {
   if(daire10Anne > 20 || daire10Anne < 60
           && daire10Baba > 20 || daire10Baba < 60
           && daire10Cocuk > 20 || daire10Cocuk < 60){
        
       System.out.println("Maske yardımı yapılacak.");
   } else {
       System.out.println("Maske yardımı yapılmayacak");
   }
 }
  
  public void parayrd(double x, double y){
      double daire9Kadinmaas = x;
      double daire9Erkekmaas = y;
      
      double top = x+y;
      double oran = top/2;
      
      if(oran<2000){
          System.out.println("Para yardımı yapılacak");
      }
      else{
          System.out.println("Para yardımı yapılmayacak.");
      }
  }
      public void parayrd(double a, double b, double c){
          double daire10Annemaas = a;
          double daire10Babamaas = b;
          double daire10Cocukmaas = c;
          
          double top = a+b+c;
          double oran = top/3;
          
          if(oran<2000){
              System.out.println("Para yardımı yapılacak.");
          }
          else{
              System.out.println("Para yardımı yapılmayacak.");
          }
      }
  
  public void  daire9gıdayrd () {
        
    int yasTop = daire9Kadin + daire9Erkek;
    double yasOrt = yasTop/2;
    
    if(yasOrt<59){
        System.out.println("Gıda yardımı yapılacak.");
    }
    else{
        System.out.println("Gıda yardımı yapılmayacak.");
    }
       }
       
        public void  daire10gıdayrd () {
            
            int yasTop = daire10Anne + daire10Baba + daire10Cocuk;
            double yasOrt = yasTop/ 3;
            
            if(yasOrt < 35.6){
                System.out.println("Gıda yardımı yapılmayacak.");
            }
            else{
                System.out.println("Gıda yardımı yapılacak.");
            }
        }
          public static  class son extends ucuncuKat {
               String mesaj;
            int yapılanparaYrdm;
              private void daire9(int daire9Kadin, int daire9Erkek){
                  
    mesaj ="Yardımlarınız için teşekkürler. Biz EVDE KALMAYA devam ediyoruz.";
    double top = daire9Kadin + daire9Erkek;
       if(top>100){
        System.out.println("Bayram ziyareti görüntülü konuşarak yapılacak.");
        }else{
 System.out.println("1.dereceden yakın 2 kişi ile, sosyal mesafe kuralına uyarak 1 saat ziyaret gerçekleştirilebilir.");
 
              }
            }
              
public void daire10(int daire10Anne, int daire10Baba, int daire10Cocuk){
 int yapılanparaYrdm = 1000;
 mesaj = "Yardımlarınız bize ulaştı, teşekkürler. EVDE KALMAYA devam ediyoruz.";
 double top= daire10Anne+daire10Baba+daire10Cocuk;
 if(top>100){
     System.out.println("Bayram ziyareti görüntülü konuşarak yapılacak.");
}else{
     System.out.println("1.dereceden yakın 2 kişi ile, sosyal mesafe kuralına uyarak 1 saat ziyaret gerçekleştirilebilir.");
 }
}
            } 
         void Goster(){
            System.out.println("DAİRE 9 İÇİN : " );
            System.out.println( "Yaşlar : " + daire9Kadin + "," + daire9Erkek);
            System.out.println(  daire9gıdayrd );
            System.out.println( daire9maskedgt);
             
             
        }    
        void goster(){
            System.out.println("DAİRE 10 İÇİN : ");
            System.out.println("Yaşlar : " +daire10Anne + "," + daire10Baba + "," 
            + daire10Cocuk);
            System.out.println(   daire10maskedgt);
            System.out.println( daire10gıdayrd);
        }
        
public static void main(String[] args) {
son c= new son();
ucuncuKat d = new ucuncuKat(58, 59);
ucuncuKat a = new ucuncuKat(35, 40, 20);

a.goster();
a.daire10maskedgt();
a.daire10gıdayrd();
a.parayrd(2400, 3255, 0);
c.daire10(35, 40, 20);
d.Goster();
d.daire9gıdayrd();
d.daire10maskedgt();
d.parayrd(2500, 3000);
c.daire9(58, 59);

 }}     
         
 
      
   
      
        
   

       
       



  
   
   

   
    
       

   

   

        
        
    
    

   



 
