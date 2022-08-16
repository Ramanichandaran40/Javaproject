package com.flip;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FlipKart {
	@BeforeClass
	public static void launch() {
		System.out.println("launch");
	}
	@Before
	public void login() {
		System.out.println("login");
	}
	@Test
	public void Search() {
		System.out.println(" test1");
		
	}
	@Test
	public void addtocard() {
		System.out.println("test2");
	}
	@After
	public void logout () {
		System.out.println("logout");
	}
	@AfterClass
	public  static void closeBrowser() {
	System.out.println("close");	
	}
	}


