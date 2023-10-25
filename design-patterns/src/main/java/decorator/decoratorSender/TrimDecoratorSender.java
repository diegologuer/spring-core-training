package decorator.decoratorSender;

import decorator.Sender;

public class TrimDecoratorSender extends DecoratorSender {

    public TrimDecoratorSender(Sender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {

        String trimmedMessage = message.replaceAll("[^a-zA-Z0-9]", "");
        super.send(trimmedMessage);
    }
}
