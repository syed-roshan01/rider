package f9;

import d7.t;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends t {
    public static int y0(Iterable iterable) {
        d7.a.m(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
