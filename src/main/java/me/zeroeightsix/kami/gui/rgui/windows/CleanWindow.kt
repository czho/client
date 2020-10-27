package me.zeroeightsix.kami.gui.rgui.windows

import me.zeroeightsix.kami.gui.rgui.WindowComponent

/**
 * Window with no rendering
 */
open class CleanWindow(
        name: String,
        posX: Float,
        posY: Float,
        width: Float,
        height: Float,
        saveToConfig: Boolean
) : WindowComponent(name, posX, posY, width, height, saveToConfig)