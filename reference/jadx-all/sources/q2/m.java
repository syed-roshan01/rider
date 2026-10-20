package q2;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.ride.accepter.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends Activity implements androidx.lifecycle.w, b3.g {
    private q.z mExtraDataMap = new q.z();
    private androidx.lifecycle.y mLifecycleRegistry = new androidx.lifecycle.y(this);

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:45:0x00b4, B:47:0x00b8, B:50:0x00c2, B:52:0x00c9, B:54:0x00d9, B:59:0x00fb, B:55:0x00dd, B:56:0x00e8, B:58:0x00ec, B:60:0x00fe), top: B:83:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:45:0x00b4, B:47:0x00b8, B:50:0x00c2, B:52:0x00c9, B:54:0x00d9, B:59:0x00fb, B:55:0x00dd, B:56:0x00e8, B:58:0x00ec, B:60:0x00fe), top: B:83:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:45:0x00b4, B:47:0x00b8, B:50:0x00c2, B:52:0x00c9, B:54:0x00d9, B:59:0x00fb, B:55:0x00dd, B:56:0x00e8, B:58:0x00ec, B:60:0x00fe), top: B:83:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:45:0x00b4, B:47:0x00b8, B:50:0x00c2, B:52:0x00c9, B:54:0x00d9, B:59:0x00fb, B:55:0x00dd, B:56:0x00e8, B:58:0x00ec, B:60:0x00fe), top: B:83:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec A[Catch: all -> 0x00c0, LOOP:1: B:56:0x00e8->B:58:0x00ec, LOOP_END, TryCatch #0 {all -> 0x00c0, blocks: (B:45:0x00b4, B:47:0x00b8, B:50:0x00c2, B:52:0x00c9, B:54:0x00d9, B:59:0x00fb, B:55:0x00dd, B:56:0x00e8, B:58:0x00ec, B:60:0x00fe), top: B:83:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:72:0x011c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0132  */
    /* JADX WARN: Code duplicated, block: B:83:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0075, please report this as an issue */
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView;
        b3.p0 p0Var;
        View viewA;
        int keyCode;
        WeakHashMap weakHashMap;
        ArrayList arrayList;
        int size;
        ArrayList arrayList2;
        View view;
        ViewParent parent;
        View decorView2 = getWindow().getDecorView();
        boolean zDispatch = true;
        if (decorView2 != null && h6.g.P(decorView2, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return superDispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!h6.g.f7580c) {
                    try {
                        h6.g.f7581d = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    h6.g.f7580c = true;
                }
                Method method = h6.g.f7581d;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, keyEvent);
                        if (objInvoke == null || !((Boolean) objInvoke).booleanValue()) {
                            if (!window.superDispatchKeyEvent(keyEvent)) {
                                decorView = window.getDecorView();
                                Field field = b3.q0.f2670a;
                                if (Build.VERSION.SDK_INT >= 28) {
                                    zDispatch = keyEvent.dispatch(this, decorView != null ? decorView.getKeyDispatcherState() : null, this);
                                } else {
                                    ArrayList arrayList3 = b3.p0.f2663d;
                                    p0Var = (b3.p0) decorView.getTag(R.id.tag_unhandled_key_event_manager);
                                    if (p0Var == null) {
                                        p0Var = new b3.p0();
                                        p0Var.f2664a = null;
                                        p0Var.f2665b = null;
                                        p0Var.f2666c = null;
                                        decorView.setTag(R.id.tag_unhandled_key_event_manager, p0Var);
                                    }
                                    if (keyEvent.getAction() == 0) {
                                        weakHashMap = p0Var.f2664a;
                                        if (weakHashMap != null) {
                                            weakHashMap.clear();
                                        }
                                        arrayList = b3.p0.f2663d;
                                        if (!arrayList.isEmpty()) {
                                            synchronized (arrayList) {
                                                if (p0Var.f2664a == null) {
                                                    p0Var.f2664a = new WeakHashMap();
                                                }
                                                for (size = arrayList.size() - 1; size >= 0; size--) {
                                                    arrayList2 = b3.p0.f2663d;
                                                    view = (View) ((WeakReference) arrayList2.get(size)).get();
                                                    if (view == null) {
                                                        arrayList2.remove(size);
                                                    } else {
                                                        p0Var.f2664a.put(view, Boolean.TRUE);
                                                        for (parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                                            p0Var.f2664a.put((View) parent, Boolean.TRUE);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    viewA = p0Var.a(decorView);
                                    if (keyEvent.getAction() == 0) {
                                        keyCode = keyEvent.getKeyCode();
                                        if (viewA != null) {
                                            if (p0Var.f2665b == null) {
                                                p0Var.f2665b = new SparseArray();
                                            }
                                            p0Var.f2665b.put(keyCode, new WeakReference(viewA));
                                        }
                                    }
                                    if (viewA == null) {
                                        zDispatch = keyEvent.dispatch(this, decorView != null ? decorView.getKeyDispatcherState() : null, this);
                                    }
                                }
                            }
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (!window.superDispatchKeyEvent(keyEvent)) {
                    decorView = window.getDecorView();
                    Field field2 = b3.q0.f2670a;
                    if (Build.VERSION.SDK_INT >= 28) {
                        zDispatch = keyEvent.dispatch(this, decorView != null ? decorView.getKeyDispatcherState() : null, this);
                    } else {
                        ArrayList arrayList4 = b3.p0.f2663d;
                        p0Var = (b3.p0) decorView.getTag(R.id.tag_unhandled_key_event_manager);
                        if (p0Var == null) {
                            p0Var = new b3.p0();
                            p0Var.f2664a = null;
                            p0Var.f2665b = null;
                            p0Var.f2666c = null;
                            decorView.setTag(R.id.tag_unhandled_key_event_manager, p0Var);
                        }
                        if (keyEvent.getAction() == 0) {
                            weakHashMap = p0Var.f2664a;
                            if (weakHashMap != null) {
                                weakHashMap.clear();
                            }
                            arrayList = b3.p0.f2663d;
                            if (!arrayList.isEmpty()) {
                                synchronized (arrayList) {
                                    if (p0Var.f2664a == null) {
                                        p0Var.f2664a = new WeakHashMap();
                                    }
                                    while (size >= 0) {
                                        arrayList2 = b3.p0.f2663d;
                                        view = (View) ((WeakReference) arrayList2.get(size)).get();
                                        if (view == null) {
                                            arrayList2.remove(size);
                                        } else {
                                            p0Var.f2664a.put(view, Boolean.TRUE);
                                            while (parent instanceof View) {
                                                p0Var.f2664a.put((View) parent, Boolean.TRUE);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        viewA = p0Var.a(decorView);
                        if (keyEvent.getAction() == 0) {
                            keyCode = keyEvent.getKeyCode();
                            if (viewA != null) {
                                if (p0Var.f2665b == null) {
                                    p0Var.f2665b = new SparseArray();
                                }
                                p0Var.f2665b.put(keyCode, new WeakReference(viewA));
                            }
                        }
                        if (viewA == null) {
                            zDispatch = keyEvent.dispatch(this, decorView != null ? decorView.getKeyDispatcherState() : null, this);
                        }
                    }
                }
            } else if (!window.superDispatchKeyEvent(keyEvent)) {
                decorView = window.getDecorView();
                Field field3 = b3.q0.f2670a;
                if (Build.VERSION.SDK_INT >= 28) {
                    zDispatch = keyEvent.dispatch(this, decorView != null ? decorView.getKeyDispatcherState() : null, this);
                } else {
                    ArrayList arrayList5 = b3.p0.f2663d;
                    p0Var = (b3.p0) decorView.getTag(R.id.tag_unhandled_key_event_manager);
                    if (p0Var == null) {
                        p0Var = new b3.p0();
                        p0Var.f2664a = null;
                        p0Var.f2665b = null;
                        p0Var.f2666c = null;
                        decorView.setTag(R.id.tag_unhandled_key_event_manager, p0Var);
                    }
                    if (keyEvent.getAction() == 0) {
                        weakHashMap = p0Var.f2664a;
                        if (weakHashMap != null) {
                            weakHashMap.clear();
                        }
                        arrayList = b3.p0.f2663d;
                        if (!arrayList.isEmpty()) {
                            synchronized (arrayList) {
                                try {
                                    if (p0Var.f2664a == null) {
                                        p0Var.f2664a = new WeakHashMap();
                                    }
                                    while (size >= 0) {
                                        arrayList2 = b3.p0.f2663d;
                                        view = (View) ((WeakReference) arrayList2.get(size)).get();
                                        if (view == null) {
                                            arrayList2.remove(size);
                                        } else {
                                            p0Var.f2664a.put(view, Boolean.TRUE);
                                            while (parent instanceof View) {
                                                p0Var.f2664a.put((View) parent, Boolean.TRUE);
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                    viewA = p0Var.a(decorView);
                    if (keyEvent.getAction() == 0) {
                        keyCode = keyEvent.getKeyCode();
                        if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                            if (p0Var.f2665b == null) {
                                p0Var.f2665b = new SparseArray();
                            }
                            p0Var.f2665b.put(keyCode, new WeakReference(viewA));
                        }
                    }
                    if (viewA == null) {
                        zDispatch = keyEvent.dispatch(this, decorView != null ? decorView.getKeyDispatcherState() : null, this);
                    }
                }
            }
        } else if (!window.superDispatchKeyEvent(keyEvent)) {
            decorView = window.getDecorView();
            Field field4 = b3.q0.f2670a;
            if (Build.VERSION.SDK_INT >= 28) {
                zDispatch = keyEvent.dispatch(this, decorView != null ? decorView.getKeyDispatcherState() : null, this);
            } else {
                ArrayList arrayList6 = b3.p0.f2663d;
                p0Var = (b3.p0) decorView.getTag(R.id.tag_unhandled_key_event_manager);
                if (p0Var == null) {
                    p0Var = new b3.p0();
                    p0Var.f2664a = null;
                    p0Var.f2665b = null;
                    p0Var.f2666c = null;
                    decorView.setTag(R.id.tag_unhandled_key_event_manager, p0Var);
                }
                if (keyEvent.getAction() == 0) {
                    weakHashMap = p0Var.f2664a;
                    if (weakHashMap != null) {
                        weakHashMap.clear();
                    }
                    arrayList = b3.p0.f2663d;
                    if (!arrayList.isEmpty()) {
                        synchronized (arrayList) {
                            if (p0Var.f2664a == null) {
                                p0Var.f2664a = new WeakHashMap();
                            }
                            while (size >= 0) {
                                arrayList2 = b3.p0.f2663d;
                                view = (View) ((WeakReference) arrayList2.get(size)).get();
                                if (view == null) {
                                    arrayList2.remove(size);
                                } else {
                                    p0Var.f2664a.put(view, Boolean.TRUE);
                                    while (parent instanceof View) {
                                        p0Var.f2664a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        }
                    }
                }
                viewA = p0Var.a(decorView);
                if (keyEvent.getAction() == 0) {
                    keyCode = keyEvent.getKeyCode();
                    if (viewA != null) {
                        if (p0Var.f2665b == null) {
                            p0Var.f2665b = new SparseArray();
                        }
                        p0Var.f2665b.put(keyCode, new WeakReference(viewA));
                    }
                }
                if (viewA == null) {
                    zDispatch = keyEvent.dispatch(this, decorView != null ? decorView.getKeyDispatcherState() : null, this);
                }
            }
        }
        return zDispatch;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !h6.g.P(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends l> T getExtraData(Class<T> cls) {
        a7.a.w(this.mExtraDataMap.get(cls));
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i10 = androidx.lifecycle.n0.f2158b;
        x9.v.y(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.y yVar = this.mLifecycleRegistry;
        yVar.getClass();
        yVar.e("markState");
        yVar.h();
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(l lVar) {
        throw null;
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        boolean z10 = false;
        if (strArr != null && strArr.length > 0) {
            String str = strArr[0];
            str.getClass();
            switch (str) {
                case "--translation":
                    if (Build.VERSION.SDK_INT >= 31) {
                        z10 = true;
                        break;
                    }
                    break;
                case "--dump-dumpable":
                case "--list-dumpables":
                    if (Build.VERSION.SDK_INT >= 33) {
                        z10 = true;
                        break;
                    }
                    break;
                case "--contentcapture":
                    if (Build.VERSION.SDK_INT >= 29) {
                        z10 = true;
                        break;
                    }
                    break;
                case "--autofill":
                    z10 = true;
                    break;
            }
        }
        return !z10;
    }

    @Override // b3.g
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
