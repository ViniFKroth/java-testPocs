package com.github.vinifkroth.javapocs.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.github.vinifkroth.javapocs.model.Car;
import com.github.vinifkroth.javapocs.model.CarLease;
import com.github.vinifkroth.javapocs.model.Person;

public class CarLeaseTest {

	@Mock
	private Person personMock;

	@Mock
	private Car carMock;

	@InjectMocks
	private CarLease carlease;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetCarLeaseInfo() {
		when(personMock.getName()).thenReturn("Vinicius");
		when(carMock.getCarPlate()).thenReturn("ABC6262");
		assertEquals(carlease.getLeaseInfo(), "The car with plate: ABC6262 is leased by: Vinicius");
	}
}
