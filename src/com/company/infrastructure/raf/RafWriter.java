package com.company.infrastructure.raf;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RafWriter {

    private String fileName;
    private RandomAccessFile arquivo;

    public RafWriter(String fileName) {
        this.fileName = fileName;
    }

    public void open() {
        try {

            File fileArquivo = new File(this.fileName);

            this.arquivo = new RandomAccessFile(fileArquivo, "rw");
        } catch (IOException io) {
            System.out.println("Problemas ao manipular o arquivo: " + io);
        }
    }

    public void close() {
        try {

            this.arquivo.close();
        } catch (IOException io) {
            System.out.println("Problemas ao manipular o arquivo: " + io);
        }
    }

    public String getFileName() {
        return fileName;
    }

    public RandomAccessFile getArquivo() {
        return arquivo;
    }
}
