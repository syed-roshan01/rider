.class public final Ll4/e;
.super Ljava/lang/Object;


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;ZLb8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/e;->b:Ljava/lang/Object;

    iput-boolean p3, p0, Ll4/e;->a:Z

    .line 2
    new-instance p3, Lz7/d;

    invoke-direct {p3, p1, p2}, Lz7/d;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    iput-object p3, p0, Ll4/e;->c:Ljava/lang/Object;

    iput-object p4, p0, Ll4/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll4/j;Ll4/f;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/e;->d:Ljava/lang/Object;

    iput-object p2, p0, Ll4/e;->b:Ljava/lang/Object;

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x2

    new-array p1, p1, [Z

    iput-object p1, p0, Ll4/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public static a([[[Lc8/d;ILc8/d;)V
    .locals 4

    iget v0, p2, Lc8/d;->d:I

    add-int/2addr p1, v0

    aget-object p0, p0, p1

    iget p1, p2, Lc8/d;->c:I

    aget-object p0, p0, p1

    iget-object p1, p2, Lc8/d;->a:Lb8/b;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v3, :cond_4

    if-eq v1, v2, :cond_3

    const/4 v2, 0x4

    if-eq v1, v2, :cond_2

    const/4 v2, 0x6

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Illegal mode "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const/4 v0, 0x3

    goto :goto_0

    :cond_3
    move v0, v3

    goto :goto_0

    :cond_4
    move v0, v2

    :goto_0
    aget-object p1, p0, v0

    if-eqz p1, :cond_5

    iget v1, p2, Lc8/d;->f:I

    iget p1, p1, Lc8/d;->f:I

    if-le p1, v1, :cond_6

    :cond_5
    aput-object p2, p0, v0

    :cond_6
    return-void
.end method

.method public static c(Lb8/b;C)Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_5

    const/4 v2, 0x2

    if-eq p0, v2, :cond_2

    const/4 v2, 0x4

    if-eq p0, v2, :cond_1

    const/4 v1, 0x6

    if-eq p0, v1, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lc8/b;->b(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    return v1

    :cond_2
    const/16 p0, 0x60

    if-ge p1, p0, :cond_3

    sget-object p0, Lc8/b;->a:[I

    aget p0, p0, p1

    const/4 p1, -0x1

    if-eq p0, p1, :cond_4

    move v0, v1

    goto :goto_0

    :cond_3
    sget-object p0, Lc8/b;->a:[I

    :cond_4
    :goto_0
    return v0

    :cond_5
    const/16 p0, 0x30

    if-lt p1, p0, :cond_6

    const/16 p0, 0x39

    if-gt p1, p0, :cond_6

    move v0, v1

    :cond_6
    return v0
.end method

.method public static g(I)Lb8/c;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    sub-int/2addr p0, v0

    if-eqz p0, :cond_1

    if-eq p0, v0, :cond_0

    const/16 p0, 0x28

    invoke-static {p0}, Lb8/c;->b(I)Lb8/c;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 p0, 0x1a

    invoke-static {p0}, Lb8/c;->b(I)Lb8/c;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 p0, 0x9

    invoke-static {p0}, Lb8/c;->b(I)Lb8/c;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final b(Lb8/c;[[[Lc8/d;ILc8/d;)V
    .locals 16

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    move/from16 v10, p3

    iget-object v0, v8, Ll4/e;->c:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Lz7/d;

    iget-object v0, v11, Lz7/d;->a:[Ljava/nio/charset/CharsetEncoder;

    array-length v0, v0

    iget v1, v11, Lz7/d;->b:I

    const-string v12, ""

    iget-object v13, v8, Ll4/e;->b:Ljava/lang/Object;

    if-ltz v1, :cond_0

    move-object v2, v13

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v10}, Ljava/lang/String;->charAt(I)C

    move-result v2

    iget-object v3, v11, Lz7/d;->a:[Ljava/nio/charset/CharsetEncoder;

    aget-object v3, v3, v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v0, v1, 0x1

    :goto_0
    move v14, v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    move v15, v1

    :goto_2
    if-ge v15, v14, :cond_2

    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iget-object v1, v11, Lz7/d;->a:[Ljava/nio/charset/CharsetEncoder;

    aget-object v1, v1, v15

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/nio/charset/CharsetEncoder;->canEncode(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v7, Lc8/d;

    sget-object v2, Lb8/b;->e:Lb8/b;

    const/4 v5, 0x1

    move-object v0, v7

    move-object/from16 v1, p0

    move/from16 v3, p3

    move v4, v15

    move-object/from16 v6, p4

    move-object v8, v7

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v7}, Lc8/d;-><init>(Ll4/e;Lb8/b;IIILc8/d;Lb8/c;)V

    invoke-static {v9, v10, v8}, Ll4/e;->a([[[Lc8/d;ILc8/d;)V

    :cond_1
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v8, p0

    goto :goto_2

    :cond_2
    sget-object v2, Lb8/b;->n:Lb8/b;

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v13, v10}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v2, v0}, Ll4/e;->c(Lb8/b;C)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v8, Lc8/d;

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, v8

    move-object/from16 v1, p0

    move/from16 v3, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v7}, Lc8/d;-><init>(Ll4/e;Lb8/b;IIILc8/d;Lb8/c;)V

    invoke-static {v9, v10, v8}, Ll4/e;->a([[[Lc8/d;ILc8/d;)V

    :cond_3
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v8

    sget-object v2, Lb8/b;->d:Lb8/b;

    invoke-virtual {v13, v10}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v2, v0}, Ll4/e;->c(Lb8/b;C)Z

    move-result v0

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eqz v0, :cond_6

    new-instance v14, Lc8/d;

    const/4 v4, 0x0

    add-int/lit8 v0, v10, 0x1

    if-ge v0, v8, :cond_5

    invoke-virtual {v13, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v2, v0}, Ll4/e;->c(Lb8/b;C)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    move v5, v11

    goto :goto_4

    :cond_5
    :goto_3
    move v5, v12

    :goto_4
    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v3, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v7}, Lc8/d;-><init>(Ll4/e;Lb8/b;IIILc8/d;Lb8/c;)V

    invoke-static {v9, v10, v14}, Ll4/e;->a([[[Lc8/d;ILc8/d;)V

    :cond_6
    sget-object v2, Lb8/b;->c:Lb8/b;

    invoke-virtual {v13, v10}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v2, v0}, Ll4/e;->c(Lb8/b;C)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v14, Lc8/d;

    const/4 v4, 0x0

    add-int/lit8 v0, v10, 0x1

    if-ge v0, v8, :cond_a

    invoke-virtual {v13, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v2, v0}, Ll4/e;->c(Lb8/b;C)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_6

    :cond_7
    add-int/lit8 v0, v10, 0x2

    if-ge v0, v8, :cond_9

    invoke-virtual {v13, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v2, v0}, Ll4/e;->c(Lb8/b;C)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_5

    :cond_8
    const/4 v0, 0x3

    move v5, v0

    goto :goto_7

    :cond_9
    :goto_5
    move v5, v11

    goto :goto_7

    :cond_a
    :goto_6
    move v5, v12

    :goto_7
    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v3, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p1

    invoke-direct/range {v0 .. v7}, Lc8/d;-><init>(Ll4/e;Lb8/b;IIILc8/d;Lb8/c;)V

    invoke-static {v9, v10, v14}, Ll4/e;->a([[[Lc8/d;ILc8/d;)V

    :cond_b
    return-void
.end method

.method public final d(Z)V
    .locals 4

    iget-object v0, p0, Ll4/e;->d:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll4/j;

    check-cast v0, Ll4/j;

    monitor-enter v1

    :try_start_0
    iget-boolean v2, p0, Ll4/e;->a:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_1

    iget-object v2, p0, Ll4/e;->b:Ljava/lang/Object;

    check-cast v2, Ll4/f;

    iget-object v2, v2, Ll4/f;->g:Ll4/e;

    invoke-static {v2, p0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, p0, p1}, Ll4/j;->a(Ll4/j;Ll4/e;Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iput-boolean v3, p0, Ll4/e;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit v1

    throw p1
.end method

.method public final e(Lb8/c;)Ll/z2;
    .locals 12

    iget-object v0, p0, Ll4/e;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    iget-object v3, p0, Ll4/e;->c:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lz7/d;

    iget-object v4, v4, Lz7/d;->a:[Ljava/nio/charset/CharsetEncoder;

    array-length v4, v4

    const/4 v5, 0x4

    filled-new-array {v2, v4, v5}, [I

    move-result-object v2

    const-class v4, Lc8/d;

    invoke-static {v4, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[[Lc8/d;

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-virtual {p0, p1, v2, v6, v4}, Ll4/e;->b(Lb8/c;[[[Lc8/d;ILc8/d;)V

    const/4 v4, 0x1

    :goto_0
    if-gt v4, v1, :cond_3

    move v7, v6

    :goto_1
    move-object v8, v3

    check-cast v8, Lz7/d;

    iget-object v8, v8, Lz7/d;->a:[Ljava/nio/charset/CharsetEncoder;

    array-length v8, v8

    if-ge v7, v8, :cond_2

    move v8, v6

    :goto_2
    if-ge v8, v5, :cond_1

    aget-object v9, v2, v4

    aget-object v9, v9, v7

    aget-object v9, v9, v8

    if-eqz v9, :cond_0

    if-ge v4, v1, :cond_0

    invoke-virtual {p0, p1, v2, v4, v9}, Ll4/e;->b(Lb8/c;[[[Lc8/d;ILc8/d;)V

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, -0x1

    const v7, 0x7fffffff

    move v9, v6

    move v8, v7

    move v7, v4

    :goto_3
    move-object v10, v3

    check-cast v10, Lz7/d;

    iget-object v10, v10, Lz7/d;->a:[Ljava/nio/charset/CharsetEncoder;

    array-length v10, v10

    if-ge v9, v10, :cond_6

    move v10, v6

    :goto_4
    if-ge v10, v5, :cond_5

    aget-object v11, v2, v1

    aget-object v11, v11, v9

    aget-object v11, v11, v10

    if-eqz v11, :cond_4

    iget v11, v11, Lc8/d;->f:I

    if-ge v11, v8, :cond_4

    move v4, v9

    move v7, v10

    move v8, v11

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_6
    if-ltz v4, :cond_7

    new-instance v0, Ll/z2;

    aget-object v1, v2, v1

    aget-object v1, v1, v4

    aget-object v1, v1, v7

    invoke-direct {v0, p0, p1, v1}, Ll/z2;-><init>(Ll4/e;Lb8/c;Lc8/d;)V

    return-object v0

    :cond_7
    new-instance p1, Ly5/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Internal error: failed to encode \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    const-string v2, "\""

    invoke-static {v1, v0, v2}, La7/a;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(I)Lja/x;
    .locals 4

    iget-object v0, p0, Ll4/e;->d:Ljava/lang/Object;

    check-cast v0, Ll4/j;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll4/e;->a:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll4/e;->c:Ljava/lang/Object;

    check-cast v1, [Z

    aput-boolean v2, v1, p1

    iget-object v1, p0, Ll4/e;->b:Ljava/lang/Object;

    check-cast v1, Ll4/f;

    iget-object v1, v1, Ll4/f;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, v0, Ll4/j;->w:Ll4/h;

    move-object v2, p1

    check-cast v2, Lja/x;

    invoke-virtual {v1, v2}, Lja/m;->f(Lja/x;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1, v2}, Ll4/h;->k(Lja/x;)Lja/e0;

    move-result-object v1

    invoke-static {v1}, Lw4/e;->a(Ljava/io/Closeable;)V

    :cond_0
    check-cast p1, Lja/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_1
    const-string p1, "editor is closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method
