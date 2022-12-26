package adhdmc.purpuraway.placeholder;

import adhdmc.purpuraway.PurpurAway;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PAPIExpansion extends PlaceholderExpansion {

    private final PurpurAway plugin;

    public PAPIExpansion(PurpurAway plugin) {
        this.plugin = plugin;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "purpur-afk";
    }

    @Override
    public @NotNull String getAuthor() {
        return "ADHDMC";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public boolean persist() { return true; }

    @Override
    public String onRequest(OfflinePlayer player, @NotNull String params) {
        if (params.equalsIgnoreCase("status")) {
            Player p = player.getPlayer();
            // TODO: Make Offline, AFK, and Online statuses configurable.
            if (p == null) { return "Offline"; }
            if (p.isAfk()) { return "AFK"; }
            return "";
        }
        return null;
    }
}
