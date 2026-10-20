.class public final Lcom/google/gson/internal/bind/n;
.super Lp7/a0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/google/gson/internal/bind/TypeAdapters$34;Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/gson/internal/bind/n;->a:I

    iput-object p1, p0, Lcom/google/gson/internal/bind/n;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/gson/internal/bind/n;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp7/n;Ljava/lang/reflect/Type;Lp7/a0;Lr7/q;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/gson/internal/bind/n;->a:I

    .line 3
    new-instance v0, Lcom/google/gson/internal/bind/m;

    invoke-direct {v0, p1, p3, p2}, Lcom/google/gson/internal/bind/m;-><init>(Lp7/n;Lp7/a0;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Lcom/google/gson/internal/bind/n;->b:Ljava/lang/Object;

    iput-object p4, p0, Lcom/google/gson/internal/bind/n;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lv7/a;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lcom/google/gson/internal/bind/n;->a:I

    iget-object v1, p0, Lcom/google/gson/internal/bind/n;->b:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/gson/internal/bind/n;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    const/16 v3, 0x9

    if-ne v0, v3, :cond_0

    invoke-virtual {p1}, Lv7/a;->g0()V

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    check-cast v2, Lr7/q;

    invoke-interface {v2}, Lr7/q;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lv7/a;->a()V

    :goto_0
    invoke-virtual {p1}, Lv7/a;->M()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v1

    check-cast v2, Lp7/a0;

    invoke-virtual {v2, p1}, Lp7/a0;->b(Lv7/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lv7/a;->g()V

    move-object p1, v0

    :goto_1
    return-object p1

    :pswitch_0
    check-cast v2, Lcom/google/gson/internal/bind/TypeAdapters$34;

    iget-object v0, v2, Lcom/google/gson/internal/bind/TypeAdapters$34;->b:Lp7/a0;

    invoke-virtual {v0, p1}, Lp7/a0;->b(Lv7/a;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance v2, Lp7/q;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Expected a "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    :goto_2
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lv7/b;Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lcom/google/gson/internal/bind/n;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ljava/util/Collection;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lv7/b;->b()V

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/gson/internal/bind/n;->b:Ljava/lang/Object;

    check-cast v1, Lp7/a0;

    invoke-virtual {v1, p1, v0}, Lp7/a0;->c(Lv7/b;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lv7/b;->g()V

    :goto_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/n;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/gson/internal/bind/TypeAdapters$34;

    iget-object v0, v0, Lcom/google/gson/internal/bind/TypeAdapters$34;->b:Lp7/a0;

    invoke-virtual {v0, p1, p2}, Lp7/a0;->c(Lv7/b;Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
