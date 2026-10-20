.class public final Ly/l0;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# static fields
.field public static final b:Ly/l0;

.field public static final c:Ly/l0;

.field public static final d:Ly/l0;

.field public static final e:Ly/l0;

.field public static final f:Ly/l0;

.field public static final n:Ly/l0;

.field public static final o:Ly/l0;

.field public static final p:Ly/l0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ly/l0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly/l0;-><init>(I)V

    sput-object v0, Ly/l0;->b:Ly/l0;

    new-instance v0, Ly/l0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ly/l0;-><init>(I)V

    sput-object v0, Ly/l0;->c:Ly/l0;

    new-instance v0, Ly/l0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ly/l0;-><init>(I)V

    sput-object v0, Ly/l0;->d:Ly/l0;

    new-instance v0, Ly/l0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ly/l0;-><init>(I)V

    sput-object v0, Ly/l0;->e:Ly/l0;

    new-instance v0, Ly/l0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ly/l0;-><init>(I)V

    sput-object v0, Ly/l0;->f:Ly/l0;

    new-instance v0, Ly/l0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ly/l0;-><init>(I)V

    sput-object v0, Ly/l0;->n:Ly/l0;

    new-instance v0, Ly/l0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ly/l0;-><init>(I)V

    sput-object v0, Ly/l0;->o:Ly/l0;

    new-instance v0, Ly/l0;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ly/l0;-><init>(I)V

    sput-object v0, Ly/l0;->p:Ly/l0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ly/l0;->a:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(IILjava/util/List;)Ljava/lang/Integer;
    .locals 15

    const/4 v6, 0x1

    const/4 v13, 0x2

    move-object v14, p0

    iget v0, v14, Ly/l0;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v1, Ly/j;->x:Ly/j;

    sget-object v2, Ly/j;->y:Ly/j;

    move-object/from16 v0, p3

    move/from16 v3, p1

    move/from16 v4, p2

    move v5, v13

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/a;->d(Ljava/util/List;Ly/j;Ly/j;IIII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v8, Ly/j;->v:Ly/j;

    sget-object v9, Ly/j;->w:Ly/j;

    move-object/from16 v7, p3

    move/from16 v10, p1

    move/from16 v11, p2

    move v12, v13

    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/layout/a;->d(Ljava/util/List;Ly/j;Ly/j;IIII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    sget-object v1, Ly/j;->t:Ly/j;

    sget-object v2, Ly/j;->u:Ly/j;

    move-object/from16 v0, p3

    move/from16 v3, p1

    move/from16 v4, p2

    move v5, v13

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/a;->d(Ljava/util/List;Ly/j;Ly/j;IIII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_2
    sget-object v8, Ly/j;->r:Ly/j;

    sget-object v9, Ly/j;->s:Ly/j;

    move-object/from16 v7, p3

    move/from16 v10, p1

    move/from16 v11, p2

    move v12, v13

    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/layout/a;->d(Ljava/util/List;Ly/j;Ly/j;IIII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_3
    sget-object v1, Ly/j;->p:Ly/j;

    sget-object v2, Ly/j;->q:Ly/j;

    move-object/from16 v0, p3

    move/from16 v3, p1

    move/from16 v4, p2

    move v5, v6

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/a;->d(Ljava/util/List;Ly/j;Ly/j;IIII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_4
    sget-object v1, Ly/j;->n:Ly/j;

    sget-object v2, Ly/j;->o:Ly/j;

    move-object/from16 v0, p3

    move/from16 v3, p1

    move/from16 v4, p2

    move v5, v6

    move v6, v13

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/a;->d(Ljava/util/List;Ly/j;Ly/j;IIII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_5
    sget-object v1, Ly/j;->e:Ly/j;

    sget-object v2, Ly/j;->f:Ly/j;

    move-object/from16 v0, p3

    move/from16 v3, p1

    move/from16 v4, p2

    move v5, v6

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/a;->d(Ljava/util/List;Ly/j;Ly/j;IIII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_6
    sget-object v1, Ly/j;->c:Ly/j;

    sget-object v2, Ly/j;->d:Ly/j;

    move-object/from16 v0, p3

    move/from16 v3, p1

    move/from16 v4, p2

    move v5, v6

    move v6, v13

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/a;->d(Ljava/util/List;Ly/j;Ly/j;IIII)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ly/l0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly0/o;

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    check-cast p2, Lm0/q;

    const p1, 0x15733969

    invoke-virtual {p2, p1}, Lm0/q;->Z(I)V

    sget-object p1, Ly/j1;->u:Ljava/util/WeakHashMap;

    invoke-static {p2}, Ly/c0;->c(Lm0/m;)Ly/j1;

    move-result-object p1

    const p3, 0x44faf204

    invoke-virtual {p2, p3}, Lm0/q;->Z(I)V

    invoke-virtual {p2, p1}, Lm0/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p2}, Lm0/q;->P()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_0

    sget-object p3, Lm0/l;->a:Lk0/y0;

    if-ne v0, p3, :cond_1

    :cond_0
    new-instance v0, Ly/i0;

    iget-object p1, p1, Ly/j1;->f:Ly/c;

    invoke-direct {v0, p1}, Ly/i0;-><init>(Ly/i1;)V

    invoke-virtual {p2, v0}, Lm0/q;->l0(Ljava/lang/Object;)V

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lm0/q;->t(Z)V

    check-cast v0, Ly/i0;

    invoke-virtual {p2, p1}, Lm0/q;->t(Z)V

    return-object v0

    :pswitch_0
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p2, p3, p1}, Ly/l0;->a(IILjava/util/List;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p2, p3, p1}, Ly/l0;->a(IILjava/util/List;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p2, p3, p1}, Ly/l0;->a(IILjava/util/List;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p2, p3, p1}, Ly/l0;->a(IILjava/util/List;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p2, p3, p1}, Ly/l0;->a(IILjava/util/List;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p2, p3, p1}, Ly/l0;->a(IILjava/util/List;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p2, p3, p1}, Ly/l0;->a(IILjava/util/List;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p2, p3, p1}, Ly/l0;->a(IILjava/util/List;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
