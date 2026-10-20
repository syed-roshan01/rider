.class public final Lj4/g;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Lj4/l;

.field public b:I

.field public final synthetic c:Lj4/l;


# direct methods
.method public constructor <init>(Lj4/l;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lj4/g;->c:Lj4/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 1

    new-instance p1, Lj4/g;

    iget-object v0, p0, Lj4/g;->c:Lj4/l;

    invoke-direct {p1, v0, p2}, Lj4/g;-><init>(Lj4/l;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls4/j;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lj4/g;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lj4/g;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lj4/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lj4/g;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lj4/g;->a:Lj4/l;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lj4/g;->c:Lj4/l;

    iget-object v1, p1, Lj4/l;->A:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li4/i;

    iget-object v4, p1, Lj4/l;->z:Lm0/n1;

    invoke-virtual {v4}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls4/j;

    invoke-static {v4}, Ls4/j;->a(Ls4/j;)Ls4/h;

    move-result-object v5

    new-instance v6, Lj4/j;

    invoke-direct {v6, p1}, Lj4/j;-><init>(Lj4/l;)V

    iput-object v6, v5, Ls4/h;->d:Lu4/a;

    iput-object v2, v5, Ls4/h;->M:Landroidx/lifecycle/r;

    iput-object v2, v5, Ls4/h;->N:Lt4/g;

    iput-object v2, v5, Ls4/h;->O:Lt4/e;

    iget-object v4, v4, Ls4/j;->L:Ls4/d;

    iget-object v6, v4, Ls4/d;->b:Lt4/g;

    if-nez v6, :cond_2

    new-instance v6, Lj4/j;

    invoke-direct {v6, p1}, Lj4/j;-><init>(Lj4/l;)V

    iput-object v6, v5, Ls4/h;->K:Lt4/g;

    iput-object v2, v5, Ls4/h;->M:Landroidx/lifecycle/r;

    iput-object v2, v5, Ls4/h;->N:Lt4/g;

    iput-object v2, v5, Ls4/h;->O:Lt4/e;

    :cond_2
    iget-object v6, v4, Ls4/d;->c:Lt4/e;

    if-nez v6, :cond_5

    iget-object v6, p1, Lj4/l;->v:Lr1/l;

    sget v7, Lj4/p;->a:I

    sget-object v7, Lr1/k;->b:Lx9/v;

    invoke-static {v6, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    :cond_3
    sget-object v7, Lr1/k;->d:Lx9/v;

    invoke-static {v6, v7}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    :goto_0
    sget-object v6, Lt4/e;->b:Lt4/e;

    goto :goto_1

    :cond_4
    sget-object v6, Lt4/e;->a:Lt4/e;

    :goto_1
    iput-object v6, v5, Ls4/h;->L:Lt4/e;

    :cond_5
    sget-object v6, Lt4/d;->a:Lt4/d;

    iget-object v4, v4, Ls4/d;->i:Lt4/d;

    if-eq v4, v6, :cond_6

    sget-object v4, Lt4/d;->b:Lt4/d;

    iput-object v4, v5, Ls4/h;->j:Lt4/d;

    :cond_6
    invoke-virtual {v5}, Ls4/h;->a()Ls4/j;

    move-result-object v4

    iput-object p1, p0, Lj4/g;->a:Lj4/l;

    iput v3, p0, Lj4/g;->b:I

    check-cast v1, Li4/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Li4/k;

    invoke-direct {v3, v1, v4, v2}, Li4/k;-><init>(Li4/o;Ls4/j;Lu8/e;)V

    invoke-static {v3, p0}, Ld7/a;->q(Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    return-object v0

    :cond_7
    move-object v0, p1

    move-object p1, v1

    :goto_2
    check-cast p1, Ls4/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, p1, Ls4/q;

    if-eqz v1, :cond_8

    new-instance v1, Lj4/e;

    check-cast p1, Ls4/q;

    iget-object v2, p1, Ls4/q;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Lj4/l;->j(Landroid/graphics/drawable/Drawable;)Lh1/c;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lj4/e;-><init>(Lh1/c;Ls4/q;)V

    goto :goto_3

    :cond_8
    instance-of v1, p1, Ls4/e;

    if-eqz v1, :cond_a

    new-instance v1, Lj4/c;

    invoke-virtual {p1}, Ls4/k;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v0, v3}, Lj4/l;->j(Landroid/graphics/drawable/Drawable;)Lh1/c;

    move-result-object v2

    :cond_9
    check-cast p1, Ls4/e;

    invoke-direct {v1, v2, p1}, Lj4/c;-><init>(Lh1/c;Ls4/e;)V

    :goto_3
    return-object v1

    :cond_a
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method
