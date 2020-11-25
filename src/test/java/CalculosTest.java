import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.HashMap;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Calculos.class)
public class CalculosTest {

    Calculos calculos;

    @Before
    public void setup(){
        this.calculos = new Calculos();
    }

    @Test
    public void calcularAreaTrianguloRetangulo() throws Exception {
        System.out.println("============ calcularAreaTrianguloRetangulo ============");
//        arrange
        float atual;
        float esperado = 220;
//        act
        atual = this.calculos.calcularAreaTrianguloRetangulo(11,40);
//        assert
        Assert.assertEquals(esperado, atual, 0);
    }

    @Test(expected = Exception.class)
    public void calcularAreaTrianguloRetanguloComBaseNegativa() throws Exception {
        System.out.println("============ calcularAreaTrianguloRetangulo ============");
//        arrange
        float atual = 0;
        float esperado = 220;
//        act
        atual = this.calculos.calcularAreaTrianguloRetangulo(-11,40);
    }

    @Test(expected = Exception.class)
    public void calcularAreaTrianguloRetanguloComAlturaNegativa() throws Exception {
        System.out.println("============ calcularAreaTrianguloRetangulo ============");
//        arrange
        float atual = 0;
        float esperado = -220;
//        act
        atual = this.calculos.calcularAreaTrianguloRetangulo(11,-40);
    }

    @Test
    public void calcularVolumeDoPrisma() throws Exception {
        System.out.println("============ calcularVolumeDoPrisma ============");
//        arrange
        double atual = 0.0;
        double esperado = 600;
//        act
        atual = this.calculos.calcularVolumeDoPrisma(30,20);
//        assert
        Assert.assertEquals(esperado, atual, 0);
    }

    @Test(expected = Exception.class)
    public void calcularAreaRetanguloComAreaDaBaseNegativa() throws Exception {
        System.out.println("============ calcularAreaRetanguloComAreaDaBaseNegativa ============");
//        arrange
        double atual = 0.0;
        double esperado = -600;
//        act
        atual = this.calculos.calcularVolumeDoPrisma(-30,20);
    }

    @Test(expected = Exception.class)
    public void calcularAreaRetanguloComAlturaNegativa() throws Exception {
        System.out.println("============ calcularAreaRetanguloComAlturaNegativa ============");
//        arrange
        double atual = 0.0;
        double esperado = -600;
//        act
        atual = this.calculos.calcularVolumeDoPrisma(30,-20);
    }

    @Test
    public void calcularBhaskara() throws Exception {
        System.out.println("============ calcularBhaskara ============");
//        arrange
        HashMap<String, Float> esperado = new HashMap();
        esperado.put("x1",(float) -5);
        esperado.put("x2",(float) -19);
//        act
        HashMap<String, Float> atual = this.calculos.calcularBhaskara(1,12,-13);
//        assert
        Assert.assertEquals(esperado.get("x1"), atual.get("x1"));
        Assert.assertEquals(esperado.get("x2"), atual.get("x2"));
    }

    @Test(expected = Exception.class)
    public void calcularBhaskaraComDeltaNegativo() throws Exception {
        System.out.println("============ calcularBhaskaraComDeltaNegativo ============");
//        arrange
        Calculos spy = PowerMockito.spy(this.calculos);
        PowerMockito.when(spy.calcularDelta(1,12,-13)).thenReturn(-10);
//        act
        spy.calcularBhaskara(1,12,-13);
    }

    @Test
    public void calcularBhaskaraComDeltaIgualAZero() throws Exception {
        System.out.println("============ calcularBhaskaraComDeltaNegativo ============");
//        arrange
        HashMap<String, Float> esperado = new HashMap();
        esperado.put("x1",(float) -12);
        esperado.put("x2",(float) -12);
        Calculos spy = PowerMockito.spy(this.calculos);
        PowerMockito.when(spy.calcularDelta(1,12,-13)).thenReturn(0);
//        act
        HashMap<String, Float> atual = spy.calcularBhaskara(1,12,-13);
//        assert
        Assert.assertEquals(esperado.get("x1"), atual.get("x1"));
        Assert.assertEquals(esperado.get("x2"), atual.get("x2"));
    }

    @Test
    public void calcularIMC() throws Exception {
        System.out.println("============ calcularBhaskaraComDeltaNegativo ============");
//        arrange
        double atual = 0;
        double esperado = 0;
//        act
        this.calculos.calcularIMC(98, 1.72);
//        Assert
        Assert.assertEquals(esperado, atual, 0);
    }

    @Test(expected = Exception.class)
    public void calcularIMCComPesoNegativo() throws Exception {
        System.out.println("============ calcularBhaskaraComDeltaNegativo ============");
//        arrange
        double atual = 0;
        double esperado = 0;
//        act
        this.calculos.calcularIMC(-98, 1.72);
    }

    @Test(expected = Exception.class)
    public void calcularIMCComAlturaNegativo() throws Exception {
        System.out.println("============ calcularBhaskaraComDeltaNegativo ============");
//        arrange
        double atual = 0;
        double esperado = 0;
//        act
        this.calculos.calcularIMC(98, -1.72);
    }
}
