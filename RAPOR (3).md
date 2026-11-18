# Rapor

**Ad Soyad:Ali Deniz Tüfekci**
**Numara:722**

## 1. Algoritma Açıklaması
<-- Program ,kişiden durmadan sayılar isteyecek ve her defasında bu sayılarla işlemler yapıp (toplam almak, pozitif-negatif-sıfır ayırmak vb.) bazılarını her defasında kullanıcıya gösterecek, bazılarını ise bazı değişkenlerde biriktirip işlemlerin sonunda program bitince gösterecek şekilde çalışmaktadır. Kullanıcının sayı girme eylemini bitirip toplu sonuçları almak adına (biriktirip en son gösterilenler) "0"a basması gerekmektedir.-->


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-sayı-sayı-sayı-sayı...............0

**İşlemler:**
"- Pozitif sayıların adedini bulma.(en son)
- Negatif sayıların adedini bulma(en son).
- Tek sayıların adedini bulma(en son).
- Çift sayıların adedini bulma(en son).
- En büyük sayıyı bulma.(en son)
- En küçük sayıyı bulma(en son).
- Girilen sayıların toplamını hesaplama.(en son)
- Aritmetik ortalamayı hesaplama.(en son)

- Girilen sayılar arasında en büyük ve en küçük sayı arasındaki farkı hesaplayın(özel görev olarak ,en son.).
- Pozitif sayıların ortalamasını ayrıca hesaplayın.(özel görev olarak ,en son.)
- Asal sayıların kaç tane olduğunu bulun(özel görev olarak ,en son.)

- Girilen sayının asal olup olmadığını belirleme(her sayı için).
- Sayının mükemmel sayı olup olmadığını belirleme(her sayı için).
- Sayının basamak sayısını bulma.(her sayı için)"
işlemlerini her sayı girişinde yapar ve son 3 'ünü her sayı için ayrı ayrı gösterir. Diğerlerini program 0'a basılıp kapatılınca gösterir.

**Çıktılar:**
1)Her sayı girişindekiler :
- Girilen sayının asal olup olmadığını belirleme.
- Sayının mükemmel sayı olup olmadığını belirleme.
- Sayının basamak sayısını bulma."
2)En son gösterilenler:
  - Pozitif sayıların adedi
- Negatif sayıların adedi
- Tek sayıların adedi
- Çift sayıların adedi
- En büyük sayı
- En küçük sayı
- Girilen sayıların toplamı
- Aritmetik ortalama
3)Ek görev olarak en son gösterilenler:
- Girilen sayılar arasında en büyük ve en küçük sayı arasındaki fark.
- Pozitif sayıların ortalaması
- Asal sayıların sayısı

4)istisnai olarak girilen ilk sayı "0" olursa gösterilen:
-"Girdiginiz ilk sayi 0 olursa programin bir anlami kalmaz cunku daha isleyebilecegi uygun bir sayi almadan kapanmis olur. 0 Girdiginiz icin program herhangi bir istattistik vermeden  kapanacak."
## 3. Sözde Kod (Pseudocode)

