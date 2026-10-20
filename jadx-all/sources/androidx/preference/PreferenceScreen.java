package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.ride.accepter.R;
import o1.s;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, s.C(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
    }
}
