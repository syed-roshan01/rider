package ja;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class t extends m {
    @Override // ja.m
    public final e0 a(x xVar) {
        File fileE = xVar.e();
        Logger logger = v.f8575a;
        return new b(new FileOutputStream(fileE, true), new i0());
    }

    @Override // ja.m
    public void b(x xVar, x xVar2) throws IOException {
        d7.a.m(xVar, "source");
        d7.a.m(xVar2, "target");
        if (xVar.e().renameTo(xVar2.e())) {
            return;
        }
        throw new IOException("failed to move " + xVar + " to " + xVar2);
    }

    @Override // ja.m
    public final void c(x xVar) throws IOException {
        if (xVar.e().mkdir()) {
            return;
        }
        l lVarI = i(xVar);
        if (lVarI == null || !lVarI.f8551b) {
            throw new IOException("failed to create directory: " + xVar);
        }
    }

    @Override // ja.m
    public final void d(x xVar) throws IOException {
        d7.a.m(xVar, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileE = xVar.e();
        if (fileE.delete() || !fileE.exists()) {
            return;
        }
        throw new IOException("failed to delete " + xVar);
    }

    @Override // ja.m
    public final List g(x xVar) throws IOException {
        d7.a.m(xVar, "dir");
        File fileE = xVar.e();
        String[] list = fileE.list();
        if (list == null) {
            if (fileE.exists()) {
                throw new IOException("failed to list " + xVar);
            }
            throw new FileNotFoundException("no such file: " + xVar);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            d7.a.j(str);
            arrayList.add(xVar.d(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // ja.m
    public l i(x xVar) {
        d7.a.m(xVar, "path");
        File fileE = xVar.e();
        boolean zIsFile = fileE.isFile();
        boolean zIsDirectory = fileE.isDirectory();
        long jLastModified = fileE.lastModified();
        long length = fileE.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileE.exists()) {
            return new l(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // ja.m
    public final s j(x xVar) {
        d7.a.m(xVar, "file");
        return new s(new RandomAccessFile(xVar.e(), "r"));
    }

    @Override // ja.m
    public final e0 k(x xVar) {
        d7.a.m(xVar, "file");
        File fileE = xVar.e();
        Logger logger = v.f8575a;
        return new b(new FileOutputStream(fileE, false), new i0());
    }

    @Override // ja.m
    public final g0 l(x xVar) {
        d7.a.m(xVar, "file");
        File fileE = xVar.e();
        Logger logger = v.f8575a;
        return new c(new FileInputStream(fileE), i0.f8535d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
