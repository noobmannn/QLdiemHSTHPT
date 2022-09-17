
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
    public static final String JSON_DIEM_PATH = CURRENT_DIR + SEPARATOR + "data" + SEPARATOR + "DiemCuaHS.json";
    public static final String JSON_THONGTIN_PATH = CURRENT_DIR + SEPARATOR + "data" + SEPARATOR + "ThongTinHS.json";
    public static final String JSON_THONGTINLOC_PATH = CURRENT_DIR + SEPARATOR + "data" + SEPARATOR + "DSThongTinHSSauLoc.json";
    public static final String JSON_SORT_PATH = CURRENT_DIR + SEPARATOR + "data" + SEPARATOR + "DSDiemSauSapXep.json";
    public static final String JSON_FILTER_PATH = CURRENT_DIR + SEPARATOR + "data" + SEPARATOR + "DSDiemSauLoc.json";
    
    public static List<DiemCuaHS> readJSONFile(String Path) {
        FileReader fr = null;
        List<DiemCuaHS> data2 = new ArrayList<>();
        try {
            fr = new FileReader(Path);
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

    public static List<HocSinh> readJSONFileTT(String Path) {
        FileReader fr = null;
        List<HocSinh> data2 = new ArrayList<>();
        try {
            fr = new FileReader(Path);
            Gson gson = new Gson();

            java.lang.reflect.Type type = new TypeToken<List<HocSinh>>(){}.getType();
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
    
    public static <E> void writeJSONFile(List<E> list, String Path) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(Path);
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
