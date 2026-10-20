.class public final Lo2/s;
.super La4/q;


# virtual methods
.method public final l(Landroid/view/View;II)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, p2, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    aput-object v1, v0, v2

    invoke-static {v0}, Ld7/t;->f0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-static {p1, p2}, Le1/b;->r(Landroid/view/View;Ljava/util/ArrayList;)V

    return-void
.end method