```
1.output:"Az sonra sizden devamli olarak bir sayi girmenizi isteyecek bir program ile karsilasacaksiniz.Program girdiginiz sayilari kullanarak bazi analizler yapacak ve en sonunda size sonuclari verecek. Eger programin sayi alimini durdurmak isterseniz '0' tusuna basmaniz gerekmektedir. "
2.Tanımlama integer'lar: int sayısayısı,pozitifort,tplm,pozitiflerinsayısı,negatiflerinsayısı,teklerinsayısı,çiftlerinsayısıbüyüksayı,küçüksayı,asalsayılarınsayısı, sayı , sayısayısı, ort , pozitiftoplam , bölenlertoplamı,basamaksayısı.
3.do-while döngüsü başlatılır. Bu sayede bir işlemin her defasında uygulanması ve belli bir koşula göre uygulandıktan sonra test edilmesi sağlanır.do{
4.işlem:
5.output:sayı girin.
6.Girdi:integer sayı
7.if:(sayı>0 or sayı<0 ) 8'den , else if(sayısayısı==0) 76'dan, else 77'den  devam et.
8.atama:sayısayısı=sayısayısı+1;
9.if:(sayı>0) 10'dan , else if (sayi<0) 12'den devam et.
10.atama:pozitiflerinsayısı=pozitiflerinsayısı+1

11.atama:pozitiftoplam=pozitiftoplam+sayı

12.atama:negatiflerinsayısı=negatiflerinsayısı+1
13.if (sayı%2==0) 14'den , else 15'den devam et.
14.atama:çiftlerinsayısı=çiftlerinsaysı+1

15.atama:teklerinsayısı =teklerinsayısı+1

16.if (sayısayısı==1) 17'den , else if (sayısayısı!=1) 19'dan devam et.
17.büyüksayı = sayı
18.küçüksayı=sayı
19.(bir önceki else if'in içinde) if(sayı>büyüksayı)20'den,(bir önceki else if'in içinde) else if (sayı<küçük sayı)21'den devam et.
20.büyüksayı=sayı
21.küçüksayı=sayı(tam olarak şimdi  16.satırdaki else if kapandı.)
22.atama: tplm =tplm+sayı
23.atama: sayısayısı =sayısayısı+1
24.atama: ort =tplm /sayısayısı
25.atama : poort =pozitiftoplam / posay
26.atama:Sayı asal mı değil mi işlemi

boolean flag =true
27.if (sayı>0) 28'den , else  38'den devam et.

28.for (int i =2 ; i<sayı ;i++) :for açıldı.

29.if (sayi%i==0) 30'dan , else 32'den devam et.
30.atama: flag =false 
31.break

32.atama:flag =true 

33.for kapandı.
34.if (flag) 35'ten ,else 37'den devam et.
35.output:"sayi asaldir."

36.atama:asalsayıalrınsayısı=asalsayılarınsayısı+1

37.output:"sayi asal degildir."
38.output : "Sayi asal degildir."

39.Mükemmel sayı mı değil mi işlemi:

if (sayı>0) 40'dan , else  48 'den devam et.

40.atama:bölenlertoplamı=0
41.for (int i=1;i<sayı;i++):for açıldı
42.if (sayı%i==0) 43'den , else 44'ten devam et.

43.bölenlertoplamı=bölenlertoplamı+1

44.bölenlertoplamı=bölenlertoplamı 
45.if (bölenlertoplamı==sayı) 46'dan , else 47'den devam et.
46.output:"sayi bir mukemmel sayidir."

47.output:"sayi bir mukemmel sayi değildir."

48.output:"Sayi pozitif olmadigi icin mukemmel degildir."
49.
50.basamak sayısı hesabı:
51.if (sayı>0) 52'den , else if (sayı<0) 64'ten devam et.
52.tanımlama-atama:boolean abc=true
53.atama-tanımlama:int i =1
54.atama-tanımlama:int basamaksayısı=0
55.
56.while döngüsü açılır:while (abc){                  *yani neticede elimize true halindeki abc ulaştığı sürece*
57.if (sayı>=i) 58'den , else  (sayı<0)  61 'den devam et.
58.atama:abc =true
59.atama:int i=i*10
60.atama :basamaksayısı=basamaksayısı+1

61.atama:abc=false

62.}whilekapanır.
63.output: "Girdiginiz sayi  "+ basamaksayısı +" basamaklidir."

64.tanımlama-atama:boolean abc=true
65.tanımlama-atama:int i =-1
66.tanımlama-atama: bassay=0
67.while(abc){                                             *while açılır ve abc değeri false olup döngüyü kırana kadar döngünün çalışmasına vesile olur.*
68.if (sayi<=i) 69'dan , else 72'den devam et.
69.atama : abc=true
70.atama:basamaksayısı=basamaksayısı+1
71.i=i*10

72.atama: abc=false

73.}while kapanır.
74.output:"Girdiginiz sayi  "+ basamaksayısı +" basamaklidir."
75.

76.output:"Girdiginiz ilk sayi 0 olursa programin bir anlami kalmaz cunku daha isleyebilecegi uygun bir sayi almadan kapanmis olur. 0 Girdiginiz icin program herhangi bir istattistik vermeden  kapanacak."

77.output:"program kapatiliyor."
78.atama-tanımlama:int fark=büyüksayı-küçüksayı
79.output:"pozitif sayıların sayısı: "+ pozitiflerinsayısı
80.output:"negatif sayilarin sayisi : " + negatiflerinsayısı
81.output:"tek sayilarin sayisi "+ teklerinsayısı
82.output:"cift sayilarin sayisi : " + çiftlerinsayısı
83.output:"En buyuk sayi: "+ büyüksayı
84.output:"En kucuk sayi: "+ küçüksayı
85.output:"En buyuk ve en kucuk sayilarin farki : " + fark
86.output:"Girilen sayilarin toplami : " + tplm
87.output:"Girilen sayilarin ortalamasi : " + ort
88.output:"Girilen pozitif sayilarin ortalamasi : "+ pozitifort
89.output:"Girilen sayilardan asal olanlarin sayisi : "+ asalsayılarınsayısı
90.}do kapanır.while(sayı>0 or sayı<0)  *yani bu do-while döngüsü sadece sayı değişkeni sıfırdan büyük ya da küçük olduğu durumlarda çalışır.
91.
```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Senaryoları (en az 8)

