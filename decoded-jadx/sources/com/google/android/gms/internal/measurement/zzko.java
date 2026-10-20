package com.google.android.gms.internal.measurement;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
final class zzko {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzkj zzkjVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzkjVar, sb, 0);
        return sb.toString();
    }

    private static void zza(int i10, StringBuilder sb) {
        while (i10 > 0) {
            char[] cArr = zza;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb.append(cArr, 0, length);
            i10 -= length;
        }
    }

    public static void zza(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i10, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzlw.zza(zzhm.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzhm) {
            sb.append(": \"");
            sb.append(zzlw.zza((zzhm) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzix) {
            sb.append(" {");
            zza((zzix) obj, sb, i10 + 2);
            sb.append("\n");
            zza(i10, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 2;
            zza(sb, i12, "key", entry.getKey());
            zza(sb, i12, FirebaseAnalytics.Param.VALUE, entry.getValue());
            sb.append("\n");
            zza(i10, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0201  */
    /* JADX WARN: Code duplicated, block: B:57:0x015e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0170  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178  */
    /* JADX WARN: Code duplicated, block: B:63:0x017c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0186  */
    /* JADX WARN: Code duplicated, block: B:68:0x018a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0194  */
    /* JADX WARN: Code duplicated, block: B:73:0x0198  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f3  */
    private static void zza(zzkj zzkjVar, StringBuilder sb, int i10) {
        int i11;
        int i12;
        Method method;
        Method method2;
        Object objZza;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzkjVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method5 = declaredMethods[i13];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                zza(sb, i10, strSubstring.substring(0, strSubstring.length() - 4), zzix.zza(method4, zzkjVar, new Object[0]));
                i11 = 3;
            } else {
                if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    i12 = 3;
                    zza(sb, i10, strSubstring.substring(0, strSubstring.length() - 3), zzix.zza(method3, zzkjVar, new Object[0]));
                } else {
                    i12 = 3;
                    if (hashSet.contains("set".concat(strSubstring))) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                method = (Method) entry.getValue();
                                method2 = (Method) map.get("has".concat(strSubstring));
                                if (method != null) {
                                    objZza = zzix.zza(method, zzkjVar, new Object[0]);
                                    if (method2 == null) {
                                        if (objZza instanceof Boolean) {
                                            if (((Boolean) objZza).booleanValue()) {
                                                zza(sb, i10, strSubstring, objZza);
                                            }
                                        } else if (objZza instanceof Integer) {
                                            if (((Integer) objZza).intValue() != 0) {
                                                zza(sb, i10, strSubstring, objZza);
                                            }
                                        } else if (objZza instanceof Float) {
                                            if (Float.floatToRawIntBits(((Float) objZza).floatValue()) != 0) {
                                                zza(sb, i10, strSubstring, objZza);
                                            }
                                        } else if (objZza instanceof Double) {
                                            if (objZza instanceof String) {
                                                zEquals = objZza.equals("");
                                            } else if (objZza instanceof zzhm) {
                                                zEquals = objZza.equals(zzhm.zza);
                                            } else if ((objZza instanceof zzkj) ? !(objZza instanceof Enum) || ((Enum) objZza).ordinal() != 0 : objZza != ((zzkj) objZza).zzcf()) {
                                                zza(sb, i10, strSubstring, objZza);
                                            }
                                            if (!zEquals) {
                                                zza(sb, i10, strSubstring, objZza);
                                            }
                                        } else if (Double.doubleToRawLongBits(((Double) objZza).doubleValue()) != 0) {
                                            zza(sb, i10, strSubstring, objZza);
                                        }
                                    } else if (((Boolean) zzix.zza(method2, zzkjVar, new Object[0])).booleanValue()) {
                                        zza(sb, i10, strSubstring, objZza);
                                    }
                                }
                            }
                        } else {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has".concat(strSubstring));
                            if (method != null) {
                                objZza = zzix.zza(method, zzkjVar, new Object[0]);
                                if (method2 == null) {
                                    if (objZza instanceof Boolean) {
                                        if (((Boolean) objZza).booleanValue()) {
                                            zza(sb, i10, strSubstring, objZza);
                                        }
                                    } else if (objZza instanceof Integer) {
                                        if (((Integer) objZza).intValue() != 0) {
                                            zza(sb, i10, strSubstring, objZza);
                                        }
                                    } else if (objZza instanceof Float) {
                                        if (Float.floatToRawIntBits(((Float) objZza).floatValue()) != 0) {
                                            zza(sb, i10, strSubstring, objZza);
                                        }
                                    } else if (objZza instanceof Double) {
                                        if (objZza instanceof String) {
                                            zEquals = objZza.equals("");
                                        } else if (objZza instanceof zzhm) {
                                            zEquals = objZza.equals(zzhm.zza);
                                        } else if (objZza instanceof zzkj) {
                                            zza(sb, i10, strSubstring, objZza);
                                        } else {
                                            zza(sb, i10, strSubstring, objZza);
                                        }
                                        if (!zEquals) {
                                            zza(sb, i10, strSubstring, objZza);
                                        }
                                    } else if (Double.doubleToRawLongBits(((Double) objZza).doubleValue()) != 0) {
                                        zza(sb, i10, strSubstring, objZza);
                                    }
                                } else if (((Boolean) zzix.zza(method2, zzkjVar, new Object[0])).booleanValue()) {
                                    zza(sb, i10, strSubstring, objZza);
                                }
                            }
                        }
                    }
                }
                i11 = i12;
            }
        }
        if (zzkjVar instanceof zzix.zzd) {
            Iterator<Map.Entry<T, Object>> itZzd = ((zzix.zzd) zzkjVar).zzc.zzd();
            if (itZzd.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        zzlz zzlzVar = ((zzix) zzkjVar).zzb;
        if (zzlzVar != null) {
            zzlzVar.zza(sb, i10);
        }
    }
}
