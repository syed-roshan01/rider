.class public final Lg2/h0;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lg2/b0;

.field public final b:Lg2/v;


# direct methods
.method public constructor <init>(Lg2/b0;Lg2/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/h0;->a:Lg2/b0;

    iput-object p2, p0, Lg2/h0;->b:Lg2/v;

    return-void
.end method


# virtual methods
.method public final a(Lg2/a0;Lg2/a0;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lg2/h0;->a:Lg2/b0;

    iget-object v3, v3, Lg2/b0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg2/h0;

    invoke-static {v3, v0}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    iget-object v3, v0, Lg2/h0;->b:Lg2/v;

    check-cast v3, Lg2/e0;

    iget-object v4, v3, Lg2/e0;->g:Lg2/a0;

    iget-wide v4, v4, Lg2/a0;->b:J

    iget-wide v6, v2, Lg2/a0;->b:J

    invoke-static {v4, v5, v6, v7}, La2/b0;->a(JJ)Z

    move-result v4

    const/4 v5, 0x0

    iget-object v8, v2, Lg2/a0;->c:La2/b0;

    if-eqz v4, :cond_1

    iget-object v4, v3, Lg2/e0;->g:Lg2/a0;

    iget-object v4, v4, Lg2/a0;->c:La2/b0;

    invoke-static {v4, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move v4, v5

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v4, 0x1

    :goto_1
    iput-object v2, v3, Lg2/e0;->g:Lg2/a0;

    iget-object v9, v3, Lg2/e0;->i:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    move v11, v5

    :goto_2
    if-ge v11, v10, :cond_3

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/ref/WeakReference;

    invoke-virtual {v12}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg2/w;

    if-nez v12, :cond_2

    goto :goto_3

    :cond_2
    iput-object v2, v12, Lg2/w;->d:Lg2/a0;

    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_3
    iget-object v10, v3, Lg2/e0;->l:Lg2/e;

    const/4 v11, 0x0

    iput-object v11, v10, Lg2/e;->i:Lg2/a0;

    iput-object v11, v10, Lg2/e;->k:Lg2/s;

    iput-object v11, v10, Lg2/e;->j:La2/a0;

    sget-object v12, Lg2/d;->b:Lg2/d;

    iput-object v12, v10, Lg2/e;->l:Lc9/c;

    iput-object v11, v10, Lg2/e;->m:Ld1/d;

    iput-object v11, v10, Lg2/e;->n:Ld1/d;

    invoke-static/range {p1 .. p2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    iget-object v11, v3, Lg2/e0;->b:Lg2/p;

    const/4 v12, -0x1

    if-eqz v10, :cond_6

    if-eqz v4, :cond_e

    invoke-static {v6, v7}, La2/b0;->e(J)I

    move-result v15

    invoke-static {v6, v7}, La2/b0;->d(J)I

    move-result v16

    iget-object v1, v3, Lg2/e0;->g:Lg2/a0;

    iget-object v1, v1, Lg2/a0;->c:La2/b0;

    if-eqz v1, :cond_4

    iget-wide v1, v1, La2/b0;->a:J

    invoke-static {v1, v2}, La2/b0;->e(J)I

    move-result v1

    move/from16 v17, v1

    goto :goto_4

    :cond_4
    move/from16 v17, v12

    :goto_4
    iget-object v1, v3, Lg2/e0;->g:Lg2/a0;

    iget-object v1, v1, Lg2/a0;->c:La2/b0;

    if-eqz v1, :cond_5

    iget-wide v1, v1, La2/b0;->a:J

    invoke-static {v1, v2}, La2/b0;->d(J)I

    move-result v12

    :cond_5
    move/from16 v18, v12

    check-cast v11, Lg2/q;

    iget-object v1, v11, Lg2/q;->b:Lq8/c;

    invoke-interface {v1}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroid/view/inputmethod/InputMethodManager;

    iget-object v14, v11, Lg2/q;->a:Landroid/view/View;

    invoke-virtual/range {v13 .. v18}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    goto/16 :goto_9

    :cond_6
    if-eqz v1, :cond_8

    iget-object v4, v1, Lg2/a0;->a:La2/e;

    iget-object v4, v4, La2/e;->a:Ljava/lang/String;

    iget-object v2, v2, Lg2/a0;->a:La2/e;

    iget-object v2, v2, La2/e;->a:Ljava/lang/String;

    invoke-static {v4, v2}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-wide v13, v1, Lg2/a0;->b:J

    invoke-static {v13, v14, v6, v7}, La2/b0;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v1, v1, Lg2/a0;->c:La2/b0;

    invoke-static {v1, v8}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    check-cast v11, Lg2/q;

    iget-object v1, v11, Lg2/q;->b:Lq8/c;

    invoke-interface {v1}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    iget-object v2, v11, Lg2/q;->a:Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/view/inputmethod/InputMethodManager;->restartInput(Landroid/view/View;)V

    goto/16 :goto_9

    :cond_8
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_5
    if-ge v5, v1, :cond_e

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg2/w;

    if-eqz v2, :cond_d

    iget-object v4, v3, Lg2/e0;->g:Lg2/a0;

    iget-boolean v6, v2, Lg2/w;->h:Z

    if-nez v6, :cond_9

    goto :goto_8

    :cond_9
    iput-object v4, v2, Lg2/w;->d:Lg2/a0;

    iget-boolean v6, v2, Lg2/w;->f:Z

    if-eqz v6, :cond_a

    iget v2, v2, Lg2/w;->e:I

    invoke-static {v4}, Li1/b;->L(Lg2/a0;)Landroid/view/inputmethod/ExtractedText;

    move-result-object v6

    move-object v7, v11

    check-cast v7, Lg2/q;

    iget-object v8, v7, Lg2/q;->b:Lq8/c;

    invoke-interface {v8}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/inputmethod/InputMethodManager;

    iget-object v7, v7, Lg2/q;->a:Landroid/view/View;

    invoke-virtual {v8, v7, v2, v6}, Landroid/view/inputmethod/InputMethodManager;->updateExtractedText(Landroid/view/View;ILandroid/view/inputmethod/ExtractedText;)V

    :cond_a
    iget-object v2, v4, Lg2/a0;->c:La2/b0;

    if-eqz v2, :cond_b

    iget-wide v6, v2, La2/b0;->a:J

    invoke-static {v6, v7}, La2/b0;->e(J)I

    move-result v2

    move/from16 v17, v2

    goto :goto_6

    :cond_b
    move/from16 v17, v12

    :goto_6
    iget-object v2, v4, Lg2/a0;->c:La2/b0;

    if-eqz v2, :cond_c

    iget-wide v6, v2, La2/b0;->a:J

    invoke-static {v6, v7}, La2/b0;->d(J)I

    move-result v2

    move/from16 v18, v2

    goto :goto_7

    :cond_c
    move/from16 v18, v12

    :goto_7
    iget-wide v6, v4, Lg2/a0;->b:J

    invoke-static {v6, v7}, La2/b0;->e(J)I

    move-result v15

    invoke-static {v6, v7}, La2/b0;->d(J)I

    move-result v16

    move-object v2, v11

    check-cast v2, Lg2/q;

    iget-object v4, v2, Lg2/q;->b:Lq8/c;

    invoke-interface {v4}, Lq8/c;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Landroid/view/inputmethod/InputMethodManager;

    iget-object v14, v2, Lg2/q;->a:Landroid/view/View;

    invoke-virtual/range {v13 .. v18}, Landroid/view/inputmethod/InputMethodManager;->updateSelection(Landroid/view/View;IIII)V

    :cond_d
    :goto_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_e
    :goto_9
    return-void
.end method
