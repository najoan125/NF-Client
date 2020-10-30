package nfgui.gaji;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "NF Client", name = "NF Client", version = "1.1")
public class gaji {
	
	@Instance
	public static gaji instance;
	
	//public static KeyBinding KeyBinding = new KeyBinding("NF Client", Keyboard.KEY_RSHIFT, "NF Client");
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//ClientRegistry.registerKeyBinding(KeyBinding);
		FMLCommonHandler.instance().bus().register(new KeyHandler());
	}

}
