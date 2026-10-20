.class public final Landroidx/fragment/app/o0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final a:Landroidx/fragment/app/x0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/o0;->a:Landroidx/fragment/app/x0;

    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 11

    const-class v0, Landroidx/fragment/app/k0;

    .line 2
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/o0;->a:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_0

    .line 3
    new-instance p1, Landroidx/fragment/app/k0;

    invoke-direct {p1, p3, p4, v1}, Landroidx/fragment/app/k0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/x0;)V

    return-object p1

    :cond_0
    const-string v0, "fragment"

    .line 4
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    return-object v0

    :cond_1
    const-string p2, "class"

    .line 5
    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    sget-object v2, Lm3/a;->a:[I

    .line 6
    invoke-virtual {p3, p4, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/4 v3, 0x0

    if-nez p2, :cond_2

    .line 7
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_2
    const/4 v4, 0x1

    const/4 v5, -0x1

    .line 8
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    const/4 v7, 0x2

    .line 9
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 10
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_12

    .line 11
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    .line 12
    :try_start_0
    invoke-static {v2, p2}, Landroidx/fragment/app/s0;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-class v9, Landroidx/fragment/app/d0;

    .line 13
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v2, :cond_3

    goto/16 :goto_5

    :cond_3
    if-eqz p1, :cond_4

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    goto :goto_0

    :cond_4
    move v2, v3

    :goto_0
    if-ne v2, v5, :cond_6

    if-ne v6, v5, :cond_6

    if-eqz v8, :cond_5

    goto :goto_1

    .line 15
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    if-eq v6, v5, :cond_7

    .line 16
    invoke-virtual {v1, v6}, Landroidx/fragment/app/x0;->v(I)Landroidx/fragment/app/d0;

    move-result-object v9

    goto :goto_2

    :cond_7
    move-object v9, v0

    :goto_2
    if-nez v9, :cond_8

    if-eqz v8, :cond_8

    .line 17
    invoke-virtual {v1, v8}, Landroidx/fragment/app/x0;->w(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object v9

    :cond_8
    if-nez v9, :cond_9

    if-eq v2, v5, :cond_9

    .line 18
    invoke-virtual {v1, v2}, Landroidx/fragment/app/x0;->v(I)Landroidx/fragment/app/d0;

    move-result-object v9

    :cond_9
    const-string v5, "Fragment "

    const-string v10, "FragmentManager"

    if-nez v9, :cond_b

    .line 19
    invoke-virtual {v1}, Landroidx/fragment/app/x0;->z()Landroidx/fragment/app/s0;

    move-result-object v9

    .line 20
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 21
    iget-object p3, v9, Landroidx/fragment/app/s0;->a:Landroidx/fragment/app/x0;

    .line 22
    iget-object p3, p3, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    .line 23
    iget-object p3, p3, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    .line 24
    invoke-static {p3, p2, v0}, Landroidx/fragment/app/d0;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/d0;

    move-result-object v9

    .line 25
    iput-boolean v4, v9, Landroidx/fragment/app/d0;->mFromLayout:Z

    if-eqz v6, :cond_a

    move p3, v6

    goto :goto_3

    :cond_a
    move p3, v2

    .line 26
    :goto_3
    iput p3, v9, Landroidx/fragment/app/d0;->mFragmentId:I

    .line 27
    iput v2, v9, Landroidx/fragment/app/d0;->mContainerId:I

    .line 28
    iput-object v8, v9, Landroidx/fragment/app/d0;->mTag:Ljava/lang/String;

    .line 29
    iput-boolean v4, v9, Landroidx/fragment/app/d0;->mInLayout:Z

    .line 30
    iput-object v1, v9, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    .line 31
    iget-object p3, v1, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    .line 32
    iput-object p3, v9, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    .line 33
    iget-object p3, p3, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    .line 34
    iget-object v0, v9, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v9, p3, p4, v0}, Landroidx/fragment/app/d0;->onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 35
    invoke-virtual {v1, v9}, Landroidx/fragment/app/x0;->a(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;

    move-result-object p3

    .line 36
    invoke-static {v10, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p4

    if-eqz p4, :cond_c

    .line 37
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 39
    invoke-static {v10, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    .line 40
    :cond_b
    iget-boolean p3, v9, Landroidx/fragment/app/d0;->mInLayout:Z

    if-nez p3, :cond_11

    .line 41
    iput-boolean v4, v9, Landroidx/fragment/app/d0;->mInLayout:Z

    .line 42
    iput-object v1, v9, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    .line 43
    iget-object p3, v1, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    .line 44
    iput-object p3, v9, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    .line 45
    iget-object p3, p3, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    .line 46
    iget-object v0, v9, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v9, p3, p4, v0}, Landroidx/fragment/app/d0;->onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 47
    invoke-virtual {v1, v9}, Landroidx/fragment/app/x0;->f(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;

    move-result-object p3

    .line 48
    invoke-static {v10, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p4

    if-eqz p4, :cond_c

    .line 49
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "Retained Fragment "

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 51
    invoke-static {v10, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    :cond_c
    :goto_4
    check-cast p1, Landroid/view/ViewGroup;

    sget-object p4, Ln3/c;->a:Ln3/b;

    .line 53
    new-instance p4, Ln3/d;

    invoke-direct {p4, v9, p1, v3}, Ln3/d;-><init>(Landroidx/fragment/app/d0;Landroid/view/ViewGroup;I)V

    .line 54
    invoke-static {p4}, Ln3/c;->c(Ln3/j;)V

    .line 55
    invoke-static {v9}, Ln3/c;->a(Landroidx/fragment/app/d0;)Ln3/b;

    move-result-object v0

    .line 56
    iget-object v1, v0, Ln3/b;->a:Ljava/util/Set;

    sget-object v2, Ln3/a;->d:Ln3/a;

    .line 57
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 58
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ln3/d;

    invoke-static {v0, v1, v2}, Ln3/c;->e(Ln3/b;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 59
    invoke-static {v0, p4}, Ln3/c;->b(Ln3/b;Ln3/j;)V

    .line 60
    :cond_d
    iput-object p1, v9, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    .line 61
    invoke-virtual {p3}, Landroidx/fragment/app/e1;->j()V

    .line 62
    invoke-virtual {p3}, Landroidx/fragment/app/e1;->i()V

    .line 63
    iget-object p1, v9, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz p1, :cond_10

    if-eqz v6, :cond_e

    .line 64
    invoke-virtual {p1, v6}, Landroid/view/View;->setId(I)V

    .line 65
    :cond_e
    iget-object p1, v9, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_f

    .line 66
    iget-object p1, v9, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {p1, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 67
    :cond_f
    iget-object p1, v9, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    new-instance p2, Landroidx/fragment/app/n0;

    invoke-direct {p2, p0, p3}, Landroidx/fragment/app/n0;-><init>(Landroidx/fragment/app/o0;Landroidx/fragment/app/e1;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 68
    iget-object p1, v9, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    return-object p1

    .line 69
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p3, " did not create a view."

    .line 70
    invoke-static {v5, p2, p3}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 71
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 72
    :cond_11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Duplicate id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", tag "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", or parent id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " with another fragment for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    :cond_12
    :goto_5
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/o0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
