
package yapay_zeka;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Yol_Goster extends javax.swing.JFrame {
    int bas,son; //Başlangıç ve bitiş yerinin buunduğu butonn sıraları tutuluyor
    GridLayout lay=new GridLayout();
    YolBul bul; //yolbul sınıfının objesi
     BSayisi bs=new BSayisi(); //basamaksayısı bulmak için gerekli obje
      Runtime runtime = Runtime.getRuntime();  //çaloşma süresi ve kullanılan hafızayı hesaplayacak
     int mb = 1024*1024;
    int by,bsa,lsize,t,k;  //adımlar,başlangıç ve bitiş noktoları için gerekli olan değişkenler
    public Yol_Goster(int bas,int son) {
      this.bas=bas;
      this.son=son;
        initComponents();
         long start = System.currentTimeMillis();
         //Burada kısa yolu hesaplayacak sınıfa başlangıç ve bitiş adresi gönderiliyor.
         //matris olarak düşünürsek bas/12 bize satır numarasını bas%12 sütun numarasını veriyor.
         //Son değişkeni içinde bas değişkeninde yapılan hesap geçerli.
         bul=new YolBul((bas/12), (bas%12),(son/12), (son%12));
         //Tüm yolları bulmada kullanılan metod çağrılıyor
         bul.yollaribul();
         //Yollar arasından en kısa olanı seçmemizi sağlayan metod seçiliyor.
       bul.kisayolsec();
       
       
       //Buldu mu metodu çağrılarak varış noktasına ulaşılıp ulaşılmadığına bakılıyor.
       while(!bul.buldumu()){
           //Eğer ulaşamadıysak ulaşana kadar yolbulma ve en kısa yolu bulacak metodlar çağrılıyor.
            bul.yollaribul();
            bul.kisayolsec();
       }
       
       //Bulduktan sonra panele gerekli elemanlar yerleştiriliyor.
       jPanel1.removeAll(); 
         lay.setRows(12);
         lay.setColumns(12);
         jPanel1.setLayout(lay);
         for(int i=0;i<12;i++){
             for(int j=0;j<12;j++){ 
                   
                 if((i==bas/12)&&(j==bas%12)){
                     jPanel1.add(new myjbuton3());
                 }else{
                     if((i==son/12)&&(j==son%12)){
                     jPanel1.add(new myjbuton4());
                 }else{
                 if(((i+j)%2)==0){
                     jPanel1.add(new myjbuton1(i,j));}
                 else{
                     jPanel1.add(new myjbuton2(i,j));
                 }
                     }             
                 }  
             } 
         }
         //lsize burda gidilen yolları tutan listenin uzunluğunu bulmamızı sağlıyor
         lsize=YolBul.blist.size();
         //bsa bize kaç adımda bittiğini veriyor. Burda listenin 3. elemanı bakyol adlı değişkeni tutuyordu.
         //bak yol değişkeninin uzunluğu aslında bize adım sayısını veriyor.
         bsa=bs.basamak(YolBul.blist.get(lsize-1).get(3)); 
         jLabel1.setText((bsa+1)+" adımda tamamlandı.");
         
         //Burda listenin 3. elemanını (yani bakyol değişkeni) 10 a bölerek
         //bir önceki yolu bulmayı sağlıyoruz.
          by=YolBul.blist.get(lsize-1).get(3)/10;
          int i=lsize-1;
          //burda while yolları bulana kadar devam edcek. 
         while((i>=0&&(bsa>=0))){
           
             //burda listenin o anki bulunduğumuz yerindeki 3. elemanına bakılıyor.
             //Daha önce 10 böldüğümüz by değişkeni eğer listenin o anki elemanına eşitse
             //bu bize o yoldan geçerek şu anki noktaya geldiğimizi anlatıyor.
             if(by==YolBul.blist.get(i).get(3)){
                 //yolu bulunca by yi tekrar 10 a bölerek bir önceki yolu aramaya çıkacaz.
             by=YolBul.blist.get(i).get(3)/10;
             
             //t ve k ise sırasıyla bulunduğumuz noktadan önceki yerin satır ve sütun numarasını veriyor.
             t=YolBul.blist.get(i).get(4);
             k=YolBul.blist.get(i).get(5);
             
             //panelden gerekli yer siliniyor ve aynı yere bakılan yola özel buton ekleniyor.
             jPanel1.remove(t*12+k);
             jPanel1.add(new myjbuton5(bsa),(t*12+k));
             
             //bsa 1 azaltarak while ın gereksiz iş yapmasını önlüyoruz.
             //Zaten kaç adet adım attığımızı bildğimiz için ona göre bu değişkeni önceden belirliyoruz.
             bsa--;
             }
           i--;
         }
         long end = System.currentTimeMillis();
         jLabel2.setText("Bitiş süresi: "+(end-start)+"ms");
         jPanel1.validate();
          jLabel3.setText("Kullanılan hafıza: "+(runtime.totalMemory() - runtime.freeMemory()) / mb+"mb");
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 353, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

            public void run() {
                new Yol_Goster(bas,son).setVisible(true);
            }
     //başlangıç bitiş ve adımlara özel butonlar oluşturuluyor.
  class myjbuton1 extends JButton{
     public myjbuton1(int i,int j){
         setBackground(Color.white);
        setText(i+","+j); 
     }  
}
  class myjbuton2 extends JButton{
     public myjbuton2(int i,int j){
         setBackground(Color.red);
        setText(i+","+j); 
     }  
}
  class myjbuton3 extends JButton{
     public myjbuton3(){
         setBackground(Color.pink);
        setText("Başlangıç"); 
     }  
}
  class myjbuton4 extends JButton{
     public myjbuton4(){
         setBackground(Color.orange);
        setText("Bitiş"); 
     }  
}
  class myjbuton5 extends JButton{
     public myjbuton5(int i){
         setBackground(Color.magenta);
        setText(i+". Adım"); 
     }  
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
