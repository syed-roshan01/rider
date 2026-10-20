package com.ride.accepter.activation;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceIdentity {
    private static final String ALPHABET = "0123456789ABCDEFGHJKMNPQRSTVWXYZ";

    private DeviceIdentity() {
    }

    public static String deriveHwid(String str, String str2, String str3) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("androidId", n(str));
        treeMap.put("brand", n(str2));
        treeMap.put("model", n(str3));
        StringBuilder sb = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (!z10) {
                sb.append('|');
            }
            sb.append((String) entry.getKey()).append('=').append((String) entry.getValue());
            z10 = false;
        }
        return sha256Hex(sb.toString());
    }

    public static String deviceCode(String str, String str2, String str3) {
        byte[] bArrSha256 = sha256(("ride-accepter/device-code/v1|" + deriveHwid(str, str2, str3)).getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < 15; i10++) {
            sb.append(ALPHABET.charAt((bArrSha256[i10] & 255) % 32));
        }
        String string = sb.toString();
        return string.substring(0, 5) + "-" + string.substring(5, 10) + "-" + string.substring(10, 15);
    }

    public static String normalize(String str) {
        if (str == null) {
            return "";
        }
        return str.toUpperCase().replaceAll("[^0-9A-Z]", "").replace('O', '0').replace('I', '1').replace('L', '1');
    }

    private static String n(String str) {
        return str == null ? "" : str;
    }

    private static String sha256Hex(String str) {
        byte[] bArrSha256 = sha256(str.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder(bArrSha256.length * 2);
        for (byte b10 : bArrSha256) {
            sb.append(Character.forDigit((b10 >> 4) & 15, 16));
            sb.append(Character.forDigit(b10 & 15, 16));
        }
        return sb.toString();
    }

    private static byte[] sha256(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (Exception e4) {
            throw new IllegalStateException("SHA-256 unavailable", e4);
        }
    }
}
