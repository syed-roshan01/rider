package k5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f9800a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f9801b = FieldDescriptor.of("eventTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f9802c = FieldDescriptor.of("eventCode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FieldDescriptor f9803d = FieldDescriptor.of("eventUptimeMs");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FieldDescriptor f9804e = FieldDescriptor.of("sourceExtension");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FieldDescriptor f9805f = FieldDescriptor.of("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FieldDescriptor f9806g = FieldDescriptor.of("timezoneOffsetSeconds");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FieldDescriptor f9807h = FieldDescriptor.of("networkConnectionInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        l lVar = (l) ((s) obj);
        objectEncoderContext2.add(f9801b, lVar.f9835a);
        objectEncoderContext2.add(f9802c, lVar.f9836b);
        objectEncoderContext2.add(f9803d, lVar.f9837c);
        objectEncoderContext2.add(f9804e, lVar.f9838d);
        objectEncoderContext2.add(f9805f, lVar.f9839e);
        objectEncoderContext2.add(f9806g, lVar.f9840f);
        objectEncoderContext2.add(f9807h, lVar.f9841g);
    }
}
