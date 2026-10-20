package com.google.android.gms.internal.measurement;

import a7.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.internal.Code;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzas implements zzaq, Iterable<zzaq> {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public final String toString() {
        return q.k("\"", this.zza, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x015e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0161  */
    /* JADX WARN: Code duplicated, block: B:104:0x016a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0173  */
    /* JADX WARN: Code duplicated, block: B:108:0x0182  */
    /* JADX WARN: Code duplicated, block: B:109:0x0185  */
    /* JADX WARN: Code duplicated, block: B:112:0x0194  */
    /* JADX WARN: Code duplicated, block: B:115:0x019b  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:127:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:129:0x0213  */
    /* JADX WARN: Code duplicated, block: B:131:0x0229  */
    /* JADX WARN: Code duplicated, block: B:134:0x023b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:135:0x023c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0240  */
    /* JADX WARN: Code duplicated, block: B:140:0x0281  */
    /* JADX WARN: Code duplicated, block: B:142:0x0293  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:148:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:151:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:153:0x030e  */
    /* JADX WARN: Code duplicated, block: B:155:0x031a  */
    /* JADX WARN: Code duplicated, block: B:157:0x0326  */
    /* JADX WARN: Code duplicated, block: B:158:0x032b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0340  */
    /* JADX WARN: Code duplicated, block: B:161:0x0357  */
    /* JADX WARN: Code duplicated, block: B:164:0x0360  */
    /* JADX WARN: Code duplicated, block: B:166:0x0366  */
    /* JADX WARN: Code duplicated, block: B:173:0x038f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0396  */
    /* JADX WARN: Code duplicated, block: B:178:0x039a A[LOOP:0: B:177:0x0398->B:178:0x039a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:183:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:184:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:187:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:192:0x040b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0418  */
    /* JADX WARN: Code duplicated, block: B:196:0x0423  */
    /* JADX WARN: Code duplicated, block: B:199:0x043e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0452  */
    /* JADX WARN: Code duplicated, block: B:202:0x0455  */
    /* JADX WARN: Code duplicated, block: B:205:0x0472  */
    /* JADX WARN: Code duplicated, block: B:207:0x0487  */
    /* JADX WARN: Code duplicated, block: B:209:0x048a  */
    /* JADX WARN: Code duplicated, block: B:211:0x049e  */
    /* JADX WARN: Code duplicated, block: B:213:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:215:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:216:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:219:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:220:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:223:0x0500  */
    /* JADX WARN: Code duplicated, block: B:224:0x0503  */
    /* JADX WARN: Code duplicated, block: B:227:0x0517  */
    /* JADX WARN: Code duplicated, block: B:229:0x052b  */
    /* JADX WARN: Code duplicated, block: B:231:0x053c  */
    /* JADX WARN: Code duplicated, block: B:232:0x054b  */
    /* JADX WARN: Code duplicated, block: B:235:0x0561  */
    /* JADX WARN: Code duplicated, block: B:237:0x0570  */
    /* JADX WARN: Code duplicated, block: B:239:0x057c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0592  */
    /* JADX WARN: Code duplicated, block: B:243:0x059e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:244:0x059f  */
    /* JADX WARN: Code duplicated, block: B:247:0x05ad A[LOOP:1: B:245:0x05a7->B:247:0x05ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:252:0x05db  */
    /* JADX WARN: Code duplicated, block: B:253:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:263:0x0611  */
    /* JADX WARN: Code duplicated, block: B:265:0x0625  */
    /* JADX WARN: Code duplicated, block: B:267:0x062e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0651  */
    /* JADX WARN: Code duplicated, block: B:271:0x0654  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[PHI: r19
  0x00c3: PHI (r19v21 byte) = 
  (r19v0 byte)
  (r19v0 byte)
  (r19v6 byte)
  (r19v0 byte)
  (r19v7 byte)
  (r19v0 byte)
  (r19v8 byte)
  (r19v0 byte)
  (r19v9 byte)
  (r19v0 byte)
  (r19v10 byte)
  (r19v0 byte)
  (r19v11 byte)
  (r19v0 byte)
  (r19v12 byte)
  (r19v0 byte)
  (r19v13 byte)
  (r19v0 byte)
  (r19v14 byte)
  (r19v0 byte)
  (r19v15 byte)
  (r19v0 byte)
  (r19v16 byte)
  (r19v0 byte)
  (r19v17 byte)
  (r19v0 byte)
  (r19v18 byte)
 binds: [B:42:0x00c0, B:94:0x014a, B:96:0x014e, B:90:0x013f, B:92:0x0142, B:86:0x0135, B:88:0x0138, B:82:0x012b, B:84:0x012e, B:78:0x0121, B:80:0x0124, B:74:0x0117, B:76:0x011a, B:70:0x010d, B:72:0x0110, B:66:0x0103, B:68:0x0106, B:62:0x00f9, B:64:0x00fc, B:58:0x00ef, B:60:0x00f2, B:54:0x00e5, B:56:0x00e8, B:50:0x00db, B:52:0x00de, B:46:0x00d1, B:48:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x0109  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Code duplicated, block: B:76:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x011d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x0127  */
    /* JADX WARN: Code duplicated, block: B:84:0x012e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0131  */
    /* JADX WARN: Code duplicated, block: B:88:0x0138  */
    /* JADX WARN: Code duplicated, block: B:89:0x013b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0142  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    /* JADX WARN: Code duplicated, block: B:96:0x014e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0152  */
    /* JADX WARN: Code duplicated, block: B:99:0x015a A[PHI: r6 r19
  0x015a: PHI (r6v7 java.lang.String) = (r6v6 java.lang.String), (r6v8 java.lang.String), (r6v8 java.lang.String) binds: [B:102:0x0167, B:98:0x0158, B:100:0x015e] A[DONT_GENERATE, DONT_INLINE]
  0x015a: PHI (r19v4 byte) = (r19v0 byte), (r19v0 byte), (r19v5 byte) binds: [B:102:0x0167, B:98:0x0158, B:100:0x015e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        String str2;
        String str3;
        byte b10;
        String str4;
        String str5;
        String str6;
        double dDoubleValue;
        String str7;
        zzaq zzaqVarZza;
        int i10;
        int iZza;
        StringBuilder sb;
        int i11;
        String strZzf;
        String strZzf2;
        double dDoubleValue2;
        double dZza;
        String strZzf3;
        String str8;
        double dDoubleValue3;
        double dZza2;
        double dMin;
        double length;
        double dZza3;
        double dMin2;
        String str9;
        ArrayList arrayList;
        String strZzf4;
        long jZzc;
        String[] strArrSplit;
        int length2;
        int i12;
        boolean zIsEmpty;
        String str10;
        int iZza2;
        int length3;
        zzaq zzaqVarZza2;
        String strZzf5;
        String str11;
        int iIndexOf;
        zzh zzhVar2;
        String strZzf6;
        String str12 = "match";
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !FirebaseAnalytics.Event.SEARCH.equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "trim";
                if (!str3.equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            str.getClass();
            b10 = -1;
            switch (str.hashCode()) {
                case -1789698943:
                    str4 = "charAt";
                    str5 = r6;
                    str6 = "toString";
                    str12 = "match";
                    if (str.equals(str5)) {
                        b10 = 0;
                    }
                    break;
                case -1776922004:
                    str4 = "charAt";
                    str6 = "toString";
                    str12 = "match";
                    str5 = r6;
                    if (str.equals(str6)) {
                        b10 = 1;
                    }
                    break;
                case -1464939364:
                    str4 = "charAt";
                    if (str.equals("toLocaleLowerCase")) {
                        str12 = "match";
                        str5 = r6;
                        str6 = "toString";
                        b10 = 2;
                    } else {
                        str5 = "hasOwnProperty";
                        str6 = "toString";
                    }
                    break;
                case -1361633751:
                    str4 = "charAt";
                    if (str.equals(str4)) {
                        b10 = 3;
                    }
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        b10 = 4;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b10 = 5;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case -906336856:
                    if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                        b10 = 6;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b10 = 7;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b10 = 8;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        b10 = 9;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case 3568674:
                    if (str.equals(str3)) {
                        b10 = 10;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b10 = 11;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b10 = 12;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b10 = 13;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b10 = 14;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        b10 = 15;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b10 = 16;
                    }
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
                default:
                    str4 = "charAt";
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                    break;
            }
            dDoubleValue = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            switch (b10) {
                case 0:
                    zzg.zza(str5, 1, list);
                    str7 = this.zza;
                    zzaqVarZza = zzhVar.zza(list.get(0));
                    if ("length".equals(zzaqVarZza.zzf())) {
                        return zzaq.zzh;
                    }
                    double dDoubleValue4 = zzaqVarZza.zze().doubleValue();
                    return (dDoubleValue4 == Math.floor(dDoubleValue4) || (i10 = (int) dDoubleValue4) < 0 || i10 >= str7.length()) ? zzaq.zzi : zzaq.zzh;
                case 1:
                    zzg.zza(str6, 0, list);
                    return this;
                case 2:
                    zzg.zza("toLocaleLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase());
                case 3:
                    zzg.zzc(str4, 1, list);
                    if (list.isEmpty()) {
                        iZza = 0;
                    } else {
                        iZza = (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                    }
                    String str13 = this.zza;
                    return (iZza >= 0 || iZza >= str13.length()) ? zzaq.zzj : new zzas(String.valueOf(str13.charAt(iZza)));
                case 4:
                    if (list.isEmpty()) {
                        return this;
                    }
                    sb = new StringBuilder(this.zza);
                    for (i11 = 0; i11 < list.size(); i11++) {
                        sb.append(zzhVar.zza(list.get(i11)).zzf());
                    }
                    return new zzas(sb.toString());
                case 5:
                    zzg.zza("toLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
                case 6:
                    zzg.zzc(FirebaseAnalytics.Event.SEARCH, 1, list);
                    if (list.isEmpty()) {
                        strZzf = zzaq.zzc.zzf();
                    } else {
                        strZzf = zzhVar.zza(list.get(0)).zzf();
                    }
                    Matcher matcher = Pattern.compile(strZzf).matcher(this.zza);
                    return matcher.find() ? new zzai(Double.valueOf(matcher.start())) : new zzai(Double.valueOf(-1.0d));
                case 7:
                    zzg.zza(str2, 0, list);
                    return new zzas(this.zza.toUpperCase());
                case 8:
                    zzg.zzc("lastIndexOf", 2, list);
                    String str14 = this.zza;
                    if (list.size() <= 0) {
                        strZzf2 = zzaq.zzc.zzf();
                    } else {
                        strZzf2 = zzhVar.zza(list.get(0)).zzf();
                    }
                    if (list.size() < 2) {
                        dDoubleValue2 = Double.NaN;
                    } else {
                        dDoubleValue2 = zzhVar.zza(list.get(1)).zze().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue2)) {
                        dZza = Double.POSITIVE_INFINITY;
                    } else {
                        dZza = zzg.zza(dDoubleValue2);
                    }
                    return new zzai(Double.valueOf(str14.lastIndexOf(strZzf2, (int) dZza)));
                case 9:
                    zzg.zza("toUpperCase", 0, list);
                    return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
                case 10:
                    zzg.zza("toUpperCase", 0, list);
                    return new zzas(this.zza.trim());
                case 11:
                    zzg.zzc(str12, 1, list);
                    String str15 = this.zza;
                    if (list.size() <= 0) {
                        strZzf3 = "";
                    } else {
                        strZzf3 = zzhVar.zza(list.get(0)).zzf();
                    }
                    Matcher matcher2 = Pattern.compile(strZzf3).matcher(str15);
                    return matcher2.find() ? new zzaf(new zzas(matcher2.group())) : zzaq.zzd;
                case 12:
                    zzg.zzc("slice", 2, list);
                    str8 = this.zza;
                    if (list.isEmpty()) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = zzhVar.zza(list.get(0)).zze().doubleValue();
                    }
                    dZza2 = zzg.zza(dDoubleValue3);
                    if (dZza2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        dMin = Math.max(((double) str8.length()) + dZza2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    } else {
                        dMin = Math.min(dZza2, str8.length());
                    }
                    int i13 = (int) dMin;
                    if (list.size() > 1) {
                        length = zzhVar.zza(list.get(1)).zze().doubleValue();
                    } else {
                        length = str8.length();
                    }
                    dZza3 = zzg.zza(length);
                    if (dZza3 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        dMin2 = Math.max(((double) str8.length()) + dZza3, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    } else {
                        dMin2 = Math.min(dZza3, str8.length());
                    }
                    return new zzas(str8.substring(i13, Math.max(0, ((int) dMin2) - i13) + i13));
                case 13:
                    zzg.zzc("split", 2, list);
                    str9 = this.zza;
                    if (str9.length() == 0) {
                        return new zzaf(this);
                    }
                    arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        strZzf4 = zzhVar.zza(list.get(0)).zzf();
                        if (list.size() > 1) {
                            jZzc = zzg.zzc(zzhVar.zza(list.get(1)).zze().doubleValue());
                        } else {
                            jZzc = 2147483647L;
                        }
                        if (jZzc == 0) {
                            return new zzaf();
                        }
                        strArrSplit = str9.split(Pattern.quote(strZzf4), ((int) jZzc) + 1);
                        length2 = strArrSplit.length;
                        if (strZzf4.isEmpty() || strArrSplit.length <= 0) {
                            i12 = 0;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                                i12 = zIsEmpty;
                                length2 = strArrSplit.length - 1;
                                i12 = zIsEmpty;
                            }
                        }
                        i12 = zIsEmpty;
                        if (strArrSplit.length > jZzc) {
                            length2--;
                        }
                        while (i12 < length2) {
                            arrayList.add(new zzas(strArrSplit[i12]));
                            i12++;
                        }
                    }
                    return new zzaf(arrayList);
                case Code.UNAVAILABLE /* 14 */:
                    zzg.zzc("substring", 2, list);
                    str10 = this.zza;
                    if (list.isEmpty()) {
                        iZza2 = 0;
                    } else {
                        iZza2 = (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                    }
                    if (list.size() > 1) {
                        length3 = (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
                    } else {
                        length3 = str10.length();
                    }
                    int iMin = Math.min(Math.max(iZza2, 0), str10.length());
                    int iMin2 = Math.min(Math.max(length3, 0), str10.length());
                    return new zzas(str10.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                case 15:
                    zzg.zzc("replace", 2, list);
                    zzaqVarZza2 = zzaq.zzc;
                    strZzf5 = zzaqVarZza2.zzf();
                    if (!list.isEmpty()) {
                        strZzf5 = zzhVar.zza(list.get(0)).zzf();
                        if (list.size() > 1) {
                            zzaqVarZza2 = zzhVar.zza(list.get(1));
                        }
                    }
                    str11 = this.zza;
                    iIndexOf = str11.indexOf(strZzf5);
                    if (iIndexOf < 0) {
                        return this;
                    }
                    if (zzaqVarZza2 instanceof zzal) {
                        zzaqVarZza2 = ((zzal) zzaqVarZza2).zza(zzhVar, Arrays.asList(new zzas(strZzf5), new zzai(Double.valueOf(iIndexOf)), this));
                    }
                    return new zzas(a.n(str11.substring(0, iIndexOf), zzaqVarZza2.zzf(), str11.substring(strZzf5.length() + iIndexOf)));
                case Code.UNAUTHENTICATED /* 16 */:
                    zzg.zzc("indexOf", 2, list);
                    String str16 = this.zza;
                    if (list.size() <= 0) {
                        strZzf6 = zzaq.zzc.zzf();
                        zzhVar2 = zzhVar;
                    } else {
                        zzhVar2 = zzhVar;
                        strZzf6 = zzhVar2.zza(list.get(0)).zzf();
                    }
                    if (list.size() >= 2) {
                        dDoubleValue = zzhVar2.zza(list.get(1)).zze().doubleValue();
                    }
                    return new zzai(Double.valueOf(str16.indexOf(strZzf6, (int) zzg.zza(dDoubleValue))));
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "trim";
        str.getClass();
        b10 = -1;
        switch (str.hashCode()) {
            case -1789698943:
                str4 = "charAt";
                str5 = r6;
                str6 = "toString";
                str12 = "match";
                if (str.equals(str5)) {
                    b10 = 0;
                }
                break;
            case -1776922004:
                str4 = "charAt";
                str6 = "toString";
                str12 = "match";
                str5 = r6;
                if (str.equals(str6)) {
                    b10 = 1;
                }
                break;
            case -1464939364:
                str4 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    str5 = "hasOwnProperty";
                    str6 = "toString";
                } else {
                    str12 = "match";
                    str5 = r6;
                    str6 = "toString";
                    b10 = 2;
                }
                break;
            case -1361633751:
                str4 = "charAt";
                if (str.equals(str4)) {
                    b10 = 3;
                }
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b10 = 4;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b10 = 5;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case -906336856:
                if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                    b10 = 6;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b10 = 7;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b10 = 8;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b10 = 9;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b10 = 10;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b10 = 11;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b10 = 12;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = 13;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b10 = 14;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b10 = 15;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b10 = 16;
                }
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
            default:
                str4 = "charAt";
                str5 = "hasOwnProperty";
                str6 = "toString";
                break;
        }
        dDoubleValue = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        switch (b10) {
            case 0:
                zzg.zza(str5, 1, list);
                str7 = this.zza;
                zzaqVarZza = zzhVar.zza(list.get(0));
                if ("length".equals(zzaqVarZza.zzf())) {
                    return zzaq.zzh;
                }
                double dDoubleValue5 = zzaqVarZza.zze().doubleValue();
                if (dDoubleValue5 == Math.floor(dDoubleValue5)) {
                }
                break;
            case 1:
                zzg.zza(str6, 0, list);
                return this;
            case 2:
                zzg.zza("toLocaleLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase());
            case 3:
                zzg.zzc(str4, 1, list);
                if (list.isEmpty()) {
                    iZza = (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                } else {
                    iZza = 0;
                }
                String str17 = this.zza;
                if (iZza >= 0) {
                }
                break;
            case 4:
                if (list.isEmpty()) {
                    return this;
                }
                sb = new StringBuilder(this.zza);
                while (i11 < list.size()) {
                    sb.append(zzhVar.zza(list.get(i11)).zzf());
                }
                return new zzas(sb.toString());
            case 5:
                zzg.zza("toLowerCase", 0, list);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            case 6:
                zzg.zzc(FirebaseAnalytics.Event.SEARCH, 1, list);
                if (list.isEmpty()) {
                    strZzf = zzhVar.zza(list.get(0)).zzf();
                } else {
                    strZzf = zzaq.zzc.zzf();
                }
                Matcher matcher3 = Pattern.compile(strZzf).matcher(this.zza);
                if (matcher3.find()) {
                }
            case 7:
                zzg.zza(str2, 0, list);
                return new zzas(this.zza.toUpperCase());
            case 8:
                zzg.zzc("lastIndexOf", 2, list);
                String str18 = this.zza;
                if (list.size() <= 0) {
                    strZzf2 = zzaq.zzc.zzf();
                } else {
                    strZzf2 = zzhVar.zza(list.get(0)).zzf();
                }
                if (list.size() < 2) {
                    dDoubleValue2 = Double.NaN;
                } else {
                    dDoubleValue2 = zzhVar.zza(list.get(1)).zze().doubleValue();
                }
                if (Double.isNaN(dDoubleValue2)) {
                    dZza = Double.POSITIVE_INFINITY;
                } else {
                    dZza = zzg.zza(dDoubleValue2);
                }
                return new zzai(Double.valueOf(str18.lastIndexOf(strZzf2, (int) dZza)));
            case 9:
                zzg.zza("toUpperCase", 0, list);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            case 10:
                zzg.zza("toUpperCase", 0, list);
                return new zzas(this.zza.trim());
            case 11:
                zzg.zzc(str12, 1, list);
                String str19 = this.zza;
                if (list.size() <= 0) {
                    strZzf3 = "";
                } else {
                    strZzf3 = zzhVar.zza(list.get(0)).zzf();
                }
                Matcher matcher4 = Pattern.compile(strZzf3).matcher(str19);
                if (matcher4.find()) {
                }
            case 12:
                zzg.zzc("slice", 2, list);
                str8 = this.zza;
                if (list.isEmpty()) {
                    dDoubleValue3 = zzhVar.zza(list.get(0)).zze().doubleValue();
                } else {
                    dDoubleValue3 = 0.0d;
                }
                dZza2 = zzg.zza(dDoubleValue3);
                if (dZza2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    dMin = Math.max(((double) str8.length()) + dZza2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                } else {
                    dMin = Math.min(dZza2, str8.length());
                }
                int i14 = (int) dMin;
                if (list.size() > 1) {
                    length = zzhVar.zza(list.get(1)).zze().doubleValue();
                } else {
                    length = str8.length();
                }
                dZza3 = zzg.zza(length);
                if (dZza3 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    dMin2 = Math.max(((double) str8.length()) + dZza3, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                } else {
                    dMin2 = Math.min(dZza3, str8.length());
                }
                return new zzas(str8.substring(i14, Math.max(0, ((int) dMin2) - i14) + i14));
            case 13:
                zzg.zzc("split", 2, list);
                str9 = this.zza;
                if (str9.length() == 0) {
                    return new zzaf(this);
                }
                arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    strZzf4 = zzhVar.zza(list.get(0)).zzf();
                    if (list.size() > 1) {
                        jZzc = zzg.zzc(zzhVar.zza(list.get(1)).zze().doubleValue());
                    } else {
                        jZzc = 2147483647L;
                    }
                    if (jZzc == 0) {
                        return new zzaf();
                    }
                    strArrSplit = str9.split(Pattern.quote(strZzf4), ((int) jZzc) + 1);
                    length2 = strArrSplit.length;
                    if (strZzf4.isEmpty()) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                    }
                    i12 = zIsEmpty;
                    if (strArrSplit.length > jZzc) {
                        length2--;
                    }
                    while (i12 < length2) {
                        arrayList.add(new zzas(strArrSplit[i12]));
                        i12++;
                    }
                }
                return new zzaf(arrayList);
            case Code.UNAVAILABLE /* 14 */:
                zzg.zzc("substring", 2, list);
                str10 = this.zza;
                if (list.isEmpty()) {
                    iZza2 = (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue());
                } else {
                    iZza2 = 0;
                }
                if (list.size() > 1) {
                    length3 = (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
                } else {
                    length3 = str10.length();
                }
                int iMin3 = Math.min(Math.max(iZza2, 0), str10.length());
                int iMin4 = Math.min(Math.max(length3, 0), str10.length());
                return new zzas(str10.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
            case 15:
                zzg.zzc("replace", 2, list);
                zzaqVarZza2 = zzaq.zzc;
                strZzf5 = zzaqVarZza2.zzf();
                if (!list.isEmpty()) {
                    strZzf5 = zzhVar.zza(list.get(0)).zzf();
                    if (list.size() > 1) {
                        zzaqVarZza2 = zzhVar.zza(list.get(1));
                    }
                }
                str11 = this.zza;
                iIndexOf = str11.indexOf(strZzf5);
                if (iIndexOf < 0) {
                    return this;
                }
                if (zzaqVarZza2 instanceof zzal) {
                    zzaqVarZza2 = ((zzal) zzaqVarZza2).zza(zzhVar, Arrays.asList(new zzas(strZzf5), new zzai(Double.valueOf(iIndexOf)), this));
                }
                return new zzas(a.n(str11.substring(0, iIndexOf), zzaqVarZza2.zzf(), str11.substring(strZzf5.length() + iIndexOf)));
            case Code.UNAUTHENTICATED /* 16 */:
                zzg.zzc("indexOf", 2, list);
                String str110 = this.zza;
                if (list.size() <= 0) {
                    strZzf6 = zzaq.zzc.zzf();
                    zzhVar2 = zzhVar;
                } else {
                    zzhVar2 = zzhVar;
                    strZzf6 = zzhVar2.zza(list.get(0)).zzf();
                }
                if (list.size() >= 2) {
                    dDoubleValue = zzhVar2.zza(list.get(1)).zze().doubleValue();
                }
                return new zzai(Double.valueOf(str110.indexOf(strZzf6, (int) zzg.zza(dDoubleValue))));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
