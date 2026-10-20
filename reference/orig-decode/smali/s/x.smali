.class public final Ls/x;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    iput p1, p0, Ls/x;->a:I

    iput-object p2, p0, Ls/x;->b:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr1/w0;)V
    .locals 6

    const/4 v0, 0x0

    iget v1, p0, Ls/x;->a:I

    const/4 v2, 0x0

    iget-object v3, p0, Ls/x;->b:Ljava/util/List;

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    invoke-static {v3}, Ld7/t;->Y(Ljava/util/List;)I

    move-result v0

    if-ltz v0, :cond_0

    move v1, v2

    :goto_0
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/x0;

    invoke-static {p1, v4, v2, v2}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    if-eq v1, v0, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    :pswitch_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    move v1, v2

    :goto_1
    if-ge v1, v0, :cond_1

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/x0;

    invoke-static {p1, v4, v2, v2}, Lr1/w0;->g(Lr1/w0;Lr1/x0;II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-void

    :pswitch_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    move v1, v2

    :goto_2
    if-ge v1, v0, :cond_2

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr1/x0;

    invoke-static {p1, v4, v2, v2}, Lr1/w0;->h(Lr1/w0;Lr1/x0;II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    return-void

    :pswitch_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    move v4, v2

    :goto_3
    if-ge v4, v1, :cond_3

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr1/x0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v2, v2, v0}, Lr1/w0;->c(Lr1/x0;IIF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_3
    return-void

    :pswitch_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    move v4, v2

    :goto_4
    if-ge v4, v1, :cond_4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr1/x0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v2, v2, v0}, Lr1/w0;->c(Lr1/x0;IIF)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Ls/x;->a:I

    iget-object v2, p0, Ls/x;->b:Ljava/util/List;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lz/y;

    const-string v1, "$this$LazyColumn"

    invoke-static {p1, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ld5/w1;->a:Ld5/w1;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-instance v4, Ld5/i1;

    const/4 v5, 0x1

    invoke-direct {v4, v5, v1, v2}, Ld5/i1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Li2/c;

    invoke-direct {v1, v2, v5}, Li2/c;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lu0/b;

    const v6, -0x25b7f321

    invoke-direct {v2, v6, v1, v5}, Lu0/b;-><init>(ILd9/j;Z)V

    check-cast p1, Lz/g;

    new-instance v1, Lz/f;

    invoke-direct {v1, v4, v2}, Lz/f;-><init>(Ld5/i1;Lu0/b;)V

    iget-object p1, p1, Lz/g;->u:La0/q0;

    invoke-virtual {p1, v3, v1}, La0/q0;->a(ILa0/o;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/x;->a(Lr1/w0;)V

    return-object v0

    :pswitch_1
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/x;->a(Lr1/w0;)V

    return-object v0

    :pswitch_2
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/x;->a(Lr1/w0;)V

    return-object v0

    :pswitch_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc9/c;

    invoke-interface {v4, p1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :pswitch_4
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/x;->a(Lr1/w0;)V

    return-object v0

    :pswitch_5
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Ls/x;->a(Lr1/w0;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
