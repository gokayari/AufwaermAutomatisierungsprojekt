import org.Rechner;
import org.junit.jupiter.api.*;

public class RechnerTests {

    Rechner rechner;    //Um zu vermeiden, dass es in jeder Methode separat erstellt wird

    @BeforeAll
    public static void setupClass(){
        System.out.println("Die SetupClass-Methode wurde ausgeführt");
    }

    @BeforeEach
    public void setup(){
        rechner = new Rechner();
        System.out.println("Die Setup-Methode wurde ausgeführt");
    }

    @Test
    public void additionTest(){
        //Rechner rechner = new Rechner();
        double additionsergebnis = rechner.addition(3.5, 150);
        Assertions.assertEquals(153.5, additionsergebnis);
    }

    @Test
    public void subtraktionTest(){
        //Rechner rechner = new Rechner();
        double subtraktionsergebnis = rechner.subtraktion(100, 25);
        Assertions.assertEquals(75, subtraktionsergebnis);
    }

    @Test
    public void multiplikationTest(){
        //Rechner rechner = new Rechner();
        double multiplikationsergebnis = rechner.multiplikation(3, 55);
        Assertions.assertEquals(165, multiplikationsergebnis);
    }

    @Disabled("Der Division-Test wurde aufgrund eines Fehlers deaktiviert. Wird behoben und erneut ausgeführt!")
    @Test
    public void divisionTest(){
        //Rechner rechner = new Rechner();
        double divisionsergebnis = rechner.division(150, 50);
        Assertions.assertEquals(4, divisionsergebnis);  //failed!
    }

    @AfterEach
    public void teardown(){
        System.out.println("Die teardown-Methode wurde ausgeführt");
    }

    @AfterAll
    public static void teardownClass(){
        System.out.println("Die teardownClass-Methode wurde ausgeführt");
    }


}
