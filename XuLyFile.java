
package com.actvn.qldiemhsthpt;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XuLyFile {
    private static final String CURRENT_DIR = System.getProperty("user.dir");
    private static final String SEPARATOR = File.separator;
    private static final String JSON_PATH = CURRENT_DIR + SEPARATOR + "data" + SEPARATOR + "DiemCuaHS.json";
    
    public static List<DiemCuaHS> readJSONFile() {
        FileReader fr = null;
        List<DiemCuaHS> data2 = new ArrayList<>();
        try {
            fr = new FileReader(JSON_PATH);
            Gson gson = new Gson();

            java.lang.reflect.Type type = new TypeToken<List<DiemCuaHS>>(){}.getType();
            data2 = gson.fromJson(fr, type);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(XuLyFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(XuLyFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return data2;
    }
    
    public static <E> void writeJSONFile(List<E> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(JSON_PATH);
            Gson gson = new Gson();

            gson.toJson(list, fw);
        } catch (IOException ex) {
            Logger.getLogger(XuLyFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fw != null) {
                try {
                    fw.flush();
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(XuLyFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
