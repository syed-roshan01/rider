.class public final Ls/e;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ly0/o;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lq8/a;

.field public final synthetic n:Lq8/a;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc9/e;Ly0/o;Lc9/e;Lc9/f;Ly/i1;Lk0/d5;II)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls/e;->a:I

    iput-object p1, p0, Ls/e;->e:Ljava/lang/Object;

    iput-object p2, p0, Ls/e;->b:Ly0/o;

    iput-object p3, p0, Ls/e;->f:Lq8/a;

    iput-object p4, p0, Ls/e;->n:Lq8/a;

    iput-object p5, p0, Ls/e;->o:Ljava/lang/Object;

    iput-object p6, p0, Ls/e;->p:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Ls/e;->q:Ljava/lang/Object;

    iput p7, p0, Ls/e;->c:I

    iput p8, p0, Ls/e;->d:I

    const/4 p1, 0x2

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ly0/o;Lc9/c;Ly0/d;Ljava/lang/String;Lc9/c;Lc9/g;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls/e;->a:I

    iput-object p1, p0, Ls/e;->e:Ljava/lang/Object;

    iput-object p2, p0, Ls/e;->b:Ly0/o;

    iput-object p3, p0, Ls/e;->f:Lq8/a;

    iput-object p4, p0, Ls/e;->o:Ljava/lang/Object;

    iput-object p5, p0, Ls/e;->p:Ljava/lang/Object;

    iput-object p6, p0, Ls/e;->n:Lq8/a;

    iput-object p7, p0, Ls/e;->q:Ljava/lang/Object;

    iput p8, p0, Ls/e;->c:I

    iput p9, p0, Ls/e;->d:I

    const/4 p1, 0x2

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 26

    move-object/from16 v0, p0

    iget v1, v0, Ls/e;->a:I

    iget v2, v0, Ls/e;->c:I

    iget-object v3, v0, Ls/e;->q:Ljava/lang/Object;

    iget-object v4, v0, Ls/e;->p:Ljava/lang/Object;

    iget-object v5, v0, Ls/e;->o:Ljava/lang/Object;

    iget-object v6, v0, Ls/e;->n:Lq8/a;

    iget-object v7, v0, Ls/e;->f:Lq8/a;

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Ls/e;->e:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lc9/e;

    iget-object v9, v0, Ls/e;->b:Ly0/o;

    move-object v10, v7

    check-cast v10, Lc9/e;

    move-object v11, v6

    check-cast v11, Lc9/f;

    move-object v12, v5

    check-cast v12, Ly/i1;

    move-object v13, v4

    check-cast v13, Lk0/d5;

    invoke-static {v3}, La7/a;->w(Ljava/lang/Object;)V

    or-int/lit8 v1, v2, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v15

    iget v1, v0, Ls/e;->d:I

    move-object/from16 v14, p1

    move/from16 v16, v1

    invoke-static/range {v8 .. v16}, Lk0/x;->b(Lc9/e;Ly0/o;Lc9/e;Lc9/f;Ly/i1;Lk0/d5;Lm0/m;II)V

    return-void

    :pswitch_0
    iget-object v1, v0, Ls/e;->e:Ljava/lang/Object;

    iget-object v8, v0, Ls/e;->b:Ly0/o;

    move-object/from16 v18, v7

    check-cast v18, Lc9/c;

    move-object/from16 v19, v5

    check-cast v19, Ly0/d;

    move-object/from16 v20, v4

    check-cast v20, Ljava/lang/String;

    move-object/from16 v21, v6

    check-cast v21, Lc9/c;

    move-object/from16 v22, v3

    check-cast v22, Lc9/g;

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lm0/s;->m(I)I

    move-result v24

    iget v2, v0, Ls/e;->d:I

    move-object/from16 v16, v1

    move-object/from16 v17, v8

    move-object/from16 v23, p1

    move/from16 v25, v2

    invoke-static/range {v16 .. v25}, Ld9/i;->a(Ljava/lang/Object;Ly0/o;Lc9/c;Ly0/d;Ljava/lang/String;Lc9/c;Lc9/g;Lm0/m;II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Ls/e;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ls/e;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ls/e;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
