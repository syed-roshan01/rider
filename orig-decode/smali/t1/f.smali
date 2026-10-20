.class public final Lt1/f;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lt1/f;

.field public static final c:Lt1/f;

.field public static final d:Lt1/f;

.field public static final e:Lt1/f;

.field public static final f:Lt1/f;

.field public static final n:Lt1/f;

.field public static final o:Lt1/f;

.field public static final p:Lt1/f;

.field public static final q:Lt1/f;

.field public static final r:Lt1/f;

.field public static final s:Lt1/f;

.field public static final t:Lt1/f;

.field public static final u:Lt1/f;

.field public static final v:Lt1/f;

.field public static final w:Lt1/f;

.field public static final x:Lt1/f;

.field public static final y:Lt1/f;

.field public static final z:Lt1/f;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lt1/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->b:Lt1/f;

    new-instance v0, Lt1/f;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->c:Lt1/f;

    new-instance v0, Lt1/f;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->d:Lt1/f;

    new-instance v0, Lt1/f;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->e:Lt1/f;

    new-instance v0, Lt1/f;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->f:Lt1/f;

    new-instance v0, Lt1/f;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->n:Lt1/f;

    new-instance v0, Lt1/f;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->o:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->p:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->q:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->r:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->s:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->t:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->u:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->v:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->w:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->x:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->y:Lt1/f;

    new-instance v0, Lt1/f;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lt1/f;-><init>(I)V

    sput-object v0, Lt1/f;->z:Lt1/f;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lt1/f;->a:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/node/a;)V
    .locals 3

    iget v0, p0, Lt1/f;->a:I

    const/4 v1, 0x3

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->A()V

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, v2, v1}, Landroidx/compose/ui/node/a;->Q(Landroidx/compose/ui/node/a;ZI)V

    :cond_1
    return-void

    :pswitch_1
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1, v2, v1}, Landroidx/compose/ui/node/a;->O(Landroidx/compose/ui/node/a;ZI)V

    :cond_2
    return-void

    :pswitch_2
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1, v2}, Landroidx/compose/ui/node/a;->N(Z)V

    :cond_3
    return-void

    :pswitch_3
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v2}, Landroidx/compose/ui/node/a;->N(Z)V

    :cond_4
    return-void

    :pswitch_4
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1, v2}, Landroidx/compose/ui/node/a;->P(Z)V

    :cond_5
    return-void

    :pswitch_5
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->C()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1, v2}, Landroidx/compose/ui/node/a;->P(Z)V

    :cond_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lt1/b;)V
    .locals 2

    iget v0, p0, Lt1/f;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    invoke-interface {p1}, Lt1/b;->d()Lt1/a;

    move-result-object p1

    iput-boolean v1, p1, Lt1/a;->c:Z

    return-void

    :pswitch_0
    invoke-interface {p1}, Lt1/b;->d()Lt1/a;

    move-result-object v0

    invoke-interface {p1}, Lt1/b;->d()Lt1/a;

    move-result-object p1

    iget-boolean p1, p1, Lt1/a;->d:Z

    iput-boolean p1, v0, Lt1/a;->e:Z

    return-void

    :pswitch_1
    invoke-interface {p1}, Lt1/b;->d()Lt1/a;

    move-result-object p1

    iput-boolean v1, p1, Lt1/a;->d:Z

    return-void

    :pswitch_2
    invoke-interface {p1}, Lt1/b;->d()Lt1/a;

    move-result-object p1

    iput-boolean v1, p1, Lt1/a;->c:Z

    return-void

    :pswitch_3
    invoke-interface {p1}, Lt1/b;->d()Lt1/a;

    move-result-object v0

    invoke-interface {p1}, Lt1/b;->d()Lt1/a;

    move-result-object p1

    iget-boolean p1, p1, Lt1/a;->d:Z

    iput-boolean p1, v0, Lt1/a;->e:Z

    return-void

    :pswitch_4
    invoke-interface {p1}, Lt1/b;->d()Lt1/a;

    move-result-object p1

    iput-boolean v1, p1, Lt1/a;->d:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lt1/c1;)V
    .locals 6

    iget v0, p0, Lt1/f;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lt1/c1;->w()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, Lt1/c1;->D:Lt1/z;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Lt1/c1;->d1(Z)V

    goto/16 :goto_0

    :cond_0
    sget-object v2, Lt1/c1;->J:Lt1/z;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v0, Lt1/z;->a:F

    iput v3, v2, Lt1/z;->a:F

    iget v3, v0, Lt1/z;->b:F

    iput v3, v2, Lt1/z;->b:F

    iget v3, v0, Lt1/z;->c:F

    iput v3, v2, Lt1/z;->c:F

    iget v3, v0, Lt1/z;->d:F

    iput v3, v2, Lt1/z;->d:F

    iget v3, v0, Lt1/z;->e:F

    iput v3, v2, Lt1/z;->e:F

    iget v3, v0, Lt1/z;->f:F

    iput v3, v2, Lt1/z;->f:F

    iget v3, v0, Lt1/z;->g:F

    iput v3, v2, Lt1/z;->g:F

    iget v3, v0, Lt1/z;->h:F

    iput v3, v2, Lt1/z;->h:F

    iget-wide v3, v0, Lt1/z;->i:J

    iput-wide v3, v2, Lt1/z;->i:J

    invoke-virtual {p1, v1}, Lt1/c1;->d1(Z)V

    iget v3, v2, Lt1/z;->a:F

    iget v4, v0, Lt1/z;->a:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    iget v3, v2, Lt1/z;->b:F

    iget v4, v0, Lt1/z;->b:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    iget v3, v2, Lt1/z;->c:F

    iget v4, v0, Lt1/z;->c:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    iget v3, v2, Lt1/z;->d:F

    iget v4, v0, Lt1/z;->d:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    iget v3, v2, Lt1/z;->e:F

    iget v4, v0, Lt1/z;->e:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    iget v3, v2, Lt1/z;->f:F

    iget v4, v0, Lt1/z;->f:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    iget v3, v2, Lt1/z;->g:F

    iget v4, v0, Lt1/z;->g:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    iget v3, v2, Lt1/z;->h:F

    iget v4, v0, Lt1/z;->h:F

    cmpg-float v3, v3, v4

    if-nez v3, :cond_1

    iget-wide v2, v2, Lt1/z;->i:J

    iget-wide v4, v0, Lt1/z;->i:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lt1/c1;->p:Landroidx/compose/ui/node/a;

    iget-object v0, p1, Landroidx/compose/ui/node/a;->D:Lt1/n0;

    iget v2, v0, Lt1/n0;->n:I

    if-lez v2, :cond_4

    iget-boolean v2, v0, Lt1/n0;->m:Z

    if-nez v2, :cond_2

    iget-boolean v2, v0, Lt1/n0;->l:Z

    if-eqz v2, :cond_3

    :cond_2
    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroidx/compose/ui/node/a;->P(Z)V

    :cond_3
    iget-object v0, v0, Lt1/n0;->o:Lt1/l0;

    invoke-virtual {v0}, Lt1/l0;->s0()V

    :cond_4
    iget-object v0, p1, Landroidx/compose/ui/node/a;->p:Lt1/l1;

    if-eqz v0, :cond_5

    check-cast v0, Lu1/w;

    iget-object v2, v0, Lu1/w;->L:Lt1/t0;

    iget-object v2, v2, Lt1/t0;->d:Lt1/i1;

    iget-object v2, v2, Lt1/i1;->a:Lo0/i;

    invoke-virtual {v2, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    iput-boolean v1, p1, Landroidx/compose/ui/node/a;->I:Z

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lu1/w;->z(Landroidx/compose/ui/node/a;)V

    :cond_5
    :goto_0
    return-void

    :pswitch_0
    iget-object p1, p1, Lt1/c1;->H:Lt1/j1;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lt1/j1;->invalidate()V

    :cond_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lt1/f;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Lt1/f;->a(Landroidx/compose/ui/node/a;)V

    return-object v0

    :pswitch_0
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Lt1/f;->a(Landroidx/compose/ui/node/a;)V

    return-object v0

    :pswitch_1
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Lt1/f;->a(Landroidx/compose/ui/node/a;)V

    return-object v0

    :pswitch_2
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Lt1/f;->a(Landroidx/compose/ui/node/a;)V

    return-object v0

    :pswitch_3
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Lt1/f;->a(Landroidx/compose/ui/node/a;)V

    return-object v0

    :pswitch_4
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Lt1/f;->a(Landroidx/compose/ui/node/a;)V

    return-object v0

    :pswitch_5
    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p0, p1}, Lt1/f;->a(Landroidx/compose/ui/node/a;)V

    return-object v0

    :pswitch_6
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lt1/m1;

    invoke-interface {p1}, Lt1/m1;->w()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lt1/g1;

    invoke-virtual {p1}, Lt1/g1;->w()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Lt1/g1;->a:Lt1/f1;

    invoke-interface {p1}, Lt1/f1;->G()V

    :cond_0
    return-object v0

    :pswitch_8
    check-cast p1, Lt1/c1;

    invoke-virtual {p0, p1}, Lt1/f;->d(Lt1/c1;)V

    return-object v0

    :pswitch_9
    check-cast p1, Lt1/c1;

    invoke-virtual {p0, p1}, Lt1/f;->d(Lt1/c1;)V

    return-object v0

    :pswitch_a
    check-cast p1, Lt1/b;

    invoke-virtual {p0, p1}, Lt1/f;->b(Lt1/b;)V

    return-object v0

    :pswitch_b
    check-cast p1, Lt1/b;

    invoke-virtual {p0, p1}, Lt1/f;->b(Lt1/b;)V

    return-object v0

    :pswitch_c
    check-cast p1, Lt1/b;

    invoke-virtual {p0, p1}, Lt1/f;->b(Lt1/b;)V

    return-object v0

    :pswitch_d
    check-cast p1, Lt1/b;

    invoke-virtual {p0, p1}, Lt1/f;->b(Lt1/b;)V

    return-object v0

    :pswitch_e
    check-cast p1, Lt1/b;

    invoke-virtual {p0, p1}, Lt1/f;->b(Lt1/b;)V

    return-object v0

    :pswitch_f
    check-cast p1, Lt1/b;

    invoke-virtual {p0, p1}, Lt1/f;->b(Lt1/b;)V

    return-object v0

    :pswitch_10
    check-cast p1, Lt1/d;

    packed-switch v1, :pswitch_data_1

    invoke-virtual {p1}, Lt1/d;->I0()V

    goto :goto_0

    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lt1/g;->s(Lt1/s;)V

    :goto_0
    return-object v0

    :pswitch_12
    check-cast p1, Lt1/d;

    packed-switch v1, :pswitch_data_2

    invoke-virtual {p1}, Lt1/d;->I0()V

    goto :goto_1

    :pswitch_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lt1/g;->s(Lt1/s;)V

    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_12
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_11
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_13
    .end packed-switch
.end method
