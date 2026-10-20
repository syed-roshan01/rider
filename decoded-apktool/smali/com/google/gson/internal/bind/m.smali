.class public final Lcom/google/gson/internal/bind/m;
.super Lp7/a0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/gson/internal/bind/m;->a:I

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/gson/internal/bind/m;->b:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/gson/internal/bind/m;->c:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/gson/internal/bind/m;->d:Ljava/lang/Object;

    .line 5
    :try_start_0
    new-instance v0, Lcom/google/gson/internal/bind/o;

    invoke-direct {v0, p1}, Lcom/google/gson/internal/bind/o;-><init>(Ljava/lang/Class;)V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/reflect/Field;

    .line 6
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    const/4 v4, 0x0

    .line 7
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Enum;

    .line 8
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    .line 9
    invoke-virtual {v4}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v6

    const-class v7, Lq7/b;

    .line 10
    invoke-virtual {v3, v7}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Lq7/b;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v7, p0, Lcom/google/gson/internal/bind/m;->b:Ljava/lang/Object;

    if-eqz v3, :cond_0

    .line 11
    :try_start_1
    invoke-interface {v3}, Lq7/b;->value()Ljava/lang/String;

    move-result-object v5

    .line 12
    invoke-interface {v3}, Lq7/b;->alternate()[Ljava/lang/String;

    move-result-object v3

    array-length v8, v3

    move v9, v1

    :goto_1
    if-ge v9, v8, :cond_0

    aget-object v10, v3, v9

    move-object v11, v7

    check-cast v11, Ljava/util/Map;

    .line 13
    invoke-interface {v11, v10, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    check-cast v7, Ljava/util/Map;

    .line 14
    invoke-interface {v7, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/gson/internal/bind/m;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    .line 15
    invoke-interface {v3, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/gson/internal/bind/m;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    .line 16
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    .line 17
    :goto_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public constructor <init>(Lp7/n;Lp7/a0;Ljava/lang/reflect/Type;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/gson/internal/bind/m;->a:I

    iput-object p1, p0, Lcom/google/gson/internal/bind/m;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/gson/internal/bind/m;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/gson/internal/bind/m;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lv7/a;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/google/gson/internal/bind/m;->a:I

    iget-object v1, p0, Lcom/google/gson/internal/bind/m;->c:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    const/16 v2, 0x9

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lv7/a;->g0()V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lv7/a;->i0()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/google/gson/internal/bind/m;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Enum;

    if-nez v0, :cond_1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Enum;

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    return-object p1

    :pswitch_0
    check-cast v1, Lp7/a0;

    invoke-virtual {v1, p1}, Lp7/a0;->b(Lv7/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lv7/b;Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lcom/google/gson/internal/bind/m;->a:I

    iget-object v1, p0, Lcom/google/gson/internal/bind/m;->d:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ljava/lang/Enum;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, p2}, Lv7/b;->e0(Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/google/gson/internal/bind/m;->c:Ljava/lang/Object;

    check-cast v0, Lp7/a0;

    check-cast v1, Ljava/lang/reflect/Type;

    if-eqz p2, :cond_2

    instance-of v2, v1, Ljava/lang/Class;

    if-nez v2, :cond_1

    instance-of v2, v1, Ljava/lang/reflect/TypeVariable;

    if-eqz v2, :cond_2

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v1

    :goto_1
    if-eq v2, v1, :cond_8

    iget-object v1, p0, Lcom/google/gson/internal/bind/m;->b:Ljava/lang/Object;

    check-cast v1, Lp7/n;

    new-instance v3, Lu7/a;

    invoke-direct {v3, v2}, Lu7/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {v1, v3}, Lp7/n;->c(Lu7/a;)Lp7/a0;

    move-result-object v1

    instance-of v2, v1, Lcom/google/gson/internal/bind/i;

    if-nez v2, :cond_3

    goto :goto_4

    :cond_3
    move-object v2, v0

    :goto_2
    instance-of v3, v2, Lcom/google/gson/internal/bind/l;

    if-eqz v3, :cond_6

    move-object v3, v2

    check-cast v3, Lcom/google/gson/internal/bind/l;

    check-cast v3, Lp7/m;

    iget-object v3, v3, Lp7/m;->a:Lp7/a0;

    if-eqz v3, :cond_5

    if-ne v3, v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, v3

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_3
    instance-of v2, v2, Lcom/google/gson/internal/bind/i;

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    move-object v0, v1

    :cond_8
    :goto_5
    invoke-virtual {v0, p1, p2}, Lp7/a0;->c(Lv7/b;Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
