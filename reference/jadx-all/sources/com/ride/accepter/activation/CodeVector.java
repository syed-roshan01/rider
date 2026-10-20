package com.ride.accepter.activation;

/* JADX INFO: loaded from: classes2.dex */
public final class CodeVector {
    public static void main(String[] strArr) {
        String[][] strArr2 = {new String[]{"abc123", "Google", "Pixel 8"}, new String[]{"abcdef0123456789", "samsung", "SM-N770F"}, new String[]{"aaa", "Google", "Pixel 8"}, new String[]{"aaa", "Samsung", "Galaxy S24"}, new String[]{"", "", ""}, new String[]{"xyz", "Xiaomi", "Redmi Note 12"}};
        for (int i10 = 0; i10 < 6; i10++) {
            String[] strArr3 = strArr2[i10];
            System.out.println(strArr3[0] + "|" + strArr3[1] + "|" + strArr3[2] + "|" + DeviceIdentity.deviceCode(strArr3[0], strArr3[1], strArr3[2]));
        }
        String[] strArr4 = {"O1l-i", "  7qk2m3xw8h  ", "RA-AAAAA-BBBBB-CCCCC-DDDDD-EEEEE"};
        for (int i11 = 0; i11 < 3; i11++) {
            String str = strArr4[i11];
            System.out.println("norm|" + str + "|" + DeviceIdentity.normalize(str));
        }
    }
}
