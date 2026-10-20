.class public final La4/s;
.super La4/t;


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(La4/e0;I)V
    .locals 0

    iput p2, p0, La4/s;->b:I

    invoke-direct {p0, p1}, La4/t;-><init>(La4/e0;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)I
    .locals 2

    iget v0, p0, La4/s;->b:I

    iget-object v1, p0, La4/t;->a:La4/e0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/f0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    iget-object p1, p1, La4/f0;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, p1

    return v1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/f0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    iget-object p1, p1, La4/f0;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, p1

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Landroid/view/View;)I
    .locals 2

    iget v0, p0, La4/s;->b:I

    iget-object v1, p0, La4/t;->a:La4/e0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/f0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    iget-object p1, p1, La4/f0;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v1, p1

    return v1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/f0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    iget-object p1, p1, La4/f0;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v1, p1

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 2

    iget v0, p0, La4/s;->b:I

    iget-object v1, p0, La4/t;->a:La4/e0;

    packed-switch v0, :pswitch_data_0

    iget v0, v1, La4/e0;->g:I

    invoke-virtual {v1}, La4/e0;->s()I

    move-result v1

    sub-int/2addr v0, v1

    return v0

    :pswitch_0
    iget v0, v1, La4/e0;->f:I

    invoke-virtual {v1}, La4/e0;->u()I

    move-result v1

    sub-int/2addr v0, v1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()I
    .locals 2

    iget v0, p0, La4/s;->b:I

    iget-object v1, p0, La4/t;->a:La4/e0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, La4/e0;->v()I

    move-result v0

    return v0

    :pswitch_0
    invoke-virtual {v1}, La4/e0;->t()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()I
    .locals 3

    iget v0, p0, La4/s;->b:I

    iget-object v1, p0, La4/t;->a:La4/e0;

    packed-switch v0, :pswitch_data_0

    iget v0, v1, La4/e0;->g:I

    invoke-virtual {v1}, La4/e0;->v()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v1}, La4/e0;->s()I

    move-result v1

    sub-int/2addr v0, v1

    return v0

    :pswitch_0
    iget v0, v1, La4/e0;->f:I

    invoke-virtual {v1}, La4/e0;->t()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {v1}, La4/e0;->u()I

    move-result v1

    sub-int/2addr v0, v1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
