package k5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f9816a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f9817b = FieldDescriptor.of("networkType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f9818c = FieldDescriptor.of("mobileSubtype");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        o oVar = (o) ((w) obj);
        objectEncoderContext2.add(f9817b, oVar.f9850a);
        objectEncoderContext2.add(f9818c, oVar.f9851b);
    }
}
