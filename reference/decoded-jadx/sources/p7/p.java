package p7;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            v7.b bVar = new v7.b(stringWriter);
            bVar.f15959e = true;
            z6.a.x0(this, bVar);
            return stringWriter.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
