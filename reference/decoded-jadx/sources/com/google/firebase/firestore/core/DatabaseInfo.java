package com.google.firebase.firestore.core;

import com.google.firebase.firestore.model.DatabaseId;

/* JADX INFO: loaded from: classes.dex */
public final class DatabaseInfo {
    private final DatabaseId databaseId;
    private final String host;
    private final String persistenceKey;
    private final boolean sslEnabled;

    public DatabaseInfo(DatabaseId databaseId, String str, String str2, boolean z10) {
        this.databaseId = databaseId;
        this.persistenceKey = str;
        this.host = str2;
        this.sslEnabled = z10;
    }

    public DatabaseId getDatabaseId() {
        return this.databaseId;
    }

    public String getHost() {
        return this.host;
    }

    public String getPersistenceKey() {
        return this.persistenceKey;
    }

    public boolean isSslEnabled() {
        return this.sslEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DatabaseInfo(databaseId:");
        sb.append(this.databaseId);
        sb.append(" host:");
        return a7.a.p(sb, this.host, ")");
    }
}
