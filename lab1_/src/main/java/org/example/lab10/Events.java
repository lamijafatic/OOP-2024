package org.example.lab10;

import java.io.BufferedWriter;
import java.util.Random;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class Events {

    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final Random RANDOM = new Random();

    public void generateEventsFile(String filename, int numberOfRecords) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < numberOfRecords; i++) {
                String timestamp = generateRandomTimestamp();
                String eventType = EVENT_TYPES[RANDOM.nextInt(EVENT_TYPES.length)];
                int userId = RANDOM.nextInt(1000);


                String event = String.format("%s | Event Type: %s | User ID: %d", timestamp, eventType, userId);

                writer.write(event);
                writer.newLine();
            }
            System.out.println("File generated successfully: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 void printEventsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<String> readEventsFromFile(String filename) {
        List<String> events = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                events.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return events;
    }


    private String generateRandomTimestamp() {
        long currentTimeMillis = System.currentTimeMillis();
        long randomOffset = RANDOM.nextInt(365 * 24 * 60 * 60) * 1000L; // Random offset up to 1 year in seconds
        Date randomDate = new Date(currentTimeMillis - randomOffset);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(randomDate);
    }

    public static void main(String[] args) {

        Events events = new Events();
        String filename = "events.txt";

        events.generateEventsFile(filename, 10);

        System.out.println("\nEvents from file:");
        events.printEventsFromFile(filename);


        List<String> eventRecords = events.readEventsFromFile(filename);
        System.out.println("\nRetrieved Events:");
        eventRecords.forEach(System.out::println);
    }
}
