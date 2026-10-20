.class public final Ls/c0;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Ls/c0;->a:I

    iput-object p1, p0, Ls/c0;->b:Ljava/lang/Object;

    iput-object p2, p0, Ls/c0;->c:Ljava/lang/Object;

    iput-object p3, p0, Ls/c0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp9/g;Lu8/j;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Ls/c0;->a:I

    iput-object p2, p0, Ls/c0;->b:Ljava/lang/Object;

    .line 3
    invoke-static {p2}, Lr9/a;->s(Lu8/j;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, Ls/c0;->c:Ljava/lang/Object;

    .line 4
    new-instance p2, Lq9/a0;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lq9/a0;-><init>(Lp9/g;Lu8/e;)V

    iput-object p2, p0, Ls/c0;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Ls/c0;->a:I

    iget-object v2, p0, Ls/c0;->c:Ljava/lang/Object;

    iget-object v3, p0, Ls/c0;->d:Ljava/lang/Object;

    iget-object v4, p0, Ls/c0;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v4, Lu8/j;

    check-cast v3, Lc9/e;

    invoke-static {v4, p1, v2, v3, p2}, Lz6/a;->v0(Lu8/j;Ljava/lang/Object;Ljava/lang/Object;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    move-object v0, p1

    :cond_0
    return-object v0

    :pswitch_0
    instance-of v1, p2, Lp9/d;

    if-eqz v1, :cond_1

    move-object v1, p2

    check-cast v1, Lp9/d;

    iget v5, v1, Lp9/d;->c:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_1

    sub-int/2addr v5, v6

    iput v5, v1, Lp9/d;->c:I

    goto :goto_0

    :cond_1
    new-instance v1, Lp9/d;

    invoke-direct {v1, p0, p2}, Lp9/d;-><init>(Ls/c0;Lu8/e;)V

    :goto_0
    iget-object p2, v1, Lp9/d;->a:Ljava/lang/Object;

    sget-object v5, Lv8/a;->a:Lv8/a;

    iget v6, v1, Lp9/d;->c:I

    const/4 v7, 0x1

    if-eqz v6, :cond_3

    if-ne v6, v7, :cond_2

    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    check-cast v4, Lp9/e;

    iget-object p2, v4, Lp9/e;->b:Lc9/c;

    invoke-interface {p2, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast v2, Ld9/u;

    iget-object v6, v2, Ld9/u;->a:Ljava/lang/Object;

    sget-object v8, Lq9/c;->b:Li3/u;

    if-eq v6, v8, :cond_4

    iget-object v4, v4, Lp9/e;->c:Lc9/e;

    invoke-interface {v4, v6, p2}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    iput-object p2, v2, Ld9/u;->a:Ljava/lang/Object;

    check-cast v3, Lp9/g;

    iput v7, v1, Lp9/d;->c:I

    invoke-interface {v3, p1, v1}, Lp9/g;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v5, :cond_5

    move-object v0, v5

    :cond_5
    :goto_1
    return-object v0

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast v4, Lm0/t1;

    if-eqz p1, :cond_6

    check-cast v3, Lm0/l3;

    invoke-interface {v3}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc9/e;

    check-cast v2, Lt/u1;

    invoke-virtual {v2}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object p2

    iget-object v1, v2, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, p2, v1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_2

    :cond_6
    const/4 p1, 0x0

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v4, p1}, Lm0/t1;->setValue(Ljava/lang/Object;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
