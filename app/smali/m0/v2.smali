.class public final Lm0/v2;
.super Lw0/i0;


# instance fields
.field public c:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Lw0/i0;-><init>()V

    iput-wide p1, p0, Lm0/v2;->c:J

    return-void
.end method


# virtual methods
.method public final a(Lw0/i0;)V
    .locals 2

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm0/v2;

    iget-wide v0, p1, Lm0/v2;->c:J

    iput-wide v0, p0, Lm0/v2;->c:J

    return-void
.end method

.method public final b()Lw0/i0;
    .locals 3

    new-instance v0, Lm0/v2;

    iget-wide v1, p0, Lm0/v2;->c:J

    invoke-direct {v0, v1, v2}, Lm0/v2;-><init>(J)V

    return-object v0
.end method
