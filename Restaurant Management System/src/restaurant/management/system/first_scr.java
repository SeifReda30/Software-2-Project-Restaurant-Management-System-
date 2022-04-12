/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.management.system;

/**
 *
 * @author DELL
 */
public class first_scr {

    public first_scr() {
        splash sp = new splash();
        sp.setVisible(true);
        try
        {
            for (int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                sp.jLabel1.setText(Integer.toString(i)+"%");
                sp.jProgressBar1.setValue(i);
                if (i==100)
                {
                    sp.setVisible(false);
                    welcome scr = new welcome ();
                    scr.setVisible(true);
                }
            }
        }
        catch(Exception e)
        {
            
        }
    }
    
    
}
