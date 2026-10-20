package com.google.protobuf;

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
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f4251a;

    static {
        char[] cArr = new char[80];
        f4251a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f4251a, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i10, sb);
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
            m mVar = n.f4181b;
            sb.append(n2.N(new m(((String) obj).getBytes(y0.f4276a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof n) {
            sb.append(": \"");
            sb.append(n2.N((n) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof l0) {
            sb.append(" {");
            c((l0) obj, sb, i10 + 2);
            sb.append("\n");
            a(i10, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        b(sb, i12, "key", entry.getKey());
        b(sb, i12, FirebaseAnalytics.Param.VALUE, entry.getValue());
        sb.append("\n");
        a(i10, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:105:0x0206  */
    /* JADX WARN: Code duplicated, block: B:124:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:65:0x0173  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0189  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0198  */
    /* JADX WARN: Code duplicated, block: B:77:0x019c  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01da  */
    /* JADX WARN: Code duplicated, block: B:95:0x01de  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e9  */
    public static void c(t1 t1Var, StringBuilder sb, int i10) {
        int i11;
        Method method;
        Method method2;
        Object objInvokeOrDie;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = t1Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method5 = declaredMethods[i12];
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
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 4), l0.invokeOrDie(method4, t1Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb, i10, strSubstring.substring(0, strSubstring.length() - 3), l0.invokeOrDie(method3, t1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objInvokeOrDie = l0.invokeOrDie(method, t1Var, new Object[0]);
                            if (method2 == null) {
                                if (objInvokeOrDie instanceof Boolean) {
                                    zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                                } else if (objInvokeOrDie instanceof Integer) {
                                    if (((Integer) objInvokeOrDie).intValue() == 0) {
                                        b(sb, i10, strSubstring, objInvokeOrDie);
                                    }
                                } else if (objInvokeOrDie instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) == 0) {
                                        b(sb, i10, strSubstring, objInvokeOrDie);
                                    }
                                } else if (objInvokeOrDie instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) == 0) {
                                        b(sb, i10, strSubstring, objInvokeOrDie);
                                    }
                                } else if (objInvokeOrDie instanceof String) {
                                    zEquals = objInvokeOrDie.equals("");
                                } else if (objInvokeOrDie instanceof n) {
                                    zEquals = objInvokeOrDie.equals(n.f4181b);
                                } else if (objInvokeOrDie instanceof t1) {
                                    if (objInvokeOrDie == ((t1) objInvokeOrDie).getDefaultInstanceForType()) {
                                        b(sb, i10, strSubstring, objInvokeOrDie);
                                    }
                                } else if ((objInvokeOrDie instanceof Enum) || ((Enum) objInvokeOrDie).ordinal() != 0) {
                                    b(sb, i10, strSubstring, objInvokeOrDie);
                                }
                                if (!zEquals) {
                                    b(sb, i10, strSubstring, objInvokeOrDie);
                                }
                            } else if (((Boolean) l0.invokeOrDie(method2, t1Var, new Object[0])).booleanValue()) {
                                b(sb, i10, strSubstring, objInvokeOrDie);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objInvokeOrDie = l0.invokeOrDie(method, t1Var, new Object[0]);
                        if (method2 == null) {
                            if (objInvokeOrDie instanceof Boolean) {
                                zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                            } else if (objInvokeOrDie instanceof Integer) {
                                if (((Integer) objInvokeOrDie).intValue() == 0) {
                                    b(sb, i10, strSubstring, objInvokeOrDie);
                                }
                            } else if (objInvokeOrDie instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) == 0) {
                                    b(sb, i10, strSubstring, objInvokeOrDie);
                                }
                            } else if (objInvokeOrDie instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) == 0) {
                                    b(sb, i10, strSubstring, objInvokeOrDie);
                                }
                            } else if (objInvokeOrDie instanceof String) {
                                zEquals = objInvokeOrDie.equals("");
                            } else if (objInvokeOrDie instanceof n) {
                                zEquals = objInvokeOrDie.equals(n.f4181b);
                            } else if (objInvokeOrDie instanceof t1) {
                                if (objInvokeOrDie == ((t1) objInvokeOrDie).getDefaultInstanceForType()) {
                                    b(sb, i10, strSubstring, objInvokeOrDie);
                                }
                            } else if (objInvokeOrDie instanceof Enum) {
                                b(sb, i10, strSubstring, objInvokeOrDie);
                            } else {
                                b(sb, i10, strSubstring, objInvokeOrDie);
                            }
                            if (!zEquals) {
                                b(sb, i10, strSubstring, objInvokeOrDie);
                            }
                        } else if (((Boolean) l0.invokeOrDie(method2, t1Var, new Object[0])).booleanValue()) {
                            b(sb, i10, strSubstring, objInvokeOrDie);
                        }
                    }
                }
            }
            i11 = 3;
        }
        s2 s2Var = ((l0) t1Var).unknownFields;
        if (s2Var != null) {
            for (int i13 = 0; i13 < s2Var.f4235a; i13++) {
                b(sb, i10, String.valueOf(s2Var.f4236b[i13] >>> 3), s2Var.f4237c[i13]);
            }
        }
    }
}
