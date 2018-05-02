package com.autoZone;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProfileTest {

	@Rule
	public OutputCapture outputCapture = new OutputCapture();

	@Test
	public void testDefaultProfile() throws Exception {
		Application.main(new String[0]);
		String output = this.outputCapture.toString();
		assert (output).contains("prod");
	}

	@Test
	public void testDevProfile() throws Exception {
		System.setProperty("spring.profiles.active", "dev");
		Application.main(new String[0]);
		String output = this.outputCapture.toString();
		assert (output).contains("dev");
	}

	@Test
	public void testDevProfile_withDoption() throws Exception {
		Application.main(new String[] { "--spring.profiles.active=prod" });
		String output = this.outputCapture.toString();
		assert (output).contains("prod");
	}

	@After
	public void after() {
		System.clearProperty("spring.profiles.active");
	}

}
