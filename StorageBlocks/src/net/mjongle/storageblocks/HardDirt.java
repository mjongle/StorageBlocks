package net.mjongle.storageblocks;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class HardDirt extends GenericCubeCustomBlock
{
 
    public HardDirt(Plugin plugin)
    {
        super(plugin, "HardDirt", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/6564155.png", 16));
    }
}