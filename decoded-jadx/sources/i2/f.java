package i2;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import m0.g1;
import m0.n1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i3.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7931a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7933c;

    public f(n1 n1Var, g gVar) {
        this.f7932b = n1Var;
        this.f7933c = gVar;
    }

    @Override // i3.j
    public final void a() {
        switch (this.f7931a) {
            case 0:
                ((g) this.f7933c).f7934a = j.f7937a;
                break;
        }
    }

    @Override // i3.j
    public final void b() {
        InputFilter[] filters;
        int length;
        int i10 = this.f7931a;
        Object obj = this.f7933c;
        Object obj2 = this.f7932b;
        switch (i10) {
            case 0:
                ((g1) obj2).setValue(Boolean.TRUE);
                ((g) obj).f7934a = new k(true);
                break;
            default:
                TextView textView = (TextView) ((Reference) obj2).get();
                InputFilter inputFilter = (InputFilter) ((Reference) obj).get();
                if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                    for (InputFilter inputFilter2 : filters) {
                        if (inputFilter2 == inputFilter) {
                            if (textView.isAttachedToWindow()) {
                                CharSequence text = textView.getText();
                                i3.l lVarA = i3.l.a();
                                if (text == null) {
                                    length = 0;
                                } else {
                                    lVarA.getClass();
                                    length = text.length();
                                }
                                CharSequence charSequenceG = lVarA.g(0, length, text);
                                if (text != charSequenceG) {
                                    int selectionStart = Selection.getSelectionStart(charSequenceG);
                                    int selectionEnd = Selection.getSelectionEnd(charSequenceG);
                                    textView.setText(charSequenceG);
                                    if (charSequenceG instanceof Spannable) {
                                        Spannable spannable = (Spannable) charSequenceG;
                                        if (selectionStart >= 0 && selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                                        } else if (selectionStart >= 0) {
                                            Selection.setSelection(spannable, selectionStart);
                                        } else if (selectionEnd >= 0) {
                                            Selection.setSelection(spannable, selectionEnd);
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }

    public f(TextView textView, k3.e eVar) {
        this.f7932b = new WeakReference(textView);
        this.f7933c = new WeakReference(eVar);
    }
}
