.class public final Lu/y;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p7, p0, Lu/y;->a:I

    iput-object p1, p0, Lu/y;->c:Ljava/lang/Object;

    iput-boolean p2, p0, Lu/y;->b:Z

    iput-object p3, p0, Lu/y;->d:Ljava/lang/Object;

    iput-object p4, p0, Lu/y;->e:Ljava/lang/Object;

    iput-object p5, p0, Lu/y;->f:Ljava/lang/Object;

    iput-object p6, p0, Lu/y;->n:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu/y;->a:I

    iget-object v2, p0, Lu/y;->n:Ljava/lang/Object;

    iget-object v3, p0, Lu/y;->e:Ljava/lang/Object;

    iget-object v4, p0, Lu/y;->f:Ljava/lang/Object;

    iget-boolean v5, p0, Lu/y;->b:Z

    iget-object v6, p0, Lu/y;->c:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lr1/s;

    check-cast v6, Lf0/c2;

    iput-object p1, v6, Lf0/c2;->h:Lr1/s;

    invoke-virtual {v6}, Lf0/c2;->d()Lf0/d2;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, v1, Lf0/d2;->b:Lr1/s;

    :goto_0
    if-eqz v5, :cond_6

    invoke-virtual {v6}, Lf0/c2;->a()Lf0/o0;

    move-result-object p1

    sget-object v1, Lf0/o0;->b:Lf0/o0;

    const/4 v5, 0x1

    iget-object v7, v6, Lf0/c2;->o:Lm0/n1;

    const/4 v8, 0x0

    if-ne p1, v1, :cond_2

    iget-object p1, v6, Lf0/c2;->l:Lm0/n1;

    invoke-virtual {p1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    move-object p1, v3

    check-cast p1, Lh0/v0;

    invoke-virtual {p1}, Lh0/v0;->o()V

    goto :goto_1

    :cond_1
    move-object p1, v3

    check-cast p1, Lh0/v0;

    invoke-virtual {p1}, Lh0/v0;->l()V

    :goto_1
    check-cast v3, Lh0/v0;

    invoke-static {v3, v5}, Ld7/t;->c0(Lh0/v0;Z)Z

    move-result p1

    iget-object v1, v6, Lf0/c2;->m:Lm0/n1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-static {v3, v8}, Ld7/t;->c0(Lh0/v0;Z)Z

    move-result p1

    iget-object v1, v6, Lf0/c2;->n:Lm0/n1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    move-object p1, v4

    check-cast p1, Lg2/a0;

    iget-wide v9, p1, Lg2/a0;->b:J

    invoke-static {v9, v10}, La2/b0;->b(J)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v7, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v6}, Lf0/c2;->a()Lf0/o0;

    move-result-object p1

    sget-object v1, Lf0/o0;->c:Lf0/o0;

    if-ne p1, v1, :cond_3

    check-cast v3, Lh0/v0;

    invoke-static {v3, v5}, Ld7/t;->c0(Lh0/v0;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v7, p1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    :cond_3
    :goto_2
    check-cast v4, Lg2/a0;

    check-cast v2, Lg2/s;

    invoke-static {v6, v4, v2}, Ld7/t;->i0(Lf0/c2;Lg2/a0;Lg2/s;)V

    invoke-virtual {v6}, Lf0/c2;->d()Lf0/d2;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v1, v6, Lf0/c2;->e:Lg2/h0;

    if-eqz v1, :cond_6

    invoke-virtual {v6}, Lf0/c2;->b()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, p1, Lf0/d2;->b:Lr1/s;

    if-eqz v3, :cond_6

    invoke-interface {v3}, Lr1/s;->L()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    iget-object v5, p1, Lf0/d2;->c:Lr1/s;

    if-eqz v5, :cond_6

    new-instance v6, Lq/w;

    const/16 v7, 0x14

    invoke-direct {v6, v3, v7}, Lq/w;-><init>(Ljava/lang/Object;I)V

    invoke-static {v3}, Lh0/l0;->a(Lr1/s;)Ld1/d;

    move-result-object v7

    invoke-interface {v3, v5, v8}, Lr1/s;->b(Lr1/s;Z)Ld1/d;

    move-result-object v3

    iget-object v5, v1, Lg2/h0;->a:Lg2/b0;

    iget-object v5, v5, Lg2/b0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg2/h0;

    invoke-static {v5, v1}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v1, v1, Lg2/h0;->b:Lg2/v;

    check-cast v1, Lg2/e0;

    iget-object v1, v1, Lg2/e0;->l:Lg2/e;

    iput-object v4, v1, Lg2/e;->i:Lg2/a0;

    iput-object v2, v1, Lg2/e;->k:Lg2/s;

    iget-object p1, p1, Lf0/d2;->a:La2/a0;

    iput-object p1, v1, Lg2/e;->j:La2/a0;

    iput-object v6, v1, Lg2/e;->l:Lc9/c;

    iput-object v7, v1, Lg2/e;->m:Ld1/d;

    iput-object v3, v1, Lg2/e;->n:Ld1/d;

    iget-boolean p1, v1, Lg2/e;->d:Z

    if-nez p1, :cond_5

    iget-boolean p1, v1, Lg2/e;->c:Z

    if-eqz p1, :cond_6

    :cond_5
    invoke-virtual {v1}, Lg2/e;->a()V

    :cond_6
    :goto_3
    return-object v0

    :pswitch_0
    check-cast p1, Ly1/v;

    sget-object v1, Ly1/t;->a:[Lj9/f;

    sget-object v1, Ly1/r;->l:Ly1/u;

    sget-object v7, Ly1/t;->a:[Lj9/f;

    const/4 v8, 0x6

    aget-object v8, v7, v8

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1, v8}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    check-cast v6, Lc9/c;

    sget-object v1, Ly1/r;->E:Ly1/u;

    move-object v8, p1

    check-cast v8, Ly1/j;

    invoke-virtual {v8, v1, v6}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    iget-object v1, p0, Lu/y;->d:Ljava/lang/Object;

    if-eqz v5, :cond_7

    check-cast v1, Ly1/h;

    sget-object v5, Ly1/r;->p:Ly1/u;

    const/16 v6, 0x9

    aget-object v6, v7, v6

    invoke-virtual {v5, p1, v1}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    check-cast v1, Ly1/h;

    sget-object v5, Ly1/r;->o:Ly1/u;

    const/16 v6, 0x8

    aget-object v6, v7, v6

    invoke-virtual {v5, p1, v1}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    :goto_4
    check-cast v3, Lc9/e;

    const/4 v1, 0x0

    if-eqz v3, :cond_8

    sget-object v5, Ly1/i;->d:Ly1/u;

    new-instance v6, Ly1/a;

    invoke-direct {v6, v1, v3}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {v8, v5, v6}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lc9/c;

    if-eqz v4, :cond_9

    sget-object v3, Ly1/i;->e:Ly1/u;

    new-instance v5, Ly1/a;

    invoke-direct {v5, v1, v4}, Ly1/a;-><init>(Ljava/lang/String;Lq8/a;)V

    invoke-virtual {v8, v3, v5}, Ly1/j;->k(Ly1/u;Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Ly1/b;

    sget-object v1, Ly1/r;->f:Ly1/u;

    const/16 v3, 0x12

    aget-object v3, v7, v3

    invoke-virtual {v1, p1, v2}, Ly1/u;->a(Ly1/v;Ljava/lang/Object;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