| No | Girilen sayılar | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 |5,0 |5:sayi asaldir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.
0:pozitif sayıların sayısı: 1
negatif sayilarin sayisi : 0
tek sayilarin sayisi 1
cift sayilarin sayisi : 0
En buyuk sayi: 5
En kucuk sayi: 5
En buyuk ve en kucuk sayilarin farki : 0
Girilen sayilarin toplami : 5
Girilen sayilarin ortalamasi : 5
Girilen pozitif sayilarin ortalamasi : 5
Girilen sayilardan asal olanlarin sayisi : 1 |5:sayi asaldir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.
pozitif sayıların sayısı: 1
negatif sayilarin sayisi : 0
tek sayilarin sayisi 1
cift sayilarin sayisi : 0
En buyuk sayi: 5
En kucuk sayi: 5
En buyuk ve en kucuk sayilarin farki : 0
Girilen sayilarin toplami : 5
Girilen sayilarin ortalamasi : 5
Girilen pozitif sayilarin ortalamasi : 5
Girilen sayilardan asal olanlarin sayisi : 1 |Evet |
| 2 |0 |Girdiginiz ilk sayi 0 olursa programin bir anlami kalmaz cunku daha isleyebilecegi uygun bir sayi almadan kapanmis olur. 0 Girdiginiz icin program herhangi bir istattistik vermeden  kapanacak. |Girdiginiz ilk sayi 0 olursa programin bir anlami kalmaz cunku daha isleyebilecegi uygun bir sayi almadan kapanmis olur. 0 Girdiginiz icin program herhangi bir istattistik vermeden  kapanacak. |Evet |
| 3 |6,3 |6:sayi asal degildir.
sayi bir mukemmel sayidir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.3:sayi asaldir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  1 basamaklidir. |6:sayi asal degildir.
sayi bir mukemmel sayidir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.3:sayi asaldir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  1 basamaklidir. |Evet |
| 4 |5,-8,6 ,0|5:sayi asaldir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.-8:Sayi asal degildir.
Sayi pozitif olmadigi icin mukemmel degildir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.6:sayi asal degildir.
sayi bir mukemmel sayidir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.0:program kapatiliyor.
pozitif sayıların sayısı: 2
negatif sayilarin sayisi : 1
tek sayilarin sayisi 1
cift sayilarin sayisi : 2
En buyuk sayi: 6
En kucuk sayi: -8
En buyuk ve en kucuk sayilarin farki : 14
Girilen sayilarin toplami : 3
Girilen sayilarin ortalamasi : 1
Girilen pozitif sayilarin ortalamasi : 5
Girilen sayilardan asal olanlarin sayisi : 1 |5:sayi asaldir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.-8:Sayi asal degildir.
Sayi pozitif olmadigi icin mukemmel degildir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.6:sayi asal degildir.
sayi bir mukemmel sayidir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.0:program kapatiliyor.
pozitif sayıların sayısı: 2
negatif sayilarin sayisi : 1
tek sayilarin sayisi 1
cift sayilarin sayisi : 2
En buyuk sayi: 6
En kucuk sayi: -8
En buyuk ve en kucuk sayilarin farki : 14
Girilen sayilarin toplami : 3
Girilen sayilarin ortalamasi : 1
Girilen pozitif sayilarin ortalamasi : 5
Girilen sayilardan asal olanlarin sayisi : 1  |Evet |
| 5 |4 |sayi asal degildir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.
 |sayi asal degildir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.
 |Evet |
| 6 |1,0 |1:
sayi asaldir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.0:program kapatiliyor.
pozitif sayıların sayısı: 1
negatif sayilarin sayisi : 0
tek sayilarin sayisi 1
cift sayilarin sayisi : 0
En buyuk sayi: 1
En kucuk sayi: 1
En buyuk ve en kucuk sayilarin farki : 0
Girilen sayilarin toplami : 1
Girilen sayilarin ortalamasi : 1
Girilen pozitif sayilarin ortalamasi : 1
Girilen sayilardan asal olanlarin sayisi : 1
 |1:
sayi asaldir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  1 basamaklidir.
sayi girin.0:program kapatiliyor.
pozitif sayıların sayısı: 1
negatif sayilarin sayisi : 0
tek sayilarin sayisi 1
cift sayilarin sayisi : 0
En buyuk sayi: 1
En kucuk sayi: 1
En buyuk ve en kucuk sayilarin farki : 0
Girilen sayilarin toplami : 1
Girilen sayilarin ortalamasi : 1
Girilen pozitif sayilarin ortalamasi : 1
Girilen sayilardan asal olanlarin sayisi : 1 |Evet |
| 7 |657 |sayi asal degildir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  3 basamaklidir.
sayi girin. |sayi asal degildir.
sayi bir mukemmel sayi degildir.
Girdiginiz sayi  3 basamaklidir.
sayi girin. | Evet|
| 8 |-657 |Sayi asal degildir.
Sayi pozitif olmadigi icin mukemmel degildir.
Girdiginiz sayi  3 basamaklidir.
sayi girin.
 |Command execution failed. |HAYIR |
//*program, eğer ilk girilen sayı negatif olursa hata veriyor ama bunu bi' türlü düzeltemedim.//*
## 6. Ek Görevler (Opsiyonel)
<-- Ek görevleri .hem program kodlarını yazarken hem de bo dosyayı oluşturuyorken diğerleri ile bir değerlendirdim. O sebeple az önce(yukarıda) , testleri ve sonuçlarını paylaşırken ,en sonunda "0" girilmiş tüm örneklerde ek görevlerin çıktılarını örnekledim.-->

