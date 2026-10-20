.class public final synthetic Lm0/r;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm0/r;->a:I

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    iget v0, p0, Lm0/r;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/util/Util;->b(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Ljava/lang/Comparable;

    check-cast p2, Ljava/lang/Comparable;

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_1
    check-cast p1, Lcom/google/firebase/firestore/util/AsyncQueue$DelayedTask;

    check-cast p2, Lcom/google/firebase/firestore/util/AsyncQueue$DelayedTask;

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/util/AsyncQueue;->c(Lcom/google/firebase/firestore/util/AsyncQueue$DelayedTask;Lcom/google/firebase/firestore/util/AsyncQueue$DelayedTask;)I

    move-result p1

    return p1

    :pswitch_2
    check-cast p1, Lcom/google/firebase/firestore/core/FieldFilter;

    check-cast p2, Lcom/google/firebase/firestore/core/FieldFilter;

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/model/TargetIndexMatcher;->a(Lcom/google/firebase/firestore/core/FieldFilter;Lcom/google/firebase/firestore/core/FieldFilter;)I

    move-result p1

    return p1

    :pswitch_3
    check-cast p1, Lcom/google/firebase/firestore/model/MutableDocument;

    check-cast p2, Lcom/google/firebase/firestore/model/MutableDocument;

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/model/FieldIndex$IndexOffset;->a(Lcom/google/firebase/firestore/model/MutableDocument;Lcom/google/firebase/firestore/model/MutableDocument;)I

    move-result p1

    return p1

    :pswitch_4
    check-cast p1, Lcom/google/firebase/firestore/model/FieldIndex;

    check-cast p2, Lcom/google/firebase/firestore/model/FieldIndex;

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/model/FieldIndex;->a(Lcom/google/firebase/firestore/model/FieldIndex;Lcom/google/firebase/firestore/model/FieldIndex;)I

    move-result p1

    return p1

    :pswitch_5
    check-cast p1, Lcom/google/firebase/firestore/model/DocumentKey;

    check-cast p2, Lcom/google/firebase/firestore/model/DocumentKey;

    invoke-virtual {p1, p2}, Lcom/google/firebase/firestore/model/DocumentKey;->compareTo(Lcom/google/firebase/firestore/model/DocumentKey;)I

    move-result p1

    return p1

    :pswitch_6
    check-cast p1, Lcom/google/firebase/firestore/model/Document;

    check-cast p2, Lcom/google/firebase/firestore/model/Document;

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/model/Document;->a(Lcom/google/firebase/firestore/model/Document;Lcom/google/firebase/firestore/model/Document;)I

    move-result p1

    return p1

    :pswitch_7
    check-cast p1, [B

    check-cast p2, [B

    array-length v0, p1

    array-length v1, p2

    if-eq v0, v1, :cond_0

    array-length p1, p1

    array-length p2, p2

    sub-int/2addr p1, p2

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_2

    aget-byte v2, p1, v1

    aget-byte v3, p2, v1

    if-eq v2, v3, :cond_1

    sub-int p1, v2, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move p1, v0

    :goto_1
    return p1

    :pswitch_8
    check-cast p1, Lq8/f;

    check-cast p2, Lq8/f;

    iget-object v0, p1, Lq8/f;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object p1, p1, Lq8/f;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sub-int/2addr v0, p1

    iget-object p1, p2, Lq8/f;->b:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object p2, p2, Lq8/f;->a:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    sub-int/2addr p1, p2

    sub-int/2addr v0, p1

    return v0

    :pswitch_9
    check-cast p1, Landroidx/compose/ui/node/a;

    check-cast p2, Landroidx/compose/ui/node/a;

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    iget v0, v0, Lt1/l0;->F:F

    iget-object v1, p2, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget-object v1, v1, Lt1/n0;->o:Lt1/l0;

    iget v1, v1, Lt1/l0;->F:F

    cmpg-float v2, v0, v1

    if-nez v2, :cond_3

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->r()I

    move-result p1

    invoke-virtual {p2}, Landroidx/compose/ui/node/a;->r()I

    move-result p2

    invoke-static {p1, p2}, Ld7/a;->o(II)I

    move-result p1

    goto :goto_2

    :cond_3
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    :goto_2
    return p1

    :pswitch_a
    check-cast p1, Lm0/u0;

    check-cast p2, Lm0/u0;

    iget p1, p1, Lm0/u0;->b:I

    iget p2, p2, Lm0/u0;->b:I

    invoke-static {p1, p2}, Ld7/a;->o(II)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
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
