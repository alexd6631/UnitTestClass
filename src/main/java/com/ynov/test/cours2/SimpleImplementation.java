package com.ynov.test.cours2;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleImplementation {

    public static void main(String[] args) throws Exception {
        File in = new File(args[0]);
        File out = new File(args[1]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(in)));

        Map<Integer, List<Double>> notes = new HashMap<Integer, List<Double>>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(";");
            int id = Integer.parseInt(parts[0]);
            double note = Double.parseDouble(parts[2].replace(",", "."));

            List<Double> notesForStudent = notes.get(id);
            if (notesForStudent == null) {
                notesForStudent = new ArrayList<Double>();
                notesForStudent.add(note);
                notes.put(id, notesForStudent);
            } else {
                notesForStudent.add(note);
            }
        }

        PrintWriter writer = new PrintWriter(out);
        for (int id : notes.keySet()) {
            List<Double> notesForStudent = notes.get(id);

            double moy = 0;
            for (double note : notesForStudent) {
                moy += note;
            }
            moy = moy / notesForStudent.size();

            System.out.println("moy " + id  + " " + moy);
            double ecartType = 0;
            for (double note : notesForStudent) {
                ecartType += Math.pow(note - moy, 2);
            }
            ecartType = ecartType / notesForStudent.size();
            ecartType = Math.sqrt(ecartType);

            System.out.println("ecartType " + id  + " " + ecartType);
            writer.println(id+";"+moy+";"+ecartType);
        }
        writer.close();
    }
}
