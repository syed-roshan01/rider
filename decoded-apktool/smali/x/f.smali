.class public final Lx/f;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lm0/g1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lm0/g1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lx/f;->a:I

    iput-object p1, p0, Lx/f;->b:Ljava/util/List;

    iput-object p2, p0, Lx/f;->c:Lm0/g1;

    return-void
.end method


# virtual methods
.method public final b(Lx/k;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lq8/l;->a:Lq8/l;

    iget v1, p0, Lx/f;->a:I

    iget-object v2, p0, Lx/f;->c:Lm0/g1;

    iget-object v3, p0, Lx/f;->b:Ljava/util/List;

    packed-switch v1, :pswitch_data_0

    instance-of v1, p1, Lx/o;

    if-eqz v1, :cond_0

    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lx/p;

    if-eqz v1, :cond_1

    check-cast p1, Lx/p;

    iget-object p1, p1, Lx/p;->a:Lx/o;

    invoke-interface {v3, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    instance-of v1, p1, Lx/n;

    if-eqz v1, :cond_2

    check-cast p1, Lx/n;

    iget-object p1, p1, Lx/n;->a:Lx/o;

    invoke-interface {v3, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v2, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-object v0

    :pswitch_0
    instance-of v1, p1, Lx/h;

    if-eqz v1, :cond_3

    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    instance-of v1, p1, Lx/i;

    if-eqz v1, :cond_4

    check-cast p1, Lx/i;

    iget-object p1, p1, Lx/i;->a:Lx/h;

    invoke-interface {v3, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_4
    :goto_1
    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v2, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-object v0

    :pswitch_1
    instance-of v1, p1, Lx/d;

    if-eqz v1, :cond_5

    invoke-interface {v3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    instance-of v1, p1, Lx/e;

    if-eqz v1, :cond_6

    check-cast p1, Lx/e;

    iget-object p1, p1, Lx/e;->a:Lx/d;

    invoke-interface {v3, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_6
    :goto_2
    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v2, p1}, Lm0/g1;->setValue(Ljava/lang/Object;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 1

    iget p2, p0, Lx/f;->a:I

    sget-object v0, Lq8/l;->a:Lq8/l;

    packed-switch p2, :pswitch_data_0

    check-cast p1, Lx/k;

    invoke-virtual {p0, p1}, Lx/f;->b(Lx/k;)Ljava/lang/Object;

    return-object v0

    :pswitch_0
    check-cast p1, Lx/k;

    invoke-virtual {p0, p1}, Lx/f;->b(Lx/k;)Ljava/lang/Object;

    return-object v0

    :pswitch_1
    check-cast p1, Lx/k;

    invoke-virtual {p0, p1}, Lx/f;->b(Lx/k;)Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
