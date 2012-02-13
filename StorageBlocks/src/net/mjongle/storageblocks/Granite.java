package net.mjongle.storageblocks;
 
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
 
public class Granite extends GenericCubeCustomBlock
{
 
    public Granite(Plugin plugin)
    {
        super(plugin, "Granite", new GenericCubeBlockDesign(plugin, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/1557743.png", 16));
    }
}