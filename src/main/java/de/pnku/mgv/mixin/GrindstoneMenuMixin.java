package de.pnku.mgv.mixin;

import de.pnku.mgv.block.MoreGrindstoneBlock;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.GrindstoneMenu;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GrindstoneMenu.class)
public abstract class GrindstoneMenuMixin {

    @Shadow
    @Final
    private ContainerLevelAccess access;

    @Inject(method = "stillValid", at = @At("HEAD"), cancellable = true)
    private void stillValid(Player player, CallbackInfoReturnable<Boolean> info) {
        if (access.evaluate((world, pos) -> world.getBlockState(pos).getBlock() instanceof MoreGrindstoneBlock, true)) {
            info.setReturnValue(true);
        }
    }
}