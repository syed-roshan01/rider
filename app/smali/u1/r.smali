.class public final Lu1/r;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lu1/w;


# direct methods
.method public synthetic constructor <init>(Lu1/w;I)V
    .locals 0

    iput p2, p0, Lu1/r;->a:I

    iput-object p1, p0, Lu1/r;->b:Lu1/w;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lc9/a;)V
    .locals 3

    iget v0, p0, Lu1/r;->a:I

    iget-object v1, p0, Lu1/r;->b:Lu1/w;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    if-ne v0, v2, :cond_1

    invoke-interface {p1}, Lc9/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lu1/v;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lu1/v;-><init>(Lc9/a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_1
    return-void

    :pswitch_0
    iget-object v0, v1, Lu1/w;->u0:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->h(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu1/r;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x2

    iget-object v4, p0, Lu1/r;->b:Lu1/w;

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lc9/a;

    invoke-virtual {p0, p1}, Lu1/r;->a(Lc9/a;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm1/b;

    iget-object p1, p1, Lm1/b;->a:Landroid/view/KeyEvent;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v0

    sget-wide v5, Lm1/a;->h:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    move v2, v3

    :cond_0
    new-instance v0, Lc1/b;

    invoke-direct {v0, v2}, Lc1/b;-><init>(I)V

    goto/16 :goto_4

    :cond_1
    sget-wide v5, Lm1/a;->f:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v0, Lc1/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lc1/b;-><init>(I)V

    goto/16 :goto_4

    :cond_2
    sget-wide v5, Lm1/a;->e:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v0, Lc1/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lc1/b;-><init>(I)V

    goto/16 :goto_4

    :cond_3
    sget-wide v5, Lm1/a;->c:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    sget-wide v5, Lm1/a;->k:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_5

    :goto_0
    new-instance v0, Lc1/b;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lc1/b;-><init>(I)V

    goto :goto_4

    :cond_5
    sget-wide v5, Lm1/a;->d:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_1

    :cond_6
    sget-wide v5, Lm1/a;->l:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_7

    :goto_1
    new-instance v0, Lc1/b;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lc1/b;-><init>(I)V

    goto :goto_4

    :cond_7
    sget-wide v5, Lm1/a;->g:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_2

    :cond_8
    sget-wide v5, Lm1/a;->i:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_2

    :cond_9
    sget-wide v5, Lm1/a;->m:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_a

    :goto_2
    new-instance v0, Lc1/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lc1/b;-><init>(I)V

    goto :goto_4

    :cond_a
    sget-wide v5, Lm1/a;->b:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_3

    :cond_b
    sget-wide v5, Lm1/a;->j:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_c

    :goto_3
    new-instance v0, Lc1/b;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lc1/b;-><init>(I)V

    goto :goto_4

    :cond_c
    const/4 v0, 0x0

    :goto_4
    if-eqz v0, :cond_e

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->b(Landroid/view/KeyEvent;)I

    move-result p1

    invoke-static {p1, v3}, Lz6/a;->B(II)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_5

    :cond_d
    invoke-virtual {v4}, Lu1/w;->getFocusOwner()Lc1/e;

    move-result-object p1

    check-cast p1, Lc1/f;

    iget v0, v0, Lc1/b;->a:I

    invoke-virtual {p1, v0}, Lc1/f;->b(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_6

    :cond_e
    :goto_5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_6
    return-object p1

    :pswitch_1
    check-cast p1, Lc9/a;

    invoke-virtual {p0, p1}, Lu1/r;->a(Lc9/a;)V

    return-object v0

    :pswitch_2
    check-cast p1, Ll1/a;

    iget p1, p1, Ll1/a;->a:I

    if-ne p1, v2, :cond_f

    invoke-virtual {v4}, Landroid/view/View;->isInTouchMode()Z

    move-result v2

    goto :goto_7

    :cond_f
    if-ne p1, v3, :cond_10

    invoke-virtual {v4}, Landroid/view/View;->isInTouchMode()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {v4}, Landroid/view/View;->requestFocusFromTouch()Z

    move-result v2

    goto :goto_7

    :cond_10
    const/4 v2, 0x0

    :cond_11
    :goto_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
