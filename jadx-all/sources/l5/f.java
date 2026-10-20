package l5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f11335a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f11336b = l.q.e(1, FieldDescriptor.builder("currentCacheSizeBytes"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f11337c = l.q.e(2, FieldDescriptor.builder("maxCacheSizeBytes"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        o5.f fVar = (o5.f) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f11336b, fVar.f12542a);
        objectEncoderContext2.add(f11337c, fVar.f12543b);
    }
}
