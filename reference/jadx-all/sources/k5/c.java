package k5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f9795a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f9796b = FieldDescriptor.of("logRequest");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f9796b, ((j) ((p) obj)).f9832a);
    }
}
