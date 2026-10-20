.class public final Lm9/r1;
.super Lm9/x1;


# instance fields
.field public final d:Lu8/e;


# direct methods
.method public constructor <init>(Lu8/j;Lc9/e;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lm9/a;-><init>(Lu8/j;Z)V

    invoke-static {p0, p0, p2}, Ld7/t;->M(Ljava/lang/Object;Lu8/e;Lc9/e;)Lu8/e;

    move-result-object p1

    iput-object p1, p0, Lm9/r1;->d:Lu8/e;

    return-void
.end method


# virtual methods
.method public final d0()V
    .locals 3

    iget-object v0, p0, Lm9/r1;->d:Lu8/e;

    :try_start_0
    invoke-static {v0}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object v0

    sget-object v1, Lq8/l;->a:Lq8/l;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lr9/a;->l(Lu8/e;Ljava/lang/Object;Lc9/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ld7/t;->N(Ljava/lang/Throwable;)Lq8/g;

    move-result-object v1

    invoke-virtual {p0, v1}, Lm9/a;->resumeWith(Ljava/lang/Object;)V

    throw v0
.end method
