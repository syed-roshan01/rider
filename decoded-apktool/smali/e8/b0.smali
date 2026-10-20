.class public Le8/b0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Le8/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Le8/b0;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Le8/b0;->a:Ljava/util/logging/Logger;

    new-instance v0, Le8/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Le8/b0;->b:Le8/b0;

    return-void
.end method

.method public static b()Le8/b0;
    .locals 2

    sget-object v0, Le8/z;->a:Le8/a0;

    check-cast v0, Le8/i2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Le8/i2;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8/b0;

    sget-object v1, Le8/b0;->b:Le8/b0;

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    if-nez v0, :cond_1

    return-object v1

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a()Le8/b0;
    .locals 3

    sget-object v0, Le8/z;->a:Le8/a0;

    check-cast v0, Le8/i2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Le8/i2;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/b0;

    sget-object v2, Le8/b0;->b:Le8/b0;

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    return-object v1
.end method

.method public final c(Le8/b0;)V
    .locals 6

    if-eqz p1, :cond_3

    sget-object v0, Le8/z;->a:Le8/a0;

    check-cast v0, Le8/i2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Le8/i2;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/b0;

    sget-object v2, Le8/b0;->b:Le8/b0;

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    if-eq v1, p0, :cond_1

    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/Throwable;

    invoke-direct {v3}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v3}, Ljava/lang/Throwable;->fillInStackTrace()Ljava/lang/Throwable;

    move-result-object v3

    sget-object v4, Le8/i2;->a:Ljava/util/logging/Logger;

    const-string v5, "Context was not attached when detaching"

    invoke-virtual {v4, v1, v5, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    if-eq p1, v2, :cond_2

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "toAttach"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
