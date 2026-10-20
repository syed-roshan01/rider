.class public final La4/c0;
.super Ljava/lang/Object;

# interfaces
.implements La4/y0;
.implements Lf0/u0;
.implements Lp9/f;
.implements Lt/u;


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FF)V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, La4/c0;->a:I

    .line 18
    new-instance v0, Lt/h0;

    const v1, 0x3c23d70a    # 0.01f

    .line 19
    invoke-direct {v0, p1, p2, v1}, Lt/h0;-><init>(FFF)V

    iput-object v0, p0, La4/c0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(FFLt/t;)V
    .locals 4

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, La4/c0;->a:I

    .line 10
    invoke-virtual {p3}, Lt/t;->b()I

    move-result v1

    invoke-static {v0, v1}, Lz6/a;->s0(II)Li9/g;

    move-result-object v0

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0}, Lf9/a;->y0(Ljava/lang/Iterable;)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    invoke-virtual {v0}, Li9/e;->e()Li9/f;

    move-result-object v0

    .line 13
    :goto_0
    iget-boolean v2, v0, Li9/f;->c:Z

    if-eqz v2, :cond_0

    .line 14
    invoke-virtual {v0}, Li9/f;->b()I

    move-result v2

    .line 15
    new-instance v3, Lt/h0;

    invoke-virtual {p3, v2}, Lt/t;->a(I)F

    move-result v2

    invoke-direct {v3, p1, p2, v2}, Lt/h0;-><init>(FFF)V

    .line 16
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iput-object v1, p0, La4/c0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-array p1, p1, [I

    iput-object p1, p0, La4/c0;->b:Ljava/lang/Object;

    return-void

    .line 6
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_1

    .line 7
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, La4/c0;->b:Ljava/lang/Object;

    return-void

    .line 8
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The max pool size must be > 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La4/c0;->a:I

    iput-object p2, p0, La4/c0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, La4/c0;->a:I

    iput-object p1, p0, La4/c0;->b:Ljava/lang/Object;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, La4/c0;->a:I

    iput-object p1, p0, La4/c0;->b:Ljava/lang/Object;

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/KeyEvent;)Lf0/t0;
    .locals 11

    sget-object v0, Lf0/t0;->B:Lf0/t0;

    iget v1, p0, La4/c0;->a:I

    iget-object v2, p0, La4/c0;->b:Ljava/lang/Object;

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v0

    sget-wide v4, Lf0/i1;->i:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v0, Lf0/t0;->Q:Lf0/t0;

    goto/16 :goto_0

    :cond_0
    sget-wide v4, Lf0/i1;->j:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v0, Lf0/t0;->R:Lf0/t0;

    goto/16 :goto_0

    :cond_1
    sget-wide v4, Lf0/i1;->k:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v0, Lf0/t0;->T:Lf0/t0;

    goto/16 :goto_0

    :cond_2
    sget-wide v4, Lf0/i1;->l:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lf0/t0;->S:Lf0/t0;

    goto/16 :goto_0

    :cond_3
    move-object v0, v3

    goto/16 :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    invoke-static {v1}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v4

    sget-wide v6, Lf0/i1;->i:J

    invoke-static {v4, v5, v6, v7}, Lm1/a;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v0, Lf0/t0;->e:Lf0/t0;

    goto/16 :goto_0

    :cond_5
    sget-wide v6, Lf0/i1;->j:J

    invoke-static {v4, v5, v6, v7}, Lm1/a;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v0, Lf0/t0;->d:Lf0/t0;

    goto/16 :goto_0

    :cond_6
    sget-wide v6, Lf0/i1;->k:J

    invoke-static {v4, v5, v6, v7}, Lm1/a;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v0, Lf0/t0;->n:Lf0/t0;

    goto/16 :goto_0

    :cond_7
    sget-wide v6, Lf0/i1;->l:J

    invoke-static {v4, v5, v6, v7}, Lm1/a;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v0, Lf0/t0;->f:Lf0/t0;

    goto/16 :goto_0

    :cond_8
    sget-wide v6, Lf0/i1;->c:J

    invoke-static {v4, v5, v6, v7}, Lm1/a;->a(JJ)Z

    move-result v1

    if-eqz v1, :cond_9

    goto/16 :goto_0

    :cond_9
    sget-wide v0, Lf0/i1;->t:J

    invoke-static {v4, v5, v0, v1}, Lm1/a;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lf0/t0;->E:Lf0/t0;

    goto :goto_0

    :cond_a
    sget-wide v0, Lf0/i1;->s:J

    invoke-static {v4, v5, v0, v1}, Lm1/a;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Lf0/t0;->D:Lf0/t0;

    goto :goto_0

    :cond_b
    sget-wide v0, Lf0/i1;->h:J

    invoke-static {v4, v5, v0, v1}, Lm1/a;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lf0/t0;->Y:Lf0/t0;

    goto :goto_0

    :cond_c
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v0

    sget-wide v4, Lf0/i1;->o:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_d

    sget-object v0, Lf0/t0;->W:Lf0/t0;

    goto :goto_0

    :cond_d
    sget-wide v4, Lf0/i1;->p:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lf0/t0;->X:Lf0/t0;

    goto :goto_0

    :cond_e
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-static {v0}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v0

    sget-wide v4, Lf0/i1;->s:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-object v0, Lf0/t0;->F:Lf0/t0;

    goto :goto_0

    :cond_f
    sget-wide v4, Lf0/i1;->t:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lf0/t0;->G:Lf0/t0;

    :goto_0
    if-nez v0, :cond_10

    check-cast v2, Lf0/u0;

    invoke-interface {v2, p1}, Lf0/u0;->c(Landroid/view/KeyEvent;)Lf0/t0;

    move-result-object v0

    :cond_10
    return-object v0

    :pswitch_0
    check-cast v2, Lc9/c;

    new-instance v1, Lm1/b;

    invoke-direct {v1, p1}, Lm1/b;-><init>(Landroid/view/KeyEvent;)V

    invoke-interface {v2, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    sget-object v4, Lf0/t0;->c0:Lf0/t0;

    if-eqz v1, :cond_12

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v0

    sget-wide v5, Lf0/i1;->g:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_11

    :goto_1
    move-object v0, v4

    goto/16 :goto_6

    :cond_11
    :goto_2
    move-object v0, v3

    goto/16 :goto_6

    :cond_12
    new-instance v1, Lm1/b;

    invoke-direct {v1, p1}, Lm1/b;-><init>(Landroid/view/KeyEvent;)V

    invoke-interface {v2, v1}, Lc9/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    sget-object v2, Lf0/t0;->A:Lf0/t0;

    sget-object v5, Lf0/t0;->y:Lf0/t0;

    sget-object v6, Lf0/t0;->z:Lf0/t0;

    if-eqz v1, :cond_19

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v0

    sget-wide v7, Lf0/i1;->b:J

    invoke-static {v0, v1, v7, v8}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_13

    goto :goto_3

    :cond_13
    sget-wide v7, Lf0/i1;->q:J

    invoke-static {v0, v1, v7, v8}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_14

    :goto_3
    move-object v0, v5

    goto/16 :goto_6

    :cond_14
    sget-wide v7, Lf0/i1;->d:J

    invoke-static {v0, v1, v7, v8}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_15

    :goto_4
    move-object v0, v6

    goto/16 :goto_6

    :cond_15
    sget-wide v5, Lf0/i1;->f:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_16

    :goto_5
    move-object v0, v2

    goto/16 :goto_6

    :cond_16
    sget-wide v5, Lf0/i1;->a:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_17

    sget-object v0, Lf0/t0;->H:Lf0/t0;

    goto/16 :goto_6

    :cond_17
    sget-wide v5, Lf0/i1;->e:J

    invoke-static {v0, v1, v5, v6}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_18

    goto :goto_1

    :cond_18
    sget-wide v4, Lf0/i1;->g:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_11

    sget-object v0, Lf0/t0;->b0:Lf0/t0;

    goto/16 :goto_6

    :cond_19
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_2

    :cond_1a
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result v1

    if-eqz v1, :cond_23

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v0

    sget-wide v4, Lf0/i1;->i:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1b

    sget-object v0, Lf0/t0;->I:Lf0/t0;

    goto/16 :goto_6

    :cond_1b
    sget-wide v4, Lf0/i1;->j:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1c

    sget-object v0, Lf0/t0;->J:Lf0/t0;

    goto/16 :goto_6

    :cond_1c
    sget-wide v4, Lf0/i1;->k:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1d

    sget-object v0, Lf0/t0;->K:Lf0/t0;

    goto/16 :goto_6

    :cond_1d
    sget-wide v4, Lf0/i1;->l:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1e

    sget-object v0, Lf0/t0;->L:Lf0/t0;

    goto/16 :goto_6

    :cond_1e
    sget-wide v4, Lf0/i1;->m:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_1f

    sget-object v0, Lf0/t0;->M:Lf0/t0;

    goto/16 :goto_6

    :cond_1f
    sget-wide v4, Lf0/i1;->n:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_20

    sget-object v0, Lf0/t0;->N:Lf0/t0;

    goto/16 :goto_6

    :cond_20
    sget-wide v4, Lf0/i1;->o:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_21

    sget-object v0, Lf0/t0;->U:Lf0/t0;

    goto/16 :goto_6

    :cond_21
    sget-wide v4, Lf0/i1;->p:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_22

    sget-object v0, Lf0/t0;->V:Lf0/t0;

    goto/16 :goto_6

    :cond_22
    sget-wide v4, Lf0/i1;->q:J

    invoke-static {v0, v1, v4, v5}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_11

    goto/16 :goto_4

    :cond_23
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/input/key/a;->a(I)J

    move-result-wide v7

    sget-wide v9, Lf0/i1;->i:J

    invoke-static {v7, v8, v9, v10}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_24

    sget-object v0, Lf0/t0;->b:Lf0/t0;

    goto/16 :goto_6

    :cond_24
    sget-wide v9, Lf0/i1;->j:J

    invoke-static {v7, v8, v9, v10}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_25

    sget-object v0, Lf0/t0;->c:Lf0/t0;

    goto/16 :goto_6

    :cond_25
    sget-wide v9, Lf0/i1;->k:J

    invoke-static {v7, v8, v9, v10}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_26

    sget-object v0, Lf0/t0;->s:Lf0/t0;

    goto/16 :goto_6

    :cond_26
    sget-wide v9, Lf0/i1;->l:J

    invoke-static {v7, v8, v9, v10}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_27

    sget-object v0, Lf0/t0;->t:Lf0/t0;

    goto/16 :goto_6

    :cond_27
    sget-wide v9, Lf0/i1;->m:J

    invoke-static {v7, v8, v9, v10}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_28

    sget-object v0, Lf0/t0;->u:Lf0/t0;

    goto/16 :goto_6

    :cond_28
    sget-wide v9, Lf0/i1;->n:J

    invoke-static {v7, v8, v9, v10}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_29

    sget-object v0, Lf0/t0;->v:Lf0/t0;

    goto :goto_6

    :cond_29
    sget-wide v9, Lf0/i1;->o:J

    invoke-static {v7, v8, v9, v10}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2a

    sget-object v0, Lf0/t0;->o:Lf0/t0;

    goto :goto_6

    :cond_2a
    sget-wide v9, Lf0/i1;->p:J

    invoke-static {v7, v8, v9, v10}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2b

    sget-object v0, Lf0/t0;->p:Lf0/t0;

    goto :goto_6

    :cond_2b
    sget-wide v9, Lf0/i1;->r:J

    invoke-static {v7, v8, v9, v10}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2c

    sget-object v0, Lf0/t0;->Z:Lf0/t0;

    goto :goto_6

    :cond_2c
    sget-wide v9, Lf0/i1;->s:J

    invoke-static {v7, v8, v9, v10}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2d

    goto :goto_6

    :cond_2d
    sget-wide v0, Lf0/i1;->t:J

    invoke-static {v7, v8, v0, v1}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2e

    sget-object v0, Lf0/t0;->C:Lf0/t0;

    goto :goto_6

    :cond_2e
    sget-wide v0, Lf0/i1;->u:J

    invoke-static {v7, v8, v0, v1}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_2f

    goto/16 :goto_4

    :cond_2f
    sget-wide v0, Lf0/i1;->v:J

    invoke-static {v7, v8, v0, v1}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_30

    goto/16 :goto_5

    :cond_30
    sget-wide v0, Lf0/i1;->w:J

    invoke-static {v7, v8, v0, v1}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_31

    goto/16 :goto_3

    :cond_31
    sget-wide v0, Lf0/i1;->x:J

    invoke-static {v7, v8, v0, v1}, Lm1/a;->a(JJ)Z

    move-result p1

    if-eqz p1, :cond_11

    sget-object v0, Lf0/t0;->a0:Lf0/t0;

    :goto_6
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public collect(Lp9/g;Lu8/e;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, La4/c0;->a:I

    const/4 v2, 0x1

    iget-object v3, p0, La4/c0;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    instance-of v1, p2, Lp9/a;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lp9/a;

    iget v4, v1, Lp9/a;->d:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v1, Lp9/a;->d:I

    goto :goto_0

    :cond_0
    new-instance v1, Lp9/a;

    invoke-direct {v1, p0, p2}, Lp9/a;-><init>(La4/c0;Lu8/e;)V

    :goto_0
    iget-object p2, v1, Lp9/a;->b:Ljava/lang/Object;

    sget-object v4, Lv8/a;->a:Lv8/a;

    iget v5, v1, Lp9/a;->d:I

    if-eqz v5, :cond_2

    if-ne v5, v2, :cond_1

    iget-object p1, v1, Lp9/a;->a:Lq9/u;

    :try_start_0
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ld7/t;->v0(Ljava/lang/Object;)V

    new-instance p2, Lq9/u;

    invoke-interface {v1}, Lu8/e;->getContext()Lu8/j;

    move-result-object v5

    invoke-direct {p2, p1, v5}, Lq9/u;-><init>(Lp9/g;Lu8/j;)V

    :try_start_1
    iput-object p2, v1, Lp9/a;->a:Lq9/u;

    iput v2, v1, Lp9/a;->d:I

    check-cast v3, Lc9/e;

    invoke-interface {v3, p2, v1}, Lc9/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v4, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v0

    :goto_1
    if-ne p1, v4, :cond_4

    move-object v0, v4

    goto :goto_3

    :cond_4
    move-object p1, p2

    :goto_2
    invoke-virtual {p1}, Lq9/u;->releaseIntercepted()V

    :goto_3
    return-object v0

    :goto_4
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto :goto_5

    :catchall_1
    move-exception p1

    goto :goto_4

    :goto_5
    invoke-virtual {p1}, Lq9/u;->releaseIntercepted()V

    throw p2

    :pswitch_0
    invoke-interface {p1, v3, p2}, Lp9/g;->emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_5

    move-object v0, p1

    :cond_5
    return-object v0

    :pswitch_1
    check-cast v3, Lp9/f;

    new-instance v1, Lu1/o3;

    invoke-direct {v1, p1, v2}, Lu1/o3;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v3, v1, p2}, Lp9/f;->collect(Lp9/g;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_6

    move-object v0, p1

    :cond_6
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d()Ljava/lang/Object;
    .locals 5

    iget v0, p0, La4/c0;->a:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    add-int/lit8 v2, v0, -0x1

    iget-object v3, p0, La4/c0;->b:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, [Ljava/lang/Object;

    aget-object v4, v4, v2

    check-cast v3, [Ljava/lang/Object;

    aput-object v1, v3, v2

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, La4/c0;->a:I

    return-object v4

    :cond_0
    return-object v1
.end method

.method public e(Lv/r1;FFLw/c;Lw/g;)Ljava/lang/Object;
    .locals 10

    const/4 v0, 0x0

    iget v1, p0, La4/c0;->a:I

    iget-object v2, p0, La4/c0;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    invoke-static {v0, p3}, Lt/e;->b(FF)Lt/o;

    move-result-object v6

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    invoke-static {p3}, Ljava/lang/Math;->signum(F)F

    move-result p3

    mul-float v4, p3, v0

    move-object v7, v2

    check-cast v7, Lt/n;

    move-object v3, p1

    move v5, p2

    move-object v8, p4

    move-object v9, p5

    invoke-static/range {v3 .. v9}, Lw/l;->b(Lv/r1;FFLt/o;Lt/n;Lw/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lw/a;

    :goto_0
    return-object p1

    :pswitch_0
    invoke-static {v0, p3}, Lt/e;->b(FF)Lt/o;

    move-result-object p3

    move-object v3, v2

    check-cast v3, Lt/y;

    move-object v0, p1

    move v1, p2

    move-object v2, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lw/l;->a(Lv/r1;FLt/o;Lt/y;Lw/c;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lv8/a;->a:Lv8/a;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lw/a;

    :goto_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(I)Lt/f0;
    .locals 2

    iget-object v0, p0, La4/c0;->b:Ljava/lang/Object;

    iget v1, p0, La4/c0;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast v0, Lt/f0;

    return-object v0

    :pswitch_0
    packed-switch v1, :pswitch_data_1

    check-cast v0, Lt/h0;

    goto :goto_0

    :pswitch_1
    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lt/h0;

    :goto_0
    return-object v0

    :pswitch_2
    packed-switch v1, :pswitch_data_2

    check-cast v0, Lt/h0;

    goto :goto_1

    :pswitch_3
    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lt/h0;

    :goto_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch
.end method

.method public h(Landroid/view/View;)I
    .locals 2

    iget v0, p0, La4/c0;->a:I

    iget-object v1, p0, La4/c0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/f0;

    check-cast v1, La4/e0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    iget-object p1, p1, La4/f0;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, p1

    return v1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/f0;

    check-cast v1, La4/e0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    iget-object p1, p1, La4/f0;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, p1

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i(Landroid/view/View;)I
    .locals 2

    iget v0, p0, La4/c0;->a:I

    iget-object v1, p0, La4/c0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/f0;

    check-cast v1, La4/e0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    iget-object p1, p1, La4/f0;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v1, p1

    return v1

    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, La4/f0;

    check-cast v1, La4/e0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, La4/f0;

    iget-object p1, p1, La4/f0;->a:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, p1

    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v1, p1

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public j()Z
    .locals 2

    iget v0, p0, La4/c0;->a:I

    iget-object v1, p0, La4/c0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()I
    .locals 2

    iget-object v0, p0, La4/c0;->b:Ljava/lang/Object;

    check-cast v0, [I

    iget v1, p0, La4/c0;->a:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, La4/c0;->a:I

    aget v0, v0, v1

    return v0
.end method

.method public l(III)V
    .locals 4

    iget v0, p0, La4/c0;->a:I

    add-int/lit8 v1, v0, 0x3

    iget-object v2, p0, La4/c0;->b:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, [I

    array-length v3, v3

    if-lt v1, v3, :cond_0

    move-object v3, v2

    check-cast v3, [I

    check-cast v2, [I

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    const-string v3, "copyOf(this, newSize)"

    invoke-static {v2, v3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, La4/c0;->b:Ljava/lang/Object;

    :cond_0
    iget-object v2, p0, La4/c0;->b:Ljava/lang/Object;

    check-cast v2, [I

    add-int/2addr p1, p3

    aput p1, v2, v0

    add-int/lit8 p1, v0, 0x1

    add-int/2addr p2, p3

    aput p2, v2, p1

    add-int/lit8 v0, v0, 0x2

    aput p3, v2, v0

    iput v1, p0, La4/c0;->a:I

    return-void
.end method

.method public m(IIII)V
    .locals 4

    iget v0, p0, La4/c0;->a:I

    add-int/lit8 v1, v0, 0x4

    iget-object v2, p0, La4/c0;->b:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, [I

    array-length v3, v3

    if-lt v1, v3, :cond_0

    move-object v3, v2

    check-cast v3, [I

    check-cast v2, [I

    array-length v2, v2

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    const-string v3, "copyOf(this, newSize)"

    invoke-static {v2, v3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, La4/c0;->b:Ljava/lang/Object;

    :cond_0
    iget-object v2, p0, La4/c0;->b:Ljava/lang/Object;

    check-cast v2, [I

    aput p1, v2, v0

    add-int/lit8 p1, v0, 0x1

    aput p2, v2, p1

    add-int/lit8 p1, v0, 0x2

    aput p3, v2, p1

    add-int/lit8 v0, v0, 0x3

    aput p4, v2, v0

    iput v1, p0, La4/c0;->a:I

    return-void
.end method

.method public n(II)V
    .locals 5

    if-ge p1, p2, :cond_3

    add-int/lit8 v0, p1, -0x3

    move v1, p1

    :goto_0
    if-ge v1, p2, :cond_2

    iget-object v2, p0, La4/c0;->b:Ljava/lang/Object;

    check-cast v2, [I

    aget v3, v2, v1

    aget v4, v2, p2

    if-lt v3, v4, :cond_0

    if-ne v3, v4, :cond_1

    add-int/lit8 v3, v1, 0x1

    aget v3, v2, v3

    add-int/lit8 v4, p2, 0x1

    aget v2, v2, v4

    if-gt v3, v2, :cond_1

    :cond_0
    add-int/lit8 v0, v0, 0x3

    invoke-virtual {p0, v0, v1}, La4/c0;->p(II)V

    :cond_1
    add-int/lit8 v1, v1, 0x3

    goto :goto_0

    :cond_2
    add-int/lit8 v1, v0, 0x3

    invoke-virtual {p0, v1, p2}, La4/c0;->p(II)V

    invoke-virtual {p0, p1, v0}, La4/c0;->n(II)V

    add-int/lit8 v0, v0, 0x6

    invoke-virtual {p0, v0, p2}, La4/c0;->n(II)V

    :cond_3
    return-void
.end method

.method public o(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, La4/c0;->a:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, La4/c0;->b:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    aget-object v1, v1, v0

    if-eq v1, p1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already in the pool!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, La4/c0;->b:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    array-length v2, v0

    if-ge v1, v2, :cond_2

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La4/c0;->a:I

    :cond_2
    return-void
.end method

.method public p(II)V
    .locals 5

    iget-object v0, p0, La4/c0;->b:Ljava/lang/Object;

    check-cast v0, [I

    aget v1, v0, p1

    aget v2, v0, p2

    aput v2, v0, p1

    aput v1, v0, p2

    add-int/lit8 v1, p1, 0x1

    add-int/lit8 v2, p2, 0x1

    aget v3, v0, v1

    aget v4, v0, v2

    aput v4, v0, v1

    aput v3, v0, v2

    add-int/lit8 p1, p1, 0x2

    add-int/lit8 p2, p2, 0x2

    aget v1, v0, p1

    aget v2, v0, p2

    aput v2, v0, p1

    aput v1, v0, p2

    return-void
.end method
