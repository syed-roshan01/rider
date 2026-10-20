.class public final Lv/p1;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ld9/r;

.field public final synthetic c:Lv/r1;


# direct methods
.method public synthetic constructor <init>(Ld9/r;Lv/r1;I)V
    .locals 0

    iput p3, p0, Lv/p1;->a:I

    iput-object p1, p0, Lv/p1;->b:Ld9/r;

    iput-object p2, p0, Lv/p1;->c:Lv/r1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 3

    iget v0, p0, Lv/p1;->a:I

    iget-object v1, p0, Lv/p1;->c:Lv/r1;

    iget-object v2, p0, Lv/p1;->b:Ld9/r;

    packed-switch v0, :pswitch_data_0

    iget v0, v2, Ld9/r;->a:F

    sub-float/2addr p1, v0

    invoke-interface {v1, p1}, Lv/r1;->a(F)F

    move-result p1

    iget v0, v2, Ld9/r;->a:F

    add-float/2addr v0, p1

    iput v0, v2, Ld9/r;->a:F

    return-void

    :pswitch_0
    iget v0, v2, Ld9/r;->a:F

    sub-float/2addr p1, v0

    invoke-interface {v1, p1}, Lv/r1;->a(F)F

    move-result p1

    add-float/2addr p1, v0

    iput p1, v2, Ld9/r;->a:F

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lv/p1;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    invoke-virtual {p0, p1}, Lv/p1;->a(F)V

    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    invoke-virtual {p0, p1}, Lv/p1;->a(F)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
