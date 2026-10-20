package k5;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f9819a = new h();

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig encoderConfig) {
        c cVar = c.f9795a;
        encoderConfig.registerEncoder(p.class, cVar);
        encoderConfig.registerEncoder(j.class, cVar);
        f fVar = f.f9808a;
        encoderConfig.registerEncoder(t.class, fVar);
        encoderConfig.registerEncoder(m.class, fVar);
        d dVar = d.f9797a;
        encoderConfig.registerEncoder(r.class, dVar);
        encoderConfig.registerEncoder(k.class, dVar);
        b bVar = b.f9782a;
        encoderConfig.registerEncoder(a.class, bVar);
        encoderConfig.registerEncoder(i.class, bVar);
        e eVar = e.f9800a;
        encoderConfig.registerEncoder(s.class, eVar);
        encoderConfig.registerEncoder(l.class, eVar);
        g gVar = g.f9816a;
        encoderConfig.registerEncoder(w.class, gVar);
        encoderConfig.registerEncoder(o.class, gVar);
    }
}
