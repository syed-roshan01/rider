package u1;

import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.View;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentSet;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15387b;

    public /* synthetic */ z(Object obj, int i10) {
        this.f15386a = i10;
        this.f15387b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f15386a;
        Object obj3 = this.f15387b;
        switch (i10) {
            case 0:
                return ((Number) ((c9.e) obj3).invoke(obj, obj2)).intValue();
            case 1:
                return ((View) obj3).lambda$applyChanges$0((DocumentViewChange) obj, (DocumentViewChange) obj2);
            default:
                return DocumentSet.lambda$emptySet$0((Comparator) obj3, (Document) obj, (Document) obj2);
        }
    }
}
