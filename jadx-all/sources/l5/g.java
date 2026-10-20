package l5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f11338a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f11339b = l.q.e(1, FieldDescriptor.builder("startMs"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f11340c = l.q.e(2, FieldDescriptor.builder("endMs"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        o5.g gVar = (o5.g) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(f11339b, gVar.f12544a);
        objectEncoderContext2.add(f11340c, gVar.f12545b);
    }
}
