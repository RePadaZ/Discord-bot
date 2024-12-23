package mainBot;

import commands.Rules;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main {

    public static void main(String[] args) {

        final String TOKEN = Dotenv.load().get("TOKEN");
        final JDA DiscordBot = JDABuilder.createDefault(TOKEN).build();

        // Clear global commands
        DiscordBot.updateCommands().queue();

        DiscordBot.addEventListener(new GuildCommands());
        DiscordBot.addEventListener(new Listen());
        DiscordBot.addEventListener(new Rules());

    }

}
