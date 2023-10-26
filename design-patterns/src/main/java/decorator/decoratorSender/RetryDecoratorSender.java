package decorator.decoratorSender;

import decorator.Sender;

public class RetryDecoratorSender extends DecoratorSender {

    public RetryDecoratorSender(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void send(String message) {
        int retries = 0;
        while (retries < 2) {
            try {
                sender.send(message);
                break;
            } catch (RuntimeException e) {
                e.printStackTrace();
                retries++;
            }
        }
    }
}
