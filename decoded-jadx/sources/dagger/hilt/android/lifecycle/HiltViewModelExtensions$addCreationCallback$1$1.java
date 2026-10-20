package dagger.hilt.android.lifecycle;

import androidx.lifecycle.x0;
import c9.c;
import d9.j;

/* JADX INFO: loaded from: classes.dex */
public final class HiltViewModelExtensions$addCreationCallback$1$1 extends j implements c {
    final /* synthetic */ c $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiltViewModelExtensions$addCreationCallback$1$1(c cVar) {
        super(1);
        this.$callback = cVar;
    }

    @Override // c9.c
    public final x0 invoke(Object obj) {
        return (x0) this.$callback.invoke(obj);
    }
}
