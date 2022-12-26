package adhdmc.purpuraway;

import adhdmc.purpuraway.command.AFK;
import adhdmc.purpuraway.placeholder.PAPIExpansion;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class PurpurAway extends JavaPlugin {

    public static Plugin plugin;

    @Override
    public void onEnable() {
        try {
            Class.forName("org.purpurmc.purpur.event.PlayerAFKEvent");
        } catch (ClassNotFoundException e) {
            this.getLogger().severe("PurpurAwayPAPI depends on PurpurMC methods not present on this server, disabling...");
            this.getServer().getPluginManager().disablePlugin(this);
            return;
        }
        plugin = this;
        new PAPIExpansion(this).register();
        this.getCommand("afk").setExecutor(new AFK());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Plugin getPlugin() { return plugin; }
}
