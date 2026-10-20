.class public final Lw0/w;
.super Lw0/i0;


# instance fields
.field public c:Lp0/f;

.field public d:I


# direct methods
.method public constructor <init>(Lp0/f;)V
    .locals 0

    invoke-direct {p0}, Lw0/i0;-><init>()V

    iput-object p1, p0, Lw0/w;->c:Lp0/f;

    return-void
.end method


# virtual methods
.method public final a(Lw0/i0;)V
    .locals 2

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lw0/w;

    sget-object v0, Lw0/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p1, Lw0/w;->c:Lp0/f;

    iput-object v1, p0, Lw0/w;->c:Lp0/f;

    iget p1, p1, Lw0/w;->d:I

    iput p1, p0, Lw0/w;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b()Lw0/i0;
    .locals 2

    new-instance v0, Lw0/w;

    iget-object v1, p0, Lw0/w;->c:Lp0/f;

    invoke-direct {v0, v1}, Lw0/w;-><init>(Lp0/f;)V

    return-object v0
.end method
