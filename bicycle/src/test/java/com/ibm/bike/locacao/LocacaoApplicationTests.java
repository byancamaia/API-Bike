//package com.ibm.bike.locacao;
//
//import com.ibm.bike.locacao.model.Bicycle;
//import com.ibm.bike.locacao.model.dto.BicycleDTO;
//import com.ibm.bike.locacao.service.BicycleService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import static junit.framework.TestCase.*;
//import static junit.framework.TestCase.assertNotNull;
//
//import java.util.List;
//import java.util.Optional;
//
//@SpringBootTest
//class LocacaoApplicationTests {
//
//	@Autowired
//	private BicycleService service;
//
//	@Test
//	public void testInsert(){
//		Bicycle bike = new Bicycle();
//		bike.setModelo("Specialized");
//		bike.setCor("Branco");
//
//		BicycleDTO b = service.insert(bike);
//		assertNotNull(b);
//
//		Long id = b.getId();
//		assertNotNull(id);
//
//		b = service.getBikeById(id);
//		assertNotNull(b);
//
//		assertEquals("Specialized", b.getModelo());
//		assertEquals("Branco", b.getCor());
//
//		service.delete(id);
//		assertNull(service.getBikeById(id));
//	}
//
//	@Test
//	public void testList(){
//		List<BicycleDTO> bike = service.getBike();
//		assertEquals(20, bike.size());
//	}
//
//	@Test
//	public void testGet(){
//		BicycleDTO op = service.getBikeById(3L);
//		assertNotNull(op);
//
//		assertEquals("Giant", op.getModelo());
//	}
//
//	@Test
//	public void testCor(){
//		BicycleDTO op = service.getBikeById(5L);
//		assertNotNull(op);
//
//		assertEquals("Laranja", op.getCor());
//	}
//}
