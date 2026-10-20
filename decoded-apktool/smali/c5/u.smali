.class public final Lc5/u;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/auto/accept/ui/viewmodel/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;I)V
    .locals 0

    iput p2, p0, Lc5/u;->a:I

    iput-object p1, p0, Lc5/u;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 14

    move-object v0, p0

    move-object v11, p1

    iget v1, v0, Lc5/u;->a:I

    iget-object v2, v0, Lc5/u;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    const/4 v3, 0x2

    packed-switch v1, :pswitch_data_0

    and-int/lit8 v1, p2, 0xb

    if-ne v1, v3, :cond_1

    move-object v1, v11

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, Ld5/q;->a:Lu0/b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Ls/h;

    const/16 v6, 0x9

    invoke-direct {v5, v2, v6}, Ls/h;-><init>(Ljava/lang/Object;I)V

    const v2, -0x4eb1af55

    invoke-static {p1, v2, v5}, Ld7/t;->K(Lm0/m;ILd9/j;)Lu0/b;

    move-result-object v5

    const/4 v6, 0x0

    sget-wide v7, Le5/a;->g:J

    invoke-static {v7, v8, p1}, Lk0/t0;->j(JLm0/m;)Lk0/d5;

    move-result-object v7

    const/16 v8, 0xc06

    const/16 v9, 0x56

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, p1

    invoke-static/range {v1 .. v9}, Lk0/x;->b(Lc9/e;Ly0/o;Lc9/e;Lc9/f;Ly/i1;Lk0/d5;Lm0/m;II)V

    :goto_1
    return-void

    :pswitch_0
    and-int/lit8 v1, p2, 0xb

    if-ne v1, v3, :cond_3

    move-object v1, v11

    check-cast v1, Lm0/q;

    invoke-virtual {v1}, Lm0/q;->G()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lm0/q;->U()V

    goto :goto_3

    :cond_3
    :goto_2
    new-instance v1, Lc5/j;

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lc5/j;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    sget-object v10, Lc5/c;->c:Lu0/b;

    const/high16 v12, 0x30000000

    const/16 v13, 0x1fe

    move-object v11, p1

    invoke-static/range {v1 .. v13}, Lm9/e0;->j(Lc9/a;Ly0/o;ZLe1/l0;Lk0/y;Lk0/d0;Lu/w;Ly/t0;Lx/m;Lc9/f;Lm0/m;II)V

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

    iget v1, p0, Lc5/u;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/u;->a(Lm0/m;I)V

    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lc5/u;->a(Lm0/m;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
