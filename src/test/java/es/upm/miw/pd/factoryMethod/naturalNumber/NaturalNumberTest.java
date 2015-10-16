package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class NaturalNumberTest {
    
    NaturalNumberManager naturalNumberManager;
    
    @Before
    public void before() {
        this.naturalNumberManager = new NaturalNumberManager();
    }

    @Test
    public void testNaturalNumberCreatorES() {
        this.naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        this.naturalNumberManager.createNaturalNumber(1);
        NaturalNumber naturalNumber = this.naturalNumberManager.getNaturalNumber();
        assertEquals("uno", naturalNumber.getTextValue());
    }
    
    @Test
    public void testNaturalNumberCreatorESOutOfBounds() {
        this.naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        this.naturalNumberManager.createNaturalNumber(6);
        NaturalNumber naturalNumber = this.naturalNumberManager.getNaturalNumber();
        assertEquals("???", naturalNumber.getTextValue());
    }
    
    @Test
    public void testNaturalNumberCreatorEN() {
        this.naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEnCreator());
        this.naturalNumberManager.createNaturalNumber(2);
        NaturalNumber naturalNumber = this.naturalNumberManager.getNaturalNumber();
        assertEquals("two", naturalNumber.getTextValue());
    }

    @Test
    public void testNaturalNumberCreatorENOutOfBounds() {
        this.naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEnCreator());
        this.naturalNumberManager.createNaturalNumber(6);
        NaturalNumber naturalNumber = this.naturalNumberManager.getNaturalNumber();
        assertEquals("???", naturalNumber.getTextValue());
    }
    
    @Test
    public void testNaturalNumberCreatorFR() {
        this.naturalNumberManager.setNaturalNumberCreator(new NaturalNumberFrCreator());
        this.naturalNumberManager.createNaturalNumber(5);
        NaturalNumber naturalNumber = this.naturalNumberManager.getNaturalNumber();
        assertEquals("cinq", naturalNumber.getTextValue());
    }

    @Test
    public void testNaturalNumberCreatorFROutOfBounds() {
        this.naturalNumberManager.setNaturalNumberCreator(new NaturalNumberFrCreator());
        this.naturalNumberManager.createNaturalNumber(6);
        NaturalNumber naturalNumber = this.naturalNumberManager.getNaturalNumber();
        assertEquals("???", naturalNumber.getTextValue());
    }
    
}