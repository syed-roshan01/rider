.class public final Ly/r;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p7, p0, Ly/r;->a:I

    iput-object p1, p0, Ly/r;->b:Ljava/lang/Object;

    iput-object p2, p0, Ly/r;->c:Ljava/lang/Object;

    iput-object p3, p0, Ly/r;->d:Ljava/lang/Object;

    iput-object p4, p0, Ly/r;->e:Ljava/lang/Object;

    iput-object p5, p0, Ly/r;->f:Ljava/lang/Object;

    iput-object p6, p0, Ly/r;->n:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Ly/r;->a:I

    iget-object v2, v0, Ly/r;->n:Ljava/lang/Object;

    iget-object v3, v0, Ly/r;->f:Ljava/lang/Object;

    iget-object v4, v0, Ly/r;->e:Ljava/lang/Object;

    iget-object v5, v0, Ly/r;->d:Ljava/lang/Object;

    iget-object v6, v0, Ly/r;->b:Ljava/lang/Object;

    iget-object v7, v0, Ly/r;->c:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Lm0/o0;

    const-string v8, "$this$DisposableEffect"

    invoke-static {v1, v8}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v7

    check-cast v11, Lm0/f1;

    move-object v1, v11

    check-cast v1, Lm0/w2;

    invoke-virtual {v1}, Lm0/w2;->d()J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v1, v7, v9

    if-nez v1, :cond_0

    new-instance v1, Lf0/q;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    goto :goto_1

    :cond_0
    new-instance v1, Ld5/w;

    check-cast v6, Landroid/content/Context;

    move-object v12, v5

    check-cast v12, Lm0/g1;

    move-object v13, v4

    check-cast v13, Lm0/g1;

    move-object v14, v3

    check-cast v14, Lm0/d1;

    move-object v15, v2

    check-cast v15, Lm0/g1;

    move-object v9, v1

    move-object v10, v6

    invoke-direct/range {v9 .. v15}, Ld5/w;-><init>(Landroid/content/Context;Lm0/f1;Lm0/g1;Lm0/g1;Lm0/d1;Lm0/g1;)V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    const-string v4, "android.intent.action.DOWNLOAD_COMPLETE"

    if-lt v2, v3, :cond_1

    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x2

    invoke-virtual {v6, v1, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :goto_0
    new-instance v2, Lt/r0;

    const/16 v3, 0x9

    invoke-direct {v2, v3, v6, v1}, Lt/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object v1, v2

    :goto_1
    return-object v1

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Lr1/w0;

    move-object v9, v6

    check-cast v9, [Lr1/x0;

    move-object v10, v7

    check-cast v10, Ljava/util/List;

    move-object v11, v5

    check-cast v11, Lr1/l0;

    move-object v12, v4

    check-cast v12, Ld9/s;

    move-object v13, v3

    check-cast v13, Ld9/s;

    move-object v14, v2

    check-cast v14, Ly/s;

    array-length v15, v9

    const/4 v2, 0x0

    move v8, v2

    :goto_2
    if-ge v8, v15, :cond_2

    aget-object v3, v9, v8

    add-int/lit8 v16, v2, 0x1

    const-string v4, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable"

    invoke-static {v3, v4}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lr1/i0;

    invoke-interface {v11}, Lr1/q;->getLayoutDirection()Lm2/l;

    move-result-object v5

    iget v6, v12, Ld9/s;->a:I

    iget v7, v13, Ld9/s;->a:I

    iget-object v2, v14, Ly/s;->a:Ly0/d;

    move-object/from16 v17, v2

    move-object v2, v1

    move/from16 v18, v8

    move-object/from16 v8, v17

    invoke-static/range {v2 .. v8}, Ly/p;->b(Lr1/w0;Lr1/x0;Lr1/i0;Lm2/l;IILy0/d;)V

    add-int/lit8 v8, v18, 0x1

    move/from16 v2, v16

    goto :goto_2

    :cond_2
    sget-object v1, Lq8/l;->a:Lq8/l;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
