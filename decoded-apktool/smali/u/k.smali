.class public final Lu/k;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(ILjava/util/Collection;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lu/k;->a:I

    iput p1, p0, Lu/k;->c:I

    iput-object p2, p0, Lu/k;->b:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lr1/x0;II)V
    .locals 0

    iput p3, p0, Lu/k;->a:I

    iput-object p1, p0, Lu/k;->b:Ljava/lang/Object;

    iput p2, p0, Lu/k;->c:I

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr1/w0;)V
    .locals 10

    const/4 v0, 0x0

    iget v1, p0, Lu/k;->a:I

    iget v2, p0, Lu/k;->c:I

    iget-object v3, p0, Lu/k;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v3, Lr1/x0;

    neg-int v1, v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-static {v3, p1, v1, v0}, Lr1/w0;->c(Lr1/x0;IIF)V

    return-void

    :pswitch_0
    check-cast v3, Lr1/x0;

    div-int/lit8 v2, v2, 0x2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v2, v2, v0}, Lr1/w0;->c(Lr1/x0;IIF)V

    return-void

    :pswitch_1
    move-object v5, v3

    check-cast v5, Lr1/x0;

    neg-int v0, v2

    div-int/lit8 v0, v0, 0x2

    iget v1, v5, Lr1/x0;->a:I

    invoke-virtual {v5}, Lr1/x0;->b0()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    sub-int v6, v0, v1

    iget v1, v5, Lr1/x0;->b:I

    invoke-virtual {v5}, Lr1/x0;->a0()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    sub-int v7, v0, v1

    const/4 v8, 0x0

    const/16 v9, 0xc

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Lr1/w0;->k(Lr1/w0;Lr1/x0;IILq/w;I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu/k;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Lu/k;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    iget v1, p0, Lu/k;->c:I

    invoke-interface {p1, v1, v0}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Lu/k;->a(Lr1/w0;)V

    return-object v0

    :pswitch_1
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Lu/k;->a(Lr1/w0;)V

    return-object v0

    :pswitch_2
    check-cast p1, Lr1/w0;

    invoke-virtual {p0, p1}, Lu/k;->a(Lr1/w0;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
