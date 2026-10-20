.class public final Ln8/e;
.super Ln8/b;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public final synthetic c:Le8/z0;


# direct methods
.method public constructor <init>(Ln8/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ln8/e;->a:I

    iput-object p1, p0, Ln8/e;->c:Le8/z0;

    return-void
.end method

.method public constructor <init>(Ln8/p;Le8/j0;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Ln8/e;->a:I

    iput-object p1, p0, Ln8/e;->c:Le8/z0;

    iput-object p2, p0, Ln8/e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final h(Le8/u0;)Le8/x0;
    .locals 5

    iget v0, p0, Ln8/e;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Ln8/e;->s()Le8/j0;

    move-result-object v0

    invoke-virtual {v0, p1}, Le8/j0;->h(Le8/u0;)Le8/x0;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, Ln8/n;

    iget-object v1, p0, Ln8/e;->c:Le8/z0;

    check-cast v1, Ln8/p;

    iget-object v2, p0, Ln8/e;->b:Ljava/lang/Object;

    check-cast v2, Le8/j0;

    invoke-virtual {v2, p1}, Le8/j0;->h(Le8/u0;)Le8/x0;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ln8/n;-><init>(Ln8/p;Le8/x0;)V

    iget-object p1, p1, Le8/u0;->b:Ljava/util/List;

    invoke-static {p1}, Ln8/p;->g(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Ln8/p;->c:Ln8/h;

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le8/g0;

    iget-object v4, v4, Le8/g0;->a:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Lr6/k;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le8/g0;

    iget-object p1, p1, Le8/g0;->a:Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, v1, Ln8/p;->c:Ln8/h;

    invoke-virtual {v1, p1}, Lr6/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/g;

    invoke-virtual {p1, v0}, Ln8/g;->a(Ln8/n;)V

    iget-object p1, p1, Ln8/g;->d:Ljava/lang/Long;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Ln8/n;->j()V

    :cond_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Le8/x;Lz6/a;)V
    .locals 5

    iget v0, p0, Ln8/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln8/e;->b:Ljava/lang/Object;

    check-cast v0, Le8/j0;

    new-instance v1, Ln8/c;

    invoke-direct {v1, p2}, Ln8/c;-><init>(Lz6/a;)V

    invoke-virtual {v0, p1, v1}, Le8/j0;->r(Le8/x;Lz6/a;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ln8/e;->b:Ljava/lang/Object;

    check-cast v0, Le8/z0;

    iget-object v1, p0, Ln8/e;->c:Le8/z0;

    check-cast v1, Ln8/f;

    iget-object v2, v1, Ln8/f;->h:Le8/z0;

    sget-object v3, Le8/x;->b:Le8/x;

    if-ne v0, v2, :cond_0

    iget-boolean v0, v1, Ln8/f;->k:Z

    const-string v2, "there\'s pending lb while current lb has been out of READY"

    invoke-static {v2, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iput-object p1, v1, Ln8/f;->i:Le8/x;

    iput-object p2, v1, Ln8/f;->j:Lz6/a;

    if-ne p1, v3, :cond_3

    invoke-virtual {v1}, Ln8/f;->h()V

    goto :goto_1

    :cond_0
    iget-object v4, v1, Ln8/f;->f:Le8/z0;

    if-ne v0, v4, :cond_3

    if-ne p1, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, v1, Ln8/f;->k:Z

    if-nez v0, :cond_2

    iget-object v0, v1, Ln8/f;->c:Ln8/d;

    if-eq v2, v0, :cond_2

    invoke-virtual {v1}, Ln8/f;->h()V

    goto :goto_1

    :cond_2
    iget-object v0, v1, Ln8/f;->d:Le8/j0;

    invoke-virtual {v0, p1, p2}, Le8/j0;->r(Le8/x;Lz6/a;)V

    :cond_3
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final s()Le8/j0;
    .locals 1

    iget v0, p0, Ln8/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln8/e;->b:Ljava/lang/Object;

    check-cast v0, Le8/j0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ln8/e;->c:Le8/z0;

    check-cast v0, Ln8/f;

    iget-object v0, v0, Ln8/f;->d:Le8/j0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
