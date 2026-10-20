package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class a1 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4055a;

    public static a1 a() {
        return new a1("Protocol message end-group tag did not match expected tag.");
    }

    public static a1 b() {
        return new a1("Protocol message contained an invalid tag (zero).");
    }

    public static a1 c() {
        return new a1("Protocol message had invalid UTF-8.");
    }

    public static z0 d() {
        return new z0("Protocol message tag had invalid wire type.");
    }

    public static a1 e() {
        return new a1("CodedInputStream encountered a malformed varint.");
    }

    public static a1 f() {
        return new a1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static a1 g() {
        return new a1("Failed to parse the message.");
    }

    public static a1 h() {
        return new a1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
