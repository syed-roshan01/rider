.class public final Ln4/d;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public final synthetic b:Ln4/i;

.field public final synthetic c:Ld9/u;

.field public final synthetic d:Ld9/u;

.field public final synthetic e:Ls4/j;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic n:Ld9/u;

.field public final synthetic o:Li4/e;


# direct methods
.method public constructor <init>(Ln4/i;Ld9/u;Ld9/u;Ls4/j;Ljava/lang/Object;Ld9/u;Li4/e;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Ln4/d;->b:Ln4/i;

    iput-object p2, p0, Ln4/d;->c:Ld9/u;

    iput-object p3, p0, Ln4/d;->d:Ld9/u;

    iput-object p4, p0, Ln4/d;->e:Ls4/j;

    iput-object p5, p0, Ln4/d;->f:Ljava/lang/Object;

    iput-object p6, p0, Ln4/d;->n:Ld9/u;

    iput-object p7, p0, Ln4/d;->o:Li4/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 9

    new-instance p1, Ln4/d;

    iget-object v1, p0, Ln4/d;->b:Ln4/i;

    iget-object v2, p0, Ln4/d;->c:Ld9/u;

    iget-object v3, p0, Ln4/d;->d:Ld9/u;

    iget-object v4, p0, Ln4/d;->e:Ls4/j;

    iget-object v5, p0, Ln4/d;->f:Ljava/lang/Object;

    iget-object v6, p0, Ln4/d;->n:Ld9/u;

    iget-object v7, p0, Ln4/d;->o:Li4/e;

    move-object v0, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Ln4/d;-><init>(Ln4/i;Ld9/u;Ld9/u;Ls4/j;Ljava/lang/Object;Ld9/u;Li4/e;Lu8/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Ln4/d;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Ln4/d;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Ln4/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Ln4/d;->a:I

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

    iget-object v1, p0, Ln4/d;->b:Ln4/i;

    iget-object p1, p0, Ln4/d;->c:Ld9/u;

    iget-object p1, p1, Ld9/u;->a:Ljava/lang/Object;

    check-cast p1, Lm4/n;

    iget-object v3, p0, Ln4/d;->d:Ld9/u;

    iget-object v3, v3, Ld9/u;->a:Ljava/lang/Object;

    check-cast v3, Li4/c;

    iget-object v4, p0, Ln4/d;->e:Ls4/j;

    iget-object v5, p0, Ln4/d;->f:Ljava/lang/Object;

    iget-object v6, p0, Ln4/d;->n:Ld9/u;

    iget-object v6, v6, Ld9/u;->a:Ljava/lang/Object;

    check-cast v6, Ls4/n;

    iget-object v7, p0, Ln4/d;->o:Li4/e;

    iput v2, p0, Ln4/d;->a:I

    move-object v2, p1

    move-object v8, p0

    invoke-static/range {v1 .. v8}, Ln4/i;->a(Ln4/i;Lm4/n;Li4/c;Ls4/j;Ljava/lang/Object;Ls4/n;Li4/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method
