package commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class Rules extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);

        if(event.getName().equals("rules")) {
            EmbedBuilder embed = new EmbedBuilder();
            embed.setColor(Color.BLUE);
            embed.setTitle("📜 Правила нашего сервера");
            embed.setDescription("Приветствуем тебя на нашем сервере! Ознакомься с нашими правилами ниже:");

            // Добавляем поля
            embed.addField("🧑‍🤝‍🧑 Уважение к другим",
                    "Проявляй уважение к каждому участнику сервера. Оскорбления, агрессия, расизм, сексизм или любое другое неуважительное поведение не приветствуются.",
                    false);
            embed.addField("🚫 Запрещен спам",
                    "Не спамь в чатах, не используй ботов для массовых сообщений.",
                    false);
            embed.addField("🎯 Темы обсуждений",
                    "Соблюдай тему чатов. В каждом канале есть своя тема.",
                    false);
            embed.addField("🔗 Реклама и ссылки",
                    "Запрещена реклама и размещение ссылок без разрешения администрации.",
                    false);
            embed.addField("⚖️ Не нарушай законы",
                    "Не размещай материалы, нарушающие авторские права.",
                    false);
            embed.addField("🔒 Личное пространство",
                    "Уважай личные границы других.",
                    false);
            embed.addField("🚫 Использование ненормативной лексики",
                    "Избегай ненормативной лексики.",
                    false);
            embed.addField("👮‍♂️ Администрация и модерация",
                    "Администрация всегда на связи для поддержки порядка.",
                    false);
            embed.addField("📜 Соблюдай правила Discord",
                    "Соблюдай общие правила Discord.",
                    false);
            embed.addField("⚖️ Административные решения",
                    "Решения администрации направлены на создание комфортной атмосферы.",
                    false);
            embed.setFooter("Спасибо, что соблюдаешь наши правила!");

            event.getChannel().sendMessageEmbeds(embed.build()).queue();
        }
    }
}
