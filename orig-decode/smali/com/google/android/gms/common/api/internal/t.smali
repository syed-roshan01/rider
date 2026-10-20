.class public abstract Lcom/google/android/gms/common/api/internal/t;
.super Ljava/lang/Object;


# instance fields
.field public final a:[Lz5/d;

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>([Lz5/d;ZI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/t;->a:[Lz5/d;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/gms/common/api/internal/t;->b:Z

    iput p3, p0, Lcom/google/android/gms/common/api/internal/t;->c:I

    return-void
.end method

.method public static a()Lcom/google/android/gms/common/api/internal/s;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/internal/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/google/android/gms/common/api/internal/s;->a:Z

    const/4 v1, 0x0

    iput v1, v0, Lcom/google/android/gms/common/api/internal/s;->b:I

    return-object v0
.end method
