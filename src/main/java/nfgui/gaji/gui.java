package nfgui.gaji;

import java.io.IOException;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;


public class gui extends GuiScreen {
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
        super.drawCenteredString(super.fontRendererObj, "NF Client", Math.round((float)(super.width / 2) / 2.0F), Math.round((float)(super.height / 2) / 2.0F) - 60, -1);
        GlStateManager.popMatrix();
        drawCenteredString(this.mc.fontRendererObj, "Made by Najoan", this.width / 2, this.height / 2 - 100, 16777215);
         
        super.drawScreen(x, y, ticks);
	}
	
	@Override
	public void initGui() {
		buttonList.add(new GuiButton(0, (width - GUIWidth) / 2, height / 2 - 80, 100, 20, "AutoGG"));
		buttonList.add(new GuiButton(1, width / 2 - 100, height / 2 - 80, 100, 20, "AutoText"));
		buttonList.add(new GuiButton(2, width / 2, height / 2 - 80, 100, 20, "Block Overlay"));
		buttonList.add(new GuiButton(3, width / 2 + 100, height / 2 - 80, 100, 20, "ChromaHUD"));
		buttonList.add(new GuiButton(4, (width - GUIWidth) / 2, height / 2 - 20, 100, 20, "Simple Mod"));
		buttonList.add(new GuiButton(5, width / 2 - 100, height / 2 - 20, 100, 20, "Quickplay"));
		buttonList.add(new GuiButton(6, width / 2, height / 2 - 20, 100, 20, "Chroma CPS"));
		buttonList.add(new GuiButton(7, width / 2 + 100, height / 2 - 20, 100, 20, "Keystrokes"));
		buttonList.add(new GuiButton(8, (width - GUIWidth) / 2, height / 2 + 40, 100, 20, "Levelhead"));
		buttonList.add(new GuiButton(9, width / 2 - 100, height / 2 + 40, 100, 20, "Autotip"));
	}
	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(GuiButton button) throws IOException {
		switch(button.id) {
		case 0: EntityPlayer:sendChatMessage("/autogg"); break;
		case 1: EntityPlayer:sendChatMessage("/autotext"); break;
		case 2: EntityPlayer:sendChatMessage("/boverlay"); break;
		case 3: EntityPlayer:sendChatMessage("/chromahud"); break;
		case 4: EntityPlayer:sendChatMessage("/simplehud"); break;
		case 5: EntityPlayer:sendChatMessage("/qp config"); break;
		case 6: EntityPlayer:sendChatMessage("/chromacps"); break;
		case 7: EntityPlayer:sendChatMessage("/keystrokes"); break;
		case 8: EntityPlayer:sendChatMessage("/levelhead"); break;
		case 9: Minecraft.getMinecraft().displayGuiScreen(new tipgui()); break;
		}
	}

}
