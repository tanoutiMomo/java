package org.tanouti.oop.basics.abstraction;

public class Main {

    // abstraction is to reduce complexity by hiding unnecessary details
    // for example a remote control has a lot of button which do some complex
    // functionality, since we don't care how it do, we keep it abstract what.
    // in this example all we care about is sending a mail, all other methode adds complexity
    // to the consumer of this class. for that we hace to move ( connect, authenticate, disconnect) to an abstract class
    // we can change details without affecting other classes.
    public static void main(String[] args) {
        MailService mailService = new MailService();
        mailService.sendEmail();
    }
}
