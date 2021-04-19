package com.employeepayroll;

import java.io.File;

public class FileUtils {
    public static boolean deleteFiles(File contentsTODelete) {
        File[] allContents = contentsTODelete.listFiles();
        if(allContents != null){
            for(File file :allContents){
                deleteFiles(file);
            }
        }
        return contentsTODelete.delete();
    }
}
