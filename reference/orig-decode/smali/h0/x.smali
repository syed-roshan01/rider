.class public final Lh0/x;
.super Lw8/h;

# interfaces
.implements Lc9/e;


# instance fields
.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lh0/l;

.field public final synthetic e:Lh0/i;

.field public final synthetic f:Lf0/k1;


# direct methods
.method public constructor <init>(Lh0/l;Lh0/i;Lf0/k1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lh0/x;->d:Lh0/l;

    iput-object p2, p0, Lh0/x;->e:Lh0/i;

    iput-object p3, p0, Lh0/x;->f:Lf0/k1;

    invoke-direct {p0, p4}, Lw8/h;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 4

    new-instance v0, Lh0/x;

    iget-object v1, p0, Lh0/x;->e:Lh0/i;

    iget-object v2, p0, Lh0/x;->f:Lf0/k1;

    iget-object v3, p0, Lh0/x;->d:Lh0/l;

    invoke-direct {v0, v3, v1, v2, p2}, Lh0/x;-><init>(Lh0/l;Lh0/i;Lf0/k1;Lu8/e;)V

    iput-object p1, v0, Lh0/x;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo1/h0;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lh0/x;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lh0/x;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lh0/x;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lh0/x;->b:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_4

    :cond_2
    iget-object v1, p0, Lh0/x;->c:Ljava/lang/Object;

    check-cast v1, Lo1/h0;

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/x;->c:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lo1/h0;

    iput-object v1, p0, Lh0/x;->c:Ljava/lang/Object;

    iput v4, p0, Lh0/x;->b:I

    invoke-static {v1, p0}, Ld9/i;->h(Lo1/h0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p1, Lo1/k;

    invoke-static {p1}, Ld9/i;->t(Lo1/k;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_7

    iget v5, p1, Lo1/k;->b:I

    and-int/lit8 v5, v5, 0x21

    if-eqz v5, :cond_7

    iget-object v5, p1, Lo1/k;->a:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_6

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lo1/u;

    invoke-virtual {v9}, Lo1/u;->b()Z

    move-result v9

    xor-int/2addr v9, v4

    if-nez v9, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_6
    iput-object v6, p0, Lh0/x;->c:Ljava/lang/Object;

    iput v3, p0, Lh0/x;->b:I

    iget-object v2, p0, Lh0/x;->d:Lh0/l;

    iget-object v3, p0, Lh0/x;->e:Lh0/i;

    invoke-static {v1, v2, v3, p1, p0}, Ld9/i;->j(Lo1/h0;Lh0/l;Lh0/i;Lo1/k;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_7
    :goto_3
    invoke-static {p1}, Ld9/i;->t(Lo1/k;)Z

    move-result v3

    if-nez v3, :cond_8

    iput-object v6, p0, Lh0/x;->c:Ljava/lang/Object;

    iput v2, p0, Lh0/x;->b:I

    iget-object v2, p0, Lh0/x;->f:Lf0/k1;

    invoke-static {v1, v2, p1, p0}, Ld9/i;->k(Lo1/h0;Lf0/k1;Lo1/k;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_4
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
