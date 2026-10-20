package l5;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f11341a = new h();

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        encoderConfig.registerEncoder(p.class, e.f11334a);
        encoderConfig.registerEncoder(o5.a.class, a.f11321a);
        encoderConfig.registerEncoder(o5.g.class, g.f11338a);
        encoderConfig.registerEncoder(o5.e.class, d.f11331a);
        encoderConfig.registerEncoder(o5.d.class, c.f11328a);
        encoderConfig.registerEncoder(o5.b.class, b.f11326a);
        encoderConfig.registerEncoder(o5.f.class, f.f11335a);
    }
}
