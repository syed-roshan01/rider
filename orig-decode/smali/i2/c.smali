.class public final Li2/c;
.super Ld9/j;

# interfaces
.implements Lc9/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Li2/c;->a:I

    iput-object p1, p0, Li2/c;->b:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Li2/c;->a:I

    iget-object v1, p0, Li2/c;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lz/b;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lm0/m;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    and-int/lit8 v0, p4, 0xe

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lm0/q;

    invoke-virtual {v0, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    or-int/2addr p1, p4

    goto :goto_1

    :cond_1
    move p1, p4

    :goto_1
    and-int/lit8 p4, p4, 0x70

    if-nez p4, :cond_3

    move-object p4, p3

    check-cast p4, Lm0/q;

    invoke-virtual {p4, p2}, Lm0/q;->e(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr p1, p4

    :cond_3
    and-int/lit16 p4, p1, 0x2db

    const/16 v0, 0x92

    if-ne p4, v0, :cond_5

    move-object p4, p3

    check-cast p4, Lm0/q;

    invoke-virtual {p4}, Lm0/q;->G()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p4}, Lm0/q;->U()V

    goto :goto_4

    :cond_5
    :goto_3
    check-cast v1, Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    and-int/lit8 p1, p1, 0xe

    check-cast p2, Lz4/f;

    shr-int/lit8 p1, p1, 0x3

    and-int/lit8 p1, p1, 0xe

    invoke-static {p2, p3, p1}, Ly3/e;->B(Lz4/f;Lm0/m;I)V

    :goto_4
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1

    :pswitch_0
    check-cast p1, Lf2/e;

    check-cast p2, Lf2/l;

    check-cast p3, Lf2/j;

    iget p3, p3, Lf2/j;->a:I

    check-cast p4, Lf2/k;

    iget p4, p4, Lf2/k;->a:I

    check-cast v1, Li2/d;

    iget-object v0, v1, Li2/d;->e:Lf2/d;

    check-cast v0, Lf2/f;

    invoke-virtual {v0, p1, p2, p3, p4}, Lf2/f;->b(Lf2/e;Lf2/l;II)Lf2/w;

    move-result-object p1

    instance-of p2, p1, Lf2/v;

    const-string p3, "null cannot be cast to non-null type android.graphics.Typeface"

    if-nez p2, :cond_6

    new-instance p2, Ll/z2;

    iget-object p4, v1, Li2/d;->j:Ll/z2;

    invoke-direct {p2, p1, p4}, Ll/z2;-><init>(Lf2/w;Ll/z2;)V

    iput-object p2, v1, Li2/d;->j:Ll/z2;

    iget-object p1, p2, Ll/z2;->d:Ljava/lang/Object;

    invoke-static {p1, p3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/graphics/Typeface;

    goto :goto_5

    :cond_6
    check-cast p1, Lf2/v;

    iget-object p1, p1, Lf2/v;->a:Ljava/lang/Object;

    invoke-static {p1, p3}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/graphics/Typeface;

    :goto_5
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
