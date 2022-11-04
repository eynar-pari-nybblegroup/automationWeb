package basicJunit;

import org.junit.jupiter.api.*;

public class BasicJunit {
    @BeforeEach
    public void setup(){
        System.out.println("setup");
    }

    @AfterEach
    public void cleanup(){
        System.out.println("cleanup");
    }

    @Test
    public void verifySomething(){
        System.out.println("test1");

    }

    @Test
    @Tag("Regression")
    public void verifySomething2(){

        System.out.println("test2");
    }

}
