.class public final Li3/a0;
.super Ljava/lang/Object;

# interfaces
.implements Ldagger/hilt/android/internal/builders/FragmentComponentBuilder;
.implements Ldagger/hilt/android/internal/builders/ViewComponentBuilder;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Lq/f;

    .line 4
    invoke-direct {p1}, Lq/z;-><init>()V

    iput-object p1, p0, Li3/a0;->a:Ljava/lang/Object;

    .line 5
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Li3/a0;->b:Ljava/lang/Object;

    .line 6
    new-instance p1, Lq/l;

    invoke-direct {p1}, Lq/l;-><init>()V

    iput-object p1, p0, Li3/a0;->c:Ljava/lang/Object;

    .line 7
    new-instance p1, Lq/f;

    .line 8
    invoke-direct {p1}, Lq/z;-><init>()V

    iput-object p1, p0, Li3/a0;->d:Ljava/lang/Object;

    return-void

    .line 9
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    iput-object v1, p0, Li3/a0;->b:Ljava/lang/Object;

    iput-object v1, p0, Li3/a0;->c:Ljava/lang/Object;

    sget-object p1, Le7/l;->e:Le7/l;

    iput-object p1, p0, Li3/a0;->d:Ljava/lang/Object;

    return-void

    .line 10
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li3/a0;->a:Ljava/lang/Object;

    .line 12
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li3/a0;->b:Ljava/lang/Object;

    .line 13
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li3/a0;->c:Ljava/lang/Object;

    .line 14
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Li3/a0;->d:Ljava/lang/Object;

    return-void

    .line 15
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    iput-object v1, p0, Li3/a0;->b:Ljava/lang/Object;

    iput-object v1, p0, Li3/a0;->c:Ljava/lang/Object;

    sget-object p1, Lw6/n;->d:Lw6/n;

    iput-object p1, p0, Li3/a0;->d:Ljava/lang/Object;

    return-void

    .line 16
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    iput-object v1, p0, Li3/a0;->b:Ljava/lang/Object;

    iput-object v1, p0, Li3/a0;->c:Ljava/lang/Object;

    sget-object p1, Lw6/j;->d:Lw6/j;

    iput-object p1, p0, Li3/a0;->d:Ljava/lang/Object;

    return-void

    .line 17
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    .line 18
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Li3/a0;->b:Ljava/lang/Object;

    iput-object v1, p0, Li3/a0;->c:Ljava/lang/Object;

    const-string p1, ""

    iput-object p1, p0, Li3/a0;->d:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Lj3/b;)V
    .locals 5

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/a0;->d:Ljava/lang/Object;

    iput-object p2, p0, Li3/a0;->a:Ljava/lang/Object;

    .line 33
    new-instance p1, Li3/z;

    const/16 p2, 0x400

    invoke-direct {p1, p2}, Li3/z;-><init>(I)V

    iput-object p1, p0, Li3/a0;->c:Ljava/lang/Object;

    iget-object p1, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast p1, Lj3/b;

    const/4 p2, 0x6

    .line 34
    invoke-virtual {p1, p2}, Lj3/c;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 35
    iget v2, p1, Lj3/c;->a:I

    add-int/2addr v0, v2

    .line 36
    iget-object v2, p1, Lj3/c;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 37
    iget-object p1, p1, Lj3/c;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    mul-int/lit8 p1, p1, 0x2

    .line 38
    new-array p1, p1, [C

    iput-object p1, p0, Li3/a0;->b:Ljava/lang/Object;

    iget-object p1, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast p1, Lj3/b;

    .line 39
    invoke-virtual {p1, p2}, Lj3/c;->a(I)I

    move-result p2

    if-eqz p2, :cond_1

    .line 40
    iget v0, p1, Lj3/c;->a:I

    add-int/2addr p2, v0

    .line 41
    iget-object v0, p1, Lj3/c;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p2

    .line 42
    iget-object p1, p1, Lj3/c;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_5

    .line 43
    new-instance v0, Li3/d0;

    invoke-direct {v0, p0, p2}, Li3/d0;-><init>(Li3/a0;I)V

    .line 44
    invoke-virtual {v0}, Li3/d0;->c()Lj3/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 45
    invoke-virtual {v2, v3}, Lj3/c;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Lj3/c;->b:Ljava/nio/ByteBuffer;

    iget v2, v2, Lj3/c;->a:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    :goto_3
    iget-object v3, p0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v3, [C

    mul-int/lit8 v4, p2, 0x2

    .line 46
    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 47
    invoke-virtual {v0}, Li3/d0;->b()I

    move-result v2

    const/4 v3, 0x1

    if-lez v2, :cond_3

    move v2, v3

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    if-eqz v2, :cond_4

    iget-object v2, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v2, Li3/z;

    .line 48
    invoke-virtual {v0}, Li3/d0;->b()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-virtual {v2, v0, v1, v4}, Li3/z;->a(Li3/d0;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 49
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid metadata codepoint length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void
.end method

.method public constructor <init>(Ld7/x;)V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    iget-object v1, p1, Ld7/x;->a:Ljava/util/HashMap;

    .line 22
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Li3/a0;->a:Ljava/lang/Object;

    .line 23
    new-instance v0, Ljava/util/HashMap;

    .line 24
    iget-object v1, p1, Ld7/x;->b:Ljava/util/HashMap;

    .line 25
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Li3/a0;->b:Ljava/lang/Object;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    .line 27
    iget-object v1, p1, Ld7/x;->c:Ljava/util/HashMap;

    .line 28
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Li3/a0;->c:Ljava/lang/Object;

    .line 29
    new-instance v0, Ljava/util/HashMap;

    .line 30
    iget-object p1, p1, Ld7/x;->d:Ljava/util/HashMap;

    .line 31
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Li3/a0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk6/l4;Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/a0;->d:Ljava/lang/Object;

    .line 51
    invoke-static {p2}, Lf6/a;->u(Ljava/lang/String;)V

    iput-object p2, p0, Li3/a0;->a:Ljava/lang/Object;

    .line 52
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p0, Li3/a0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ly4/n;Ly4/j;Ly4/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/a0;->a:Ljava/lang/Object;

    iput-object p2, p0, Li3/a0;->b:Ljava/lang/Object;

    iput-object p3, p0, Li3/a0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Le7/f;Ljava/lang/Object;Li7/h1;Z)V
    .locals 13

    move-object v0, p0

    iget-object v1, v0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ConcurrentMap;

    if-eqz v1, :cond_c

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "at least one of the `fullPrimitive` or `primitive` must be set"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-virtual/range {p3 .. p3}, Li7/h1;->E()Li7/b1;

    move-result-object v1

    sget-object v2, Li7/b1;->c:Li7/b1;

    if-ne v1, v2, :cond_b

    iget-object v1, v0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual/range {p3 .. p3}, Li7/h1;->C()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Li7/h1;->D()Li7/t1;

    move-result-object v3

    sget-object v4, Li7/t1;->e:Li7/t1;

    const/4 v11, 0x0

    if-ne v3, v4, :cond_2

    move-object v2, v11

    :cond_2
    sget-object v3, Ld7/k;->b:Ld7/k;

    invoke-virtual/range {p3 .. p3}, Li7/h1;->B()Li7/a1;

    move-result-object v4

    invoke-virtual {v4}, Li7/a1;->C()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p3 .. p3}, Li7/h1;->B()Li7/a1;

    move-result-object v5

    invoke-virtual {v5}, Li7/a1;->D()Lcom/google/crypto/tink/shaded/protobuf/l;

    move-result-object v5

    invoke-virtual/range {p3 .. p3}, Li7/h1;->B()Li7/a1;

    move-result-object v6

    invoke-virtual {v6}, Li7/a1;->B()Li7/z0;

    move-result-object v6

    invoke-virtual/range {p3 .. p3}, Li7/h1;->D()Li7/t1;

    move-result-object v7

    invoke-static {v4, v5, v6, v7, v2}, Ld7/s;->a(Ljava/lang/String;Lcom/google/crypto/tink/shaded/protobuf/l;Li7/z0;Li7/t1;Ljava/lang/Integer;)Ld7/s;

    move-result-object v2

    invoke-virtual {v3, v2}, Ld7/k;->a(Ld7/s;)Lv6/b;

    move-result-object v10

    new-instance v12, Lv6/n;

    invoke-virtual/range {p3 .. p3}, Li7/h1;->D()Li7/t1;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x5

    const/4 v4, 0x1

    if-eq v2, v4, :cond_6

    const/4 v4, 0x2

    if-eq v2, v4, :cond_5

    const/4 v4, 0x3

    if-eq v2, v4, :cond_4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "unknown output prefix type"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    sget-object v2, Lv6/b;->a:[B

    :goto_1
    move-object v5, v2

    goto :goto_3

    :cond_5
    :goto_2
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Li7/h1;->C()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    goto :goto_1

    :cond_6
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Li7/h1;->C()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    goto :goto_1

    :goto_3
    invoke-virtual/range {p3 .. p3}, Li7/h1;->E()Li7/b1;

    move-result-object v6

    invoke-virtual/range {p3 .. p3}, Li7/h1;->D()Li7/t1;

    move-result-object v7

    invoke-virtual/range {p3 .. p3}, Li7/h1;->C()I

    move-result v8

    invoke-virtual/range {p3 .. p3}, Li7/h1;->B()Li7/a1;

    move-result-object v2

    invoke-virtual {v2}, Li7/a1;->C()Ljava/lang/String;

    move-result-object v9

    move-object v2, v12

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v10}, Lv6/n;-><init>(Le7/f;Ljava/lang/Object;[BLi7/b1;Li7/t1;ILjava/lang/String;Lv6/b;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lv6/o;

    iget-object v4, v12, Lv6/n;->c:[B

    if-nez v4, :cond_7

    goto :goto_4

    :cond_7
    array-length v5, v4

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v11

    :goto_4
    invoke-direct {v3, v11}, Lv6/o;-><init>([B)V

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_8

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    if-eqz p4, :cond_a

    iget-object v1, v0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v1, Lv6/n;

    if-nez v1, :cond_9

    iput-object v12, v0, Li3/a0;->c:Ljava/lang/Object;

    goto :goto_5

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "you cannot set two primary primitives"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    :goto_5
    return-void

    :cond_b
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "only ENABLED key is allowed"

    invoke-direct {v1, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "addPrimitive cannot be called after build"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b()Le7/m;
    .locals 5

    iget-object v0, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_f

    iget-object v1, p0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_e

    iget-object v1, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v1, Le7/k;

    if-eqz v1, :cond_d

    iget-object v1, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v1, Le7/l;

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_b

    iget-object v0, p0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v1, Le7/k;

    const/16 v2, 0xa

    if-lt v0, v2, :cond_a

    sget-object v2, Le7/k;->b:Le7/k;

    if-ne v1, v2, :cond_1

    const/16 v1, 0x14

    if-gt v0, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    sget-object v2, Le7/k;->c:Le7/k;

    if-ne v1, v2, :cond_3

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    sget-object v2, Le7/k;->d:Le7/k;

    if-ne v1, v2, :cond_5

    const/16 v1, 0x20

    if-gt v0, v1, :cond_4

    goto :goto_0

    :cond_4
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    sget-object v2, Le7/k;->e:Le7/k;

    if-ne v1, v2, :cond_7

    const/16 v1, 0x30

    if-gt v0, v1, :cond_6

    goto :goto_0

    :cond_6
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    sget-object v2, Le7/k;->f:Le7/k;

    if-ne v1, v2, :cond_9

    const/16 v1, 0x40

    if-gt v0, v1, :cond_8

    :goto_0
    new-instance v0, Le7/m;

    iget-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v3, Le7/l;

    iget-object v4, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v4, Le7/k;

    invoke-direct {v0, v1, v2, v3, v4}, Le7/m;-><init>(IILe7/l;Le7/k;)V

    return-object v0

    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "unknown hash type; must be SHA256, SHA384 or SHA512"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v1, Ljava/security/GeneralSecurityException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "Invalid tag size in bytes %d; must be at least 10 bytes"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    iget-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Invalid key size in bytes %d; must be at least 16 bytes"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "tag size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final build()Ldagger/hilt/android/components/FragmentComponent;
    .locals 4

    iget-object v0, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/d0;

    const-class v1, Landroidx/fragment/app/d0;

    .line 1
    invoke-static {v1, v0}, Lz6/a;->g(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 2
    new-instance v0, Ly4/k;

    iget-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast v1, Ly4/n;

    iget-object v2, p0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v2, Ly4/j;

    iget-object v3, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v3, Ly4/h;

    invoke-direct {v0, v1, v2, v3}, Ly4/k;-><init>(Ly4/n;Ly4/j;Ly4/h;)V

    return-object v0
.end method

.method public final build()Ldagger/hilt/android/components/ViewComponent;
    .locals 2

    iget-object v0, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    const-class v1, Landroid/view/View;

    .line 3
    invoke-static {v1, v0}, Lz6/a;->g(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 4
    new-instance v0, Ly4/l;

    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public final c(Le8/c2;)V
    .locals 2

    iget-object v0, p0, Li3/a0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v1, Le8/c2;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput-object p1, p0, Li3/a0;->c:Ljava/lang/Object;

    iget-object v1, p0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    iget-object v0, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v0, Lg8/l3;

    iget-object v0, v0, Lg8/l3;->D:Lg8/y0;

    invoke-virtual {v0, p1}, Lg8/y0;->f(Le8/c2;)V

    :cond_1
    return-void

    :goto_0
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final d(Ld7/b;)V
    .locals 3

    new-instance v0, Ld7/v;

    iget-object v1, p1, Ld7/b;->b:Ljava/lang/Class;

    iget-object v2, p1, Ld7/b;->a:Lk7/a;

    invoke-direct {v0, v1, v2}, Ld7/v;-><init>(Ljava/lang/Class;Lk7/a;)V

    iget-object v1, p0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld7/b;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal parser for already existing object of type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final e(Ld7/d;)V
    .locals 3

    new-instance v0, Ld7/w;

    iget-object v1, p1, Ld7/d;->a:Ljava/lang/Class;

    iget-object v2, p1, Ld7/d;->b:Ljava/lang/Class;

    invoke-direct {v0, v1, v2}, Ld7/w;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    iget-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld7/d;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal serializer for already existing object of type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final f(Ld7/l;)V
    .locals 3

    new-instance v0, Ld7/v;

    iget-object v1, p1, Ld7/l;->b:Ljava/lang/Class;

    iget-object v2, p1, Ld7/l;->a:Lk7/a;

    invoke-direct {v0, v1, v2}, Ld7/v;-><init>(Ljava/lang/Class;Lk7/a;)V

    iget-object v1, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld7/l;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal parser for already existing object of type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final fragment(Landroidx/fragment/app/d0;)Ldagger/hilt/android/internal/builders/FragmentComponentBuilder;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Li3/a0;->d:Ljava/lang/Object;

    return-object p0
.end method

.method public final g(Ld7/m;)V
    .locals 3

    new-instance v0, Ld7/w;

    iget-object v1, p1, Ld7/m;->a:Ljava/lang/Class;

    iget-object v2, p1, Ld7/m;->b:Ljava/lang/Class;

    invoke-direct {v0, v1, v2}, Ld7/w;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    iget-object v1, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld7/m;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal serializer for already existing object of type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final h()Landroid/os/Bundle;
    .locals 14

    iget-object v0, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    if-nez v0, :cond_10

    iget-object v0, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v0, Lk6/l4;

    invoke-virtual {v0}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Li3/a0;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    :try_start_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    move v4, v0

    :goto_0
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    if-ge v4, v5, :cond_e

    :try_start_1
    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "n"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "t"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    const/16 v9, 0x64

    const/4 v10, 0x2

    const/4 v11, 0x3

    const/4 v12, 0x4

    const/4 v13, 0x1

    if-eq v8, v9, :cond_4

    const/16 v9, 0x6c

    if-eq v8, v9, :cond_3

    const/16 v9, 0x73

    if-eq v8, v9, :cond_2

    const/16 v9, 0xd18

    if-eq v8, v9, :cond_1

    const/16 v9, 0xd75

    if-eq v8, v9, :cond_0

    goto :goto_1

    :cond_0
    const-string v8, "la"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v12

    goto :goto_2

    :cond_1
    const-string v8, "ia"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v11

    goto :goto_2

    :cond_2
    const-string v8, "s"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v0

    goto :goto_2

    :cond_3
    const-string v8, "l"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v10

    goto :goto_2

    :cond_4
    const-string v8, "d"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v8, :cond_5

    move v8, v13

    goto :goto_2

    :cond_5
    :goto_1
    const/4 v8, -0x1

    :goto_2
    const-string v9, "v"

    if-eqz v8, :cond_c

    if-eq v8, v13, :cond_b

    if-eq v8, v10, :cond_a

    if-eq v8, v11, :cond_8

    if-eq v8, v12, :cond_6

    :try_start_2
    iget-object v5, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v5, Lk6/l4;

    invoke-virtual {v5}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v5

    iget-object v5, v5, Lk6/d4;->f:Lk6/f4;

    const-string v6, "Unrecognized persisted bundle type. Type"

    invoke-virtual {v5, v6, v7}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpg;->zza()Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v7, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v7, Lk6/l4;

    invoke-virtual {v7}, Lf4/y;->h()Lk6/f;

    move-result-object v7

    sget-object v8, Lk6/x;->D0:Lk6/x3;

    invoke-virtual {v7, v2, v8}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v7

    if-eqz v7, :cond_d

    new-instance v7, Lorg/json/JSONArray;

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v5

    new-array v8, v5, [J

    move v9, v0

    :goto_3
    if-ge v9, v5, :cond_7

    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->optLong(I)J

    move-result-wide v10

    aput-wide v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {v1, v6, v8}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    goto :goto_5

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpg;->zza()Z

    move-result v7

    if-eqz v7, :cond_d

    iget-object v7, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v7, Lk6/l4;

    invoke-virtual {v7}, Lf4/y;->h()Lk6/f;

    move-result-object v7

    sget-object v8, Lk6/x;->D0:Lk6/x3;

    invoke-virtual {v7, v2, v8}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v7

    if-eqz v7, :cond_d

    new-instance v7, Lorg/json/JSONArray;

    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v5

    new-array v8, v5, [I

    move v9, v0

    :goto_4
    if-ge v9, v5, :cond_9

    invoke-virtual {v7, v9}, Lorg/json/JSONArray;->optInt(I)I

    move-result v10

    aput v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_9
    invoke-virtual {v1, v6, v8}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    goto :goto_5

    :cond_a
    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-virtual {v1, v6, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto :goto_5

    :cond_b
    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    invoke-virtual {v1, v6, v7, v8}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    goto :goto_5

    :cond_c
    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v6, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_5

    :catch_0
    :try_start_3
    iget-object v5, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v5, Lk6/l4;

    invoke-virtual {v5}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v5

    iget-object v5, v5, Lk6/d4;->f:Lk6/f4;

    const-string v6, "Error reading value from SharedPreferences. Value dropped"

    invoke-virtual {v5, v6}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_d
    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_e
    iput-object v1, p0, Li3/a0;->c:Ljava/lang/Object;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_6

    :catch_1
    iget-object v0, p0, Li3/a0;->d:Ljava/lang/Object;

    check-cast v0, Lk6/l4;

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    const-string v1, "Error loading bundle from SharedPreferences. Values will be lost"

    iget-object v0, v0, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v0, v1}, Lk6/f4;->b(Ljava/lang/String;)V

    :cond_f
    :goto_6
    iget-object v0, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    if-nez v0, :cond_10

    iget-object v0, p0, Li3/a0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    iput-object v0, p0, Li3/a0;->c:Ljava/lang/Object;

    :cond_10
    iget-object v0, p0, Li3/a0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    return-object v0
.end method

.method public final i(Landroid/os/Bundle;)V
    .locals 16

    move-object/from16 v1, p0

    if-nez p1, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    iget-object v0, v1, Li3/a0;->d:Ljava/lang/Object;

    check-cast v0, Lk6/l4;

    invoke-virtual {v0}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v1, Li3/a0;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-interface {v3, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto/16 :goto_5

    :cond_1
    iget-object v0, v1, Li3/a0;->a:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_2

    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    const-string v9, "n"

    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpg;->zza()Z

    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v9, "Cannot serialize bundle value to SharedPreferences. Type"

    const-string v10, "d"

    const-string v11, "l"

    const-string v12, "s"

    const-string v13, "v"

    const-string v14, "t"

    if-eqz v0, :cond_8

    :try_start_1
    iget-object v0, v1, Li3/a0;->d:Ljava/lang/Object;

    check-cast v0, Lk6/l4;

    invoke-virtual {v0}, Lf4/y;->h()Lk6/f;

    move-result-object v0

    sget-object v15, Lk6/x;->D0:Lk6/x3;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 p1, v6

    const/4 v6, 0x0

    :try_start_2
    invoke-virtual {v0, v6, v15}, Lk6/f;->v(Ljava/lang/String;Lk6/x3;)Z

    move-result v0

    if-eqz v0, :cond_9

    instance-of v0, v7, Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v8, v14, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_3

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :cond_3
    instance-of v0, v7, Ljava/lang/Long;

    if-eqz v0, :cond_4

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v8, v14, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto/16 :goto_3

    :cond_4
    instance-of v0, v7, [I

    if-eqz v0, :cond_5

    check-cast v7, [I

    invoke-static {v7}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "ia"

    invoke-virtual {v8, v14, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    :cond_5
    instance-of v0, v7, [J

    if-eqz v0, :cond_6

    check-cast v7, [J

    invoke-static {v7}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "la"

    invoke-virtual {v8, v14, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    :cond_6
    instance-of v0, v7, Ljava/lang/Double;

    if-eqz v0, :cond_7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v8, v14, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    :cond_7
    iget-object v0, v1, Li3/a0;->d:Ljava/lang/Object;

    check-cast v0, Lk6/l4;

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    iget-object v0, v0, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v0, v9, v6}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    move-object/from16 v6, p1

    goto/16 :goto_1

    :catch_1
    move-exception v0

    move-object/from16 p1, v6

    goto :goto_4

    :cond_8
    move-object/from16 p1, v6

    :cond_9
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v13, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    instance-of v0, v7, Ljava/lang/String;

    if-eqz v0, :cond_a

    invoke-virtual {v8, v14, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    :cond_a
    instance-of v0, v7, Ljava/lang/Long;

    if-eqz v0, :cond_b

    invoke-virtual {v8, v14, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    :cond_b
    instance-of v0, v7, Ljava/lang/Double;

    if-eqz v0, :cond_c

    invoke-virtual {v8, v14, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_3
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    :cond_c
    iget-object v0, v1, Li3/a0;->d:Ljava/lang/Object;

    check-cast v0, Lk6/l4;

    invoke-virtual {v0}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v0

    iget-object v0, v0, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v0, v9, v6}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :goto_4
    iget-object v6, v1, Li3/a0;->d:Ljava/lang/Object;

    check-cast v6, Lk6/l4;

    invoke-virtual {v6}, Lf4/y;->zzj()Lk6/d4;

    move-result-object v6

    const-string v7, "Cannot serialize bundle value to SharedPreferences"

    iget-object v6, v6, Lk6/d4;->f:Lk6/f4;

    invoke-virtual {v6, v7, v0}, Lk6/f4;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_d
    invoke-virtual {v5}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :goto_5
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    iput-object v2, v1, Li3/a0;->c:Ljava/lang/Object;

    return-void
.end method

.method public final view(Landroid/view/View;)Ldagger/hilt/android/internal/builders/ViewComponentBuilder;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Li3/a0;->d:Ljava/lang/Object;

    return-object p0
.end method
