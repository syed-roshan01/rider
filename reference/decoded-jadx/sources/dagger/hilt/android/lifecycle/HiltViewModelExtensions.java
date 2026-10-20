package dagger.hilt.android.lifecycle;

import d7.a;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import q3.b;
import q3.c;
import q3.d;

/* JADX INFO: loaded from: classes.dex */
public final class HiltViewModelExtensions {
    public static final <VMF> c addCreationCallback(d dVar, c9.c cVar) {
        a.m(dVar, "<this>");
        a.m(cVar, "callback");
        b bVar = HiltViewModelFactory.CREATION_CALLBACK_KEY;
        a.l(bVar, "CREATION_CALLBACK_KEY");
        dVar.b(bVar, new HiltViewModelExtensions$addCreationCallback$1$1(cVar));
        return dVar;
    }

    public static final <VMF> c withCreationCallback(c cVar, c9.c cVar2) {
        a.m(cVar, "<this>");
        a.m(cVar2, "callback");
        return addCreationCallback(new d(cVar), cVar2);
    }
}
