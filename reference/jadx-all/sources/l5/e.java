package l5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f11334a = new e();

    static {
        FieldDescriptor.of("clientMetrics");
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        a7.a.w(obj);
        throw null;
    }
}
