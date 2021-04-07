package org.kamiblue.client.mixin.client.render;

import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.kamiblue.client.module.modules.player.Freecam;
import org.kamiblue.client.util.Wrapper;
import org.kamiblue.client.util.math.VectorUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.EnumSet;
import java.util.Set;

@Mixin(VisGraph.class)
public class MixinVisGraph {



}
