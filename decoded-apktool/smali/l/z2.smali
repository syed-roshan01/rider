.class public Ll/z2;
.super Ljava/lang/Object;

# interfaces
.implements Lx2/f;
.implements Ldagger/hilt/android/internal/builders/ActivityComponentBuilder;
.implements Lg8/r0;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Ll/z2;->a:I

    .line 39
    invoke-direct {p0, v0}, Ll/z2;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Ll/z2;->a:I

    const/16 v0, 0x9

    if-eq p1, v0, :cond_4

    const/16 v0, 0xe

    const/4 v1, 0x0

    if-eq p1, v0, :cond_3

    const/16 v0, 0x10

    if-eq p1, v0, :cond_2

    const/16 v0, 0x13

    if-eq p1, v0, :cond_1

    const/16 v0, 0x14

    if-eq p1, v0, :cond_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    .line 4
    sget-object p1, Le8/c;->b:Le8/c;

    iput-object p1, p0, Ll/z2;->c:Ljava/lang/Object;

    return-void

    .line 5
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    sget-object p1, Le8/c;->b:Le8/c;

    iput-object p1, p0, Ll/z2;->c:Ljava/lang/Object;

    return-void

    .line 7
    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    .line 9
    sget-object p1, Lg7/a;->b:Lg7/a;

    iput-object p1, p0, Ll/z2;->c:Ljava/lang/Object;

    iput-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    return-void

    .line 10
    :cond_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll/z2;->b:Ljava/lang/Object;

    iput-object v1, p0, Ll/z2;->c:Ljava/lang/Object;

    sget-object p1, Le7/c;->e:Le7/c;

    iput-object p1, p0, Ll/z2;->d:Ljava/lang/Object;

    return-void

    .line 11
    :cond_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    invoke-static {}, Lr6/i;->a()Lr6/i;

    move-result-object p1

    iput-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/z2;->a:I

    const/4 p1, 0x0

    iput-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    iput-object p1, p0, Ll/z2;->c:Ljava/lang/Object;

    iput-object p1, p0, Ll/z2;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/z2;->a:I

    iput-object p2, p0, Ll/z2;->b:Ljava/lang/Object;

    iput-object p3, p0, Ll/z2;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/n;Landroid/animation/Animator;Landroidx/fragment/app/s1;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Ll/z2;->a:I

    iput-object p1, p0, Ll/z2;->d:Ljava/lang/Object;

    iput-object p2, p0, Ll/z2;->b:Ljava/lang/Object;

    iput-object p3, p0, Ll/z2;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Le8/c2;Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Ll/z2;->a:I

    const/4 v0, 0x0

    .line 22
    invoke-direct {p0, p1, p2, v0}, Ll/z2;-><init>(Le8/c2;Ljava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(Le8/c2;Ljava/lang/Object;I)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p3, 0x12

    iput p3, p0, Ll/z2;->a:I

    const-string p3, "status"

    .line 34
    invoke-static {p1, p3}, Ly3/e;->J(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    iput-object p2, p0, Ll/z2;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Ll/z2;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf2/w;Ll/z2;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Ll/z2;->a:I

    iput-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    iput-object p2, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast p1, Lf2/v;

    .line 37
    iget-object p1, p1, Lf2/v;->a:Ljava/lang/Object;

    iput-object p1, p0, Ll/z2;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg8/v1;Lg8/v1;Lg8/x3;)V
    .locals 1

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x15

    iput v0, p0, Ll/z2;->a:I

    .line 24
    new-instance v0, Lg8/x5;

    .line 25
    invoke-direct {v0, p1}, Lg8/x5;-><init>(Lg8/v1;)V

    iput-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    .line 26
    new-instance p1, Lg8/k;

    invoke-direct {p1, v0, p2}, Lg8/k;-><init>(Lg8/v3;Lg8/v1;)V

    iput-object p1, p0, Ll/z2;->c:Ljava/lang/Object;

    .line 27
    iput-object p1, p3, Lg8/x3;->a:Lg8/v3;

    iput-object p3, p0, Ll/z2;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li4/i;Lw4/l;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Ll/z2;->a:I

    iput-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    iput-object p2, p0, Ll/z2;->c:Ljava/lang/Object;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    sget-boolean p2, Lw4/a;->a:Z

    if-eqz p2, :cond_0

    new-instance p1, Lm0/c0;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lm0/c0;-><init>(Z)V

    goto :goto_1

    :cond_0
    const/16 p2, 0x1a

    if-eq p1, p2, :cond_2

    const/16 p2, 0x1b

    if-ne p1, p2, :cond_1

    goto :goto_0

    .line 19
    :cond_1
    new-instance p1, Lm0/c0;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lm0/c0;-><init>(Z)V

    goto :goto_1

    .line 20
    :cond_2
    :goto_0
    new-instance p1, Lw4/k;

    .line 21
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    :goto_1
    iput-object p1, p0, Ll/z2;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 p1, 0xa

    iput p1, p0, Ll/z2;->a:I

    const/4 v0, 0x0

    .line 28
    invoke-direct {p0, p1, v0}, Ll/z2;-><init>(II)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Ll/z2;->a:I

    iput-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    iput-object p2, p0, Ll/z2;->c:Ljava/lang/Object;

    iput-object p3, p0, Ll/z2;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ll/q;)V
    .locals 1

    const/16 p1, 0xb

    iput p1, p0, Ll/z2;->a:I

    const/4 v0, 0x0

    .line 29
    invoke-direct {p0, p1, v0}, Ll/z2;-><init>(II)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/v2;)V
    .locals 1

    const/16 p1, 0xc

    iput p1, p0, Ll/z2;->a:I

    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, p1, v0}, Ll/z2;-><init>(II)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/w2;)V
    .locals 1

    const/16 p1, 0xf

    iput p1, p0, Ll/z2;->a:I

    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, p1, v0}, Ll/z2;-><init>(II)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/x2;)V
    .locals 1

    const/16 p1, 0xd

    iput p1, p0, Ll/z2;->a:I

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, p1, v0}, Ll/z2;-><init>(II)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/y2;)V
    .locals 0

    const/16 p1, 0xe

    iput p1, p0, Ll/z2;->a:I

    .line 35
    invoke-direct {p0, p1}, Ll/z2;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ll4/e;Lb8/c;Lc8/d;)V
    .locals 17

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    .line 40
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x11

    iput v0, v6, Ll/z2;->a:I

    iput-object v7, v6, Ll/z2;->d:Ljava/lang/Object;

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v6, Ll/z2;->b:Ljava/lang/Object;

    const/4 v9, 0x0

    move-object/from16 v10, p3

    move v0, v9

    move v1, v0

    :goto_0
    sget-object v11, Lb8/b;->f:Lb8/b;

    const/4 v12, 0x1

    if-eqz v10, :cond_7

    .line 42
    iget v2, v10, Lc8/d;->d:I

    add-int v5, v0, v2

    .line 43
    iget-object v2, v10, Lc8/d;->a:Lb8/b;

    sget-object v0, Lb8/b;->e:Lb8/b;

    .line 44
    iget v4, v10, Lc8/d;->c:I

    iget-object v13, v10, Lc8/d;->e:Lc8/d;

    if-ne v2, v0, :cond_0

    if-nez v13, :cond_0

    if-nez v4, :cond_1

    :cond_0
    if-eqz v13, :cond_2

    .line 45
    iget v0, v13, Lc8/d;->c:I

    if-eq v4, v0, :cond_2

    :cond_1
    move v14, v12

    goto :goto_1

    :cond_2
    move v14, v9

    :goto_1
    if-eqz v14, :cond_3

    goto :goto_2

    :cond_3
    move v12, v1

    :goto_2
    if-eqz v13, :cond_5

    .line 46
    iget-object v0, v13, Lc8/d;->a:Lb8/b;

    if-ne v0, v2, :cond_5

    if-eqz v14, :cond_4

    goto :goto_3

    :cond_4
    move/from16 p3, v12

    move v12, v5

    goto :goto_4

    :cond_5
    :goto_3
    iget-object v0, v6, Ll/z2;->b:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, Ljava/util/List;

    .line 47
    new-instance v3, Lc8/e;

    .line 48
    iget v1, v10, Lc8/d;->b:I

    move-object v0, v3

    move/from16 v16, v1

    move-object/from16 v1, p0

    move/from16 p3, v12

    move-object v12, v3

    move/from16 v3, v16

    .line 49
    invoke-direct/range {v0 .. v5}, Lc8/e;-><init>(Ll/z2;Lb8/b;III)V

    invoke-interface {v15, v9, v12}, Ljava/util/List;->add(ILjava/lang/Object;)V

    move v12, v9

    :goto_4
    if-eqz v14, :cond_6

    iget-object v0, v6, Ll/z2;->b:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/util/List;

    .line 50
    new-instance v15, Lc8/e;

    .line 51
    iget v3, v10, Lc8/d;->b:I

    .line 52
    iget v4, v10, Lc8/d;->c:I

    const/4 v5, 0x0

    move-object v0, v15

    move-object/from16 v1, p0

    move-object v2, v11

    .line 53
    invoke-direct/range {v0 .. v5}, Lc8/e;-><init>(Ll/z2;Lb8/b;III)V

    invoke-interface {v14, v9, v15}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_6
    move/from16 v1, p3

    move v0, v12

    move-object v10, v13

    goto :goto_0

    .line 54
    :cond_7
    iget-boolean v0, v7, Ll4/e;->a:Z

    if-eqz v0, :cond_a

    iget-object v0, v6, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    .line 55
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc8/e;

    if-eqz v0, :cond_8

    .line 56
    iget-object v0, v0, Lc8/e;->a:Lb8/b;

    if-eq v0, v11, :cond_8

    if-eqz v1, :cond_8

    iget-object v0, v6, Ll/z2;->b:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ljava/util/List;

    .line 57
    new-instance v13, Lc8/e;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v13

    move-object/from16 v1, p0

    move-object v2, v11

    invoke-direct/range {v0 .. v5}, Lc8/e;-><init>(Ll/z2;Lb8/b;III)V

    invoke-interface {v10, v9, v13}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_8
    iget-object v0, v6, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    .line 58
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc8/e;

    iget-object v1, v6, Ll/z2;->b:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Ljava/util/List;

    .line 59
    iget-object v0, v0, Lc8/e;->a:Lb8/b;

    if-eq v0, v11, :cond_9

    goto :goto_5

    :cond_9
    move v9, v12

    .line 60
    :goto_5
    new-instance v11, Lc8/e;

    sget-object v2, Lb8/b;->o:Lb8/b;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v11

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lc8/e;-><init>(Ll/z2;Lb8/b;III)V

    invoke-interface {v10, v9, v11}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 61
    :cond_a
    iget v0, v8, Lb8/c;->a:I

    const/16 v1, 0x1a

    const/16 v2, 0x9

    if-gt v0, v2, :cond_b

    move v3, v12

    goto :goto_6

    :cond_b
    if-gt v0, v1, :cond_c

    const/4 v3, 0x2

    goto :goto_6

    :cond_c
    const/4 v3, 0x3

    .line 62
    :goto_6
    invoke-static {v3}, Lt/k;->e(I)I

    move-result v3

    if-eqz v3, :cond_e

    if-eq v3, v12, :cond_d

    const/16 v12, 0x1b

    const/16 v1, 0x28

    goto :goto_7

    :cond_d
    const/16 v12, 0xa

    goto :goto_7

    :cond_e
    move v1, v2

    .line 63
    :goto_7
    invoke-virtual {v6, v8}, Ll/z2;->A(Lb8/c;)I

    move-result v2

    .line 64
    :goto_8
    iget-object v3, v7, Ll4/e;->d:Ljava/lang/Object;

    if-ge v0, v1, :cond_f

    invoke-static {v0}, Lb8/c;->b(I)Lb8/c;

    move-result-object v4

    move-object v5, v3

    check-cast v5, Lb8/a;

    invoke-static {v2, v4, v5}, Lc8/b;->c(ILb8/c;Lb8/a;)Z

    move-result v4

    if-nez v4, :cond_f

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_f
    :goto_9
    if-le v0, v12, :cond_10

    add-int/lit8 v1, v0, -0x1

    .line 65
    invoke-static {v1}, Lb8/c;->b(I)Lb8/c;

    move-result-object v1

    move-object v4, v3

    check-cast v4, Lb8/a;

    invoke-static {v2, v1, v4}, Lc8/b;->c(ILb8/c;Lb8/a;)Z

    move-result v1

    if-eqz v1, :cond_10

    add-int/lit8 v0, v0, -0x1

    goto :goto_9

    .line 66
    :cond_10
    invoke-static {v0}, Lb8/c;->b(I)Lb8/c;

    move-result-object v0

    iput-object v0, v6, Ll/z2;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ly4/n;Ly4/j;)V
    .locals 1

    .line 16
    const/4 v0, 0x4

    iput v0, p0, Ll/z2;->a:I

    invoke-direct {p0, v0, p1, p2}, Ll/z2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static I(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ll/z2;
    .locals 2

    new-instance v0, Ll/z2;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, v1, p0, p1}, Ll/z2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static o(Ls4/j;Ljava/lang/Throwable;)Ls4/e;
    .locals 4

    new-instance v0, Ls4/e;

    instance-of v1, p1, Ls4/m;

    if-eqz v1, :cond_0

    iget-object v1, p0, Ls4/j;->M:Ls4/c;

    iget-object v1, v1, Ls4/c;->l:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Ls4/j;->K:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Ls4/j;->J:Ljava/lang/Integer;

    invoke-static {p0, v2, v3, v1}, Lw4/d;->b(Ls4/j;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ls4/j;->M:Ls4/c;

    iget-object v1, v1, Ls4/c;->k:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Ls4/j;->I:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Ls4/j;->H:Ljava/lang/Integer;

    invoke-static {p0, v2, v3, v1}, Lw4/d;->b(Ls4/j;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ls4/j;->M:Ls4/c;

    iget-object v1, v1, Ls4/c;->k:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Ls4/j;->I:Landroid/graphics/drawable/Drawable;

    iget-object v3, p0, Ls4/j;->H:Ljava/lang/Integer;

    invoke-static {p0, v2, v3, v1}, Lw4/d;->b(Ls4/j;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-direct {v0, v1, p0, p1}, Ls4/e;-><init>(Landroid/graphics/drawable/Drawable;Ls4/j;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static y(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1, p2}, Ll/z2;->y(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result p1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_2

    goto :goto_0

    :catch_0
    :cond_2
    move-object v0, p0

    :catch_1
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final A(Lb8/c;)I
    .locals 12

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/e;

    iget-object v4, v3, Lc8/e;->a:Lb8/b;

    invoke-virtual {v4, p1}, Lb8/b;->a(Lb8/c;)I

    move-result v5

    add-int/lit8 v6, v5, 0x4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v7, 0x2

    const/4 v8, 0x4

    iget v9, v3, Lc8/e;->d:I

    const/4 v10, 0x1

    if-eq v4, v10, :cond_5

    const/4 v11, 0x6

    if-eq v4, v7, :cond_3

    if-eq v4, v8, :cond_2

    const/4 v3, 0x5

    if-eq v4, v3, :cond_1

    if-eq v4, v11, :cond_0

    goto :goto_3

    :cond_0
    mul-int/lit8 v9, v9, 0xd

    add-int/2addr v6, v9

    goto :goto_3

    :cond_1
    add-int/lit8 v6, v5, 0xc

    goto :goto_3

    :cond_2
    invoke-virtual {v3}, Lc8/e;->a()I

    move-result v3

    mul-int/lit8 v3, v3, 0x8

    add-int/2addr v6, v3

    goto :goto_3

    :cond_3
    div-int/lit8 v3, v9, 0x2

    mul-int/lit8 v3, v3, 0xb

    add-int/2addr v3, v6

    rem-int/lit8 v9, v9, 0x2

    if-ne v9, v10, :cond_4

    goto :goto_1

    :cond_4
    move v11, v1

    :goto_1
    add-int v6, v3, v11

    goto :goto_3

    :cond_5
    div-int/lit8 v3, v9, 0x3

    mul-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v6

    rem-int/lit8 v9, v9, 0x3

    if-ne v9, v10, :cond_6

    goto :goto_2

    :cond_6
    if-ne v9, v7, :cond_7

    const/4 v8, 0x7

    goto :goto_2

    :cond_7
    move v8, v1

    :goto_2
    add-int v6, v3, v8

    :goto_3
    add-int/2addr v2, v6

    goto :goto_0

    :cond_8
    return v2
.end method

.method public final B(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final C(I)Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final D(I)Z
    .locals 1

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    return p1
.end method

.method public final varargs E(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/z2;->w(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpectedly could not call: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2

    :cond_0
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Method "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " not supported for object "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method

.method public final varargs F(Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/z2;->w(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_0
    :goto_0
    return-void

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/RuntimeException;

    if-eqz p2, :cond_1

    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/AssertionError;

    const-string v0, "Unexpected exception"

    invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method public final varargs G(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ll/z2;->E(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/RuntimeException;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    :cond_0
    new-instance p2, Ljava/lang/AssertionError;

    const-string v0, "Unexpected exception"

    invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method public final H()Z
    .locals 2

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lm0/l3;

    invoke-interface {v0}, Lm0/l3;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll/z2;

    if-eqz v1, :cond_0

    check-cast v0, Ll/z2;

    invoke-virtual {v0}, Ll/z2;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final J(Ls4/j;Lt4/f;)Ls4/n;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v5, p2

    iget-object v2, v1, Ls4/j;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lw4/e;->a:[Landroid/graphics/Bitmap$Config;

    iget-object v3, v1, Ls4/j;->g:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v2}, Lb9/b;->F(Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_0
    iget-object v2, v1, Ls4/j;->g:Landroid/graphics/Bitmap$Config;

    sget-object v3, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v2, v3, :cond_3

    if-ne v2, v3, :cond_1

    iget-boolean v2, v1, Ls4/j;->q:Z

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v2, Lw4/i;

    invoke-interface {v2, v5}, Lw4/i;->b(Lt4/f;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    :goto_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_1
    move-object v3, v2

    goto :goto_3

    :cond_3
    :goto_2
    iget-object v2, v1, Ls4/j;->g:Landroid/graphics/Bitmap$Config;

    goto :goto_1

    :goto_3
    iget-object v2, v0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v2, Lw4/l;

    iget-boolean v2, v2, Lw4/l;->d:Z

    if-eqz v2, :cond_4

    iget-object v2, v1, Ls4/j;->v:Ls4/b;

    :goto_4
    move-object/from16 v16, v2

    goto :goto_5

    :cond_4
    sget-object v2, Ls4/b;->d:Ls4/b;

    goto :goto_4

    :goto_5
    iget-object v2, v5, Lt4/f;->a:Lf6/a;

    sget-object v4, Lt4/b;->z:Lt4/b;

    invoke-static {v2, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, v5, Lt4/f;->b:Lf6/a;

    invoke-static {v2, v4}, Ld7/a;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_7

    :cond_5
    iget-object v2, v1, Ls4/j;->C:Lt4/e;

    :goto_6
    move-object v6, v2

    goto :goto_8

    :cond_6
    :goto_7
    sget-object v2, Lt4/e;->b:Lt4/e;

    goto :goto_6

    :goto_8
    iget-boolean v2, v1, Ls4/j;->r:Z

    if-eqz v2, :cond_7

    iget-object v2, v1, Ls4/j;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v2, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    if-eq v3, v2, :cond_7

    const/4 v2, 0x1

    :goto_9
    move v8, v2

    goto :goto_a

    :cond_7
    const/4 v2, 0x0

    goto :goto_9

    :goto_a
    new-instance v17, Ls4/n;

    iget-object v2, v1, Ls4/j;->a:Landroid/content/Context;

    iget-object v4, v1, Ls4/j;->h:Landroid/graphics/ColorSpace;

    invoke-static/range {p1 .. p1}, Lw4/d;->a(Ls4/j;)Z

    move-result v7

    iget-boolean v9, v1, Ls4/j;->s:Z

    iget-object v10, v1, Ls4/j;->f:Ljava/lang/String;

    iget-object v11, v1, Ls4/j;->n:Lx9/q;

    iget-object v12, v1, Ls4/j;->o:Ls4/r;

    iget-object v13, v1, Ls4/j;->D:Ls4/o;

    iget-object v14, v1, Ls4/j;->t:Ls4/b;

    iget-object v15, v1, Ls4/j;->u:Ls4/b;

    move-object/from16 v1, v17

    move-object/from16 v5, p2

    invoke-direct/range {v1 .. v16}, Ls4/n;-><init>(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lt4/f;Lt4/e;ZZZLjava/lang/String;Lx9/q;Ls4/r;Ls4/o;Ls4/b;Ls4/b;Ls4/b;)V

    return-object v17
.end method

.method public final K()V
    .locals 1

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final L(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null backendName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final M(I)V
    .locals 2

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    mul-int/lit8 p1, p1, 0x8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size %d; only 128-bit and 256-bit AES keys are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    return-void
.end method

.method public final N(Li5/d;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Ll/z2;->d:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null priority"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final O(I)V
    .locals 2

    const/16 v0, 0xa

    if-lt p1, v0, :cond_0

    const/16 v0, 0x10

    if-lt v0, p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/z2;->c:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Invalid tag size for AesCmacParameters: "

    invoke-static {v1, p1}, Ll/q;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(I)V
    .locals 4

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lg8/v3;

    new-instance v1, Lr7/h;

    new-instance v2, Lcom/google/android/gms/common/api/internal/c0;

    const/4 v3, 0x1

    invoke-direct {v2, p0, p1, v3}, Lcom/google/android/gms/common/api/internal/c0;-><init>(Ljava/lang/Object;II)V

    const/4 p1, 0x0

    invoke-direct {v1, p0, v2, p1}, Lr7/h;-><init>(Ll/z2;Ljava/lang/Runnable;I)V

    invoke-interface {v0, v1}, Lg8/v3;->a(Lg8/a6;)V

    return-void
.end method

.method public final activity(Landroid/app/Activity;)Ldagger/hilt/android/internal/builders/ActivityComponentBuilder;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ll/z2;->d:Ljava/lang/Object;

    return-object p0
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Lg8/x3;

    iput p1, v0, Lg8/x3;->b:I

    return-void
.end method

.method public final build()Ldagger/hilt/android/components/ActivityComponent;
    .locals 3

    iget-object v0, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    const-class v1, Landroid/app/Activity;

    invoke-static {v1, v0}, Lz6/a;->g(Ljava/lang/Class;Ljava/lang/Object;)V

    new-instance v0, Ly4/h;

    iget-object v1, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v1, Ly4/n;

    iget-object v2, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v2, Ly4/j;

    invoke-direct {v0, v1, v2}, Ly4/h;-><init>(Ly4/n;Ly4/j;)V

    return-object v0
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->end()V

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Animator from operation "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/fragment/app/s1;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has been canceled."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final close()V
    .locals 4

    iget-object v0, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Lg8/x3;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lg8/x3;->z:Z

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lg8/v3;

    new-instance v2, Lr7/h;

    new-instance v3, Lg8/h;

    invoke-direct {v3, p0, v1}, Lg8/h;-><init>(Ll/z2;I)V

    const/4 v1, 0x0

    invoke-direct {v2, p0, v3, v1}, Lr7/h;-><init>(Ll/z2;Ljava/lang/Runnable;I)V

    invoke-interface {v0, v2}, Lg8/v3;->a(Lg8/a6;)V

    return-void
.end method

.method public final d()Le7/a;
    .locals 3

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Le7/d;

    if-eqz v0, :cond_5

    iget-object v1, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v1, Lk6/w4;

    if-eqz v1, :cond_5

    iget v0, v0, Le7/d;->b:I

    invoke-virtual {v1}, Lk6/w4;->i()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Le7/d;

    sget-object v2, Le7/c;->e:Le7/c;

    iget-object v1, v1, Le7/d;->d:Le7/c;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    check-cast v0, Le7/d;

    iget-object v0, v0, Le7/d;->d:Le7/c;

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_3

    :goto_1
    invoke-virtual {p0}, Ll/z2;->x()Lk7/a;

    move-result-object v0

    new-instance v1, Le7/a;

    iget-object v2, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v2, Le7/d;

    invoke-direct {v1, v2, v0}, Le7/a;-><init>(Le7/d;Lk7/a;)V

    return-object v1

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Lg8/m4;)V
    .locals 4

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lg8/v3;

    new-instance v1, Lg8/i;

    new-instance v2, Lg8/x1;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p0, p1}, Lg8/x1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lg8/g;

    invoke-direct {v3, p1}, Lg8/g;-><init>(Lg8/m4;)V

    invoke-direct {v1, p0, v2, v3}, Lg8/i;-><init>(Ll/z2;Lg8/x1;Lg8/g;)V

    invoke-interface {v0, v1}, Lg8/v3;->a(Lg8/a6;)V

    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lg8/v3;

    new-instance v1, Lr7/h;

    new-instance v2, Lg8/h;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lg8/h;-><init>(Ll/z2;I)V

    invoke-direct {v1, p0, v2, v3}, Lr7/h;-><init>(Ll/z2;Ljava/lang/Runnable;I)V

    invoke-interface {v0, v1}, Lg8/v3;->a(Lg8/a6;)V

    return-void
.end method

.method public final g(Le8/s;)V
    .locals 1

    iget-object v0, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Lg8/x3;

    invoke-virtual {v0, p1}, Lg8/x3;->g(Le8/s;)V

    return-void
.end method

.method public final h()Le7/d;
    .locals 4

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    iget-object v1, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Le7/c;

    if-eqz v1, :cond_0

    new-instance v1, Le7/d;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v3, Le7/c;

    invoke-direct {v1, v0, v2, v3}, Le7/d;-><init>(IILe7/c;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "tag size not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()Le7/i;
    .locals 3

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Le7/m;

    if-eqz v0, :cond_5

    iget-object v1, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v1, Lk6/w4;

    if-eqz v1, :cond_5

    iget v0, v0, Le7/m;->b:I

    invoke-virtual {v1}, Lk6/w4;->i()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Le7/m;

    sget-object v2, Le7/l;->e:Le7/l;

    iget-object v1, v1, Le7/m;->d:Le7/l;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    check-cast v0, Le7/m;

    iget-object v0, v0, Le7/m;->d:Le7/l;

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_3

    :goto_1
    invoke-virtual {p0}, Ll/z2;->x()Lk7/a;

    move-result-object v0

    new-instance v1, Le7/i;

    iget-object v2, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v2, Le7/m;

    invoke-direct {v1, v2, v0}, Le7/i;-><init>(Le7/m;Lk7/a;)V

    return-object v1

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()Ll5/j;
    .locals 4

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, " backendName"

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Li5/d;

    if-nez v1, :cond_1

    const-string v1, " priority"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, Ll5/j;

    iget-object v1, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v2, [B

    iget-object v3, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v3, Li5/d;

    invoke-direct {v0, v1, v2, v3}, Ll5/j;-><init>(Ljava/lang/String;[BLi5/d;)V

    return-object v0

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final k()Lq5/b;
    .locals 8

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    if-nez v0, :cond_0

    const-string v0, " delta"

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    iget-object v1, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    if-nez v1, :cond_1

    const-string v1, " maxAllowedDelay"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    if-nez v1, :cond_2

    const-string v1, " flags"

    invoke-static {v0, v1}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v0, Lq5/b;

    iget-object v1, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v1, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Ljava/util/Set;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lq5/b;-><init>(JJLjava/util/Set;)V

    return-object v0

    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final l()Lw6/i;
    .locals 3

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lw6/k;

    if-eqz v0, :cond_5

    iget-object v1, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v1, Lk6/w4;

    if-eqz v1, :cond_5

    iget v0, v0, Lw6/k;->b:I

    invoke-virtual {v1}, Lk6/w4;->i()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw6/k;

    sget-object v2, Lw6/j;->d:Lw6/j;

    iget-object v1, v1, Lw6/k;->e:Lw6/j;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    check-cast v0, Lw6/k;

    iget-object v0, v0, Lw6/k;->e:Lw6/j;

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_3

    :goto_1
    invoke-virtual {p0}, Ll/z2;->x()Lk7/a;

    new-instance v0, Lw6/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m()Lw6/m;
    .locals 3

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lw6/o;

    if-eqz v0, :cond_5

    iget-object v1, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v1, Lk6/w4;

    if-eqz v1, :cond_5

    iget v0, v0, Lw6/o;->b:I

    invoke-virtual {v1}, Lk6/w4;->i()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw6/o;

    sget-object v2, Lw6/n;->d:Lw6/n;

    iget-object v1, v1, Lw6/o;->e:Lw6/n;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    check-cast v0, Lw6/o;

    iget-object v0, v0, Lw6/o;->e:Lw6/n;

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_3

    :goto_1
    invoke-virtual {p0}, Ll/z2;->x()Lk7/a;

    new-instance v0, Lw6/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final n()Lw6/q;
    .locals 3

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lw6/s;

    if-eqz v0, :cond_5

    iget-object v1, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v1, Lk6/w4;

    if-eqz v1, :cond_5

    iget v0, v0, Lw6/s;->b:I

    invoke-virtual {v1}, Lk6/w4;->i()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lw6/s;

    sget-object v2, Lw6/r;->d:Lw6/r;

    iget-object v1, v1, Lw6/s;->c:Lw6/r;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    check-cast v0, Lw6/s;

    iget-object v0, v0, Lw6/s;->c:Lw6/r;

    if-eq v0, v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_3

    :goto_1
    invoke-virtual {p0}, Ll/z2;->x()Lk7/a;

    new-instance v0, Lw6/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final p(IZ)Z
    .locals 1

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    return p1
.end method

.method public final q(I)Landroid/content/res/ColorStateList;
    .locals 2

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-static {v1, v0}, Lr2/k;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public final r(II)I
    .locals 1

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    return p1
.end method

.method public final s(II)I
    .locals 1

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    return p1
.end method

.method public final t(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, v0}, Lo7/d0;->C(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Ll/z2;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc8/e;

    if-eqz v2, :cond_0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v3}, Lc8/e;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public final u(IILl/a0;)Landroid/graphics/Typeface;
    .locals 16

    move-object/from16 v1, p0

    move/from16 v0, p2

    move-object/from16 v11, p3

    iget-object v2, v1, Ll/z2;->c:Ljava/lang/Object;

    check-cast v2, Landroid/content/res/TypedArray;

    const/4 v3, 0x0

    move/from16 v4, p1

    invoke-virtual {v2, v4, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    const/4 v12, 0x0

    if-nez v8, :cond_0

    return-object v12

    :cond_0
    iget-object v2, v1, Ll/z2;->d:Ljava/lang/Object;

    check-cast v2, Landroid/util/TypedValue;

    if-nez v2, :cond_1

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    iput-object v2, v1, Ll/z2;->d:Ljava/lang/Object;

    :cond_1
    iget-object v2, v1, Ll/z2;->b:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Landroid/content/Context;

    iget-object v2, v1, Ll/z2;->d:Ljava/lang/Object;

    check-cast v2, Landroid/util/TypedValue;

    sget-object v4, Lt2/n;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v3}, Landroid/content/Context;->isRestricted()Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const/4 v10, 0x1

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const/4 v4, 0x1

    invoke-virtual {v9, v8, v2, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    const-string v13, "ResourcesCompat"

    iget-object v4, v2, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-eqz v4, :cond_9

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v4, "res/"

    invoke-virtual {v14, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    const/4 v15, -0x3

    if-nez v4, :cond_3

    invoke-virtual {v11, v15}, Lt2/b;->a(I)V

    goto/16 :goto_4

    :cond_3
    iget v4, v2, Landroid/util/TypedValue;->assetCookie:I

    sget-object v7, Lu2/f;->b:Lq/n;

    invoke-static {v9, v8, v14, v4, v0}, Lu2/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lq/n;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Typeface;

    if-eqz v4, :cond_4

    invoke-virtual {v11, v4}, Lt2/b;->b(Landroid/graphics/Typeface;)V

    move-object v12, v4

    goto/16 :goto_4

    :cond_4
    :try_start_0
    invoke-virtual {v14}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".xml"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v9, v8}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v4

    invoke-static {v4, v9}, Li1/b;->C(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lt2/e;

    move-result-object v4

    if-nez v4, :cond_5

    const-string v0, "Failed to find font-family tag"

    invoke-static {v13, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v11, v15}, Lt2/b;->a(I)V

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_5
    iget v7, v2, Landroid/util/TypedValue;->assetCookie:I

    move-object v2, v3

    move-object v3, v4

    move-object v4, v9

    move v5, v8

    move-object v6, v14

    move/from16 v8, p2

    move-object/from16 v9, p3

    invoke-static/range {v2 .. v10}, Lu2/f;->a(Landroid/content/Context;Lt2/e;Landroid/content/res/Resources;ILjava/lang/String;IILl/a0;Z)Landroid/graphics/Typeface;

    move-result-object v12

    goto :goto_4

    :cond_6
    iget v10, v2, Landroid/util/TypedValue;->assetCookie:I

    sget-object v2, Lu2/f;->a:Lk/f;

    move-object v4, v9

    move v5, v8

    move-object v6, v14

    move-object v12, v7

    move/from16 v7, p2

    invoke-virtual/range {v2 .. v7}, Lk/f;->t(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v9, v8, v14, v10, v0}, Lu2/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0, v2}, Lq/n;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    if-eqz v2, :cond_8

    invoke-virtual {v11, v2}, Lt2/b;->b(Landroid/graphics/Typeface;)V

    goto :goto_0

    :cond_8
    invoke-virtual {v11, v15}, Lt2/b;->a(I)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v12, v2

    goto :goto_4

    :goto_1
    const-string v2, "Failed to read xml resource "

    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v13, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_3

    :goto_2
    const-string v2, "Failed to parse xml resource "

    invoke-virtual {v2, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v13, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_3
    invoke-virtual {v11, v15}, Lt2/b;->a(I)V

    const/4 v12, 0x0

    :goto_4
    return-object v12

    :cond_9
    new-instance v0, Landroid/content/res/Resources$NotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Resource \""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\" ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ") is not a Font: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final v(II)I
    .locals 1

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    return p1
.end method

.method public final w(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 3

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Class;

    invoke-static {p1, v0, v2}, Ll/z2;->y(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p1

    :cond_1
    :goto_0
    return-object v1
.end method

.method public final x()Lk7/a;
    .locals 5

    iget v0, p0, Ll/z2;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x5

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Le7/m;

    iget-object v0, v0, Le7/m;->d:Le7/l;

    sget-object v4, Le7/l;->e:Le7/l;

    if-ne v0, v4, :cond_0

    new-array v0, v3, [B

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    goto :goto_1

    :cond_0
    sget-object v4, Le7/l;->d:Le7/l;

    if-eq v0, v4, :cond_3

    sget-object v4, Le7/l;->c:Le7/l;

    if-ne v0, v4, :cond_1

    goto :goto_0

    :cond_1
    sget-object v3, Le7/l;->b:Le7/l;

    if-ne v0, v3, :cond_2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown HmacParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v2, Le7/m;

    iget-object v2, v2, Le7/m;->d:Le7/l;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Le7/d;

    iget-object v0, v0, Le7/d;->d:Le7/c;

    sget-object v4, Le7/c;->e:Le7/c;

    if-ne v0, v4, :cond_4

    new-array v0, v3, [B

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    goto :goto_3

    :cond_4
    sget-object v4, Le7/c;->d:Le7/c;

    if-eq v0, v4, :cond_7

    sget-object v4, Le7/c;->c:Le7/c;

    if-ne v0, v4, :cond_5

    goto :goto_2

    :cond_5
    sget-object v3, Le7/c;->b:Le7/c;

    if-ne v0, v3, :cond_6

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesCmacParametersParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v2, Le7/d;

    iget-object v2, v2, Le7/d;->d:Le7/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_2
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    :goto_3
    return-object v0

    :pswitch_1
    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lw6/s;

    iget-object v0, v0, Lw6/s;->c:Lw6/r;

    sget-object v4, Lw6/r;->d:Lw6/r;

    if-ne v0, v4, :cond_8

    new-array v0, v3, [B

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    goto :goto_4

    :cond_8
    sget-object v4, Lw6/r;->c:Lw6/r;

    if-ne v0, v4, :cond_9

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    goto :goto_4

    :cond_9
    sget-object v3, Lw6/r;->b:Lw6/r;

    if-ne v0, v3, :cond_a

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    :goto_4
    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesGcmSivParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v2, Lw6/s;

    iget-object v2, v2, Lw6/s;->c:Lw6/r;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lw6/o;

    iget-object v0, v0, Lw6/o;->e:Lw6/n;

    sget-object v4, Lw6/n;->d:Lw6/n;

    if-ne v0, v4, :cond_b

    new-array v0, v3, [B

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    goto :goto_5

    :cond_b
    sget-object v4, Lw6/n;->c:Lw6/n;

    if-ne v0, v4, :cond_c

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    goto :goto_5

    :cond_c
    sget-object v3, Lw6/n;->b:Lw6/n;

    if-ne v0, v3, :cond_d

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    :goto_5
    return-object v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesGcmParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v2, Lw6/o;

    iget-object v2, v2, Lw6/o;->e:Lw6/n;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    iget-object v0, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v0, Lw6/k;

    iget-object v0, v0, Lw6/k;->e:Lw6/j;

    sget-object v4, Lw6/j;->d:Lw6/j;

    if-ne v0, v4, :cond_e

    new-array v0, v3, [B

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    goto :goto_6

    :cond_e
    sget-object v4, Lw6/j;->c:Lw6/j;

    if-ne v0, v4, :cond_f

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    goto :goto_6

    :cond_f
    sget-object v3, Lw6/j;->b:Lw6/j;

    if-ne v0, v3, :cond_10

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Ll/z2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lk7/a;->a([B)Lk7/a;

    move-result-object v0

    :goto_6
    return-object v0

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesEaxParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/z2;->b:Ljava/lang/Object;

    check-cast v2, Lw6/k;

    iget-object v2, v2, Lw6/k;->e:Lw6/j;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final z(II)I
    .locals 1

    iget-object v0, p0, Ll/z2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    return p1
.end method
