package androidx.compose.foundation;

import c1.p;
import t1.u0;
import u.m0;
import x.m;
import y0.l;
import y0.n;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FocusableKt$FocusableInNonTouchModeElement$1 f1623a = new u0() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
        public final boolean equals(Object obj) {
            return this == obj;
        }

        @Override // t1.u0
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // t1.u0
        public final n l() {
            return new m0();
        }

        @Override // t1.u0
        public final /* bridge */ /* synthetic */ void m(n nVar) {
        }
    };

    public static final o a(m mVar, o oVar, boolean z10) {
        return oVar.j(z10 ? new FocusableElement(mVar).j(new u0() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // t1.u0
            public final int hashCode() {
                return 1739042953;
            }

            @Override // t1.u0
            public final n l() {
                return new p();
            }

            @Override // t1.u0
            public final /* bridge */ /* synthetic */ void m(n nVar) {
            }
        }) : l.f16729b);
    }
}
