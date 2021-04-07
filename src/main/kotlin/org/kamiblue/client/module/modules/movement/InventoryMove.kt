package org.kamiblue.client.module.modules.movement

import net.minecraft.client.gui.GuiChat
import net.minecraft.client.gui.GuiRepair
import net.minecraft.client.gui.GuiScreen
import net.minecraft.client.gui.inventory.GuiEditSign
import net.minecraft.util.MovementInputFromOptions
import net.minecraftforge.client.event.InputUpdateEvent
import org.kamiblue.client.KamiMod
import org.kamiblue.client.module.Category
import org.kamiblue.client.module.Module
import org.kamiblue.client.util.threads.safeListener

internal object InventoryMove : Module(
    name = "InventoryMove",
    description = "Allows you to walk around with GUIs opened",
    category = Category.MOVEMENT
) {
    private val rotateSpeed by setting("Rotate Speed", 5, 0..20, 1)
    val sneak by setting("Sneak", false)

    private var hasSent = false

    init {

    }

    private fun isInvalidGui(guiScreen: GuiScreen?) = guiScreen == null
        || guiScreen is GuiChat
        || guiScreen is GuiEditSign
        || guiScreen is GuiRepair
}