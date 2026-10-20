.class public final Lm9/g;
.super Lm9/a;


# instance fields
.field public final d:Ljava/lang/Thread;

.field public final e:Lm9/w0;


# direct methods
.method public constructor <init>(Lu8/j;Ljava/lang/Thread;Lm9/w0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lm9/a;-><init>(Lu8/j;Z)V

    iput-object p2, p0, Lm9/g;->d:Ljava/lang/Thread;

    iput-object p3, p0, Lm9/g;->e:Lm9/w0;

    return-void
.end method


# virtual methods
.method public final t(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v0, p0, Lm9/g;->d:Ljava/lang/Thread;

    invoke-static {p1, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
