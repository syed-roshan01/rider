.class public abstract Landroidx/fragment/app/d0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements Landroidx/lifecycle/w;
.implements Landroidx/lifecycle/g1;
.implements Landroidx/lifecycle/l;
.implements Lb4/g;


# static fields
.field static final ACTIVITY_CREATED:I = 0x4

.field static final ATTACHED:I = 0x0

.field static final AWAITING_ENTER_EFFECTS:I = 0x6

.field static final AWAITING_EXIT_EFFECTS:I = 0x3

.field static final CREATED:I = 0x1

.field static final INITIALIZING:I = -0x1

.field static final RESUMED:I = 0x7

.field static final STARTED:I = 0x5

.field static final USE_DEFAULT_TRANSITION:Ljava/lang/Object;

.field static final VIEW_CREATED:I = 0x2


# instance fields
.field mAdded:Z

.field mAnimationInfo:Landroidx/fragment/app/z;

.field mArguments:Landroid/os/Bundle;

.field mBackStackNesting:I

.field mBeingSaved:Z

.field private mCalled:Z

.field mChildFragmentManager:Landroidx/fragment/app/x0;

.field mContainer:Landroid/view/ViewGroup;

.field mContainerId:I

.field private mContentLayoutId:I

.field mDefaultFactory:Landroidx/lifecycle/b1;

.field mDeferStart:Z

.field mDetached:Z

.field mFragmentId:I

.field mFragmentManager:Landroidx/fragment/app/x0;

.field mFromLayout:Z

.field mHasMenu:Z

.field mHidden:Z

.field mHiddenChanged:Z

.field mHost:Landroidx/fragment/app/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/fragment/app/m0;"
        }
    .end annotation
.end field

.field mInLayout:Z

.field mIsCreated:Z

.field private mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

.field mLayoutInflater:Landroid/view/LayoutInflater;

.field mLifecycleRegistry:Landroidx/lifecycle/y;

.field mMaxState:Landroidx/lifecycle/q;

.field mMenuVisible:Z

.field private final mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final mOnPreAttachedListeners:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/b0;",
            ">;"
        }
    .end annotation
.end field

.field mParentFragment:Landroidx/fragment/app/d0;

.field mPerformedCreateView:Z

.field mPostponedDurationRunnable:Ljava/lang/Runnable;

.field public mPreviousWho:Ljava/lang/String;

.field mRemoving:Z

.field mRestored:Z

.field mRetainInstance:Z

.field mRetainInstanceChangedWhileDetached:Z

.field mSavedFragmentState:Landroid/os/Bundle;

.field private final mSavedStateAttachListener:Landroidx/fragment/app/b0;

.field mSavedStateRegistryController:Lb4/f;

.field mSavedUserVisibleHint:Ljava/lang/Boolean;

.field mSavedViewRegistryState:Landroid/os/Bundle;

.field mSavedViewState:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation
.end field

.field mState:I

.field mTag:Ljava/lang/String;

.field mTarget:Landroidx/fragment/app/d0;

.field mTargetRequestCode:I

.field mTargetWho:Ljava/lang/String;

.field mUserVisibleHint:Z

.field mView:Landroid/view/View;

.field mViewLifecycleOwner:Landroidx/fragment/app/p1;

.field mViewLifecycleOwnerLiveData:Landroidx/lifecycle/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/e0;"
        }
    .end annotation
.end field

.field mWho:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/fragment/app/d0;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/d0;->mState:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/d0;->mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

    new-instance v0, Landroidx/fragment/app/y0;

    invoke-direct {v0}, Landroidx/fragment/app/x0;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mMenuVisible:Z

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mUserVisibleHint:Z

    new-instance v0, Landroidx/fragment/app/s;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/s;-><init>(Landroidx/fragment/app/d0;I)V

    iput-object v0, p0, Landroidx/fragment/app/d0;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    sget-object v0, Landroidx/lifecycle/q;->e:Landroidx/lifecycle/q;

    iput-object v0, p0, Landroidx/fragment/app/d0;->mMaxState:Landroidx/lifecycle/q;

    new-instance v0, Landroidx/lifecycle/e0;

    invoke-direct {v0}, Landroidx/lifecycle/c0;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwnerLiveData:Landroidx/lifecycle/e0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/d0;->mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/d0;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    new-instance v0, Landroidx/fragment/app/t;

    invoke-direct {v0, p0}, Landroidx/fragment/app/t;-><init>(Landroidx/fragment/app/d0;)V

    iput-object v0, p0, Landroidx/fragment/app/d0;->mSavedStateAttachListener:Landroidx/fragment/app/b0;

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->g()V

    return-void
.end method

.method public static instantiate(Landroid/content/Context;Ljava/lang/String;)Landroidx/fragment/app/d0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, p1, v0}, Landroidx/fragment/app/d0;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/d0;

    move-result-object p0

    return-object p0
.end method

