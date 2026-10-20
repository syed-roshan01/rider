.class public final Lp7/j;
.super Lp7/a0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp7/j;->a:I

    return-void
.end method


# virtual methods
.method public final b(Lv7/a;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lp7/j;->a:I

    const/4 v1, 0x0

    const/16 v2, 0x9

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lv7/a;->T()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    :goto_0
    return-object v1

    :pswitch_0
    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    if-ne v0, v2, :cond_1

    invoke-virtual {p1}, Lv7/a;->g0()V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lv7/a;->T()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    :goto_1
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic c(Lv7/b;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lp7/j;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lp7/j;->d(Lv7/b;Ljava/lang/Number;)V

    return-void

    :pswitch_0
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lp7/j;->d(Lv7/b;Ljava/lang/Number;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lv7/b;Ljava/lang/Number;)V
    .locals 3

    iget v0, p0, Lp7/j;->a:I

    packed-switch v0, :pswitch_data_0

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    float-to-double v1, v0

    invoke-static {v1, v2}, Lp7/n;->a(D)V

    instance-of v1, p2, Ljava/lang/Float;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Lv7/b;->d0(Ljava/lang/Number;)V

    :goto_1
    return-void

    :pswitch_0
    if-nez p2, :cond_2

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lp7/n;->a(D)V

    invoke-virtual {p1, v0, v1}, Lv7/b;->Q(D)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
