package com.globalista.stglass;


import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.globalista.stglass.block.ModBlocks.*;
import static com.globalista.stglass.client.ClientInitializer.initializeClient;

public class STGlass implements ModInitializer {

	public static String MOD_ID = "stglass";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		initializeClient();
		callBlocks();
		LOGGER.info("Stained Tinted Glass has been loaded");
	}
}
