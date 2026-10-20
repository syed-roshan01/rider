.class public final Lm0/r2;
.super Lw0/i0;


# instance fields
.field public c:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Lw0/i0;-><init>()V

    iput p1, p0, Lm0/r2;->c:F

    return-void
.end method


# virtual methods
.method public final a(Lw0/i0;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm0/r2;

    iget p1, p1, Lm0/r2;->c:F

    iput p1, p0, Lm0/r2;->c:F

    return-void
.end method

.method public final b()Lw0/i0;
    .locals 2

    new-instance v0, Lm0/r2;

    iget v1, p0, Lm0/r2;->c:F

    invoke-direct {v0, v1}, Lm0/r2;-><init>(F)V

    return-object v0
.end method