.method public static instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/d0;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, ": make sure class name exists, is public, and has an empty constructor that is public"

    const-string v1, "Unable to instantiate fragment "

    .line 2
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    .line 3
    invoke-static {p0, p1}, Landroidx/fragment/app/s0;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    .line 4
    invoke-virtual {p0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/fragment/app/d0;

    if-eqz p2, :cond_0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 6
    invoke-virtual {p0, p2}, Landroidx/fragment/app/d0;->setArguments(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_2

    :catch_2
    move-exception p0

    goto :goto_3

    :catch_3
    move-exception p0

    goto :goto_4

    :cond_0
    :goto_0
    return-object p0

    .line 7
    :goto_1
    new-instance p2, Landroidx/fragment/app/a0;

    const-string v0, ": calling Fragment constructor caused an exception"

    .line 8
    invoke-static {v1, p1, v0}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 9
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    throw p2

    .line 11
    :goto_2
    new-instance p2, Landroidx/fragment/app/a0;

    const-string v0, ": could not find Fragment constructor"

    .line 12
    invoke-static {v1, p1, v0}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 13
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    throw p2

    .line 15
    :goto_3
    new-instance p2, Landroidx/fragment/app/a0;

    .line 16
    invoke-static {v1, p1, v0}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    throw p2

    .line 19
    :goto_4
    new-instance p2, Landroidx/fragment/app/a0;

    .line 20
    invoke-static {v1, p1, v0}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 21
    invoke-direct {p2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    throw p2
.end method


# virtual methods
.method public synthetic c()Landroid/app/Activity;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getActivity()Landroidx/fragment/app/g0;

    move-result-object v0

    return-object v0
.end method

.method public callStartTransitionListener(Z)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/z;->s:Z

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v1, :cond_2

    invoke-static {v0, v1}, Landroidx/fragment/app/t1;->g(Landroid/view/ViewGroup;Landroidx/fragment/app/x0;)Landroidx/fragment/app/t1;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/t1;->h()V

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    iget-object p1, p1, Landroidx/fragment/app/m0;->c:Landroid/os/Handler;

    new-instance v1, Landroidx/fragment/app/j;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0, v0}, Landroidx/fragment/app/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/t1;->c()V

    :cond_2
    :goto_0
    return-void
.end method

.method public createFragmentContainer()Landroidx/fragment/app/j0;
    .locals 1

    new-instance v0, Landroidx/fragment/app/u;

    invoke-direct {v0, p0}, Landroidx/fragment/app/u;-><init>(Landroidx/fragment/app/d0;)V

    return-object v0
.end method

.method public final d()Landroidx/fragment/app/z;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/fragment/app/z;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/fragment/app/z;->i:Ljava/lang/Object;

    sget-object v2, Landroidx/fragment/app/d0;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/fragment/app/z;->j:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/z;->k:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/fragment/app/z;->l:Ljava/lang/Object;

    iput-object v1, v0, Landroidx/fragment/app/z;->m:Ljava/lang/Object;

    iput-object v2, v0, Landroidx/fragment/app/z;->n:Ljava/lang/Object;

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Landroidx/fragment/app/z;->q:F

    iput-object v1, v0, Landroidx/fragment/app/z;->r:Landroid/view/View;

    iput-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    return-object v0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/d0;->mFragmentId:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mContainerId=#"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/d0;->mContainerId:I

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mTag="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mTag:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/d0;->mState:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(I)V

    const-string v0, " mWho="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " mBackStackNesting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/d0;->mBackStackNesting:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAdded="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mAdded:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mRemoving="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mRemoving:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mFromLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mFromLayout:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mInLayout="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mInLayout:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHidden="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHidden:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mDetached="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mDetached:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mMenuVisible="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mMenuVisible:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mHasMenu="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHasMenu:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mRetainInstance="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mRetainInstance:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Z)V

    const-string v0, " mUserVisibleHint="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mUserVisibleHint:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mFragmentManager="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_1

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mHost="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/d0;->mParentFragment:Landroidx/fragment/app/d0;

    if-eqz v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mParentFragment="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mParentFragment:Landroidx/fragment/app/d0;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/d0;->mArguments:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mArguments="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mArguments:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedFragmentState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    if-eqz v0, :cond_5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedViewRegistryState:Landroid/os/Bundle;

    if-eqz v0, :cond_6

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mSavedViewRegistryState="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedViewRegistryState:Landroid/os/Bundle;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/d0;->f(Z)Landroidx/fragment/app/d0;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mTarget="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v0, " mTargetRequestCode="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v0, p0, Landroidx/fragment/app/d0;->mTargetRequestCode:I

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_7
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mPopDirection="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getPopDirection()Z

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getEnterAnim()I

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getEnterAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_8
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getExitAnim()I

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getExitAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_9
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getPopEnterAnim()I

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopEnterAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getPopEnterAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_a
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getPopExitAnim()I

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "getPopExitAnim="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getPopExitAnim()I

    move-result v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(I)V

    :cond_b
    iget-object v0, p0, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    if-eqz v0, :cond_c

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mContainer="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v0, :cond_d

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mView="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_d
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getAnimatingAway()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mAnimatingAway="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getAnimatingAway()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_e
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-static {p0}, Lr3/a;->a(Landroidx/lifecycle/w;)Lr3/c;

    move-result-object v0

    invoke-virtual {v0, p1, p3}, Lr3/c;->b(Ljava/lang/String;Ljava/io/PrintWriter;)V

    :cond_f
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Child "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    const-string v1, "  "

    invoke-static {p1, v1}, Ll/q;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/x0;->q(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public final e()I
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mMaxState:Landroidx/lifecycle/q;

    sget-object v1, Landroidx/lifecycle/q;->b:Landroidx/lifecycle/q;

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/d0;->mParentFragment:Landroidx/fragment/app/d0;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/d0;->mParentFragment:Landroidx/fragment/app/d0;

    invoke-virtual {v1}, Landroidx/fragment/app/d0;->e()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(Z)Landroidx/fragment/app/d0;
    .locals 3

    if-eqz p1, :cond_0

    sget-object p1, Ln3/c;->a:Ln3/b;

    new-instance p1, Ln3/f;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Ln3/f;-><init>(Landroidx/fragment/app/d0;I)V

    invoke-static {p1}, Ln3/c;->c(Ln3/j;)V

    invoke-static {p0}, Ln3/c;->a(Landroidx/fragment/app/d0;)Ln3/b;

    move-result-object v0

    iget-object v1, v0, Ln3/b;->a:Ljava/util/Set;

    sget-object v2, Ln3/a;->n:Ln3/a;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ln3/f;

    invoke-static {v0, v1, v2}, Ln3/c;->e(Ln3/b;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0, p1}, Ln3/c;->b(Ln3/b;Ln3/j;)V

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    iget-object p1, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz p1, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object p1, p1, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/f1;->b(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public findFragmentByWho(Ljava/lang/String;)Landroidx/fragment/app/d0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/f1;->c(Ljava/lang/String;)Landroidx/fragment/app/d0;

    move-result-object p1

    return-object p1
.end method

.method public final g()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/y;

    invoke-direct {v0, p0}, Landroidx/lifecycle/y;-><init>(Landroidx/lifecycle/w;)V

    iput-object v0, p0, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    invoke-static {p0}, Lx9/v;->l(Lb4/g;)Lb4/f;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/d0;->mSavedStateRegistryController:Lb4/f;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/d0;->mDefaultFactory:Landroidx/lifecycle/b1;

    iget-object v0, p0, Landroidx/fragment/app/d0;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    iget-object v1, p0, Landroidx/fragment/app/d0;->mSavedStateAttachListener:Landroidx/fragment/app/b0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedStateAttachListener:Landroidx/fragment/app/b0;

    iget v1, p0, Landroidx/fragment/app/d0;->mState:I

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/b0;->a()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/d0;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public generateActivityResultKey()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "fragment_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_rq#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/d0;->mNextLocalRequestCode:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getActivity()Landroidx/fragment/app/g0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/m0;->a:Landroid/app/Activity;

    check-cast v0, Landroidx/fragment/app/g0;

    :goto_0
    return-object v0
.end method

.method public getAllowEnterTransitionOverlap()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/z;->p:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public getAllowReturnTransitionOverlap()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/z;->o:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public getAnimatingAway()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public final getArguments()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mArguments:Landroid/os/Bundle;

    return-object v0
.end method

.method public final getChildFragmentManager()Landroidx/fragment/app/x0;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " has not been attached yet."

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    :goto_0
    return-object v0
.end method

.method public getDefaultViewModelCreationExtras()Lq3/c;
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    const/4 v1, 0x3

    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Could not find Application instance from Context "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    new-instance v1, Lq3/d;

    invoke-direct {v1}, Lq3/d;-><init>()V

    iget-object v2, v1, Lq3/c;->a:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_3

    sget-object v3, Landroidx/lifecycle/z0;->a:Landroidx/lifecycle/z0;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v0, Landroidx/lifecycle/s0;->a:Landroidx/lifecycle/z0;

    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Landroidx/lifecycle/s0;->b:Landroidx/lifecycle/z0;

    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v0, Landroidx/lifecycle/s0;->c:Landroidx/lifecycle/z0;

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v1
.end method

.method public getDefaultViewModelProviderFactory()Landroidx/lifecycle/b1;
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroidx/fragment/app/d0;->mDefaultFactory:Landroidx/lifecycle/b1;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    const-string v1, "FragmentManager"

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not find Application instance from Context "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    new-instance v1, Landroidx/lifecycle/v0;

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v1, v0, p0, v2}, Landroidx/lifecycle/v0;-><init>(Landroid/app/Application;Lb4/g;Landroid/os/Bundle;)V

    iput-object v1, p0, Landroidx/fragment/app/d0;->mDefaultFactory:Landroidx/lifecycle/b1;

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/d0;->mDefaultFactory:Landroidx/lifecycle/b1;

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getEnterAnim()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/z;->b:I

    return v0
.end method

.method public getEnterTransition()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/z;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public getEnterTransitionCallback()Lq2/r0;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public getExitAnim()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/z;->c:I

    return v0
.end method

.method public getExitTransition()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/z;->k:Ljava/lang/Object;

    return-object v0
.end method

.method public getExitTransitionCallback()Lq2/r0;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v1
.end method

.method public getFocusedView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/z;->r:Landroid/view/View;

    return-object v0
.end method

.method public final getFragmentManager()Landroidx/fragment/app/x0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    return-object v0
.end method

.method public final getHost()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    check-cast v0, Landroidx/fragment/app/f0;

    iget-object v0, v0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    :goto_0
    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Landroidx/fragment/app/d0;->mFragmentId:I

    return v0
.end method

.method public final getLayoutInflater()Landroid/view/LayoutInflater;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mLayoutInflater:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/d0;->performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p1, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-eqz p1, :cond_0

    check-cast p1, Landroidx/fragment/app/f0;

    .line 1
    iget-object p1, p1, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    .line 2
    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    .line 3
    iget-object v0, v0, Landroidx/fragment/app/x0;->f:Landroidx/fragment/app/o0;

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getLifecycle()Landroidx/lifecycle/r;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    return-object v0
.end method

.method public getLoaderManager()Lr3/a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lr3/a;->a(Landroidx/lifecycle/w;)Lr3/c;

    move-result-object v0

    return-object v0
.end method

.method public getNextTransition()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/z;->f:I

    return v0
.end method

.method public final getParentFragment()Landroidx/fragment/app/d0;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mParentFragment:Landroidx/fragment/app/d0;

    return-object v0
.end method

.method public final getParentFragmentManager()Landroidx/fragment/app/x0;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not associated with a fragment manager."

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getPopDirection()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, v0, Landroidx/fragment/app/z;->a:Z

    return v0
.end method

.method public getPopEnterAnim()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/z;->d:I

    return v0
.end method

.method public getPopExitAnim()I
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/z;->e:I

    return v0
.end method

.method public getPostOnViewCreatedAlpha()F
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    :cond_0
    iget v0, v0, Landroidx/fragment/app/z;->q:F

    return v0
.end method

.method public getReenterTransition()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/z;->l:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/d0;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getExitTransition()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public final getRetainInstance()Z
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Ln3/c;->a:Ln3/b;

    new-instance v0, Ln3/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln3/e;-><init>(Landroidx/fragment/app/d0;I)V

    invoke-static {v0}, Ln3/c;->c(Ln3/j;)V

    invoke-static {p0}, Ln3/c;->a(Landroidx/fragment/app/d0;)Ln3/b;

    move-result-object v1

    iget-object v2, v1, Ln3/b;->a:Ljava/util/Set;

    sget-object v3, Ln3/a;->e:Ln3/a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ln3/e;

    invoke-static {v1, v2, v3}, Ln3/c;->e(Ln3/b;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1, v0}, Ln3/c;->b(Ln3/b;Ln3/j;)V

    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mRetainInstance:Z

    return v0
.end method

.method public getReturnTransition()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/z;->j:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/d0;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getEnterTransition()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final getSavedStateRegistry()Lb4/e;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedStateRegistryController:Lb4/f;

    iget-object v0, v0, Lb4/f;->b:Lb4/e;

    return-object v0
.end method

.method public getSharedElementEnterTransition()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/z;->m:Ljava/lang/Object;

    return-object v0
.end method

.method public getSharedElementReturnTransition()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/z;->n:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/d0;->USE_DEFAULT_TRANSITION:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getSharedElementEnterTransition()Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getSharedElementSourceNames()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/z;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public getSharedElementTargetNames()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/z;->h:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public final getString(I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final varargs getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mTag:Ljava/lang/String;

    return-object v0
.end method

.method public final getTargetFragment()Landroidx/fragment/app/d0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/fragment/app/d0;->f(Z)Landroidx/fragment/app/d0;

    move-result-object v0

    return-object v0
.end method

.method public final getTargetRequestCode()I
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Ln3/c;->a:Ln3/b;

    new-instance v0, Ln3/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln3/f;-><init>(Landroidx/fragment/app/d0;I)V

    invoke-static {v0}, Ln3/c;->c(Ln3/j;)V

    invoke-static {p0}, Ln3/c;->a(Landroidx/fragment/app/d0;)Ln3/b;

    move-result-object v1

    iget-object v2, v1, Ln3/b;->a:Ljava/util/Set;

    sget-object v3, Ln3/a;->n:Ln3/a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ln3/f;

    invoke-static {v1, v2, v3}, Ln3/c;->e(Ln3/b;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1, v0}, Ln3/c;->b(Ln3/b;Ln3/j;)V

    :cond_0
    iget v0, p0, Landroidx/fragment/app/d0;->mTargetRequestCode:I

    return v0
.end method

.method public final getText(I)Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public getUserVisibleHint()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mUserVisibleHint:Z

    return v0
.end method

.method public getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    return-object v0
.end method

.method public getViewLifecycleOwner()Landroidx/lifecycle/w;
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access the Fragment View\'s LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getViewLifecycleOwnerLiveData()Landroidx/lifecycle/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/c0;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwnerLiveData:Landroidx/lifecycle/e0;

    return-object v0
.end method

.method public getViewModelStore()Landroidx/lifecycle/f1;
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->e()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iget-object v0, v0, Landroidx/fragment/app/b1;->c:Ljava/util/HashMap;

    iget-object v1, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/f1;

    if-nez v1, :cond_0

    new-instance v1, Landroidx/lifecycle/f1;

    invoke-direct {v1}, Landroidx/lifecycle/f1;-><init>()V

    iget-object v2, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(Le/b;Lo/a;Ld/c;)Ld/f;
    .locals 8

    iget v0, p0, Landroidx/fragment/app/d0;->mState:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    new-instance v1, Landroidx/fragment/app/y;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p2

    move-object v5, v0

    move-object v6, p1

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Landroidx/fragment/app/y;-><init>(Landroidx/fragment/app/d0;Lo/a;Ljava/util/concurrent/atomic/AtomicReference;Le/b;Ld/c;)V

    iget p2, p0, Landroidx/fragment/app/d0;->mState:I

    if-ltz p2, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/y;->a()V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroidx/fragment/app/d0;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    new-instance p2, Ld/f;

    const/4 p3, 0x2

    invoke-direct {p2, p0, v0, p1, p3}, Ld/f;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Le/b;I)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string p3, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."

    invoke-static {p2, p0, p3}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hasOptionsMenu()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHasMenu:Z

    return v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public initState()V
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->g()V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iput-object v0, p0, Landroidx/fragment/app/d0;->mPreviousWho:Ljava/lang/String;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mAdded:Z

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mRemoving:Z

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mFromLayout:Z

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mInLayout:Z

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mRestored:Z

    iput v0, p0, Landroidx/fragment/app/d0;->mBackStackNesting:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    new-instance v2, Landroidx/fragment/app/y0;

    invoke-direct {v2}, Landroidx/fragment/app/x0;-><init>()V

    iput-object v2, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iput-object v1, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    iput v0, p0, Landroidx/fragment/app/d0;->mFragmentId:I

    iput v0, p0, Landroidx/fragment/app/d0;->mContainerId:I

    iput-object v1, p0, Landroidx/fragment/app/d0;->mTag:Ljava/lang/String;

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mHidden:Z

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mDetached:Z

    return-void
.end method

.method public final isAdded()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mAdded:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isDetached()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mDetached:Z

    return v0
.end method

.method public final isHidden()Z
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHidden:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/d0;->mParentFragment:Landroidx/fragment/app/d0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroidx/fragment/app/d0;->isHidden()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x1

    :goto_2
    return v0
.end method

.method public final isInBackStack()Z
    .locals 1

    iget v0, p0, Landroidx/fragment/app/d0;->mBackStackNesting:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isInLayout()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mInLayout:Z

    return v0
.end method

.method public final isMenuVisible()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mMenuVisible:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mParentFragment:Landroidx/fragment/app/d0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/d0;->isMenuVisible()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public isPostponed()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-boolean v0, v0, Landroidx/fragment/app/z;->s:Z

    return v0
.end method

.method public final isRemoving()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mRemoving:Z

    return v0
.end method

.method public final isResumed()Z
    .locals 2

    iget v0, p0, Landroidx/fragment/app/d0;->mState:I

    const/4 v1, 0x7

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final isStateSaved()Z
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v2, v0, Landroidx/fragment/app/x0;->E:Z

    if-nez v2, :cond_1

    iget-boolean v0, v0, Landroidx/fragment/app/x0;->F:Z

    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final isVisible()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->isHidden()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public noteStateNotSaved()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->F()V

    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " received the following in onActivityResult(): requestCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " resultCode: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " data: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    iget-object p1, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p1, Landroidx/fragment/app/m0;->a:Landroid/app/Activity;

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    .line 3
    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onAttach(Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method public onAttachFragment(Landroidx/fragment/app/d0;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->restoreChildFragmentState(Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iget v1, p1, Landroidx/fragment/app/x0;->s:I

    if-lt v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p1, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v1, p1, Landroidx/fragment/app/x0;->F:Z

    iget-object v2, p1, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v1, v2, Landroidx/fragment/app/b1;->f:Z

    invoke-virtual {p1, v0}, Landroidx/fragment/app/x0;->p(I)V

    :goto_0
    return-void
.end method

.method public onCreateAnimation(IZI)Landroid/view/animation/Animation;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreateAnimator(IZI)Landroid/animation/Animator;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->requireActivity()Landroidx/fragment/app/g0;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    iget p3, p0, Landroidx/fragment/app/d0;->mContentLayoutId:I

    if-eqz p3, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onDestroyOptionsMenu()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onDestroyView()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onDetach()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->getLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1
.end method

.method public onHiddenChanged(Z)V
    .locals 0

    return-void
.end method

.method public onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onInflate(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    iget-object p1, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p1, Landroidx/fragment/app/m0;->a:Landroid/app/Activity;

    :goto_0
    if-eqz p1, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/d0;->onInflate(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    :cond_1
    return-void
.end method

.method public onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 0

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public onOptionsMenuClosed(Landroid/view/Menu;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onPause()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 0

    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onPrimaryNavigationFragmentChanged(Z)V
    .locals 0

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onResume()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onStop()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onViewStateRestored(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    return-void
.end method

.method public performActivityCreated(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->F()V

    const/4 v0, 0x3

    iput v0, p0, Landroidx/fragment/app/d0;->mState:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onActivityCreated(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz p1, :cond_2

    const-string p1, "FragmentManager"

    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "moveto RESTORE_VIEW_STATE: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->restoreViewState(Landroid/os/Bundle;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    iget-object p1, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iput-boolean v1, p1, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v1, p1, Landroidx/fragment/app/x0;->F:Z

    iget-object v0, p1, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v1, v0, Landroidx/fragment/app/b1;->f:Z

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroidx/fragment/app/x0;->p(I)V

    return-void

    :cond_2
    new-instance p1, Landroidx/fragment/app/u1;

    const-string v0, "Fragment "

    const-string v1, " did not call through to super.onActivityCreated()"

    invoke-static {v0, p0, v1}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public performAttach()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/b0;

    invoke-virtual {v1}, Landroidx/fragment/app/b0;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mOnPreAttachedListeners:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iget-object v1, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->createFragmentContainer()Landroidx/fragment/app/j0;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p0}, Landroidx/fragment/app/x0;->b(Landroidx/fragment/app/m0;Landroidx/fragment/app/j0;Landroidx/fragment/app/d0;)V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/d0;->mState:I

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    iget-object v1, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    invoke-virtual {p0, v1}, Landroidx/fragment/app/d0;->onAttach(Landroid/content/Context;)V

    iget-boolean v1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    iget-object v1, v1, Landroidx/fragment/app/x0;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/c1;

    invoke-interface {v2, p0}, Landroidx/fragment/app/c1;->a(Landroidx/fragment/app/d0;)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iput-boolean v0, v1, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v0, v1, Landroidx/fragment/app/x0;->F:Z

    iget-object v2, v1, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v0, v2, Landroidx/fragment/app/b1;->f:Z

    invoke-virtual {v1, v0}, Landroidx/fragment/app/x0;->p(I)V

    return-void

    :cond_2
    new-instance v0, Landroidx/fragment/app/u1;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onAttach()"

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroidx/fragment/app/d0;->performConfigurationChanged(Landroid/content/res/Configuration;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public performContextItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHidden:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onContextItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/x0;->h(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public performCreate(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->F()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/d0;->mState:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    iget-object v1, p0, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    new-instance v2, Landroidx/fragment/app/v;

    invoke-direct {v2, p0}, Landroidx/fragment/app/v;-><init>(Landroidx/fragment/app/d0;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/v;)V

    iget-object v1, p0, Landroidx/fragment/app/d0;->mSavedStateRegistryController:Lb4/f;

    invoke-virtual {v1, p1}, Lb4/f;->b(Landroid/os/Bundle;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onCreate(Landroid/os/Bundle;)V

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mIsCreated:Z

    iget-boolean p1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v0, Landroidx/lifecycle/p;->ON_CREATE:Landroidx/lifecycle/p;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    return-void

    :cond_0
    new-instance p1, Landroidx/fragment/app/u1;

    const-string v0, "Fragment "

    const-string v1, " did not call through to super.onCreate()"

    invoke-static {v0, p0, v1}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public performCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHidden:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHasMenu:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mMenuVisible:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/d0;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    const/4 v1, 0x1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/x0;->i(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_1
    return v1
.end method

.method public performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->F()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mPerformedCreateView:Z

    new-instance v0, Landroidx/fragment/app/p1;

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getViewModelStore()Landroidx/lifecycle/f1;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroidx/fragment/app/p1;-><init>(Landroidx/fragment/app/d0;Landroidx/lifecycle/f1;)V

    iput-object v0, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/fragment/app/d0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    invoke-virtual {p1}, Landroidx/fragment/app/p1;->b()V

    iget-object p1, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    invoke-static {p1, p2}, Lo1/s;->i0(Landroid/view/View;Landroidx/lifecycle/w;)V

    iget-object p1, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    invoke-static {p1, p2}, Li1/b;->F(Landroid/view/View;Landroidx/lifecycle/g1;)V

    iget-object p1, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    iget-object p2, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    invoke-static {p1, p2}, Ly3/e;->C0(Landroid/view/View;Lb4/g;)V

    iget-object p1, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwnerLiveData:Landroidx/lifecycle/e0;

    iget-object p2, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/e0;->d(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    iget-object p1, p1, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public performDestroy()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->j()V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v1, Landroidx/lifecycle/p;->ON_DESTROY:Landroidx/lifecycle/p;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/d0;->mState:I

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mIsCreated:Z

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->onDestroy()V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/fragment/app/u1;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onDestroy()"

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performDestroyView()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x0;->p(I)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    invoke-virtual {v0}, Landroidx/fragment/app/p1;->b()V

    iget-object v0, v0, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    iget-object v0, v0, Landroidx/lifecycle/y;->c:Landroidx/lifecycle/q;

    sget-object v2, Landroidx/lifecycle/q;->c:Landroidx/lifecycle/q;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    sget-object v2, Landroidx/lifecycle/p;->ON_DESTROY:Landroidx/lifecycle/p;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/p1;->a(Landroidx/lifecycle/p;)V

    :cond_0
    iput v1, p0, Landroidx/fragment/app/d0;->mState:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->onDestroyView()V

    iget-boolean v1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz v1, :cond_2

    invoke-static {p0}, Lr3/a;->a(Landroidx/lifecycle/w;)Lr3/c;

    move-result-object v1

    iget-object v1, v1, Lr3/c;->b:Lr3/b;

    iget-object v1, v1, Lr3/b;->a:Lq/a0;

    iget v2, v1, Lq/a0;->c:I

    if-gtz v2, :cond_1

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mPerformedCreateView:Z

    return-void

    :cond_1
    iget-object v1, v1, Lq/a0;->b:[Ljava/lang/Object;

    aget-object v0, v1, v0

    invoke-static {v0}, La7/a;->w(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :cond_2
    new-instance v0, Landroidx/fragment/app/u1;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onDestroyView()"

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performDetach()V
    .locals 3

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/d0;->mState:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->onDetach()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/d0;->mLayoutInflater:Landroid/view/LayoutInflater;

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iget-boolean v1, v0, Landroidx/fragment/app/x0;->G:Z

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->j()V

    new-instance v0, Landroidx/fragment/app/y0;

    invoke-direct {v0}, Landroidx/fragment/app/x0;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    :cond_0
    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/u1;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onDetach()"

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/d0;->mLayoutInflater:Landroid/view/LayoutInflater;

    return-object p1
.end method

.method public performLowMemory()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->onLowMemory()V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/d0;->performLowMemory()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public performMultiWindowModeChanged(Z)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onMultiWindowModeChanged(Z)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroidx/fragment/app/d0;->performMultiWindowModeChanged(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public performOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHidden:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHasMenu:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mMenuVisible:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/x0;->l(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public performOptionsMenuClosed(Landroid/view/Menu;)V
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHidden:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHasMenu:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mMenuVisible:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onOptionsMenuClosed(Landroid/view/Menu;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/x0;->m(Landroid/view/Menu;)V

    :cond_1
    return-void
.end method

.method public performPause()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x0;->p(I)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    sget-object v1, Landroidx/lifecycle/p;->ON_PAUSE:Landroidx/lifecycle/p;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/p1;->a(Landroidx/lifecycle/p;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v1, Landroidx/lifecycle/p;->ON_PAUSE:Landroidx/lifecycle/p;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    const/4 v0, 0x6

    iput v0, p0, Landroidx/fragment/app/d0;->mState:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->onPause()V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/u1;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onPause()"

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performPictureInPictureModeChanged(Z)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onPictureInPictureModeChanged(Z)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iget-object v0, v0, Landroidx/fragment/app/x0;->c:Landroidx/fragment/app/f1;

    invoke-virtual {v0}, Landroidx/fragment/app/f1;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/d0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroidx/fragment/app/d0;->performPictureInPictureModeChanged(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public performPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHidden:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHasMenu:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mMenuVisible:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onPrepareOptionsMenu(Landroid/view/Menu;)V

    const/4 v1, 0x1

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/x0;->o(Landroid/view/Menu;)Z

    move-result p1

    or-int/2addr v1, p1

    :cond_1
    return v1
.end method

.method public performPrimaryNavigationFragmentChanged()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Landroidx/fragment/app/x0;->D(Landroidx/fragment/app/d0;)Z

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/d0;->mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, p0, Landroidx/fragment/app/d0;->mIsPrimaryNavigationFragment:Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/d0;->onPrimaryNavigationFragmentChanged(Z)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->S()V

    iget-object v1, v0, Landroidx/fragment/app/x0;->w:Landroidx/fragment/app/d0;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x0;->n(Landroidx/fragment/app/d0;)V

    :cond_1
    return-void
.end method

.method public performResume()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->F()V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x0;->t(Z)Z

    const/4 v0, 0x7

    iput v0, p0, Landroidx/fragment/app/d0;->mState:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->onResume()V

    iget-boolean v2, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v3, Landroidx/lifecycle/p;->ON_RESUME:Landroidx/lifecycle/p;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    iget-object v2, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    iget-object v2, v2, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iput-boolean v1, v2, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v1, v2, Landroidx/fragment/app/x0;->F:Z

    iget-object v3, v2, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v1, v3, Landroidx/fragment/app/b1;->f:Z

    invoke-virtual {v2, v0}, Landroidx/fragment/app/x0;->p(I)V

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/u1;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onResume()"

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedStateRegistryController:Lb4/f;

    invoke-virtual {v0, p1}, Lb4/f;->c(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->L()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method public performStart()V
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0}, Landroidx/fragment/app/x0;->F()V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x0;->t(Z)Z

    const/4 v0, 0x5

    iput v0, p0, Landroidx/fragment/app/d0;->mState:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->onStart()V

    iget-boolean v2, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v3, Landroidx/lifecycle/p;->ON_START:Landroidx/lifecycle/p;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    iget-object v2, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    iget-object v2, v2, Landroidx/fragment/app/p1;->c:Landroidx/lifecycle/y;

    invoke-virtual {v2, v3}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    :cond_0
    iget-object v2, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    iput-boolean v1, v2, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v1, v2, Landroidx/fragment/app/x0;->F:Z

    iget-object v3, v2, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v1, v3, Landroidx/fragment/app/b1;->f:Z

    invoke-virtual {v2, v0}, Landroidx/fragment/app/x0;->p(I)V

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/u1;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onStart()"

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performStop()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/fragment/app/x0;->F:Z

    iget-object v2, v0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v1, v2, Landroidx/fragment/app/b1;->f:Z

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x0;->p(I)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    sget-object v2, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/p1;->a(Landroidx/lifecycle/p;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mLifecycleRegistry:Landroidx/lifecycle/y;

    sget-object v2, Landroidx/lifecycle/p;->ON_STOP:Landroidx/lifecycle/p;

    invoke-virtual {v0, v2}, Landroidx/lifecycle/y;->f(Landroidx/lifecycle/p;)V

    iput v1, p0, Landroidx/fragment/app/d0;->mState:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->onStop()V

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Landroidx/fragment/app/u1;

    const-string v1, "Fragment "

    const-string v2, " did not call through to super.onStop()"

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public performViewCreated()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    iget-object v1, p0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/d0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/fragment/app/x0;->p(I)V

    return-void
.end method

.method public postponeEnterTransition()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/fragment/app/z;->s:Z

    return-void
.end method

.method public final postponeEnterTransition(JLjava/util/concurrent/TimeUnit;)V
    .locals 2

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/fragment/app/z;->s:Z

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, v0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    .line 4
    iget-object v0, v0, Landroidx/fragment/app/m0;->c:Landroid/os/Handler;

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/d0;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Landroidx/fragment/app/d0;->mPostponedDurationRunnable:Ljava/lang/Runnable;

    .line 7
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final registerForActivityResult(Le/b;Ld/c;)Ld/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b;",
            "Ld/c;",
            ")",
            "Ld/d;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/fragment/app/w;

    invoke-direct {v0, p0}, Landroidx/fragment/app/w;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v0, p2}, Landroidx/fragment/app/d0;->h(Le/b;Lo/a;Ld/c;)Ld/f;

    move-result-object p1

    return-object p1
.end method

.method public final registerForActivityResult(Le/b;Ld/i;Ld/c;)Ld/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Le/b;",
            "Ld/i;",
            "Ld/c;",
            ")",
            "Ld/d;"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/fragment/app/x;

    invoke-direct {v0, p0, p2}, Landroidx/fragment/app/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v0, p3}, Landroidx/fragment/app/d0;->h(Le/b;Lo/a;Ld/c;)Ld/f;

    move-result-object p1

    return-object p1
.end method

.method public registerForContextMenu(Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    return-void
.end method

.method public final requestPermissions([Ljava/lang/String;I)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    iget-object v1, v0, Landroidx/fragment/app/x0;->B:Ld/f;

    if-eqz v1, :cond_0

    new-instance v1, Landroidx/fragment/app/u0;

    iget-object v2, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-direct {v1, v2, p2}, Landroidx/fragment/app/u0;-><init>(Ljava/lang/String;I)V

    iget-object p2, v0, Landroidx/fragment/app/x0;->C:Ljava/util/ArrayDeque;

    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget-object p2, v0, Landroidx/fragment/app/x0;->B:Ld/f;

    invoke-virtual {p2, p1}, Ld/f;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, v0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string v0, " not attached to Activity"

    invoke-static {p2, p0, v0}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final requireActivity()Landroidx/fragment/app/g0;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getActivity()Landroidx/fragment/app/g0;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not attached to an activity."

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireArguments()Landroid/os/Bundle;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " does not have any arguments."

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireContext()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not attached to a context."

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireFragmentManager()Landroidx/fragment/app/x0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    return-object v0
.end method

.method public final requireHost()Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getHost()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " not attached to a host."

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final requireParentFragment()Landroidx/fragment/app/d0;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getParentFragment()Landroidx/fragment/app/d0;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Fragment "

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, " is not attached to any Fragment or host"

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not a child Fragment, it is directly attached to "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-object v0
.end method

.method public final requireView()Landroid/view/View;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment "

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-static {v1, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public restoreChildFragmentState(Landroid/os/Bundle;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/x0;->K(Landroid/os/Parcelable;)V

    iget-object p1, p0, Landroidx/fragment/app/d0;->mChildFragmentManager:Landroidx/fragment/app/x0;

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/x0;->E:Z

    iput-boolean v0, p1, Landroidx/fragment/app/x0;->F:Z

    iget-object v1, p1, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    iput-boolean v0, v1, Landroidx/fragment/app/b1;->f:Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/fragment/app/x0;->p(I)V

    :cond_0
    return-void
.end method

.method public final restoreViewState(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    iput-object v1, p0, Landroidx/fragment/app/d0;->mSavedViewState:Landroid/util/SparseArray;

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    iget-object v2, p0, Landroidx/fragment/app/d0;->mSavedViewRegistryState:Landroid/os/Bundle;

    iget-object v0, v0, Landroidx/fragment/app/p1;->d:Lb4/f;

    invoke-virtual {v0, v2}, Lb4/f;->b(Landroid/os/Bundle;)V

    iput-object v1, p0, Landroidx/fragment/app/d0;->mSavedViewRegistryState:Landroid/os/Bundle;

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/d0;->mCalled:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/d0;->onViewStateRestored(Landroid/os/Bundle;)V

    iget-boolean p1, p0, Landroidx/fragment/app/d0;->mCalled:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Landroidx/fragment/app/d0;->mView:Landroid/view/View;

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/fragment/app/d0;->mViewLifecycleOwner:Landroidx/fragment/app/p1;

    sget-object v0, Landroidx/lifecycle/p;->ON_CREATE:Landroidx/lifecycle/p;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/p1;->a(Landroidx/lifecycle/p;)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Landroidx/fragment/app/u1;

    const-string v0, "Fragment "

    const-string v1, " did not call through to super.onViewStateRestored()"

    invoke-static {v0, p0, v1}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAllowEnterTransitionOverlap(Z)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/z;->p:Ljava/lang/Boolean;

    return-void
.end method

.method public setAllowReturnTransitionOverlap(Z)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Landroidx/fragment/app/z;->o:Ljava/lang/Boolean;

    return-void
.end method

.method public setAnimations(IIII)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/z;->b:I

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object p1

    iput p2, p1, Landroidx/fragment/app/z;->c:I

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object p1

    iput p3, p1, Landroidx/fragment/app/z;->d:I

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object p1

    iput p4, p1, Landroidx/fragment/app/z;->e:I

    return-void
.end method

.method public setArguments(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->isStateSaved()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/d0;->mArguments:Landroid/os/Bundle;

    return-void
.end method

.method public setEnterSharedElementCallback(Lq2/r0;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public setEnterTransition(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/z;->i:Ljava/lang/Object;

    return-void
.end method

.method public setExitSharedElementCallback(Lq2/r0;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public setExitTransition(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/z;->k:Ljava/lang/Object;

    return-void
.end method

.method public setFocusedView(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/z;->r:Landroid/view/View;

    return-void
.end method

.method public setHasOptionsMenu(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mHasMenu:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mHasMenu:Z

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->isHidden()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    check-cast p1, Landroidx/fragment/app/f0;

    iget-object p1, p1, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    :cond_0
    return-void
.end method

.method public setInitialSavedState(Landroidx/fragment/app/c0;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroidx/fragment/app/c0;->a:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setMenuVisibility(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mMenuVisible:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mMenuVisible:Z

    iget-boolean p1, p0, Landroidx/fragment/app/d0;->mHasMenu:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->isAdded()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->isHidden()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    check-cast p1, Landroidx/fragment/app/f0;

    iget-object p1, p1, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    :cond_0
    return-void
.end method

.method public setNextTransition(I)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    iput p1, v0, Landroidx/fragment/app/z;->f:I

    return-void
.end method

.method public setPopDirection(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iput-boolean p1, v0, Landroidx/fragment/app/z;->a:Z

    return-void
.end method

.method public setPostOnViewCreatedAlpha(F)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iput p1, v0, Landroidx/fragment/app/z;->q:F

    return-void
.end method

.method public setReenterTransition(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/z;->l:Ljava/lang/Object;

    return-void
.end method

.method public setRetainInstance(Z)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Ln3/c;->a:Ln3/b;

    new-instance v0, Ln3/e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ln3/e;-><init>(Landroidx/fragment/app/d0;I)V

    invoke-static {v0}, Ln3/c;->c(Ln3/j;)V

    invoke-static {p0}, Ln3/c;->a(Landroidx/fragment/app/d0;)Ln3/b;

    move-result-object v2

    iget-object v3, v2, Ln3/b;->a:Ljava/util/Set;

    sget-object v4, Ln3/a;->e:Ln3/a;

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ln3/e;

    invoke-static {v2, v3, v4}, Ln3/c;->e(Ln3/b;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2, v0}, Ln3/c;->b(Ln3/b;Ln3/j;)V

    :cond_0
    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mRetainInstance:Z

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    iget-object p1, v0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/b1;->b(Landroidx/fragment/app/d0;)V

    goto :goto_0

    :cond_1
    iget-object p1, v0, Landroidx/fragment/app/x0;->L:Landroidx/fragment/app/b1;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/b1;->e(Landroidx/fragment/app/d0;)V

    goto :goto_0

    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/d0;->mRetainInstanceChangedWhileDetached:Z

    :goto_0
    return-void
.end method

.method public setReturnTransition(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/z;->j:Ljava/lang/Object;

    return-void
.end method

.method public setSharedElementEnterTransition(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/z;->m:Ljava/lang/Object;

    return-void
.end method

.method public setSharedElementNames(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    iput-object p1, v0, Landroidx/fragment/app/z;->g:Ljava/util/ArrayList;

    iput-object p2, v0, Landroidx/fragment/app/z;->h:Ljava/util/ArrayList;

    return-void
.end method

.method public setSharedElementReturnTransition(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iput-object p1, v0, Landroidx/fragment/app/z;->n:Ljava/lang/Object;

    return-void
.end method

.method public setTargetFragment(Landroidx/fragment/app/d0;I)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    sget-object v0, Ln3/c;->a:Ln3/b;

    new-instance v0, Ln3/h;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to set target fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with request code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " for fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v2, p0, v1}, Ln3/g;-><init>(ILandroidx/fragment/app/d0;Ljava/lang/String;)V

    invoke-static {v0}, Ln3/c;->c(Ln3/j;)V

    invoke-static {p0}, Ln3/c;->a(Landroidx/fragment/app/d0;)Ln3/b;

    move-result-object v1

    iget-object v2, v1, Ln3/b;->a:Ljava/util/Set;

    sget-object v3, Ln3/a;->n:Ln3/a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ln3/h;

    invoke-static {v1, v2, v3}, Ln3/c;->e(Ln3/b;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1, v0}, Ln3/c;->b(Ln3/b;Ln3/j;)V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    iget-object v2, p1, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    if-eqz v0, :cond_3

    if-eqz v2, :cond_3

    if-ne v0, v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Fragment "

    const-string v1, " must share the same FragmentManager to be set as a target fragment"

    invoke-static {v0, p1, v1}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_1
    move-object v0, p1

    :goto_2
    if-eqz v0, :cond_5

    invoke-virtual {v0, p0}, Landroidx/fragment/app/d0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/fragment/app/d0;->f(Z)Landroidx/fragment/app/d0;

    move-result-object v0

    goto :goto_2

    :cond_4
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Setting "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " as the target of "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " would create a target cycle"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    if-nez p1, :cond_6

    iput-object v1, p0, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    iput-object v1, p0, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    goto :goto_3

    :cond_6
    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_7

    iget-object v0, p1, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_7

    iget-object p1, p1, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    iput-object p1, p0, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    iput-object v1, p0, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    goto :goto_3

    :cond_7
    iput-object v1, p0, Landroidx/fragment/app/d0;->mTargetWho:Ljava/lang/String;

    iput-object p1, p0, Landroidx/fragment/app/d0;->mTarget:Landroidx/fragment/app/d0;

    :goto_3
    iput p2, p0, Landroidx/fragment/app/d0;->mTargetRequestCode:I

    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Ln3/c;->a:Ln3/b;

    new-instance v0, Ln3/i;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to set user visible hint to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " for fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ln3/j;-><init>(Landroidx/fragment/app/d0;Ljava/lang/String;)V

    invoke-static {v0}, Ln3/c;->c(Ln3/j;)V

    invoke-static {p0}, Ln3/c;->a(Landroidx/fragment/app/d0;)Ln3/b;

    move-result-object v1

    iget-object v2, v1, Ln3/b;->a:Ljava/util/Set;

    sget-object v3, Ln3/a;->f:Ln3/a;

    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ln3/i;

    invoke-static {v1, v2, v3}, Ln3/c;->e(Ln3/b;Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1, v0}, Ln3/c;->b(Ln3/b;Ln3/j;)V

    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mUserVisibleHint:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x5

    if-nez v0, :cond_2

    if-eqz p1, :cond_2

    iget v0, p0, Landroidx/fragment/app/d0;->mState:I

    if-ge v0, v3, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Landroidx/fragment/app/d0;->mIsCreated:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mFragmentManager:Landroidx/fragment/app/x0;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/x0;->f(Landroidx/fragment/app/d0;)Landroidx/fragment/app/e1;

    move-result-object v4

    iget-object v5, v4, Landroidx/fragment/app/e1;->c:Landroidx/fragment/app/d0;

    iget-boolean v6, v5, Landroidx/fragment/app/d0;->mDeferStart:Z

    if-eqz v6, :cond_2

    iget-boolean v6, v0, Landroidx/fragment/app/x0;->b:Z

    if-eqz v6, :cond_1

    iput-boolean v2, v0, Landroidx/fragment/app/x0;->H:Z

    goto :goto_0

    :cond_1
    iput-boolean v1, v5, Landroidx/fragment/app/d0;->mDeferStart:Z

    invoke-virtual {v4}, Landroidx/fragment/app/e1;->j()V

    :cond_2
    :goto_0
    iput-boolean p1, p0, Landroidx/fragment/app/d0;->mUserVisibleHint:Z

    iget v0, p0, Landroidx/fragment/app/d0;->mState:I

    if-ge v0, v3, :cond_3

    if-nez p1, :cond_3

    move v1, v2

    :cond_3
    iput-boolean v1, p0, Landroidx/fragment/app/d0;->mDeferStart:Z

    iget-object v0, p0, Landroidx/fragment/app/d0;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/d0;->mSavedUserVisibleHint:Ljava/lang/Boolean;

    :cond_4
    return-void
.end method

.method public shouldShowRequestPermissionRationale(Ljava/lang/String;)Z
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast v0, Landroidx/fragment/app/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Lq2/h;->a:I

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-ge v2, v3, :cond_0

    const-string v3, "android.permission.POST_NOTIFICATIONS"

    invoke-static {v3, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x20

    iget-object v0, v0, Landroidx/fragment/app/f0;->e:Landroidx/fragment/app/g0;

    if-lt v2, v1, :cond_1

    invoke-static {v0, p1}, Lq2/e;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_1
    const/16 v1, 0x1f

    if-ne v2, v1, :cond_2

    invoke-static {v0, p1}, Lq2/d;->b(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v0, p1}, Lq2/c;->c(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v1

    :cond_3
    :goto_0
    return v1
.end method

.method public startActivity(Landroid/content/Intent;)V
    .locals 1

    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/d0;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_0

    .line 1
    iget-object v0, v0, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    invoke-static {v0, p1, p2}, Lr2/k;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string v0, " not attached to Activity"

    .line 3
    invoke-static {p2, p0, v0}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 4
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Landroidx/fragment/app/d0;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v0

    .line 3
    iget-object v1, v0, Landroidx/fragment/app/x0;->z:Ld/f;

    if-eqz v1, :cond_1

    .line 4
    new-instance v1, Landroidx/fragment/app/u0;

    iget-object v2, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-direct {v1, v2, p2}, Landroidx/fragment/app/u0;-><init>(Ljava/lang/String;I)V

    .line 5
    iget-object p2, v0, Landroidx/fragment/app/x0;->C:Ljava/util/ArrayDeque;

    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    const-string p2, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 6
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 7
    :cond_0
    iget-object p2, v0, Landroidx/fragment/app/x0;->z:Ld/f;

    .line 8
    invoke-virtual {p2, p1}, Ld/f;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v0, v0, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    const/4 v1, -0x1

    if-ne p2, v1, :cond_2

    .line 10
    iget-object p2, v0, Landroidx/fragment/app/m0;->b:Landroid/content/Context;

    .line 11
    invoke-static {p2, p1, p3}, Lr2/k;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    :goto_0
    return-void

    .line 12
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Starting activity with a requestCode requires a FragmentActivity host"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment "

    const-string p3, " not attached to Activity"

    .line 15
    invoke-static {p2, p0, p3}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 11
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object/from16 v8, p7

    iget-object v1, v0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    const-string v5, "Fragment "

    if-eqz v1, :cond_7

    const-string v1, "FragmentManager"

    const/4 v6, 0x2

    invoke-static {v1, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " received the following in startIntentSenderForResult() requestCode: "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, " IntentSender: "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " fillInIntent: "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v9, " options: "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/d0;->getParentFragmentManager()Landroidx/fragment/app/x0;

    move-result-object v7

    iget-object v9, v7, Landroidx/fragment/app/x0;->A:Ld/f;

    if-eqz v9, :cond_5

    if-eqz v8, :cond_3

    if-nez v4, :cond_1

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    const-string v9, "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"

    const/4 v10, 0x1

    invoke-virtual {v4, v9, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_1
    invoke-static {v1, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_2

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "ActivityOptions "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " were added to fillInIntent "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, " for fragment "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v1, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    const-string v9, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    invoke-virtual {v4, v9, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_3
    const-string v8, "intentSender"

    invoke-static {p1, v8}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ld/k;

    move v9, p4

    move/from16 v10, p5

    invoke-direct {v8, p1, v4, p4, v10}, Ld/k;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    new-instance v2, Landroidx/fragment/app/u0;

    iget-object v4, v0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-direct {v2, v4, p2}, Landroidx/fragment/app/u0;-><init>(Ljava/lang/String;I)V

    iget-object v3, v7, Landroidx/fragment/app/x0;->C:Ljava/util/ArrayDeque;

    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    invoke-static {v1, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "is launching an IntentSender for result "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object v1, v7, Landroidx/fragment/app/x0;->A:Ld/f;

    invoke-virtual {v1, v8}, Ld/f;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    move v9, p4

    move/from16 v10, p5

    iget-object v1, v7, Landroidx/fragment/app/x0;->t:Landroidx/fragment/app/m0;

    const/4 v5, -0x1

    if-ne v3, v5, :cond_6

    iget-object v1, v1, Landroidx/fragment/app/m0;->a:Landroid/app/Activity;

    sget v5, Lq2/h;->a:I

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-static/range {v1 .. v8}, Lq2/a;->c(Landroid/app/Activity;Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    :goto_0
    return-void

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Starting intent sender with a requestCode requires a FragmentActivity host"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, " not attached to Activity"

    invoke-static {v5, p0, v2}, La7/a;->m(Ljava/lang/String;Landroidx/fragment/app/d0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public startPostponedEnterTransition()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/d0;->mAnimationInfo:Landroidx/fragment/app/z;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    iget-boolean v0, v0, Landroidx/fragment/app/z;->s:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/d0;->d()Landroidx/fragment/app/z;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/fragment/app/z;->s:Z

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    iget-object v1, v1, Landroidx/fragment/app/m0;->c:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/d0;->mHost:Landroidx/fragment/app/m0;

    iget-object v0, v0, Landroidx/fragment/app/m0;->c:Landroid/os/Handler;

    new-instance v1, Landroidx/fragment/app/s;

    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/s;-><init>(Landroidx/fragment/app/d0;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v2}, Landroidx/fragment/app/d0;->callStartTransitionListener(Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/d0;->mWho:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/d0;->mFragmentId:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/fragment/app/d0;->mFragmentId:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/d0;->mTag:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/d0;->mTag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public unregisterForContextMenu(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    return-void
.end method
