package b2;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
public final class j implements p {
    @Override // b2.p
    public StaticLayout a(q qVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(qVar.f2551a, qVar.f2552b, qVar.f2553c, qVar.f2554d, qVar.f2555e);
        builderObtain.setTextDirection(qVar.f2556f);
        builderObtain.setAlignment(qVar.f2557g);
        builderObtain.setMaxLines(qVar.f2558h);
        builderObtain.setEllipsize(qVar.f2559i);
        builderObtain.setEllipsizedWidth(qVar.f2560j);
        builderObtain.setLineSpacing(qVar.f2562l, qVar.f2561k);
        builderObtain.setIncludePad(qVar.f2564n);
        builderObtain.setBreakStrategy(qVar.f2566p);
        builderObtain.setHyphenationFrequency(qVar.f2569s);
        builderObtain.setIndents(qVar.f2570t, qVar.f2571u);
        int i10 = Build.VERSION.SDK_INT;
        k.a(builderObtain, qVar.f2563m);
        if (i10 >= 28) {
            m.a(builderObtain, qVar.f2565o);
        }
        if (i10 >= 33) {
            n.b(builderObtain, qVar.f2567q, qVar.f2568r);
        }
        return builderObtain.build();
    }
}
