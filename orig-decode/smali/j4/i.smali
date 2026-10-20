.class public final Lj4/i;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Lj4/l;


# direct methods
.method public constructor <init>(Lj4/l;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lj4/i;->b:Lj4/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 1

    new-instance p1, Lj4/i;

    iget-object v0, p0, Lj4/i;->b:Lj4/l;

    invoke-direct {p1, v0, p2}, Lj4/i;-><init>(Lj4/l;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lj4/i;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lj4/i;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lj4/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lj4/i;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    new-instance p1, Lu1/z0;

    iget-object v1, p0, Lj4/i;->b:Lj4/l;

    const/16 v3, 0x8

    invoke-direct {p1, v1, v3}, Lu1/z0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Ld7/t;->t0(Lc9/a;)La4/c0;

    move-result-object v6

    new-instance p1, Lj4/g;

    const/4 v3, 0x0

    invoke-direct {p1, v1, v3}, Lj4/g;-><init>(Lj4/l;Lu8/e;)V

    sget v4, Lp9/o;->a:I

    new-instance v5, Lp9/n;

    invoke-direct {v5, p1, v3}, Lp9/n;-><init>(Lc9/e;Lu8/e;)V

    new-instance p1, Lq9/o;

    sget-object v7, Lu8/k;->a:Lu8/k;

    const/4 v8, -0x2

    sget-object v9, Lo9/a;->a:Lo9/a;

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lq9/o;-><init>(Lc9/f;Lp9/f;Lu8/j;ILo9/a;)V

    new-instance v3, Lj4/h;

    invoke-direct {v3, v1}, Lj4/h;-><init>(Lj4/l;)V

    iput v2, p0, Lj4/i;->a:I

    invoke-virtual {p1, v3, p0}, Lq9/i;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
