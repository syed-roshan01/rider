package com.google.firebase.firestore;

import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class QueryDocumentSnapshot extends DocumentSnapshot {
    private QueryDocumentSnapshot(FirebaseFirestore firebaseFirestore, DocumentKey documentKey, Document document, boolean z10, boolean z11) {
        super(firebaseFirestore, documentKey, document, z10, z11);
    }

    public static QueryDocumentSnapshot fromDocument(FirebaseFirestore firebaseFirestore, Document document, boolean z10, boolean z11) {
        return new QueryDocumentSnapshot(firebaseFirestore, document.getKey(), document, z10, z11);
    }

    @Override // com.google.firebase.firestore.DocumentSnapshot
    public Map<String, Object> getData() {
        Map<String, Object> data = super.getData();
        Assert.hardAssert(data != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return data;
    }

    @Override // com.google.firebase.firestore.DocumentSnapshot
    public <T> T toObject(Class<T> cls) {
        T t10 = (T) super.toObject(cls);
        Assert.hardAssert(t10 != null, "Object in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return t10;
    }

    @Override // com.google.firebase.firestore.DocumentSnapshot
    public Map<String, Object> getData(DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        Preconditions.checkNotNull(serverTimestampBehavior, "Provided serverTimestampBehavior value must not be null.");
        Map<String, Object> data = super.getData(serverTimestampBehavior);
        Assert.hardAssert(data != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return data;
    }

    @Override // com.google.firebase.firestore.DocumentSnapshot
    public <T> T toObject(Class<T> cls, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        Preconditions.checkNotNull(serverTimestampBehavior, "Provided serverTimestampBehavior value must not be null.");
        T t10 = (T) super.toObject(cls, serverTimestampBehavior);
        Assert.hardAssert(t10 != null, "Object in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return t10;
    }
}
