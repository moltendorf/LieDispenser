package net.moltendorf.Bukkit.LieDispenser;

/**
 * Configuration class.
 * Created by moltendorf on 14/09/03.
 *
 * @author moltendorf
 */
public class Configuration {

	static protected class Global {

		// Final data.
		final protected boolean enabled = true; // Whether or not the plugin is enabled at all; interface mode.

	}

	// Final data.
	final protected Global global = new Global();

	public Configuration() {
		// Placeholder.
	}
}
