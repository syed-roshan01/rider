.class public final Lu/x;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lu/x;->a:I

    iput-object p1, p0, Lu/x;->c:Ljava/lang/Object;

    iput p2, p0, Lu/x;->b:I

    iput-object p3, p0, Lu/x;->d:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p4, p0, Lu/x;->a:I

    iput-object p1, p0, Lu/x;->c:Ljava/lang/Object;

    iput-object p2, p0, Lu/x;->d:Ljava/lang/Object;

    iput p3, p0, Lu/x;->b:I

    const/4 p1, 0x2

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    iget v1, v0, Lu/x;->a:I

    const/4 v2, 0x2

    const/16 v3, 0xb

    iget v4, v0, Lu/x;->b:I

    iget-object v7, v0, Lu/x;->d:Ljava/lang/Object;

    iget-object v5, v0, Lu/x;->c:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    check-cast v5, Ljava/lang/String;

    check-cast v7, Ljava/lang/String;

    or-int/lit8 v1, v4, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v1

    invoke-static {v5, v7, v8, v1}, Ld5/o1;->h(Ljava/lang/String;Ljava/lang/String;Lm0/m;I)V

    return-void

    :pswitch_0
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v2, :cond_1

    move-object v1, v8

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_5

    :cond_1
    :goto_0
    check-cast v5, Lb0/h0;

    iget-object v1, v5, Lb0/h0;->e:Lb0/a0;

    iget-object v1, v1, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v1}, Lm0/u2;->d()I

    move-result v1

    if-ne v1, v4, :cond_2

    sget-object v1, Lf2/l;->f:Lf2/l;

    :goto_1
    move-object/from16 v22, v1

    goto :goto_2

    :cond_2
    sget-object v1, Lf2/l;->d:Lf2/l;

    goto :goto_1

    :goto_2
    iget-object v1, v5, Lb0/h0;->e:Lb0/a0;

    iget-object v1, v1, Lb0/a0;->b:Lm0/l1;

    invoke-virtual {v1}, Lm0/u2;->d()I

    move-result v1

    if-ne v1, v4, :cond_3

    sget-wide v1, Le5/a;->a:J

    :goto_3
    move-wide/from16 v26, v1

    goto :goto_4

    :cond_3
    sget-wide v1, Le5/a;->m:J

    goto :goto_3

    :goto_4
    invoke-static {v3}, Lo1/s;->N(I)J

    move-result-wide v5

    move-object v1, v7

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0xc00

    const/16 v24, 0x0

    const v25, 0x1ffd2

    move-wide/from16 v3, v26

    move-object/from16 v8, v22

    move-object/from16 v22, p1

    invoke-static/range {v1 .. v25}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_5
    return-void

    :pswitch_1
    check-cast v5, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    check-cast v7, Ljava/util/Map;

    or-int/lit8 v1, v4, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v1

    move-object/from16 v6, p1

    invoke-static {v5, v7, v6, v1}, Ld5/o1;->a(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/util/Map;Lm0/m;I)V

    return-void

    :pswitch_2
    move-object v6, v8

    check-cast v5, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    check-cast v7, Ljava/lang/String;

    or-int/lit8 v1, v4, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v1

    invoke-static {v5, v7, v6, v1}, Lf6/a;->e(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lm0/m;I)V

    return-void

    :pswitch_3
    move-object v6, v8

    check-cast v5, Lc9/a;

    check-cast v7, Lc9/a;

    or-int/lit8 v1, v4, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v1

    invoke-static {v5, v7, v6, v1}, Ly3/e;->j(Lc9/a;Lc9/a;Lm0/m;I)V

    return-void

    :pswitch_4
    move-object v6, v8

    check-cast v5, Lu1/w;

    check-cast v7, Lc9/e;

    or-int/lit8 v1, v4, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v1

    invoke-static {v5, v7, v6, v1}, Lu1/y0;->a(Lu1/w;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_5
    move-object v6, v8

    check-cast v5, Lu0/b;

    invoke-static {v4}, Lm0/s;->m(I)I

    move-result v1

    or-int/lit8 v1, v1, 0x1

    invoke-virtual {v5, v7, v6, v1}, Lu0/b;->d(Ljava/lang/Object;Lm0/m;I)Ljava/lang/Object;

    return-void

    :pswitch_6
    move-object v6, v8

    check-cast v5, Lm0/v1;

    check-cast v7, Lc9/e;

    or-int/lit8 v1, v4, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v1

    invoke-static {v5, v7, v6, v1}, Lf6/a;->b(Lm0/v1;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_7
    move-object v6, v8

    check-cast v5, [Lm0/v1;

    array-length v1, v5

    invoke-static {v5, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lm0/v1;

    check-cast v7, Lc9/e;

    or-int/lit8 v2, v4, 0x1

    invoke-static {v2}, Lm0/s;->m(I)I

    move-result v2

    invoke-static {v1, v7, v6, v2}, Lf6/a;->c([Lm0/v1;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_8
    move-object v6, v8

    check-cast v5, La2/c0;

    check-cast v7, Lc9/e;

    or-int/lit8 v1, v4, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v1

    invoke-static {v5, v7, v6, v1}, Lk0/c5;->a(La2/c0;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_9
    move-object v6, v8

    check-cast v5, Lc9/e;

    check-cast v7, Lc9/e;

    or-int/lit8 v1, v4, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v1

    invoke-static {v5, v7, v6, v1}, Lk0/c4;->d(Lc9/e;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_a
    move-object v6, v8

    and-int/lit8 v1, p2, 0xb

    if-ne v1, v2, :cond_5

    move-object v1, v6

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_6

    :cond_4
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_7

    :cond_5
    :goto_6
    check-cast v5, La0/s;

    const/16 v1, 0x40

    invoke-interface {v5, v4, v7, v6, v1}, La0/s;->e(ILjava/lang/Object;Lm0/m;I)V

    :goto_7
    return-void

    :pswitch_b
    move-object v6, v8

    check-cast v5, Ly0/o;

    check-cast v7, Lc9/c;

    or-int/lit8 v1, v4, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v1

    invoke-static {v5, v7, v6, v1}, Landroidx/compose/foundation/a;->b(Ly0/o;Lc9/c;Lm0/m;I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
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
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lu/x;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_2
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_3
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_4
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_5
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_6
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_7
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_8
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_9
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_a
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    :pswitch_b
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu/x;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
.end method
