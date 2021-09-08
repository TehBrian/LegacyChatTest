package xyz.tehbrian.chattest.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import xyz.tehbrian.chattest.ChatTest;
import xyz.tehbrian.chattest.user.User;

public class ChatTestColorCommand implements CommandExecutor {

    private final ChatTest chatTest;

    public ChatTestColorCommand(final ChatTest chatTest) {
        this.chatTest = chatTest;
    }

    @Override
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final User user = this.chatTest.getUserManager().getUser(sender);

        if (user.toggleColorEnabled()) {
            sender.sendMessage(this.chatTest.getMessage("messages.ctc.enabled"));
        } else {
            sender.sendMessage(this.chatTest.getMessage("messages.ctc.disabled"));
        }

        return true;
    }

}
