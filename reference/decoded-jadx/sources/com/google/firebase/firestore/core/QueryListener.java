package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class QueryListener {
    private final EventListener<ViewSnapshot> listener;
    private final EventManager.ListenOptions options;
    private final Query query;
    private ViewSnapshot snapshot;
    private boolean raisedInitialEvent = false;
    private OnlineState onlineState = OnlineState.UNKNOWN;

    public QueryListener(Query query, EventManager.ListenOptions listenOptions, EventListener<ViewSnapshot> eventListener) {
        this.query = query;
        this.listener = eventListener;
        this.options = listenOptions;
    }

    private void raiseInitialEvent(ViewSnapshot viewSnapshot) {
        Assert.hardAssert(!this.raisedInitialEvent, "Trying to raise initial event for second time", new Object[0]);
        ViewSnapshot viewSnapshotFromInitialDocuments = ViewSnapshot.fromInitialDocuments(viewSnapshot.getQuery(), viewSnapshot.getDocuments(), viewSnapshot.getMutatedKeys(), viewSnapshot.isFromCache(), viewSnapshot.excludesMetadataChanges(), viewSnapshot.hasCachedResults());
        this.raisedInitialEvent = true;
        this.listener.onEvent(viewSnapshotFromInitialDocuments, null);
    }

    private boolean shouldRaiseEvent(ViewSnapshot viewSnapshot) {
        if (!viewSnapshot.getChanges().isEmpty()) {
            return true;
        }
        ViewSnapshot viewSnapshot2 = this.snapshot;
        boolean z10 = (viewSnapshot2 == null || viewSnapshot2.hasPendingWrites() == viewSnapshot.hasPendingWrites()) ? false : true;
        if (viewSnapshot.didSyncStateChange() || z10) {
            return this.options.includeQueryMetadataChanges;
        }
        return false;
    }

    private boolean shouldRaiseInitialEvent(ViewSnapshot viewSnapshot, OnlineState onlineState) {
        Assert.hardAssert(!this.raisedInitialEvent, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!viewSnapshot.isFromCache()) {
            return true;
        }
        OnlineState onlineState2 = OnlineState.OFFLINE;
        boolean z10 = !onlineState.equals(onlineState2);
        if (!this.options.waitForSyncWhenOnline || !z10) {
            return !viewSnapshot.getDocuments().isEmpty() || viewSnapshot.hasCachedResults() || onlineState.equals(onlineState2);
        }
        Assert.hardAssert(viewSnapshot.isFromCache(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
        return false;
    }

    public Query getQuery() {
        return this.query;
    }

    public void onError(FirebaseFirestoreException firebaseFirestoreException) {
        this.listener.onEvent(null, firebaseFirestoreException);
    }

    public boolean onOnlineStateChanged(OnlineState onlineState) {
        this.onlineState = onlineState;
        ViewSnapshot viewSnapshot = this.snapshot;
        if (viewSnapshot == null || this.raisedInitialEvent || !shouldRaiseInitialEvent(viewSnapshot, onlineState)) {
            return false;
        }
        raiseInitialEvent(this.snapshot);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    public boolean onViewSnapshot(ViewSnapshot viewSnapshot) {
        boolean z10 = true;
        Assert.hardAssert(!viewSnapshot.getChanges().isEmpty() || viewSnapshot.didSyncStateChange(), "We got a new snapshot with no changes?", new Object[0]);
        if (!this.options.includeDocumentMetadataChanges) {
            ArrayList arrayList = new ArrayList();
            for (DocumentViewChange documentViewChange : viewSnapshot.getChanges()) {
                if (documentViewChange.getType() != DocumentViewChange.Type.METADATA) {
                    arrayList.add(documentViewChange);
                }
            }
            viewSnapshot = new ViewSnapshot(viewSnapshot.getQuery(), viewSnapshot.getDocuments(), viewSnapshot.getOldDocuments(), arrayList, viewSnapshot.isFromCache(), viewSnapshot.getMutatedKeys(), viewSnapshot.didSyncStateChange(), true, viewSnapshot.hasCachedResults());
        }
        if (this.raisedInitialEvent) {
            if (shouldRaiseEvent(viewSnapshot)) {
                this.listener.onEvent(viewSnapshot, null);
            } else {
                z10 = false;
            }
        } else if (shouldRaiseInitialEvent(viewSnapshot, this.onlineState)) {
            raiseInitialEvent(viewSnapshot);
        } else {
            z10 = false;
        }
        this.snapshot = viewSnapshot;
        return z10;
    }
}
