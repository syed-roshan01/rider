package b3;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o1 extends n1 {
    public o1(u1 u1Var, WindowInsets windowInsets) {
        super(u1Var, windowInsets);
    }

    @Override // b3.r1
    public u1 a() {
        return u1.c(null, this.f2652c.consumeDisplayCutout());
    }

    @Override // b3.r1
    public f e() {
        DisplayCutout displayCutout = this.f2652c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new f(displayCutout);
    }

    @Override // b3.m1, b3.r1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Objects.equals(this.f2652c, o1Var.f2652c) && Objects.equals(this.f2656g, o1Var.f2656g);
    }

    @Override // b3.r1
    public int hashCode() {
        return this.f2652c.hashCode();
    }
}
