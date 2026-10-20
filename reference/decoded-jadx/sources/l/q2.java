package l;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends i3.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10907a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f10908b;

    public q2(EditText editText) {
        this.f10908b = new WeakReference(editText);
    }

    @Override // i3.j
    public final void a() {
        switch (this.f10907a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f10908b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // i3.j
    public final void b() {
        WeakReference weakReference = this.f10908b;
        switch (this.f10907a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) weakReference.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
            default:
                k3.i.a((EditText) weakReference.get(), 1);
                break;
        }
    }

    public q2(SwitchCompat switchCompat) {
        this.f10908b = new WeakReference(switchCompat);
    }
}
