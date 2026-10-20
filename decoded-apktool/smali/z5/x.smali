.class public final Lz5/x;
.super La6/a;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lz5/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lz5/q;

.field public final c:Z

.field public final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz5/n;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lz5/n;-><init>(I)V

    sput-object v0, Lz5/x;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/IBinder;ZZ)V
    .locals 5

    const-string v0, "Could not unwrap certificate"

    const-string v1, "GoogleCertificatesQuery"

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/x;->a:Ljava/lang/String;

    const/4 p1, 0x0

    if-nez p2, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    :try_start_0
    sget v2, Lcom/google/android/gms/common/internal/u0;->a:I

    const-string v2, "com.google.android.gms.common.internal.ICertData"

    .line 3
    invoke-interface {p2, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v3

    .line 4
    instance-of v4, v3, Lcom/google/android/gms/common/internal/v0;

    if-eqz v4, :cond_1

    .line 5
    check-cast v3, Lcom/google/android/gms/common/internal/v0;

    goto :goto_0

    :cond_1
    new-instance v3, Lcom/google/android/gms/common/internal/t0;

    .line 6
    invoke-direct {v3, p2, v2}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 7
    :goto_0
    invoke-interface {v3}, Lcom/google/android/gms/common/internal/v0;->zzd()Lg6/a;

    move-result-object p2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p2, :cond_2

    move-object p2, p1

    goto :goto_1

    .line 8
    :cond_2
    invoke-static {p2}, Lg6/b;->b(Lg6/a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    :goto_1
    if-eqz p2, :cond_3

    .line 9
    new-instance p1, Lz5/r;

    .line 10
    invoke-direct {p1, p2}, Lz5/r;-><init>([B)V

    goto :goto_2

    .line 11
    :cond_3
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :catch_0
    move-exception p2

    .line 12
    invoke-static {v1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    iput-object p1, p0, Lz5/x;->b:Lz5/q;

    iput-boolean p3, p0, Lz5/x;->c:Z

    iput-boolean p4, p0, Lz5/x;->d:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lz5/q;ZZ)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/x;->a:Ljava/lang/String;

    iput-object p2, p0, Lz5/x;->b:Lz5/q;

    iput-boolean p3, p0, Lz5/x;->c:Z

    iput-boolean p4, p0, Lz5/x;->d:Z

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const/16 p2, 0x4f45

    invoke-static {p2, p1}, Ly3/e;->Y0(ILandroid/os/Parcel;)I

    move-result p2

    const/4 v0, 0x1

    iget-object v1, p0, Lz5/x;->a:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Ly3/e;->T0(Landroid/os/Parcel;ILjava/lang/String;)V

    iget-object v0, p0, Lz5/x;->b:Lz5/q;

    if-nez v0, :cond_0

    const-string v0, "GoogleCertificatesQuery"

    const-string v1, "certificate binder is null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    :cond_0
    const/4 v1, 0x2

    invoke-static {p1, v1, v0}, Ly3/e;->M0(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    const/4 v0, 0x3

    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lz5/x;->c:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p1, v1, v1}, Ly3/e;->f1(Landroid/os/Parcel;II)V

    iget-boolean v0, p0, Lz5/x;->d:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {p2, p1}, Ly3/e;->d1(ILandroid/os/Parcel;)V

    return-void
.end method
