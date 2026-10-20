package l5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f11328a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f11329b = l.q.e(1, FieldDescriptor.builder("eventsDroppedCount"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f11330c = l.q.e(3, FieldDescriptor.builder("reason"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        o5.d dVar = (o5.d) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f11329b, dVar.f12537a);
        objectEncoderContext2.add(f11330c, dVar.f12538b);
    }
}
