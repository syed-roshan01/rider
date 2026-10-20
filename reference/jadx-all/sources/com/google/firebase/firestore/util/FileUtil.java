package com.google.firebase.firestore.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/* JADX INFO: loaded from: classes.dex */
public class FileUtil {

    public static class DefaultFileDeleter {
        private DefaultFileDeleter() {
        }

        public static void delete(File file) throws IOException {
            try {
                Files.deleteIfExists(file.toPath());
            } catch (IOException e4) {
                throw new IOException("Failed to delete file " + file + ": " + e4);
            }
        }
    }

    public static class LegacyFileDeleter {
        private LegacyFileDeleter() {
        }

        public static void delete(File file) throws IOException {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("Failed to delete file " + file);
        }
    }

    public static void delete(File file) throws IOException {
        DefaultFileDeleter.delete(file);
    }
}
