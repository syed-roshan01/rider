package k5;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f9820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f9825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f9826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f9827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f9829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f9830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f9831l;

    public i(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f9820a = num;
        this.f9821b = str;
        this.f9822c = str2;
        this.f9823d = str3;
        this.f9824e = str4;
        this.f9825f = str5;
        this.f9826g = str6;
        this.f9827h = str7;
        this.f9828i = str8;
        this.f9829j = str9;
        this.f9830k = str10;
        this.f9831l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        Integer num = this.f9820a;
        if (num != null ? num.equals(((i) aVar).f9820a) : ((i) aVar).f9820a == null) {
            String str = this.f9821b;
            if (str != null ? str.equals(((i) aVar).f9821b) : ((i) aVar).f9821b == null) {
                String str2 = this.f9822c;
                if (str2 != null ? str2.equals(((i) aVar).f9822c) : ((i) aVar).f9822c == null) {
                    String str3 = this.f9823d;
                    if (str3 != null ? str3.equals(((i) aVar).f9823d) : ((i) aVar).f9823d == null) {
                        String str4 = this.f9824e;
                        if (str4 != null ? str4.equals(((i) aVar).f9824e) : ((i) aVar).f9824e == null) {
                            String str5 = this.f9825f;
                            if (str5 != null ? str5.equals(((i) aVar).f9825f) : ((i) aVar).f9825f == null) {
                                String str6 = this.f9826g;
                                if (str6 != null ? str6.equals(((i) aVar).f9826g) : ((i) aVar).f9826g == null) {
                                    String str7 = this.f9827h;
                                    if (str7 != null ? str7.equals(((i) aVar).f9827h) : ((i) aVar).f9827h == null) {
                                        String str8 = this.f9828i;
                                        if (str8 != null ? str8.equals(((i) aVar).f9828i) : ((i) aVar).f9828i == null) {
                                            String str9 = this.f9829j;
                                            if (str9 != null ? str9.equals(((i) aVar).f9829j) : ((i) aVar).f9829j == null) {
                                                String str10 = this.f9830k;
                                                if (str10 != null ? str10.equals(((i) aVar).f9830k) : ((i) aVar).f9830k == null) {
                                                    String str11 = this.f9831l;
                                                    if (str11 == null) {
                                                        if (((i) aVar).f9831l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((i) aVar).f9831l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f9820a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f9821b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f9822c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9823d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f9824e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f9825f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f9826g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f9827h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f9828i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f9829j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f9830k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f9831l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f9820a);
        sb.append(", model=");
        sb.append(this.f9821b);
        sb.append(", hardware=");
        sb.append(this.f9822c);
        sb.append(", device=");
        sb.append(this.f9823d);
        sb.append(", product=");
        sb.append(this.f9824e);
        sb.append(", osBuild=");
        sb.append(this.f9825f);
        sb.append(", manufacturer=");
        sb.append(this.f9826g);
        sb.append(", fingerprint=");
        sb.append(this.f9827h);
        sb.append(", locale=");
        sb.append(this.f9828i);
        sb.append(", country=");
        sb.append(this.f9829j);
        sb.append(", mccMnc=");
        sb.append(this.f9830k);
        sb.append(", applicationBuild=");
        return a7.a.p(sb, this.f9831l, "}");
    }
}
