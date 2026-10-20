.class public final Lu1/n0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lu1/n0;->a:I

    iput-object p1, p0, Lu1/n0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    iget v0, p0, Lu1/n0;->a:I

    iget-object v1, p0, Lu1/n0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Le8/y1;

    check-cast v1, Lr7/e;

    iget v0, v1, Lr7/e;->a:I

    packed-switch v0, :pswitch_data_1

    move-object v0, p1

    check-cast v0, Le8/t1;

    invoke-virtual {v0}, Le8/t1;->o0()I

    move-result v0

    goto :goto_0

    :pswitch_0
    move-object v0, p1

    check-cast v0, Le8/e1;

    invoke-virtual {v0}, Le8/e1;->c()I

    move-result v0

    goto :goto_0

    :pswitch_1
    move-object v0, p1

    check-cast v0, Le8/a1;

    invoke-virtual {v0}, Le8/a1;->g()I

    move-result v0

    :goto_0
    iget v1, v1, Lr7/e;->a:I

    packed-switch v1, :pswitch_data_2

    move-object v1, p2

    check-cast v1, Le8/t1;

    invoke-virtual {v1}, Le8/t1;->o0()I

    move-result v1

    goto :goto_1

    :pswitch_2
    move-object v1, p2

    check-cast v1, Le8/e1;

    invoke-virtual {v1}, Le8/e1;->c()I

    move-result v1

    goto :goto_1

    :pswitch_3
    move-object v1, p2

    check-cast v1, Le8/a1;

    invoke-virtual {v1}, Le8/a1;->g()I

    move-result v1

    :goto_1
    sub-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :goto_2
    return v0

    :pswitch_4
    check-cast p1, Le8/e1;

    check-cast p2, Le8/e1;

    invoke-virtual {p1}, Le8/e1;->c()I

    move-result p1

    invoke-virtual {p2}, Le8/e1;->c()I

    move-result p2

    sub-int/2addr p1, p2

    return p1

    :pswitch_5
    check-cast v1, Ljava/util/Comparator;

    invoke-interface {v1, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_3

    :cond_1
    check-cast p1, Ly1/o;

    iget p1, p1, Ly1/o;->g:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast p2, Ly1/o;

    iget p2, p2, Ly1/o;->g:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Ld7/t;->J(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    :goto_3
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xa
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
