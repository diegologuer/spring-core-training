package decorator.decoratorSender;

import decorator.Sender;

public abstract class DecoratorSender implements Sender {

    Sender sender;
    public abstract void send(String message);
}
