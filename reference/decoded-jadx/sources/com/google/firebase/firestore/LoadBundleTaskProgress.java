package com.google.firebase.firestore;

import com.google.firebase.firestore.bundle.BundleMetadata;

/* JADX INFO: loaded from: classes.dex */
public final class LoadBundleTaskProgress {
    static final LoadBundleTaskProgress INITIAL = new LoadBundleTaskProgress(0, 0, 0, 0, null, TaskState.SUCCESS);
    private final long bytesLoaded;
    private final int documentsLoaded;
    private final Exception exception;
    private final TaskState taskState;
    private final long totalBytes;
    private final int totalDocuments;

    public enum TaskState {
        ERROR,
        RUNNING,
        SUCCESS
    }

    public LoadBundleTaskProgress(int i10, int i11, long j10, long j11, Exception exc, TaskState taskState) {
        this.documentsLoaded = i10;
        this.totalDocuments = i11;
        this.bytesLoaded = j10;
        this.totalBytes = j11;
        this.taskState = taskState;
        this.exception = exc;
    }

    public static LoadBundleTaskProgress forInitial(BundleMetadata bundleMetadata) {
        return new LoadBundleTaskProgress(0, bundleMetadata.getTotalDocuments(), 0L, bundleMetadata.getTotalBytes(), null, TaskState.RUNNING);
    }

    public static LoadBundleTaskProgress forSuccess(BundleMetadata bundleMetadata) {
        return new LoadBundleTaskProgress(bundleMetadata.getTotalDocuments(), bundleMetadata.getTotalDocuments(), bundleMetadata.getTotalBytes(), bundleMetadata.getTotalBytes(), null, TaskState.SUCCESS);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LoadBundleTaskProgress.class != obj.getClass()) {
            return false;
        }
        LoadBundleTaskProgress loadBundleTaskProgress = (LoadBundleTaskProgress) obj;
        if (this.documentsLoaded != loadBundleTaskProgress.documentsLoaded || this.totalDocuments != loadBundleTaskProgress.totalDocuments || this.bytesLoaded != loadBundleTaskProgress.bytesLoaded || this.totalBytes != loadBundleTaskProgress.totalBytes || this.taskState != loadBundleTaskProgress.taskState) {
            return false;
        }
        Exception exc = this.exception;
        Exception exc2 = loadBundleTaskProgress.exception;
        if (exc != null) {
            return exc.equals(exc2);
        }
        return exc2 == null;
    }

    public long getBytesLoaded() {
        return this.bytesLoaded;
    }

    public int getDocumentsLoaded() {
        return this.documentsLoaded;
    }

    public Exception getException() {
        return this.exception;
    }

    public TaskState getTaskState() {
        return this.taskState;
    }

    public long getTotalBytes() {
        return this.totalBytes;
    }

    public int getTotalDocuments() {
        return this.totalDocuments;
    }

    public int hashCode() {
        int i10 = ((this.documentsLoaded * 31) + this.totalDocuments) * 31;
        long j10 = this.bytesLoaded;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.totalBytes;
        int iHashCode = (this.taskState.hashCode() + ((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        Exception exc = this.exception;
        return iHashCode + (exc != null ? exc.hashCode() : 0);
    }
}
