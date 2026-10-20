.class public final Lc7/a;
.super Ljava/lang/Object;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Lc7/c;

.field public f:Lv6/h;

.field public g:Lk6/w4;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc7/a;->a:Landroid/content/Context;

    iput-object v0, p0, Lc7/a;->b:Ljava/lang/String;

    iput-object v0, p0, Lc7/a;->c:Ljava/lang/String;

    iput-object v0, p0, Lc7/a;->d:Ljava/lang/String;

    iput-object v0, p0, Lc7/a;->e:Lc7/c;

    iput-object v0, p0, Lc7/a;->f:Lv6/h;

    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B
    .locals 1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    if-nez p2, :cond_0

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    :goto_0
    const/4 p2, 0x0

    :try_start_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    return-object p2

    :cond_1
    invoke-static {p0}, Ld7/a;->s(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/io/CharConversionException;

    const-string p2, "can\'t read keyset; the pref value %s is not a valid hex string"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "keysetName cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static d([B)Lk6/w4;
    .locals 2

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    :try_start_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object p0

    invoke-static {v0, p0}, Li7/i1;->E(Ljava/io/InputStream;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/i1;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    invoke-static {p0}, Lv6/j;->a(Li7/i1;)Lv6/j;

    move-result-object p0

    new-instance v0, Lk6/w4;

    iget-object p0, p0, Lv6/j;->a:Li7/i1;

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->w()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Li7/f1;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lk6/w4;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    throw p0
.end method


# virtual methods
.method public final declared-synchronized a()Lc7/b;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lc7/a;->b:Ljava/lang/String;

    if-eqz v0, :cond_3

    sget-object v0, Lc7/b;->b:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lc7/a;->a:Landroid/content/Context;

    iget-object v2, p0, Lc7/a;->b:Ljava/lang/String;

    iget-object v3, p0, Lc7/a;->c:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lc7/a;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lc7/a;->d:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lc7/a;->f()Lc7/c;

    move-result-object v1

    iput-object v1, p0, Lc7/a;->e:Lc7/c;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lc7/a;->b()Lk6/w4;

    move-result-object v1

    iput-object v1, p0, Lc7/a;->g:Lk6/w4;

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lc7/a;->d:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {p0, v1}, Lc7/a;->e([B)Lk6/w4;

    move-result-object v1

    iput-object v1, p0, Lc7/a;->g:Lk6/w4;

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lc7/a;->d([B)Lk6/w4;

    move-result-object v1

    iput-object v1, p0, Lc7/a;->g:Lk6/w4;

    :goto_1
    new-instance v1, Lc7/b;

    invoke-direct {v1, p0}, Lc7/b;-><init>(Lc7/a;)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v1

    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v1

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "keysetName cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    monitor-exit p0

    throw v0
.end method

.method public final b()Lk6/w4;
    .locals 8

    iget-object v0, p0, Lc7/a;->f:Lv6/h;

    if-eqz v0, :cond_9

    new-instance v0, Lk6/w4;

    invoke-static {}, Li7/i1;->D()Li7/f1;

    move-result-object v1

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lk6/w4;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lc7/a;->f:Lv6/h;

    monitor-enter v0

    :try_start_0
    iget-object v1, v1, Lv6/h;->a:Li7/d1;

    invoke-virtual {v0, v1}, Lk6/w4;->b(Li7/d1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    invoke-virtual {v0}, Lk6/w4;->g()Lv6/j;

    move-result-object v1

    iget-object v1, v1, Lv6/j;->a:Li7/i1;

    invoke-static {v1}, Lv6/s;->a(Li7/i1;)Li7/m1;

    move-result-object v1

    invoke-virtual {v1}, Li7/m1;->z()Li7/l1;

    move-result-object v1

    invoke-virtual {v1}, Li7/l1;->B()I

    move-result v1

    monitor-enter v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    :try_start_1
    iget-object v4, v0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v4, Li7/f1;

    iget-object v4, v4, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v4, Li7/i1;

    invoke-virtual {v4}, Li7/i1;->A()I

    move-result v4

    if-ge v3, v4, :cond_8

    iget-object v4, v0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v4, Li7/f1;

    iget-object v4, v4, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v4, Li7/i1;

    invoke-virtual {v4, v3}, Li7/i1;->z(I)Li7/h1;

    move-result-object v4

    invoke-virtual {v4}, Li7/h1;->C()I

    move-result v5

    if-ne v5, v1, :cond_7

    invoke-virtual {v4}, Li7/h1;->E()Li7/b1;

    move-result-object v3

    sget-object v4, Li7/b1;->c:Li7/b1;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v0, Lk6/w4;->b:Ljava/lang/Object;

    check-cast v3, Li7/f1;

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v3, v3, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v3, Li7/i1;

    invoke-static {v3, v1}, Li7/i1;->x(Li7/i1;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    iget-object v1, p0, Lc7/a;->a:Landroid/content/Context;

    iget-object v3, p0, Lc7/a;->b:Ljava/lang/String;

    iget-object v4, p0, Lc7/a;->c:Ljava/lang/String;

    if-eqz v3, :cond_5

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-nez v4, :cond_0

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-virtual {v1, v4, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    :goto_1
    iget-object v4, p0, Lc7/a;->e:Lc7/c;

    if-eqz v4, :cond_3

    invoke-virtual {v0}, Lk6/w4;->g()Lv6/j;

    move-result-object v4

    iget-object v5, p0, Lc7/a;->e:Lc7/c;

    new-array v6, v2, [B

    iget-object v4, v4, Lv6/j;->a:Li7/i1;

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/b;->d()[B

    move-result-object v7

    invoke-virtual {v5, v7, v6}, Lc7/c;->a([B[B)[B

    move-result-object v7

    :try_start_2
    invoke-virtual {v5, v7, v6}, Lc7/c;->b([B[B)[B

    move-result-object v5

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v6

    invoke-static {v5, v6}, Li7/i1;->F([BLcom/google/crypto/tink/shaded/protobuf/t;)Li7/i1;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/crypto/tink/shaded/protobuf/b0;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v5, :cond_2

    invoke-static {}, Li7/q0;->A()Li7/p0;

    move-result-object v5

    array-length v6, v7

    invoke-static {v7, v2, v6}, Lcom/google/crypto/tink/shaded/protobuf/l;->i([BII)Lcom/google/crypto/tink/shaded/protobuf/k;

    move-result-object v2

    invoke-virtual {v5}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v6, v5, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v6, Li7/q0;

    invoke-static {v6, v2}, Li7/q0;->x(Li7/q0;Lcom/google/crypto/tink/shaded/protobuf/k;)V

    invoke-static {v4}, Lv6/s;->a(Li7/i1;)Li7/m1;

    move-result-object v2

    invoke-virtual {v5}, Lcom/google/crypto/tink/shaded/protobuf/z;->d()V

    iget-object v4, v5, Lcom/google/crypto/tink/shaded/protobuf/z;->b:Lcom/google/crypto/tink/shaded/protobuf/b0;

    check-cast v4, Li7/q0;

    invoke-static {v4, v2}, Li7/q0;->y(Li7/q0;Li7/m1;)V

    invoke-virtual {v5}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/b0;

    move-result-object v2

    check-cast v2, Li7/q0;

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/b;->d()[B

    move-result-object v2

    invoke-static {v2}, Ld7/a;->t([B)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to write to SharedPreferences"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :try_start_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cannot encrypt keyset"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "invalid keyset, corrupted key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-virtual {v0}, Lk6/w4;->g()Lv6/j;

    move-result-object v2

    iget-object v2, v2, Lv6/j;->a:Li7/i1;

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/b;->d()[B

    move-result-object v2

    invoke-static {v2}, Ld7/a;->t([B)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_2
    return-object v0

    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to write to SharedPreferences"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "keysetName cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :try_start_4
    new-instance v2, Ljava/security/GeneralSecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "cannot set key as primary because it\'s not enabled: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_8
    new-instance v2, Ljava/security/GeneralSecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "key not found: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_3
    monitor-exit v0

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cannot read or generate keyset"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e([B)Lk6/w4;
    .locals 3

    :try_start_0
    new-instance v0, Lc7/d;

    invoke-direct {v0}, Lc7/d;-><init>()V

    iget-object v1, p0, Lc7/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc7/d;->c(Ljava/lang/String;)Lc7/c;

    move-result-object v0

    iput-object v0, p0, Lc7/a;->e:Lc7/c;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_3

    :try_start_1
    new-instance v0, Lk6/w4;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lk6/w4;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lc7/a;->e:Lc7/c;

    invoke-static {v0, v1}, Lv6/j;->c(Lk6/w4;Lv6/a;)Lv6/j;

    move-result-object v0

    new-instance v1, Lk6/w4;

    iget-object v0, v0, Lv6/j;->a:Li7/i1;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->w()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    check-cast v0, Li7/f1;

    const/4 v2, 0x6

    invoke-direct {v1, v0, v2}, Lk6/w4;-><init>(Ljava/lang/Object;I)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    :try_start_2
    invoke-static {p1}, Lc7/a;->d([B)Lk6/w4;

    move-result-object p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p1

    :catch_2
    throw v0

    :catch_3
    move-exception v0

    goto :goto_1

    :catch_4
    move-exception v0

    :goto_1
    :try_start_3
    invoke-static {p1}, Lc7/a;->d([B)Lk6/w4;

    move-result-object p1

    sget-object v1, Lc7/b;->b:Ljava/lang/Object;

    const-string v1, "b"

    const-string v2, "cannot use Android Keystore, it\'ll be disabled"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    return-object p1

    :catch_5
    throw v0
.end method

.method public final f()Lc7/c;
    .locals 6

    const-string v0, "cannot use Android Keystore, it\'ll be disabled"

    const-string v1, "b"

    sget-object v2, Lc7/b;->b:Ljava/lang/Object;

    new-instance v2, Lc7/d;

    invoke-direct {v2}, Lc7/d;-><init>()V

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lc7/a;->d:Ljava/lang/String;

    invoke-static {v4}, Lc7/d;->a(Ljava/lang/String;)Z

    move-result v4
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    iget-object v5, p0, Lc7/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v5}, Lc7/d;->c(Ljava/lang/String;)Lc7/c;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    :goto_0
    if-eqz v4, :cond_0

    sget-object v4, Lc7/b;->b:Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v3

    :cond_0
    new-instance v0, Ljava/security/KeyStoreException;

    iget-object v1, p0, Lc7/a;->d:Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "the master key %s exists but is unusable"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception v2

    goto :goto_1

    :catch_3
    move-exception v2

    :goto_1
    sget-object v4, Lc7/b;->b:Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v3
.end method
