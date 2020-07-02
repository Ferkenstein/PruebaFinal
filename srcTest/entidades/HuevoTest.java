package entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import entidades.Huevo;

public class HuevoTest {

	private final Huevo huevo = new Huevo();
	@Test
	void addition() {

		assertEquals(true, huevo.validarCoordenada(14));
		assertEquals(false, huevo.validarCoordenada(15));

	}
}
