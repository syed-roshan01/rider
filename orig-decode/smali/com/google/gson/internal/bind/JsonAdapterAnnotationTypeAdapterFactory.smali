.class public final Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;
.super Ljava/lang/Object;

# interfaces
.implements Lp7/b0;


# instance fields
.field public final a:Lr7/h;


# direct methods
.method public constructor <init>(Lr7/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->a:Lr7/h;

    return-void
.end method

.method public static b(Lr7/h;Lp7/n;Lu7/a;Lq7/a;)Lp7/a0;
    .locals 2

    invoke-interface {p3}, Lq7/a;->value()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Lu7/a;

    invoke-direct {v1, v0}, Lu7/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p0, v1}, Lr7/h;->b(Lu7/a;)Lr7/q;

    move-result-object p0

    invoke-interface {p0}, Lr7/q;->e()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p3}, Lq7/a;->nullSafe()Z

    move-result p3

    instance-of v0, p0, Lp7/a0;

    if-eqz v0, :cond_0

    check-cast p0, Lp7/a0;

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lp7/b0;

    if-eqz v0, :cond_2

    check-cast p0, Lp7/b0;

    invoke-interface {p0, p1, p2}, Lp7/b0;->a(Lp7/n;Lu7/a;)Lp7/a0;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lp7/a0;->a()Lp7/l;

    move-result-object p0

    :cond_1
    return-object p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Invalid attempt to bind an instance of "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " as a @JsonAdapter for "

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p2, Lu7/a;->b:Ljava/lang/reflect/Type;

    invoke-static {p0}, Lr7/d;->g(Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lp7/n;Lu7/a;)Lp7/a0;
    .locals 2

    iget-object v0, p2, Lu7/a;->a:Ljava/lang/Class;

    const-class v1, Lq7/a;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lq7/a;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->a:Lr7/h;

    invoke-static {v1, p1, p2, v0}, Lcom/google/gson/internal/bind/JsonAdapterAnnotationTypeAdapterFactory;->b(Lr7/h;Lp7/n;Lu7/a;Lq7/a;)Lp7/a0;

    move-result-object p1

    return-object p1
.end method
