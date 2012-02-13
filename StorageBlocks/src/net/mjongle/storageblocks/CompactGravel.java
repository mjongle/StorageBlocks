package net.mjongle.storageblocks;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class CompactGravel extends GenericCubeCustomBlock
{
 
    public CompactGravel(Plugin plugin)
    {
        super(plugin, "CompactGravel", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/479125.png", 16));
    }
}