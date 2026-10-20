.class public final Lcom/google/gson/internal/bind/j;
.super Lcom/google/gson/internal/bind/i;


# instance fields
.field public final b:Lr7/q;


# direct methods
.method public constructor <init>(Lr7/q;Ljava/util/LinkedHashMap;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/gson/internal/bind/i;-><init>(Ljava/util/LinkedHashMap;)V

    iput-object p1, p0, Lcom/google/gson/internal/bind/j;->b:Lr7/q;

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/gson/internal/bind/j;->b:Lr7/q;

    invoke-interface {v0}, Lr7/q;->e()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public final f(Ljava/lang/Object;Lv7/a;Lcom/google/gson/internal/bind/h;)V
    .locals 2

    iget-object v0, p3, Lcom/google/gson/internal/bind/h;->i:Lp7/a0;

    invoke-virtual {v0, p2}, Lp7/a0;->b(Lv7/a;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    iget-boolean v0, p3, Lcom/google/gson/internal/bind/h;->l:Z

    if-nez v0, :cond_2

    :cond_0
    iget-boolean v0, p3, Lcom/google/gson/internal/bind/h;->f:Z

    iget-object v1, p3, Lcom/google/gson/internal/bind/h;->b:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_1

    invoke-static {p1, v1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    goto :goto_0

    :cond_1
    iget-boolean p3, p3, Lcom/google/gson/internal/bind/h;->m:Z

    if-nez p3, :cond_3

    :goto_0
    invoke-virtual {v1, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void

    :cond_3
    const/4 p1, 0x0

    invoke-static {v1, p1}, Lt7/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lp7/q;

    const-string p3, "Cannot set value of \'static final\' "

    invoke-static {p3, p1}, Ll/q;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
