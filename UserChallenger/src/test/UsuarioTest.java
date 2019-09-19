package test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.jupiter.api.Test;

import model.Telefone;
import model.Usuario;

class UsuarioTest {

	@Test
	public void test_novo_usuario() {
		Usuario novo_usuario = new Usuario();
		assertThat(novo_usuario, instanceOf(Usuario.class));
	}
	
	@Test
	public void test_alterar_nome_usuario() {
		Usuario novo_usuario = new Usuario();
		novo_usuario.setNome("Pedro");
		assertEquals(novo_usuario.getNome(), "Pedro");
	}
	
	@Test
	public void test_alterar_senha_usuario() {
		Usuario novo_usuario = new Usuario();
		novo_usuario.setSenha("0123456");
		assertEquals(novo_usuario.getSenha(), "0123456");
	}
	
	@Test 
	public void test_adicionar_telefone_a_lista_de_telefones_usuario() { 
	    Usuario novo_usuario = new Usuario();
	    Telefone celular = new Telefone();
	    
	    celular.setddd(81);
	    celular.setNumero("9999-9999");
	    celular.setTipo("Celular");
	    
	    novo_usuario.telefones.add(celular);	    
	    
	    assertFalse(novo_usuario.telefones.isEmpty());
	    
	  
	  }
	 

}
