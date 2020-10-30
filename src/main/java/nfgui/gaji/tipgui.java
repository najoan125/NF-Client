package nfgui.gaji;

import java.awt.Color;
import java.io.IOException;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;

public class tipgui extends GuiScreen {
	int GUIWidth = 400;
	int GUIHeight = 256;
	Minecraft mc = Minecraft.getMinecraft();

	
	@Override
	public void drawScreen(int x, int y, float ticks) {
		int GUIX = (width - GUIWidth) / 2;
		int GUIY = (height - GUIHeight) / 2;
        GL11.glColor4f(1, 1, 1, 1);
        drawDefaultBackground();
        GlStateManager.pushMatrix();
        GlStateManager.scale(2.0F, 2.0F, 2.0F);
        super.drawCenteredString(super.fontRendererObj, "Autotip", Math.round((float)(super.width / 2) / 2.0F), Math.round((float)(super.height / 2) / 2.0F) - 40, -1);
        GlStateManager.popMatrix();
        super.drawScreen(x, y, ticks);
	}
	
	@Override
	public void initGui() {
		buttonList.add(new GuiButton(0, (width - GUIWidth) / 2, height / 2 - 30, 100, 20, "\uD65C\uC131\uD654 / \uBE44\uD65C\uC131\uD654"));
		buttonList.add(new GuiButton(1, width / 2 - 100, height / 2 - 30, 100, 20, "\uBA54\uC2DC\uC9C0 \uAC04\uACB0\uD558\uAC8C"));
		buttonList.add(new GuiButton(2, width / 2, height / 2 - 30, 100, 20, "\uBA54\uC2DC\uC9C0 \uBCF4\uC774\uAC8C"));
		buttonList.add(new GuiButton(3, width / 2 + 100, height / 2 - 30, 100, 20, "\uBA54\uC2DC\uC9C0 \uBE44\uD65C\uC131\uD654"));
	}
	
	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(GuiButton button) throws IOException {
		switch(button.id) {
		case 0: EntityPlayer:sendChatMessage("/at toggle"); break;
		case 1: EntityPlayer:sendChatMessage("/at messages compact"); break;
		case 2: EntityPlayer:sendChatMessage("/at messages shown"); break;
		case 3: EntityPlayer:sendChatMessage("/at messages hidden"); break;
		}
	}

}
