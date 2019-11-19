/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maasbodrosu;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author murat
 */
public class maasBodroHesapFonksiyonları extends maasBodroBilgi {
    void maasBodroHesapFonksiyonları(işciFonksiyonları a)
    {
        
        
    int j=10;
    int indis = 10;

        System.out.println("Maaş bodrosunu görüntülemek istediğiniz işcinin isim bilgilerini giriniz:");
        String isim = input.nextLine();
        
        for(int i=0; i<a.işciİsimleri.size();i++)
        {           
            if(isim.equals(a.işciİsimleri.get(i)))
            {
                indis=i;j=0;                               
            }
        }
        /////////////////////////---------- BURADAN AŞAĞISI VERGİLER İLE İLGİLİ HESAPLAMALAR VE YAZDIRMA KISMI--------///////////////////
        if(j==0)
        {
            int maaş = (int)a.brütMaaşları.get(indis);
            System.out.println(a.işciİsimleri.get(indis)+" işcisinin -->>\n");
                      
            ssk_prim=(maaş*14)/100;                                             System.out.println("ssk primi "+ssk_prim);
            işsizlik_sigortası=maaş/100;                                        System.out.println("işsizlik sigortası "+işsizlik_sigortası);
            gelirVergisi_matrahı=maaş-(ssk_prim+işsizlik_sigortası);            System.out.println("gelir vergisi matrahı  "+gelirVergisi_matrahı);
            gelir_vergisi=(15*(gelirVergisi_matrahı))/100;                      System.out.println("gelir vergisi  "+gelir_vergisi);
            damga_vergisi=(maaş*8)/100;                                         System.out.println("damga vergisi "+damga_vergisi);
            top_kesinti=ssk_prim+işsizlik_sigortası+gelir_vergisi+damga_vergisi;System.out.println("toplam kesinti "+top_kesinti);
            System.out.println("\n --AGİ-- \n");
            
            kendi_agi=gelirVergisi_matrahı/2;                                   System.out.println("işci agi "+kendi_agi);                           
            eş_agi=gelirVergisi_matrahı/10;                                     System.out.println("eşi için agi "+eş_agi);
            
            if((int)a.çocukSayıları.get(indis)!=0)                              ///////---ÇOCUĞU VARSA BU İŞLEME GİRİYOR-----///////
            {
            çocuk1_agi=gelirVergisi_matrahı/10;                                 System.out.println("birinci çocuk agi "+çocuk1_agi);
            çocuk2_agi=gelirVergisi_matrahı/10;                                 System.out.println("ikinci çocuk agi "+çocuk2_agi);
            }
            
            agi_matrahı=kendi_agi+eş_agi+çocuk1_agi+çocuk2_agi;                 System.out.println("agi matrahı "+agi_matrahı);
            agi=(agi_matrahı*15)/100;                                           System.out.println("agi "+agi);
            net_maaş=maaş-top_kesinti+agi;                                      System.out.println("net maaş "+net_maaş);
            
        try {                                                                   ////////////////////////////////////////////////////////////////////////////////
            PrintWriter yaz = new PrintWriter("C:/Users/murat/Desktop/bodro.txt");
            yaz.println(a.işciİsimleri.get(indis)+" işcisinin -->>\n");
            yaz.println("ssk primi "+ssk_prim+"TL");
            yaz.println("işsizlik sigortası "+işsizlik_sigortası+"TL");
            yaz.println("gelir vergisi matrahı  "+gelirVergisi_matrahı+"TL");
            yaz.println("gelir vergisi  "+gelir_vergisi+"TL");
            yaz.println("damga vergisi "+damga_vergisi+"TL");
            yaz.println("toplam kesinti "+top_kesinti+"TL");
            yaz.println("\n --AGİ-- \n");
            yaz.println("işci agi "+kendi_agi+"TL");                            ///////-------------    BODROYU DOSYAYA YAZMA İŞLEMİ    ///////-------------
            yaz.println("eşi için agi "+eş_agi+"TL");
            yaz.println("birinci çocuk agi "+çocuk1_agi+"TL");
            yaz.println("ikinci çocuk agi "+çocuk2_agi+"TL");
            yaz.println("agi matrahı "+agi_matrahı+"TL");
            yaz.println("agi "+agi+"TL");
            yaz.println("\nNET MAAŞ "+net_maaş+"TL");
            
            yaz.close();
            
            
        } catch (Exception ex) {
            System.out.println("hata : "+ex);
        }                                                                       ////////////////////////////////////////////////////////////////////////////////        
        }
        
        else
            System.out.println("Böyle bir işcimiz yok.");       
    }
}
