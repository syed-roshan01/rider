package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.Overlay;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public interface DocumentOverlayCache {
    Overlay getOverlay(DocumentKey documentKey);

    Map<DocumentKey, Overlay> getOverlays(ResourcePath resourcePath, int i10);

    Map<DocumentKey, Overlay> getOverlays(String str, int i10, int i11);

    Map<DocumentKey, Overlay> getOverlays(SortedSet<DocumentKey> sortedSet);

    void removeOverlaysForBatchId(int i10);

    void saveOverlays(int i10, Map<DocumentKey, Mutation> map);
}
