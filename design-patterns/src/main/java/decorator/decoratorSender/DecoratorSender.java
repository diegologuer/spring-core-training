package decorator.decoratorSender;

import decorator.Sender;

public abstract class DecoratorSender implements Sender {

    private Sender sender;

    public DecoratorSender(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void send(String message) {
        this.sender.send(message);
    }
}
