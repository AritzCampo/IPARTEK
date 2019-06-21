package com.ipartek.formacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class YoutubeTest {

	Youtube video;
	static final String TITULO = "mivideo";
	static final String CODIGO = "DkrtuahsbrD";
	static final int REPRODUCCIONES = 0;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		video = new Youtube(TITULO, CODIGO);

	}

	@After
	public void tearDown() throws Exception {
		video = null;
	}

	@Test
	public void testYoutube() throws Exception {

		assertEquals(TITULO, video.getTitulo());
		assertEquals(CODIGO, video.getCodigo());
		assertEquals(REPRODUCCIONES, video.getReproducciones());
		
		try {
			video = new Youtube(null, null);
			fail("construccion con nulls");
		} catch (Exception e) {
			assertTrue(true);
		}

		try {
			video = new Youtube("metallika", "furodushe");
			fail("Deberia haber lanzado excepcion por longitud <> 11");
		} catch (Exception e) {
			assertTrue(true);//opcional
		}
		try {
			video = new Youtube("w", "rdkglfoprtf");
			fail("Deberia haber lanzado excepcion por titulo incorrecto");
		} catch (Exception e) {
			assertTrue(true);
		}
		try {
			video = new Youtube("wkfjeuiewfoafjbaksbfbasibalbsfIHBDAFILhabfdlaDBFLhfdajlhbAFDLCBHaildchfbLJAHBFLkhbafljhACLDBHAljshbfLAIHSBDLJahdsfljhbdaJLHBLhbaihbfiJADSBFLahfdblhbsfljhbflIHBFLihjbsaflHBFSIk", "rdkglfoprtf");
			fail("Deberia haber lanzado excepcion por titulo incorrecto");
		} catch (Exception e) {
			assertTrue(true);
		}

	}

	@Test
	public void testGetTitulo() {
		assertEquals(TITULO, video.getTitulo());
	}

	@Test(expected = Exception.class)
	public void testSetTitulo() throws Exception {
		//TODO probar 3 casos q faltan
		try {
			video = new Youtube("w", "rdkglfoprtf");
			fail("Deberia haber lanzado excepcion");
		} catch (Exception e) {
			throw new Exception("Titulo debe ser entre " + Youtube.LONGITUD_MIN_TITULO + " y " + Youtube.LONGITUD_MAX_TITULO);
		}
		try {
			video = new Youtube("wkfjeuiewfoafjbaksbfbasibalbsfIHBDAFILhabfdlaDBFLhfdajlhbAFDLCBHaildchfbLJAHBFLkhbafljhACLDBHAljshbfLAIHSBDLJahdsfljhbdaJLHBLhbaihbfiJADSBFLahfdblhbsfljhbflIHBFLihjbsaflHBFSIk", "rdkglfoprtf");
			fail("Deberia haber lanzado excepcion");
		} catch (Exception e) {
			throw new Exception("Titulo debe ser entre " + Youtube.LONGITUD_MIN_TITULO + " y " + Youtube.LONGITUD_MAX_TITULO);
		}

	}

	@Ignore
	public void testGetCodigo() {
		fail("Not yet implemented");
	}

	@Test(expected = Exception.class)
	public void testSetCodigo() throws Exception {
		try {
			video = new Youtube("metallika", "furodushe");
			fail("Deberia haber lanzado excepcion");
		} catch (Exception e) {
			throw new Exception("Longitud codigo debe ser " + Youtube.LONGITUD_CODIGO);
		}
	}

	@Ignore
	public void testGetReproducciones() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testSetReproducciones() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testToString() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testGetUrl() {
		fail("Not yet implemented");
	}

}
