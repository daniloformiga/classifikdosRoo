package com.ufpb.domain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Anuncio.class)
public class AnuncioIntegrationTest {
	
	@Test
	public void testRelacionamento(){
		
		Usuario usu = new Usuario();
		usu.setNome("testador");
		usu.setSenha("testador");
		
		Produto p = new Produto();
		p.setNome("testProduto");
		p.setUsuario(usu);
		
		Anuncio a = new Anuncio();
		a.setNome("testAnuncio");
		a.setProduto(p);
		
		Assert.assertNotNull(p.getUsuario());
		Assert.assertNotNull(a.getProduto());
		
	}

    @Test
    public void testMarkerMethod() {
    }
}
