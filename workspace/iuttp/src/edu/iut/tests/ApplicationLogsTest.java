package edu.iut.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import edu.iut.app.*;
import edu.iut.gui.listeners.*;

public class ApplicationLogsTest {

	@Test
	public void testApplicationErrorLog() {

		ApplicationErrorLog test = new ApplicationErrorLog();

		test.setMessage("test");

		if(!(test.getMessage().equals("test")))
		{
			fail("get or set message not working in ApplicationErrorLog ");
		}

		IApplicationLogListener listener = new ApplicationErrorMessageDialog();

		test.addListener(listener);

		if( test.getApplicationLogListeners().size() != 1 )
		{
			fail("get or set listeners not working in ApplicationErrorLog ");
		}

	}

	@Test
	public void testApplicationWarningLog() {

		ApplicationWarningLog test = new ApplicationWarningLog();

		test.setMessage("test");

		if(!(test.getMessage().equals("test")))
		{
			fail("get or set message not working in ApplicationWarningLog ");
		}

		IApplicationLogListener listener = new ApplicationErrorMessageDialog();

		test.addListener(listener);

		if( test.getApplicationLogListeners().size() != 1 )
		{
			fail("get or set listeners not working in ApplicationWarningLog ");
		}

	}

	@Test
	public void testApplicationInfoLog() {

		ApplicationInfoLog test = new ApplicationInfoLog();

		test.setMessage("test");

		if(!(test.getMessage().equals("test")))
		{
			fail("get or set message not working in ApplicationInfoLog ");
		}

		IApplicationLogListener listener = new ApplicationErrorMessageDialog();

		test.addListener(listener);

		if( test.getApplicationLogListeners().size() != 1 )
		{
			fail("get or set listeners not working in ApplicationInfoLog ");
		}

	}

	@Test
	public void testApplicationLog() {

		ApplicationLogs tests = new ApplicationLogs();

		tests.add(new ApplicationErrorLog());
		tests.add(new ApplicationInfoLog());
		tests.add(new ApplicationWarningLog());
		tests.add(new ApplicationErrorLog());
		tests.add(new ApplicationErrorLog());
		tests.add(new ApplicationWarningLog());

		if(tests.getErrors().size()!=3)
		{
			fail("error at getErrors");
		}
		if(tests.getWarnings().size()!=2)
		{
			fail("error at getwarnings");
		}
		if(tests.getInfos().size()!=1)
		{
			fail("error at getInfos");
		}




	}


}