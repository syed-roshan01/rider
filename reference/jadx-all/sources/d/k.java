package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f4314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f4315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4317d;

    public k(IntentSender intentSender, Intent intent, int i10, int i11) {
        d7.a.m(intentSender, "intentSender");
        this.f4314a = intentSender;
        this.f4315b = intent;
        this.f4316c = i10;
        this.f4317d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        d7.a.m(parcel, "dest");
        parcel.writeParcelable(this.f4314a, i10);
        parcel.writeParcelable(this.f4315b, i10);
        parcel.writeInt(this.f4316c);
        parcel.writeInt(this.f4317d);
    }
}
