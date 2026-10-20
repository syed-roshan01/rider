.class public abstract Ld9/n;
.super Ld9/p;

# interfaces
.implements Lj9/e;


# virtual methods
.method public final a()Lj9/a;
    .locals 1

    sget-object v0, Ld9/v;->a:Ld9/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 2

    move-object v0, p0

    check-cast v0, Lz/n;

    iget v1, v0, Lz/n;->o:I

    iget-object v0, v0, Ld9/c;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_0
    check-cast v0, Lm0/l3;

    invoke-interface {v0}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    check-cast v0, Lm0/l3;

    invoke-interface {v0}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
