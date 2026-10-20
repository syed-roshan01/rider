package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel parcel) {
            return new Timestamp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int i10) {
            return new Timestamp[i10];
        }
    };
    private final int nanoseconds;
    private final long seconds;

    public Timestamp(long j10, int i10) {
        validateRange(j10, i10);
        this.seconds = j10;
        this.nanoseconds = i10;
    }

    public static Timestamp now() {
        return new Timestamp(new Date());
    }

    private static void validateRange(long j10, int i10) {
        Preconditions.checkArgument(i10 >= 0, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i10));
        Preconditions.checkArgument(((double) i10) < 1.0E9d, "Timestamp nanoseconds out of range: %s", Integer.valueOf(i10));
        Preconditions.checkArgument(j10 >= -62135596800L, "Timestamp seconds out of range: %s", Long.valueOf(j10));
        Preconditions.checkArgument(j10 < 253402300800L, "Timestamp seconds out of range: %s", Long.valueOf(j10));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
    }

    public int getNanoseconds() {
        return this.nanoseconds;
    }

    public long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j10 = this.seconds;
        return (((((int) j10) * 1369) + ((int) (j10 >> 32))) * 37) + this.nanoseconds;
    }

    public Date toDate() {
        return new Date((this.seconds * 1000) + ((long) (this.nanoseconds / 1000000)));
    }

    public String toString() {
        return "Timestamp(seconds=" + this.seconds + ", nanoseconds=" + this.nanoseconds + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.seconds);
        parcel.writeInt(this.nanoseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp timestamp) {
        long j10 = this.seconds;
        long j11 = timestamp.seconds;
        return j10 == j11 ? Integer.signum(this.nanoseconds - timestamp.nanoseconds) : Long.signum(j10 - j11);
    }

    public Timestamp(Parcel parcel) {
        this.seconds = parcel.readLong();
        this.nanoseconds = parcel.readInt();
    }

    public Timestamp(Date date) {
        long time = date.getTime();
        long j10 = time / 1000;
        int i10 = ((int) (time % 1000)) * 1000000;
        if (i10 < 0) {
            j10--;
            i10 += 1000000000;
        }
        validateRange(j10, i10);
        this.seconds = j10;
        this.nanoseconds = i10;
    }
}
