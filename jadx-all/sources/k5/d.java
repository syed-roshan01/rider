package k5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f9797a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f9798b = FieldDescriptor.of("clientType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f9799c = FieldDescriptor.of("androidClientInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        k kVar = (k) ((r) obj);
        objectEncoderContext2.add(f9798b, kVar.f9833a);
        objectEncoderContext2.add(f9799c, kVar.f9834b);
    }
}
