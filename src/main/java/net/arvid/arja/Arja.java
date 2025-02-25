package net.arvid.arja;

import net.arvid.arja.item.ModItemGroups;
import net.arvid.arja.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Arja implements ModInitializer
{
	public static final String MOD_ID = "arja";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}