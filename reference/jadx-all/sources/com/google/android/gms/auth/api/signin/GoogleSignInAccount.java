package com.google.android.gms.auth.api.signin;

import a6.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import y3.e;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d.a(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Uri f3137f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f3138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f3139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f3140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f3141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f3142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f3143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashSet f3144t = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.f3132a = i10;
        this.f3133b = str;
        this.f3134c = str2;
        this.f3135d = str3;
        this.f3136e = str4;
        this.f3137f = uri;
        this.f3138n = str5;
        this.f3139o = j10;
        this.f3140p = str6;
        this.f3141q = arrayList;
        this.f3142r = str7;
        this.f3143s = str8;
    }

    public static GoogleSignInAccount e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long lValueOf = Long.valueOf(j10);
        String string = jSONObject.getString("obfuscatedIdentifier");
        long jLongValue = lValueOf.longValue();
        f6.a.u(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, jLongValue, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f3138n = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f3140p.equals(this.f3140p)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f3141q);
            hashSet.addAll(googleSignInAccount.f3144t);
            HashSet hashSet2 = new HashSet(this.f3141q);
            hashSet2.addAll(this.f3144t);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = a7.a.i(this.f3140p, 527, 31);
        HashSet hashSet = new HashSet(this.f3141q);
        hashSet.addAll(this.f3144t);
        return hashSet.hashCode() + i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iY0 = e.Y0(20293, parcel);
        e.f1(parcel, 1, 4);
        parcel.writeInt(this.f3132a);
        e.T0(parcel, 2, this.f3133b);
        e.T0(parcel, 3, this.f3134c);
        e.T0(parcel, 4, this.f3135d);
        e.T0(parcel, 5, this.f3136e);
        e.R0(parcel, 6, this.f3137f, i10);
        e.T0(parcel, 7, this.f3138n);
        e.f1(parcel, 8, 8);
        parcel.writeLong(this.f3139o);
        e.T0(parcel, 9, this.f3140p);
        e.W0(parcel, 10, this.f3141q);
        e.T0(parcel, 11, this.f3142r);
        e.T0(parcel, 12, this.f3143s);
        e.d1(iY0, parcel);
    }
}
