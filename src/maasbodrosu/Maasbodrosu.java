package maasbodrosu;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author murat
 */
public class Maasbodrosu
{
    static Scanner input = new Scanner(System.in);

 
    public static void main(String[] args) throws InterruptedException
    {
        İşcilerBilgi işci = new İşcilerBilgi();
        işciFonksiyonları işciFonks =new işciFonksiyonları();
        maasBodroHesapFonksiyonları maasHesap = new maasBodroHesapFonksiyonları();
                       
        int seçim = MenüGetir();                                                //  seçilen menüye göre swith case yapısı ile işleme giriliyor.  //
        işciFonks.hazırİşciler();
        if(seçim!=6)
        {
            while(seçim!=5)
            {
                switch(seçim)
                {
                    case 1:
                        işciFonks.işciEkle();
                        break;               
                    case 2:
                        işciFonks.işciSil();                                    
                        break;
                    case 3:                          
                        işciFonks.işcileriListele();
                        break;
                    case 4:
                        maasHesap.maasBodroHesapFonksiyonları(işciFonks);
                        break;                       
                    case 5:
                        Çıkış();
                    default:
                System.out.println("Yanlis secim yaptiniz!");       
                }
                
                TimeUnit.SECONDS.sleep(1);                                      //  Menü tekrarlanırken 1 saniye bekletiyorum.  //   
                
                seçim = MenüGetir();
                if(seçim==5)
                    Çıkış();   
            }  
        }        
    }
    
///////////////////////   MENÜ VE ÇIKIŞ FONKSİYONLARI   //////////////////////// 
    static int MenüGetir()
    {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Seçiminizi yapınız : \n");
        
        System.out.println("-1- İŞCİ EKLE");
        System.out.println("-2- İŞCİ SİL");                                     
        System.out.println("-3- İŞCİ LİSTELE");
        System.out.println("-4- MAAŞ BODROSU GÖSTER");
        System.out.println("-5- ÇIK");
        
        int seçim = input.nextInt();
        return seçim;        
        
    }
    static void Çıkış()
    {     
        System.out.println("Programdan çıkıldı...");      
    }
////////////////////////////////////////////////////////////////////////////////       
}
