/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lokesh
 */
public class Splashclass {

    public static void main(String[] args) {
      // TODO code application logic her  
      Splash sp =new Splash();
        sp.setVisible(true);
        Login l=new Login();
         
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                sp.pgnum.setText(Integer.toString(i)+"%");
                sp.pgbar.setValue(i);
                if(i==100){
                    sp.setVisible(false);
                    l.setVisible(true);
                }
        }
        }
        catch(Exception e){
            
        }
    }
    
}