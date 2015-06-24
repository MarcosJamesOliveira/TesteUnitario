package Teste;

import static org.junit.Assert.*;

import org.junit.Test;

import UserStory.Boletim;
import UserStory.Prova;

public class TesteProva{
	
	@Test
	public void testProvaValendoMaisQueCem() {
		Prova p = new Prova();
		
		p.setNota_max(180.0);
		p.setNota_obtida(100.0);
		double esperado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(esperado, atual, 0.0);
		
	}
	
	@Test
	public void testeTotalCem(){
		Prova p = new Prova();
		p.setNota_max(100.0);
		p.setNota_obtida(100.0);
		
		double esperado=100.0;
		double atual = p.getNota_obtida();
		
		assertEquals(esperado, atual,0.0);
	}
	
	@Test
	public void testeNotaMenorZero(){
		Prova p = new Prova();
		
		p.setNota_max(100.0);
		p.setNota_obtida(-1.0);
		
		double esperado=0.0;
		double atual = p.getNota_obtida();
		
		assertEquals(esperado, atual,0.0);
	}

	@Test
	public void testeFoiAprovado(){
		Boletim b = new Boletim();
		Prova p = new Prova();
		
		p.setNota_max(100.0);
		p.setNota_obtida(80.0);
		
		b.adicionaProva(p);
		
		boolean esperado=true;
		boolean atual=b.foiAprovado();
		
		assertEquals(esperado,atual);		
	}
	
	@Test
	public void testeFoiReprovado(){
		Boletim b = new Boletim();
		Prova p = new Prova();
		
		p.setNota_max(100.0);
		p.setNota_obtida(40.0);
		
		b.adicionaProva(p);
		
		boolean esperado=false;
		boolean atual=b.foiAprovado();
		
		assertEquals(esperado,atual);	
		
	}
	
}
