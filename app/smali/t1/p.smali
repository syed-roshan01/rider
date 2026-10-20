.class public final Lt1/p;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt1/p;->a:I

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    iget v0, p0, Lt1/p;->a:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lka/g;

    iget-object p1, p1, Lka/g;->a:Lja/x;

    check-cast p2, Lka/g;

    iget-object p2, p2, Lka/g;->a:Lja/x;

    invoke-static {p1, p2}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    const-string v0, "a"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v4, 0x4

    :goto_0
    if-ge v4, v0, :cond_2

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {p2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v5, v6, :cond_1

    invoke-static {v5, v6}, Ld7/a;->o(II)I

    move-result p1

    if-gez p1, :cond_0

    :goto_1
    move v1, v2

    goto :goto_2

    :cond_0
    move v1, v3

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-eq p1, p2, :cond_3

    if-ge p1, p2, :cond_0

    goto :goto_1

    :cond_3
    :goto_2
    return v1

    :pswitch_1
    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_2
    check-cast p1, Lq8/f;

    iget-object p1, p1, Lq8/f;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lq8/f;

    iget-object p2, p2, Lq8/f;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_3
    check-cast p1, Lq8/f;

    iget-object p1, p1, Lq8/f;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lq8/f;

    iget-object p2, p2, Lq8/f;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_4
    check-cast p1, Landroid/view/accessibility/AccessibilityNodeInfo;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Landroid/view/accessibility/AccessibilityNodeInfo;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInScreen(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_5
    check-cast p1, Lq8/f;

    iget-object p1, p1, Lq8/f;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lq8/f;

    iget-object p2, p2, Lq8/f;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_6
    check-cast p1, La4/l;

    check-cast p2, La4/l;

    iget-object v0, p1, La4/l;->d:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_4

    move v4, v3

    goto :goto_3

    :cond_4
    move v4, v1

    :goto_3
    iget-object v5, p2, La4/l;->d:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v5, :cond_5

    move v5, v3

    goto :goto_4

    :cond_5
    move v5, v1

    :goto_4
    if-eq v4, v5, :cond_8

    if-nez v0, :cond_7

    :cond_6
    move v1, v3

    goto :goto_6

    :cond_7
    :goto_5
    move v1, v2

    goto :goto_6

    :cond_8
    iget-boolean v0, p1, La4/l;->a:Z

    iget-boolean v4, p2, La4/l;->a:Z

    if-eq v0, v4, :cond_9

    if-eqz v0, :cond_6

    goto :goto_5

    :cond_9
    iget v0, p2, La4/l;->b:I

    iget v2, p1, La4/l;->b:I

    sub-int/2addr v0, v2

    if-eqz v0, :cond_a

    move v1, v0

    goto :goto_6

    :cond_a
    iget p1, p1, La4/l;->c:I

    iget p2, p2, La4/l;->c:I

    sub-int/2addr p1, p2

    if-eqz p1, :cond_b

    move v1, p1

    :cond_b
    :goto_6
    return v1

    :pswitch_7
    check-cast p1, La2/d;

    iget p1, p1, La2/d;->b:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, La2/d;

    iget p2, p2, La2/d;->b:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_8
    check-cast p1, Landroidx/compose/ui/node/a;

    check-cast p2, Landroidx/compose/ui/node/a;

    iget v0, p1, Landroidx/compose/ui/node/a;->q:I

    iget v1, p2, Landroidx/compose/ui/node/a;->q:I

    invoke-static {v0, v1}, Ld7/a;->o(II)I

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_7

    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p1, p2}, Ld7/a;->o(II)I

    move-result v0

    :goto_7
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
