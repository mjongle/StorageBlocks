/*
 *  Copyright 2012 Mjongle & Owexz.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package net.mjongle.storageblocks;
 
import java.util.logging.Logger;



import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.inventory.*;
import org.getspout.spoutapi.material.CustomBlock;
import org.getspout.spoutapi.material.MaterialData;
 
 
public class StorageBlocks extends JavaPlugin
{
 
    public StorageBlocks()
    {
        log = Logger.getLogger("Minecraft");
        coalBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/7066030.png", 64, 16, 16);
        compactgravelTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/479125.png", 64, 16, 16);
        graniteTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/1557743.png", 64, 16, 16);  
        harddirtTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/6564155.png", 64, 16, 16);
        redstoneBlockTexture = new Texture(this, "http://www.jamoscraft.owexz.net/uploads/1/4/8/5/1485487/1038107.png", 64, 16, 16);
    }
 
    public void onEnable()
    {
    	coalBlock = new CoalBlock(this);
    	compactgravel = new CompactGravel(this);
    	granite = new Granite(this);
    	harddirt = new HardDirt(this);
    	redstoneBlock = new RedstoneBlock(this);
        SpoutShapedRecipe recipe = new SpoutShapedRecipe(new SpoutItemStack(coalBlock, 1));
        recipe.shape("AAA", "AAA", "AAA");
        recipe.setIngredient('A', MaterialData.coal);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe);
        SpoutShapelessRecipe recipe1 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.coal, 9));
        recipe1.addIngredient(coalBlock);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe1);
        SpoutShapedRecipe recipe2 = new SpoutShapedRecipe(new SpoutItemStack(compactgravel, 1));
        recipe2.shape("AAA", "AAA", "AAA");
        recipe2.setIngredient('A', MaterialData.gravel);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe2);
        SpoutShapelessRecipe recipe3 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.gravel, 9));
        recipe3.addIngredient(compactgravel);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe3);
        SpoutShapedRecipe recipe4 = new SpoutShapedRecipe(new SpoutItemStack(granite, 1));
        recipe4.shape("AAA", "AAA", "AAA");
        recipe4.setIngredient('A', MaterialData.cobblestone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe4);
        SpoutShapelessRecipe recipe5 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.cobblestone, 9));
        recipe5.addIngredient(granite);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe5);
        SpoutShapedRecipe recipe6 = new SpoutShapedRecipe(new SpoutItemStack(harddirt, 1));
        recipe6.shape("AAA", "AAA", "AAA");
        recipe6.setIngredient('A', MaterialData.dirt);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe6);
        SpoutShapelessRecipe recipe7 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.dirt, 9));
        recipe7.addIngredient(harddirt);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe7);
        SpoutShapedRecipe recipe8 = new SpoutShapedRecipe(new SpoutItemStack(redstoneBlock, 1));
        recipe8.shape("AAA", "AAA", "AAA");
        recipe8.setIngredient('A', MaterialData.redstone);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe8);
        SpoutShapelessRecipe recipe9 = new SpoutShapelessRecipe(new SpoutItemStack(MaterialData.redstone, 9));
        recipe9.addIngredient(redstoneBlock);
        SpoutManager.getMaterialManager().registerSpoutRecipe(recipe9);
        log.info("StorageBlocks Enabled");
    }
 
    public void onDisable()
    {
        log.info("StorageBlocks disabled.");
    }
 
    public static CustomBlock coalBlock;
    CustomBlock compactgravel;
    CustomBlock granite;
    CustomBlock harddirt;
    CustomBlock redstoneBlock;
    Logger log;
    public Texture coalBlockTexture;
    Texture compactgravelTexture;
    Texture graniteTexture;
    Texture harddirtTexture;
    Texture redstoneBlockTexture;
}