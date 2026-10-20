.class public final synthetic Lcom/google/android/play/core/integrity/aa;
.super Ljava/lang/Object;

# interfaces
.implements Lp6/b0;


# static fields
.field public static final synthetic a:Lcom/google/android/play/core/integrity/aa;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/play/core/integrity/aa;

    invoke-direct {v0}, Lcom/google/android/play/core/integrity/aa;-><init>()V

    sput-object v0, Lcom/google/android/play/core/integrity/aa;->a:Lcom/google/android/play/core/integrity/aa;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 3

    sget v0, Lp6/r;->d:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.play.core.integrity.protocol.IIntegrityService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    instance-of v2, v1, Lp6/s;

    if-eqz v2, :cond_1

    move-object p1, v1

    check-cast p1, Lp6/s;

    goto :goto_0

    :cond_1
    new-instance v1, Lp6/q;

    invoke-direct {v1, p1, v0}, Lp6/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    move-object p1, v1

    :goto_0
    return-object p1
.end method
