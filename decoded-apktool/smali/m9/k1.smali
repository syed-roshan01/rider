.class public final Lm9/k1;
.super Lm9/l;


# instance fields
.field public final p:Lm9/p1;


# direct methods
.method public constructor <init>(Lu8/e;Lm9/p1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lm9/l;-><init>(ILu8/e;)V

    iput-object p2, p0, Lm9/k1;->p:Lm9/p1;

    return-void
.end method


# virtual methods
.method public final B()Ljava/lang/String;
    .locals 1

    const-string v0, "AwaitContinuation"

    return-object v0
.end method

.method public final r(Lm9/p1;)Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lm9/k1;->p:Lm9/p1;

    invoke-virtual {v0}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm9/m1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lm9/m1;

    invoke-virtual {v1}, Lm9/m1;->c()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, Lm9/u;

    if-eqz v1, :cond_1

    check-cast v0, Lm9/u;

    iget-object p1, v0, Lm9/u;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lm9/p1;->H()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method
