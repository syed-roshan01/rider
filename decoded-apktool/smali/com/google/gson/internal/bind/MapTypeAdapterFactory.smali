.class public final Lcom/google/gson/internal/bind/MapTypeAdapterFactory;
.super Ljava/lang/Object;

# interfaces
.implements Lp7/b0;


# instance fields
.field public final a:Lr7/h;

.field public final b:Z


# direct methods
.method public constructor <init>(Lr7/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;->a:Lr7/h;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Lp7/n;Lu7/a;)Lp7/a0;
    .locals 13

    iget-object v0, p2, Lu7/a;->b:Ljava/lang/reflect/Type;

    const-class v1, Ljava/util/Map;

    iget-object v2, p2, Lu7/a;->a:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x1

    const-class v5, Ljava/util/Properties;

    const/4 v6, 0x2

    if-ne v0, v5, :cond_1

    new-array v0, v6, [Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/String;

    aput-object v1, v0, v3

    aput-object v1, v0, v4

    goto :goto_0

    :cond_1
    instance-of v5, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v5, :cond_2

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v3

    :cond_2
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    invoke-static {v5}, Ld7/t;->H(Z)V

    invoke-static {v0, v2, v1}, Lr7/d;->d(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0, v2, v1, v5}, Lr7/d;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_3

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-array v0, v6, [Ljava/lang/reflect/Type;

    const-class v1, Ljava/lang/Object;

    aput-object v1, v0, v3

    aput-object v1, v0, v4

    :goto_0
    aget-object v1, v0, v3

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v1, v2, :cond_5

    const-class v2, Ljava/lang/Boolean;

    if-ne v1, v2, :cond_4

    goto :goto_2

    :cond_4
    new-instance v2, Lu7/a;

    invoke-direct {v2, v1}, Lu7/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v2}, Lp7/n;->c(Lu7/a;)Lp7/a0;

    move-result-object v1

    :goto_1
    move-object v9, v1

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v1, Lcom/google/gson/internal/bind/p;->c:Lp7/k;

    goto :goto_1

    :goto_3
    aget-object v1, v0, v4

    new-instance v2, Lu7/a;

    invoke-direct {v2, v1}, Lu7/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v2}, Lp7/n;->c(Lu7/a;)Lp7/a0;

    move-result-object v11

    iget-object v1, p0, Lcom/google/gson/internal/bind/MapTypeAdapterFactory;->a:Lr7/h;

    invoke-virtual {v1, p2}, Lr7/h;->b(Lu7/a;)Lr7/q;

    move-result-object v12

    new-instance p2, Lcom/google/gson/internal/bind/e;

    aget-object v8, v0, v3

    aget-object v10, v0, v4

    move-object v5, p2

    move-object v6, p0

    move-object v7, p1

    invoke-direct/range {v5 .. v12}, Lcom/google/gson/internal/bind/e;-><init>(Lcom/google/gson/internal/bind/MapTypeAdapterFactory;Lp7/n;Ljava/lang/reflect/Type;Lp7/a0;Ljava/lang/reflect/Type;Lp7/a0;Lr7/q;)V

    return-object p2
.end method
