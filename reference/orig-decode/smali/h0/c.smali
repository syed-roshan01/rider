.class public final Lh0/c;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu1/y2;Ly0/o;ZLh0/m;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/c;->a:I

    iput-object p1, p0, Lh0/c;->d:Ljava/lang/Object;

    iput-object p2, p0, Lh0/c;->e:Ljava/lang/Object;

    iput-boolean p3, p0, Lh0/c;->b:Z

    iput-object p4, p0, Lh0/c;->f:Ljava/lang/Object;

    iput-boolean p5, p0, Lh0/c;->c:Z

    const/4 p1, 0x2

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ZZLx/m;Lk0/m4;Le1/l0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/c;->a:I

    iput-boolean p1, p0, Lh0/c;->b:Z

    iput-boolean p2, p0, Lh0/c;->c:Z

    iput-object p3, p0, Lh0/c;->d:Ljava/lang/Object;

    iput-object p4, p0, Lh0/c;->e:Ljava/lang/Object;

    iput-object p5, p0, Lh0/c;->f:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 2
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 14

    move-object v0, p0

    move-object v9, p1

    iget v1, v0, Lh0/c;->a:I

    iget-object v2, v0, Lh0/c;->f:Ljava/lang/Object;

    iget-object v3, v0, Lh0/c;->e:Ljava/lang/Object;

    iget-object v4, v0, Lh0/c;->d:Ljava/lang/Object;

    const/4 v5, 0x2

    packed-switch v1, :pswitch_data_0

    and-int/lit8 v1, p2, 0x3

    if-ne v1, v5, :cond_1

    move-object v1, v9

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, Lk0/m1;->a:Lk0/m1;

    iget-boolean v5, v0, Lh0/c;->b:Z

    iget-boolean v6, v0, Lh0/c;->c:Z

    check-cast v4, Lx/m;

    move-object v7, v3

    check-cast v7, Lk0/m4;

    move-object v8, v2

    check-cast v8, Le1/l0;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/high16 v12, 0xc00000

    const/16 v13, 0x60

    move v2, v5

    move v3, v6

    move-object v5, v7

    move-object v6, v8

    move v7, v10

    move v8, v11

    move-object v9, p1

    move v10, v12

    move v11, v13

    invoke-virtual/range {v1 .. v11}, Lk0/m1;->a(ZZLx/l;Lk0/m4;Le1/l0;FFLm0/m;II)V

    :goto_1
    return-void

    :pswitch_0
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v5, :cond_3

    move-object v1, v9

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_3

    :cond_3
    :goto_2
    sget-object v1, Lu1/s1;->p:Lm0/m3;

    check-cast v4, Lu1/y2;

    invoke-virtual {v1, v4}, Lm0/u1;->b(Ljava/lang/Object;)Lm0/v1;

    move-result-object v1

    new-instance v4, Lh0/b;

    check-cast v3, Ly0/o;

    check-cast v2, Lh0/m;

    iget-boolean v5, v0, Lh0/c;->c:Z

    iget-boolean v6, v0, Lh0/c;->b:Z

    invoke-direct {v4, v3, v6, v2, v5}, Lh0/b;-><init>(Ly0/o;ZLh0/m;Z)V

    const v2, -0x4fcd5da0

    invoke-static {p1, v2, v4}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v2

    const/16 v3, 0x38

    invoke-static {v1, v2, p1, v3}, Lf6/a;->b(Lm0/v1;Lc9/e;Lm0/m;I)V

    :goto_3
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

    iget v1, p0, Lh0/c;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh0/c;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh0/c;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
