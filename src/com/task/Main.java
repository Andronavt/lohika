package com.task;

public class Main {

    public static void main(String[] args) {
        int topWords = 0;
        String filePath = null;
        if (args.length > 0 && args.length == 2) {
            try {
                topWords = Integer.parseInt(args[0]);
                filePath = args[1];
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        } else {
            System.err.println("To many arguments");
        }
        if (filePath != null) {
            Task task = new Task(filePath, topWords);
            task.process();
        }
    }
}
