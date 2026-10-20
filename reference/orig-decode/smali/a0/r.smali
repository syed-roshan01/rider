.class public final La0/r;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILa0/a0;Lc9/e;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La0/r;->a:I

    iput-object p1, p0, La0/r;->b:Ljava/lang/Object;

    iput p2, p0, La0/r;->c:I

    iput-object p3, p0, La0/r;->e:Ljava/lang/Object;

    iput-object p4, p0, La0/r;->f:Ljava/lang/Object;

    iput p5, p0, La0/r;->d:I

    const/4 p1, 0x2

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;II)V
    .locals 0

    iput p6, p0, La0/r;->a:I

    iput-object p1, p0, La0/r;->e:Ljava/lang/Object;

    iput-object p2, p0, La0/r;->b:Ljava/lang/Object;

    iput p3, p0, La0/r;->c:I

    iput-object p4, p0, La0/r;->f:Ljava/lang/Object;

    iput p5, p0, La0/r;->d:I

    const/4 p1, 0x2

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq8/a;III)V
    .locals 0

    iput p6, p0, La0/r;->a:I

    iput-object p1, p0, La0/r;->e:Ljava/lang/Object;

    iput-object p2, p0, La0/r;->b:Ljava/lang/Object;

    iput-object p3, p0, La0/r;->f:Ljava/lang/Object;

    iput p4, p0, La0/r;->c:I

    iput p5, p0, La0/r;->d:I

    const/4 p1, 0x2

    .line 3
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 12

    iget v2, p0, La0/r;->c:I

    iget-object v1, p0, La0/r;->b:Ljava/lang/Object;

    iget-object v3, p0, La0/r;->f:Ljava/lang/Object;

    iget p2, p0, La0/r;->a:I

    iget v0, p0, La0/r;->d:I

    iget-object v4, p0, La0/r;->e:Ljava/lang/Object;

    packed-switch p2, :pswitch_data_0

    move-object p2, v4

    check-cast p2, Ljava/lang/String;

    check-cast v1, Ljava/lang/String;

    check-cast v3, Lc9/a;

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lm0/s;->m(I)I

    move-result v5

    move-object v0, p2

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Ly3/e;->s(Ljava/lang/String;Ljava/lang/String;ILc9/a;Lm0/m;I)V

    return-void

    :pswitch_0
    move-object v6, v4

    check-cast v6, Lc9/a;

    move-object v7, v1

    check-cast v7, Lo2/o;

    move-object v8, v3

    check-cast v8, Lc9/e;

    or-int/lit8 p2, v2, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result v10

    iget v11, p0, La0/r;->d:I

    move-object v9, p1

    invoke-static/range {v6 .. v11}, Lo1/s;->d(Lc9/a;Lo2/o;Lc9/e;Lm0/m;II)V

    return-void

    :pswitch_1
    move-object v0, v4

    check-cast v0, Lr1/h1;

    check-cast v1, Ly0/o;

    move-object p2, v3

    check-cast p2, Lc9/e;

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lm0/s;->m(I)I

    move-result v4

    iget v5, p0, La0/r;->d:I

    move-object v2, p2

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lr1/e1;->a(Lr1/h1;Ly0/o;Lc9/e;Lm0/m;II)V

    return-void

    :pswitch_2
    move-object v6, v4

    check-cast v6, Lk0/a3;

    move-object v7, v1

    check-cast v7, Ly0/o;

    move-object v8, v3

    check-cast v8, Lc9/f;

    or-int/lit8 p2, v2, 0x1

    invoke-static {p2}, Lm0/s;->m(I)I

    move-result v10

    iget v11, p0, La0/r;->d:I

    move-object v9, p1

    invoke-static/range {v6 .. v11}, Lm9/e0;->i(Lk0/a3;Ly0/o;Lc9/f;Lm0/m;II)V

    return-void

    :pswitch_3
    move-object v0, v4

    check-cast v0, Lk0/x2;

    check-cast v1, Ly0/o;

    move-object p2, v3

    check-cast p2, Lc9/f;

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lm0/s;->m(I)I

    move-result v4

    iget v5, p0, La0/r;->d:I

    move-object v2, p2

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lm9/e0;->e(Lk0/x2;Ly0/o;Lc9/f;Lm0/m;II)V

    return-void

    :pswitch_4
    move-object p2, v4

    check-cast p2, La0/a0;

    check-cast v3, Lc9/e;

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lm0/s;->m(I)I

    move-result v5

    move-object v0, v1

    move v1, v2

    move-object v2, p2

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lf6/a;->g(Ljava/lang/Object;ILa0/a0;Lc9/e;Lm0/m;I)V

    return-void

    :pswitch_5
    move-object p2, v4

    check-cast p2, La0/s;

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lm0/s;->m(I)I

    move-result v5

    move-object v0, p2

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lf6/a;->k(La0/s;Ljava/lang/Object;ILjava/lang/Object;Lm0/m;I)V

    return-void

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

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, La0/r;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/r;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/r;->a(Lm0/m;I)V

    return-object v0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/r;->a(Lm0/m;I)V

    return-object v0

    :pswitch_2
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/r;->a(Lm0/m;I)V

    return-object v0

    :pswitch_3
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/r;->a(Lm0/m;I)V

    return-object v0

    :pswitch_4
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/r;->a(Lm0/m;I)V

    return-object v0

    :pswitch_5
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La0/r;->a(Lm0/m;I)V

    return-object v0

    nop

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
