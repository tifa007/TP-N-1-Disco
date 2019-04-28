package ar.edu.unlam.pb2.Disco;

import org.junit.Assert;
import org.junit.Test;

public class TestDisco {
	@Test
	public void testoGetSetYConstructor() {
		Disco miDisco = new Disco();
		Disco miOtroDisco = new Disco(5f, 8f);
		miDisco.setRadioExterior(9f);
		miDisco.setRadioInterior(4.5f);
		Assert.assertEquals(miDisco.getRadioInterior(), 4.5f, 0.1f);
		Assert.assertEquals(miOtroDisco.getRadioExterior(), 8f, 0.1f);
	}
	
	@Test
	public void testPerimetroInterno() {
		Disco miDisco = new Disco(3f,9f);
		Float radioInterno = miDisco.getRadioInterior();
		Float perimetroInterno = miDisco.calculoDelPerimetroInterior(radioInterno);
		Float perimetroManual = (float)(Math.PI*3f*2f);
		Assert.assertEquals(perimetroInterno, perimetroManual, 0.1f);
		//System.out.println("Perimetro Int: "+perimetroInterno);
	}
	
	@Test
	public void testPerimetroExterno() {
		Disco miDisco = new Disco(3f,9f);
		Float radioExterno = miDisco.getRadioExterior();
		Float perimetroExterno = miDisco.calculoDelPerimetroExterior(radioExterno);
		Float perimetroManual = (float)(Math.PI*9f*2f);
		Assert.assertEquals(perimetroExterno, perimetroManual, 0.1f);
		//System.out.println("Perimetro Ext: "+perimetroExterno);
	}
	@Test
	public void testSuperficeDelDisco() {
		Disco miDisco = new Disco(3f,9f);
		Float radioInterno = miDisco.getRadioInterior();
		Float radioExterno = miDisco.getRadioExterior();
		Float superficieDisco = (float)(Math.PI*Math.pow(radioExterno, 2))-(float)(Math.PI*Math.pow(radioInterno, 2));
		Assert.assertEquals(superficieDisco, miDisco.calculoDeSuperficieDelDisco(radioInterno, radioExterno), 0f);
		//System.out.println("SuperficieDisco: "+superficieDisco);
	}
}
