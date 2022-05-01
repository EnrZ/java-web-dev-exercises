package exercises.technology;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;
import org.junit.Before;

public class Program {

    Computer hp;
    Computer hp2;
    Laptop macbook;
    Laptop thinkpad;
    SmartPhone iphone;

    @Before
            public void createObjects() {
         hp = new Computer(500, 16, "HP");
        hp2 = new Computer(500, 16, "HP");
        macbook = new Laptop(500, 16, "Apple Macbook", 1.9);
        thinkpad = new Laptop(500, 16, "Lenovo Thinkpad", 5.1);
        iphone = new SmartPhone(64, 4, "Apple iPhone",50);
        //Laptop lap = new Laptop(500, 8, false,)
    }

    @Test
    public void testID(){
        assertFalse(hp.equals(hp2));

        //hp2 was created right after hp1, its id should be 1 more based on how I
        //created the id so this is equal
        assertEquals(hp.getId(),hp2.getId()-1);
    }

    @Test
    public void testBrandMethod(){
        assertEquals("HP", hp.getBrand());
    }

    @Test
    public void testIncreaseRAM(){
        hp.increaseRAM(8);
        assertEquals(24, hp.getRam());
    }

    @Test
    public void laptopTestClunkyMethod(){
        assertFalse(macbook.isClunky());
        assertTrue(thinkpad.isClunky());
    }

    @Test
    public void testAppDownloading(){
        iphone.downloadApp();
        //after downloading another app from the 50 of this instance, this is equal
        assertEquals(51, iphone.getAppsDownloaded());
    }
}
