.class public final La4/a1;
.super Ljava/lang/Object;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, La4/a1;->a:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Lq/f;

    .line 3
    invoke-direct {p1}, Lq/z;-><init>()V

    iput-object p1, p0, La4/a1;->b:Ljava/lang/Object;

    .line 4
    new-instance p1, Lq/l;

    invoke-direct {p1}, Lq/l;-><init>()V

    iput-object p1, p0, La4/a1;->c:Ljava/lang/Object;

    return-void

    .line 5
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La4/c0;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, La4/a1;->a:I

    iput-object p1, p0, La4/a1;->b:Ljava/lang/Object;

    .line 7
    new-instance p1, La4/x0;

    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p1, La4/x0;->a:I

    iput-object p1, p0, La4/a1;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, La4/a1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La4/a1;->b:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, La4/a1;->c:Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, La4/a1;->b:Ljava/lang/Object;

    check-cast v0, Lq/f;

    invoke-virtual {v0}, Lq/z;->clear()V

    iget-object v0, p0, La4/a1;->c:Ljava/lang/Object;

    check-cast v0, Lq/l;

    invoke-virtual {v0}, Lq/l;->a()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(IIII)Landroid/view/View;
    .locals 9

    iget-object v0, p0, La4/a1;->b:Ljava/lang/Object;

    check-cast v0, La4/y0;

    check-cast v0, La4/c0;

    iget v1, v0, La4/c0;->a:I

    iget-object v0, v0, La4/c0;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v0, La4/e0;

    invoke-virtual {v0}, La4/e0;->v()I

    move-result v0

    goto :goto_0

    :pswitch_0
    check-cast v0, La4/e0;

    invoke-virtual {v0}, La4/e0;->t()I

    move-result v0

    :goto_0
    iget-object v1, p0, La4/a1;->b:Ljava/lang/Object;

    check-cast v1, La4/y0;

    check-cast v1, La4/c0;

    iget v2, v1, La4/c0;->a:I

    iget-object v1, v1, La4/c0;->b:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_1

    check-cast v1, La4/e0;

    iget v2, v1, La4/e0;->g:I

    invoke-virtual {v1}, La4/e0;->s()I

    move-result v1

    :goto_1
    sub-int/2addr v2, v1

    goto :goto_2

    :pswitch_1
    check-cast v1, La4/e0;

    iget v2, v1, La4/e0;->f:I

    invoke-virtual {v1}, La4/e0;->u()I

    move-result v1

    goto :goto_1

    :goto_2
    if-le p2, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_3

    :cond_0
    const/4 v1, -0x1

    :goto_3
    const/4 v3, 0x0

    :goto_4
    if-eq p1, p2, :cond_3

    iget-object v4, p0, La4/a1;->b:Ljava/lang/Object;

    check-cast v4, La4/y0;

    check-cast v4, La4/c0;

    iget v5, v4, La4/c0;->a:I

    iget-object v4, v4, La4/c0;->b:Ljava/lang/Object;

    packed-switch v5, :pswitch_data_2

    check-cast v4, La4/e0;

    invoke-virtual {v4, p1}, La4/e0;->o(I)Landroid/view/View;

    move-result-object v4

    goto :goto_5

    :pswitch_2
    check-cast v4, La4/e0;

    invoke-virtual {v4, p1}, La4/e0;->o(I)Landroid/view/View;

    move-result-object v4

    :goto_5
    iget-object v5, p0, La4/a1;->b:Ljava/lang/Object;

    check-cast v5, La4/y0;

    check-cast v5, La4/c0;

    invoke-virtual {v5, v4}, La4/c0;->i(Landroid/view/View;)I

    move-result v5

    iget-object v6, p0, La4/a1;->b:Ljava/lang/Object;

    check-cast v6, La4/y0;

    check-cast v6, La4/c0;

    invoke-virtual {v6, v4}, La4/c0;->h(Landroid/view/View;)I

    move-result v6

    iget-object v7, p0, La4/a1;->c:Ljava/lang/Object;

    move-object v8, v7

    check-cast v8, La4/x0;

    iput v0, v8, La4/x0;->b:I

    iput v2, v8, La4/x0;->c:I

    iput v5, v8, La4/x0;->d:I

    iput v6, v8, La4/x0;->e:I

    if-eqz p3, :cond_1

    move-object v5, v7

    check-cast v5, La4/x0;

    iput p3, v5, La4/x0;->a:I

    check-cast v7, La4/x0;

    invoke-virtual {v7}, La4/x0;->a()Z

    move-result v5

    if-eqz v5, :cond_1

    return-object v4

    :cond_1
    if-eqz p4, :cond_2

    iget-object v5, p0, La4/a1;->c:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, La4/x0;

    iput p4, v6, La4/x0;->a:I

    check-cast v5, La4/x0;

    invoke-virtual {v5}, La4/x0;->a()Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v3, v4

    :cond_2
    add-int/2addr p1, v1

    goto :goto_4

    :cond_3
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
