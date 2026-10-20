package com.google.firebase.firestore.index;

import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.Values;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.q2;
import java.util.Iterator;
import java.util.Map;
import o7.e;
import o7.h2;
import o7.i2;
import o7.k0;
import x7.b;

/* JADX INFO: loaded from: classes.dex */
public class FirestoreIndexValueWriter {
    public static final int DOCUMENT_NAME_OFFSET = 5;
    public static final int INDEX_TYPE_ARRAY = 50;
    public static final int INDEX_TYPE_BLOB = 30;
    public static final int INDEX_TYPE_BOOLEAN = 10;
    public static final int INDEX_TYPE_GEOPOINT = 45;
    public static final int INDEX_TYPE_MAP = 55;
    public static final int INDEX_TYPE_NAN = 13;
    public static final int INDEX_TYPE_NULL = 5;
    public static final int INDEX_TYPE_NUMBER = 15;
    public static final int INDEX_TYPE_REFERENCE = 37;
    public static final int INDEX_TYPE_REFERENCE_SEGMENT = 60;
    public static final int INDEX_TYPE_STRING = 25;
    public static final int INDEX_TYPE_TIMESTAMP = 20;
    public static final FirestoreIndexValueWriter INSTANCE = new FirestoreIndexValueWriter();
    public static final int NOT_TRUNCATED = 2;

    /* JADX INFO: renamed from: com.google.firebase.firestore.index.FirestoreIndexValueWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase;

        static {
            int[] iArr = new int[h2.values().length];
            $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[10] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$firestore$v1$Value$ValueTypeCase[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private FirestoreIndexValueWriter() {
    }

    private void writeIndexArray(e eVar, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        writeValueTypeLabel(directionalIndexByteEncoder, 50);
        Iterator it = eVar.a().iterator();
        while (it.hasNext()) {
            writeIndexValueAux((i2) it.next(), directionalIndexByteEncoder);
        }
    }

    private void writeIndexEntityRef(String str, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        writeValueTypeLabel(directionalIndexByteEncoder, 37);
        ResourcePath resourcePathFromString = ResourcePath.fromString(str);
        int length = resourcePathFromString.length();
        for (int i10 = 5; i10 < length; i10++) {
            String segment = resourcePathFromString.getSegment(i10);
            writeValueTypeLabel(directionalIndexByteEncoder, 60);
            writeUnlabeledIndexString(segment, directionalIndexByteEncoder);
        }
    }

    private void writeIndexMap(k0 k0Var, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        writeValueTypeLabel(directionalIndexByteEncoder, 55);
        for (Map.Entry entry : k0Var.i().entrySet()) {
            String str = (String) entry.getKey();
            i2 i2Var = (i2) entry.getValue();
            writeIndexString(str, directionalIndexByteEncoder);
            writeIndexValueAux(i2Var, directionalIndexByteEncoder);
        }
    }

    private void writeIndexString(String str, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        writeValueTypeLabel(directionalIndexByteEncoder, 25);
        writeUnlabeledIndexString(str, directionalIndexByteEncoder);
    }

    private void writeIndexValueAux(i2 i2Var, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        switch (i2Var.B().ordinal()) {
            case 0:
                writeValueTypeLabel(directionalIndexByteEncoder, 5);
                return;
            case 1:
                writeValueTypeLabel(directionalIndexByteEncoder, 10);
                directionalIndexByteEncoder.writeLong(i2Var.r() ? 1L : 0L);
                return;
            case 2:
                writeValueTypeLabel(directionalIndexByteEncoder, 15);
                directionalIndexByteEncoder.writeDouble(i2Var.w());
                return;
            case 3:
                double dU = i2Var.u();
                if (Double.isNaN(dU)) {
                    writeValueTypeLabel(directionalIndexByteEncoder, 13);
                    return;
                }
                writeValueTypeLabel(directionalIndexByteEncoder, 15);
                if (dU == -0.0d) {
                    directionalIndexByteEncoder.writeDouble(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    return;
                } else {
                    directionalIndexByteEncoder.writeDouble(dU);
                    return;
                }
            case 4:
                q2 q2VarA = i2Var.A();
                writeValueTypeLabel(directionalIndexByteEncoder, 20);
                directionalIndexByteEncoder.writeLong(q2VarA.j());
                directionalIndexByteEncoder.writeLong(q2VarA.i());
                return;
            case 5:
                writeIndexString(i2Var.z(), directionalIndexByteEncoder);
                writeTruncationMarker(directionalIndexByteEncoder);
                return;
            case 6:
                writeValueTypeLabel(directionalIndexByteEncoder, 30);
                directionalIndexByteEncoder.writeBytes(i2Var.s());
                writeTruncationMarker(directionalIndexByteEncoder);
                return;
            case 7:
                writeIndexEntityRef(i2Var.y(), directionalIndexByteEncoder);
                return;
            case 8:
                b bVarV = i2Var.v();
                writeValueTypeLabel(directionalIndexByteEncoder, 45);
                directionalIndexByteEncoder.writeDouble(bVarV.i());
                directionalIndexByteEncoder.writeDouble(bVarV.j());
                return;
            case 9:
                writeIndexArray(i2Var.q(), directionalIndexByteEncoder);
                writeTruncationMarker(directionalIndexByteEncoder);
                return;
            case 10:
                if (Values.isMaxValue(i2Var)) {
                    writeValueTypeLabel(directionalIndexByteEncoder, Integer.MAX_VALUE);
                    return;
                } else {
                    writeIndexMap(i2Var.x(), directionalIndexByteEncoder);
                    writeTruncationMarker(directionalIndexByteEncoder);
                    return;
                }
            default:
                throw new IllegalArgumentException("unknown index value type " + i2Var.B());
        }
    }

    private void writeTruncationMarker(DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        directionalIndexByteEncoder.writeLong(2L);
    }

    private void writeUnlabeledIndexString(String str, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        directionalIndexByteEncoder.writeString(str);
    }

    private void writeValueTypeLabel(DirectionalIndexByteEncoder directionalIndexByteEncoder, int i10) {
        directionalIndexByteEncoder.writeLong(i10);
    }

    public void writeIndexValue(i2 i2Var, DirectionalIndexByteEncoder directionalIndexByteEncoder) {
        writeIndexValueAux(i2Var, directionalIndexByteEncoder);
        directionalIndexByteEncoder.writeInfinity();
    }
}
