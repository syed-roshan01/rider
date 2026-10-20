package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.ride.accepter.R;
import o1.s;
import t3.a;
import t3.b;
import x9.v;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CharSequence[] f2215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f2216p;

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.f14639d, i10, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f2215o = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        if (typedArrayObtainStyledAttributes.getTextArray(3) == null) {
            typedArrayObtainStyledAttributes.getTextArray(1);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (v.f16470d == null) {
                v.f16470d = new v(15, (Object) null);
            }
            this.f2223n = v.f16470d;
            b();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b.f14641f, i10, 0);
        this.f2216p = s.O(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        a aVar = this.f2223n;
        if (aVar != null) {
            return ((v) aVar).G(this);
        }
        CharSequence charSequenceD = d();
        CharSequence charSequenceA = super.a();
        String str = this.f2216p;
        if (str == null) {
            return charSequenceA;
        }
        Object[] objArr = new Object[1];
        if (charSequenceD == null) {
            charSequenceD = "";
        }
        objArr[0] = charSequenceD;
        String str2 = String.format(str, objArr);
        if (TextUtils.equals(str2, charSequenceA)) {
            return charSequenceA;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public final CharSequence d() {
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s.C(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
