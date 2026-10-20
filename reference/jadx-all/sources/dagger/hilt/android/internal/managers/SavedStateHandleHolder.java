package dagger.hilt.android.internal.managers;

import android.os.Bundle;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.internal.Preconditions;
import q3.c;
import q3.d;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleHolder {
    private c extras;
    private p0 handle;
    private final boolean nonComponentActivity;

    public SavedStateHandleHolder(c cVar) {
        this.nonComponentActivity = cVar == null;
        this.extras = cVar;
    }

    public void clear() {
        this.extras = null;
    }

    public p0 getSavedStateHandle() {
        ThreadUtil.ensureMainThread();
        Preconditions.checkState(!this.nonComponentActivity, "Activity that does not extend ComponentActivity cannot use SavedStateHandle", new Object[0]);
        p0 p0Var = this.handle;
        if (p0Var != null) {
            return p0Var;
        }
        Preconditions.checkNotNull(this.extras, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
        d dVar = new d(this.extras);
        dVar.f13125a.put(s0.f2180c, Bundle.EMPTY);
        this.extras = dVar;
        p0 p0VarB = s0.b(dVar);
        this.handle = p0VarB;
        this.extras = null;
        return p0VarB;
    }

    public boolean isInvalid() {
        return this.handle == null && this.extras == null;
    }

    public void setExtras(c cVar) {
        if (this.handle != null) {
            return;
        }
        this.extras = cVar;
    }
}
