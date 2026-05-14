package ro.ase.cts.clase;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testGetGen() {
        Persoana persona = new Persoana("Razvan","123456789");
        Assert.assertEquals("M",persona.getGen());

    }

    @org.junit.Test
    public void testGetGenFemininDupa2000() {
        Persoana persona1 = new Persoana("Andreea","6041212238955");
        Assert.assertEquals("F",persona1.getGen());
    }


    @Test
    public void testCheckCNP() {
        Persoana persona1 = new Persoana("Razvan","1871013418953");
        Assert.assertTrue( persona1.checkCNP());
    }

    @Test
    public void testgetGenBoundaryInferior2000() {
        Persoana persona1 = new Persoana("Razvan","5000101232182");
        Assert.assertEquals("M",persona1.getGen());
    }

    @Test
    public void testGetVarstaNascutaAzi() {
        Persoana persona1 = new Persoana("Razvan","5261205234570");
        Assert.assertEquals(0,persona1.getVarsta());
    }

    @Test
    public void testGetGenCrossCheck() {
        String cnp = "5261205234570";
        Persoana persoana = new Persoana("Razvan",cnp);

        String expected = persoana.getGen();
        int primulNumar = Integer.parseInt(String.valueOf(cnp.charAt(0)));
        String actual = primulNumar % 2 == 0 ? "F" : "M";

        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEroareLungimeCNP() {
        Persoana persoana = new Persoana("Razvan","526120534570");
        persoana.checkCNP();
    }
}