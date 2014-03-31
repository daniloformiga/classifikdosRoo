package com.ufpb.domain;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Produto.class)
public class ProdutoIntegrationTest {
	
	@Test
	public void testRelacionamento() {
		
		Usuario usu = new Usuario();
		usu.setNome("testador");
		usu.setSenha("testador");
		
		Produto p = new Produto();
		p.setNome("TestProduto");
		p.setUsuario(usu);
		
		Assert.assertNotNull(p.getUsuario());
		
		
		
		
	}

    @Test
    public void testMarkerMethod() {
    	
    	
    }
}
