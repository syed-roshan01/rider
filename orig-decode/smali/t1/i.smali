.class public final Lt1/i;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# static fields
.field public static final b:Lt1/i;

.field public static final c:Lt1/i;

.field public static final d:Lt1/i;

.field public static final e:Lt1/i;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lt1/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt1/i;-><init>(I)V

    sput-object v0, Lt1/i;->b:Lt1/i;

    new-instance v0, Lt1/i;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lt1/i;-><init>(I)V

    sput-object v0, Lt1/i;->c:Lt1/i;

    new-instance v0, Lt1/i;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lt1/i;-><init>(I)V

    sput-object v0, Lt1/i;->d:Lt1/i;

    new-instance v0, Lt1/i;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lt1/i;-><init>(I)V

    sput-object v0, Lt1/i;->e:Lt1/i;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lt1/i;->a:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lt1/i;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lt1/l;

    check-cast p2, Lu1/y2;

    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/node/a;->Y(Lu1/y2;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lt1/l;

    check-cast p2, Lm0/b0;

    check-cast p1, Landroidx/compose/ui/node/a;

    iput-object p2, p1, Landroidx/compose/ui/node/a;->A:Lm0/b0;

    sget-object v1, Lu1/s1;->e:Lm0/m3;

    check-cast p2, Lu0/e;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, v1}, Ld7/t;->k0(Lm0/r1;Lm0/u1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/b;

    invoke-virtual {p1, v1}, Landroidx/compose/ui/node/a;->U(Lm2/b;)V

    sget-object v1, Lu1/s1;->k:Lm0/m3;

    invoke-static {p2, v1}, Ld7/t;->k0(Lm0/r1;Lm0/u1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/l;

    iget-object v2, p1, Landroidx/compose/ui/node/a;->y:Lm2/l;

    if-eq v2, v1, :cond_1

    iput-object v1, p1, Landroidx/compose/ui/node/a;->y:Lm2/l;

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->z()V

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/compose/ui/node/a;->x()V

    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->y()V

    :cond_1
    sget-object v1, Lu1/s1;->p:Lm0/m3;

    invoke-static {p2, v1}, Ld7/t;->k0(Lm0/r1;Lm0/u1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lu1/y2;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/node/a;->Y(Lu1/y2;)V

    iget-object p1, p1, Landroidx/compose/ui/node/a;->C:Lt1/x0;

    iget-object p1, p1, Lt1/x0;->e:Ly0/n;

    iget p2, p1, Ly0/n;->d:I

    const v1, 0x8000

    and-int/2addr p2, v1

    if-eqz p2, :cond_b

    :goto_0
    if-eqz p1, :cond_b

    iget p2, p1, Ly0/n;->c:I

    and-int/2addr p2, v1

    if-eqz p2, :cond_a

    const/4 p2, 0x0

    move-object v2, p1

    move-object v3, p2

    :goto_1
    if-eqz v2, :cond_a

    instance-of v4, v2, Lt1/m;

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    check-cast v2, Lt1/m;

    check-cast v2, Ly0/n;

    iget-object v2, v2, Ly0/n;->a:Ly0/n;

    iget-boolean v4, v2, Ly0/n;->t:Z

    if-eqz v4, :cond_2

    invoke-static {v2}, Lt1/g;->k(Ly0/n;)V

    goto :goto_4

    :cond_2
    iput-boolean v5, v2, Ly0/n;->q:Z

    goto :goto_4

    :cond_3
    iget v4, v2, Ly0/n;->c:I

    and-int/2addr v4, v1

    if-eqz v4, :cond_9

    instance-of v4, v2, Lt1/o;

    if-eqz v4, :cond_9

    move-object v4, v2

    check-cast v4, Lt1/o;

    iget-object v4, v4, Lt1/o;->v:Ly0/n;

    const/4 v6, 0x0

    :goto_2
    if-eqz v4, :cond_8

    iget v7, v4, Ly0/n;->c:I

    and-int/2addr v7, v1

    if-eqz v7, :cond_7

    add-int/lit8 v6, v6, 0x1

    if-ne v6, v5, :cond_4

    move-object v2, v4

    goto :goto_3

    :cond_4
    if-nez v3, :cond_5

    new-instance v3, Lo0/i;

    const/16 v7, 0x10

    new-array v7, v7, [Ly0/n;

    invoke-direct {v3, v7}, Lo0/i;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v3, v2}, Lo0/i;->c(Ljava/lang/Object;)V

    move-object v2, p2

    :cond_6
    invoke-virtual {v3, v4}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_7
    :goto_3
    iget-object v4, v4, Ly0/n;->f:Ly0/n;

    goto :goto_2

    :cond_8
    if-ne v6, v5, :cond_9

    goto :goto_1

    :cond_9
    :goto_4
    invoke-static {v3}, Lt1/g;->f(Lo0/i;)Ly0/n;

    move-result-object v2

    goto :goto_1

    :cond_a
    iget p2, p1, Ly0/n;->d:I

    and-int/2addr p2, v1

    if-eqz p2, :cond_b

    iget-object p1, p1, Ly0/n;->f:Ly0/n;

    goto :goto_0

    :cond_b
    return-object v0

    :pswitch_1
    check-cast p1, Lt1/l;

    check-cast p2, Ly0/o;

    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/node/a;->X(Ly0/o;)V

    return-object v0

    :pswitch_2
    check-cast p1, Lt1/l;

    check-cast p2, Lr1/j0;

    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/node/a;->W(Lr1/j0;)V

    return-object v0

    :pswitch_3
    check-cast p1, Lt1/l;

    check-cast p2, Lm2/l;

    check-cast p1, Landroidx/compose/ui/node/a;

    iget-object v1, p1, Landroidx/compose/ui/node/a;->y:Lm2/l;

    if-eq v1, p2, :cond_d

    iput-object p2, p1, Landroidx/compose/ui/node/a;->y:Lm2/l;

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->z()V

    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->q()Landroidx/compose/ui/node/a;

    move-result-object p2

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Landroidx/compose/ui/node/a;->x()V

    :cond_c
    invoke-virtual {p1}, Landroidx/compose/ui/node/a;->y()V

    :cond_d
    return-object v0

    :pswitch_4
    check-cast p1, Lt1/l;

    check-cast p2, Lm2/b;

    check-cast p1, Landroidx/compose/ui/node/a;

    invoke-virtual {p1, p2}, Landroidx/compose/ui/node/a;->U(Lm2/b;)V

    return-object v0

    :pswitch_5
    check-cast p1, Lt1/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

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
