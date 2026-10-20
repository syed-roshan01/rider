.class public final synthetic Lu1/i0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu1/i0;->a:I

    iput-object p2, p0, Lu1/i0;->b:Ljava/lang/Object;

    iput-object p3, p0, Lu1/i0;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget v0, p0, Lu1/i0;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Lu1/i0;->c:Ljava/lang/Object;

    iget-object v3, p0, Lu1/i0;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    check-cast v3, Lcom/google/firebase/firestore/core/FirestoreClient;

    check-cast v2, Lcom/google/firebase/firestore/auth/User;

    invoke-static {v3, v2}, Lcom/google/firebase/firestore/core/FirestoreClient;->e(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/firebase/firestore/auth/User;)V

    return-void

    :pswitch_1
    check-cast v3, Lcom/google/firebase/firestore/core/FirestoreClient;

    check-cast v2, Ljava/util/List;

    invoke-static {v3, v2}, Lcom/google/firebase/firestore/core/FirestoreClient;->i(Lcom/google/firebase/firestore/core/FirestoreClient;Ljava/util/List;)V

    return-void

    :pswitch_2
    check-cast v3, Lcom/google/firebase/firestore/core/FirestoreClient;

    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v3, v2}, Lcom/google/firebase/firestore/core/FirestoreClient;->y(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void

    :pswitch_3
    check-cast v3, Landroidx/fragment/app/g0;

    check-cast v2, Ljava/lang/Runnable;

    invoke-static {v3, v2}, Lcom/google/firebase/firestore/core/ActivityScope;->b(Landroidx/fragment/app/g0;Ljava/lang/Runnable;)V

    return-void

    :pswitch_4
    check-cast v3, Landroid/app/Activity;

    check-cast v2, Ljava/lang/Runnable;

    invoke-static {v3, v2}, Lcom/google/firebase/firestore/core/ActivityScope;->a(Landroid/app/Activity;Ljava/lang/Runnable;)V

    return-void

    :pswitch_5
    check-cast v3, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    check-cast v2, Landroid/app/job/JobParameters;

    sget v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;->a:I

    invoke-virtual {v3, v2, v1}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    return-void

    :pswitch_6
    check-cast v3, Landroidx/profileinstaller/ProfileInstallerInitializer;

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Ly3/h;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_0
    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    const/16 v4, 0x3e8

    const/4 v5, 0x1

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    new-instance v4, Ly3/f;

    invoke-direct {v4, v2, v1}, Ly3/f;-><init>(Landroid/content/Context;I)V

    add-int/lit16 v3, v3, 0x1388

    int-to-long v1, v3

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_7
    check-cast v3, Ljava/lang/String;

    check-cast v2, Ln3/j;

    sget-object v0, Ln3/c;->a:Ln3/b;

    const-string v0, "$violation"

    invoke-static {v2, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Policy violation with PENALTY_DEATH in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentStrictMode"

    invoke-static {v1, v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    throw v2

    :pswitch_8
    check-cast v3, Lt2/b;

    check-cast v2, Landroid/graphics/Typeface;

    invoke-virtual {v3, v2}, Lt2/b;->e(Landroid/graphics/Typeface;)V

    return-void

    :pswitch_9
    check-cast v3, Lu1/p0;

    check-cast v2, Landroid/util/LongSparseArray;

    invoke-static {v3, v2}, Lu1/j0;->a(Lu1/p0;Landroid/util/LongSparseArray;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
