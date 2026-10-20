.class public final La0/g0;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p2, p0, La0/g0;->a:I

    iput-object p3, p0, La0/g0;->c:Ljava/lang/Object;

    iput-object p4, p0, La0/g0;->d:Ljava/lang/Object;

    iput-object p5, p0, La0/g0;->e:Ljava/lang/Object;

    iput p1, p0, La0/g0;->b:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 4

    iget p2, p0, La0/g0;->a:I

    iget v0, p0, La0/g0;->b:I

    iget-object v1, p0, La0/g0;->e:Ljava/lang/Object;

    iget-object v2, p0, La0/g0;->d:Ljava/lang/Object;

    iget-object v3, p0, La0/g0;->c:Ljava/lang/Object;

    packed-switch p2, :pswitch_data_0

    check-cast v3, Lt1/l1;

    check-cast v2, Lu1/w2;

    check-cast v1, Lc9/e;

    or-int/lit8 p2, v0, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v3, v2, v1, p1, p2}, Lu1/s1;->a(Lt1/l1;Lu1/w2;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_0
    check-cast v3, Lv0/j;

    check-cast v1, Lc9/e;

    or-int/lit8 p2, v0, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-virtual {v3, v2, v1, p1, p2}, Lv0/j;->f(Ljava/lang/Object;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_1
    check-cast v3, Lu0/b;

    invoke-static {v0}, Lm0/s;->m(I)I

    move-result p2

    or-int/lit8 p2, p2, 0x1

    invoke-virtual {v3, v2, v1, p1, p2}, Lu0/b;->b(Ljava/lang/Object;Ljava/lang/Object;Lm0/m;I)Ljava/lang/Object;

    return-void

    :pswitch_2
    check-cast v3, Lh0/m;

    check-cast v2, Lh0/k;

    check-cast v1, Lc9/e;

    or-int/lit8 p2, v0, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v3, v2, v1, p1, p2}, Ld7/t;->e(Lh0/m;Lh0/k;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_3
    check-cast v3, Ly0/o;

    check-cast v2, Lh0/v0;

    check-cast v1, Lc9/e;

    or-int/lit8 p2, v0, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v3, v2, v1, p1, p2}, Ld7/t;->c(Ly0/o;Lh0/v0;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_4
    check-cast v3, La0/o0;

    check-cast v1, Lc9/e;

    or-int/lit8 p2, v0, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-virtual {v3, v2, v1, p1, p2}, La0/o0;->f(Ljava/lang/Object;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_5
    check-cast v3, La0/d0;

    check-cast v2, La0/q;

    check-cast v1, Lr1/h1;

    or-int/lit8 p2, v0, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result p2

    invoke-static {v3, v2, v1, p1, p2}, Lf6/a;->h(La0/d0;La0/q;Lr1/h1;Lm0/m;I)V

    return-void

    nop

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

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, La0/g0;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/g0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/g0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/g0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_2
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/g0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_3
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/g0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_4
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/g0;->a(Lm0/m;I)V

    return-object v0

    :pswitch_5
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/g0;->a(Lm0/m;I)V

    return-object v0

    nop

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
