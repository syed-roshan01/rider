package c1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f2903b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f2904c = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.i f2905a = new o0.i(new l[16]);

    public final boolean a() {
        if (this == f2903b) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (this == f2904c) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        o0.i iVar = this.f2905a;
        if (!iVar.l()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        int i10 = iVar.f12343c;
        if (i10 <= 0) {
            return false;
        }
        Object[] objArr = iVar.f12341a;
        int i11 = 0;
        boolean z10 = false;
        do {
            y0.n nVar = ((y0.n) ((l) objArr[i11])).f16730a;
            if (!nVar.f16742t) {
                throw new IllegalStateException("visitChildren called on an unattached node".toString());
            }
            o0.i iVar2 = new o0.i(new y0.n[16]);
            y0.n nVar2 = nVar.f16735f;
            if (nVar2 == null) {
                t1.g.b(iVar2, nVar);
            } else {
                iVar2.c(nVar2);
            }
            while (iVar2.l()) {
                y0.n nVarF = (y0.n) iVar2.n(iVar2.f12343c - 1);
                if ((nVarF.f16733d & 1024) == 0) {
                    t1.g.b(iVar2, nVarF);
                } else {
                    while (nVarF != null) {
                        if ((nVarF.f16732c & 1024) != 0) {
                            o0.i iVar3 = null;
                            while (nVarF != null) {
                                if (nVarF instanceof p) {
                                    p pVar = (p) nVarF;
                                    if (pVar.G0().f2892a ? androidx.compose.ui.focus.a.C(pVar) : androidx.compose.ui.focus.a.h(pVar, 7, g.f2889d)) {
                                        z10 = true;
                                        break;
                                    }
                                } else if ((nVarF.f16732c & 1024) != 0 && (nVarF instanceof t1.o)) {
                                    int i12 = 0;
                                    for (y0.n nVar3 = ((t1.o) nVarF).f14521v; nVar3 != null; nVar3 = nVar3.f16735f) {
                                        if ((nVar3.f16732c & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                nVarF = nVar3;
                                            } else {
                                                if (iVar3 == null) {
                                                    iVar3 = new o0.i(new y0.n[16]);
                                                }
                                                if (nVarF != null) {
                                                    iVar3.c(nVarF);
                                                    nVarF = null;
                                                }
                                                iVar3.c(nVar3);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                nVarF = t1.g.f(iVar3);
                            }
                            break;
                        }
                        nVarF = nVarF.f16735f;
                    }
                }
            }
            i11++;
        } while (i11 < i10);
        return z10;
    }
}
