-MURAT ACAR->mrtacr2534@gmail.com


Bu projede bir iş yeri için,
1-işci girişi
2-işcileri listeleme
3-işci çıkarma
4-işci maaş bodrosu yazdırma gibi işlemler kodlanmıştır.

Ana menümüz :  (Maasbodrosu.java) yukarıda saydığım menüler ve çıkış fonksiyonu switch case metodu ile
yazılmıştır. 
İşcilerBilgi adlı classdan işci adında bir nesne,
işciFonksiyonları adlı classdan işciFonks adlı bir nesne,
maasBodroHesapFonksiyonları adlı classdan ise maasHesap adında bir nesne oluşturulmuştur.

İşcilerBilgi classımız : Private türünde işciİsim, çocukSayısı, brütMaaş adlı değişkenler tutulmuş ve getter
setter metodları ile erişilebilirliği düzenlenmiştir.
işciİsimleri, çocukSayıları ve brütMaaşları adlı arraylistlerimizde bu değişkenler sıralanmıştır.

işciFonksiyonları classımız : İşcilerBilgi classından miras alan bu sınıf işcilerle ilgili,
hazırİşciler() : sisteme hazır 3 işci ve bilgilerini girer.
işcileriListele() : tüm işcileri bilgileriyle yazdırır.
işciEkle() : işci isim soyisim, brüt maaş ve çocuk sayısını alarak ekler.
işciSil() : işten çıkarılacak işciyi programdan siler.

maasBodroBilgi classımız : bodrodaki mali vergilerin değişkenlerinin public olarak tutulduğu kısımdır.
işciFonksiyonlarından daha sonra kullanılmak için miras alır.

maasBodroHesapFonksiyonları classımız : maasBodroBilgi classından miras alır. Structer metod ile değer 
olarak işciFonksiyonları classından bir nesne alır. Bu nesne istenilen isme göre maaşdaki vergileri hesaplamada kullanılır.
Bu classda işci vergi,kesinti ve agi hesaplanarak hem ekrana hem de txt dosyasına yazdırır.



