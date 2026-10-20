package u1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.ride.accepter.R;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f15308a = new LinkedHashMap();

    public static final p9.o0 a(Context context) {
        p9.o0 o0Var;
        LinkedHashMap linkedHashMap = f15308a;
        synchronized (linkedHashMap) {
            try {
                Object objW0 = linkedHashMap.get(context);
                if (objW0 == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    o9.c cVarA = z6.a.a(-1, null, 6);
                    a4.c0 c0Var = new a4.c0(new s3(contentResolver, uriFor, new t3(cVarA, o1.s.r(Looper.getMainLooper()), 0), cVarA, context, null));
                    m9.y1 y1VarK = d7.t.k();
                    t9.d dVar = m9.m0.f11969a;
                    objW0 = h6.g.w0(c0Var, new r9.e(y1VarK.O(r9.o.f13724a)), new p9.n0(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objW0);
                }
                o0Var = (p9.o0) objW0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0Var;
    }

    public static final m0.u b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof m0.u) {
            return (m0.u) tag;
        }
        return null;
    }
}
