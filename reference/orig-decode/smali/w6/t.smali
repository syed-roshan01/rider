.class public final synthetic Lw6/t;
.super Ljava/lang/Object;

# interfaces
.implements Ld7/c;
.implements Ld7/o;
.implements Lcom/google/firebase/platforminfo/LibraryVersionComponent$VersionExtractor;
.implements Lcom/google/firebase/database/collection/ImmutableSortedMap$Builder$KeyTranslator;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/firebase/firestore/util/Listener;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lw6/t;->a:I

    return-void
.end method


# virtual methods
.method public final a(Ld7/u;)Lv6/b;
    .locals 11

    sget-object v0, Lv6/r;->a:Lv6/r;

    const/4 v1, 0x0

    iget v2, p0, Lw6/t;->a:I

    const-string v3, "Unable to parse OutputPrefixType: "

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const-string v8, "Only version 0 keys are accepted"

    sparse-switch v2, :sswitch_data_0

    check-cast p1, Ld7/s;

    sget-object v2, Le7/n;->a:Ld7/m;

    const-string v2, "type.googleapis.com/google.crypto.tink.HmacKey"

    iget-object v3, p1, Ld7/s;->a:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_0
    iget-object v2, p1, Ld7/s;->c:Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v3

    invoke-static {v2, v3}, Li7/t0;->F(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/t0;

    move-result-object v2

    invoke-virtual {v2}, Li7/t0;->D()I

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Li3/a0;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Li3/a0;-><init>(I)V

    invoke-virtual {v2}, Li7/t0;->B()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Li3/a0;->a:Ljava/lang/Object;

    invoke-virtual {v2}, Li7/t0;->C()Li7/x0;

    move-result-object v4

    invoke-virtual {v4}, Li7/x0;->B()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Li3/a0;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Li7/t0;->C()Li7/x0;

    move-result-object v4

    invoke-virtual {v4}, Li7/x0;->A()Li7/r0;

    move-result-object v4

    invoke-static {v4}, Le7/n;->a(Li7/r0;)Le7/k;

    move-result-object v4

    iput-object v4, v3, Li3/a0;->c:Ljava/lang/Object;

    iget-object v4, p1, Ld7/s;->e:Li7/t1;

    invoke-static {v4}, Le7/n;->b(Li7/t1;)Le7/l;

    move-result-object v4

    iput-object v4, v3, Li3/a0;->d:Ljava/lang/Object;

    invoke-virtual {v3}, Li3/a0;->b()Le7/m;

    move-result-object v3

    new-instance v4, Ll/z2;

    invoke-direct {v4, v1}, Ll/z2;-><init>(Ll/w2;)V

    iput-object v3, v4, Ll/z2;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Li7/t0;->B()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->o()[B

    move-result-object v1

    invoke-static {v1, v0}, Lk6/w4;->c([BLv6/r;)Lk6/w4;

    move-result-object v0

    iput-object v0, v4, Ll/z2;->c:Ljava/lang/Object;

    iget-object p1, p1, Ld7/s;->f:Ljava/lang/Integer;

    iput-object p1, v4, Ll/z2;->d:Ljava/lang/Object;

    invoke-virtual {v4}, Ll/z2;->i()Le7/i;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v8}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing HmacKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to HmacProtoSerialization.parseKey"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_0
    check-cast p1, Ld7/s;

    sget-object v2, Le7/e;->a:Ld7/m;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    iget-object v3, p1, Ld7/s;->a:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :try_start_1
    iget-object v2, p1, Ld7/s;->c:Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v3

    invoke-static {v2, v3}, Li7/b;->E(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/b;

    move-result-object v2

    invoke-virtual {v2}, Li7/b;->C()I

    move-result v3

    if-nez v3, :cond_2

    new-instance v3, Ll/z2;

    invoke-direct {v3, v1}, Ll/z2;-><init>(Ll/y2;)V

    invoke-virtual {v2}, Li7/b;->A()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ll/z2;->M(I)V

    invoke-virtual {v2}, Li7/b;->B()Li7/f;

    move-result-object v4

    invoke-virtual {v4}, Li7/f;->z()I

    move-result v4

    invoke-virtual {v3, v4}, Ll/z2;->O(I)V

    iget-object v4, p1, Ld7/s;->e:Li7/t1;

    invoke-static {v4}, Le7/e;->a(Li7/t1;)Le7/c;

    move-result-object v4

    iput-object v4, v3, Ll/z2;->d:Ljava/lang/Object;

    invoke-virtual {v3}, Ll/z2;->h()Le7/d;

    move-result-object v3

    new-instance v4, Ll/z2;

    invoke-direct {v4, v1}, Ll/z2;-><init>(Ll/x2;)V

    iput-object v3, v4, Ll/z2;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Li7/b;->A()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->o()[B

    move-result-object v1

    invoke-static {v1, v0}, Lk6/w4;->c([BLv6/r;)Lk6/w4;

    move-result-object v0

    iput-object v0, v4, Ll/z2;->c:Ljava/lang/Object;

    iget-object p1, p1, Ld7/s;->f:Ljava/lang/Integer;

    iput-object p1, v4, Ll/z2;->d:Ljava/lang/Object;

    invoke-virtual {v4}, Ll/z2;->d()Le7/a;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v8}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesCmacKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesCmacParameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_1
    check-cast p1, Ld7/s;

    sget-object v1, Lw6/d0;->a:Ld7/m;

    const-string v1, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    iget-object v2, p1, Ld7/s;->a:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :try_start_2
    iget-object v1, p1, Ld7/s;->c:Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v2

    invoke-static {v1, v2}, Li7/w1;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/w1;

    move-result-object v1

    invoke-virtual {v1}, Li7/w1;->A()I

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Ld7/s;->e:Li7/t1;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-eq v8, v7, :cond_7

    if-eq v8, v6, :cond_6

    if-eq v8, v5, :cond_5

    if-ne v8, v4, :cond_4

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Li7/t1;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    sget-object v2, Lw6/b0;->d:Lw6/b0;

    goto :goto_1

    :cond_6
    :goto_0
    sget-object v2, Lw6/b0;->c:Lw6/b0;

    goto :goto_1

    :cond_7
    sget-object v2, Lw6/b0;->b:Lw6/b0;

    :goto_1
    invoke-virtual {v1}, Li7/w1;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->o()[B

    move-result-object v1

    invoke-static {v1, v0}, Lk6/w4;->c([BLv6/r;)Lk6/w4;

    move-result-object v0

    iget-object p1, p1, Ld7/s;->f:Ljava/lang/Integer;

    invoke-static {v2, v0, p1}, Lw6/a0;->b(Lw6/b0;Lk6/w4;Ljava/lang/Integer;)Lw6/a0;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v8}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing XChaCha20Poly1305Key failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_2
    check-cast p1, Ld7/s;

    sget-object v1, Lw6/y;->a:Ld7/m;

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    iget-object v2, p1, Ld7/s;->a:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :try_start_3
    iget-object v1, p1, Ld7/s;->c:Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v2

    invoke-static {v1, v2}, Li7/j0;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/j0;

    move-result-object v1

    invoke-virtual {v1}, Li7/j0;->A()I

    move-result v2

    if-nez v2, :cond_e

    iget-object v2, p1, Ld7/s;->e:Li7/t1;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-eq v8, v7, :cond_d

    if-eq v8, v6, :cond_c

    if-eq v8, v5, :cond_b

    if-ne v8, v4, :cond_a

    goto :goto_2

    :cond_a
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Li7/t1;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    sget-object v2, Lw6/w;->d:Lw6/w;

    goto :goto_3

    :cond_c
    :goto_2
    sget-object v2, Lw6/w;->c:Lw6/w;

    goto :goto_3

    :cond_d
    sget-object v2, Lw6/w;->b:Lw6/w;

    :goto_3
    invoke-virtual {v1}, Li7/j0;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->o()[B

    move-result-object v1

    invoke-static {v1, v0}, Lk6/w4;->c([BLv6/r;)Lk6/w4;

    move-result-object v0

    iget-object p1, p1, Ld7/s;->f:Ljava/lang/Integer;

    invoke-static {v2, v0, p1}, Lw6/v;->b(Lw6/w;Lk6/w4;Ljava/lang/Integer;)Lw6/v;

    move-result-object p1

    return-object p1

    :cond_e
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v8}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing ChaCha20Poly1305Key failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_3
    check-cast p1, Ld7/s;

    const-string v2, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    iget-object v9, p1, Ld7/s;->a:Ljava/lang/String;

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    :try_start_4
    iget-object v2, p1, Ld7/s;->c:Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v9

    invoke-static {v2, v9}, Li7/b0;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/b0;

    move-result-object v2

    invoke-virtual {v2}, Li7/b0;->A()I

    move-result v9

    if-nez v9, :cond_16

    new-instance v8, Lv6/d;

    invoke-direct {v8}, Lv6/d;-><init>()V

    invoke-virtual {v2}, Li7/b0;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v9

    const/16 v10, 0x10

    if-eq v9, v10, :cond_11

    const/16 v10, 0x20

    if-ne v9, v10, :cond_10

    goto :goto_4

    :cond_10
    new-instance p1, Ljava/security/InvalidAlgorithmParameterException;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    :goto_4
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iput-object v9, v8, Lv6/d;->b:Ljava/lang/Object;

    iget-object v9, p1, Ld7/s;->e:Li7/t1;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    if-eq v10, v7, :cond_15

    if-eq v10, v6, :cond_14

    if-eq v10, v5, :cond_13

    if-ne v10, v4, :cond_12

    goto :goto_5

    :cond_12
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Li7/t1;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    sget-object v3, Lw6/r;->d:Lw6/r;

    goto :goto_6

    :cond_14
    :goto_5
    sget-object v3, Lw6/r;->c:Lw6/r;

    goto :goto_6

    :cond_15
    sget-object v3, Lw6/r;->b:Lw6/r;

    :goto_6
    iput-object v3, v8, Lv6/d;->c:Ljava/lang/Object;

    invoke-virtual {v8}, Lv6/d;->b()Lw6/s;

    move-result-object v3

    new-instance v4, Ll/z2;

    invoke-direct {v4, v1}, Ll/z2;-><init>(Ll/v2;)V

    iput-object v3, v4, Ll/z2;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Li7/b0;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->o()[B

    move-result-object v1

    invoke-static {v1, v0}, Lk6/w4;->c([BLv6/r;)Lk6/w4;

    move-result-object v0

    iput-object v0, v4, Ll/z2;->c:Ljava/lang/Object;

    iget-object p1, p1, Ld7/s;->f:Ljava/lang/Integer;

    iput-object p1, v4, Ll/z2;->d:Ljava/lang/Object;

    invoke-virtual {v4}, Ll/z2;->n()Lw6/q;

    move-result-object p1

    return-object p1

    :cond_16
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-direct {p1, v8}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Parsing AesGcmSivKey failed"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong type URL in call to AesGcmSivParameters.parseParameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_3
        0x7 -> :sswitch_2
        0xb -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public final extract(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lw6/t;->a:I

    check-cast p1, Landroid/content/Context;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/google/firebase/firestore/core/FirestoreClient;->n(Ljava/lang/String;)V

    return-void
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lw6/t;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/google/firebase/firestore/core/FirestoreClient;->a(Lcom/google/android/gms/tasks/Task;)Lcom/google/firebase/firestore/model/Document;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lcom/google/firebase/firestore/auth/FirebaseAppCheckTokenProvider;->a(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public final translate(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/database/collection/ImmutableSortedMap$Builder;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
