.class public final Lcom/google/android/gms/internal/base/zad;
.super Ljava/lang/Object;


# static fields
.field public static final zaa:Lz5/d;

.field public static final zab:[Lz5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lz5/d;

    const-string v1, "CLIENT_TELEMETRY"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lz5/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lcom/google/android/gms/internal/base/zad;->zaa:Lz5/d;

    filled-new-array {v0}, [Lz5/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/base/zad;->zab:[Lz5/d;

    return-void
.end method
