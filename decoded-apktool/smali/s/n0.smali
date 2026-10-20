.class public final Ls/n0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls/p0;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ls/p0;JI)V
    .locals 0

    iput p4, p0, Ls/n0;->a:I

    iput-object p1, p0, Ls/n0;->b:Ls/p0;

    iput-wide p2, p0, Ls/n0;->c:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ls/j0;)J
    .locals 4

    iget v0, p0, Ls/n0;->a:I

    iget-object v1, p0, Ls/n0;->b:Ls/p0;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Ls/p0;->y:Ls/q0;

    iget-object v0, v0, Ls/q0;->a:Ls/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-wide v2, Lm2/i;->b:J

    iget-object v0, v1, Ls/p0;->z:Ls/r0;

    iget-object v0, v0, Ls/r0;->a:Ls/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    return-wide v2

    :pswitch_0
    iget-object p1, v1, Ls/p0;->C:Ly0/g;

    if-nez p1, :cond_2

    sget-wide v0, Lm2/i;->b:J

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ls/p0;->G0()Ly0/d;

    sget-wide v0, Lm2/i;->b:J

    :goto_1
    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ls/n0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ls/j0;

    invoke-virtual {p0, p1}, Ls/n0;->a(Ls/j0;)J

    move-result-wide v0

    new-instance p1, Lm2/i;

    invoke-direct {p1, v0, v1}, Lm2/i;-><init>(J)V

    return-object p1

    :pswitch_0
    check-cast p1, Ls/j0;

    invoke-virtual {p0, p1}, Ls/n0;->a(Ls/j0;)J

    move-result-wide v0

    new-instance p1, Lm2/i;

    invoke-direct {p1, v0, v1}, Lm2/i;-><init>(J)V

    return-object p1

    :pswitch_1
    check-cast p1, Ls/j0;

    iget-object v0, p0, Ls/n0;->b:Ls/p0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    iget-object p1, v0, Ls/p0;->z:Ls/r0;

    iget-object p1, p1, Ls/r0;->a:Ls/b1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/fragment/app/a0;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, v0, Ls/p0;->y:Ls/q0;

    iget-object p1, p1, Ls/q0;->a:Ls/b1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    :goto_0
    new-instance p1, Lm2/k;

    iget-wide v0, p0, Ls/n0;->c:J

    invoke-direct {p1, v0, v1}, Lm2/k;-><init>(J)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
