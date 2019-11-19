package maasbodrosu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author murat
 */
public class İşcilerBilgi 
{      
    Scanner input = new Scanner(System.in);

    private String işciİsim;
    private int çocukSayısı;
    private int brütMaaş; 
                                                                                ///////////////////////////////////////////////////////////////
    ArrayList işciİsimleri = new ArrayList();
    ArrayList çocukSayıları = new ArrayList();                                  //////////               ARRAYLİSTLERİMİZ           //////////
    ArrayList brütMaaşları = new ArrayList();
    
                                                                                ///////////////////////////////////////////////////////////////
    public void setişciİsim(String isim){                                       //***********************************************************//
        this.işciİsim=isim;                                                     ///////////////////////////////////////////////////////////////
    }                                                                           
    public String getişciİsim(){
        return işciİsim;
    }
    
    public void setçocukSayısı(int çocuksayısı){
        this.çocukSayısı=çocuksayısı;        
    }                                                                           //////    GETTER-SETTER METODLARI (PRIVATE DEGİSKENLER)   //////
    public int getçocukSayısı(){
        return çocukSayısı;
    }
    
    public void setbrütMaaş(int brütmaaş){
        this.brütMaaş=brütmaaş;        
    }
    public int getbrütMaaş(){
        return brütMaaş;
    }                              
                                      
}                                                                               
                                                                              
    

