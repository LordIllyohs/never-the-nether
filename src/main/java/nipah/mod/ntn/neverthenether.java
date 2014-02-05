package nipah.mod.ntn;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "neverthenether", name = "Never The Nether", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class neverthenether {

	@Instance("neverthenether")
	public static neverthenether instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {}
		
	@EventHandler
	public void load(FMLInitializationEvent event) {
		GameRegistry.addShapedRecipe(new ItemStack(Block.netherrack, 8), new Object[]{ "ccc" , "c%c" , "ccc" , 'c', Block.cobblestone, '%', Item.coal, '%', new ItemStack(Item.coal, 1, 0)});
		GameRegistry.addShapedRecipe(new ItemStack(Block.netherrack, 8), new Object[]{ "ccc" , "c%c" , "ccc" , 'c', Block.cobblestone, '%', Item.coal, '%', new ItemStack(Item.coal, 1, 1)});
//		GameRegistry.addShapedRecipe(new ItemStack(Block.netherrack), new Object[] { "xxx", "xix", "xxx", 'x', Block.cobblestone, 'i', Item.coal, 'i', new ItemStack(Item.coal, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(Block.slowSand, 1), new Object[]{"fbf", "bsb", "fbf", 'f', Item.rottenFlesh, 'b', Item.bone, 's', Block.sand});
		GameRegistry.addShapelessRecipe(new ItemStack(Item.blazeRod, 1), new Object[]{Item.stick, Item.ingotIron, Item.blazePowder});
		GameRegistry.addShapelessRecipe(new ItemStack(Item.blazePowder), new Object[]{ Block.blockDiamond, Item.coal, Item.netherQuartz, Item.flintAndSteel});
		GameRegistry.addShapedRecipe(new ItemStack(Item.ghastTear), new Object[]{"qqq", "qbq", "qfq", 'q', Block.blockNetherQuartz, 'b', Item.bucketLava, 'f', Item.fireballCharge});
		GameRegistry.addShapedRecipe(new ItemStack(Item.netherQuartz), new Object[]{" s ", "g g", " i ", 's', Block.sand, 'g', Block.glass, 'i' , Item.ingotIron});
		GameRegistry.addShapelessRecipe(new ItemStack(Item.glowstone), new Object[]{Block.glass, Item.bucketLava, Item.emerald, Item.gunpowder});
	
	
	}
	
	@EventHandler
	public void modsLoaded(FMLPostInitializationEvent event) {}
	
}



