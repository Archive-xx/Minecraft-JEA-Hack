package me.wyh2004.JEA.utils;

import me.wyh2004.JEA.JEA;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class Logger {
	
	public void Loading(String text) {
		System.out.println("Loading >" + text);
	}
	
	public void Info(String string) {
		System.out.println("Info >" + string);
	}
	
	public void Error(String text) {
		System.out.println("Error >" + text);
	}
	
	public void Downloading(String text) {
		System.out.println("Downloading >" + text);
	}
	
	public void Creating(String text) {
		System.out.println("Creating >" + text);
	}
	
	public void sendChatWithPreFix(String message) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(JEA.instance.Client_PreFix + message));
	}
	
	public void sendChatError(String message) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(JEA.instance.Client_PreFix + "&cError: "+ message));
	}

	public void sendChatInfo(String message) {
		Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(JEA.instance.Client_PreFix + "&aInfo: &f" + message));
	}
	
}
