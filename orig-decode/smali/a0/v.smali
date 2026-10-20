.class public final La0/v;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;ILjava/lang/String;Lc9/a;I)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, La0/v;->a:I

    iput-object p1, p0, La0/v;->c:Ljava/lang/Object;

    iput-object p2, p0, La0/v;->n:Ljava/lang/Object;

    iput p3, p0, La0/v;->e:I

    iput-object p4, p0, La0/v;->d:Ljava/lang/Object;

    iput-object p5, p0, La0/v;->b:Ljava/lang/Object;

    iput p6, p0, La0/v;->f:I

    const/4 p1, 0x2

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc9/e;III)V
    .locals 0

    iput p7, p0, La0/v;->a:I

    iput-object p1, p0, La0/v;->b:Ljava/lang/Object;

    iput-object p2, p0, La0/v;->c:Ljava/lang/Object;

    iput-object p3, p0, La0/v;->n:Ljava/lang/Object;

    iput-object p4, p0, La0/v;->d:Ljava/lang/Object;

    iput p5, p0, La0/v;->e:I

    iput p6, p0, La0/v;->f:I

    const/4 p1, 0x2

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lo2/t;Lc9/a;Lo2/u;Lc9/e;II)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La0/v;->a:I

    iput-object p1, p0, La0/v;->c:Ljava/lang/Object;

    iput-object p2, p0, La0/v;->b:Ljava/lang/Object;

    iput-object p3, p0, La0/v;->n:Ljava/lang/Object;

    iput-object p4, p0, La0/v;->d:Ljava/lang/Object;

    iput p5, p0, La0/v;->e:I

    iput p6, p0, La0/v;->f:I

    const/4 p1, 0x2

    .line 3
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 15

    move-object v0, p0

    iget v3, v0, La0/v;->e:I

    iget v1, v0, La0/v;->a:I

    iget-object v2, v0, La0/v;->b:Ljava/lang/Object;

    iget-object v4, v0, La0/v;->d:Ljava/lang/Object;

    iget-object v5, v0, La0/v;->n:Ljava/lang/Object;

    iget-object v6, v0, La0/v;->c:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object v1, v6

    check-cast v1, Lcom/auto/accept/ui/viewmodel/MainViewModel;

    check-cast v5, Ljava/lang/String;

    check-cast v4, Ljava/lang/String;

    move-object v6, v2

    check-cast v6, Lc9/a;

    iget v2, v0, La0/v;->f:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lm0/s;->m(I)I

    move-result v7

    move-object v2, v5

    move-object v5, v6

    move-object/from16 v6, p1

    invoke-static/range {v1 .. v7}, Ly3/e;->k(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;ILjava/lang/String;Lc9/a;Lm0/m;I)V

    return-void

    :pswitch_0
    move-object v8, v6

    check-cast v8, Lo2/t;

    move-object v9, v2

    check-cast v9, Lc9/a;

    move-object v10, v5

    check-cast v10, Lo2/u;

    move-object v11, v4

    check-cast v11, Lc9/e;

    or-int/lit8 v1, v3, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v13

    iget v14, v0, La0/v;->f:I

    move-object/from16 v12, p1

    invoke-static/range {v8 .. v14}, Lo2/j;->a(Lo2/t;Lc9/a;Lo2/u;Lc9/e;Lm0/m;II)V

    return-void

    :pswitch_1
    move-object v1, v2

    check-cast v1, Lk0/i0;

    move-object v2, v6

    check-cast v2, Lk0/q2;

    check-cast v5, Lk0/e5;

    check-cast v4, Lc9/e;

    or-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Lm0/s;->m(I)I

    move-result v6

    iget v7, v0, La0/v;->f:I

    move-object v3, v5

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v7}, Lk0/t0;->a(Lk0/i0;Lk0/q2;Lk0/e5;Lc9/e;Lm0/m;II)V

    return-void

    :pswitch_2
    move-object v8, v2

    check-cast v8, Lc9/a;

    move-object v9, v6

    check-cast v9, Ly0/o;

    move-object v10, v5

    check-cast v10, Lo2/o;

    move-object v11, v4

    check-cast v11, Lc9/e;

    or-int/lit8 v1, v3, 0x1

    invoke-static {v1}, Lm0/s;->m(I)I

    move-result v13

    iget v14, v0, La0/v;->f:I

    move-object/from16 v12, p1

    invoke-static/range {v8 .. v14}, Lk0/n;->b(Lc9/a;Ly0/o;Lo2/o;Lc9/e;Lm0/m;II)V

    return-void

    :pswitch_3
    move-object v1, v2

    check-cast v1, Lc9/a;

    move-object v2, v6

    check-cast v2, Ly0/o;

    check-cast v5, La0/d0;

    check-cast v4, Lc9/e;

    or-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Lm0/s;->m(I)I

    move-result v6

    iget v7, v0, La0/v;->f:I

    move-object v3, v5

    move-object/from16 v5, p1

    invoke-static/range {v1 .. v7}, Lf6/a;->f(Lc9/a;Ly0/o;La0/d0;Lc9/e;Lm0/m;II)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, La0/v;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/v;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/v;->a(Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/v;->a(Lm0/m;I)V

    return-object v0

    :pswitch_2
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/v;->a(Lm0/m;I)V

    return-object v0

    :pswitch_3
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/v;->a(Lm0/m;I)V

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
