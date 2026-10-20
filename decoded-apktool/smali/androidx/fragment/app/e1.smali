.class public final Landroidx/fragment/app/e1;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroidx/fragment/app/x;

.field public final b:Landroidx/fragment/app/f1;

.field public final c:Landroidx/fragment/app/d0;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Landroidx/fragment/app/x;Landroidx/fragment/app/f1;Landroidx/fragment/app/d0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/e1;->d:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/e1;->e:I

    iput-object p1, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    iput-object p2, p0, Landroidx/fragment/app/e1;->b:Landroidx/fragment/app/f1;

    iput-object p3, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/x;Landroidx/fragment/app/f1;Landroidx/fragment/app/d0;Landroidx/fragment/app/d1;)V
    .locals 2

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/e1;->d:Z

    const/4 v1, -0x1

    iput v1, p0, Landroidx/fragment/app/e1;->e:I

    iput-object p1, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    iput-object p2, p0, Landroidx/fragment/app/e1;->b:Landroidx/fragment/app/f1;

    iput-object p3, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    const/4 p1, 0x0

    .line 27
    iput-object p1, p3, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    .line 28
    iput-object p1, p3, Landroidx/fragment/app/d0;->mSavedViewRegistryState:Landroid/os/Bundle;

    .line 29
    iput v0, p3, Landroidx/fragment/app/d0;->mBackStackNesting:I

    .line 30
    iput-boolean v0, p3, Landroidx/fragment/app/d0;->mInLayout:Z

    .line 31
    iput-boolean v0, p3, Landroidx/fragment/app/d0;->mAdded:Z

    .line 32
    iget-object p2, p3, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    .line 33
    iput-object p1, p3, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    .line 34
    iget-object p1, p4, Landroidx/fragment/app/d1;->t:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 35
    iput-object p1, p3, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    goto :goto_1

    .line 36
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p3, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    :goto_1
    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/x;Landroidx/fragment/app/f1;Ljava/lang/ClassLoader;Landroidx/fragment/app/s0;Landroidx/fragment/app/d1;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/e1;->d:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/e1;->e:I

    iput-object p1, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    iput-object p2, p0, Landroidx/fragment/app/e1;->b:Landroidx/fragment/app/f1;

    .line 3
    iget-object p1, p4, Landroidx/fragment/app/s0;->a:Landroidx/fragment/app/x0;

    .line 4
    iget-object p1, p1, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    .line 5
    iget-object p1, p1, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    const/4 p2, 0x0

    .line 6
    iget-object p4, p5, Landroidx/fragment/app/d1;->a:Ljava/lang/String;

    invoke-static {p1, p4, p2}, Landroidx/fragment/app/d0;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/d0;

    move-result-object p1

    .line 7
    iget-object p2, p5, Landroidx/fragment/app/d1;->q:Landroid/os/Bundle;

    if-eqz p2, :cond_0

    .line 8
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    :cond_0
    invoke-virtual {p1, p2}, Landroidx/fragment/app/d0;->setArguments(Landroid/os/Bundle;)V

    .line 10
    iget-object p2, p5, Landroidx/fragment/app/d1;->b:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    .line 11
    iget-boolean p2, p5, Landroidx/fragment/app/d1;->c:Z

    iput-boolean p2, p1, Landroidx/fragment/app/d0;->mFromLayout:Z

    const/4 p2, 0x1

    .line 12
    iput-boolean p2, p1, Landroidx/fragment/app/d0;->mRestored:Z

    .line 13
    iget p2, p5, Landroidx/fragment/app/d1;->d:I

    iput p2, p1, Landroidx/fragment/app/d0;->mFragmentId:I

    .line 14
    iget p2, p5, Landroidx/fragment/app/d1;->e:I

    iput p2, p1, Landroidx/fragment/app/d0;->mContainerId:I

    .line 15
    iget-object p2, p5, Landroidx/fragment/app/d1;->f:Ljava/lang/String;

    iput-object p2, p1, Landroidx/fragment/app/d0;->mTag:Ljava/lang/String;

    .line 16
    iget-boolean p2, p5, Landroidx/fragment/app/d1;->n:Z

    iput-boolean p2, p1, Landroidx/fragment/app/d0;->mRetainInstance:Z

    .line 17
    iget-boolean p2, p5, Landroidx/fragment/app/d1;->o:Z

    iput-boolean p2, p1, Landroidx/fragment/app/d0;->mRemoving:Z

    .line 18
    iget-boolean p2, p5, Landroidx/fragment/app/d1;->p:Z

    iput-boolean p2, p1, Landroidx/fragment/app/d0;->mDetached:Z

    .line 19
    iget-boolean p2, p5, Landroidx/fragment/app/d1;->r:Z

    iput-boolean p2, p1, Landroidx/fragment/app/d0;->mHidden:Z

    .line 20
    invoke-static {}, Landroidx/lifecycle/q;->values()[Landroidx/lifecycle/q;

    move-result-object p2

    iget p3, p5, Landroidx/fragment/app/d1;->s:I

    aget-object p2, p2, p3

    iput-object p2, p1, Landroidx/fragment/app/d0;->mMaxState:Landroidx/lifecycle/q;

    .line 21
    iget-object p2, p5, Landroidx/fragment/app/d1;->t:Landroid/os/Bundle;

    if-eqz p2, :cond_1

    .line 22
    iput-object p2, p1, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    goto :goto_0

    .line 23
    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iput-object p2, p1, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    const/4 p2, 0x2

    const-string p3, "FragmentManager"

    .line 24
    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 25
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Instantiated fragment "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p3, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget-object v0, p0, Landroidx/fragment/app/e1;->b:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-object v2, v1, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    const/4 v3, -0x1

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/f1;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v4

    add-int/lit8 v5, v4, -0x1

    :goto_0
    if-ltz v5, :cond_2

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/d0;

    iget-object v7, v6, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-ne v7, v2, :cond_1

    iget-object v6, v6, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v6, :cond_1

    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/d0;

    iget-object v6, v5, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-ne v6, v2, :cond_3

    iget-object v5, v5, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v5, :cond_3

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v3

    goto :goto_2

    :cond_3
    goto :goto_1

    :cond_4
    :goto_2
    iget-object v0, v1, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    iget-object v1, v1, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final b()V
    .locals 7

    const/4 v0, 0x3

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v2, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "moveto ATTACHED: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, v2, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    const/4 v1, 0x0

    const-string v3, " that does not belong to this FragmentManager!"

    const-string v4, " declared target fragment "

    const-string v5, "Fragment "

    iget-object v6, p0, Landroidx/fragment/app/e1;->b:Landroidx/fragment/app/f1;

    if-eqz v0, :cond_2

    iget-object v0, v0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iget-object v6, v6, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/e1;

    if-eqz v0, :cond_1

    iget-object v3, v2, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    iget-object v3, v3, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iput-object v3, v2, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    iput-object v1, v2, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    move-object v1, v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v2, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v1, v6, Landroidx/fragment/app/f1;->b:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroidx/fragment/app/e1;

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    invoke-static {v1, v2, v3}, La7/a;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroidx/fragment/app/e1;->j()V

    :cond_5
    iget-object v0, v2, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    iget-object v1, v0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    iput-object v1, v2, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->v:Landroidx/fragment/app/d0;

    iput-object v0, v2, Landroidx/fragment/app/d0;->mParentFragment:Landroidx/fragment/app/d0;

    iget-object v0, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->g(Z)V

    invoke-virtual {v2}, Landroidx/fragment/app/d0;->performAttach()V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->b(Z)V

    return-void
.end method

.method public final c()I
    .locals 12

    iget-object v0, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-object v1, v0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-nez v1, :cond_0

    iget v0, v0, Landroidx/fragment/app/d0;->mState:I

    return v0

    :cond_0
    iget v1, p0, Landroidx/fragment/app/e1;->e:I

    iget-object v2, v0, Landroidx/fragment/app/d0;->mMaxState:Landroidx/lifecycle/q;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x5

    const/4 v8, -0x1

    const/4 v9, 0x4

    if-eq v2, v3, :cond_3

    if-eq v2, v4, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v9, :cond_4

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_3
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_4
    :goto_0
    iget-boolean v2, v0, Landroidx/fragment/app/d0;->mFromLayout:Z

    if-eqz v2, :cond_7

    iget-boolean v2, v0, Landroidx/fragment/app/d0;->mInLayout:Z

    if-eqz v2, :cond_5

    iget v1, p0, Landroidx/fragment/app/e1;->e:I

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v2, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_7

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_5
    iget v2, p0, Landroidx/fragment/app/e1;->e:I

    if-ge v2, v9, :cond_6

    iget v2, v0, Landroidx/fragment/app/d0;->mState:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_6
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_7
    :goto_1
    iget-boolean v2, v0, Landroidx/fragment/app/d0;->mAdded:Z

    if-nez v2, :cond_8

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_8
    iget-object v2, v0, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v10

    invoke-static {v2, v10}, Landroidx/fragment/app/t1;->g(Landroid/view/ViewGroup;Landroidx/fragment/app/x0;)Landroidx/fragment/app/t1;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v0}, Landroidx/fragment/app/t1;->d(Landroidx/fragment/app/d0;)Landroidx/fragment/app/s1;

    move-result-object v10

    if-eqz v10, :cond_9

    iget v6, v10, Landroidx/fragment/app/s1;->b:I

    :cond_9
    iget-object v2, v2, Landroidx/fragment/app/t1;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/s1;

    iget-object v11, v10, Landroidx/fragment/app/s1;->c:Landroidx/fragment/app/d0;

    invoke-virtual {v11, v0}, Landroidx/fragment/app/d0;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    iget-boolean v11, v10, Landroidx/fragment/app/s1;->f:Z

    if-nez v11, :cond_a

    goto :goto_2

    :cond_b
    const/4 v10, 0x0

    :goto_2
    if-eqz v10, :cond_d

    if-eqz v6, :cond_c

    if-ne v6, v3, :cond_d

    :cond_c
    iget v2, v10, Landroidx/fragment/app/s1;->b:I

    move v6, v2

    :cond_d
    if-ne v6, v4, :cond_e

    const/4 v2, 0x6

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    :cond_e
    if-ne v6, v5, :cond_f

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_3

    :cond_f
    iget-boolean v2, v0, Landroidx/fragment/app/d0;->mRemoving:Z

    if-eqz v2, :cond_11

    invoke-virtual {v0}, Landroidx/fragment/app/d0;->isInBackStack()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    :cond_10
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_11
    :goto_3
    iget-boolean v2, v0, Landroidx/fragment/app/d0;->mDeferStart:Z

    if-eqz v2, :cond_12

    iget v2, v0, Landroidx/fragment/app/d0;->mState:I

    if-ge v2, v7, :cond_12

    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_12
    const-string v2, "FragmentManager"

    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_13

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "computeExpectedState() of "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_13
    return v1
