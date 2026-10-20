.class public final Lcom/google/android/gms/common/api/h;
.super Ljava/lang/Object;


# static fields
.field public static final c:Lcom/google/android/gms/common/api/h;


# instance fields
.field public final a:Lcom/google/android/gms/common/api/internal/r;

.field public final b:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll4/d;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Ll4/d;-><init>(I)V

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/common/api/h;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/common/api/h;-><init>(Lcom/google/android/gms/common/api/internal/r;Landroid/os/Looper;)V

    sput-object v2, Lcom/google/android/gms/common/api/h;->c:Lcom/google/android/gms/common/api/h;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/internal/r;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/h;->a:Lcom/google/android/gms/common/api/internal/r;

    iput-object p2, p0, Lcom/google/android/gms/common/api/h;->b:Landroid/os/Looper;

    return-void
.end method
