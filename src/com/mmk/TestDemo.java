package com.mmk;

import java.util.*;
import java.util.stream.Collectors;

public class TestDemo {


    public static void main(String[] args) {
        int array[] = {7, 6, 4, 3, 3, 4, 9};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println(set);


        int temp[] = Arrays.stream(array).distinct().toArray();

        System.out.println(Arrays.toString(temp));


        String words[] = {"the", "dog", "at", "a", "done"};
        String characterString = "ae";
        List<String> updatedWordsArray = Arrays.stream(words)
                .filter(s -> s.chars().anyMatch(ch -> characterString.indexOf(ch) >= 0))
                .collect(Collectors.toList());
        System.out.println(updatedWordsArray);


        String filePath[] = {"/saves/important/diary.txt",
                "/saves/important/notes.txt",
                "/verify/cat.jpg",
                "/work/reports.txt"};

        // In between we will check weather our file extends with .txt.

        String sampleFilePath = "/saves/important/diary.txt";

        System.out.println(sampleFilePath.lastIndexOf(".txt") > 0);

        // Now read the file content using Buffer Reader and file reader.

        String fileContent[] = {"/saves/import/dairy.txt Sec…[M-R]assw….",
                "/saves/import/notes.txt cret…[ABPX]….", "/saves/import/dairy.txt Sec…[M-R]assw…."};

        // iterate the file content String and split each String with the

        String sampleFileContent = "/saves/import/dairy.txt Sec…[M-R]assw….";

        LinkedHashSet<String> filePathSet = new LinkedHashSet<>();
        LinkedHashSet<String> clueSet = new LinkedHashSet<>();


        for (String string : fileContent) {
            String splitArray[] = string.split(" ", 2);
            filePathSet.add(splitArray[0]);
            clueSet.add(splitArray[1]);
        }
        System.out.println(filePathSet);
        System.out.println(clueSet);


    }
}
