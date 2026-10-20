package k5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f9808a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f9809b = FieldDescriptor.of("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f9810c = FieldDescriptor.of("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FieldDescriptor f9811d = FieldDescriptor.of("clientInfo");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FieldDescriptor f9812e = FieldDescriptor.of("logSource");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FieldDescriptor f9813f = FieldDescriptor.of("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FieldDescriptor f9814g = FieldDescriptor.of("logEvent");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FieldDescriptor f9815h = FieldDescriptor.of("qosTier");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        m mVar = (m) ((t) obj);
        objectEncoderContext2.add(f9809b, mVar.f9842a);
        objectEncoderContext2.add(f9810c, mVar.f9843b);
        objectEncoderContext2.add(f9811d, mVar.f9844c);
        objectEncoderContext2.add(f9812e, mVar.f9845d);
        objectEncoderContext2.add(f9813f, mVar.f9846e);
        objectEncoderContext2.add(f9814g, mVar.f9847f);
        objectEncoderContext2.add(f9815h, mVar.f9848g);
    }
}
