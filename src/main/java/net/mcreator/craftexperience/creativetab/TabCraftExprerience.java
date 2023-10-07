
package net.mcreator.craftexperience.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.craftexperience.block.BlockTechbench;
import net.mcreator.craftexperience.ElementsCraftExperienceMod;

@ElementsCraftExperienceMod.ModElement.Tag
public class TabCraftExprerience extends ElementsCraftExperienceMod.ModElement {
	public TabCraftExprerience(ElementsCraftExperienceMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcraft_exprerience") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockTechbench.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
