package test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import model.Telefone;
import model.Usuario;

class UsuarioTest {

	@Test
	void test_novo_usuario() {
		Usuario novo_usuario = new Usuario();
		assertThat(novo_usuario, instanceOf(Usuario.class));
	}
	
	@Test
	void test_alterar_nome_usuario() {
		Usuario novo_usuario = new Usuario();
		novo_usuario.setNome("Pedro");
		assertEquals(novo_usuario.getNome(), "Pedro");
	}
	
	@Test
	void test_alterar_senha_usuario() {
		Usuario novo_usuario = new Usuario();
		novo_usuario.setSenha("0123456");
		assertEquals(novo_usuario.getSenha(), "0123456");
	}
	
	@Test
	void test_adicionar_telefone_usuario() {
		Usuario novo_usuario = new Usuario();
		Telefone novo_telefone = new Telefone();
		
		novo_telefone.setddd(81);
		novo_telefone.setNumero("9999-9999");
		novo_telefone.setTipo("celular");
		
		novo_usuario.telefones.add(novo_telefone);
		
		assertThat(novo_usuario.telefones, hasSize(1));
		
	}

}
