package me.wyh2004.JEA.modules;

import me.wyh2004.JEA.JEA;
import net.minecraft.client.Minecraft;

public class Module {
	
	private JEA name;
	private JEA displayname;
	private Category category;
	
	private boolean toggled;
	
	private int keyBind;
	public static boolean colormode = false;
	public static Minecraft mc = Minecraft.getMinecraft();
	
	/**  Module **/

	public Module(JEA name, JEA displayneme, Category category) {
		this.name = name;
		this.displayname = displayneme;
		this.category = category;
		
	}

	public JEA getName() {
		return name;
	}

	public void setName(JEA name) {
		this.name = name;
	}

	public JEA getDisplayname() {
		return displayname;
	}

	public void setDisplayname(JEA displayname) {
		this.displayname = displayname;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getKeyBind() {
		return keyBind;
	}

	public void setKeyBind(int keyBind) {
		this.keyBind = keyBind;
	}
	
	public boolean isEnabled() {
		return toggled;
	}
	
	public void toggled() {
		if(toggled) {
			toggled = false;
			onDisable();
			}else {
				toggled = true;
				onEnable();
		}
	}
	
	public void onEnable() {}
	public void onDisable() {}
	
}
