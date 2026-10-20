.class public final Lh8/p;
.super Lh8/q;


# static fields
.field public static final d:Ll/z2;

.field public static final e:Ll/z2;

.field public static final f:Ll/z2;

.field public static final g:Ll/z2;

.field public static final h:Ll/z2;

.field public static final i:Ll/z2;

.field public static final j:Ljava/lang/reflect/Method;

.field public static final k:Ljava/lang/reflect/Method;

.field public static final l:Ljava/lang/reflect/Method;

.field public static final m:Ljava/lang/reflect/Method;

.field public static final n:Ljava/lang/reflect/Method;

.field public static final o:Ljava/lang/reflect/Method;

.field public static final p:Ljava/lang/reflect/Constructor;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    const-string v1, "Failed to find Android 7.0+ APIs"

    const-string v2, "Failed to find Android 10.0+ APIs"

    const-class v3, Ljavax/net/ssl/SSLParameters;

    const-class v0, Ljavax/net/ssl/SSLSocket;

    sget-object v4, Lh8/q;->b:Ljava/util/logging/Logger;

    new-instance v5, Ll/z2;

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Class;

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v9, 0x0

    aput-object v8, v7, v9

    const/4 v10, 0x0

    const-string v11, "setUseSessionTickets"

    const/16 v12, 0x17

    invoke-direct {v5, v10, v11, v7, v12}, Ll/z2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sput-object v5, Lh8/p;->d:Ll/z2;

    new-instance v5, Ll/z2;

    new-array v7, v6, [Ljava/lang/Class;

    const-class v13, Ljava/lang/String;

    aput-object v13, v7, v9

    const-string v14, "setHostname"

    invoke-direct {v5, v10, v14, v7, v12}, Ll/z2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sput-object v5, Lh8/p;->e:Ll/z2;

    new-instance v5, Ll/z2;

    const-string v7, "getAlpnSelectedProtocol"

    new-array v14, v9, [Ljava/lang/Class;

    const-class v15, [B

    invoke-direct {v5, v15, v7, v14, v12}, Ll/z2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sput-object v5, Lh8/p;->f:Ll/z2;

    new-instance v5, Ll/z2;

    new-array v7, v6, [Ljava/lang/Class;

    aput-object v15, v7, v9

    const-string v14, "setAlpnProtocols"

    invoke-direct {v5, v10, v14, v7, v12}, Ll/z2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sput-object v5, Lh8/p;->g:Ll/z2;

    new-instance v5, Ll/z2;

    const-string v7, "getNpnSelectedProtocol"

    new-array v14, v9, [Ljava/lang/Class;

    invoke-direct {v5, v15, v7, v14, v12}, Ll/z2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sput-object v5, Lh8/p;->h:Ll/z2;

    new-instance v5, Ll/z2;

    new-array v7, v6, [Ljava/lang/Class;

    aput-object v15, v7, v9

    const-string v14, "setNpnProtocols"

    invoke-direct {v5, v10, v14, v7, v12}, Ll/z2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sput-object v5, Lh8/p;->i:Ll/z2;

    :try_start_0
    const-string v5, "setApplicationProtocols"

    new-array v7, v6, [Ljava/lang/Class;

    const-class v12, [Ljava/lang/String;

    aput-object v12, v7, v9

    invoke-virtual {v3, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_8

    :try_start_1
    const-string v7, "getApplicationProtocols"

    new-array v12, v9, [Ljava/lang/Class;

    invoke-virtual {v3, v7, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_6

    :try_start_2
    const-string v12, "getApplicationProtocol"

    new-array v14, v9, [Ljava/lang/Class;

    invoke-virtual {v0, v12, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v12
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_4

    :try_start_3
    const-string v14, "android.net.ssl.SSLSockets"

    invoke-static {v14}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v14

    const-string v15, "isSupportedSocket"

    new-array v10, v6, [Ljava/lang/Class;

    aput-object v0, v10, v9

    invoke-virtual {v14, v15, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_2

    const/4 v15, 0x2

    :try_start_4
    new-array v15, v15, [Ljava/lang/Class;

    aput-object v0, v15, v9

    aput-object v8, v15, v6

    invoke-virtual {v14, v11, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    const/4 v10, 0x0

    goto :goto_4

    :catch_3
    move-exception v0

    const/4 v10, 0x0

    goto :goto_6

    :catch_4
    move-exception v0

    :goto_0
    const/4 v10, 0x0

    const/4 v12, 0x0

    goto :goto_4

    :catch_5
    move-exception v0

    :goto_1
    const/4 v10, 0x0

    const/4 v12, 0x0

    goto :goto_6

    :catch_6
    move-exception v0

    :goto_2
    const/4 v7, 0x0

    goto :goto_0

    :catch_7
    move-exception v0

    :goto_3
    const/4 v7, 0x0

    goto :goto_1

    :catch_8
    move-exception v0

    const/4 v5, 0x0

    goto :goto_2

    :catch_9
    move-exception v0

    const/4 v5, 0x0

    goto :goto_3

    :goto_4
    sget-object v8, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    invoke-virtual {v4, v8, v2, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    const/4 v0, 0x0

    goto :goto_7

    :goto_6
    sget-object v8, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    invoke-virtual {v4, v8, v2, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    :goto_7
    sput-object v5, Lh8/p;->l:Ljava/lang/reflect/Method;

    sput-object v7, Lh8/p;->m:Ljava/lang/reflect/Method;

    sput-object v12, Lh8/p;->n:Ljava/lang/reflect/Method;

    sput-object v10, Lh8/p;->j:Ljava/lang/reflect/Method;

    sput-object v0, Lh8/p;->k:Ljava/lang/reflect/Method;

    :try_start_5
    const-string v0, "setServerNames"

    new-array v2, v6, [Ljava/lang/Class;

    const-class v5, Ljava/util/List;

    aput-object v5, v2, v9

    invoke-virtual {v3, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_d
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_c

    :try_start_6
    const-string v0, "javax.net.ssl.SNIHostName"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    new-array v3, v6, [Ljava/lang/Class;

    aput-object v13, v3, v9

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_b
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_a

    goto :goto_b

    :catch_a
    move-exception v0

    goto :goto_8

    :catch_b
    move-exception v0

    goto :goto_a

    :catch_c
    move-exception v0

    const/4 v2, 0x0

    goto :goto_8

    :catch_d
    move-exception v0

    const/4 v2, 0x0

    goto :goto_a

    :goto_8
    sget-object v3, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    invoke-virtual {v4, v3, v1, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_9
    const/4 v10, 0x0

    goto :goto_b

    :goto_a
    sget-object v3, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    invoke-virtual {v4, v3, v1, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_9

    :goto_b
    sput-object v2, Lh8/p;->o:Ljava/lang/reflect/Method;

    sput-object v10, Lh8/p;->p:Ljava/lang/reflect/Constructor;

    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/l;

    iget-object v2, v2, Li8/l;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSSLParameters()Ljavax/net/ssl/SSLParameters;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz p2, :cond_3

    :try_start_0
    invoke-static {p2}, Lh8/q;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, Lh8/p;->j:Ljava/lang/reflect/Method;

    if-eqz v4, :cond_1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lh8/p;->k:Ljava/lang/reflect/Method;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p1, v5, v1

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v7, v5, v3

    invoke-virtual {v4, v6, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_5

    :catch_1
    move-exception p1

    goto/16 :goto_6

    :catch_2
    move-exception p1

    goto/16 :goto_7

    :cond_1
    sget-object v4, Lh8/p;->d:Ll/z2;

    new-array v5, v3, [Ljava/lang/Object;

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object v6, v5, v1

    invoke-virtual {v4, p1, v5}, Ll/z2;->F(Ljava/lang/Object;[Ljava/lang/Object;)V

    :goto_1
    sget-object v4, Lh8/p;->o:Ljava/lang/reflect/Method;

    if-eqz v4, :cond_2

    sget-object v5, Lh8/p;->p:Ljava/lang/reflect/Constructor;

    if-eqz v5, :cond_2

    new-array v6, v3, [Ljava/lang/Object;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v5, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    aput-object p2, v6, v1

    invoke-virtual {v4, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    sget-object v4, Lh8/p;->e:Ll/z2;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v4, p1, p2}, Ll/z2;->F(Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_3
    :goto_2
    sget-object p2, Lh8/p;->n:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_5

    :try_start_1
    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {p2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p2, Lh8/p;->l:Ljava/lang/reflect/Method;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p2, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_0

    move p2, v3

    goto :goto_4

    :catch_3
    move-exception p2

    :try_start_2
    invoke-virtual {p2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v4

    instance-of v4, v4, Ljava/lang/UnsupportedOperationException;

    if-eqz v4, :cond_4

    sget-object p2, Lh8/q;->b:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    const-string v5, "setApplicationProtocol unsupported, will try old methods"

    invoke-virtual {p2, v4, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    throw p2

    :cond_5
    :goto_3
    move p2, v1

    :goto_4
    invoke-virtual {p1, v2}, Ljavax/net/ssl/SSLSocket;->setSSLParameters(Ljavax/net/ssl/SSLParameters;)V

    if-eqz p2, :cond_6

    sget-object p2, Lh8/p;->m:Ljava/lang/reflect/Method;

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSSLParameters()Ljavax/net/ssl/SSLParameters;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p2, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-static {v0, p2}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p2
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz p2, :cond_6

    return-void

    :cond_6
    invoke-static {p3}, Li8/k;->b(Ljava/util/List;)[B

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    iget-object p3, p0, Lh8/q;->a:Li8/k;

    invoke-virtual {p3}, Li8/k;->e()I

    move-result v0

    if-ne v0, v3, :cond_7

    sget-object v0, Lh8/p;->g:Ll/z2;

    invoke-virtual {v0, p1, p2}, Ll/z2;->G(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-virtual {p3}, Li8/k;->e()I

    move-result p3

    const/4 v0, 0x3

    if-eq p3, v0, :cond_8

    sget-object p3, Lh8/p;->i:Ll/z2;

    invoke-virtual {p3, p1, p2}, Ll/z2;->G(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_5
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_6
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :goto_7
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final b(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 6

    sget-object v0, Lh8/q;->b:Ljava/util/logging/Logger;

    const/4 v1, 0x0

    sget-object v2, Lh8/p;->n:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    :try_start_0
    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v3, v3, Ljava/lang/UnsupportedOperationException;

    if-eqz v3, :cond_0

    sget-object v2, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    const-string v3, "Socket unsupported for getApplicationProtocol, will try old methods"

    invoke-virtual {v0, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :goto_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    :goto_2
    iget-object v2, p0, Lh8/q;->a:Li8/k;

    invoke-virtual {v2}, Li8/k;->e()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    :try_start_1
    sget-object v3, Lh8/p;->f:Ll/z2;

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {v3, p1, v4}, Ll/z2;->G(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    if-eqz v3, :cond_2

    new-instance v4, Ljava/lang/String;

    sget-object v5, Li8/n;->b:Ljava/nio/charset/Charset;

    invoke-direct {v4, v3, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    return-object v4

    :catch_2
    move-exception v3

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v5, "Failed calling getAlpnSelectedProtocol()"

    invoke-virtual {v0, v4, v5, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {v2}, Li8/k;->e()I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_3

    :try_start_2
    sget-object v2, Lh8/p;->h:Ll/z2;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2, p1, v1}, Ll/z2;->G(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    if-eqz p1, :cond_3

    new-instance v1, Ljava/lang/String;

    sget-object v2, Li8/n;->b:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    return-object v1

    :catch_3
    move-exception p1

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v2, "Failed calling getNpnSelectedProtocol()"

    invoke-virtual {v0, v1, v2, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p1}, Lh8/p;->b(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Lh8/q;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
