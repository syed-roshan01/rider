.class public final Lz/r;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La0/w;

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(La0/w;JIII)V
    .locals 0

    iput p6, p0, Lz/r;->a:I

    iput-object p1, p0, Lz/r;->b:La0/w;

    iput-wide p2, p0, Lz/r;->c:J

    iput p4, p0, Lz/r;->d:I

    iput p5, p0, Lz/r;->e:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IILc9/c;)Lr1/k0;
    .locals 7

    sget-object v0, Lr8/s;->a:Lr8/s;

    iget v1, p0, Lz/r;->a:I

    iget-object v2, p0, Lz/r;->b:La0/w;

    iget v3, p0, Lz/r;->e:I

    iget-wide v4, p0, Lz/r;->c:J

    iget v6, p0, Lz/r;->d:I

    packed-switch v1, :pswitch_data_0

    add-int/2addr p1, v6

    invoke-static {p1, v4, v5}, Lo1/s;->q(IJ)I

    move-result p1

    add-int/2addr p2, v3

    invoke-static {p2, v4, v5}, Lo1/s;->p(IJ)I

    move-result p2

    check-cast v2, La0/x;

    iget-object v1, v2, La0/x;->b:Lr1/i1;

    invoke-interface {v1, p1, p2, v0, p3}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1

    :pswitch_0
    add-int/2addr p1, v6

    invoke-static {p1, v4, v5}, Lo1/s;->q(IJ)I

    move-result p1

    add-int/2addr p2, v3

    invoke-static {p2, v4, v5}, Lo1/s;->p(IJ)I

    move-result p2

    check-cast v2, La0/x;

    iget-object v1, v2, La0/x;->b:Lr1/i1;

    invoke-interface {v1, p1, p2, v0, p3}, Lr1/l0;->N(IILjava/util/Map;Lc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lz/r;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lc9/c;

    invoke-virtual {p0, p1, p2, p3}, Lz/r;->a(IILc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lc9/c;

    invoke-virtual {p0, p1, p2, p3}, Lz/r;->a(IILc9/c;)Lr1/k0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
