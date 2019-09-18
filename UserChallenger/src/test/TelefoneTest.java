package test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import model.Telefone;

class TelefoneTest {

	@Test
	void test_novo_telefone() {
		Telefone novo_telefone = new Telefone();
		assertThat(novo_telefone, instanceOf(Telefone.class));
	}
	
	@Test
	void test_alterar_ddd_telefone() {
		Telefone novo_telefone = new Telefone();
		novo_telefone.setddd(81);
		assertEquals(novo_telefone.getddd(), 81);
	}
	
	@Test
	void test_alterar_numero_telefone() {
		Telefone novo_telefone = new Telefone();
		novo_telefone.setNumero("9999-9999");
		assertEquals(novo_telefone.getNumero(), "9999-9999");
	}
	
	@Test
	void test_alterar_tipo_telefone() {
		Telefone novo_telefone = new Telefone();
		novo_telefone.setTipo("celular");
		assertEquals(novo_telefone.getTipo(), "celular");
	}
	
	

}
