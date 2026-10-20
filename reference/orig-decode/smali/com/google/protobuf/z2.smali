.class public abstract Lcom/google/protobuf/z2;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lsun/misc/Unsafe;

.field public static final b:Ljava/lang/Class;

.field public static final c:Lcom/google/protobuf/y2;

.field public static final d:Z

.field public static final e:Z

.field public static final f:J

.field public static final g:J

.field public static final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    invoke-static {}, Lcom/google/protobuf/z2;->m()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/z2;->a:Lsun/misc/Unsafe;

    sget-object v1, Lcom/google/protobuf/e;->a:Ljava/lang/Class;

    sput-object v1, Lcom/google/protobuf/z2;->b:Ljava/lang/Class;

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lcom/google/protobuf/z2;->f(Ljava/lang/Class;)Z

    move-result v1

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v2}, Lcom/google/protobuf/z2;->f(Ljava/lang/Class;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/protobuf/e;->a()Z

    move-result v6

    if-eqz v6, :cond_2

    if-eqz v1, :cond_1

    new-instance v5, Lcom/google/protobuf/w2;

    invoke-direct {v5, v0, v3}, Lcom/google/protobuf/w2;-><init>(Lsun/misc/Unsafe;I)V

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_3

    new-instance v5, Lcom/google/protobuf/w2;

    invoke-direct {v5, v0, v4}, Lcom/google/protobuf/w2;-><init>(Lsun/misc/Unsafe;I)V

    goto :goto_0

    :cond_2
    new-instance v5, Lcom/google/protobuf/x2;

    invoke-direct {v5, v0}, Lcom/google/protobuf/y2;-><init>(Lsun/misc/Unsafe;)V

    :cond_3
    :goto_0
    sput-object v5, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    if-nez v5, :cond_4

    move v0, v4

    goto :goto_1

    :cond_4
    invoke-virtual {v5}, Lcom/google/protobuf/y2;->u()Z

    move-result v0

    :goto_1
    sput-boolean v0, Lcom/google/protobuf/z2;->d:Z

    if-nez v5, :cond_5

    move v0, v4

    goto :goto_2

    :cond_5
    invoke-virtual {v5}, Lcom/google/protobuf/y2;->t()Z

    move-result v0

    :goto_2
    sput-boolean v0, Lcom/google/protobuf/z2;->e:Z

    const-class v0, [B

    invoke-static {v0}, Lcom/google/protobuf/z2;->c(Ljava/lang/Class;)I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Lcom/google/protobuf/z2;->f:J

    const-class v0, [Z

    invoke-static {v0}, Lcom/google/protobuf/z2;->c(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/protobuf/z2;->d(Ljava/lang/Class;)V

    const-class v0, [I

    invoke-static {v0}, Lcom/google/protobuf/z2;->c(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/protobuf/z2;->d(Ljava/lang/Class;)V

    const-class v0, [J

    invoke-static {v0}, Lcom/google/protobuf/z2;->c(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/protobuf/z2;->d(Ljava/lang/Class;)V

    const-class v0, [F

    invoke-static {v0}, Lcom/google/protobuf/z2;->c(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/protobuf/z2;->d(Ljava/lang/Class;)V

    const-class v0, [D

    invoke-static {v0}, Lcom/google/protobuf/z2;->c(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/protobuf/z2;->d(Ljava/lang/Class;)V

    const-class v0, [Ljava/lang/Object;

    invoke-static {v0}, Lcom/google/protobuf/z2;->c(Ljava/lang/Class;)I

    invoke-static {v0}, Lcom/google/protobuf/z2;->d(Ljava/lang/Class;)V

    invoke-static {}, Lcom/google/protobuf/z2;->e()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_7

    if-nez v5, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v5, v0}, Lcom/google/protobuf/y2;->l(Ljava/lang/reflect/Field;)J

    move-result-wide v0

    goto :goto_4

    :cond_7
    :goto_3
    const-wide/16 v0, -0x1

    :goto_4
    sput-wide v0, Lcom/google/protobuf/z2;->g:J

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    if-ne v0, v1, :cond_8

    goto :goto_5

    :cond_8
    move v3, v4

    :goto_5
    sput-boolean v3, Lcom/google/protobuf/z2;->h:Z

    return-void
.end method

.method public static a(Ljava/lang/Throwable;)V
    .locals 4

    const-class v0, Lcom/google/protobuf/z2;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "platform method missing - proto runtime falling back to safer methods: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    sget-object v0, Lcom/google/protobuf/z2;->a:Lsun/misc/Unsafe;

    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static c(Ljava/lang/Class;)I
    .locals 1

    sget-boolean v0, Lcom/google/protobuf/z2;->e:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/y2;->a(Ljava/lang/Class;)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    :goto_0
    return p0
.end method

.method public static d(Ljava/lang/Class;)V
    .locals 1

    sget-boolean v0, Lcom/google/protobuf/z2;->e:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/y2;->b(Ljava/lang/Class;)I

    :cond_0
    return-void
.end method

.method public static e()Ljava/lang/reflect/Field;
    .locals 4

    invoke-static {}, Lcom/google/protobuf/e;->a()Z

    move-result v0

    const-class v1, Ljava/nio/Buffer;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string v0, "effectiveDirectAddress"

    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "address"

    :try_start_1
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v1, v3, :cond_1

    move-object v2, v0

    :cond_1
    return-object v2
.end method

.method public static f(Ljava/lang/Class;)Z
    .locals 10

    const-class v0, [B

    invoke-static {}, Lcom/google/protobuf/e;->a()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    :try_start_0
    sget-object v1, Lcom/google/protobuf/z2;->b:Ljava/lang/Class;

    const-string v3, "peekLong"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Class;

    aput-object p0, v5, v2

    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x1

    aput-object v6, v5, v7

    invoke-virtual {v1, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeLong"

    const/4 v5, 0x3

    new-array v8, v5, [Ljava/lang/Class;

    aput-object p0, v8, v2

    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v7

    aput-object v6, v8, v4

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeInt"

    new-array v8, v5, [Ljava/lang/Class;

    aput-object p0, v8, v2

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v9, v8, v7

    aput-object v6, v8, v4

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekInt"

    new-array v8, v4, [Ljava/lang/Class;

    aput-object p0, v8, v2

    aput-object v6, v8, v7

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeByte"

    new-array v6, v4, [Ljava/lang/Class;

    aput-object p0, v6, v2

    sget-object v8, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    aput-object v8, v6, v7

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekByte"

    new-array v6, v7, [Ljava/lang/Class;

    aput-object p0, v6, v2

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "pokeByteArray"

    const/4 v6, 0x4

    new-array v8, v6, [Ljava/lang/Class;

    aput-object p0, v8, v2

    aput-object v0, v8, v7

    aput-object v9, v8, v4

    aput-object v9, v8, v5

    invoke-virtual {v1, v3, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    const-string v3, "peekByteArray"

    new-array v6, v6, [Ljava/lang/Class;

    aput-object p0, v6, v2

    aput-object v0, v6, v7

    aput-object v9, v6, v4

    aput-object v9, v6, v5

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v7

    :catchall_0
    return v2
.end method

.method public static g([BJ)B
    .locals 2

    sget-wide v0, Lcom/google/protobuf/z2;->f:J

    add-long/2addr v0, p1

    sget-object p1, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {p1, p0, v0, v1}, Lcom/google/protobuf/y2;->f(Ljava/lang/Object;J)B

    move-result p0

    return p0
.end method

.method public static h(Ljava/lang/Object;J)B
    .locals 3

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    sget-object v2, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v2, p0, v0, v1}, Lcom/google/protobuf/y2;->i(Ljava/lang/Object;J)I

    move-result p0

    not-long p1, p1

    const-wide/16 v0, 0x3

    and-long/2addr p1, v0

    const/4 v0, 0x3

    shl-long/2addr p1, v0

    long-to-int p1, p1

    ushr-int/2addr p0, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    return p0
.end method

.method public static i(Ljava/lang/Object;J)B
    .locals 3

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    sget-object v2, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v2, p0, v0, v1}, Lcom/google/protobuf/y2;->i(Ljava/lang/Object;J)I

    move-result p0

    const-wide/16 v0, 0x3

    and-long/2addr p1, v0

    const/4 v0, 0x3

    shl-long/2addr p1, v0

    long-to-int p1, p1

    ushr-int/2addr p0, p1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    return p0
.end method

.method public static j(Ljava/lang/Object;J)I
    .locals 1

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/protobuf/y2;->i(Ljava/lang/Object;J)I

    move-result p0

    return p0
.end method

.method public static k(Ljava/lang/Object;J)J
    .locals 1

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/protobuf/y2;->j(Ljava/lang/Object;J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static l(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v0, p0, p1, p2}, Lcom/google/protobuf/y2;->k(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static m()Lsun/misc/Unsafe;
    .locals 1

    :try_start_0
    new-instance v0, Lcom/google/protobuf/v2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public static n(Ljava/lang/Object;JZ)V
    .locals 1

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/protobuf/y2;->m(Ljava/lang/Object;JZ)V

    return-void
.end method

.method public static o([BJB)V
    .locals 2

    sget-wide v0, Lcom/google/protobuf/z2;->f:J

    add-long/2addr v0, p1

    sget-object p1, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {p1, p0, v0, v1, p3}, Lcom/google/protobuf/y2;->n(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static p(Ljava/lang/Object;JB)V
    .locals 4

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    sget-object v2, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v2, p0, v0, v1}, Lcom/google/protobuf/y2;->i(Ljava/lang/Object;J)I

    move-result v2

    long-to-int p1, p1

    not-int p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int v3, p2, p1

    not-int v3, v3

    and-int/2addr v2, v3

    and-int/2addr p2, p3

    shl-int p1, p2, p1

    or-int/2addr p1, v2

    invoke-static {v0, v1, p0, p1}, Lcom/google/protobuf/z2;->t(JLjava/lang/Object;I)V

    return-void
.end method

.method public static q(Ljava/lang/Object;JB)V
    .locals 4

    const-wide/16 v0, -0x4

    and-long/2addr v0, p1

    sget-object v2, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v2, p0, v0, v1}, Lcom/google/protobuf/y2;->i(Ljava/lang/Object;J)I

    move-result v2

    long-to-int p1, p1

    and-int/lit8 p1, p1, 0x3

    shl-int/lit8 p1, p1, 0x3

    const/16 p2, 0xff

    shl-int v3, p2, p1

    not-int v3, v3

    and-int/2addr v2, v3

    and-int/2addr p2, p3

    shl-int p1, p2, p1

    or-int/2addr p1, v2

    invoke-static {v0, v1, p0, p1}, Lcom/google/protobuf/z2;->t(JLjava/lang/Object;I)V

    return-void
.end method

.method public static r(Ljava/lang/Object;JD)V
    .locals 6

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/protobuf/y2;->o(Ljava/lang/Object;JD)V

    return-void
.end method

.method public static s(Ljava/lang/Object;JF)V
    .locals 1

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/protobuf/y2;->p(Ljava/lang/Object;JF)V

    return-void
.end method

.method public static t(JLjava/lang/Object;I)V
    .locals 1

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/protobuf/y2;->q(JLjava/lang/Object;I)V

    return-void
.end method

.method public static u(Ljava/lang/Object;JJ)V
    .locals 6

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/google/protobuf/y2;->r(Ljava/lang/Object;JJ)V

    return-void
.end method

.method public static v(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    sget-object v0, Lcom/google/protobuf/z2;->c:Lcom/google/protobuf/y2;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/google/protobuf/y2;->s(Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method
