package Practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class P01 {

    @Test(priority = -1)@Ignore
    public void Aybar(){
        System.out.println("Aybar Method'u çalıştı");
    }

    @Test
    public void Ugur(){
        System.out.println("Ugur Method'u çalıştı");
    }

    @Test(priority = -1  )
    public void Mert(){
        System.out.println("Mert Method'u çalıştı");
    }

    @Test(dependsOnMethods = "Ugur")
    public void Beyza(){
        System.out.println("Beyza Method'u çalıştı");
    }
}
