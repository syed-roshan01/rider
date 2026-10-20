.class public final Lm0/x2;
.super Lw0/i0;


# instance fields
.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lw0/i0;-><init>()V

    iput-object p1, p0, Lm0/x2;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lw0/i0;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm0/x2;

    iget-object p1, p1, Lm0/x2;->c:Ljava/lang/Object;

    iput-object p1, p0, Lm0/x2;->c:Ljava/lang/Object;

    return-void
.end method

.method public final b()Lw0/i0;
    .locals 2

    new-instance v0, Lm0/x2;

    iget-object v1, p0, Lm0/x2;->c:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lm0/x2;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
