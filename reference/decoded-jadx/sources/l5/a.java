package l5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11321a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f11322b = l.q.e(1, FieldDescriptor.builder("window"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f11323c = l.q.e(2, FieldDescriptor.builder("logSourceMetrics"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FieldDescriptor f11324d = l.q.e(3, FieldDescriptor.builder("globalMetrics"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FieldDescriptor f11325e = l.q.e(4, FieldDescriptor.builder("appNamespace"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        o5.a aVar = (o5.a) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f11322b, aVar.f12523a);
        objectEncoderContext2.add(f11323c, aVar.f12524b);
        objectEncoderContext2.add(f11324d, aVar.f12525c);
        objectEncoderContext2.add(f11325e, aVar.f12526d);
    }
}
