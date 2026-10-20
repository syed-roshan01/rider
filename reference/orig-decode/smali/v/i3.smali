.class public final Lv/i3;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lo1/z;

.field public final synthetic d:Lc9/f;

.field public final synthetic e:Lc9/c;

.field public final synthetic f:Lc9/c;

.field public final synthetic n:Lc9/c;


# direct methods
.method public constructor <init>(Lo1/z;Lu8/e;Lc9/c;Lc9/c;Lc9/c;Lc9/f;)V
    .locals 0

    iput-object p1, p0, Lv/i3;->c:Lo1/z;

    iput-object p6, p0, Lv/i3;->d:Lc9/f;

    iput-object p3, p0, Lv/i3;->e:Lc9/c;

    iput-object p4, p0, Lv/i3;->f:Lc9/c;

    iput-object p5, p0, Lv/i3;->n:Lc9/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 8

    new-instance v7, Lv/i3;

    iget-object v1, p0, Lv/i3;->c:Lo1/z;

    iget-object v6, p0, Lv/i3;->d:Lc9/f;

    iget-object v3, p0, Lv/i3;->e:Lc9/c;

    iget-object v4, p0, Lv/i3;->f:Lc9/c;

    iget-object v5, p0, Lv/i3;->n:Lc9/c;

    move-object v0, v7

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lv/i3;-><init>(Lo1/z;Lu8/e;Lc9/c;Lc9/c;Lc9/c;Lc9/f;)V

    iput-object p1, v7, Lv/i3;->b:Ljava/lang/Object;

    return-object v7
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/i3;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/i3;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/i3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/i3;->a:I

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

    iget-object p1, p0, Lv/i3;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lm9/d0;

    new-instance v9, Lv/l1;

    iget-object p1, p0, Lv/i3;->c:Lo1/z;

    invoke-direct {v9, p1}, Lv/l1;-><init>(Lm2/b;)V

    new-instance v1, Lv/h3;

    iget-object v5, p0, Lv/i3;->d:Lc9/f;

    iget-object v6, p0, Lv/i3;->e:Lc9/c;

    iget-object v7, p0, Lv/i3;->f:Lc9/c;

    iget-object v8, p0, Lv/i3;->n:Lc9/c;

    const/4 v10, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Lv/h3;-><init>(Lm9/d0;Lc9/f;Lc9/c;Lc9/c;Lc9/c;Lv/l1;Lu8/e;)V

    iput v2, p0, Lv/i3;->a:I

    invoke-static {p1, v1, p0}, Lm9/e0;->q(Lo1/z;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
