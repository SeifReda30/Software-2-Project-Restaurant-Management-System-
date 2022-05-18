package Controllers;

import Views.*;

public class WelcomeScreensLoading {

    public static void main(String[] args) {
        FirstWelcomeScreenLoading();
        SecondWelcomeScreenLoading();
    }
    
    public static void FirstWelcomeScreenLoading(){
        FirstWelcomeScreen LoadingScreen = new FirstWelcomeScreen();
        LoadingScreen.setVisible(true);
        try{
        for (int i=0;i<=100;i++){   
            Thread.sleep(40);
            LoadingScreen.LoadingPercentage.setText(Integer.toString(i)+"%");
            LoadingScreen.Loadingbar.setValue(i);
            if (i==100) LoadingScreen.setVisible(false); }
        }catch(Exception ex){}
    }
    
    public static void SecondWelcomeScreenLoading(){
        welcome scr = new welcome ();
        scr.setVisible(true);
    }
}