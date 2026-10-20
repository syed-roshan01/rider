package k3;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import i3.l;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l.q2;
import o1.s;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public final class a extends v {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final EditText f9717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f9718o;

    public a(EditText editText) {
        super(3, (Object) null);
        this.f9717n = editText;
        i iVar = new i(editText);
        this.f9718o = iVar;
        editText.addTextChangedListener(iVar);
        if (c.f9724b == null) {
            synchronized (c.f9723a) {
                try {
                    if (c.f9724b == null) {
                        c cVar = new c();
                        try {
                            c.f9725c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, c.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        c.f9724b = cVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(c.f9724b);
    }

    @Override // x9.v
    public final InputConnection E(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof d ? inputConnection : new d(this.f9717n, inputConnection, editorInfo);
    }

    @Override // x9.v
    public final void I(boolean z10) {
        i iVar = this.f9718o;
        if (iVar.f9739d != z10) {
            if (iVar.f9738c != null) {
                l lVarA = l.a();
                q2 q2Var = iVar.f9738c;
                lVarA.getClass();
                s.l(q2Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = lVarA.f7970a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    lVarA.f7971b.remove(q2Var);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            iVar.f9739d = z10;
            if (z10) {
                i.a(iVar.f9736a, l.a().b());
            }
        }
    }

    @Override // x9.v
    public final KeyListener u(KeyListener keyListener) {
        if (keyListener instanceof f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new f(keyListener);
    }
}