.end method

.method public final d()V
    .locals 4

    const/4 v0, 0x3

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v2, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "moveto CREATED: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, v2, Landroidx/fragment/app/d0;->mIsCreated:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->h(Z)V

    iget-object v3, v2, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v2, v3}, Landroidx/fragment/app/d0;->performCreate(Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->c(Z)V

    goto :goto_0

    :cond_1
    iget-object v0, v2, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v2, v0}, Landroidx/fragment/app/d0;->restoreChildFragmentState(Landroid/os/Bundle;)V

    const/4 v0, 0x1

    iput v0, v2, Landroidx/fragment/app/d0;->mState:I

    :goto_0
    return-void
.end method

.method public final e()V
    .locals 8

    iget-object v0, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-boolean v1, v0, Landroidx/fragment/app/d0;->mFromLayout:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x3

    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "moveto CREATE_VIEW: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v1, v0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/d0;->performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    iget-object v3, v0, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v3, :cond_2

    goto/16 :goto_1

    :cond_2
    iget v3, v0, Landroidx/fragment/app/d0;->mContainerId:I

    if-eqz v3, :cond_6

    const/4 v4, -0x1

    if-eq v3, v4, :cond_5

    iget-object v4, v0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    iget-object v4, v4, Landroidx/fragment/app/x0;->u:Landroidx/fragment/app/j0;

    invoke-virtual {v4, v3}, Landroidx/fragment/app/j0;->b(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    if-nez v3, :cond_4

    iget-boolean v4, v0, Landroidx/fragment/app/d0;->mRestored:Z

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/d0;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, v0, Landroidx/fragment/app/d0;->mContainerId:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v1, "unknown"

    :goto_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "No view found for id 0x"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v0, Landroidx/fragment/app/d0;->mContainerId:I

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ") for fragment "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    instance-of v4, v3, Landroidx/fragment/app/k0;

    if-nez v4, :cond_7

    sget-object v4, Ln3/c;->a:Ln3/b;

    new-instance v4, Ln3/d;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v3, v5}, Ln3/d;-><init>(Landroidx/fragment/app/d0;Landroid/view/ViewGroup;I)V

    invoke-static {v4}, Ln3/c;->c(Ln3/j;)V

    invoke-static {v0}, Ln3/c;->a(Landroidx/fragment/app/d0;)Ln3/b;

    move-result-object v5

    iget-object v6, v5, Ln3/b;->a:Ljava/util/Set;

    sget-object v7, Ln3/a;->o:Ln3/a;

    invoke-interface {v6, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    const-class v7, Ln3/d;

    invoke-static {v5, v6, v7}, Ln3/c;->e(Ln3/b;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-static {v5, v4}, Ln3/c;->b(Ln3/b;Ln3/j;)V

    goto :goto_1

    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot create fragment "

    const-string v3, " for a container view with no id"

    invoke-static {v2, v0, v3}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    const/4 v3, 0x0

    :cond_7
    :goto_1
    iput-object v3, v0, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    iget-object v4, v0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v3, v4}, Landroidx/fragment/app/d0;->performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    const/4 v4, 0x2

    if-eqz v1, :cond_c

    const/4 v5, 0x0

    invoke-virtual {v1, v5}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    const v6, 0x7f08006b

    invoke-virtual {v1, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz v3, :cond_8

    invoke-virtual {p0}, Landroidx/fragment/app/e1;->a()V

    :cond_8
    iget-boolean v1, v0, Landroidx/fragment/app/d0;->mHidden:Z

    if-eqz v1, :cond_9

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    sget-object v3, Lb3/q0;->a:Ljava/lang/reflect/Field;

    invoke-static {v1}, Lb3/e0;->b(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-static {v1}, Lb3/f0;->c(Landroid/view/View;)V

    goto :goto_2

    :cond_a
    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    new-instance v3, Landroidx/fragment/app/n0;

    invoke-direct {v3, p0, v1}, Landroidx/fragment/app/n0;-><init>(Landroidx/fragment/app/e1;Landroid/view/View;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_2
    invoke-virtual {v0}, Landroidx/fragment/app/d0;->performViewCreated()V

    iget-object v1, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    invoke-virtual {v1, v5}, Landroidx/fragment/app/x;->m(Z)V

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    iget-object v3, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    move-result v3

    invoke-virtual {v0, v3}, Landroidx/fragment/app/d0;->setPostOnViewCreatedAlpha(F)V

    iget-object v3, v0, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v3, :cond_c

    if-nez v1, :cond_c

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v0, v1}, Landroidx/fragment/app/d0;->setFocusedView(Landroid/view/View;)V

    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_b

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "requestFocus: Saved focused view "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for Fragment "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_c
    iput v4, v0, Landroidx/fragment/app/d0;->mState:I

    return-void
.end method

.method public final f()V
    .locals 8

    const/4 v0, 0x3

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v2, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "movefrom CREATED: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, v2, Landroidx/fragment/app/d0;->mRemoving:Z

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Landroidx/fragment/app/d0;->isInBackStack()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget-object v4, p0, Landroidx/fragment/app/e1;->b:Landroidx/fragment/app/f1;

    if-eqz v0, :cond_2

    iget-boolean v5, v2, Landroidx/fragment/app/d0;->mBeingSaved:Z

    if-nez v5, :cond_2

    iget-object v5, v2, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iget-object v6, v4, Landroidx/fragment/app/f1;->c:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/d1;

    :cond_2
    if-nez v0, :cond_6

    iget-object v5, v4, Landroidx/fragment/app/f1;->d:Landroidx/fragment/app/b1;

    iget-object v6, v5, Landroidx/fragment/app/b1;->a:Ljava/util/HashMap;

    iget-object v7, v2, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean v6, v5, Landroidx/fragment/app/b1;->d:Z

    if-eqz v6, :cond_6

    iget-boolean v5, v5, Landroidx/fragment/app/b1;->e:Z

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, v2, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {v4, v0}, Landroidx/fragment/app/f1;->b(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-boolean v3, v0, Landroidx/fragment/app/d0;->mRetainInstance:Z

    if-eqz v3, :cond_5

    iput-object v0, v2, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    :cond_5
    iput v1, v2, Landroidx/fragment/app/d0;->mState:I

    goto :goto_4

    :cond_6
    :goto_1
    iget-object v5, v2, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    instance-of v6, v5, Landroidx/lifecycle/g1;

    if-eqz v6, :cond_7

    iget-object v3, v4, Landroidx/fragment/app/f1;->d:Landroidx/fragment/app/b1;

    iget-boolean v3, v3, Landroidx/fragment/app/b1;->e:Z

    goto :goto_2

    :cond_7
    iget-object v5, v5, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    instance-of v6, v5, Landroid/app/Activity;

    if-eqz v6, :cond_8

    check-cast v5, Landroid/app/Activity;

    invoke-virtual {v5}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v5

    xor-int/2addr v3, v5

    :cond_8
    :goto_2
    if-eqz v0, :cond_9

    iget-boolean v0, v2, Landroidx/fragment/app/d0;->mBeingSaved:Z

    if-eqz v0, :cond_a

    :cond_9
    if-eqz v3, :cond_b

    :cond_a
    iget-object v0, v4, Landroidx/fragment/app/f1;->d:Landroidx/fragment/app/b1;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/b1;->c(Landroidx/fragment/app/d0;)V

    :cond_b
    invoke-virtual {v2}, Landroidx/fragment/app/d0;->performDestroy()V

    iget-object v0, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->d(Z)V

    invoke-virtual {v4}, Landroidx/fragment/app/f1;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/e1;

    if-eqz v1, :cond_c

    iget-object v3, v2, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iget-object v1, v1, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-object v5, v1, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    iput-object v2, v1, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    const/4 v3, 0x0

    iput-object v3, v1, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    goto :goto_3

    :cond_d
    iget-object v0, v2, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    if-eqz v0, :cond_e

    invoke-virtual {v4, v0}, Landroidx/fragment/app/f1;->b(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object v0

    iput-object v0, v2, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    :cond_e
    invoke-virtual {v4, p0}, Landroidx/fragment/app/f1;->h(Landroidx/fragment/app/e1;)V

    :goto_4
    return-void
.end method

.method public final g()V
    .locals 4

    const/4 v0, 0x3

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v2, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "movefrom CREATE_VIEW: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, v2, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    iget-object v1, v2, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v2}, Landroidx/fragment/app/d0;->performDestroyView()V

    iget-object v0, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x;->n(Z)V

    const/4 v0, 0x0

    iput-object v0, v2, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    iput-object v0, v2, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    iput-object v0, v2, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    iget-object v3, v2, Landroidx/fragment/app/d0;->mViewLifecycleOwnerLiveData:Landroidx/lifecycle/e0;

    invoke-virtual {v3, v0}, Landroidx/lifecycle/e0;->d(Ljava/lang/Object;)V

    iput-boolean v1, v2, Landroidx/fragment/app/d0;->mInLayout:Z

    return-void
.end method

.method public final h()V
    .locals 6

    const-string v0, "FragmentManager"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    iget-object v3, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "movefrom ATTACHED: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {v3}, Landroidx/fragment/app/d0;->performDetach()V

    iget-object v2, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroidx/fragment/app/x;->e(Z)V

    const/4 v2, -0x1

    iput v2, v3, Landroidx/fragment/app/d0;->mState:I

    const/4 v2, 0x0

    iput-object v2, v3, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    iput-object v2, v3, Landroidx/fragment/app/d0;->mParentFragment:Landroidx/fragment/app/d0;

    iput-object v2, v3, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    iget-boolean v2, v3, Landroidx/fragment/app/d0;->mRemoving:Z

    if-eqz v2, :cond_1

    invoke-virtual {v3}, Landroidx/fragment/app/d0;->isInBackStack()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Landroidx/fragment/app/e1;->b:Landroidx/fragment/app/f1;

    iget-object v2, v2, Landroidx/fragment/app/f1;->d:Landroidx/fragment/app/b1;

    iget-object v4, v2, Landroidx/fragment/app/b1;->a:Ljava/util/HashMap;

    iget-object v5, v3, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v4, v2, Landroidx/fragment/app/b1;->d:Z

    if-eqz v4, :cond_3

    iget-boolean v2, v2, Landroidx/fragment/app/b1;->e:Z

    if-eqz v2, :cond_5

    :cond_3
    :goto_0
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "initState called for fragment: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    invoke-virtual {v3}, Landroidx/fragment/app/d0;->initState()V

    :cond_5
    return-void
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-boolean v1, v0, Landroidx/fragment/app/d0;->mFromLayout:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Landroidx/fragment/app/d0;->mInLayout:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Landroidx/fragment/app/d0;->mPerformedCreateView:Z

    if-nez v1, :cond_2

    const/4 v1, 0x3

    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "moveto CREATE_VIEW: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/d0;->performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, v0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/fragment/app/d0;->performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    const v3, 0x7f08006b

    invoke-virtual {v1, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-boolean v1, v0, Landroidx/fragment/app/d0;->mHidden:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/d0;->performViewCreated()V

    iget-object v1, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    invoke-virtual {v1, v2}, Landroidx/fragment/app/x;->m(Z)V

    const/4 v1, 0x2

    iput v1, v0, Landroidx/fragment/app/d0;->mState:I

    :cond_2
    return-void
.end method

.method public final j()V
    .locals 10

    iget-boolean v0, p0, Landroidx/fragment/app/e1;->d:Z

    const/4 v1, 0x2

    const-string v2, "FragmentManager"

    iget-object v3, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_1

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ignoring re-entrant call to moveToExpectedState() for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x1

    const/4 v4, 0x0

    :try_start_0
    iput-boolean v0, p0, Landroidx/fragment/app/e1;->d:Z

    move v5, v4

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/e1;->c()I

    move-result v6

    iget v7, v3, Landroidx/fragment/app/d0;->mState:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v8, 0x3

    iget-object v9, p0, Landroidx/fragment/app/e1;->b:Landroidx/fragment/app/f1;

    if-eq v6, v7, :cond_f

    iget-object v5, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    if-le v6, v7, :cond_6

    add-int/lit8 v7, v7, 0x1

    packed-switch v7, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    :try_start_1
    invoke-virtual {p0}, Landroidx/fragment/app/e1;->l()V

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :pswitch_1
    const/4 v5, 0x6

    iput v5, v3, Landroidx/fragment/app/d0;->mState:I

    goto/16 :goto_2

    :pswitch_2
    invoke-static {v2, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "moveto STARTED: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    invoke-virtual {v3}, Landroidx/fragment/app/d0;->performStart()V

    invoke-virtual {v5, v4}, Landroidx/fragment/app/x;->k(Z)V

    goto/16 :goto_2

    :pswitch_3
    iget-object v5, v3, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v5, :cond_4

    iget-object v5, v3, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v5, :cond_4

    invoke-virtual {v3}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/fragment/app/t1;->g(Landroid/view/ViewGroup;Landroidx/fragment/app/x0;)Landroidx/fragment/app/t1;

    move-result-object v5

    iget-object v6, v3, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v6

    invoke-static {v6}, La7/a;->c(I)I

    move-result v6

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "SpecialEffectsController: Enqueuing add operation for fragment "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    invoke-virtual {v5, v6, v1, p0}, Landroidx/fragment/app/t1;->a(IILandroidx/fragment/app/e1;)V

    :cond_4
    const/4 v5, 0x4

    iput v5, v3, Landroidx/fragment/app/d0;->mState:I

    goto/16 :goto_2

    :pswitch_4
    invoke-static {v2, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "moveto ACTIVITY_CREATED: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    iget-object v6, v3, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {v3, v6}, Landroidx/fragment/app/d0;->performActivityCreated(Landroid/os/Bundle;)V

    invoke-virtual {v5, v4}, Landroidx/fragment/app/x;->a(Z)V

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/e1;->i()V

    invoke-virtual {p0}, Landroidx/fragment/app/e1;->e()V

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/e1;->d()V

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/e1;->b()V

    goto/16 :goto_2

    :cond_6
    add-int/lit8 v7, v7, -0x1

    packed-switch v7, :pswitch_data_1

    goto/16 :goto_2

    :pswitch_8
    invoke-static {v2, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_7

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "movefrom RESUMED: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    invoke-virtual {v3}, Landroidx/fragment/app/d0;->performPause()V

    invoke-virtual {v5, v4}, Landroidx/fragment/app/x;->f(Z)V

    goto/16 :goto_2

    :pswitch_9
    const/4 v5, 0x5

    iput v5, v3, Landroidx/fragment/app/d0;->mState:I

    goto/16 :goto_2

    :pswitch_a
    invoke-static {v2, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_8

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "movefrom STARTED: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    invoke-virtual {v3}, Landroidx/fragment/app/d0;->performStop()V

    invoke-virtual {v5, v4}, Landroidx/fragment/app/x;->l(Z)V

    goto/16 :goto_2

    :pswitch_b
    invoke-static {v2, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_9

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "movefrom ACTIVITY_CREATED: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    iget-boolean v5, v3, Landroidx/fragment/app/d0;->mBeingSaved:Z

    if-eqz v5, :cond_a

    invoke-virtual {p0}, Landroidx/fragment/app/e1;->m()V

    goto :goto_1

    :cond_a
    iget-object v5, v3, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v5, :cond_b

    iget-object v5, v3, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    if-nez v5, :cond_b

    invoke-virtual {p0}, Landroidx/fragment/app/e1;->n()V

    :cond_b
    :goto_1
    iget-object v5, v3, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v5, :cond_d

    iget-object v5, v3, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v5, :cond_d

    invoke-virtual {v3}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/fragment/app/t1;->g(Landroid/view/ViewGroup;Landroidx/fragment/app/x0;)Landroidx/fragment/app/t1;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_c

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "SpecialEffectsController: Enqueuing remove operation for fragment "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    invoke-virtual {v5, v0, v8, p0}, Landroidx/fragment/app/t1;->a(IILandroidx/fragment/app/e1;)V

    :cond_d
    iput v8, v3, Landroidx/fragment/app/d0;->mState:I

    goto :goto_2

    :pswitch_c
    iput-boolean v4, v3, Landroidx/fragment/app/d0;->mInLayout:Z

    iput v1, v3, Landroidx/fragment/app/d0;->mState:I

    goto :goto_2

    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/e1;->g()V

    iput v0, v3, Landroidx/fragment/app/d0;->mState:I

    goto :goto_2

    :pswitch_e
    iget-boolean v5, v3, Landroidx/fragment/app/d0;->mBeingSaved:Z

    if-eqz v5, :cond_e

    iget-object v5, v3, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iget-object v6, v9, Landroidx/fragment/app/f1;->c:Ljava/util/HashMap;

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/d1;

    if-nez v5, :cond_e

    invoke-virtual {p0}, Landroidx/fragment/app/e1;->m()V

    :cond_e
    invoke-virtual {p0}, Landroidx/fragment/app/e1;->f()V

    goto :goto_2

    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/e1;->h()V

    :goto_2
    move v5, v0

    goto/16 :goto_0

    :cond_f
    if-nez v5, :cond_12

    const/4 v5, -0x1

    if-ne v7, v5, :cond_12

    iget-boolean v5, v3, Landroidx/fragment/app/d0;->mRemoving:Z

    if-eqz v5, :cond_12

    invoke-virtual {v3}, Landroidx/fragment/app/d0;->isInBackStack()Z

    move-result v5

    if-nez v5, :cond_12

    iget-boolean v5, v3, Landroidx/fragment/app/d0;->mBeingSaved:Z

    if-nez v5, :cond_12

    invoke-static {v2, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_10

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Cleaning up state of never attached fragment: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_10
    iget-object v5, v9, Landroidx/fragment/app/f1;->d:Landroidx/fragment/app/b1;

    invoke-virtual {v5, v3}, Landroidx/fragment/app/b1;->c(Landroidx/fragment/app/d0;)V

    invoke-virtual {v9, p0}, Landroidx/fragment/app/f1;->h(Landroidx/fragment/app/e1;)V

    invoke-static {v2, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_11

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "initState called for fragment: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_11
    invoke-virtual {v3}, Landroidx/fragment/app/d0;->initState()V

    :cond_12
    iget-boolean v5, v3, Landroidx/fragment/app/d0;->mHiddenChanged:Z

    if-eqz v5, :cond_18

    iget-object v5, v3, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v5, :cond_16

    iget-object v5, v3, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v5, :cond_16

    invoke-virtual {v3}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/fragment/app/t1;->g(Landroid/view/ViewGroup;Landroidx/fragment/app/x0;)Landroidx/fragment/app/t1;

    move-result-object v5

    iget-boolean v6, v3, Landroidx/fragment/app/d0;->mHidden:Z

    if-eqz v6, :cond_14

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_13

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "SpecialEffectsController: Enqueuing hide operation for fragment "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_13
    invoke-virtual {v5, v8, v0, p0}, Landroidx/fragment/app/t1;->a(IILandroidx/fragment/app/e1;)V

    goto :goto_3

    :cond_14
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_15

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "SpecialEffectsController: Enqueuing show operation for fragment "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_15
    invoke-virtual {v5, v1, v0, p0}, Landroidx/fragment/app/t1;->a(IILandroidx/fragment/app/e1;)V

    :cond_16
    :goto_3
    iget-object v1, v3, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v1, :cond_17

    iget-boolean v2, v3, Landroidx/fragment/app/d0;->mAdded:Z

    if-eqz v2, :cond_17

    invoke-static {v3}, Landroidx/fragment/app/x0;->C(Landroidx/fragment/app/d0;)Z

    move-result v2

    if-eqz v2, :cond_17

    iput-boolean v0, v1, Landroidx/fragment/app/x0;->D:Z

    :cond_17
    iput-boolean v4, v3, Landroidx/fragment/app/d0;->mHiddenChanged:Z

    iget-boolean v0, v3, Landroidx/fragment/app/d0;->mHidden:Z

    invoke-virtual {v3, v0}, Landroidx/fragment/app/d0;->onHiddenChanged(Z)V

    iget-object v0, v3, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_18
    iput-boolean v4, p0, Landroidx/fragment/app/e1;->d:Z

    return-void

    :goto_4
    iput-boolean v4, p0, Landroidx/fragment/app/e1;->d:Z

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final k(Ljava/lang/ClassLoader;)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-object v1, v0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object p1, v0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v1, "android:view_state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    iget-object p1, v0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v1, "android:view_registry_state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/d0;->mSavedViewRegistryState:Landroid/os/Bundle;

    iget-object p1, v0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v1, "android:target_state"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    iget-object p1, v0, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object p1, v0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v1, "android:target_req_state"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, v0, Landroidx/fragment/app/d0;->mTargetRequestCode:I

    :cond_1
    iget-object p1, v0, Landroidx/fragment/app/d0;->mSavedUserVisibleHint:Ljava/lang/Boolean;

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Landroidx/fragment/app/d0;->mUserVisibleHint:Z

    const/4 p1, 0x0

    iput-object p1, v0, Landroidx/fragment/app/d0;->mSavedUserVisibleHint:Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    iget-object p1, v0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    const-string v2, "android:user_visible_hint"

    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, v0, Landroidx/fragment/app/d0;->mUserVisibleHint:Z

    :goto_0
    iget-boolean p1, v0, Landroidx/fragment/app/d0;->mUserVisibleHint:Z

    if-nez p1, :cond_3

    iput-boolean v1, v0, Landroidx/fragment/app/d0;->mDeferStart:Z

    :cond_3
    return-void
.end method

.method public final l()V
    .locals 6

    const/4 v0, 0x3

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    iget-object v2, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "moveto RESUMED: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {v2}, Landroidx/fragment/app/d0;->getFocusedView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v3, v2, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_4

    iget-object v4, v2, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-ne v3, v4, :cond_3

    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v3

    const/4 v4, 0x2

    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "requestFocus: Restoring focused view "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v3, :cond_2

    const-string v0, "succeeded"

    goto :goto_2

    :cond_2
    const-string v0, "failed"

    :goto_2
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " on Fragment "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " resulting in focused view "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v2, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_3
    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    goto :goto_0

    :cond_4
    :goto_3
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroidx/fragment/app/d0;->setFocusedView(Landroid/view/View;)V

    invoke-virtual {v2}, Landroidx/fragment/app/d0;->performResume()V

    iget-object v1, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroidx/fragment/app/x;->i(Z)V

    iput-object v0, v2, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    iput-object v0, v2, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    iput-object v0, v2, Landroidx/fragment/app/d0;->mSavedViewRegistryState:Landroid/os/Bundle;

    return-void
.end method

.method public final m()V
    .locals 5

    new-instance v0, Landroidx/fragment/app/d1;

    iget-object v1, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    invoke-direct {v0, v1}, Landroidx/fragment/app/d1;-><init>(Landroidx/fragment/app/d0;)V

    iget v2, v1, Landroidx/fragment/app/d0;->mState:I

    const/4 v3, -0x1

    if-le v2, v3, :cond_9

    iget-object v2, v0, Landroidx/fragment/app/d1;->t:Landroid/os/Bundle;

    if-nez v2, :cond_9

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v2}, Landroidx/fragment/app/d0;->performSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v3, p0, Landroidx/fragment/app/e1;->a:Landroidx/fragment/app/x;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroidx/fragment/app/x;->j(Z)V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x0

    :cond_0
    iget-object v3, v1, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/e1;->n()V

    :cond_1
    iget-object v3, v1, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    if-eqz v3, :cond_3

    if-nez v2, :cond_2

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_2
    const-string v3, "android:view_state"

    iget-object v4, v1, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_3
    iget-object v3, v1, Landroidx/fragment/app/d0;->mSavedViewRegistryState:Landroid/os/Bundle;

    if-eqz v3, :cond_5

    if-nez v2, :cond_4

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_4
    const-string v3, "android:view_registry_state"

    iget-object v4, v1, Landroidx/fragment/app/d0;->mSavedViewRegistryState:Landroid/os/Bundle;

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_5
    iget-boolean v3, v1, Landroidx/fragment/app/d0;->mUserVisibleHint:Z

    if-nez v3, :cond_7

    if-nez v2, :cond_6

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    :cond_6
    const-string v3, "android:user_visible_hint"

    iget-boolean v4, v1, Landroidx/fragment/app/d0;->mUserVisibleHint:Z

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_7
    iput-object v2, v0, Landroidx/fragment/app/d1;->t:Landroid/os/Bundle;

    iget-object v3, v1, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    if-eqz v3, :cond_a

    if-nez v2, :cond_8

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v0, Landroidx/fragment/app/d1;->t:Landroid/os/Bundle;

    :cond_8
    iget-object v2, v0, Landroidx/fragment/app/d1;->t:Landroid/os/Bundle;

    const-string v3, "android:target_state"

    iget-object v4, v1, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget v2, v1, Landroidx/fragment/app/d0;->mTargetRequestCode:I

    if-eqz v2, :cond_a

    iget-object v3, v0, Landroidx/fragment/app/d1;->t:Landroid/os/Bundle;

    const-string v4, "android:target_req_state"

    invoke-virtual {v3, v4, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_9
    iget-object v2, v1, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    iput-object v2, v0, Landroidx/fragment/app/d1;->t:Landroid/os/Bundle;

    :cond_a
    :goto_0
    iget-object v1, v1, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iget-object v2, p0, Landroidx/fragment/app/e1;->b:Landroidx/fragment/app/f1;

    iget-object v2, v2, Landroidx/fragment/app/f1;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/d1;

    return-void
.end method

.method public final n()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-object v1, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-nez v1, :cond_0

    return-void

    :cond_0
    const-string v1, "FragmentManager"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Saving view state for fragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " with view "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    iget-object v2, v0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-lez v2, :cond_2

    iput-object v1, v0, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    :cond_2
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    iget-object v2, v2, Landroidx/fragment/app/p1;->d:Lb4/f;

    invoke-virtual {v2, v1}, Lb4/f;->c(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    iput-object v1, v0, Landroidx/fragment/app/d0;->mSavedViewRegistryState:Landroid/os/Bundle;

    :cond_3
    return-void
.end method
