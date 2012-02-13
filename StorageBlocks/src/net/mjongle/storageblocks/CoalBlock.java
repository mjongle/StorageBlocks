package net.mjongle.storageblocks;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CoalBlock extends GenericCubeCustomBlock
{
 
    public CoalBlock(Plugin plugin)
    {
        super(plugin, "Coal Block", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7066030.png", 16));
    }
}