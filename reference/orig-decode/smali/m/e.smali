.class public final Lm/e;
.super Lo7/d0;


# instance fields
.field public final x:Ljava/lang/Object;

.field public final y:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm/c;

    invoke-direct {v0, p0}, Lm/c;-><init>(Lm/e;)V

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lm/e;->y:Ljava/util/concurrent/ExecutorService;

    return-void
.end method
