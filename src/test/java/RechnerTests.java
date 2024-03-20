import org.Rechner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RechnerTests {

    @Test
    public void additionTest(){
        Rechner rechner = new Rechner();
        double additionsergebnis = rechner.addition(3.5, 150);
        Assertions.assertEquals(153.5, additionsergebnis);
    }

    @Test
    public void subtraktionTest(){
        Rechner rechner = new Rechner();
        double subtraktionsergebnis = rechner.subtraktion(100, 25);
        Assertions.assertEquals(75, subtraktionsergebnis);
    }

    @Test
    public void multiplikationTest(){
        Rechner rechner = new Rechner();
        double multiplikationsergebnis = rechner.multiplikation(3, 55);
        Assertions.assertEquals(165, multiplikationsergebnis);
    }

    @Test
    public void divisionTest(){
        Rechner rechner = new Rechner();
        double divisionsergebnis = rechner.division(150, 50);
        Assertions.assertEquals(4, divisionsergebnis);  //failed!
    }


}
