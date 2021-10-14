package tests.day09;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C04_WindowHandle extends TestBase {

@Test
    public void test(){
    //    ● Tests package’inda yeni bir class olusturun: C04_WindowHandle
//● https://the-internet.herokuapp.com/windows adresine gidin.

    driver.get("https://the-internet.herokuapp.com/windows");

//            ● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
String actualYaziElementi=driver.findElement(By.tagName("h3")).getText();
String expectedYazi="Opening a new window";
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertEquals(actualYaziElementi,expectedYazi,"yazi istendiği gibi değil");




//            ● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
String actualTitle=driver.getTitle();
String expectedTitle="The Internet";
    softAssert.assertEquals(actualTitle,expectedTitle,"title istenen değerden farkli");



//            ● Click Here butonuna basın.
    driver.findElement(By.linkText("Click Here")).click();
//            ● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
driver.switchTo().window("");
    String actualYeniTitle=driver.getTitle();
String expectedYeniTitle="New Window";
softAssert.assertEquals(actualYeniTitle,expectedYeniTitle,"yenş sayfanın title ı yanlış");
    softAssert.assertAll();
//            ● Sayfadaki textin “New Window” olduğunu doğrulayın.
//            ● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.


}

}
