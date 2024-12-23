package mainBot;

import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class GuildCommands extends ListenerAdapter {

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        super.onReady(event);
        final String GUILD = Dotenv.load().get("GUILD");
        Guild guild = event.getJDA().getGuildById(GUILD);

        try {
            guild.upsertCommand("rules", "create rules for guild").queue();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
