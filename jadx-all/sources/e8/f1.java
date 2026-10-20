package e8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f5240c = Logger.getLogger(f1.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f1 f5241d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f5242a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f5243b = Collections.emptyList();

    public static List a() {
        Logger logger = f5240c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(h8.j.class);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e4);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e10);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e11) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e11);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
