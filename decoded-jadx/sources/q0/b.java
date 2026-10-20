package q0;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d9.j implements c9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f13049b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Collection collection) {
        super(1);
        this.f13048a = i10;
        this.f13049b = collection;
    }

    @Override // c9.c
    public final Object invoke(Object obj) {
        Collection<?> collection = this.f13049b;
        int i10 = this.f13048a;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(collection.contains(obj));
                    default:
                        return Boolean.valueOf(collection.contains(obj));
                }
            case 1:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(collection.contains(obj));
                    default:
                        return Boolean.valueOf(collection.contains(obj));
                }
            default:
                return Boolean.valueOf(((List) obj).retainAll(collection));
        }
    }
}
