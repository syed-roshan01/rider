.class public Lr9/s;
.super Lm9/a;

# interfaces
.implements Lw8/d;


# instance fields
.field public final d:Lu8/e;


# direct methods
.method public constructor <init>(Lu8/e;Lu8/j;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p2, v0}, Lm9/a;-><init>(Lu8/j;Z)V

    iput-object p1, p0, Lr9/s;->d:Lu8/e;

    return-void
.end method


# virtual methods
.method public final V()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getCallerFrame()Lw8/d;
    .locals 2

    iget-object v0, p0, Lr9/s;->d:Lu8/e;

    instance-of v1, v0, Lw8/d;

    if-eqz v1, :cond_0

    check-cast v0, Lw8/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public t(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lr9/s;->d:Lu8/e;

    invoke-static {v0}, Ld7/t;->b0(Lu8/e;)Lu8/e;

    move-result-object v0

    invoke-static {p1}, Ld7/t;->l0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lr9/a;->l(Lu8/e;Ljava/lang/Object;Lc9/c;)V

    return-void
.end method

.method public v(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lr9/s;->d:Lu8/e;

    invoke-static {p1}, Ld7/t;->l0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
