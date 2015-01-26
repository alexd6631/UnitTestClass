package com.ynov.test.cours2.di;

import java.io.*;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Snippets {

//    public static void main(String[] args) {
//        Map<String, Integer> maMap = new HashMap<String, Integer>();
//        maMap.put("jean", 25);
//        maMap.put("alex", 28);
//
//        System.out.println(maMap.get("alex"));
//        System.out.println(maMap.get("nan"));
//    }
    public static void main(String[] args) throws Exception {
        if (args.length >= 2) {
            String inPath = args[0];
            String outPath = args[1];
            calcStats(new File(inPath), new File(outPath));
        } else {
            System.out.println("Mauvais nombre d'argument");
            System.exit(1);
        }



    }

    private static void calcStats(File inFile, File outFile) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(inFile)
                )
        );
        String line;
        Map<Integer, List<Float>> mapNotes = new HashMap<Integer, List<Float>>();
        while ((line = reader.readLine()) != null) {
            String[] fragments = line.split(";");
//            System.out.println(Arrays.toString(fragments));
            int id = Integer.parseInt(fragments[0]);
            float note = Float.parseFloat(fragments[2].replace(',', '.'));

            String dateString = fragments[3];
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
            Date now = new Date();

            if (date.getYear() == now.getYear() &&
                    date.getMonth() == now.getMonth()) {

                List<Float> notesPourLeleve = mapNotes.get(id);
                if (notesPourLeleve == null) {
                    notesPourLeleve = new ArrayList<Float>();
                    mapNotes.put(id, notesPourLeleve);
                }
                notesPourLeleve.add(note);
            }



        }


        PrintWriter writer = new PrintWriter(
                new FileOutputStream(outFile));
        for (int cleId : mapNotes.keySet()) {
            List<Float> notes = mapNotes.get(cleId);
            float moy = 0;
            for (float note : notes) {
                moy += note;
            }
            moy /= notes.size();

            float acc = 0;
            for (float note : notes) {
                acc += Math.pow(note - moy, 2);
            }
            float ecartType = (float) Math.sqrt(acc / notes.size());

            writer.println(cleId + ";" + moy + ";" + ecartType);
        }
        writer.close();
    }
}
