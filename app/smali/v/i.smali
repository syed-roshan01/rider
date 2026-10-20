.class public final Lv/i;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:Ld9/u;

.field public b:Ld9/u;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lv/j;


# direct methods
.method public constructor <init>(Lv/j;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/i;->e:Lv/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    new-instance v0, Lv/i;

    iget-object v1, p0, Lv/i;->e:Lv/j;

    invoke-direct {v0, v1, p2}, Lv/i;-><init>(Lv/j;Lu8/e;)V

    iput-object p1, v0, Lv/i;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/i;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/i;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/i;->c:I

    sget-object v2, Lq8/l;->a:Lq8/l;

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, p0, Lv/i;->d:Ljava/lang/Object;

    check-cast v1, Lm9/d0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_1
    iget-object v1, p0, Lv/i;->d:Ljava/lang/Object;

    check-cast v1, Lm9/d0;

    :goto_0
    :try_start_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    :goto_1
    move-object v4, p0

    goto/16 :goto_a

    :pswitch_2
    iget-object v1, p0, Lv/i;->d:Ljava/lang/Object;

    check-cast v1, Lm9/d0;

    goto :goto_0

    :goto_2
    move-object p1, v1

    goto :goto_3

    :pswitch_3
    iget-object v1, p0, Lv/i;->a:Ld9/u;

    iget-object v4, p0, Lv/i;->d:Ljava/lang/Object;

    check-cast v4, Lm9/d0;

    :try_start_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    move-object p1, v4

    move-object v4, p0

    goto/16 :goto_8

    :catch_1
    move-object v1, v4

    goto :goto_1

    :pswitch_4
    iget-object v1, p0, Lv/i;->a:Ld9/u;

    iget-object v4, p0, Lv/i;->d:Ljava/lang/Object;

    check-cast v4, Lm9/d0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v5, v4

    move-object v4, p0

    goto :goto_6

    :pswitch_5
    iget-object v1, p0, Lv/i;->b:Ld9/u;

    iget-object v4, p0, Lv/i;->a:Ld9/u;

    iget-object v5, p0, Lv/i;->d:Ljava/lang/Object;

    check-cast v5, Lm9/d0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    move-object v6, v4

    move-object v4, p0

    goto :goto_5

    :pswitch_6
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lv/i;->d:Ljava/lang/Object;

    check-cast p1, Lm9/d0;

    :goto_3
    move-object v1, p0

    :goto_4
    invoke-static {p1}, Ld7/a;->x(Lm9/d0;)Z

    move-result v4

    if-eqz v4, :cond_8

    new-instance v4, Ld9/u;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v5, v1, Lv/i;->e:Lv/j;

    iget-object v5, v5, Lv/j;->I:Lo9/c;

    iput-object p1, v1, Lv/i;->d:Ljava/lang/Object;

    iput-object v4, v1, Lv/i;->a:Ld9/u;

    iput-object v4, v1, Lv/i;->b:Ld9/u;

    const/4 v6, 0x1

    iput v6, v1, Lv/i;->c:I

    invoke-virtual {v5, v1}, Lo9/c;->i(Lw8/i;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_0

    return-object v0

    :cond_0
    move-object v6, v4

    move-object v4, v1

    move-object v1, v6

    move-object v9, v5

    move-object v5, p1

    move-object p1, v9

    :goto_5
    iput-object p1, v1, Ld9/u;->a:Ljava/lang/Object;

    iget-object p1, v6, Ld9/u;->a:Ljava/lang/Object;

    instance-of v1, p1, Lv/b0;

    if-eqz v1, :cond_7

    check-cast p1, Lv/b0;

    iput-object v5, v4, Lv/i;->d:Ljava/lang/Object;

    iput-object v6, v4, Lv/i;->a:Ld9/u;

    iput-object v3, v4, Lv/i;->b:Ld9/u;

    const/4 v1, 0x2

    iput v1, v4, Lv/i;->c:I

    iget-object v1, v4, Lv/i;->e:Lv/j;

    invoke-static {v1, v5, p1, v4}, Lv/j;->I0(Lv/j;Lm9/d0;Lv/b0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    move-object v1, v6

    :goto_6
    :try_start_2
    iget-object p1, v4, Lv/i;->e:Lv/j;

    new-instance v6, Lv/h;

    invoke-direct {v6, v1, p1, v3}, Lv/h;-><init>(Ld9/u;Lv/j;Lu8/e;)V

    iput-object v5, v4, Lv/i;->d:Ljava/lang/Object;

    iput-object v1, v4, Lv/i;->a:Ld9/u;

    const/4 v7, 0x3

    iput v7, v4, Lv/i;->c:I

    check-cast p1, Lv/w0;

    iget-object v7, p1, Lv/w0;->K:Lv/x0;

    new-instance v8, Lv/v0;

    invoke-direct {v8, p1, v6, v3}, Lv/v0;-><init>(Lv/w0;Lc9/e;Lu8/e;)V

    invoke-interface {v7, v8, v4}, Lv/x0;->b(Lv/v0;Lv/i;)Ljava/lang/Object;

    move-result-object p1

    sget-object v6, Lv8/a;->a:Lv8/a;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3

    if-ne p1, v6, :cond_2

    goto :goto_7

    :cond_2
    move-object p1, v2

    :goto_7
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    move-object p1, v5

    :goto_8
    :try_start_3
    iget-object v1, v1, Ld9/u;->a:Ljava/lang/Object;

    instance-of v5, v1, Lv/c0;

    if-eqz v5, :cond_4

    iget-object v5, v4, Lv/i;->e:Lv/j;

    const-string v6, "null cannot be cast to non-null type androidx.compose.foundation.gestures.DragEvent.DragStopped"

    invoke-static {v1, v6}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lv/c0;

    iput-object p1, v4, Lv/i;->d:Ljava/lang/Object;

    iput-object v3, v4, Lv/i;->a:Ld9/u;

    const/4 v6, 0x4

    iput v6, v4, Lv/i;->c:I

    invoke-static {v5, p1, v1, v4}, Lv/j;->J0(Lv/j;Lm9/d0;Lv/c0;Lu8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    return-object v0

    :catch_2
    move-object v1, p1

    goto :goto_a

    :cond_4
    instance-of v1, v1, Lv/z;

    if-eqz v1, :cond_5

    iget-object v1, v4, Lv/i;->e:Lv/j;

    iput-object p1, v4, Lv/i;->d:Ljava/lang/Object;

    iput-object v3, v4, Lv/i;->a:Ld9/u;

    const/4 v5, 0x5

    iput v5, v4, Lv/i;->c:I

    invoke-static {v1, v4, p1}, Lv/j;->H0(Lv/j;Lu8/e;Lm9/d0;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_2

    if-ne v1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_9
    move-object v1, v4

    goto/16 :goto_4

    :catch_3
    move-object v1, v5

    :goto_a
    iput-object v1, v4, Lv/i;->d:Ljava/lang/Object;

    iput-object v3, v4, Lv/i;->a:Ld9/u;

    const/4 p1, 0x6

    iput p1, v4, Lv/i;->c:I

    iget-object p1, v4, Lv/i;->e:Lv/j;

    invoke-static {p1, v4, v1}, Lv/j;->H0(Lv/j;Lu8/e;Lm9/d0;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    move-object p1, v1

    goto :goto_9

    :cond_7
    move-object v1, v4

    move-object p1, v5

    goto/16 :goto_4

    :cond_8
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
