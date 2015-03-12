
package yapay_zeka;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class AnaMenu extends javax.swing.JFrame {
   GridLayout lay=new GridLayout();
    JMenuItem item;
    int bas=999;
    int son=999;
    JPopupMenu jpm=new JPopupMenu();
    //Butonlar panele ekleniyor
    public AnaMenu() {
        initComponents();
        jPanel1.removeAll();
         
         lay.setRows(12);
         lay.setColumns(12);
         jPanel1.setLayout(lay);
         for(int i=0;i<12;i++){
             for(int j=0;j<12;j++){
                 
                 if(((i+j)%2)==0){
                     jPanel1.add(new myjbuton2(i,j));
                 }
                 else{
                     jPanel1.add(new myjbuton(i,j));
         }               
             } 
         }
         jPanel1.validate();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        jButton1.setText("Kısa Yol Bul");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Hakkında");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 776, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       Yol_Goster yg=new Yol_Goster(bas,son);
       yg.run();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       JOptionPane.showMessageDialog(null, "Programı kullanmak için herangi bir kutucuğa tıklayın.\nÇıkan menüden başlangıç ve bitiş noktasını ayarlayın.\nDaha sonra kısa yol bul butonuna tıklayarak sonucu görün.");
    }//GEN-LAST:event_jButton2MouseClicked

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaMenu().setVisible(true);
            }
        });
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    //////////////Tasarım başalngıcı
  //bu buton beyaz butonları için kullanıdğım özelleştirilmiş buton
    class myjbuton2 extends JButton{
     public myjbuton2(final int i,final int j){
         setBackground(Color.white);
       
       setText(i+","+j);
       this.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseEntered(MouseEvent me){
               super.mouseEntered(me);
               myjbuton2 fl=(myjbuton2)me.getComponent();
               if((fl.getText()!="Başlangıç")&&(fl.getText()!="Bitiş"))
               fl.setBackground(Color.yellow);
           }
           @Override
           public void mouseExited(MouseEvent me){
               super.mouseExited(me);
                myjbuton2 fl=(myjbuton2)me.getComponent();
               if((fl.getText()!="Başlangıç")&&(fl.getText()!="Bitiş"))
               fl.setBackground(Color.white);
           }
           @Override
           public void mousePressed(MouseEvent me){
               super.mousePressed(me);
               final myjbuton2 fl=(myjbuton2)me.getComponent();
               jpm.removeAll();
               jpm.add(new JMenuItem(new AbstractAction("Başlangıç") {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fl.getText()!="Başlangıç"){
                fl.setText("Başlangıç");
                  myjbuton2 fl;
                  myjbuton fl0;
                int a=0;
               if(bas==999){
                  fl =(myjbuton2)jPanel1.getComponent(a);
                   while(!"Başlangıç".equals(fl.getText())){
                   if(a%12==11)
                          a++;
                      else
                      if(a%12==10)
                       a+=3;
                  else
                          a+=2;
                      fl =(myjbuton2)jPanel1.getComponent(a); 
                   }
                   fl.setBackground(Color.pink);
                   bas=a;
               }
               else{
                   if(((bas/12)+(bas%2))%2==0){
                      fl =(myjbuton2)jPanel1.getComponent(bas); 
                      fl.setText((bas/12)+","+(bas%12));
                      fl.setBackground(Color.white);
                   }
                    else{
                      fl0 =(myjbuton)jPanel1.getComponent(bas); 
                      fl0.setText((bas/12)+","+(bas%12));
                      fl0.setBackground(Color.red);
                   }
                       
                    fl =(myjbuton2)jPanel1.getComponent(a); 
                    while(!"Başlangıç".equals(fl.getText())){
                      if(a%12==11)
                          a++;
                      else
                      if(a%12==10)
                       a+=3;
                  else
                          a+=2;
                      fl =(myjbuton2)jPanel1.getComponent(a); 
                   }
                  
                    fl.setBackground(Color.pink);
                   bas=a;
               }
            }
           }
        }));
               jpm.add(new JMenuItem(new AbstractAction("Bitiş") {
            @Override
            public void actionPerformed(ActionEvent e) {
                 if(fl.getText()!="Bitiş"){
                fl.setText("Bitiş");
                   myjbuton2 fl;
                   myjbuton fl0;
                  
                int a=0;
               if(son==999){
                  fl =(myjbuton2)jPanel1.getComponent(a);
                   while(!"Bitiş".equals(fl.getText())){
                     if(a%12==11)
                          a++;
                      else
                      if(a%12==10)
                       a+=3;
                  else
                          a+=2;
                      fl =(myjbuton2)jPanel1.getComponent(a); 
                   }
                  
                  
                    fl.setBackground(Color.orange);
                   son=a;
               }
               else{
                   if(((son/12)+(son%2))%2==0){
                      fl =(myjbuton2)jPanel1.getComponent(son);
                      fl.setText((son/12)+","+(son%12));
                      fl.setBackground(Color.white);
                   }
                    else{
                      fl0 =(myjbuton)jPanel1.getComponent(son); 
                      fl0.setText((son/12)+","+(son%12));
                      fl0.setBackground(Color.red);
                   }
                       
                    fl =(myjbuton2)jPanel1.getComponent(a); 
                    while(!"Bitiş".equals(fl.getText())){
                    if(a%12==11)
                          a++;
                      else
                      if(a%12==10)
                       a+=3;
                  else
                          a+=2;
                      fl =(myjbuton2)jPanel1.getComponent(a); 
                   }
             
                  
                    fl.setBackground(Color.orange);
                   son=a;
               }
            }
            }
        }));
               jpm.show(me.getComponent(),me.getX(),me.getY());
           }
});
     }  
}
    
    //Bu buton kırmızı butonları oluşturmak için tanımladığım özelleştirilmiş buton
