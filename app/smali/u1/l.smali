.class public final Lu1/l;
.super Ljava/lang/Object;

# interfaces
.implements Lu1/p1;


# instance fields
.field public final a:Landroid/content/ClipboardManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "clipboard"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.content.ClipboardManager"

    invoke-static {p1, v0}, Ld7/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/content/ClipboardManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/l;->a:Landroid/content/ClipboardManager;

    return-void
.end method


# virtual methods
.method public final a(La2/e;)V
    .locals 17

    move-object/from16 v0, p1

    sget-object v1, Lr8/r;->a:Lr8/r;

    iget-object v2, v0, La2/e;->b:Ljava/util/List;

    if-nez v2, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    iget-object v0, v0, La2/e;->a:Ljava/lang/String;

    if-eqz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    new-instance v3, Landroid/text/SpannableString;

    invoke-direct {v3, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v0, Lu1/t1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    iput-object v4, v0, Lu1/t1;->a:Landroid/os/Parcel;

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x0

    move v5, v4

    :goto_2
    if-ge v5, v2, :cond_15

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La2/d;

    iget-object v7, v6, La2/d;->a:Ljava/lang/Object;

    check-cast v7, La2/x;

    iget-object v8, v0, Lu1/t1;->a:Landroid/os/Parcel;

    invoke-virtual {v8}, Landroid/os/Parcel;->recycle()V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v8

    iput-object v8, v0, Lu1/t1;->a:Landroid/os/Parcel;

    iget-object v8, v7, La2/x;->a:Ll2/o;

    invoke-interface {v8}, Ll2/o;->d()J

    move-result-wide v8

    sget-wide v10, Le1/r;->g:J

    invoke-static {v8, v9, v10, v11}, Le1/r;->c(JJ)Z

    move-result v8

    const/4 v9, 0x1

    if-nez v8, :cond_3

    invoke-virtual {v0, v9}, Lu1/t1;->b(B)V

    iget-object v8, v7, La2/x;->a:Ll2/o;

    invoke-interface {v8}, Ll2/o;->d()J

    move-result-wide v12

    iget-object v8, v0, Lu1/t1;->a:Landroid/os/Parcel;

    invoke-virtual {v8, v12, v13}, Landroid/os/Parcel;->writeLong(J)V

    :cond_3
    sget-wide v12, Lm2/n;->c:J

    iget-wide v14, v7, La2/x;->b:J

    invoke-static {v14, v15, v12, v13}, Lm2/n;->a(JJ)Z

    move-result v8

    const/4 v9, 0x2

    if-nez v8, :cond_4

    invoke-virtual {v0, v9}, Lu1/t1;->b(B)V

    invoke-virtual {v0, v14, v15}, Lu1/t1;->d(J)V

    :cond_4
    const/4 v8, 0x3

    iget-object v14, v7, La2/x;->c:Lf2/l;

    if-eqz v14, :cond_5

    invoke-virtual {v0, v8}, Lu1/t1;->b(B)V

    iget-object v15, v0, Lu1/t1;->a:Landroid/os/Parcel;

    iget v14, v14, Lf2/l;->a:I

    invoke-virtual {v15, v14}, Landroid/os/Parcel;->writeInt(I)V

    :cond_5
    iget-object v14, v7, La2/x;->d:Lf2/j;

    if-eqz v14, :cond_8

    const/4 v15, 0x4

    invoke-virtual {v0, v15}, Lu1/t1;->b(B)V

    iget v14, v14, Lf2/j;->a:I

    invoke-static {v14, v4}, Lf2/j;->a(II)Z

    move-result v15

    if-eqz v15, :cond_7

    :cond_6
    move v15, v4

    goto :goto_3

    :cond_7
    const/4 v15, 0x1

    invoke-static {v14, v15}, Lf2/j;->a(II)Z

    move-result v14

    if-eqz v14, :cond_6

    const/4 v15, 0x1

    :goto_3
    invoke-virtual {v0, v15}, Lu1/t1;->b(B)V

    :cond_8
    iget-object v14, v7, La2/x;->e:Lf2/k;

    if-eqz v14, :cond_d

    const/4 v15, 0x5

    invoke-virtual {v0, v15}, Lu1/t1;->b(B)V

    iget v14, v14, Lf2/k;->a:I

    invoke-static {v14, v4}, Lf2/k;->a(II)Z

    move-result v15

    if-eqz v15, :cond_a

    :cond_9
    move v9, v4

    goto :goto_4

    :cond_a
    const/4 v15, 0x1

    invoke-static {v14, v15}, Lf2/k;->a(II)Z

    move-result v16

    if-eqz v16, :cond_b

    move v9, v15

    goto :goto_4

    :cond_b
    invoke-static {v14, v9}, Lf2/k;->a(II)Z

    move-result v15

    if-eqz v15, :cond_c

    goto :goto_4

    :cond_c
    invoke-static {v14, v8}, Lf2/k;->a(II)Z

    move-result v9

    if-eqz v9, :cond_9

    move v9, v8

    :goto_4
    invoke-virtual {v0, v9}, Lu1/t1;->b(B)V

    :cond_d
    iget-object v8, v7, La2/x;->g:Ljava/lang/String;

    if-eqz v8, :cond_e

    const/4 v9, 0x6

    invoke-virtual {v0, v9}, Lu1/t1;->b(B)V

    iget-object v9, v0, Lu1/t1;->a:Landroid/os/Parcel;

    invoke-virtual {v9, v8}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :cond_e
    iget-wide v8, v7, La2/x;->h:J

    invoke-static {v8, v9, v12, v13}, Lm2/n;->a(JJ)Z

    move-result v12

    if-nez v12, :cond_f

    const/4 v12, 0x7

    invoke-virtual {v0, v12}, Lu1/t1;->b(B)V

    invoke-virtual {v0, v8, v9}, Lu1/t1;->d(J)V

    :cond_f
    iget-object v8, v7, La2/x;->i:Ll2/a;

    if-eqz v8, :cond_10

    const/16 v9, 0x8

    invoke-virtual {v0, v9}, Lu1/t1;->b(B)V

    iget v8, v8, Ll2/a;->a:F

    invoke-virtual {v0, v8}, Lu1/t1;->c(F)V

    :cond_10
    iget-object v8, v7, La2/x;->j:Ll2/p;

    if-eqz v8, :cond_11

    const/16 v9, 0x9

    invoke-virtual {v0, v9}, Lu1/t1;->b(B)V

    iget v9, v8, Ll2/p;->a:F

    invoke-virtual {v0, v9}, Lu1/t1;->c(F)V

    iget v8, v8, Ll2/p;->b:F

    invoke-virtual {v0, v8}, Lu1/t1;->c(F)V

    :cond_11
    iget-wide v8, v7, La2/x;->l:J

    invoke-static {v8, v9, v10, v11}, Le1/r;->c(JJ)Z

    move-result v10

    if-nez v10, :cond_12

    const/16 v10, 0xa

    invoke-virtual {v0, v10}, Lu1/t1;->b(B)V

    iget-object v10, v0, Lu1/t1;->a:Landroid/os/Parcel;

    invoke-virtual {v10, v8, v9}, Landroid/os/Parcel;->writeLong(J)V

    :cond_12
    iget-object v8, v7, La2/x;->m:Ll2/j;

    if-eqz v8, :cond_13

    const/16 v9, 0xb

    invoke-virtual {v0, v9}, Lu1/t1;->b(B)V

    iget-object v9, v0, Lu1/t1;->a:Landroid/os/Parcel;

    iget v8, v8, Ll2/j;->a:I

    invoke-virtual {v9, v8}, Landroid/os/Parcel;->writeInt(I)V

    :cond_13
    iget-object v7, v7, La2/x;->n:Le1/k0;

    if-eqz v7, :cond_14

    const/16 v8, 0xc

    invoke-virtual {v0, v8}, Lu1/t1;->b(B)V

    iget-object v8, v0, Lu1/t1;->a:Landroid/os/Parcel;

    iget-wide v9, v7, Le1/k0;->a:J

    invoke-virtual {v8, v9, v10}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v8, v7, Le1/k0;->b:J

    invoke-static {v8, v9}, Ld1/c;->d(J)F

    move-result v10

    invoke-virtual {v0, v10}, Lu1/t1;->c(F)V

    invoke-static {v8, v9}, Ld1/c;->e(J)F

    move-result v8

    invoke-virtual {v0, v8}, Lu1/t1;->c(F)V

    iget v7, v7, Le1/k0;->c:F

    invoke-virtual {v0, v7}, Lu1/t1;->c(F)V

    :cond_14
    new-instance v7, Landroid/text/Annotation;

    iget-object v8, v0, Lu1/t1;->a:Landroid/os/Parcel;

    invoke-virtual {v8}, Landroid/os/Parcel;->marshall()[B

    move-result-object v8

    invoke-static {v8, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v8

    const-string v9, "androidx.compose.text.SpanStyle"

    invoke-direct {v7, v9, v8}, Landroid/text/Annotation;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget v8, v6, La2/d;->c:I

    const/16 v9, 0x21

    iget v6, v6, La2/d;->b:I

    invoke-virtual {v3, v7, v6, v8, v9}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    :cond_15
    move-object v0, v3

    :goto_5
    const-string v1, "plain text"

    invoke-static {v1, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v2, v1, Lu1/l;->a:Landroid/content/ClipboardManager;

    invoke-virtual {v2, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    return-void
.end method
