package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.n;
import e8.c2;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class WatchChange {

    public static final class DocumentChange extends WatchChange {
        private final DocumentKey documentKey;
        private final MutableDocument newDocument;
        private final List<Integer> removedTargetIds;
        private final List<Integer> updatedTargetIds;

        public DocumentChange(List<Integer> list, List<Integer> list2, DocumentKey documentKey, MutableDocument mutableDocument) {
            super();
            this.updatedTargetIds = list;
            this.removedTargetIds = list2;
            this.documentKey = documentKey;
            this.newDocument = mutableDocument;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || DocumentChange.class != obj.getClass()) {
                return false;
            }
            DocumentChange documentChange = (DocumentChange) obj;
            if (!this.updatedTargetIds.equals(documentChange.updatedTargetIds) || !this.removedTargetIds.equals(documentChange.removedTargetIds) || !this.documentKey.equals(documentChange.documentKey)) {
                return false;
            }
            MutableDocument mutableDocument = this.newDocument;
            MutableDocument mutableDocument2 = documentChange.newDocument;
            if (mutableDocument != null) {
                return mutableDocument.equals(mutableDocument2);
            }
            return mutableDocument2 == null;
        }

        public DocumentKey getDocumentKey() {
            return this.documentKey;
        }

        public MutableDocument getNewDocument() {
            return this.newDocument;
        }

        public List<Integer> getRemovedTargetIds() {
            return this.removedTargetIds;
        }

        public List<Integer> getUpdatedTargetIds() {
            return this.updatedTargetIds;
        }

        public int hashCode() {
            int iHashCode = (this.documentKey.hashCode() + ((this.removedTargetIds.hashCode() + (this.updatedTargetIds.hashCode() * 31)) * 31)) * 31;
            MutableDocument mutableDocument = this.newDocument;
            return iHashCode + (mutableDocument != null ? mutableDocument.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.updatedTargetIds + ", removedTargetIds=" + this.removedTargetIds + ", key=" + this.documentKey + ", newDocument=" + this.newDocument + '}';
        }
    }

    public static final class ExistenceFilterWatchChange extends WatchChange {
        private final ExistenceFilter existenceFilter;
        private final int targetId;

        public ExistenceFilterWatchChange(int i10, ExistenceFilter existenceFilter) {
            super();
            this.targetId = i10;
            this.existenceFilter = existenceFilter;
        }

        public ExistenceFilter getExistenceFilter() {
            return this.existenceFilter;
        }

        public int getTargetId() {
            return this.targetId;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.targetId + ", existenceFilter=" + this.existenceFilter + '}';
        }
    }

    public static final class WatchTargetChange extends WatchChange {
        private final c2 cause;
        private final WatchTargetChangeType changeType;
        private final n resumeToken;
        private final List<Integer> targetIds;

        public WatchTargetChange(WatchTargetChangeType watchTargetChangeType, List<Integer> list) {
            this(watchTargetChangeType, list, WatchStream.EMPTY_RESUME_TOKEN, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || WatchTargetChange.class != obj.getClass()) {
                return false;
            }
            WatchTargetChange watchTargetChange = (WatchTargetChange) obj;
            if (this.changeType != watchTargetChange.changeType || !this.targetIds.equals(watchTargetChange.targetIds) || !this.resumeToken.equals(watchTargetChange.resumeToken)) {
                return false;
            }
            c2 c2Var = this.cause;
            if (c2Var == null) {
                return watchTargetChange.cause == null;
            }
            c2 c2Var2 = watchTargetChange.cause;
            return c2Var2 != null && c2Var.f5227a.equals(c2Var2.f5227a);
        }

        public c2 getCause() {
            return this.cause;
        }

        public WatchTargetChangeType getChangeType() {
            return this.changeType;
        }

        public n getResumeToken() {
            return this.resumeToken;
        }

        public List<Integer> getTargetIds() {
            return this.targetIds;
        }

        public int hashCode() {
            int iHashCode = (this.resumeToken.hashCode() + ((this.targetIds.hashCode() + (this.changeType.hashCode() * 31)) * 31)) * 31;
            c2 c2Var = this.cause;
            return iHashCode + (c2Var != null ? c2Var.f5227a.hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.changeType + ", targetIds=" + this.targetIds + '}';
        }

        public WatchTargetChange(WatchTargetChangeType watchTargetChangeType, List<Integer> list, n nVar) {
            this(watchTargetChangeType, list, nVar, null);
        }

        public WatchTargetChange(WatchTargetChangeType watchTargetChangeType, List<Integer> list, n nVar, c2 c2Var) {
            super();
            Assert.hardAssert(c2Var == null || watchTargetChangeType == WatchTargetChangeType.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.changeType = watchTargetChangeType;
            this.targetIds = list;
            this.resumeToken = nVar;
            if (c2Var == null || c2Var.e()) {
                this.cause = null;
            } else {
                this.cause = c2Var;
            }
        }
    }

    public enum WatchTargetChangeType {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    private WatchChange() {
    }
}
