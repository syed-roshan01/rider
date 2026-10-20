.class public final Lcom/google/gson/internal/bind/h;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/reflect/Field;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final synthetic f:Z

.field public final synthetic g:Ljava/lang/reflect/Method;

.field public final synthetic h:Z

.field public final synthetic i:Lp7/a0;

.field public final synthetic j:Lp7/n;

.field public final synthetic k:Lu7/a;

.field public final synthetic l:Z

.field public final synthetic m:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;ZZZLjava/lang/reflect/Method;ZLp7/a0;Lp7/n;Lu7/a;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p5, p0, Lcom/google/gson/internal/bind/h;->f:Z

    iput-object p6, p0, Lcom/google/gson/internal/bind/h;->g:Ljava/lang/reflect/Method;

    iput-boolean p7, p0, Lcom/google/gson/internal/bind/h;->h:Z

    iput-object p8, p0, Lcom/google/gson/internal/bind/h;->i:Lp7/a0;

    iput-object p9, p0, Lcom/google/gson/internal/bind/h;->j:Lp7/n;

    iput-object p10, p0, Lcom/google/gson/internal/bind/h;->k:Lu7/a;

    iput-boolean p11, p0, Lcom/google/gson/internal/bind/h;->l:Z

    iput-boolean p12, p0, Lcom/google/gson/internal/bind/h;->m:Z

    iput-object p1, p0, Lcom/google/gson/internal/bind/h;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/gson/internal/bind/h;->b:Ljava/lang/reflect/Field;

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/internal/bind/h;->c:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/gson/internal/bind/h;->d:Z

    iput-boolean p4, p0, Lcom/google/gson/internal/bind/h;->e:Z

    return-void
.end method


# virtual methods
.method public final a(Lv7/b;Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Lcom/google/gson/internal/bind/h;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/google/gson/internal/bind/h;->f:Z

    iget-object v1, p0, Lcom/google/gson/internal/bind/h;->b:Ljava/lang/reflect/Field;

    iget-object v2, p0, Lcom/google/gson/internal/bind/h;->g:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_2

    if-nez v2, :cond_1

    invoke-static {p2, v1}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    goto :goto_0

    :cond_1
    invoke-static {p2, v2}, Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory;->b(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)V

    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    const/4 v0, 0x0

    :try_start_0
    new-array v1, v0, [Ljava/lang/Object;

    invoke-virtual {v2, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {v2, v0}, Lt7/c;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lp7/q;

    const-string v1, "Accessor "

    const-string v2, " threw exception"

    invoke-static {v1, p2, v2}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    if-ne v0, p2, :cond_4

    return-void

    :cond_4
    iget-object p2, p0, Lcom/google/gson/internal/bind/h;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lv7/b;->q(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/google/gson/internal/bind/h;->h:Z

    iget-object v1, p0, Lcom/google/gson/internal/bind/h;->i:Lp7/a0;

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    new-instance p2, Lcom/google/gson/internal/bind/m;

    iget-object v2, p0, Lcom/google/gson/internal/bind/h;->k:Lu7/a;

    iget-object v2, v2, Lu7/a;->b:Ljava/lang/reflect/Type;

    iget-object v3, p0, Lcom/google/gson/internal/bind/h;->j:Lp7/n;

    invoke-direct {p2, v3, v1, v2}, Lcom/google/gson/internal/bind/m;-><init>(Lp7/n;Lp7/a0;Ljava/lang/reflect/Type;)V

    move-object v1, p2

    :goto_2
    invoke-virtual {v1, p1, v0}, Lp7/a0;->c(Lv7/b;Ljava/lang/Object;)V

    return-void
.end method
