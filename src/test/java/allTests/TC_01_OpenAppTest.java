package allTests;

import org.testng.annotations.Test;

public class TC_01_OpenAppTest extends SetCapabilitiesForTests {


    //Opening the app splash screen
    @Test
    public void SplashScreen(){
        try{
            System.out.println("Application Started");
        }catch (Exception e){
            e.getCause();
            e.getMessage();
            e.getStackTrace();
        }

    }



}
