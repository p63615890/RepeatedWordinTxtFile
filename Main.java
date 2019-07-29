package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Copy Path"));
        String currentLine = bufferedReader.readLine();

        while (currentLine != null) {
            String[] words = currentLine.toLowerCase().split(" ");
            for (String word : words) {
                if (hashMap.containsKey(word)) {
                    hashMap.put(word, hashMap.get(word) + 1);
                } else {
                    hashMap.put(word, 1);
                }

            }
            currentLine = bufferedReader.readLine();

        }
        String mostRepeatWord = "";
        int count =0;
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<String,Integer> entry : entrySet)
        {
            if(entry.getValue() > count)
            {
                mostRepeatWord = entry.getKey();
                count = entry.getValue();
            }
        }
        System.out.println("The most repeated word in input file is :" +mostRepeatWord);
        System.out.println("Number Of Occurrences : "+count);

        bufferedReader.close();
    }}
