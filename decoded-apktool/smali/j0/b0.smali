.class public final Lj0/b0;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/p1;


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lk6/l4;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj0/b0;->e:Ljava/lang/Object;

    invoke-static {p2}, Lf6/a;->u(Ljava/lang/String;)V

    iput-object p2, p0, Lj0/b0;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Lj0/b0;->c:Ljava/lang/Object;

    return-void
.end method

.method public static a(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 7

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result p1

    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result p1

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    const/4 v3, -0x1

    if-eq p1, v3, :cond_6

    if-eq v2, v3, :cond_6

    if-eq p1, v2, :cond_1

    goto :goto_1

    :cond_1
    const-class v3, Li3/e0;

    invoke-interface {p0, p1, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Li3/e0;

    if-eqz v2, :cond_6

    array-length v3, v2

    if-lez v3, :cond_6

    array-length v3, v2

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_6

    aget-object v5, v2, v4

    invoke-interface {p0, v5}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {p0, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    if-eqz p2, :cond_2

    if-eq v6, p1, :cond_4

    :cond_2
    if-nez p2, :cond_3

    if-eq v5, p1, :cond_4

    :cond_3
    if-le p1, v6, :cond_5

    if-ge p1, v5, :cond_5

    :cond_4
    invoke-interface {p0, v6, v5}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    return v0

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v1
.end method


# virtual methods
.method public final b([B)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lj0/b0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lv6/o;

    invoke-direct {v1, p1}, Lv6/o;-><init>([B)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final c(Z)Lg8/p1;
    .locals 0

    return-object p0
.end method

.method public final close()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj0/b0;->a:Z

    iget-object v1, p0, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v1, [B

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Lack of request message. GET request is only supported for unary requests"

    invoke-static {v1, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    iget-object v0, p0, Lj0/b0;->e:Ljava/lang/Object;

    check-cast v0, Lg8/b;

    check-cast v0, Lh8/l;

    iget-object v0, v0, Lh8/l;->o:Lk6/w4;

    iget-object v1, p0, Lj0/b0;->b:Ljava/lang/Object;

    check-cast v1, Le8/l1;

    iget-object v2, p0, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v2, [B

    invoke-virtual {v0, v1, v2}, Lk6/w4;->A(Le8/l1;[B)V

    const/4 v0, 0x0

    iput-object v0, p0, Lj0/b0;->d:Ljava/lang/Object;

    iput-object v0, p0, Lj0/b0;->b:Ljava/lang/Object;

    return-void
.end method

.method public final d(Le8/s;)Lg8/p1;
    .locals 0

    return-object p0
.end method

.method public final e(I)V
    .locals 0

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lj0/b0;->a:Z

    return v0
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final g(Ljava/io/InputStream;)V
    .locals 17

    move-object/from16 v1, p0

    iget-object v0, v1, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v0, [B

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "writePayload should not be called multiple times"

    invoke-static {v3, v0}, Ly3/e;->N(Ljava/lang/String;Z)V

    :try_start_0
    invoke-static/range {p1 .. p1}, Ls6/g;->b(Ljava/io/InputStream;)[B

    move-result-object v0

    iput-object v0, v1, Lj0/b0;->d:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, v1, Lj0/b0;->c:Ljava/lang/Object;

    check-cast v0, Lg8/y5;

    iget-object v3, v0, Lg8/y5;->a:[Lo7/d0;

    array-length v4, v3

    move v5, v2

    :goto_1
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6, v2}, Lo7/d0;->c0(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    iget-object v4, v1, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v4, [B

    array-length v5, v4

    int-to-long v12, v5

    array-length v4, v4

    int-to-long v4, v4

    iget-object v14, v0, Lg8/y5;->a:[Lo7/d0;

    array-length v15, v14

    move v11, v2

    :goto_2
    if-ge v11, v15, :cond_2

    aget-object v6, v14, v11

    move-wide v7, v12

    move-wide v9, v4

    move/from16 v16, v11

    move v11, v3

    invoke-virtual/range {v6 .. v11}, Lo7/d0;->d0(JJI)V

    add-int/lit8 v11, v16, 0x1

    goto :goto_2

    :cond_2
    iget-object v3, v1, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v3, [B

    array-length v3, v3

    int-to-long v3, v3

    iget-object v5, v0, Lg8/y5;->a:[Lo7/d0;

    array-length v6, v5

    move v7, v2

    :goto_3
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    invoke-virtual {v8, v3, v4}, Lo7/d0;->e0(J)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_3
    iget-object v3, v1, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v3, [B

    array-length v3, v3

    int-to-long v3, v3

    iget-object v0, v0, Lg8/y5;->a:[Lo7/d0;

    array-length v5, v0

    :goto_4
    if-ge v2, v5, :cond_4

    aget-object v6, v0, v2

    invoke-virtual {v6, v3, v4}, Lo7/d0;->f0(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    return-void

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final h(Ljava/lang/CharSequence;IILi3/d0;)Z
    .locals 7

    iget v0, p4, Li3/d0;->c:I

    and-int/lit8 v0, v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_4

    iget-object v0, p0, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v0, Li3/i;

    invoke-virtual {p4}, Li3/d0;->c()Lj3/a;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Lj3/c;->a(I)I

    move-result v5

    if-eqz v5, :cond_0

    iget-object v6, v4, Lj3/c;->b:Ljava/nio/ByteBuffer;

    iget v4, v4, Lj3/c;->a:I

    add-int/2addr v5, v4

    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    :cond_0
    check-cast v0, Li3/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Li3/e;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, v0, Li3/e;->a:Landroid/text/TextPaint;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget p3, Lu2/e;->a:I

    invoke-static {p1, p2}, Lu2/d;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    move-result p1

    iget p2, p4, Li3/d0;->c:I

    and-int/lit8 p2, p2, 0x4

    if-eqz p1, :cond_3

    or-int/lit8 p1, p2, 0x2

    goto :goto_1

    :cond_3
    or-int/lit8 p1, p2, 0x1

    :goto_1
    iput p1, p4, Li3/d0;->c:I

    :cond_4
    iget p1, p4, Li3/d0;->c:I

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v1, :cond_5

    move v2, v3

    :cond_5
    return v2
.end method

.method public final i(Ljava/lang/CharSequence;IIIZLi3/s;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p6

    new-instance v5, Li3/v;

    iget-object v6, v0, Lj0/b0;->c:Ljava/lang/Object;

    check-cast v6, Li3/a0;

    iget-object v6, v6, Li3/a0;->c:Ljava/lang/Object;

    check-cast v6, Li3/z;

    iget-boolean v7, v0, Lj0/b0;->a:Z

    iget-object v8, v0, Lj0/b0;->e:Ljava/lang/Object;

    check-cast v8, [I

    invoke-direct {v5, v6, v7, v8}, Li3/v;-><init>(Li3/z;Z[I)V

    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    move v9, v6

    move v11, v7

    move v10, v8

    move/from16 v6, p2

    :cond_0
    :goto_0
    move v8, v6

    :goto_1
    const/4 v12, 0x2

    if-ge v6, v2, :cond_f

    if-ge v10, v3, :cond_f

    if-eqz v11, :cond_f

    iget-object v13, v5, Li3/v;->f:Li3/z;

    iget-object v13, v13, Li3/z;->a:Landroid/util/SparseArray;

    if-nez v13, :cond_1

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Li3/z;

    :goto_2
    iget v14, v5, Li3/v;->a:I

    const/4 v15, 0x3

    if-eq v14, v12, :cond_3

    if-nez v13, :cond_2

    invoke-virtual {v5}, Li3/v;->c()V

    :goto_3
    move v13, v7

    goto :goto_6

    :cond_2
    iput v12, v5, Li3/v;->a:I

    iput-object v13, v5, Li3/v;->f:Li3/z;

    iput v7, v5, Li3/v;->c:I

    :goto_4
    move v13, v12

    goto :goto_6

    :cond_3
    if-eqz v13, :cond_4

    iput-object v13, v5, Li3/v;->f:Li3/z;

    iget v13, v5, Li3/v;->c:I

    add-int/2addr v13, v7

    iput v13, v5, Li3/v;->c:I

    goto :goto_4

    :cond_4
    const v13, 0xfe0e

    if-ne v9, v13, :cond_5

    invoke-virtual {v5}, Li3/v;->c()V

    goto :goto_3

    :cond_5
    const v13, 0xfe0f

    if-ne v9, v13, :cond_6

    goto :goto_4

    :cond_6
    iget-object v13, v5, Li3/v;->f:Li3/z;

    iget-object v14, v13, Li3/z;->b:Li3/d0;

    if-eqz v14, :cond_9

    iget v14, v5, Li3/v;->c:I

    if-ne v14, v7, :cond_8

    invoke-virtual {v5}, Li3/v;->d()Z

    move-result v13

    if-eqz v13, :cond_7

    iget-object v13, v5, Li3/v;->f:Li3/z;

    iput-object v13, v5, Li3/v;->g:Ljava/lang/Object;

    invoke-virtual {v5}, Li3/v;->c()V

    :goto_5
    move v13, v15

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, Li3/v;->c()V

    goto :goto_3

    :cond_8
    iput-object v13, v5, Li3/v;->g:Ljava/lang/Object;

    invoke-virtual {v5}, Li3/v;->c()V

    goto :goto_5

    :cond_9
    invoke-virtual {v5}, Li3/v;->c()V

    goto :goto_3

    :goto_6
    iput v9, v5, Li3/v;->b:I

    if-eq v13, v7, :cond_e

    if-eq v13, v12, :cond_c

    if-eq v13, v15, :cond_a

    goto :goto_1

    :cond_a
    if-nez p5, :cond_b

    iget-object v12, v5, Li3/v;->g:Ljava/lang/Object;

    check-cast v12, Li3/z;

    iget-object v12, v12, Li3/z;->b:Li3/d0;

    invoke-virtual {v0, v1, v8, v6, v12}, Lj0/b0;->h(Ljava/lang/CharSequence;IILi3/d0;)Z

    move-result v12

    if-nez v12, :cond_0

    :cond_b
    iget-object v11, v5, Li3/v;->g:Ljava/lang/Object;

    check-cast v11, Li3/z;

    iget-object v11, v11, Li3/z;->b:Li3/d0;

    invoke-interface {v4, v1, v8, v6, v11}, Li3/s;->b(Ljava/lang/CharSequence;IILi3/d0;)Z

    move-result v11

    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    move-result v12

    add-int/2addr v12, v6

    if-ge v12, v2, :cond_d

    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    move v9, v6

    :cond_d
    move v6, v12

    goto/16 :goto_1

    :cond_e
    invoke-static {v1, v8}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v6

    add-int/2addr v6, v8

    if-ge v6, v2, :cond_0

    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v8

    move v9, v8

    goto/16 :goto_0

    :cond_f
    iget v2, v5, Li3/v;->a:I

    if-ne v2, v12, :cond_12

    iget-object v2, v5, Li3/v;->f:Li3/z;

    iget-object v2, v2, Li3/z;->b:Li3/d0;

    if-eqz v2, :cond_12

    iget v2, v5, Li3/v;->c:I

    if-gt v2, v7, :cond_10

    invoke-virtual {v5}, Li3/v;->d()Z

    move-result v2

    if-eqz v2, :cond_12

    :cond_10
    if-ge v10, v3, :cond_12

    if-eqz v11, :cond_12

    if-nez p5, :cond_11

    iget-object v2, v5, Li3/v;->f:Li3/z;

    iget-object v2, v2, Li3/z;->b:Li3/d0;

    invoke-virtual {v0, v1, v8, v6, v2}, Lj0/b0;->h(Ljava/lang/CharSequence;IILi3/d0;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    iget-object v2, v5, Li3/v;->f:Li3/z;

    iget-object v2, v2, Li3/z;->b:Li3/d0;

    invoke-interface {v4, v1, v8, v6, v2}, Li3/s;->b(Ljava/lang/CharSequence;IILi3/d0;)Z

    :cond_12
    invoke-interface/range {p6 .. p6}, Li3/s;->a()Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public final j()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lj0/b0;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj0/b0;->a:Z

    iget-object v0, p0, Lj0/b0;->e:Ljava/lang/Object;

    check-cast v0, Lk6/l4;

    invoke-virtual {v0}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lj0/b0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lj0/b0;->d:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lj0/b0;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final k(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lj0/b0;->e:Ljava/lang/Object;

    check-cast v0, Lk6/l4;

    invoke-virtual {v0}, Lk6/l4;->s()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lj0/b0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    iput-object p1, p0, Lj0/b0;->d:Ljava/lang/Object;

    return-void
.end method
