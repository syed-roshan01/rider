.class public final Lcom/google/gson/internal/bind/g;
.super Lp7/a0;


# static fields
.field public static final c:Lp7/b0;


# instance fields
.field public final a:Lp7/n;

.field public final b:Lp7/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/ObjectTypeAdapter$1;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/g;->c:Lp7/b0;

    return-void
.end method

.method public constructor <init>(Lp7/n;Lp7/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/g;->a:Lp7/n;

    iput-object p2, p0, Lcom/google/gson/internal/bind/g;->b:Lp7/z;

    return-void
.end method


# virtual methods
.method public final b(Lv7/a;)Ljava/lang/Object;
    .locals 9

    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    add-int/lit8 v2, v0, -0x1

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-eq v2, v3, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lv7/a;->b()V

    new-instance v2, Lr7/p;

    invoke-direct {v2, v4}, Lr7/p;-><init>(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lv7/a;->a()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-nez v2, :cond_2

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/internal/bind/g;->d(Lv7/a;I)Ljava/io/Serializable;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lv7/a;->M()Z

    move-result v5

    if-eqz v5, :cond_b

    instance-of v5, v2, Ljava/util/Map;

    if-eqz v5, :cond_4

    invoke-virtual {p1}, Lv7/a;->e0()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_4
    move-object v5, v1

    :goto_2
    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v6

    if-eqz v6, :cond_a

    add-int/lit8 v7, v6, -0x1

    if-eqz v7, :cond_6

    if-eq v7, v3, :cond_5

    move-object v7, v1

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lv7/a;->b()V

    new-instance v7, Lr7/p;

    invoke-direct {v7, v4}, Lr7/p;-><init>(Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Lv7/a;->a()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    if-eqz v7, :cond_7

    move v8, v4

    goto :goto_4

    :cond_7
    const/4 v8, 0x0

    :goto_4
    if-nez v7, :cond_8

    invoke-virtual {p0, p1, v6}, Lcom/google/gson/internal/bind/g;->d(Lv7/a;I)Ljava/io/Serializable;

    move-result-object v7

    :cond_8
    instance-of v6, v2, Ljava/util/List;

    if-eqz v6, :cond_9

    move-object v5, v2

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    move-object v6, v2

    check-cast v6, Ljava/util/Map;

    invoke-interface {v6, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_5
    if-eqz v8, :cond_3

    invoke-virtual {v0, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    move-object v2, v7

    goto :goto_1

    :cond_a
    throw v1

    :cond_b
    instance-of v5, v2, Ljava/util/List;

    if-eqz v5, :cond_c

    invoke-virtual {p1}, Lv7/a;->g()V

    goto :goto_6

    :cond_c
    invoke-virtual {p1}, Lv7/a;->p()V

    :goto_6
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_d

    return-object v2

    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :cond_e
    throw v1
.end method

.method public final c(Lv7/b;Ljava/lang/Object;)V
    .locals 3

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lv7/b;->M()Lv7/b;

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lcom/google/gson/internal/bind/g;->a:Lp7/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lu7/a;

    invoke-direct {v2, v0}, Lu7/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {v1, v2}, Lp7/n;->c(Lu7/a;)Lp7/a0;

    move-result-object v0

    instance-of v1, v0, Lcom/google/gson/internal/bind/g;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lv7/b;->e()V

    invoke-virtual {p1}, Lv7/b;->p()V

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2}, Lp7/a0;->c(Lv7/b;Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Lv7/a;I)Ljava/io/Serializable;
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_4

    add-int/lit8 v1, p2, -0x1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_3

    const/4 v2, 0x6

    if-eq v1, v2, :cond_2

    const/4 v2, 0x7

    if-eq v1, v2, :cond_1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lv7/a;->g0()V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {p2}, Lu/k1;->e(I)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Unexpected token: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lv7/a;->Q()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p2, p0, Lcom/google/gson/internal/bind/g;->b:Lp7/z;

    invoke-interface {p2, p1}, Lp7/z;->a(Lv7/a;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    throw v0
.end method
