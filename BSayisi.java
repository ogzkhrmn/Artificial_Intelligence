
package yapay_zeka;

public class BSayisi {
    
    //adımları bulmada kullanacağım sayının basamak sayısını buluyor.
    //Bu sayede kaç adım olduğunu hesaplanıyor.
    public int basamak(int sayi){
        int i=0;
        while(sayi>9)
        {
            i++;
            sayi/=10;
        }
        return i;
    }
}
