package decorator;

import decorator.decoratorSender.RetryDecoratorSender;
import decorator.decoratorSender.TrimDecoratorSender;

public class DecoratorPattern {

    // TODO implement two Senders with enriched logic:
    // 1. Decorator with 2 retries if the message hasn't been sent (threw a RuntimeException)
    // 2. Decorator that removes all leading and trailing non-alphanumeric symbols
    // in the message before sending it

    public static void main(String[] args) {
        //Instance a sender without any extra decoration
        Sender sender = new SimpleEmailSender();

        //Instance a sender with the retry decoration
        Sender retrySender = new RetryDecoratorSender(sender);

        //We can even instance a sender with both decorations
        Sender trimSender = new TrimDecoratorSender(retrySender);

        //Test
        sender.send("Hello world");
        retrySender.send("Hello world");
        trimSender.send("###$$Hello world@@@@@");

    }
}
