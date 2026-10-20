.class public final Lw0/t;
.super Lw0/i0;


# instance fields
.field public c:Lp0/d;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Lp0/d;)V
    .locals 0

    invoke-direct {p0}, Lw0/i0;-><init>()V

    iput-object p1, p0, Lw0/t;->c:Lp0/d;

    return-void
.end method


# virtual methods
.method public final a(Lw0/i0;)V
    .locals 2

    sget-object v0, Lw0/v;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>"

    invoke-static {p1, v1}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lw0/t;

    iget-object v1, v1, Lw0/t;->c:Lp0/d;

    iput-object v1, p0, Lw0/t;->c:Lp0/d;

    move-object v1, p1

    check-cast v1, Lw0/t;

    iget v1, v1, Lw0/t;->d:I

    iput v1, p0, Lw0/t;->d:I

    check-cast p1, Lw0/t;

    iget p1, p1, Lw0/t;->e:I

    iput p1, p0, Lw0/t;->e:I
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

    new-instance v0, Lw0/t;

    iget-object v1, p0, Lw0/t;->c:Lp0/d;

    invoke-direct {v0, v1}, Lw0/t;-><init>(Lp0/d;)V

    return-object v0
.end method
