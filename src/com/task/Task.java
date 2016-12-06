package com.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


/**
 * Created by andriyoliynyk on 12/6/16.
 */
public class Task {

    private final String fileName;
    private final int topWords;

    public Task(String fileName, int topWords) {
        this.fileName = fileName;
        this.topWords = topWords;
    }


    public void process() {
        List<String> words = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNext()) {
                words.add(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
        logic(words, topWords);
    }


    private void logic(List<String> words, int topWords) {
        if (words.isEmpty()) {
            return;
        }
        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(topWords)
                .forEach(System.out::println);
    }


}
