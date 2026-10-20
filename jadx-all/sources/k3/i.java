package k3;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import i3.l;
import l.q2;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f9736a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q2 f9738c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9737b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9739d = true;

    public i(EditText editText) {
        this.f9736a = editText;
    }

    public static void a(EditText editText, int i10) {
        int length;
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            l lVarA = l.a();
            if (editableText == null) {
                length = 0;
            } else {
                lVarA.getClass();
                length = editableText.length();
            }
            lVarA.g(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f9736a;
        if (editText.isInEditMode() || !this.f9739d) {
            return;
        }
        if ((this.f9737b || l.c()) && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iB = l.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    l.a().g(i10, i12 + i10, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            l lVarA = l.a();
            if (this.f9738c == null) {
                this.f9738c = new q2(editText);
            }
            lVarA.h(this.f9738c);
        }
    }
}
