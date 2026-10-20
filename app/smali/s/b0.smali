.class public final Ls/b0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lt/u1;


# direct methods
.method public synthetic constructor <init>(Lt/u1;I)V
    .locals 0

    iput p2, p0, Ls/b0;->a:I

    iput-object p1, p0, Ls/b0;->b:Lt/u1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    const/4 v0, 0x0

    iget v1, p0, Ls/b0;->a:I

    iget-object v2, p0, Ls/b0;->b:Lt/u1;

    packed-switch v1, :pswitch_data_0

    iget-object v1, v2, Lt/u1;->h:Lw0/u;

    invoke-virtual {v1}, Lw0/u;->size()I

    move-result v3

    const-wide/16 v4, 0x0

    move v6, v0

    :goto_0
    if-ge v6, v3, :cond_0

    invoke-virtual {v1, v6}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lt/q1;

    invoke-virtual {v7}, Lt/q1;->b()Lt/l1;

    move-result-object v7

    iget-wide v7, v7, Lt/l1;->h:J

    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, v2, Lt/u1;->i:Lw0/u;

    invoke-virtual {v1}, Lw0/u;->size()I

    move-result v2

    :goto_1
    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Lw0/u;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt/u1;

    iget-object v3, v3, Lt/u1;->l:Lm0/j0;

    invoke-virtual {v3}, Lm0/j0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {v2}, Lt/u1;->b()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Ls/j0;->c:Ls/j0;

    if-ne v1, v3, :cond_2

    iget-object v1, v2, Lt/u1;->c:Lm0/n1;

    invoke-virtual {v1}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
