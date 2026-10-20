.class public final Lc5/a;
.super Ld9/j;

# interfaces
.implements Lc9/f;


# static fields
.field public static final b:Lc5/a;

.field public static final c:Lc5/a;

.field public static final d:Lc5/a;

.field public static final e:Lc5/a;

.field public static final f:Lc5/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lc5/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc5/a;-><init>(I)V

    sput-object v0, Lc5/a;->b:Lc5/a;

    new-instance v0, Lc5/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc5/a;-><init>(I)V

    sput-object v0, Lc5/a;->c:Lc5/a;

    new-instance v0, Lc5/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lc5/a;-><init>(I)V

    sput-object v0, Lc5/a;->d:Lc5/a;

    new-instance v0, Lc5/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lc5/a;-><init>(I)V

    sput-object v0, Lc5/a;->e:Lc5/a;

    new-instance v0, Lc5/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lc5/a;-><init>(I)V

    sput-object v0, Lc5/a;->f:Lc5/a;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc5/a;->a:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly/a1;Lm0/m;I)V
    .locals 27

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p0

    iget v1, v3, Lc5/a;->a:I

    const-string v4, "$this$TextButton"

    const/16 v8, 0x10

    packed-switch v1, :pswitch_data_0

    invoke-static {v0, v4}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x51

    if-ne v0, v8, :cond_1

    move-object v0, v2

    check-cast v0, Lm0/q;

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm0/q;->U()V

    goto :goto_1

    :cond_1
    :goto_0
    const-string v0, "Exit App"

    const/4 v1, 0x0

    sget-wide v25, Le5/a;->m:J

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x186

    const/16 v23, 0x0

    const v24, 0x1fffa

    move-wide/from16 v2, v25

    move-object/from16 v21, p2

    invoke-static/range {v0 .. v24}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_1
    return-void

    :pswitch_0
    invoke-static {v0, v4}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x51

    move-object/from16 v7, p2

    if-ne v0, v8, :cond_3

    move-object v0, v7

    check-cast v0, Lm0/q;

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lm0/q;->U()V

    goto :goto_3

    :cond_3
    :goto_2
    const-string v0, "\ud83d\uddd1 Uninstall"

    const/4 v1, 0x0

    sget-wide v2, Le5/a;->n:J

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    sget-object v21, Lf2/l;->f:Lf2/l;

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v22, 0x30186

    const/16 v23, 0x0

    const v24, 0x1ffda

    move-object/from16 v7, v21

    move-object/from16 v21, p2

    invoke-static/range {v0 .. v24}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_3
    return-void

    :pswitch_1
    invoke-static {v0, v4}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x51

    move-object/from16 v7, p2

    if-ne v0, v8, :cond_5

    move-object v0, v7

    check-cast v0, Lm0/q;

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lm0/q;->U()V

    goto :goto_5

    :cond_5
    :goto_4
    const-string v0, "OK"

    const/4 v1, 0x0

    sget-wide v2, Le5/a;->a:J

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    sget-object v21, Lf2/l;->f:Lf2/l;

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v22, 0x30186

    const/16 v23, 0x0

    const v24, 0x1ffda

    move-object/from16 v7, v21

    move-object/from16 v21, p2

    invoke-static/range {v0 .. v24}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_5
    return-void

    :pswitch_2
    const-string v1, "$this$OutlinedButton"

    invoke-static {v0, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x51

    move-object/from16 v7, p2

    if-ne v0, v8, :cond_7

    move-object v0, v7

    check-cast v0, Lm0/q;

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Lm0/q;->U()V

    goto :goto_7

    :cond_7
    :goto_6
    sget-object v21, Lf2/l;->e:Lf2/l;

    const/16 v0, 0xf

    invoke-static {v0}, Lo1/s;->N(I)J

    move-result-wide v4

    sget-wide v2, Le5/a;->n:J

    const-string v0, "Exit App"

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v22, 0x30d86

    const/16 v23, 0x0

    const v24, 0x1ffd2

    move-object/from16 v7, v21

    move-object/from16 v21, p2

    invoke-static/range {v0 .. v24}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_7
    return-void

    :pswitch_3
    const-string v1, "$this$Button"

    invoke-static {v0, v1}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x51

    move-object/from16 v15, p2

    if-ne v0, v8, :cond_9

    move-object v0, v15

    check-cast v0, Lm0/q;

    invoke-virtual {v0}, Lm0/q;->G()Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Lm0/q;->U()V

    goto :goto_9

    :cond_9
    :goto_8
    invoke-static {}, Lf6/a;->S()Li1/f;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    sget-wide v25, Le5/a;->j:J

    const/16 v6, 0xc30

    const/4 v7, 0x4

    move-wide/from16 v3, v25

    move-object/from16 v5, p2

    invoke-static/range {v0 .. v7}, Lk0/e1;->b(Li1/f;Ljava/lang/String;Ly0/o;JLm0/m;II)V

    sget-object v0, Ly0/l;->b:Ly0/l;

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/c;->k(Ly0/o;F)Ly0/o;

    move-result-object v0

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/a;->c(Ly0/o;Lm0/m;)V

    sget-object v7, Lf2/l;->f:Lf2/l;

    invoke-static {v8}, Lo1/s;->N(I)J

    move-result-wide v4

    const-string v0, "Retry"

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v2, 0x0

    move v15, v2

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v22, 0x30d86

    const/16 v23, 0x0

    const v24, 0x1ffd2

    move-wide/from16 v2, v25

    move-object/from16 v21, p2

    invoke-static/range {v0 .. v24}, Lk0/c5;->b(Ljava/lang/String;Ly0/o;JJLf2/j;Lf2/l;Lf2/e;JLl2/j;Ll2/i;JIZIILc9/c;La2/c0;Lm0/m;III)V

    :goto_9
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lc5/a;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ly/a1;

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lc5/a;->a(Ly/a1;Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Ly/a1;

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lc5/a;->a(Ly/a1;Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Ly/a1;

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lc5/a;->a(Ly/a1;Lm0/m;I)V

    return-object v0

    :pswitch_2
    check-cast p1, Ly/a1;

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lc5/a;->a(Ly/a1;Lm0/m;I)V

    return-object v0

    :pswitch_3
    check-cast p1, Ly/a1;

    check-cast p2, Lm0/m;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lc5/a;->a(Ly/a1;Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
