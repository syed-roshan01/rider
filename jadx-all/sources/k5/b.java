package k5;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ObjectEncoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9782a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FieldDescriptor f9783b = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FieldDescriptor f9784c = FieldDescriptor.of("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FieldDescriptor f9785d = FieldDescriptor.of("hardware");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FieldDescriptor f9786e = FieldDescriptor.of("device");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FieldDescriptor f9787f = FieldDescriptor.of("product");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FieldDescriptor f9788g = FieldDescriptor.of("osBuild");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FieldDescriptor f9789h = FieldDescriptor.of("manufacturer");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FieldDescriptor f9790i = FieldDescriptor.of("fingerprint");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final FieldDescriptor f9791j = FieldDescriptor.of("locale");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final FieldDescriptor f9792k = FieldDescriptor.of("country");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final FieldDescriptor f9793l = FieldDescriptor.of("mccMnc");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final FieldDescriptor f9794m = FieldDescriptor.of("applicationBuild");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        i iVar = (i) ((a) obj);
        objectEncoderContext2.add(f9783b, iVar.f9820a);
        objectEncoderContext2.add(f9784c, iVar.f9821b);
        objectEncoderContext2.add(f9785d, iVar.f9822c);
        objectEncoderContext2.add(f9786e, iVar.f9823d);
        objectEncoderContext2.add(f9787f, iVar.f9824e);
        objectEncoderContext2.add(f9788g, iVar.f9825f);
        objectEncoderContext2.add(f9789h, iVar.f9826g);
        objectEncoderContext2.add(f9790i, iVar.f9827h);
        objectEncoderContext2.add(f9791j, iVar.f9828i);
        objectEncoderContext2.add(f9792k, iVar.f9829j);
        objectEncoderContext2.add(f9793l, iVar.f9830k);
        objectEncoderContext2.add(f9794m, iVar.f9831l);
    }
}
