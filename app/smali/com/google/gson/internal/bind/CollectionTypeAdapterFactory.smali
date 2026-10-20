.class public final Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;
.super Ljava/lang/Object;

# interfaces
.implements Lp7/b0;


# instance fields
.field public final a:Lr7/h;


# direct methods
.method public constructor <init>(Lr7/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;->a:Lr7/h;

    return-void
.end method


# virtual methods
.method public final a(Lp7/n;Lu7/a;)Lp7/a0;
    .locals 5

    iget-object v0, p2, Lu7/a;->b:Ljava/lang/reflect/Type;

    const-class v1, Ljava/util/Collection;

    iget-object v2, p2, Lu7/a;->a:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    instance-of v3, v0, Ljava/lang/reflect/WildcardType;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v4

    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    invoke-static {v3}, Ld7/t;->H(Z)V

    invoke-static {v0, v2, v1}, Lr7/d;->d(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v1

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0, v2, v1, v3}, Lr7/d;->f(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v4

    goto :goto_0

    :cond_2
    const-class v0, Ljava/lang/Object;

    :goto_0
    new-instance v1, Lu7/a;

    invoke-direct {v1, v0}, Lu7/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v1}, Lp7/n;->c(Lu7/a;)Lp7/a0;

    move-result-object v1

    iget-object v2, p0, Lcom/google/gson/internal/bind/CollectionTypeAdapterFactory;->a:Lr7/h;

    invoke-virtual {v2, p2}, Lr7/h;->b(Lu7/a;)Lr7/q;

    move-result-object p2

    new-instance v2, Lcom/google/gson/internal/bind/n;

    invoke-direct {v2, p1, v0, v1, p2}, Lcom/google/gson/internal/bind/n;-><init>(Lp7/n;Ljava/lang/reflect/Type;Lp7/a0;Lr7/q;)V

    return-object v2
.end method
