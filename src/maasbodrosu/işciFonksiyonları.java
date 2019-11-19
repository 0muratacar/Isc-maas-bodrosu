package maasbodrosu;

/**
 *
 * @author murat
 */
public class işciFonksiyonları extends İşcilerBilgi {
    
public void hazırİşciler(){                                                     ///////////////////////////////////////////////////////////////
        
        setişciİsim("murat acar");
        setçocukSayısı(2);
        setbrütMaaş(1134);
            
        this.işciİsimleri.add(getişciİsim());
        this.brütMaaşları.add(getbrütMaaş());
        this.çocukSayıları.add(getçocukSayısı());
        
        ///////////////////////////////////////////
        
        setişciİsim("fatih acar");                                              ////////////////////     VAROLAN İŞCİLER    ////////////////////
        setçocukSayısı(1);
        setbrütMaaş(3000);
            
        this.işciİsimleri.add(getişciİsim());
        this.brütMaaşları.add(getbrütMaaş());
        this.çocukSayıları.add(getçocukSayısı());
        
        ///////////////////////////////////////////
        
        setişciİsim("mehmet acar");
        setçocukSayısı(0);
        setbrütMaaş(3500);
            
        this.işciİsimleri.add(getişciİsim());
        this.brütMaaşları.add(getbrütMaaş());                               
        this.çocukSayıları.add(getçocukSayısı());                               ///////////////////////////////////////////////////////////////    
}                                                                               //***********************************************************//
                                                                                ///////////////////////////////////////////////////////////////
    
    void işciSil()                                                              
    {
        int j=10;
        int indis = 10;
        System.out.print("İşci ismini giriniz : ");                             
        String adı = input.nextLine();
        for(int i=0; i<this.işciİsimleri.size();i++)
        {
            if(adı.equals(this.işciİsimleri.get(i)))
            {
                indis=i;                                                        /////////////////      İŞCİ SİLME METODU       /////////////////
                j=0;                
            }
        }
        if(j==0){
            this.işciİsimleri.remove(indis);                                    
            this.brütMaaşları.remove(indis);
            this.çocukSayıları.remove(indis);
            System.out.println("Silme islemi Basariyla Tamamlandi!");
        }
        else
            System.out.println("Böyle bir işci yok.");           
    }     
                                                                                ///////////////////////////////////////////////////////////////
                                                                                //***********************************************************//
                                                                                ///////////////////////////////////////////////////////////////
    void işciEkle(){
        
        System.out.print("İşci Ad Soyad Giriniz : ");
        String isim = input.nextLine();                
        //System.out.println("\n");
                
        System.out.print("İşci maaşı Giriniz : ");
        int maaş = input.nextInt();                                             ////////////////////     İŞCİ EKLEME METODU    ////////////////////
        System.out.print("İşci çocuk sayisini Giriniz : ");
        int çocuksay = input.nextInt();
        
        this.işciİsimleri.add(isim);
        this.brütMaaşları.add(maaş);
        this.çocukSayıları.add(çocuksay);
       
        System.out.println("işci Eklendi!");                                    ///////////////////////////////////////////////////////////////
                                                                                //***********************************************************//                                                                                                                                   
    }                                                                           ///////////////////////////////////////////////////////////////

    public void işcileriListele()
    {
               
            for(int i =0; i<this.işciİsimleri.size();i++)
            {
            System.out.println( "- Ad Soyad :  "                                ///////////////////     İŞCİLERİ LİSTELEME    ///////////////////
                +this.işciİsimleri.get(i)+
                "- maaşı : "
                +this.brütMaaşları.get(i)+     
                 "- çocuk sayisi : "   
                +this.çocukSayıları.get(i));
            }                                                                   ///////////////////////////////////////////////////////////////   
    }                                                                           //***********************************************************//  
}                                                                               ///////////////////////////////////////////////////////////////

  

