package n;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends f implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f12036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f12037b;

    @Override // n.f
    public final void a(c cVar) {
        c cVar2;
        c cVar3;
        c cVar4 = null;
        if (this.f12036a == cVar && cVar == this.f12037b) {
            this.f12037b = null;
            this.f12036a = null;
        }
        c cVar5 = this.f12036a;
        if (cVar5 == cVar) {
            switch (((b) this).f12028c) {
                case 0:
                    cVar3 = cVar5.f12032d;
                    break;
                default:
                    cVar3 = cVar5.f12031c;
                    break;
            }
            this.f12036a = cVar3;
        }
        c cVar6 = this.f12037b;
        if (cVar6 == cVar) {
            c cVar7 = this.f12036a;
            if (cVar6 != cVar7 && cVar7 != null) {
                switch (((b) this).f12028c) {
                    case 0:
                        cVar2 = cVar6.f12031c;
                        break;
                    default:
                        cVar2 = cVar6.f12032d;
                        break;
                }
                cVar4 = cVar2;
            }
            this.f12037b = cVar4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12037b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f12037b;
        c cVar3 = this.f12036a;
        if (cVar2 != cVar3 && cVar3 != null) {
            switch (((b) this).f12028c) {
                case 0:
                    cVar = cVar2.f12031c;
                    break;
                default:
                    cVar = cVar2.f12032d;
                    break;
            }
        } else {
            cVar = null;
        }
        this.f12037b = cVar;
        return cVar2;
    }
}
