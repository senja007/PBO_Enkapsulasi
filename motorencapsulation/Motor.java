/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorencapsulation;

/**
 *
 * @author senja007
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private boolean limitKecepatan = false;
    
    public void nyalakanMesin(){
    kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        Limit();
        if (limitKecepatan == false) {
            if (kontakOn == true) {
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan tidak bisa bertambah karena mesin OFF! \n");
            }
        }
    }
    
    public void kurangiKecepatan(){
        if (kontakOn == true){
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin ON \n");
        }
    }
    
     public void Limit(){
        if(kecepatan >= 100){
            limitKecepatan = true;
            System.out.println("Kecepatan Mencapai Batas");
        }
    }
    
    public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak ON");
        } else {
            System.out.println("Kontak OFF");
        }
        System.out.println("kecepatan " + kecepatan+"\n");
    }
    
}
