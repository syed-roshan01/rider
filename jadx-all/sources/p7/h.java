package p7;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f12828b;

    static {
        a aVar = new a();
        f12827a = aVar;
        f12828b = new h[]{aVar, new h() { // from class: p7.b
            @Override // p7.i
            public final String a(Field field) {
                return h.c(field.getName());
            }
        }, new h() { // from class: p7.c
            @Override // p7.i
            public final String a(Field field) {
                return h.c(h.b(field.getName(), ' '));
            }
        }, new h() { // from class: p7.d
            @Override // p7.i
            public final String a(Field field) {
                return h.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new h() { // from class: p7.e
            @Override // p7.i
            public final String a(Field field) {
                return h.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: p7.f
            @Override // p7.i
            public final String a(Field field) {
                return h.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new h() { // from class: p7.g
            @Override // p7.i
            public final String a(Field field) {
                return h.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String b(String str, char c10) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c10);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f12828b.clone();
    }
}