class myjbuton extends JButton{
   public myjbuton(final int i,final int j){
       setBackground(Color.red);
     
       setText(i+","+j);
       this.addMouseListener(new MouseAdapter() {
         
           @Override
           public void mouseEntered(MouseEvent me){
               super.mouseEntered(me);
               myjbuton fl=(myjbuton)me.getComponent();
              if((fl.getText()!="Başlangıç")&&(fl.getText()!="Bitiş"))
               fl.setBackground(Color.yellow);
           }
           
           
           @Override
           public void mouseExited(MouseEvent me){
               super.mouseExited(me);
                myjbuton fl=(myjbuton)me.getComponent();
               if((fl.getText()!="Başlangıç")&&(fl.getText()!="Bitiş"))
               fl.setBackground(Color.red);
                
           }
       
           @Override
             public void mousePressed(MouseEvent me){
               super.mousePressed(me);
               final myjbuton fl=(myjbuton)me.getComponent();
               jpm.removeAll();
               jpm.add(new JMenuItem(new AbstractAction("Başlangıç") {
            @Override
            public void actionPerformed(ActionEvent e) {
                 if(fl.getText()!="Başlangıç"){
                fl.setText("Başlangıç");
               myjbuton fl;
                 myjbuton2 fl0;
                int a=1;
               if(bas==999){
                  fl =(myjbuton)jPanel1.getComponent(a);
                   while(!"Başlangıç".equals(fl.getText())){
                     if(a%12==11)
                          a++;
                      else
                      if(a%12==10)
                       a+=3;
                  else
                          a+=2;
                      fl =(myjbuton)jPanel1.getComponent(a); 
                   }
                   
                   fl.setBackground(Color.pink);
                   bas=a;
               }
               else{
                   if(((bas/12)+(bas%2))%2==0){
                      fl0 =(myjbuton2)jPanel1.getComponent(bas); 
                      fl0.setText((bas/12)+","+(bas%12));
                      fl0.setBackground(Color.white);
                   }
                    else{
                      fl =(myjbuton)jPanel1.getComponent(bas);
                      fl.setText((bas/12)+","+(bas%12));
                      fl.setBackground(Color.red);
                   }
                  fl =(myjbuton)jPanel1.getComponent(a); 
                    while(!"Başlangıç".equals(fl.getText())){
                    if(a%12==11)
                          a++;
                      else
                      if(a%12==10)
                       a+=3;
                  else
                          a+=2;
                      fl =(myjbuton)jPanel1.getComponent(a); 
                   }
                
                   fl.setBackground(Color.pink);
                   bas=a;
               }
            
            }
            }
        }));
               
               jpm.add(new JMenuItem(new AbstractAction("Bitiş") {
            @Override
            public void actionPerformed(ActionEvent e) {
                 if(fl.getText()!="Bitiş"){
                fl.setText("Bitiş");
               myjbuton fl;
                myjbuton2 fl0;
                int a=1;
               if(son==999){
                  fl =(myjbuton)jPanel1.getComponent(a);
                   while(!"Bitiş".equals(fl.getText())){
                   if(a%12==11)
                          a++;
                      else
                      if(a%12==10)
                       a+=3;
                  else
                          a+=2;
                      fl =(myjbuton)jPanel1.getComponent(a); 
                   }
                  
                   fl.setBackground(Color.orange);
                  son=a;
               }
               else{
                   if(((son/12)+(son%2))%2==0){
                      fl0 =(myjbuton2)jPanel1.getComponent(son); 
                      fl0.setText((son/12)+","+(son%12));
                      fl0.setBackground(Color.white);
                   }
                    else{
                      fl =(myjbuton)jPanel1.getComponent(son); 
                     
                      fl.setText((son/12)+","+(son%12));
                      fl.setBackground(Color.red);
                   }
                      fl =(myjbuton)jPanel1.getComponent(a); 
                    while(!"Bitiş".equals(fl.getText())){
                    if(a%12==11)
                      a++;
                      else
                      if(a%12==10)
                      a+=3;
                      else
                      a+=2;
                      fl =(myjbuton)jPanel1.getComponent(a); 
                    }
                   fl.setBackground(Color.orange);
                   son=a;
               }
            }
            }
        }));
               jpm.show(me.getComponent(),me.getX(),me.getY());
           }
});
      
   }
} 


//////Tasarım bitişi
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
