package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P02_Befor_After {

    @BeforeClass  // Tüm testlerden önce 1 kere çalışır
    public void setUp(){
        System.out.println("Tüm Testler Çalıştırılmaya başlanıyor");
    }

    @Test
    public void wise(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
    }

    @AfterClass
    public void tearDown(){
        System.out.println("Çalıştırılabilecek tüm testler çalıştırıldı");
        Driver.quitDriver();
    }
}
