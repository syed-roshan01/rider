.class public final Lv/h;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Ld9/u;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ld9/u;

.field public final synthetic e:Lv/j;


# direct methods
.method public constructor <init>(Ld9/u;Lv/j;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/h;->d:Ld9/u;

    iput-object p2, p0, Lv/h;->e:Lv/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3

    new-instance v0, Lv/h;

    iget-object v1, p0, Lv/h;->d:Ld9/u;

    iget-object v2, p0, Lv/h;->e:Lv/j;

    invoke-direct {v0, v1, v2, p2}, Lv/h;-><init>(Ld9/u;Lv/j;Lu8/e;)V

    iput-object p1, v0, Lv/h;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv/u0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/h;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/h;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/h;->b:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lv/h;->a:Ld9/u;

    iget-object v4, p0, Lv/h;->c:Ljava/lang/Object;

    check-cast v4, Lv/u0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v5, v1

    move-object v1, v0

    move-object v0, p0

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lv/h;->c:Ljava/lang/Object;

    check-cast v1, Lv/u0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_3

    :cond_2
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/h;->c:Ljava/lang/Object;

    check-cast p1, Lv/u0;

    move-object v1, p1

    move-object p1, p0

    :goto_0
    iget-object v4, p1, Lv/h;->d:Ld9/u;

    iget-object v4, v4, Ld9/u;->a:Ljava/lang/Object;

    instance-of v5, v4, Lv/c0;

    sget-object v6, Lq8/l;->a:Lq8/l;

    if-nez v5, :cond_7

    instance-of v5, v4, Lv/z;

    if-nez v5, :cond_7

    instance-of v5, v4, Lv/a0;

    const/4 v7, 0x0

    if-eqz v5, :cond_3

    move-object v5, v4

    check-cast v5, Lv/a0;

    goto :goto_1

    :cond_3
    move-object v5, v7

    :goto_1
    if-eqz v5, :cond_5

    const-string v5, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragDelta"

    invoke-static {v4, v5}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lv/a0;

    iput-object v1, p1, Lv/h;->c:Ljava/lang/Object;

    iput-object v7, p1, Lv/h;->a:Ld9/u;

    iput v3, p1, Lv/h;->b:I

    iget-object v5, p1, Lv/h;->e:Lv/j;

    check-cast v5, Lv/w0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v1, Lv/u0;->a:Lv/w0;

    iget-object v7, v5, Lv/w0;->M:Lv/k0;

    iget-object v5, v5, Lv/w0;->L:Lv/h1;

    sget-object v8, Lv/h1;->a:Lv/h1;

    iget-wide v9, v4, Lv/a0;->b:J

    if-ne v5, v8, :cond_4

    invoke-static {v9, v10}, Ld1/c;->e(J)F

    move-result v4

    goto :goto_2

    :cond_4
    invoke-static {v9, v10}, Ld1/c;->d(J)F

    move-result v4

    :goto_2
    invoke-interface {v7, v4}, Lv/k0;->a(F)V

    if-ne v6, v0, :cond_5

    return-object v0

    :cond_5
    :goto_3
    move-object v4, v1

    iget-object v1, p1, Lv/h;->e:Lv/j;

    iget-object v1, v1, Lv/j;->I:Lo9/c;

    iput-object v4, p1, Lv/h;->c:Ljava/lang/Object;

    iget-object v5, p1, Lv/h;->d:Ld9/u;

    iput-object v5, p1, Lv/h;->a:Ld9/u;

    iput v2, p1, Lv/h;->b:I

    invoke-virtual {v1, p1}, Lo9/c;->i(Lw8/i;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_6

    return-object v0

    :cond_6
    move-object v11, v0

    move-object v0, p1

    move-object p1, v1

    move-object v1, v11

    :goto_4
    iput-object p1, v5, Ld9/u;->a:Ljava/lang/Object;

    move-object p1, v0

    move-object v0, v1

    move-object v1, v4

    goto :goto_0

    :cond_7
    return-object v6
.end method
