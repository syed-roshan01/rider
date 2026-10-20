package j5;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import l5.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f8373c = f6.a.d0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f8374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f8375e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8377b;

    static {
        String strD0 = f6.a.d0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strD1 = f6.a.d0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f8374d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new i5.c("proto"), new i5.c("json"))));
        f8375e = new a(strD0, strD1);
    }

    public a(String str, String str2) {
        this.f8376a = str;
        this.f8377b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
