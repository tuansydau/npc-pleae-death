package com.pleae;

import com.google.inject.Provides;
import javax.inject.Inject;

//import net.runelite.api.ChatMessageType;
//import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.callback.ClientThread;


@PluginDescriptor(
	name = "Npc Pleae",
	description ="Makes npcs say pleae when they die"
)
public class PleaePlugin extends Plugin
{
//	@Inject
//	private Client client;
	
	@Inject
	private ClientThread clientThread;

//	@Inject
//	private PluginConfig config;
	
	@Subscribe
	public void onHitsplatApplied(HitsplatApplied event)
	{
	    NPC npc = (NPC) event.getActor();

	    if (npc != null) {
	        clientThread.invokeLater(() -> {
	            if (npc.getHealthRatio() == 0) {
	                npc.setOverheadText("Pleae");
	            }
	        });
	    }
	}


	@Provides
	PluginConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PluginConfig.class);
	}
}
