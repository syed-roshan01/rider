.class public final Lo2/h;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lo2/r;


# direct methods
.method public constructor <init>(Lo2/r;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lo2/h;->c:Lo2/r;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lo2/h;

    iget-object v1, p0, Lo2/h;->c:Lo2/r;

    invoke-direct {v0, v1, p2}, Lo2/h;-><init>(Lo2/r;Lu8/e;)V

    iput-object p1, v0, Lo2/h;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lo2/h;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lo2/h;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lo2/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lo2/h;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lo2/h;->b:Ljava/lang/Object;

    check-cast v1, Lm9/d0;

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

    iget-object p1, p0, Lo2/h;->b:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    move-object v1, p1

    move-object p1, p0

    :cond_2
    :goto_0
    invoke-static {v1}, Ld7/a;->x(Lm9/d0;)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v3, Lo2/b;->c:Lo2/b;

    iput-object v1, p1, Lo2/h;->b:Ljava/lang/Object;

    iput v2, p1, Lo2/h;->a:I

    invoke-interface {p1}, Lu8/e;->getContext()Lu8/j;

    move-result-object v4

    sget-object v5, Lu1/c2;->a:Lu1/c2;

    invoke-interface {v4, v5}, Lu8/j;->f(Lu8/i;)Lu8/h;

    move-result-object v4

    invoke-static {v4}, Lt/k;->d(Lu8/h;)V

    invoke-interface {p1}, Lu8/e;->getContext()Lu8/j;

    move-result-object v4

    invoke-static {v4}, Ld9/i;->p(Lu8/j;)Lm0/a1;

    move-result-object v4

    invoke-interface {v4, v3, p1}, Lm0/a1;->T(Lc9/c;Lu8/e;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    iget-object v3, p1, Lo2/h;->c:Lo2/r;

    iget-object v4, v3, Lo2/r;->G:[I

    const/4 v5, 0x0

    aget v6, v4, v5

    aget v7, v4, v2

    iget-object v8, v3, Lo2/r;->s:Landroid/view/View;

    invoke-virtual {v8, v4}, Landroid/view/View;->getLocationOnScreen([I)V

    aget v5, v4, v5

    if-ne v6, v5, :cond_4

    aget v4, v4, v2

    if-eq v7, v4, :cond_2

    :cond_4
    invoke-virtual {v3}, Lo2/r;->j()V

    goto :goto_0

    :cond_5
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
