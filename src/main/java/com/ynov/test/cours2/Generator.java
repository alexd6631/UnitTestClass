package com.ynov.test.cours2;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generator {

    static class Person {
        public final int id;
        public final String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    static final List<Person> persons = Arrays.asList(new Person(0, "Jean Dupont"), new Person(1, "Jeanine Dupond"));

    public static void main(String[] args) throws Exception {
        Random r = new Random();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        PrintWriter writer = new PrintWriter(new FileOutputStream("notes.csv"));
        for (int i = 0; i < 50; i++) {
            Person p = persons.get(r.nextInt(persons.size()));
            long t = System.currentTimeMillis() - ((long) r.nextInt(60)) * 24L * 60L * 60L * 1000L;
            double note = r.nextDouble() * 20;
            String line = String.format("%d;%s;%.2f;%s", p.id, p.name, note, df.format(t));
            writer.println(line);
        }
        writer.close();
    }
}
