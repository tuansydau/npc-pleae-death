package com.pleaeTest;

import com.pleae.PleaePlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PleaePluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PleaePlugin.class);
		RuneLite.main(args);
	}
}