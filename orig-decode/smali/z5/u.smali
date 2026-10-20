.class public abstract Lz5/u;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lz5/p;

.field public static final b:Lz5/p;

.field public static volatile c:Lcom/google/android/gms/common/internal/f0;

.field public static final d:Ljava/lang/Object;

.field public static e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz5/p;

    const-string v1, "0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\u0008s\u00f9/\u008eQ\u00ed"

    invoke-static {v1}, Lz5/q;->a(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz5/p;-><init>([BI)V

    new-instance v0, Lz5/p;

    const-string v1, "0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0003\u00a3\u00b2\u00ad\u00d7\u00e1r\u00cak\u00ec"

    invoke-static {v1}, Lz5/q;->a(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz5/p;-><init>([BI)V

    new-instance v0, Lz5/p;

    const-string v1, "0\u0082\u0004C0\u0082\u0003+\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"

    invoke-static {v1}, Lz5/q;->a(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz5/p;-><init>([BI)V

    sput-object v0, Lz5/u;->a:Lz5/p;

    new-instance v0, Lz5/p;

    const-string v1, "0\u0082\u0004\u00a80\u0082\u0003\u0090\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085\u00b8l}\u00d3N\u00f50"

    invoke-static {v1}, Lz5/q;->a(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lz5/p;-><init>([BI)V

    sput-object v0, Lz5/u;->b:Lz5/p;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz5/u;->d:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/String;Lz5/q;ZZ)Lz5/z;
    .locals 6

    const-string v0, "Failed to get Google certificates from remote"

    const-string v1, "GoogleCertificates"

    const/4 v2, 0x0

    :try_start_0
    invoke-static {}, Lz5/u;->b()V
    :try_end_0
    .catch Lh6/b; {:try_start_0 .. :try_end_0} :catch_1

    sget-object v3, Lz5/u;->e:Landroid/content/Context;

    invoke-static {v3}, Lf6/a;->x(Ljava/lang/Object;)V

    new-instance v3, Lz5/x;

    invoke-direct {v3, p0, p1, p2, p3}, Lz5/x;-><init>(Ljava/lang/String;Lz5/q;ZZ)V

    :try_start_1
    sget-object p3, Lz5/u;->c:Lcom/google/android/gms/common/internal/f0;

    sget-object v4, Lz5/u;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    new-instance v5, Lg6/b;

    invoke-direct {v5, v4}, Lg6/b;-><init>(Ljava/lang/Object;)V

    check-cast p3, Lcom/google/android/gms/common/internal/d0;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/common/zza;->zza()Landroid/os/Parcel;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/common/zzc;->zzd(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v4, v5}, Lcom/google/android/gms/internal/common/zzc;->zzf(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 v3, 0x5

    invoke-virtual {p3, v3, v4}, Lcom/google/android/gms/internal/common/zza;->zzB(ILandroid/os/Parcel;)Landroid/os/Parcel;

    move-result-object p3

    invoke-static {p3}, Lcom/google/android/gms/internal/common/zzc;->zzg(Landroid/os/Parcel;)Z

    move-result v3

    invoke-virtual {p3}, Landroid/os/Parcel;->recycle()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v3, :cond_0

    sget-object p0, Lz5/z;->d:Lz5/z;

    return-object p0

    :cond_0
    new-instance p3, Lz5/o;

    invoke-direct {p3, p2, p0, p1}, Lz5/o;-><init>(ZLjava/lang/String;Lz5/q;)V

    new-instance p0, Lz5/y;

    invoke-direct {p0, p3}, Lz5/y;-><init>(Lz5/o;)V

    return-object p0

    :catch_0
    move-exception p0

    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance p1, Lz5/z;

    const-string p2, "module call"

    invoke-direct {p1, v2, p2, p0}, Lz5/z;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    return-object p1

    :catch_1
    move-exception p0

    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "module init: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lz5/z;

    invoke-direct {p2, v2, p1, p0}, Lz5/z;-><init>(ZLjava/lang/String;Ljava/lang/Exception;)V

    return-object p2
.end method

.method public static b()V
    .locals 5

    sget-object v0, Lz5/u;->c:Lcom/google/android/gms/common/internal/f0;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lz5/u;->e:Landroid/content/Context;

    invoke-static {v0}, Lf6/a;->x(Ljava/lang/Object;)V

    sget-object v0, Lz5/u;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lz5/u;->c:Lcom/google/android/gms/common/internal/f0;

    if-nez v1, :cond_3

    sget-object v1, Lz5/u;->e:Landroid/content/Context;

    sget-object v2, Lh6/e;->c:Ll4/d;

    const-string v3, "com.google.android.gms.googlecertificates"

    invoke-static {v1, v2, v3}, Lh6/e;->c(Landroid/content/Context;Ll4/d;Ljava/lang/String;)Lh6/e;

    move-result-object v1

    const-string v2, "com.google.android.gms.common.GoogleCertificatesImpl"

    invoke-virtual {v1, v2}, Lh6/e;->b(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    sget v2, Lcom/google/android/gms/common/internal/e0;->a:I

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const-string v2, "com.google.android.gms.common.internal.IGoogleCertificatesApi"

    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v3

    instance-of v4, v3, Lcom/google/android/gms/common/internal/f0;

    if-eqz v4, :cond_2

    move-object v1, v3

    check-cast v1, Lcom/google/android/gms/common/internal/f0;

    goto :goto_0

    :cond_2
    new-instance v3, Lcom/google/android/gms/common/internal/d0;

    invoke-direct {v3, v1, v2}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    move-object v1, v3

    :goto_0
    sput-object v1, Lz5/u;->c:Lcom/google/android/gms/common/internal/f0;

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
