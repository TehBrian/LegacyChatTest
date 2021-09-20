package xyz.tehbrian.chattest.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import xyz.tehbrian.chattest.ChatTest;

public class ChatTestReloadCommand implements CommandExecutor {

    private final ChatTest chatTest;

    public ChatTestReloadCommand(final ChatTest chatTest) {
        this.chatTest = chatTest;
    }

    @Override
    public boolean onCommand(
            final @NotNull CommandSender sender,
            final @NotNull Command command,
            final @NotNull String label,
            final @NotNull String[] args
    ) {
        this.chatTest.reloadConfig();
        this.chatTest.getBukkitAudiences().sender(sender)
                .sendMessage(this.chatTest.getMessage("messages.ctr"));

        return true;
    }

}
