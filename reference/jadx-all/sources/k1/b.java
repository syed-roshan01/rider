package k1;

import android.os.Build;
import android.view.View;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import o7.i2;
import u1.b3;
import u1.w;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9710a;

    public /* synthetic */ b(int i10) {
        this.f9710a = i10;
    }

    public static final boolean a() {
        Class cls = w.C0;
        try {
            if (w.C0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                w.C0 = cls2;
                w.D0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = w.D0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void b(View view) {
        try {
            if (!b3.f15036z) {
                b3.f15036z = true;
                if (Build.VERSION.SDK_INT < 28) {
                    b3.f15034x = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    b3.f15035y = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    b3.f15034x = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    b3.f15035y = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = b3.f15034x;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = b3.f15035y;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = b3.f15035y;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = b3.f15034x;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            b3.A = true;
        }
    }

    public final String toString() {
        switch (this.f9710a) {
            case 10:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        this(0);
        this.f9710a = i10;
        switch (i10) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
            default:
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case Code.UNAVAILABLE /* 14 */:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case Code.UNAUTHENTICATED /* 16 */:
                this(16);
                break;
            case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                this(17);
                break;
            case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case FirestoreIndexValueWriter.INDEX_TYPE_STRING /* 25 */:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
