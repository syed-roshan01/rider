.class public final Lw/j;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:F

.field public final synthetic c:Ld9/r;

.field public final synthetic d:Lv/r1;

.field public final synthetic e:Lc9/c;


# direct methods
.method public synthetic constructor <init>(FLd9/r;Lv/r1;Lw/c;I)V
    .locals 0

    iput p5, p0, Lw/j;->a:I

    iput p1, p0, Lw/j;->b:F

    iput-object p2, p0, Lw/j;->c:Ld9/r;

    iput-object p3, p0, Lw/j;->d:Lv/r1;

    iput-object p4, p0, Lw/j;->e:Lc9/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt/m;)V
    .locals 8

    const/high16 v0, 0x3f000000    # 0.5f

    iget v1, p0, Lw/j;->a:I

    iget-object v2, p0, Lw/j;->e:Lc9/c;

    iget-object v3, p0, Lw/j;->d:Lv/r1;

    iget-object v4, p0, Lw/j;->c:Ld9/r;

    iget v5, p0, Lw/j;->b:F

    packed-switch v1, :pswitch_data_0

    iget-object v1, p1, Lt/m;->e:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1, v5}, Lw/l;->c(FF)F

    move-result v1

    iget v5, v4, Ld9/r;->a:F

    sub-float v5, v1, v5

    invoke-interface {v3, v5}, Lv/r1;->a(F)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v2, v6}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sub-float/2addr v5, v3

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v0, v2, v0

    if-gtz v0, :cond_0

    iget-object v0, p1, Lt/m;->e:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    cmpg-float v0, v1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lt/m;->i:Lm0/n1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p1, Lt/m;->d:Lc9/a;

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    :goto_0
    iget p1, v4, Ld9/r;->a:F

    add-float/2addr p1, v3

    iput p1, v4, Ld9/r;->a:F

    return-void

    :pswitch_0
    iget-object v1, p1, Lt/m;->e:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpl-float v1, v1, v6

    iget-object v6, p1, Lt/m;->d:Lc9/a;

    iget-object v7, p1, Lt/m;->i:Lm0/n1;

    iget-object p1, p1, Lt/m;->e:Lm0/n1;

    if-ltz v1, :cond_2

    invoke-virtual {p1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p1, v5}, Lw/l;->c(FF)F

    move-result p1

    iget v1, v4, Ld9/r;->a:F

    sub-float v1, p1, v1

    invoke-interface {v3, v1}, Lv/r1;->a(F)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v2, v5}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sub-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v1, v0

    if-lez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v7, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-interface {v6}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v7, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-interface {v6}, Lc9/a;->invoke()Ljava/lang/Object;

    iput p1, v4, Ld9/r;->a:F

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    iget v5, v4, Ld9/r;->a:F

    sub-float/2addr v1, v5

    invoke-interface {v3, v1}, Lv/r1;->a(F)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v2, v5}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sub-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    cmpl-float v0, v1, v0

    if-lez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v7, v0}, Lm0/y2;->setValue(Ljava/lang/Object;)V

    invoke-interface {v6}, Lc9/a;->invoke()Ljava/lang/Object;

    :cond_3
    invoke-virtual {p1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, v4, Ld9/r;->a:F

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lw/j;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lt/m;

    invoke-virtual {p0, p1}, Lw/j;->a(Lt/m;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lt/m;

    invoke-virtual {p0, p1}, Lw/j;->a(Lt/m;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
