package k3;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import i3.l;
import j0.b0;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class f implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f9730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f9731b;

    public f(KeyListener keyListener) {
        v vVar = new v(5, (Object) null);
        this.f9730a = keyListener;
        this.f9731b = vVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f9730a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f9730a.getInputType();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean zA;
        this.f9731b.getClass();
        Object obj = l.f7968j;
        if (i10 != 67) {
            if (i10 == 112) {
                zA = b0.a(editable, keyEvent, true);
            }
            if (this.f9730a.onKeyDown(view, editable, i10, keyEvent)) {
                return true;
            }
            return false;
        }
        zA = b0.a(editable, keyEvent, false);
        if (zA) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        if (this.f9730a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f9730a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f9730a.onKeyUp(view, editable, i10, keyEvent);
    }
}
