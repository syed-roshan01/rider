.class public final Ls/m;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ly0/o;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lq8/a;


# direct methods
.method public constructor <init>(Lt/u1;Ly0/o;Lc9/c;Ly0/d;Lc9/c;Lc9/g;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls/m;->a:I

    iput-object p1, p0, Ls/m;->e:Ljava/lang/Object;

    iput-object p2, p0, Ls/m;->b:Ly0/o;

    iput-object p3, p0, Ls/m;->f:Ljava/lang/Object;

    iput-object p4, p0, Ls/m;->o:Ljava/lang/Object;

    iput-object p5, p0, Ls/m;->n:Ljava/lang/Object;

    iput-object p6, p0, Ls/m;->p:Lq8/a;

    iput p7, p0, Ls/m;->c:I

    iput p8, p0, Ls/m;->d:I

    const/4 p1, 0x2

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ly0/o;Le1/l0;Lk0/g0;Lk0/h0;Lu/w;Lc9/f;II)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls/m;->a:I

    iput-object p1, p0, Ls/m;->b:Ly0/o;

    iput-object p2, p0, Ls/m;->e:Ljava/lang/Object;

    iput-object p3, p0, Ls/m;->f:Ljava/lang/Object;

    iput-object p4, p0, Ls/m;->n:Ljava/lang/Object;

    iput-object p5, p0, Ls/m;->o:Ljava/lang/Object;

    iput-object p6, p0, Ls/m;->p:Lq8/a;

    iput p7, p0, Ls/m;->c:I

    iput p8, p0, Ls/m;->d:I

    const/4 p1, 0x2

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 25

    move-object/from16 v0, p0

    iget v1, v0, Ls/m;->a:I

    iget v2, v0, Ls/m;->c:I

    iget-object v3, v0, Ls/m;->p:Lq8/a;

    iget-object v4, v0, Ls/m;->o:Ljava/lang/Object;

    iget-object v5, v0, Ls/m;->n:Ljava/lang/Object;

    iget-object v6, v0, Ls/m;->f:Ljava/lang/Object;

    iget-object v7, v0, Ls/m;->e:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    iget-object v8, v0, Ls/m;->b:Ly0/o;

    move-object v9, v7

    check-cast v9, Le1/l0;

    move-object v10, v6

    check-cast v10, Lk0/g0;

    move-object v11, v5

    check-cast v11, Lk0/h0;

    move-object v12, v4

    check-cast v12, Lu/w;

    move-object v13, v3

    check-cast v13, Lc9/f;

    or-int/lit8 v1, v2, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v15

    iget v1, v0, Ls/m;->d:I

    move-object/from16 v14, p1

    move/from16 v16, v1

    invoke-static/range {v8 .. v16}, Lf6/a;->a(Ly0/o;Le1/l0;Lk0/g0;Lk0/h0;Lu/w;Lc9/f;Lm0/m;II)V

    return-void

    :pswitch_0
    move-object/from16 v16, v7

    check-cast v16, Lt/u1;

    iget-object v1, v0, Ls/m;->b:Ly0/o;

    move-object/from16 v18, v6

    check-cast v18, Lc9/c;

    move-object/from16 v19, v4

    check-cast v19, Ly0/d;

    move-object/from16 v20, v5

    check-cast v20, Lc9/c;

    move-object/from16 v21, v3

    check-cast v21, Lc9/g;

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lm0/s;->m(I)I

    move-result v23

    iget v2, v0, Ls/m;->d:I

    move-object/from16 v17, v1

    move-object/from16 v22, p1

    move/from16 v24, v2

    invoke-static/range {v16 .. v24}, Ld9/i;->b(Lt/u1;Ly0/o;Lc9/c;Ly0/d;Lc9/c;Lc9/g;Lm0/m;II)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Ls/m;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ls/m;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ls/m;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
