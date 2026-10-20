package l5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f11331a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f11332b = l.q.e(1, FieldDescriptor.builder("logSource"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f11333c = l.q.e(2, FieldDescriptor.builder("logEventDropped"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        o5.e eVar = (o5.e) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f11332b, eVar.f12540a);
        objectEncoderContext2.add(f11333c, eVar.f12541b);
    }
}
