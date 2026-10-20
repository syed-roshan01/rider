.class public final Ls/o0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls/p0;


# direct methods
.method public synthetic constructor <init>(Ls/p0;I)V
    .locals 0

    iput p2, p0, Ls/o0;->a:I

    iput-object p1, p0, Ls/o0;->b:Ls/p0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt/o1;)Lt/e0;
    .locals 5

    sget-object v0, Ls/j0;->c:Ls/j0;

    sget-object v1, Ls/j0;->b:Ls/j0;

    sget-object v2, Ls/j0;->a:Ls/j0;

    iget v3, p0, Ls/o0;->a:I

    iget-object v4, p0, Ls/o0;->b:Ls/p0;

    packed-switch v3, :pswitch_data_0

    invoke-interface {p1, v2, v1}, Lt/o1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, v4, Ls/p0;->y:Ls/q0;

    iget-object p1, p1, Ls/q0;->a:Ls/b1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Landroidx/compose/animation/a;->c:Lt/d1;

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lt/o1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, v4, Ls/p0;->z:Ls/r0;

    iget-object p1, p1, Ls/r0;->a:Ls/b1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Landroidx/compose/animation/a;->c:Lt/d1;

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/compose/animation/a;->c:Lt/d1;

    :goto_0
    return-object p1

    :pswitch_0
    invoke-interface {p1, v2, v1}, Lt/o1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    iget-object p1, v4, Ls/p0;->y:Ls/q0;

    iget-object p1, p1, Ls/q0;->a:Ls/b1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_2
    invoke-interface {p1, v1, v0}, Lt/o1;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, v4, Ls/p0;->z:Ls/r0;

    iget-object p1, p1, Ls/r0;->a:Ls/b1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_3
    sget-object v3, Landroidx/compose/animation/a;->d:Lt/d1;

    :goto_1
    if-nez v3, :cond_4

    sget-object v3, Landroidx/compose/animation/a;->d:Lt/d1;

    :cond_4
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ls/o0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lt/o1;

    invoke-virtual {p0, p1}, Ls/o0;->a(Lt/o1;)Lt/e0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lt/o1;

    invoke-virtual {p0, p1}, Ls/o0;->a(Lt/o1;)Lt/e0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
