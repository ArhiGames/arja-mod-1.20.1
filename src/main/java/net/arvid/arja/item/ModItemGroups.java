package net.arvid.arja.item;

import net.arvid.arja.Arja;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup MAGIC_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Arja.MOD_ID, "magictools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.magictools"))
                    .icon(() -> new ItemStack(ModItems.KEBAB)).entries((displayContext, entries) ->
                    {
                        entries.add(ModItems.KEBAB);
                    }).build());

    public static void registerItemGroups()
    {
        Arja.LOGGER.info("Registering Item Groups for " + Arja.MOD_ID);
    }
}
