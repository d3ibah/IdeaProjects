package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in);
        text = scanner.nextLine();
        System.out.println("Vy vveli: " + text);

        Pattern pattern = Pattern.compile("^\\+375\\(?((17)|(33)|(29))\\)?\\d{7}$");        // \\(? ... \\)? - добавляем проверку на скобки. номер будет определён и со скобками и без
        Matcher matcher = pattern.matcher(text);

        if (matcher.matches()){
            System.out.println("Nomer belaruski");
        }
        else {
            System.out.println("A?");
        }


        String text1 = "aigjol;kaefi tut@tut.by rsegnjaoeiwfnalkwmge regklnm piu@piu.by";

        text1 = text1.replaceAll("([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})", "");
        System.out.println(text1);


        System.out.println("Ukazhite nazvanie faila");
        text = scanner.nextLine();
        System.out.println("Vy vveli: " + text);
        Pattern pFile = Pattern.compile("\\.(json|xml)");
        Matcher mFile = pFile.matcher(text);
        if (mFile.find()){
            System.out.println("Vy vveli verno");
            Pattern pType = Pattern.compile("\\.(xml|json)");
            Matcher mType = pType.matcher(text);
            if (mType.find()) {
                System.out.println(text.substring(mType.start() + 1, mType.end()));
            }
            else {
                System.out.print("Error");
            }
        } else {
            System.out.println("Vy vveli ne verno");
        }


        text = "hellowoooorld";
        Pattern pWord = Pattern.compile("(?<=(\\w))\\1+");
        Matcher mWord = pWord.matcher(text);
        StringBuffer newWord = new StringBuffer();
        while (mWord.find()) {
            mWord.appendReplacement(newWord, Integer.toString(mWord.group().length() + 1));
        }
        mWord.appendTail(newWord);
        text = newWord.toString();
        System.out.println("text = " + text);

    }
}
