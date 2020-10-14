import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

        try {
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if (message != null && message.hasText()) {
            Anniversary anniversary = new Anniversary();
            switch (message.getText()) {
                case "/help":
                    sendMsg(message, "How can I help?");
                    break;
                case "/days":
                    sendMsg(message, "Прошло " + anniversary.getDaysSinceMeeting() + " дней со дня знакомства");
                    break;
                case "/weeks":
                    sendMsg(message, "Прошло " + anniversary.getWeeksSinceMeeting() + " недель со дня знакомства");
                    break;
                case "/months":
                    sendMsg(message, "Прошло " + anniversary.getMonthSinceMeeting() + " месяцев со дня знакомства");
                    break;
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "SaniiaAndSashaAnniversary_bot";
    }

    @Override
    public String getBotToken() {
        return "1121987591:AAFr03D9qd-KgzT13W4OlDCfhza3mnmSt_8";
    }

    public void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            sendMessage(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
