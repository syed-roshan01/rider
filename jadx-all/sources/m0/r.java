package m0;

import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.FieldIndex;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.TargetIndexMatcher;
import com.google.firebase.firestore.util.AsyncQueue;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11687a;

    public /* synthetic */ r(int i10) {
        this.f11687a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11687a) {
            case 0:
                return d7.a.o(((u0) obj).f11710b, ((u0) obj2).f11710b);
            case 1:
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) obj;
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) obj2;
                float f10 = aVar.D.f14508o.F;
                float f11 = aVar2.D.f14508o.F;
                return f10 == f11 ? d7.a.o(aVar.r(), aVar2.r()) : Float.compare(f10, f11);
            case 2:
                q8.f fVar = (q8.f) obj;
                q8.f fVar2 = (q8.f) obj2;
                return (((Number) fVar.f13226b).intValue() - ((Number) fVar.f13225a).intValue()) - (((Number) fVar2.f13226b).intValue() - ((Number) fVar2.f13225a).intValue());
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    byte b11 = bArr2[i10];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 4:
                return Document.lambda$static$0((Document) obj, (Document) obj2);
            case 5:
                return ((DocumentKey) obj).compareTo((DocumentKey) obj2);
            case 6:
                return FieldIndex.lambda$static$0((FieldIndex) obj, (FieldIndex) obj2);
            case 7:
                return FieldIndex.IndexOffset.lambda$static$0((MutableDocument) obj, (MutableDocument) obj2);
            case 8:
                return TargetIndexMatcher.lambda$new$0((FieldFilter) obj, (FieldFilter) obj2);
            case 9:
                return AsyncQueue.lambda$runDelayedTasksUntil$5((AsyncQueue.DelayedTask) obj, (AsyncQueue.DelayedTask) obj2);
            case 10:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
