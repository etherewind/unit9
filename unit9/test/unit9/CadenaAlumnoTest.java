/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit9;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Araceli Teruel
 */
public class CadenaAlumnoTest {
    
    public CadenaAlumnoTest() {
    }

    /**
     * Test of sonIguales method, of class CadenaAlumno.
     */
    @Test
    public void testSonIguales() {
        boolean igualesDevuelta=CadenaAlumno.sonIguales("entornos", "ento");
        boolean real="entornos".equals("ento");
        assertEquals(real,igualesDevuelta);
        igualesDevuelta=CadenaAlumno.sonIguales("ento", "entornos");
        real="ento".equals("entornos");
        assertEquals(real,igualesDevuelta);
        igualesDevuelta=CadenaAlumno.sonIguales("entornos", "sonrotne");
        real="entornos".equals("sonrotne");
        assertEquals(real,igualesDevuelta);
        igualesDevuelta=CadenaAlumno.sonIguales("entornos", "entornos");
        real="entornos".equals("entornos");
    }

    /**
     * Test of esMayor method, of class CadenaAlumno.
     */
    @Test
    public void testEsMayor() {
    }

    /**
     * Test of esMenor method, of class CadenaAlumno.
     */
    @Test
    public void testEsMenor() {
    }

    /**
     * Test of comparaIgnorandoMayusculas method, of class CadenaAlumno.
     */
    @Test
    public void testComparaIgnorandoMayusculas() {
    }

    /**
     * Test of reemplazaTodos method, of class CadenaAlumno.
     */
    @Test
    public void testReemplazaTodos() {
    }

    /**
     * Test of reemplazaPrimero method, of class CadenaAlumno.
     */
    @Test
    public void testReemplazaPrimero() {
    }

    /**
     * Test of muestraSplitLimite method, of class CadenaAlumno.
     */
    @Test
    public void testMuestraSplitLimite() {
    }

    /**
     * Test of muestraSplit method, of class CadenaAlumno.
     */
    @Test
    public void testMuestraSplit() {
    }

    /**
     * Test of quitaEspacios method, of class CadenaAlumno.
     */
    @Test
    public void testQuitaEspacios() {
    }

    /**
     * Test of convertirMayusculas method, of class CadenaAlumno.
     */
    @Test
    public void testConvertirMayusculas() {
    }

    /**
     * Test of convertirMinusculas method, of class CadenaAlumno.
     */
    @Test
    public void testConvertirMinusculas() {
    }

    /**
     * Test of longitudCadena method, of class CadenaAlumno.
     */
    @Test
    public void testLongitudCadena() {
    }

    /**
     * Test of empiezaCon method, of class CadenaAlumno.
     */
    @Test
    public void testEmpiezaCon() {
    }

    /**
     * Test of acabaEn method, of class CadenaAlumno.
     */
    @Test
    public void testAcabaEn() {
    }

    /**
     * Test of posicionPrimeraCadena method, of class CadenaAlumno.
     */
    @Test
    public void testPosicionPrimeraCadena() {
    }

    /**
     * Test of extraerSubstring method, of class CadenaAlumno.
     */
    @Test
    public void testExtraerSubstring_String_int() {
    }

    /**
     * Test of extraerSubstring method, of class CadenaAlumno.
     */
    @Test
    public void testExtraerSubstring_3args() {
    }

    /**
     * Test of concatenaCadenas method, of class CadenaAlumno.
     */
    @Test
    public void testConcatenaCadenas() {
    }
    
}