package c0;

import d7.t;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import m9.d0;
import r1.s;
import v.p;

/* JADX INFO: loaded from: classes.dex */
public final class j extends w8.i implements c9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f2860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c9.a f2861d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, s sVar, c9.a aVar, u8.e eVar) {
        super(2, eVar);
        this.f2859b = mVar;
        this.f2860c = sVar;
        this.f2861d = aVar;
    }

    @Override // w8.a
    public final u8.e create(Object obj, u8.e eVar) {
        return new j(this.f2859b, this.f2860c, this.f2861d, eVar);
    }

    @Override // c9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((d0) obj, (u8.e) obj2)).invokeSuspend(q8.l.f13235a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    @Override // w8.a
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objS;
        v8.a aVar = v8.a.f15963a;
        int i10 = this.f2858a;
        q8.l lVar = q8.l.f13235a;
        if (i10 == 0) {
            t.v0(obj);
            m mVar = this.f2859b;
            h hVar = mVar.f2870w;
            i iVar = new i(mVar, this.f2860c, this.f2861d);
            this.f2858a = 1;
            v.s sVar = (v.s) hVar;
            sVar.getClass();
            d1.d dVar = (d1.d) iVar.invoke();
            if (dVar == null || sVar.I0(sVar.D, dVar)) {
                objS = lVar;
            } else {
                m9.l lVar2 = new m9.l(1, t.b0(this));
                lVar2.t();
                p pVar = new p(iVar, lVar2);
                v.l lVar3 = sVar.f15769y;
                lVar3.getClass();
                d1.d dVar2 = (d1.d) iVar.invoke();
                if (dVar2 == null) {
                    lVar2.resumeWith(lVar);
                } else {
                    lVar2.v(new u.s(3, lVar3, pVar));
                    o0.i iVar2 = lVar3.f15664a;
                    int i11 = new i9.g(0, iVar2.f12343c - 1, 1).f8184b;
                    if (i11 < 0) {
                        iVar2.b(0, pVar);
                        break;
                    }
                    while (true) {
                        d1.d dVar3 = (d1.d) ((p) iVar2.f12341a[i11]).f15731a.invoke();
                        if (dVar3 != null) {
                            d1.d dVarD = dVar2.d(dVar3);
                            if (!d7.a.d(dVarD, dVar2)) {
                                if (!d7.a.d(dVarD, dVar3)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i12 = iVar2.f12343c - 1;
                                    if (i12 <= i11) {
                                        while (true) {
                                            ((p) iVar2.f12341a[i11]).f15732b.l(cancellationException);
                                            if (i12 == i11) {
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                }
                            } else {
                                iVar2.b(i11 + 1, pVar);
                                break;
                            }
                        }
                        if (i11 == 0) {
                            iVar2.b(0, pVar);
                            break;
                        }
                        i11--;
                    }
                    if (!sVar.E) {
                        sVar.J0();
                    }
                }
                objS = lVar2.s();
                if (objS != v8.a.f15963a) {
                    objS = lVar;
                }
            }
            if (objS == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.v0(obj);
        }
        return lVar;
    }
}
