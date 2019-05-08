package com.github.nettyexception.commandexecuter;

import java.util.Scanner;
import java.util.function.Consumer;

public class CommandManager {

    /**
     *
     * This method starts the import with a Consumer <String> [stringConsumer] for the commands!
     *
     */

    public static void bootThread(final Consumer<String> stringConsumer) {
        
        if (stringConsumer == null)
            throw new NullPointerExeption("Consumer not found!");
       

        new Thread(() -> {
            final Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext() {
                stringConsumer.accept(scanner.next());
            } 
        }).start();

    }

    /**
     *
     * In this method, all commands are saved with a string, for example: '!shutdown' or '!help'.
     *
     */

    public static void registerCommands() {

        CommandManager.bootThread( string -> {

            if (string.equalsIgnoreCase("!shutdown")) {
                // @TODO Implements ShutdownMethod!
            }

            if (string.equalsIgnoreCase("!help")) {

                System.out.println("Here you can set your own text message!");

            }

        });

    }

    /**
     *
     * In this method, start up the command manager!
     *
     */

    public static void main(String[] args) {
        CommandManager.registerCommands();
    }

}
