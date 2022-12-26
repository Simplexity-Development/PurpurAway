package adhdmc.purpuraway.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AFK implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player p)) {
            sender.sendRichMessage("<red>Only a player can use this command.");
            return true;
        }
        // This was supposed to toggle it.
        // Instead, it just makes them AFK after unAFK from using the command.
        // Does not really change the logic, so I am keeping it this way.
        // TODO: Add command cooldown to avoid insane amounts of AFK spam.
        p.setAfk(!p.isAfk());
        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return new ArrayList<>();
    }
}
