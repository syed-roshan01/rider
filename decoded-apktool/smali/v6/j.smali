.class public final Lv6/j;
.super Ljava/lang/Object;


# instance fields
.field public final a:Li7/i1;

.field public final b:Ljava/util/List;

.field public final c:Lg7/a;


# direct methods
.method public constructor <init>(Li7/i1;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/j;->a:Li7/i1;

    iput-object p2, p0, Lv6/j;->b:Ljava/util/List;

    sget-object p1, Lg7/a;->b:Lg7/a;

    iput-object p1, p0, Lv6/j;->c:Lg7/a;

    return-void
.end method

.method public static final a(Li7/i1;)Lv6/j;
    .locals 9

    invoke-virtual {p0}, Li7/i1;->A()I

    move-result v0

    if-lez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Li7/i1;->A()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Li7/i1;->B()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/h1;

    invoke-virtual {v2}, Li7/h1;->C()I

    invoke-virtual {v2}, Li7/h1;->C()I

    move-result v3

    invoke-virtual {v2}, Li7/h1;->D()Li7/t1;

    move-result-object v4

    sget-object v5, Li7/t1;->e:Li7/t1;

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    move-object v3, v6

    goto :goto_1

    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :goto_1
    :try_start_0
    invoke-virtual {v2}, Li7/h1;->B()Li7/a1;

    move-result-object v4

    invoke-virtual {v4}, Li7/a1;->C()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Li7/h1;->B()Li7/a1;

    move-result-object v5

    invoke-virtual {v5}, Li7/a1;->D()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v5

    invoke-virtual {v2}, Li7/h1;->B()Li7/a1;

    move-result-object v7

    invoke-virtual {v7}, Li7/a1;->B()Li7/z0;

    move-result-object v7

    invoke-virtual {v2}, Li7/h1;->D()Li7/t1;

    move-result-object v8

    invoke-static {v4, v5, v7, v8, v3}, Ld7/s;->a(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/l;Li7/z0;Li7/t1;Ljava/lang/Integer;)Ld7/s;

    move-result-object v3
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    sget-object v4, Ld7/k;->b:Ld7/k;

    invoke-virtual {v4, v3}, Ld7/k;->a(Ld7/s;)Lv6/b;

    move-result-object v3

    new-instance v4, Lv6/i;

    invoke-virtual {v2}, Li7/h1;->E()Li7/b1;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v5, 0x1

    if-eq v2, v5, :cond_2

    const/4 v5, 0x2

    if-eq v2, v5, :cond_2

    const/4 v5, 0x3

    if-ne v2, v5, :cond_1

    goto :goto_2

    :cond_1
    new-instance v2, Ljava/security/GeneralSecurityException;

    const-string v3, "Unknown key status"

    invoke-direct {v2, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    :goto_2
    invoke-direct {v4, v3}, Lv6/i;-><init>(Lv6/b;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_1
    move-exception p0

    new-instance v0, Landroidx/fragment/app/a0;

    const-string v1, "Creating a protokey serialization failed"

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lv6/j;

    invoke-direct {v1, p0, v0}, Lv6/j;-><init>(Li7/i1;Ljava/util/List;)V

    return-object v1

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(Lk6/w4;Lv6/a;)Lv6/j;
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [B

    :try_start_0
    iget-object v1, p0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v1, Ljava/io/InputStream;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v2

    invoke-static {v1, v2}, Li7/q0;->B(Ljava/io/InputStream;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/q0;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p0, p0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast p0, Ljava/io/InputStream;

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    invoke-virtual {v1}, Li7/q0;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result p0

    const-string v2, "empty keyset"

    if-eqz p0, :cond_1

    :try_start_1
    invoke-virtual {v1}, Li7/q0;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/l;->o()[B

    move-result-object p0

    invoke-interface {p1, p0, v0}, Lv6/a;->b([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p1

    invoke-static {p0, p1}, Li7/i1;->F([BLcom/google/crypto/tink/shaded/protobuf/t;)Li7/i1;

    move-result-object p0

    invoke-virtual {p0}, Li7/i1;->A()I

    move-result p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_1 .. :try_end_1} :catch_0

    if-lez p1, :cond_0

    invoke-static {p0}, Lv6/j;->a(Li7/i1;)Lv6/j;

    move-result-object p0

    return-object p0

    :cond_0
    :try_start_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p1

    iget-object p0, p0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast p0, Ljava/io/InputStream;

    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    throw p1
.end method


# virtual methods
.method public final b(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lv6/q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Ld7/j;->b:Ld7/j;

    invoke-virtual {v1, p1}, Ld7/j;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    const-string v2, "No wrapper found for "

    if-eqz v1, :cond_14

    sget v3, Lv6/s;->a:I

    iget-object v3, p0, Lv6/j;->a:Li7/i1;

    invoke-virtual {v3}, Li7/i1;->C()I

    move-result v4

    invoke-virtual {v3}, Li7/i1;->B()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    move v10, v6

    move v8, v7

    move v9, v8

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    sget-object v12, Li7/b1;->c:Li7/b1;

    if-eqz v11, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Li7/h1;

    invoke-virtual {v11}, Li7/h1;->E()Li7/b1;

    move-result-object v13

    if-eq v13, v12, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v11}, Li7/h1;->F()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-virtual {v11}, Li7/h1;->D()Li7/t1;

    move-result-object v12

    sget-object v13, Li7/t1;->b:Li7/t1;

    if-eq v12, v13, :cond_5

    invoke-virtual {v11}, Li7/h1;->E()Li7/b1;

    move-result-object v12

    sget-object v13, Li7/b1;->b:Li7/b1;

    if-eq v12, v13, :cond_4

    invoke-virtual {v11}, Li7/h1;->C()I

    move-result v12

    if-ne v12, v4, :cond_2

    if-nez v9, :cond_1

    move v9, v6

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset contains multiple primary keys"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_2
    invoke-virtual {v11}, Li7/h1;->B()Li7/a1;

    move-result-object v11

    invoke-virtual {v11}, Li7/a1;->B()Li7/z0;

    move-result-object v11

    sget-object v12, Li7/z0;->e:Li7/z0;

    if-eq v11, v12, :cond_3

    move v10, v7

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v11}, Li7/h1;->C()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "key %d has unknown status"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v11}, Li7/h1;->C()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "key %d has unknown prefix"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {v11}, Li7/h1;->C()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "key %d has no key data"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    if-eqz v8, :cond_13

    if-nez v9, :cond_9

    if-eqz v10, :cond_8

    goto :goto_3

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset doesn\'t contain a valid primary key"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_3
    new-instance v4, Li3/a0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v5, v4, Li3/a0;->b:Ljava/lang/Object;

    iput-object v1, v4, Li3/a0;->a:Ljava/lang/Object;

    sget-object v5, Lg7/a;->b:Lg7/a;

    iget-object v5, p0, Lv6/j;->c:Lg7/a;

    iput-object v5, v4, Li3/a0;->d:Ljava/lang/Object;

    move v5, v7

    :goto_4
    invoke-virtual {v3}, Li7/i1;->A()I

    move-result v8

    if-ge v5, v8, :cond_f

    invoke-virtual {v3, v5}, Li7/i1;->z(I)Li7/h1;

    move-result-object v8

    invoke-virtual {v8}, Li7/h1;->E()Li7/b1;

    move-result-object v9

    invoke-virtual {v9, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    :try_start_1
    invoke-virtual {v8}, Li7/h1;->B()Li7/a1;

    move-result-object v9

    sget-object v10, Lv6/q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v9}, Li7/a1;->C()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9}, Li7/a1;->D()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v9

    invoke-static {v10, v9, v1}, Lv6/q;->c(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    move-exception v9

    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v10

    const-string v11, "No key manager found for key type "

    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_b

    invoke-virtual {v9}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v10

    const-string v11, " not supported by key manager of type "

    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_a

    goto :goto_5

    :cond_a
    throw v9

    :cond_b
    :goto_5
    move-object v9, v0

    :goto_6
    iget-object v10, p0, Lv6/j;->b:Ljava/util/List;

    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_c

    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lv6/i;

    iget-object v10, v10, Lv6/i;->a:Lv6/b;

    :try_start_2
    invoke-static {v10, v1}, Lv6/q;->b(Lv6/b;Ljava/lang/Class;)Le7/f;

    move-result-object v10
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_7

    :catch_2
    :cond_c
    move-object v10, v0

    :goto_7
    invoke-virtual {v8}, Li7/h1;->C()I

    move-result v11

    invoke-virtual {v3}, Li7/i1;->C()I

    move-result v13

    if-ne v11, v13, :cond_d

    invoke-virtual {v4, v10, v9, v8, v6}, Li3/a0;->a(Le7/f;Ljava/lang/Object;Li7/h1;Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v4, v10, v9, v8, v7}, Li3/a0;->a(Le7/f;Ljava/lang/Object;Li7/h1;Z)V

    :cond_e
    :goto_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_f
    iget-object v1, v4, Li3/a0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v1, :cond_12

    new-instance v3, Lj0/b0;

    iget-object v5, v4, Li3/a0;->c:Ljava/lang/Object;

    check-cast v5, Lv6/n;

    iget-object v6, v4, Li3/a0;->d:Ljava/lang/Object;

    check-cast v6, Lg7/a;

    iget-object v8, v4, Li3/a0;->a:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Class;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v1, v3, Lj0/b0;->b:Ljava/lang/Object;

    iput-object v5, v3, Lj0/b0;->c:Ljava/lang/Object;

    iput-object v8, v3, Lj0/b0;->d:Ljava/lang/Object;

    iput-object v6, v3, Lj0/b0;->e:Ljava/lang/Object;

    iput-boolean v7, v3, Lj0/b0;->a:Z

    iput-object v0, v4, Li3/a0;->b:Ljava/lang/Object;

    sget-object v0, Lv6/q;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Ld7/j;->b:Ld7/j;

    iget-object v0, v0, Ld7/j;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld7/r;

    iget-object v0, v0, Ld7/r;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv6/p;

    iget-object v0, v3, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-interface {p1}, Lv6/p;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Lv6/p;->a()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, v3, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1, v3}, Lv6/p;->b(Lj0/b0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_10
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Input primitive type of the wrapper doesn\'t match the type of primitives in the provided PrimitiveSet"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "build cannot be called twice"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "keyset must contain at least one ENABLED key"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lv6/j;->a:Li7/i1;

    invoke-static {v0}, Lv6/s;->a(Li7/i1;)Li7/m1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
