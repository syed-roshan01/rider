.class public final Lp9/c;
.super Lq9/g;


# instance fields
.field public final d:Lc9/e;

.field public final e:Lc9/e;


# direct methods
.method public constructor <init>(Lc9/e;Lu8/j;ILo9/a;)V
    .locals 0

    invoke-direct {p0, p2, p3, p4}, Lq9/g;-><init>(Lu8/j;ILo9/a;)V

    iput-object p1, p0, Lp9/c;->d:Lc9/e;

    iput-object p1, p0, Lp9/c;->e:Lc9/e;

    return-void
.end method


# virtual methods
.method public final c(Lo9/r;Lu8/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lp9/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp9/b;

    iget v1, v0, Lp9/b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp9/b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp9/b;

    invoke-direct {v0, p0, p2}, Lp9/b;-><init>(Lp9/c;Lu8/e;)V

    :goto_0
    iget-object p2, v0, Lp9/b;->b:Ljava/lang/Object;

    sget-object v1, Lv8/a;->a:Lv8/a;

    iget v2, v0, Lp9/b;->d:I

    sget-object v3, Lq8/l;->a:Lq8/l;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lp9/b;->a:Lo9/r;

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    iput-object p1, v0, Lp9/b;->a:Lo9/r;

    iput v4, v0, Lp9/b;->d:I

    iget-object p2, p0, Lp9/c;->d:Lc9/e;

    invoke-interface {p2, p1, v0}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    goto :goto_1

    :cond_3
    move-object p2, v3

    :goto_1
    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p1, Lo9/q;

    iget-object p1, p1, Lo9/q;->d:Lo9/g;

    invoke-interface {p1}, Lo9/t;->r()Z

    move-result p1

    if-eqz p1, :cond_5

    return-object v3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Lu8/j;ILo9/a;)Lq9/g;
    .locals 2

    new-instance v0, Lp9/c;

    iget-object v1, p0, Lp9/c;->e:Lc9/e;

    invoke-direct {v0, v1, p1, p2, p3}, Lp9/c;-><init>(Lc9/e;Lu8/j;ILo9/a;)V

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "block["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lp9/c;->d:Lc9/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lq9/g;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lp9/c;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
