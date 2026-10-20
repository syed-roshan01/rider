package p7;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final enum a extends h {
    public a() {
        super("IDENTITY", 0);
    }

    @Override // p7.i
    public final String a(Field field) {
        return field.getName();
    }
}
