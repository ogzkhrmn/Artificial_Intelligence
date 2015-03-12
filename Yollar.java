
package yapay_zeka;

public class Yollar {
    //Bu sınıf gidilebilecek 8 yolun olup olmadığını hesaplıyor ve 
    //eğer gidilebilecek yeni yol varsa yeni yolun başlangıç değerlerini buluyor.
    public Yollar(){
        
    }
     public boolean upr() {
         if((YolBul.basx>=4)&&(YolBul.basy)<=10){
            YolBul.basxy=YolBul.basx-4;
            YolBul.basyy=YolBul.basy+1;
            return true;
        }
         return false;
    }    
     public boolean upl(){
         if((YolBul.basx>=4)&&(YolBul.basy)>=1){
            YolBul.basxy=YolBul.basx-4;
            YolBul.basyy=YolBul.basy-1;
            return true;
        }
         return false;
     }
      public boolean leftu(){
         if((YolBul.basx>=1)&&(YolBul.basy)>=4){
            YolBul.basxy=YolBul.basx-1;
            YolBul.basyy=YolBul.basy-4;
            return true;
        }
         return false;
     }
       public boolean leftd(){
         if((YolBul.basx<=10)&&(YolBul.basy)>=4){
            YolBul.basxy=YolBul.basx+1;
            YolBul.basyy=YolBul.basy-4;
            return true;
        }
         return false;
     }
       public boolean rightd(){
         if((YolBul.basx<=10)&&(YolBul.basy)<=7){
            YolBul.basxy=YolBul.basx+1;
            YolBul.basyy=YolBul.basy+4;
            return true;
        }
         return false;
     }
       public boolean rightu(){
         if((YolBul.basx>=1)&&(YolBul.basy)<=7){
            YolBul.basxy=YolBul.basx-1;
            YolBul.basyy=YolBul.basy+4;
            return true;
        }
         return false;
     }
       public boolean downr() {
         if((YolBul.basx<=7)&&(YolBul.basy)<=10){
            YolBul.basxy=YolBul.basx+4;
            YolBul.basyy=YolBul.basy+1;
            return true;
        }
         return false;
    }    
     public boolean downl(){
         if((YolBul.basx<=7)&&(YolBul.basy)>=1){
            YolBul.basxy=YolBul.basx+4;
            YolBul.basyy=YolBul.basy-1;
            return true;
        }
         return false;
     }
}
