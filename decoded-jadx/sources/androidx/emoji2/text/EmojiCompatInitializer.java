package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.w;
import d4.b;
import i3.l;
import i3.m;
import i3.y;
import j.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // d4.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // d4.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean b(Context context) {
        Object objB;
        y yVar = new y(new a(context, 1));
        yVar.f7966b = 1;
        if (l.f7969k == null) {
            synchronized (l.f7968j) {
                try {
                    if (l.f7969k == null) {
                        l.f7969k = new l(yVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d4.a aVarC = d4.a.c(context);
        aVarC.getClass();
        synchronized (d4.a.f4379e) {
            try {
                objB = aVarC.f4380a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r lifecycle = ((w) objB).getLifecycle();
        lifecycle.a(new m(this, lifecycle));
        return Boolean.TRUE;
    }
}
