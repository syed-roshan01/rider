package l;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f10930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f10931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f10932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Field f10933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Field f10934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Field f10935f;

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z10;
        try {
            Class<?> cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
            try {
                field = cls.getField("left");
                try {
                    field2 = cls.getField("top");
                    try {
                        field3 = cls.getField("right");
                        try {
                            field4 = cls.getField("bottom");
                            z10 = true;
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            field4 = null;
                            z10 = false;
                        }
                    } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                        field3 = null;
                    }
                } catch (ClassNotFoundException unused3) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f10931b = method;
                        f10932c = field;
                        f10933d = field2;
                        f10934e = field3;
                        f10935f = field4;
                        f10930a = true;
                        return;
                    }
                    f10931b = null;
                    f10932c = null;
                    f10933d = null;
                    f10934e = null;
                    f10935f = null;
                    f10930a = false;
                } catch (NoSuchFieldException unused4) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f10931b = method;
                        f10932c = field;
                        f10933d = field2;
                        f10934e = field3;
                        f10935f = field4;
                        f10930a = true;
                        return;
                    }
                    f10931b = null;
                    f10932c = null;
                    f10933d = null;
                    f10934e = null;
                    f10935f = null;
                    f10930a = false;
                } catch (NoSuchMethodException unused5) {
                    field2 = null;
                    field3 = field2;
                    field4 = null;
                    z10 = false;
                    if (z10) {
                        f10931b = method;
                        f10932c = field;
                        f10933d = field2;
                        f10934e = field3;
                        f10935f = field4;
                        f10930a = true;
                        return;
                    }
                    f10931b = null;
                    f10932c = null;
                    f10933d = null;
                    f10934e = null;
                    f10935f = null;
                    f10930a = false;
                }
            } catch (ClassNotFoundException unused6) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                    f10931b = method;
                    f10932c = field;
                    f10933d = field2;
                    f10934e = field3;
                    f10935f = field4;
                    f10930a = true;
                    return;
                }
                f10931b = null;
                f10932c = null;
                f10933d = null;
                f10934e = null;
                f10935f = null;
                f10930a = false;
            } catch (NoSuchFieldException unused7) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                    f10931b = method;
                    f10932c = field;
                    f10933d = field2;
                    f10934e = field3;
                    f10935f = field4;
                    f10930a = true;
                    return;
                }
                f10931b = null;
                f10932c = null;
                f10933d = null;
                f10934e = null;
                f10935f = null;
                f10930a = false;
            } catch (NoSuchMethodException unused8) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z10 = false;
                if (z10) {
                    f10931b = method;
                    f10932c = field;
                    f10933d = field2;
                    f10934e = field3;
                    f10935f = field4;
                    f10930a = true;
                    return;
                }
                f10931b = null;
                f10932c = null;
                f10933d = null;
                f10934e = null;
                f10935f = null;
                f10930a = false;
            }
        } catch (ClassNotFoundException unused9) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused10) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused11) {
            method = null;
            field = null;
        }
        if (z10) {
            f10931b = method;
            f10932c = field;
            f10933d = field2;
            f10934e = field3;
            f10935f = field4;
            f10930a = true;
            return;
        }
        f10931b = null;
        f10932c = null;
        f10933d = null;
        f10934e = null;
        f10935f = null;
        f10930a = false;
    }
}
