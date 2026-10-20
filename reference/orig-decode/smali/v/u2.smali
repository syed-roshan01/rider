.class public final Lv/u2;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lo1/z;

.field public final synthetic d:Lc9/f;

.field public final synthetic e:Lc9/c;

.field public final synthetic f:Lv/l1;


# direct methods
.method public constructor <init>(Lo1/z;Lc9/f;Lc9/c;Lv/l1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/u2;->c:Lo1/z;

    iput-object p2, p0, Lv/u2;->d:Lc9/f;

    iput-object p3, p0, Lv/u2;->e:Lc9/c;

    iput-object p4, p0, Lv/u2;->f:Lv/l1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 7

    new-instance v6, Lv/u2;

    iget-object v1, p0, Lv/u2;->c:Lo1/z;

    iget-object v2, p0, Lv/u2;->d:Lc9/f;

    iget-object v3, p0, Lv/u2;->e:Lc9/c;

    iget-object v4, p0, Lv/u2;->f:Lv/l1;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lv/u2;-><init>(Lo1/z;Lc9/f;Lc9/c;Lv/l1;Lu8/e;)V

    iput-object p1, v6, Lv/u2;->b:Ljava/lang/Object;

    return-object v6
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/d0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lv/u2;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lv/u2;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lv/u2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lv/u2;->a:I

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

    iget-object p1, p0, Lv/u2;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lm9/d0;

    new-instance p1, Lv/t2;

    iget-object v5, p0, Lv/u2;->d:Lc9/f;

    iget-object v6, p0, Lv/u2;->e:Lc9/c;

    iget-object v7, p0, Lv/u2;->f:Lv/l1;

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Lv/t2;-><init>(Lm9/d0;Lc9/f;Lc9/c;Lv/l1;Lu8/e;)V

    iput v2, p0, Lv/u2;->a:I

    iget-object v1, p0, Lv/u2;->c:Lo1/z;

    invoke-static {v1, p1, p0}, Lm9/e0;->q(Lo1/z;Lc9/e;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
