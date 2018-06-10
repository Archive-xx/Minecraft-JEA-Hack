package me.wyh2004.JEA;

import java.io.File;
import java.util.logging.Logger;

import org.lwjgl.opengl.Display;

public class JEA {
	
	public static JEA instance;
	public String Client_Name = "JEA";
	public String Client_Version = "b0.2 (bate)";
	public String Client_Coder = "WYH2004";
	public String Client_PreFix = "&7[&25pirit&7]";
	public me.wyh2004.JEA.utils.Logger logger;
	
	public File directory;
	
	public void startClient() {
		instance = this;
		Display.setTitle(""+ Client_Name + " "+ Client_Version);
		System.out.println(""+ Client_Name + " "+ Client_Version+ " is ready!");
		System.out.println(""+ "Minecrft Hack QQ group:524788346");
		System.out.println(""+ "Coder by "+ Client_Coder);
		logger = new me.wyh2004.JEA.utils.Logger();
	}
	
}
