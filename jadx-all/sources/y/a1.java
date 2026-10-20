package y;

import androidx.compose.foundation.layout.LayoutWeightElement;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes.dex */
public interface a1 {
    static y0.o a() {
        if (1.0f > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return new LayoutWeightElement(z6.a.o(1.0f, Float.MAX_VALUE), true);
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
