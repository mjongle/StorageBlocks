package net.mjongle.storageblocks;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class RedstoneBlock extends GenericCubeCustomBlock
{
 
    public RedstoneBlock(Plugin plugin)
    {
        super(plugin, "Redstone Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/1038107.png", 16));
    }
}