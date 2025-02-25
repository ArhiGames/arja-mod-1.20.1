package net.arvid.arja.item;

import net.arvid.arja.Arja;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item KEBAB = registerItem("kebab", new Item(new FabricItemSettings().food(ModFoodComponents.KEBAB)));

    // Add to vanilla item group
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(KEBAB);
    }

    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(Arja.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        Arja.LOGGER.info("Registering Mod Items for " + Arja.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }
}
