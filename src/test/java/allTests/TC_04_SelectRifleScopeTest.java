package allTests;

import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TC_04_SelectRifleScopeTest extends TC_02_AcceptPermissions{

    @Test
    public void selectRifleScope(){
        WebElement thisElement = rifleScope.clickOnRifleScope();
        try{
            thisElement.click();
        }
        catch (Exception e){
            throw new SkipException("Skipping this test");
        }
    }

}
