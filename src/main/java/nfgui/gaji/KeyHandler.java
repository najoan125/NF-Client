package nfgui.gaji;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyHandler {
	
	@SubscribeEvent
	public void onInput(InputEvent.KeyInputEvent event)
	{
		int keyPressed = Keyboard.getEventKey();
		if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
			Minecraft.getMinecraft().displayGuiScreen(new gui());
		}
		
	//public void onKeyPressed(KeyInputEvent event) {
		//if(gaji.KeyBinding.isKeyDown()) {
			//Minecraft.getMinecraft().displayGuiScreen(new gui());
		//}
	}

}
