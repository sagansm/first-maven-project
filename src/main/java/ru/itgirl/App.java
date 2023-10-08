package ru.itgirl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        final Map<String, String> dayOfWeekDictionary = new HashMap<String, String>();
        {
            dayOfWeekDictionary.put("monday", "понедельник");
            dayOfWeekDictionary.put("tuesday", "вторник");
            dayOfWeekDictionary.put("wednesday", "среда");
            dayOfWeekDictionary.put("thursday", "четверг");
            dayOfWeekDictionary.put("friday", "пятница");
            dayOfWeekDictionary.put("saturday", "суббота");
            dayOfWeekDictionary.put("sunday", "воскрееснье");
        }

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if (!dayOfWeekDictionary.containsKey(name.toLowerCase()))
            throw new RuntimeException("Wrong day of week:" + name);
        System.out.println("Сегодня " + dayOfWeekDictionary.get(name.toLowerCase()));
    }
}
