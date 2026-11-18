

package com.mycompany.sayianalizi;

//*Bu kod bloğu,ödevde istenilen görevlerin tamamını (tek bir istisna hariç) yerine getiebilmekle beraber tek bir istisnada sıkıntı yaşamaktadır. Bu istisna ise,ilk başta sayı girilmesi istendiğinde eğer girilen ilk sayı negatif olursa sistemin çökmesi ve error vermesidir. Ancak başka herhangi bir zaafı yoktur.Eğer sisteme ilk başta pozitif bir sayı girilip de sonra bir negatif sayı girişi olursa hiçbir ölçüm sıkıntısı ya da sistemsel sıkıntı yaşanmamaktadır.//*



import java.util.Scanner;
public class Sayianalizi {

    public static void main(String[] args) {
       
    Scanner scanner =new Scanner (System.in) ;   
        
    System.out.println("Az sonra sizden devamli olarak bir sayi girmenizi isteyecek bir program ile karsilasacaksiniz.Program girdiginiz sayilari kullanarak bazi analizler yapacak ve en sonunda size sonuclari verecek. Eger programin sayi alimini durdurmak isterseniz '0' tusuna basmaniz gerekmektedir. ");
     int saysay=0;
    int poort=0;
    int tplm =0;
    int posay=0;
    int nesay=0;
    int tesay=0;
    int cisay=0;
    int buyuk=0;
    int kucuk=0;
    int asalsay=0;
    int sayi;
    int sayisayisi =0;
    int ort=0;
    int pozitiftoplam=0;
    
    do{
        
        System.out.println("sayi girin."); 
        
      
     sayi =scanner.nextInt();
        
       
        if (sayi>0 || sayi<0){
            
           saysay=saysay+1; 
        if (sayi>0) {
              
              posay =posay+1;
          
        pozitiftoplam =pozitiftoplam+sayi;
        } 
        
        else if (sayi<0){
            
            nesay =nesay+1;
        }
        
        if (sayi%2==0){
            
            cisay =cisay +1;
        }
        
        else {
            
            tesay =tesay+1;
        }
        
        if (saysay==1){
             buyuk =sayi;
       kucuk=sayi;
          }
        
     else if (saysay!=1){
         
         if (sayi>buyuk){
             buyuk=sayi;
         }
     
         else if (sayi<kucuk){
             
             kucuk =sayi;
         }
     
     }
        tplm =tplm+sayi;
        
        sayisayisi=sayisayisi+1;
        
        ort=tplm /sayisayisi; 
        
        poort =pozitiftoplam /posay;
        
        boolean flag =true;
      
        if (sayi>0){
        
        for (int i =2 ;i<sayi;i++){
           
         if (sayi%i==0) {
             
             flag=false;
        
         break;
         } 
       
         else {
             
             flag =true;
         }   
             } 
        if (flag){
            
          System.out.println("sayi asaldir.");
           
          asalsay=asalsay+1;
        }     
        else {
            System.out.println("sayi asal degildir.");
        }    
        }
        else {
            System.out.println("Sayi asal degildir.");
        }
        
       if (sayi>0){ 
        
           int boltop =0;
        for (int i =1;i<sayi;i++){
            
         if (sayi%i==0) {
             
              boltop =boltop+i;
         }  
            
         else {
             
          boltop=boltop;
         }  
           
        }
        
        if ( boltop ==sayi){
            
            System.out.println("sayi bir mukemmel sayidir.");
        }
        else {
            
       System.out.println("sayi bir mukemmel sayi degildir.");
        }}
       
       else {
           System.out.println("Sayi pozitif olmadigi icin mukemmel degildir.");
       }
        
        if (sayi>0){
boolean abc =true;

int i =1;

int bassay=0;
while (abc){

    if (sayi >=i ){
        abc=true;
   
   bassay=bassay+1; 
    
    i=i*10;
    }
            
    else {
       abc=false;
    } 

} 

    System.out.println("Girdiginiz sayi  "+ bassay +" basamaklidir."); 
     }

 
 else if(sayi<0){
     
    boolean abc =true;

int i =-1;

int bassay=0;
while (abc){

    if (sayi <=i ){
        abc=true;
   
   bassay=bassay+1; 
    
   
  i=i*10;
    }
            
    else {
        abc=false;
    } 

} 

    System.out.println("Girdiginiz sayi  "+ bassay +" basamaklidir.");  //*basamak sayısını belirleyecek kod bloğunu yazarken daha önce yazdığım basamak belirleme kodlarından kopyala-yapıştır yaptım.//*
     
        
        
        }
        
        }  
       
        else {
           if(saysay==0){
               
               System.out.println("Girdiginiz ilk sayi 0 olursa programin bir anlami kalmaz cunku daha isleyebilecegi uygun bir sayi almadan kapanmis olur. 0 Girdiginiz icin program herhangi bir istattistik vermeden  kapanacak.");
           } 
           else {
             System.out.println("program kapatiliyor.");
           
           int fark =buyuk-kucuk;
    
   System.out.println("pozitif sayıların sayısı: "+ posay);
   System.out.println("negatif sayilarin sayisi : " + nesay); 
    System.out.println("tek sayilarin sayisi "+ tesay);
   System.out.println("cift sayilarin sayisi : " + cisay); 
    System.out.println("En buyuk sayi: "+ buyuk);
    System.out.println("En kucuk sayi: "+ kucuk);
    System.out.println("En buyuk ve en kucuk sayilarin farki : " + fark);
    System.out.println("Girilen sayilarin toplami : " + tplm);
    System.out.println("Girilen sayilarin ortalamasi : " + ort );
    System.out.println("Girilen pozitif sayilarin ortalamasi : "+ poort);
    System.out.println("Girilen sayilardan asal olanlarin sayisi : "+ asalsay);
    
    
           } 
        }
    }while(sayi>0 || sayi<0);  
                
    
    scanner.close();
    
    //*bazı kod bloklarını tekrar yazmamak adına kopyala-yapıltır yaptım ama bunlar da tamamen kendi kodlarımdan alınan kopyalardı.Yani yapay zeka kullanmadım//* 
    }}