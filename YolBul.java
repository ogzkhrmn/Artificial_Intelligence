
package yapay_zeka;

import java.util.ArrayList;
public class YolBul {
    Yollar yol=new Yollar();
    protected static int basx,basy,sonx,sony,basxy,basyy; // başlangıç yerinin ve bitiş yerinin koordinatları
    protected int g=1,h,f; //a* için gerekli olan h,f,g değişkenleri
    protected int enkisa,enkisai; //enkisayolu bulmak için kullanılan değişkenler
    protected int bakyol=1; //Varış yerine ulaşılınca gidilen yolları bulmak için kullanılan değişken
    
    
    
  // Tüm yolları tutmak için kullanılan list yapıları
   protected ArrayList<ArrayList<Integer>> slist = new ArrayList<ArrayList<Integer>>();
   protected ArrayList<Integer> row;
   
   
   
   //Seçilmiş yolları tutan list yapısı
    protected static ArrayList<ArrayList<Integer>> blist = new ArrayList<ArrayList<Integer>>();
    
    
    
    //Başlangıç ve bitiş adresleri ayarlanıyor.
     public YolBul(int x,int y, int z, int t){
       basx=x;
        basy=y;
         sonx=z;
         sony=t;
     }
     
     
    //O anki yerden gidilebilecek tüm yolları buluyor 
     //Gidlecek yol varsa Yol_goster sınıfından alınan yeni başlangıç ve bitiş
     //noktoları listemize ekleniyor. Bu sayede bulunduğumuz noktayı kaydetmiş oluyoruz.
     public void yollaribul(){
       //Üst sağ yol  
        if(yol.upr()){
        row=new ArrayList<Integer>();
        row.add(g);
        if((basxy-sonx)<0){
           h=-1*(basxy-sonx); 
        }
        else{
            h=basxy-sonx;
           
        }
        if((basyy-sony)<0)
              h=h+((basyy-sony)*-1);
              else
               h=h+(basyy-sony);
        row.add(h);
        f=h+g;
        row.add(f);
        row.add(bakyol);
        row.add(basxy);
        row.add(basyy);
        slist.add(row);
        bakyol++;
       
        }   
        
        //üst sol yol
        if(yol.upl()){
            row=new ArrayList<Integer>();
        row.add(g);
        if((basxy-sonx)<0){
           h=-1*(basxy-sonx); 
        }
        else{
            h=basxy-sonx;
           
        }
        if((basyy-sony)<0)
              h=h+((basyy-sony)*-1);
              else
               h=h+(basyy-sony);
        
        row.add(h);
        f=h+g;
        row.add(f);
        row.add(bakyol);
        row.add(basxy);
        row.add(basyy);
        slist.add(row);
        bakyol++;
       
        }   
        
        
        //Alt sağ yol
        if(yol.downr()){
            row=new ArrayList<Integer>();
        row.add(g);
        if((basxy-sonx)<0){
           h=-1*(basxy-sonx); 
        }
        else{
            h=basxy-sonx;
        }
         if((basyy-sony)<0)
              h=h+((basyy-sony)*-1);
              else
               h=h+(basyy-sony);
        row.add(h);
        f=h+g;
        row.add(f);
        row.add(bakyol);
        row.add(basxy);
        row.add(basyy);
        slist.add(row);
        bakyol++;
       
        }   
        
        //Alt sol yol
        if(yol.downl()){
            row=new ArrayList<Integer>();
        row.add(g);
        if((basxy-sonx)<0){
           h=-1*(basxy-sonx); 
        }
        else{
            h=basxy-sonx;
          
        }
        if((basyy-sony)<0)
              h=h+((basyy-sony)*-1);
              else
               h=h+(basyy-sony);
        row.add(h);
        f=h+g;
        row.add(f);
        row.add(bakyol);
        row.add(basxy);
        row.add(basyy);
        slist.add(row);
        bakyol++;
        
        }  
        
        //Sağ üst yol
        if(yol.rightu()){
            row=new ArrayList<Integer>();
        row.add(g);
        if((basxy-sonx)<0){
           h=-1*(basxy-sonx); 
        }
        else{
            h=basxy-sonx;
          
        }
        if((basyy-sony)<0)
              h=h+((basyy-sony)*-1);
              else
               h=h+(basyy-sony);
        row.add(h);
        f=h+g;
        row.add(f);
        row.add(bakyol);
        row.add(basxy);
        row.add(basyy);
        slist.add(row);
        bakyol++;
       
        } 
        //Sağ alt yol
        if(yol.rightd()){
            row=new ArrayList<Integer>();
        row.add(g);
        if((basxy-sonx)<0){
           h=-1*(basxy-sonx); 
        }
        else{
            h=basxy-sonx;
       
        }
        if((basyy-sony)<0)
              h=h+((basyy-sony)*-1);
              else
               h=h+(basyy-sony);
        row.add(h);
        f=h+g;
        row.add(f);
        row.add(bakyol);
        row.add(basxy);
        row.add(basyy);
        slist.add(row);
        bakyol++;
        
        } 
        
        //Sol üst yol
        if(yol.leftu()){
            row=new ArrayList<Integer>();
        row.add(g);
        if((basxy-sonx)<0){
           h=-1*(basxy-sonx); 
        }
        else{
            h=basxy-sonx;
           
        }
        if((basyy-sony)<0)
              h=h+((basyy-sony)*-1);
              else
               h=h+(basyy-sony);
        row.add(h);
        f=h+g;
        row.add(f);
        row.add(bakyol);
        row.add(basxy);
        row.add(basyy);
        slist.add(row);
        bakyol++;
      
        }   
        
        //sol alt yol
        if(yol.leftd()){
            row=new ArrayList<Integer>();
        row.add(g);
        if((basxy-sonx)<0){
           h=-1*(basxy-sonx); 
        }
        else{
            h=basxy-sonx;
          
        }
        if((basyy-sony)<0)
              h=h+((basyy-sony)*-1);
              else
               h=h+(basyy-sony);
        row.add(h);
        f=h+g;
        row.add(f);
        row.add(bakyol);
        row.add(basxy);
        row.add(basyy );
        slist.add(row);
        bakyol++;
        
        } 
        g++;
     }
     
     
     //Gidilebilecek yollar arasından en kısa olana seçiliyor
     public void kisayolsec(){
         enkisa=slist.get(0).get(2);
         enkisai=0;
         for (int i = 1; i < slist.size(); i++) {
             if(enkisa>slist.get(i).get(2)){
                 enkisa=slist.get(i).get(2);
                 enkisai=i;}
         }
         blist.add(slist.get(enkisai));    
       
     }
     
     
     //Yeni gelinen yol bitiş yeri mi ona bakıyor.
     //Değilse yeni başlangıç ve bitiş yerleri ayarlanıyor.
     public boolean buldumu(){
         
         if(slist.get(enkisai).get(1)==0){
             slist.clear();
             return true;
         }
         basx=slist.get(enkisai).get(4);
         basy=slist.get(enkisai).get(5);
         g=slist.get(enkisai).get(0)+1;   //g ye bir eklenmesi sebebi yeni adım sayısını bir arttırmak
          bakyol=(slist.get(enkisai).get(3))*10; //bakyol değişkeni geçilen yolları tutuyor . 10 ile de çarparak 
                                                 //yolların birbirine karışmasını ve o yoldan önceki yolların bi şekilde bu
                                                 //değişken içinde saklanmasını sağlıyorum. Bi nevi aslında kodlama görevi yapıyor.
                                                 //Bu değişken aslında en kritik öneme sahip değişken. Çünkü hedefe nasıl ulaştığımızı 
                                                 //tutuyor ve algoritmanın en can alıcı noktası bu.
          
          
            slist.remove(enkisai);               //Bakılan yol listeden çıkarılıyorki tekrar ordan geçmesin diye.
         return false;
     }
}
