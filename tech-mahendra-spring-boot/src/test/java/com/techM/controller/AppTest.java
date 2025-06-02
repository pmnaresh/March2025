package com.techM.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

	@Test
	void testCheckNeedToReturnTrue() {
		App app = new App();
		System.out.println(app.check());
		assertTrue(app.check(), "Expected is true");

		// assertEquals(true, app.check());
	}

}
