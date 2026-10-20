.class public final Lg8/x;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/m0;


# instance fields
.field public final a:Lg8/m0;

.field public final b:Le8/f;

.field public final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lh8/h;Lg8/b3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/x;->a:Lg8/m0;

    const/4 p1, 0x0

    iput-object p1, p0, Lg8/x;->b:Le8/f;

    iput-object p2, p0, Lg8/x;->c:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final L()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lg8/x;->a:Lg8/m0;

    invoke-interface {v0}, Lg8/m0;->L()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public final a0(Ljava/net/SocketAddress;Lg8/l0;Lg8/i2;)Lg8/o0;
    .locals 2

    new-instance v0, Lg8/w;

    iget-object v1, p0, Lg8/x;->a:Lg8/m0;

    invoke-interface {v1, p1, p2, p3}, Lg8/m0;->a0(Ljava/net/SocketAddress;Lg8/l0;Lg8/i2;)Lg8/o0;

    move-result-object p1

    iget-object p2, p2, Lg8/l0;->a:Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2}, Lg8/w;-><init>(Lg8/x;Lg8/o0;Ljava/lang/String;)V

    return-object v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lg8/x;->a:Lg8/m0;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method
