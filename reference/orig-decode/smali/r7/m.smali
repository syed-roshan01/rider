.class public final Lr7/m;
.super Ljava/util/AbstractSet;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr7/p;


# direct methods
.method public synthetic constructor <init>(Lr7/p;I)V
    .locals 0

    iput p2, p0, Lr7/m;->a:I

    iput-object p1, p0, Lr7/m;->b:Lr7/p;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 2

    iget v0, p0, Lr7/m;->a:I

    iget-object v1, p0, Lr7/m;->b:Lr7/p;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1}, Lr7/p;->clear()V

    return-void

    :pswitch_0
    invoke-virtual {v1}, Lr7/p;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 4

    iget v0, p0, Lr7/m;->a:I

    iget-object v1, p0, Lr7/m;->b:Lr7/p;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v1, p1}, Lr7/p;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_0
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v1, v0, v2}, Lr7/p;->a(Ljava/lang/Object;Z)Lr7/o;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, Lr7/o;->o:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    move-object v3, v0

    :cond_1
    if-eqz v3, :cond_2

    const/4 v2, 0x1

    :cond_2
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget v0, p0, Lr7/m;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lr7/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lr7/l;-><init>(Lr7/m;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lr7/l;

    invoke-direct {v0, p0}, Lr7/l;-><init>(Lr7/m;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x0

    iget v1, p0, Lr7/m;->a:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v4, p0, Lr7/m;->b:Lr7/p;

    packed-switch v1, :pswitch_data_0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {v4, p1, v2}, Lr7/p;->a(Ljava/lang/Object;Z)Lr7/o;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v4, v0, v3}, Lr7/p;->c(Lr7/o;Z)V

    :cond_1
    if-eqz v0, :cond_2

    move v2, v3

    :cond_2
    return v2

    :pswitch_0
    instance-of v1, p1, Ljava/util/Map$Entry;

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    :try_start_1
    invoke-virtual {v4, v1, v2}, Lr7/p;->a(Ljava/lang/Object;Z)Lr7/o;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    :cond_4
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_5

    iget-object v5, v1, Lr7/o;->o:Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v5, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    move-object v0, v1

    :cond_5
    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v4, v0, v3}, Lr7/p;->c(Lr7/o;Z)V

    move v2, v3

    :goto_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 2

    iget v0, p0, Lr7/m;->a:I

    iget-object v1, p0, Lr7/m;->b:Lr7/p;

    packed-switch v0, :pswitch_data_0

    iget v0, v1, Lr7/p;->d:I

    return v0

    :pswitch_0
    iget v0, v1, Lr7/p;->d:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
