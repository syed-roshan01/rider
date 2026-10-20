.class public final Li3/g;
.super Lk/f;


# instance fields
.field public volatile c:Lj0/b0;

.field public volatile d:Li3/a0;


# virtual methods
.method public final O(ILjava/lang/CharSequence;)I
    .locals 7

    iget-object v0, p0, Li3/g;->c:Lj0/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p1, :cond_2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p2, Landroid/text/Spanned;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p2

    check-cast v1, Landroid/text/Spanned;

    add-int/lit8 v3, p1, 0x1

    const-class v4, Li3/e0;

    invoke-interface {v1, p1, v3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Li3/e0;

    array-length v4, v3

    if-lez v4, :cond_1

    aget-object p1, v3, v2

    invoke-interface {v1, p1}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, p1, -0x10

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v3, p1, 0x10

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    const v4, 0x7fffffff

    const/4 v5, 0x1

    new-instance v6, Li3/t;

    invoke-direct {v6, p1}, Li3/t;-><init>(I)V

    move-object v1, p2

    invoke-virtual/range {v0 .. v6}, Lj0/b0;->i(Ljava/lang/CharSequence;IIIZLi3/s;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li3/t;

    iget p1, p1, Li3/t;->c:I

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    return p1
.end method

.method public final P(ILjava/lang/CharSequence;)I
    .locals 7

    iget-object v0, p0, Li3/g;->c:Lj0/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p1, :cond_2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p2, Landroid/text/Spanned;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    move-object v1, p2

    check-cast v1, Landroid/text/Spanned;

    add-int/lit8 v3, p1, 0x1

    const-class v4, Li3/e0;

    invoke-interface {v1, p1, v3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Li3/e0;

    array-length v4, v3

    if-lez v4, :cond_1

    aget-object p1, v3, v2

    invoke-interface {v1, p1}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, p1, -0x10

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v3, p1, 0x10

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    const v4, 0x7fffffff

    const/4 v5, 0x1

    new-instance v6, Li3/t;

    invoke-direct {v6, p1}, Li3/t;-><init>(I)V

    move-object v1, p2

    invoke-virtual/range {v0 .. v6}, Lj0/b0;->i(Ljava/lang/CharSequence;IIIZLi3/s;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li3/t;

    iget p1, p1, Li3/t;->b:I

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    return p1
.end method

.method public final Q()V
    .locals 2

    :try_start_0
    new-instance v0, Li3/f;

    invoke-direct {v0, p0}, Li3/f;-><init>(Li3/g;)V

    iget-object v1, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v1, Li3/l;

    iget-object v1, v1, Li3/l;->f:Li3/k;

    invoke-interface {v1, v0}, Li3/k;->a(Lh6/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v1, Li3/l;

    invoke-virtual {v1, v0}, Li3/l;->e(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final R(Ljava/lang/CharSequence;IIZ)Ljava/lang/CharSequence;
    .locals 9

    iget-object v0, p0, Li3/g;->c:Lj0/b0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v7, p1, Li3/c0;

    if-eqz v7, :cond_0

    move-object v1, p1

    check-cast v1, Li3/c0;

    invoke-virtual {v1}, Li3/c0;->a()V

    :cond_0
    const/4 v1, 0x0

    const-class v2, Li3/e0;

    if-nez v7, :cond_3

    :try_start_0
    instance-of v3, p1, Landroid/text/Spannable;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    instance-of v3, p1, Landroid/text/Spanned;

    if-eqz v3, :cond_2

    move-object v3, p1

    check-cast v3, Landroid/text/Spanned;

    add-int/lit8 v4, p2, -0x1

    add-int/lit8 v5, p3, 0x1

    invoke-interface {v3, v4, v5, v2}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result v3

    if-gt v3, p3, :cond_2

    new-instance v3, Li3/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, v3, Li3/g0;->a:Z

    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object v4, v3, Li3/g0;->b:Landroid/text/Spannable;

    goto :goto_1

    :catchall_0
    move-exception p2

    goto/16 :goto_6

    :cond_2
    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    new-instance v3, Li3/g0;

    move-object v4, p1

    check-cast v4, Landroid/text/Spannable;

    invoke-direct {v3, v4}, Li3/g0;-><init>(Landroid/text/Spannable;)V

    :goto_1
    if-eqz v3, :cond_5

    iget-object v4, v3, Li3/g0;->b:Landroid/text/Spannable;

    invoke-interface {v4, p2, p3, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Li3/e0;

    if-eqz v2, :cond_5

    array-length v4, v2

    if-lez v4, :cond_5

    array-length v4, v2

    :goto_2
    if-ge v1, v4, :cond_5

    aget-object v5, v2, v1

    iget-object v6, v3, Li3/g0;->b:Landroid/text/Spannable;

    invoke-interface {v6, v5}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    iget-object v8, v3, Li3/g0;->b:Landroid/text/Spannable;

    invoke-interface {v8, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v8

    if-eq v6, p3, :cond_4

    invoke-virtual {v3, v5}, Li3/g0;->removeSpan(Ljava/lang/Object;)V

    :cond_4
    invoke-static {v6, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v8, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    move v2, p2

    if-eq v2, p3, :cond_9

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lt v2, p2, :cond_6

    goto :goto_4

    :cond_6
    const v4, 0x7fffffff

    new-instance v6, Li3/r;

    iget-object p2, v0, Lj0/b0;->b:Ljava/lang/Object;

    check-cast p2, Ll2/l;

    invoke-direct {v6, v3, p2}, Li3/r;-><init>(Li3/g0;Ll2/l;)V

    move-object v1, p1

    move v3, p3

    move v5, p4

    invoke-virtual/range {v0 .. v6}, Lj0/b0;->i(Ljava/lang/CharSequence;IIIZLi3/s;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li3/g0;

    if-eqz p2, :cond_8

    iget-object p2, p2, Li3/g0;->b:Landroid/text/Spannable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_7

    check-cast p1, Li3/c0;

    invoke-virtual {p1}, Li3/c0;->b()V

    :cond_7
    move-object p1, p2

    goto :goto_5

    :cond_8
    if-eqz v7, :cond_a

    :goto_3
    move-object p2, p1

    check-cast p2, Li3/c0;

    invoke-virtual {p2}, Li3/c0;->b()V

    goto :goto_5

    :cond_9
    :goto_4
    if-eqz v7, :cond_a

    goto :goto_3

    :cond_a
    :goto_5
    return-object p1

    :goto_6
    if-eqz v7, :cond_b

    check-cast p1, Li3/c0;

    invoke-virtual {p1}, Li3/c0;->b()V

    :cond_b
    throw p2
.end method

.method public final S(Landroid/view/inputmethod/EditorInfo;)V
    .locals 5

    iget-object v0, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v1, p0, Li3/g;->d:Li3/a0;

    iget-object v1, v1, Li3/a0;->a:Ljava/lang/Object;

    check-cast v1, Lj3/b;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lj3/c;->a(I)I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v4, v1, Lj3/c;->b:Ljava/nio/ByteBuffer;

    iget v1, v1, Lj3/c;->a:I

    add-int/2addr v2, v1

    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    const-string v2, "android.support.text.emoji.emojiCompat_metadataVersion"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    iget-object v0, p0, Lk/f;->b:Ljava/lang/Object;

    check-cast v0, Li3/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "android.support.text.emoji.emojiCompat_replaceAll"

    invoke-virtual {p1, v0, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method
