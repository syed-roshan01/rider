package b3;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.ride.accepter.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f2605c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2607b;

    public c() {
        this(f2605c);
    }

    public e.a a(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.f2606a, view);
        if (accessibilityNodeProviderA != null) {
            return new e.a(accessibilityNodeProviderA);
        }
        return null;
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2606a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, c3.k kVar) {
        this.f2606a.onInitializeAccessibilityNodeInfo(view, kVar.f2942a);
    }

    public boolean h(View view, int i10, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z10 = false;
        for (int i11 = 0; i11 < listEmptyList.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((c3.e) listEmptyList.get(i11)).f2939a).getId() != i10; i11++) {
        }
        boolean zB = b.b(this.f2606a, view, i10, bundle);
        if (zB || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zB;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    z10 = true;
                    break;
                }
            }
        }
        return z10;
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2606a = accessibilityDelegate;
        this.f2607b = new a(this);
    }
}
