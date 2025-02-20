package com.pleae;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("npc-pleae")
public interface PluginConfig extends Config
{
	@ConfigItem(
		keyName = "npc-pleae",
		name = "NPC Pleae",
		description = "NPCs now say Pleae when they die"
	)
	default String configTest()
	{
		return "Config is working";
	}
}
