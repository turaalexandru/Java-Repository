package staticKeyboard;

import org.testng.annotations.Test;

public class StaticClass {

    @Test
    public void methodTest(){
        Elev Stefan = new Elev("Stefan", "Stalin", 33);
        Stefan.prezentare();
        System.out.println("============================");
        Elev Ana = new Elev("Ana", "Malarie", 35);
        Ana.prezentare();
    }
}
