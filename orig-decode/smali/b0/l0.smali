.class public final synthetic Lb0/l0;
.super Ljava/lang/Object;

# interfaces
.implements Lh0/s;
.implements Lf1/i;
.implements Lr5/k;
.implements Ld7/c;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lb0/l0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ld7/u;)Lv6/b;
    .locals 17

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "Key size is not set"

    const-string v4, "IV size is not set"

    const-string v5, "Tag size is not set"

    move-object/from16 v7, p0

    iget v8, v7, Lb0/l0;->a:I

    const-string v9, "Only version 0 keys are accepted"

    const-string v10, "Unable to parse OutputPrefixType: "

    const/4 v14, 0x1

    const/16 v15, 0xc

    const-string v2, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    const/16 v6, 0x20

    const/16 v11, 0x18

    packed-switch v8, :pswitch_data_0

    move-object/from16 v8, p1

    check-cast v8, Ld7/s;

    sget-object v16, Lw6/p;->a:Ld7/m;

    const-string v12, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    iget-object v13, v8, Ld7/s;->a:Ljava/lang/String;

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    :try_start_0
    iget-object v12, v8, Ld7/s;->c:Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v13

    invoke-static {v12, v13}, Li7/x;->C(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/x;

    move-result-object v12

    invoke-virtual {v12}, Li7/x;->A()I

    move-result v13
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v13, :cond_9

    sget-object v9, Lw6/n;->d:Lw6/n;

    :try_start_1
    invoke-virtual {v12}, Li7/x;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v13

    if-eq v13, v0, :cond_1

    if-eq v13, v11, :cond_1

    if-ne v13, v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v6, v8, Ld7/s;->e:Li7/t1;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    if-eq v11, v14, :cond_4

    const/4 v13, 0x2

    if-eq v11, v13, :cond_3

    const/4 v13, 0x3

    if-eq v11, v13, :cond_5

    const/4 v13, 0x4

    if-ne v11, v13, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Li7/t1;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    sget-object v9, Lw6/n;->c:Lw6/n;

    goto :goto_2

    :cond_4
    sget-object v9, Lw6/n;->b:Lw6/n;

    :cond_5
    :goto_2
    if-eqz v0, :cond_8

    if-eqz v2, :cond_7

    if-eqz v1, :cond_6

    new-instance v3, Lw6/o;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v3, v0, v2, v1, v9}, Lw6/o;-><init>(IIILw6/n;)V

    new-instance v0, Ll/z2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/z2;-><init>(Ll/q;)V

    iput-object v3, v0, Ll/z2;->b:Ljava/lang/Object;

    invoke-virtual {v12}, Li7/x;->z()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->o()[B

    move-result-object v1

    new-instance v2, Lk6/w4;

    invoke-static {v1}, Lk7/a;->a([B)Lk7/a;

    move-result-object v1

    const/16 v3, 0xb

    invoke-direct {v2, v1, v3}, Lk6/w4;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v0, Ll/z2;->c:Ljava/lang/Object;

    iget-object v1, v8, Ld7/s;->f:Ljava/lang/Integer;

    iput-object v1, v0, Ll/z2;->d:Ljava/lang/Object;

    invoke-virtual {v0}, Ll/z2;->m()Lw6/m;

    move-result-object v0

    return-object v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v5}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v9}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesGcmKey failed"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Wrong type URL in call to AesGcmParameters.parseParameters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    move-object/from16 v8, p1

    check-cast v8, Ld7/s;

    sget-object v12, Lw6/l;->a:Ld7/m;

    const-string v12, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    iget-object v13, v8, Ld7/s;->a:Ljava/lang/String;

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_17

    :try_start_2
    iget-object v12, v8, Ld7/s;->c:Lcom/google/crypto/tink/shaded/protobuf/l;

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/t;->a()Lcom/google/crypto/tink/shaded/protobuf/t;

    move-result-object v13

    invoke-static {v12, v13}, Li7/r;->E(Lcom/google/crypto/tink/shaded/protobuf/l;Lcom/google/crypto/tink/shaded/protobuf/t;)Li7/r;

    move-result-object v12

    invoke-virtual {v12}, Li7/r;->C()I

    move-result v13
    :try_end_2
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_2 .. :try_end_2} :catch_1

    if-nez v13, :cond_16

    sget-object v9, Lw6/j;->d:Lw6/j;

    :try_start_3
    invoke-virtual {v12}, Li7/r;->A()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v13

    invoke-virtual {v13}, Lcom/google/crypto/tink/shaded/protobuf/l;->size()I

    move-result v13

    if-eq v13, v0, :cond_c

    if-eq v13, v11, :cond_c

    if-ne v13, v6, :cond_b

    goto :goto_3

    :cond_b
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_3
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v12}, Li7/r;->B()Li7/v;

    move-result-object v6

    invoke-virtual {v6}, Li7/v;->z()I

    move-result v6

    if-eq v6, v15, :cond_e

    if-ne v6, v0, :cond_d

    goto :goto_4

    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_4
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v6, v8, Ld7/s;->e:Li7/t1;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    if-eq v11, v14, :cond_11

    const/4 v13, 0x2

    if-eq v11, v13, :cond_10

    const/4 v13, 0x3

    if-eq v11, v13, :cond_12

    const/4 v13, 0x4

    if-ne v11, v13, :cond_f

    goto :goto_5

    :cond_f
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Li7/t1;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    :goto_5
    sget-object v9, Lw6/j;->c:Lw6/j;

    goto :goto_6

    :cond_11
    sget-object v9, Lw6/j;->b:Lw6/j;

    :cond_12
    :goto_6
    if-eqz v2, :cond_15

    if-eqz v0, :cond_14

    if-eqz v1, :cond_13

    new-instance v3, Lw6/k;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {v3, v2, v0, v1, v9}, Lw6/k;-><init>(IIILw6/j;)V

    new-instance v0, Ll/z2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/z2;-><init>(Ljava/lang/Object;)V

    iput-object v3, v0, Ll/z2;->b:Ljava/lang/Object;

    invoke-virtual {v12}, Li7/r;->A()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/l;->o()[B

    move-result-object v1

    new-instance v2, Lk6/w4;

    invoke-static {v1}, Lk7/a;->a([B)Lk7/a;

    move-result-object v1

    const/16 v3, 0xb

    invoke-direct {v2, v1, v3}, Lk6/w4;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v0, Ll/z2;->c:Ljava/lang/Object;

    iget-object v1, v8, Ld7/s;->f:Ljava/lang/Integer;

    iput-object v1, v0, Ll/z2;->d:Ljava/lang/Object;

    invoke-virtual {v0}, Ll/z2;->l()Lw6/i;

    move-result-object v0

    return-object v0

    :cond_13
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v5}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v3}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v9}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Lcom/google/crypto/tink/shaded/protobuf/h0; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Parsing AesEaxcKey failed"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Wrong type URL in call to AesEaxParameters.parseParameters"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x19
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lb0/l0;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/database/Cursor;

    sget-object v0, Lr5/m;->f:Li5/c;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move v1, v3

    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    array-length v2, v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    new-array p1, v1, [B

    move v1, v3

    move v2, v1

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    array-length v5, v4

    invoke-static {v4, v3, p1, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v4, v4

    add-int/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return-object p1

    :pswitch_0
    check-cast p1, Landroid/database/Cursor;

    sget-object v0, Lr5/m;->f:Li5/c;

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_2
    return-object v1

    :pswitch_1
    check-cast p1, Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Landroid/database/Cursor;

    sget-object v0, Lr5/m;->f:Li5/c;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result p1

    if-lez p1, :cond_3

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Landroid/database/Cursor;

    sget-object v0, Lr5/m;->f:Li5/c;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {}, Ll5/j;->a()Ll/z2;

    move-result-object v4

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/z2;->L(Ljava/lang/String;)V

    const/4 v5, 0x2

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-static {v5}, Lu5/a;->b(I)Li5/d;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/z2;->N(Li5/d;)V

    const/4 v5, 0x3

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    move-object v5, v1

    goto :goto_5

    :cond_4
    invoke-static {v5, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v5

    :goto_5
    iput-object v5, v4, Ll/z2;->c:Ljava/lang/Object;

    invoke-virtual {v4}, Ll/z2;->j()Ll5/j;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    return-object v0

    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    sget-object v0, Lr5/m;->f:Li5/c;

    new-instance v0, Ls5/a;

    const-string v1, "Timed out while trying to acquire the lock."

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_5
    check-cast p1, Landroid/database/Cursor;

    sget-object v0, Lr5/m;->f:Li5/c;

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_6

    :cond_6
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :goto_6
    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    sget-object v0, Lr5/m;->f:Li5/c;

    new-instance v0, Ls5/a;

    const-string v1, "Timed out while trying to open db."

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_7
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    sget-object v0, Lr5/m;->f:Li5/c;

    new-array v0, v3, [Ljava/lang/String;

    const-string v1, "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"

    invoke-virtual {p1, v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    new-instance v0, Lb0/l0;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lb0/l0;-><init>(I)V

    invoke-static {p1, v0}, Lr5/m;->q(Landroid/database/Cursor;Lr5/k;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(D)D
    .locals 10

    const-wide v0, 0x3fb3d0722149b580L    # 0.07739938080495357

    const-wide v2, 0x3faab1232f514a03L    # 0.05213270142180095

    const-wide v4, 0x3fee54edcd0aeb60L    # 0.9478672985781991

    iget v6, p0, Lb0/l0;->a:I

    const-wide/16 v7, 0x0

    packed-switch v6, :pswitch_data_0

    return-wide p1

    :pswitch_0
    sget-object v6, Lf1/e;->a:[F

    cmpg-double v6, p1, v7

    if-gez v6, :cond_0

    neg-double v6, p1

    goto :goto_0

    :cond_0
    move-wide v6, p1

    :goto_0
    const-wide v8, 0x3fa4b5dcc63f1412L    # 0.04045

    cmpl-double v8, v6, v8

    if-ltz v8, :cond_1

    mul-double/2addr v4, v6

    add-double/2addr v4, v2

    const-wide v0, 0x4003333333333333L    # 2.4

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    goto :goto_1

    :cond_1
    mul-double/2addr v0, v6

    :goto_1
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->copySign(DD)D

    move-result-wide p1

    return-wide p1

    :pswitch_1
    sget-object v6, Lf1/e;->a:[F

    cmpg-double v6, p1, v7

    if-gez v6, :cond_2

    neg-double v6, p1

    goto :goto_2

    :cond_2
    move-wide v6, p1

    :goto_2
    const-wide v8, 0x3f69a5c61c57a063L    # 0.0031308049535603718

    cmpl-double v8, v6, v8

    if-ltz v8, :cond_3

    const-wide v0, 0x3fdaaaaaaaaaaaabL    # 0.4166666666666667

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    sub-double/2addr v0, v2

    div-double/2addr v0, v4

    goto :goto_3

    :cond_3
    div-double v0, v6, v0

    :goto_3
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->copySign(DD)D

    move-result-wide p1

    return-wide p1

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lh0/q0;)Lh0/p;
    .locals 13

    iget-object v0, p1, Lh0/q0;->c:Lh0/n;

    iget v1, p0, Lb0/l0;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    iget-object v1, p1, Lh0/q0;->b:Lh0/p;

    if-nez v1, :cond_0

    sget-object v0, Lh0/r;->b:Lb0/l0;

    invoke-virtual {v0, p1}, Lb0/l0;->c(Lh0/q0;)Lh0/p;

    move-result-object p1

    goto/16 :goto_a

    :cond_0
    iget-boolean v4, p1, Lh0/q0;->a:Z

    iget-object v5, v1, Lh0/p;->b:Lh0/o;

    iget-object v6, v1, Lh0/p;->a:Lh0/o;

    if-eqz v4, :cond_1

    invoke-static {p1, v0, v6}, Lo7/d0;->f(Lh0/q0;Lh0/n;Lh0/o;)Lh0/o;

    move-result-object p1

    move-object v7, p1

    move-object v12, v6

    move-object v6, v5

    move-object v5, v12

    goto :goto_0

    :cond_1
    invoke-static {p1, v0, v5}, Lo7/d0;->f(Lh0/q0;Lh0/n;Lh0/o;)Lh0/o;

    move-result-object p1

    move-object v7, v6

    move-object v6, p1

    :goto_0
    invoke-static {p1, v5}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto/16 :goto_9

    :cond_2
    invoke-virtual {v0}, Lh0/n;->b()I

    move-result p1

    if-eq p1, v2, :cond_4

    invoke-virtual {v0}, Lh0/n;->b()I

    move-result p1

    const/4 v5, 0x3

    if-ne p1, v5, :cond_3

    iget p1, v7, Lh0/o;->b:I

    iget v5, v6, Lh0/o;->b:I

    if-le p1, v5, :cond_3

    goto :goto_1

    :cond_3
    move p1, v3

    goto :goto_2

    :cond_4
    :goto_1
    move p1, v2

    :goto_2
    new-instance v5, Lh0/p;

    invoke-direct {v5, v7, v6, p1}, Lh0/p;-><init>(Lh0/o;Lh0/o;Z)V

    iget-wide v8, v7, Lh0/o;->c:J

    iget-wide v10, v6, Lh0/o;->c:J

    cmp-long v8, v8, v10

    if-nez v8, :cond_5

    iget p1, v7, Lh0/o;->b:I

    iget v8, v6, Lh0/o;->b:I

    if-ne p1, v8, :cond_9

    goto :goto_6

    :cond_5
    if-eqz p1, :cond_6

    move-object v8, v7

    goto :goto_3

    :cond_6
    move-object v8, v6

    :goto_3
    iget v8, v8, Lh0/o;->b:I

    if-eqz v8, :cond_7

    goto :goto_5

    :cond_7
    if-eqz p1, :cond_8

    move-object p1, v6

    goto :goto_4

    :cond_8
    move-object p1, v7

    :goto_4
    iget-object v8, v0, Lh0/n;->d:La2/a0;

    iget-object v8, v8, La2/a0;->a:La2/z;

    iget-object v8, v8, La2/z;->a:La2/e;

    iget-object v8, v8, La2/e;->a:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    iget p1, p1, Lh0/o;->b:I

    if-eq v8, p1, :cond_a

    :cond_9
    :goto_5
    move-object v1, v5

    goto/16 :goto_9

    :cond_a
    :goto_6
    iget-object p1, v0, Lh0/n;->d:La2/a0;

    iget-object p1, p1, La2/a0;->a:La2/z;

    iget-object p1, p1, La2/z;->a:La2/e;

    iget-object p1, p1, La2/e;->a:Ljava/lang/String;

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_b

    goto :goto_5

    :cond_b
    iget-object p1, v0, Lh0/n;->d:La2/a0;

    iget-object p1, p1, La2/a0;->a:La2/z;

    iget-object p1, p1, La2/z;->a:La2/e;

    iget-object p1, p1, La2/e;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x2

    const/4 v10, 0x0

    iget v11, v0, Lh0/n;->a:I

    if-nez v11, :cond_d

    invoke-static {v3, p1}, Ld7/t;->T(ILjava/lang/String;)I

    move-result p1

    if-eqz v4, :cond_c

    invoke-static {v7, v0, p1}, Lo7/d0;->l(Lh0/o;Lh0/n;I)Lh0/o;

    move-result-object p1

    invoke-static {v5, p1, v10, v2, v9}, Lh0/p;->a(Lh0/p;Lh0/o;Lh0/o;ZI)Lh0/p;

    move-result-object p1

    goto :goto_8

    :cond_c
    invoke-static {v6, v0, p1}, Lo7/d0;->l(Lh0/o;Lh0/n;I)Lh0/o;

    move-result-object p1

    invoke-static {v5, v10, p1, v3, v2}, Lh0/p;->a(Lh0/p;Lh0/o;Lh0/o;ZI)Lh0/p;

    move-result-object p1

    goto :goto_8

    :cond_d
    if-ne v11, v8, :cond_f

    invoke-static {v8, p1}, Ld7/t;->U(ILjava/lang/String;)I

    move-result p1

    if-eqz v4, :cond_e

    invoke-static {v7, v0, p1}, Lo7/d0;->l(Lh0/o;Lh0/n;I)Lh0/o;

    move-result-object p1

    invoke-static {v5, p1, v10, v3, v9}, Lh0/p;->a(Lh0/p;Lh0/o;Lh0/o;ZI)Lh0/p;

    move-result-object p1

    goto :goto_8

    :cond_e
    invoke-static {v6, v0, p1}, Lo7/d0;->l(Lh0/o;Lh0/n;I)Lh0/o;

    move-result-object p1

    invoke-static {v5, v10, p1, v2, v2}, Lh0/p;->a(Lh0/p;Lh0/o;Lh0/o;ZI)Lh0/p;

    move-result-object p1

    goto :goto_8

    :cond_f
    iget-boolean v1, v1, Lh0/p;->c:Z

    if-ne v1, v2, :cond_10

    move v3, v2

    :cond_10
    xor-int v1, v4, v3

    if-eqz v1, :cond_11

    invoke-static {v11, p1}, Ld7/t;->U(ILjava/lang/String;)I

    move-result p1

    goto :goto_7

    :cond_11
    invoke-static {v11, p1}, Ld7/t;->T(ILjava/lang/String;)I

    move-result p1

    :goto_7
    if-eqz v4, :cond_12

    invoke-static {v7, v0, p1}, Lo7/d0;->l(Lh0/o;Lh0/n;I)Lh0/o;

    move-result-object p1

    invoke-static {v5, p1, v10, v3, v9}, Lh0/p;->a(Lh0/p;Lh0/o;Lh0/o;ZI)Lh0/p;

    move-result-object p1

    goto :goto_8

    :cond_12
    invoke-static {v6, v0, p1}, Lo7/d0;->l(Lh0/o;Lh0/n;I)Lh0/o;

    move-result-object p1

    invoke-static {v5, v10, p1, v3, v2}, Lh0/p;->a(Lh0/p;Lh0/o;Lh0/o;ZI)Lh0/p;

    move-result-object p1

    :goto_8
    move-object v1, p1

    :goto_9
    move-object p1, v1

    :goto_a
    return-object p1

    :pswitch_1
    sget-object v0, Lh0/q;->b:Lh0/q;

    invoke-static {p1, v0}, Lo7/d0;->d(Lh0/q0;Lh0/q;)Lh0/p;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object v0, Lh0/q;->c:Lh0/q;

    invoke-static {p1, v0}, Lo7/d0;->d(Lh0/q0;Lh0/q;)Lh0/p;

    move-result-object p1

    return-object p1

    :pswitch_3
    new-instance p1, Lh0/p;

    iget v1, v0, Lh0/n;->a:I

    invoke-virtual {v0, v1}, Lh0/n;->a(I)Lh0/o;

    move-result-object v1

    iget v4, v0, Lh0/n;->b:I

    invoke-virtual {v0, v4}, Lh0/n;->a(I)Lh0/o;

    move-result-object v4

    invoke-virtual {v0}, Lh0/n;->b()I

    move-result v0

    if-ne v0, v2, :cond_13

    goto :goto_b

    :cond_13
    move v2, v3

    :goto_b
    invoke-direct {p1, v1, v4, v2}, Lh0/p;-><init>(Lh0/o;Lh0/o;Z)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Le8/k;

    invoke-virtual {p1}, Le8/k;->halfClose()V

    return-void
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    .line 1
    iget v0, p0, Lb0/l0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHandler$FetchResponse;

    invoke-static {p1}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;->c(Lcom/google/firebase/remoteconfig/internal/ConfigFetchHandler$FetchResponse;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/google/firebase/remoteconfig/internal/ConfigFetchHandler$FetchResponse;

    invoke-static {p1}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;->a(Lcom/google/firebase/remoteconfig/internal/ConfigFetchHandler$FetchResponse;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/google/firebase/remoteconfig/internal/ConfigContainer;

    invoke-static {p1}, Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;->e(Lcom/google/firebase/remoteconfig/internal/ConfigContainer;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget v0, p0, Lb0/l0;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {p1}, Lcom/google/firebase/messaging/FcmBroadcastProcessor;->c(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lcom/google/firebase/messaging/FcmBroadcastProcessor;->d(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1}, Lcom/google/firebase/firestore/util/Util;->e(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Void;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Lcom/google/firebase/firestore/core/Transaction;->a(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
