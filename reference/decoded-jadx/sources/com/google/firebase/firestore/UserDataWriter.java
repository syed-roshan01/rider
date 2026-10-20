package com.google.firebase.firestore;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.DatabaseId;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ServerTimestamps;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.q2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o7.h2;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public class UserDataWriter {
    private final FirebaseFirestore firestore;
    private final DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior;

    /* JADX INFO: renamed from: com.google.firebase.firestore.UserDataWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$DocumentSnapshot$ServerTimestampBehavior;

        static {
            int[] iArr = new int[DocumentSnapshot.ServerTimestampBehavior.values().length];
            $SwitchMap$com$google$firebase$firestore$DocumentSnapshot$ServerTimestampBehavior = iArr;
            try {
                iArr[DocumentSnapshot.ServerTimestampBehavior.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$DocumentSnapshot$ServerTimestampBehavior[DocumentSnapshot.ServerTimestampBehavior.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public UserDataWriter(FirebaseFirestore firebaseFirestore, DocumentSnapshot.ServerTimestampBehavior serverTimestampBehavior) {
        this.firestore = firebaseFirestore;
        this.serverTimestampBehavior = serverTimestampBehavior;
    }

    private List<Object> convertArray(o7.e eVar) {
        ArrayList arrayList = new ArrayList(eVar.k());
        Iterator it = eVar.a().iterator();
        while (it.hasNext()) {
            arrayList.add(convertValue((i2) it.next()));
        }
        return arrayList;
    }

    private Object convertReference(i2 i2Var) {
        DatabaseId databaseIdFromName = DatabaseId.fromName(i2Var.y());
        DocumentKey documentKeyFromName = DocumentKey.fromName(i2Var.y());
        DatabaseId databaseId = this.firestore.getDatabaseId();
        if (!databaseIdFromName.equals(databaseId)) {
            Logger.warn("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", documentKeyFromName.getPath(), databaseIdFromName.getProjectId(), databaseIdFromName.getDatabaseId(), databaseId.getProjectId(), databaseId.getDatabaseId());
        }
        return new DocumentReference(documentKeyFromName, this.firestore);
    }

    private Object convertServerTimestamp(i2 i2Var) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$firebase$firestore$DocumentSnapshot$ServerTimestampBehavior[this.serverTimestampBehavior.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return convertTimestamp(ServerTimestamps.getLocalWriteTime(i2Var));
        }
        i2 previousValue = ServerTimestamps.getPreviousValue(i2Var);
        if (previousValue == null) {
            return null;
        }
        return convertValue(previousValue);
    }

    private Object convertTimestamp(q2 q2Var) {
        return new Timestamp(q2Var.j(), q2Var.i());
    }

    public Map<String, Object> convertObject(Map<String, i2> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, i2> entry : map.entrySet()) {
            map2.put(entry.getKey(), convertValue(entry.getValue()));
        }
        return map2;
    }

    public Object convertValue(i2 i2Var) {
        switch (Values.typeOrder(i2Var)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(i2Var.r());
            case 2:
                return i2Var.B().equals(h2.f12624c) ? Long.valueOf(i2Var.w()) : Double.valueOf(i2Var.u());
            case 3:
                return convertTimestamp(i2Var.A());
            case 4:
                return convertServerTimestamp(i2Var);
            case 5:
                return i2Var.z();
            case 6:
                return Blob.fromByteString(i2Var.s());
            case 7:
                return convertReference(i2Var);
            case 8:
                return new GeoPoint(i2Var.v().i(), i2Var.v().j());
            case 9:
                return convertArray(i2Var.q());
            case 10:
                return convertObject(i2Var.x().i());
            default:
                throw Assert.fail("Unknown value type: " + i2Var.B(), new Object[0]);
        }
    }
}
