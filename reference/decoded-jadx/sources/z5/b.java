package z5;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.firestore.index.FirestoreIndexValueWriter;
import com.google.firebase.remoteconfig.internal.Code;
import java.util.Arrays;
import o7.i2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f17242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f17239e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new n(0);

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f17240a = i10;
        this.f17241b = i11;
        this.f17242c = pendingIntent;
        this.f17243d = str;
    }

    public static String e(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case Code.UNAVAILABLE /* 14 */:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case Code.UNAUTHENTICATED /* 16 */:
                        return "API_UNAVAILABLE";
                    case i2.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        return "SIGN_IN_FAILED";
                    case i2.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case FirestoreIndexValueWriter.INDEX_TYPE_TIMESTAMP /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return l.q.h("UNKNOWN_ERROR_CODE(", i10, ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f17241b == bVar.f17241b && y3.e.g0(this.f17242c, bVar.f17242c) && y3.e.g0(this.f17243d, bVar.f17243d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17241b), this.f17242c, this.f17243d});
    }

    public final String toString() {
        l.t tVar = new l.t(this);
        tVar.b(e(this.f17241b), "statusCode");
        tVar.b(this.f17242c, "resolution");
        tVar.b(this.f17243d, "message");
        return tVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = y3.e.Y0(20293, parcel);
        y3.e.f1(parcel, 1, 4);
        parcel.writeInt(this.f17240a);
        y3.e.f1(parcel, 2, 4);
        parcel.writeInt(this.f17241b);
        y3.e.R0(parcel, 3, this.f17242c, i10);
        y3.e.T0(parcel, 4, this.f17243d);
        y3.e.d1(iY0, parcel);
    }

    public b(int i10) {
        this(1, i10, null, null);
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
