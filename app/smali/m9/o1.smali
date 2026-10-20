.class public final Lm9/o1;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:Lm9/t1;

.field public c:Lr9/j;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lm9/p1;


# direct methods
.method public constructor <init>(Lu8/e;Lm9/p1;)V
    .locals 0

    iput-object p2, p0, Lm9/o1;->f:Lm9/p1;

    invoke-direct {p0, p1}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lm9/o1;

    iget-object v1, p0, Lm9/o1;->f:Lm9/p1;

    invoke-direct {v0, p2, v1}, Lm9/o1;-><init>(Lu8/e;Lm9/p1;)V

    iput-object p1, v0, Lm9/o1;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk9/j;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lm9/o1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lm9/o1;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lm9/o1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lm9/o1;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lm9/o1;->c:Lr9/j;

    iget-object v3, p0, Lm9/o1;->b:Lm9/t1;

    iget-object v4, p0, Lm9/o1;->e:Ljava/lang/Object;

    check-cast v4, Lk9/j;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lm9/o1;->e:Ljava/lang/Object;

    check-cast p1, Lk9/j;

    iget-object v1, p0, Lm9/o1;->f:Lm9/p1;

    invoke-virtual {v1}, Lm9/p1;->N()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Lm9/p;

    if-eqz v4, :cond_3

    check-cast v1, Lm9/p;

    iget-object v1, v1, Lm9/p;->e:Lm9/q;

    iput v3, p0, Lm9/o1;->d:I

    invoke-virtual {p1, v1, p0}, Lk9/j;->c(Ljava/lang/Object;Lu8/e;)V

    return-object v0

    :cond_3
    instance-of v3, v1, Lm9/b1;

    if-eqz v3, :cond_5

    check-cast v1, Lm9/b1;

    invoke-interface {v1}, Lm9/b1;->f()Lm9/t1;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lr9/j;->j()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v3, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lr9/j;

    move-object v4, p1

    move-object p1, p0

    move-object v6, v3

    move-object v3, v1

    move-object v1, v6

    :goto_0
    invoke-static {v1, v3}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    instance-of v5, v1, Lm9/p;

    if-eqz v5, :cond_4

    move-object v5, v1

    check-cast v5, Lm9/p;

    iput-object v4, p1, Lm9/o1;->e:Ljava/lang/Object;

    iput-object v3, p1, Lm9/o1;->b:Lm9/t1;

    iput-object v1, p1, Lm9/o1;->c:Lr9/j;

    iput v2, p1, Lm9/o1;->d:I

    iget-object v5, v5, Lm9/p;->e:Lm9/q;

    invoke-virtual {v4, v5, p1}, Lk9/j;->c(Ljava/lang/Object;Lu8/e;)V

    sget-object v5, Lv8/a;->a:Lv8/a;

    if-ne v5, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    invoke-virtual {v1}, Lr9/j;->k()Lr9/j;

    move-result-object v1

    goto :goto_0

    :cond_5
    :goto_2
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
