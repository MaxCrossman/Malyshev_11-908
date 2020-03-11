/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud.lesson_14;

import java.util.Scanner;

/**
 *
 * @author Администратор
 */
public interface Messenger {

    public void sendMessage();

    void getMessage();
    default String print(){
        return "Messenger = " + this.getClass().getSimpleName();
    }
}

interface BestMessener extends Messenger {

}

interface Application {

    void run();
}

class Telegram implements Messenger, Application {

    @Override
    public void sendMessage() {
        System.out.println("Send via Telegram");
    }

    @Override
    public void getMessage() {
        System.out.println("Get message on Telegram");
    }

    @Override
    public void run() {
        System.out.println("Telegram is run.");
    }
}

class WhatsApp implements Messenger, Application {

    @Override
    public void sendMessage() {
        System.out.println("Send via WhatsApp");
    }

    @Override
    public void getMessage() {
        System.out.println("Get message on WhatsApp");
    }

    @Override
    public void run() {
        System.out.println("WhatsApp is run.");
    }
}

class Client {

    private Messenger messenger;

    public Client(Messenger messenger) {
        this.messenger = messenger;
        this.messenger.getMessage();
    }

    public Client() {
        this.messenger = new Telegram();
        this.messenger.sendMessage();
    }
}

class Smartphone {
    private Application app;

    public Smartphone() {
        this.app = new Telegram();
        this.app.run();
    }
}

class testMessenger {

    public static void main(String[] args) {
        Telegram tgm = new Telegram();
        WhatsApp wa = new WhatsApp();
        Client client = new Client(tgm);
    }
}
