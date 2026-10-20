package g2;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f6598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f6601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f6604g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6605h = true;

    public w(a0 a0Var, d0 d0Var, boolean z10) {
        this.f6598a = d0Var;
        this.f6599b = z10;
        this.f6601d = a0Var;
    }

    public final void a(i iVar) {
        this.f6600c++;
        try {
            this.f6604g.add(iVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i10 = this.f6600c - 1;
        this.f6600c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f6604g;
            if (!arrayList.isEmpty()) {
                this.f6598a.f6526a.f6548e.invoke(r8.p.Y0(arrayList));
                arrayList.clear();
            }
        }
        return this.f6600c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z10 = this.f6605h;
        if (!z10) {
            return z10;
        }
        this.f6600c++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f6605h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f6604g.clear();
        this.f6600c = 0;
        this.f6605h = false;
        e0 e0Var = this.f6598a.f6526a;
        int size = e0Var.f6552i.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = e0Var.f6552i;
            if (d7.a.d(((WeakReference) arrayList.get(i10)).get(), this)) {
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f6605h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        boolean z10 = this.f6605h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f6605h;
        return z10 ? this.f6599b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f6605h;
        if (z10) {
            a(new a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f6605h;
        if (!z10) {
            return z10;
        }
        a(new g(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f6605h;
        if (!z10) {
            return z10;
        }
        a(new h(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z10 = this.f6605h;
        if (!z10) {
            return z10;
        }
        a(new l());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        a0 a0Var = this.f6601d;
        return TextUtils.getCapsMode(a0Var.f6509a.f918a, a2.b0.e(a0Var.f6510b), i10);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f6603f = z10;
        if (z10) {
            this.f6602e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return i1.b.L(this.f6601d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        if (a2.b0.b(this.f6601d.f6510b)) {
            return null;
        }
        return o1.s.L(this.f6601d).f918a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        return o1.s.P(this.f6601d, i10).f918a;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        return o1.s.Q(this.f6601d, i10).f918a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        boolean z10 = this.f6605h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new z(0, this.f6601d.f6509a.f918a.length()));
                    break;
                case R.id.cut:
                    c(277);
                    break;
                case R.id.copy:
                    c(278);
                    break;
                case R.id.paste:
                    c(279);
                    break;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i10) {
        int i11;
        boolean z10 = this.f6605h;
        if (z10) {
            z10 = true;
            if (i10 != 0) {
                switch (i10) {
                    case 2:
                        i11 = 2;
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                        i11 = 6;
                        break;
                    case 6:
                        i11 = 7;
                        break;
                    case 7:
                        i11 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i10);
                        i11 = 1;
                        break;
                }
            } else {
                i11 = 1;
            }
            this.f6598a.f6526a.f6549f.invoke(new n(i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f6605h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0060  */
    /* JADX WARN: Code duplicated, block: B:46:0x0066  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        e eVar;
        boolean z13 = this.f6605h;
        if (!z13) {
            return z13;
        }
        boolean z14 = false;
        boolean z15 = (i10 & 1) != 0;
        boolean z16 = (i10 & 2) != 0;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            z11 = (i10 & 16) != 0;
            z12 = (i10 & 8) != 0;
            boolean z17 = (i10 & 4) != 0;
            if (i11 >= 34 && (i10 & 32) != 0) {
                z14 = true;
            }
            if (z11 || z12 || z17 || z14) {
                z10 = z14;
                z14 = z17;
            } else {
                if (i11 >= 34) {
                    z10 = true;
                    z14 = true;
                } else {
                    z10 = z14;
                    z14 = true;
                }
                z11 = z14;
            }
            eVar = this.f6598a.f6526a.f6555l;
            eVar.f6531e = z11;
            eVar.f6532f = z12;
            eVar.f6533g = z14;
            eVar.f6534h = z10;
            if (z15) {
                eVar.f6530d = true;
                if (eVar.f6535i != null) {
                    eVar.a();
                }
            }
            eVar.f6529c = z16;
            return true;
        }
        z10 = false;
        z11 = true;
        z12 = z11;
        eVar = this.f6598a.f6526a.f6555l;
        eVar.f6531e = z11;
        eVar.f6532f = z12;
        eVar.f6533g = z14;
        eVar.f6534h = z10;
        if (z15) {
            eVar.f6530d = true;
            if (eVar.f6535i != null) {
                eVar.a();
            }
        }
        eVar.f6529c = z16;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z10 = this.f6605h;
        if (!z10) {
            return z10;
        }
        ((BaseInputConnection) this.f6598a.f6526a.f6553j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f6605h;
        if (z10) {
            a(new x(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f6605h;
        if (z10) {
            a(new y(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        boolean z10 = this.f6605h;
        if (!z10) {
            return z10;
        }
        a(new z(i10, i11));
        return true;
    }
}
