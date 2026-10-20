.class public final Lt1/b1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lt1/c1;

.field public final synthetic c:Ly0/n;

.field public final synthetic d:Lt1/z0;

.field public final synthetic e:J

.field public final synthetic f:Lt1/v;

.field public final synthetic n:Z

.field public final synthetic o:Z

.field public final synthetic p:F


# direct methods
.method public synthetic constructor <init>(Lt1/c1;Ly0/n;Lt1/z0;JLt1/v;ZZFI)V
    .locals 0

    iput p10, p0, Lt1/b1;->a:I

    iput-object p1, p0, Lt1/b1;->b:Lt1/c1;

    iput-object p2, p0, Lt1/b1;->c:Ly0/n;

    iput-object p3, p0, Lt1/b1;->d:Lt1/z0;

    iput-wide p4, p0, Lt1/b1;->e:J

    iput-object p6, p0, Lt1/b1;->f:Lt1/v;

    iput-boolean p7, p0, Lt1/b1;->n:Z

    iput-boolean p8, p0, Lt1/b1;->o:Z

    iput p9, p0, Lt1/b1;->p:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lt1/b1;->a:I

    packed-switch v1, :pswitch_data_0

    .line 1
    invoke-virtual {p0}, Lt1/b1;->invoke()V

    return-object v0

    .line 2
    :pswitch_0
    invoke-virtual {p0}, Lt1/b1;->invoke()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()V
    .locals 26

    move-object/from16 v0, p0

    const/16 v1, 0x10

    const/16 v2, 0x8

    iget v3, v0, Lt1/b1;->a:I

    iget-object v4, v0, Lt1/b1;->c:Ly0/n;

    iget-object v5, v0, Lt1/b1;->d:Lt1/z0;

    packed-switch v3, :pswitch_data_0

    iget-object v6, v0, Lt1/b1;->b:Lt1/c1;

    check-cast v5, Lx9/v;

    .line 3
    iget v3, v5, Lx9/v;->a:I

    packed-switch v3, :pswitch_data_1

    move v1, v2

    .line 4
    :pswitch_0
    invoke-static {v4, v1}, Lt1/g;->e(Lt1/n;I)Ly0/n;

    move-result-object v7

    iget-object v8, v0, Lt1/b1;->d:Lt1/z0;

    iget-wide v9, v0, Lt1/b1;->e:J

    iget-object v11, v0, Lt1/b1;->f:Lt1/v;

    iget-boolean v12, v0, Lt1/b1;->n:Z

    iget-boolean v13, v0, Lt1/b1;->o:Z

    iget v14, v0, Lt1/b1;->p:F

    .line 5
    invoke-virtual/range {v6 .. v14}, Lt1/c1;->Y0(Ly0/n;Lt1/z0;JLt1/v;ZZF)V

    return-void

    :pswitch_1
    iget-object v3, v0, Lt1/b1;->b:Lt1/c1;

    check-cast v5, Lx9/v;

    .line 6
    iget v5, v5, Lx9/v;->a:I

    packed-switch v5, :pswitch_data_2

    move v1, v2

    .line 7
    :pswitch_2
    invoke-static {v4, v1}, Lt1/g;->e(Lt1/n;I)Ly0/n;

    move-result-object v1

    iget-object v2, v0, Lt1/b1;->d:Lt1/z0;

    iget-wide v4, v0, Lt1/b1;->e:J

    iget-object v6, v0, Lt1/b1;->f:Lt1/v;

    iget-boolean v7, v0, Lt1/b1;->n:Z

    iget-boolean v8, v0, Lt1/b1;->o:Z

    iget v9, v0, Lt1/b1;->p:F

    if-nez v1, :cond_0

    move-object v15, v3

    move-object/from16 v16, v2

    move-wide/from16 v17, v4

    move-object/from16 v19, v6

    move/from16 v20, v7

    move/from16 v21, v8

    .line 8
    invoke-virtual/range {v15 .. v21}, Lt1/c1;->O0(Lt1/z0;JLt1/v;ZZ)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    new-instance v10, Lt1/b1;

    const/16 v25, 0x0

    move-object v15, v10

    move-object/from16 v16, v3

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    move-wide/from16 v19, v4

    move-object/from16 v21, v6

    move/from16 v22, v7

    move/from16 v23, v8

    move/from16 v24, v9

    invoke-direct/range {v15 .. v25}, Lt1/b1;-><init>(Lt1/c1;Ly0/n;Lt1/z0;JLt1/v;ZZFI)V

    invoke-virtual {v6, v1, v9, v8, v10}, Lt1/v;->i(Ly0/n;FZLc9/a;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_2
    .end packed-switch
.end method
