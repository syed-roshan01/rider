.class public final Lh0/b;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx/l;Lk0/m4;ZZ)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/b;->a:I

    iput-boolean p3, p0, Lh0/b;->b:Z

    iput-boolean p4, p0, Lh0/b;->c:Z

    iput-object p1, p0, Lh0/b;->d:Ljava/lang/Object;

    iput-object p2, p0, Lh0/b;->e:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 1
    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ly0/o;ZLh0/m;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/b;->a:I

    iput-object p1, p0, Lh0/b;->d:Ljava/lang/Object;

    iput-boolean p2, p0, Lh0/b;->b:Z

    iput-object p3, p0, Lh0/b;->e:Ljava/lang/Object;

    iput-boolean p4, p0, Lh0/b;->c:Z

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

    iget v1, v0, Lh0/b;->a:I

    iget-object v2, v0, Lh0/b;->e:Ljava/lang/Object;

    iget-object v3, v0, Lh0/b;->d:Ljava/lang/Object;

    const/4 v4, 0x2

    packed-switch v1, :pswitch_data_0

    and-int/lit8 v1, p2, 0x3

    if-ne v1, v4, :cond_1

    move-object v1, v9

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, Lk0/m1;->a:Lk0/m1;

    iget-boolean v4, v0, Lh0/b;->b:Z

    iget-boolean v5, v0, Lh0/b;->c:Z

    move-object v6, v3

    check-cast v6, Lx/l;

    move-object v7, v2

    check-cast v7, Lk0/m4;

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/high16 v12, 0xc00000

    const/16 v13, 0x70

    move v2, v4

    move v3, v5

    move-object v4, v6

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

    if-ne v1, v4, :cond_3

    move-object v1, v9

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_3

    :cond_3
    :goto_2
    check-cast v3, Ly0/o;

    new-instance v1, Lh0/a;

    check-cast v2, Lh0/m;

    iget-boolean v4, v0, Lh0/b;->c:Z

    iget-boolean v5, v0, Lh0/b;->b:Z

    invoke-direct {v1, v2, v4, v5}, Lh0/a;-><init>(Lh0/m;ZZ)V

    const/4 v4, 0x0

    invoke-static {v3, v4, v1}, Ly1/l;->a(Ly0/o;ZLc9/c;)Ly0/o;

    move-result-object v1

    new-instance v3, Lt/l0;

    const/16 v6, 0xd

    invoke-direct {v3, v2, v6}, Lt/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v3, v5, p1, v4}, Ld7/t;->i(Ly0/o;Lc9/a;ZLm0/m;I)V

    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lh0/b;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh0/b;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lh0/b;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
