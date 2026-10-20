.class public final Lcom/google/android/gms/common/api/internal/v0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/common/api/internal/v0;->a:I

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/android/gms/common/api/internal/v0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, Lcom/google/android/gms/common/api/internal/v0;->a:I

    const-string v1, "GoogleApiManager"

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/internal/o0;

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/v0;->b:Ljava/lang/Object;

    check-cast v2, Ln6/h;

    sget-object v4, Lcom/google/android/gms/common/api/internal/o0;->h:Lw5/b;

    iget-object v4, v2, Ln6/h;->b:Lz5/b;

    iget v5, v4, Lz5/b;->b:I

    if-nez v5, :cond_5

    iget-object v2, v2, Ln6/h;->c:Lcom/google/android/gms/common/internal/a0;

    invoke-static {v2}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v4, v2, Lcom/google/android/gms/common/internal/a0;->c:Lz5/b;

    iget v5, v4, Lz5/b;->b:I

    if-nez v5, :cond_4

    iget-object v4, v0, Lcom/google/android/gms/common/api/internal/o0;->g:Lcom/google/android/gms/common/api/internal/f0;

    iget-object v2, v2, Lcom/google/android/gms/common/internal/a0;->b:Landroid/os/IBinder;

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    sget v3, Lcom/google/android/gms/common/internal/a;->a:I

    const-string v3, "com.google.android.gms.common.internal.IAccountAccessor"

    invoke-interface {v2, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v5

    instance-of v6, v5, Lcom/google/android/gms/common/internal/m;

    if-eqz v6, :cond_1

    check-cast v5, Lcom/google/android/gms/common/internal/m;

    :goto_0
    move-object v3, v5

    goto :goto_1

    :cond_1
    new-instance v5, Lcom/google/android/gms/common/internal/s0;

    invoke-direct {v5, v2, v3}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v3, :cond_3

    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/o0;->d:Ljava/util/Set;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    iput-object v3, v4, Lcom/google/android/gms/common/api/internal/f0;->c:Lcom/google/android/gms/common/internal/m;

    iput-object v2, v4, Lcom/google/android/gms/common/api/internal/f0;->d:Ljava/util/Set;

    iget-boolean v1, v4, Lcom/google/android/gms/common/api/internal/f0;->e:Z

    if-eqz v1, :cond_6

    iget-object v1, v4, Lcom/google/android/gms/common/api/internal/f0;->a:Lcom/google/android/gms/common/api/d;

    invoke-interface {v1, v3, v2}, Lcom/google/android/gms/common/api/d;->getRemoteService(Lcom/google/android/gms/common/internal/m;Ljava/util/Set;)V

    goto :goto_3

    :cond_3
    :goto_2
    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    const-string v3, "Received null response from onSignInSuccess"

    invoke-static {v1, v3, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    new-instance v1, Lz5/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lz5/b;-><init>(I)V

    invoke-virtual {v4, v1}, Lcom/google/android/gms/common/api/internal/f0;->a(Lz5/b;)V

    goto :goto_3

    :cond_4
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    const-string v3, "Sign-in succeeded with resolve account failure: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "SignInCoordinator"

    invoke-static {v3, v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/o0;->g:Lcom/google/android/gms/common/api/internal/f0;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/common/api/internal/f0;->a(Lz5/b;)V

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/o0;->f:Lm6/c;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/d;->disconnect()V

    goto :goto_4

    :cond_5
    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/o0;->g:Lcom/google/android/gms/common/api/internal/f0;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/common/api/internal/f0;->a(Lz5/b;)V

    :cond_6
    :goto_3
    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/o0;->f:Lm6/c;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/d;->disconnect()V

    :goto_4
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/common/api/internal/f0;

    iget-object v5, v4, Lcom/google/android/gms/common/api/internal/f0;->f:Lcom/google/android/gms/common/api/internal/f;

    iget-object v5, v5, Lcom/google/android/gms/common/api/internal/f;->j:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v6, v4, Lcom/google/android/gms/common/api/internal/f0;->b:Lcom/google/android/gms/common/api/internal/a;

    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/common/api/internal/d0;

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    iget-object v6, p0, Lcom/google/android/gms/common/api/internal/v0;->b:Ljava/lang/Object;

    check-cast v6, Lz5/b;

    iget v7, v6, Lz5/b;->b:I

    if-nez v7, :cond_9

    iput-boolean v2, v4, Lcom/google/android/gms/common/api/internal/f0;->e:Z

    iget-object v2, v4, Lcom/google/android/gms/common/api/internal/f0;->a:Lcom/google/android/gms/common/api/d;

    invoke-interface {v2}, Lcom/google/android/gms/common/api/d;->requiresSignIn()Z

    move-result v2

    if-eqz v2, :cond_8

    iget-boolean v0, v4, Lcom/google/android/gms/common/api/internal/f0;->e:Z

    if-eqz v0, :cond_a

    iget-object v0, v4, Lcom/google/android/gms/common/api/internal/f0;->c:Lcom/google/android/gms/common/internal/m;

    if-eqz v0, :cond_a

    iget-object v1, v4, Lcom/google/android/gms/common/api/internal/f0;->a:Lcom/google/android/gms/common/api/d;

    iget-object v2, v4, Lcom/google/android/gms/common/api/internal/f0;->d:Ljava/util/Set;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/common/api/d;->getRemoteService(Lcom/google/android/gms/common/internal/m;Ljava/util/Set;)V

    goto :goto_5

    :cond_8
    :try_start_0
    check-cast v0, Lcom/google/android/gms/common/api/internal/f0;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f0;->a:Lcom/google/android/gms/common/api/d;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/d;->getScopesForConnectionlessNonSignIn()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Lcom/google/android/gms/common/api/d;->getRemoteService(Lcom/google/android/gms/common/internal/m;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    const-string v2, "Failed to get service from broker. "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, v4, Lcom/google/android/gms/common/api/internal/f0;->a:Lcom/google/android/gms/common/api/d;

    const-string v1, "Failed to get service from broker."

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/d;->disconnect(Ljava/lang/String;)V

    new-instance v0, Lz5/b;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lz5/b;-><init>(I)V

    invoke-virtual {v5, v0, v3}, Lcom/google/android/gms/common/api/internal/d0;->p(Lz5/b;Ljava/lang/RuntimeException;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v5, v6, v3}, Lcom/google/android/gms/common/api/internal/d0;->p(Lz5/b;Ljava/lang/RuntimeException;)V

    :cond_a
    :goto_5
    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/internal/x;

    iget-boolean v0, v0, Lcom/google/android/gms/common/api/internal/x;->a:Z

    if-nez v0, :cond_b

    goto/16 :goto_9

    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/internal/u0;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/u0;->b:Lz5/b;

    iget v1, v0, Lz5/b;->b:I

    const/4 v4, 0x0

    if-eqz v1, :cond_c

    iget-object v1, v0, Lz5/b;->c:Landroid/app/PendingIntent;

    if-eqz v1, :cond_c

    move v1, v2

    goto :goto_6

    :cond_c
    move v1, v4

    :goto_6
    if-eqz v1, :cond_d

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/common/api/internal/x;

    iget-object v3, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lcom/google/android/gms/common/api/internal/j;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v0, v0, Lz5/b;->c:Landroid/app/PendingIntent;

    invoke-static {v0}, Lf6/a;->x(Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/v0;->b:Ljava/lang/Object;

    check-cast v5, Lcom/google/android/gms/common/api/internal/u0;

    iget v5, v5, Lcom/google/android/gms/common/api/internal/u0;->a:I

    sget v6, Lcom/google/android/gms/common/api/GoogleApiActivity;->b:I

    new-instance v6, Landroid/content/Intent;

    const-class v7, Lcom/google/android/gms/common/api/GoogleApiActivity;

    invoke-direct {v6, v1, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "pending_intent"

    invoke-virtual {v6, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "failing_client_id"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "notify_manager"

    invoke-virtual {v6, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-interface {v3, v6, v2}, Lcom/google/android/gms/common/api/internal/j;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_9

    :cond_d
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/common/api/internal/x;

    iget-object v5, v1, Lcom/google/android/gms/common/api/internal/x;->d:Lz5/e;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget v6, v0, Lz5/b;->b:I

    invoke-virtual {v5, v6, v1, v3}, Lz5/e;->a(ILandroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_e

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/common/api/internal/x;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/x;->d:Lz5/e;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/gms/common/api/internal/x;

    iget-object v4, v3, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->mLifecycleFragment:Lcom/google/android/gms/common/api/internal/j;

    iget v0, v0, Lz5/b;->b:I

    invoke-virtual {v2, v1, v4, v0, v3}, Lz5/e;->h(Landroid/app/Activity;Lcom/google/android/gms/common/api/internal/j;ILcom/google/android/gms/common/api/internal/x;)V

    goto/16 :goto_9

    :cond_e
    iget v1, v0, Lz5/b;->b:I

    const/16 v5, 0x12

    if-ne v1, v5, :cond_11

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/internal/x;

    iget-object v1, v0, Lcom/google/android/gms/common/api/internal/x;->d:Lz5/e;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object v6, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v6, Lcom/google/android/gms/common/api/internal/x;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/widget/ProgressBar;

    const v7, 0x101007a

    invoke-direct {v1, v0, v3, v7}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    new-instance v2, Landroid/app/AlertDialog$Builder;

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    invoke-static {v0, v5}, Lcom/google/android/gms/common/internal/v;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    const-string v1, ""

    invoke-virtual {v2, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    const-string v2, "GooglePlayServicesUpdatingDialog"

    invoke-static {v0, v1, v2, v6}, Lz5/e;->f(Landroid/app/Activity;Landroid/app/AlertDialog;Ljava/lang/String;Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/internal/x;

    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/x;->d:Lz5/e;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v4, Landroidx/fragment/app/x;

    invoke-direct {v4, p0, v1}, Landroidx/fragment/app/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v5, "android.intent.action.PACKAGE_ADDED"

    invoke-direct {v2, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const-string v5, "package"

    invoke-virtual {v2, v5}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    new-instance v5, Lcom/google/android/gms/common/api/internal/h0;

    invoke-direct {v5, v4}, Lcom/google/android/gms/common/api/internal/h0;-><init>(Landroidx/fragment/app/x;)V

    invoke-virtual {v0, v5, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iput-object v0, v5, Lcom/google/android/gms/common/api/internal/h0;->a:Landroid/content/Context;

    invoke-static {v0}, Lz5/j;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_12

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/common/api/internal/x;

    iget-object v2, v0, Lcom/google/android/gms/common/api/internal/x;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/x;->f:Lcom/google/android/gms/common/api/internal/f;

    iget-object v0, v0, Lcom/google/android/gms/common/api/internal/f;->n:Lcom/google/android/gms/internal/base/zaq;

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    check-cast v1, Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    :cond_f
    monitor-enter v5

    :try_start_1
    iget-object v0, v5, Lcom/google/android/gms/common/api/internal/h0;->a:Landroid/content/Context;

    if-eqz v0, :cond_10

    invoke-virtual {v0, v5}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    goto :goto_7

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_10
    :goto_7
    iput-object v3, v5, Lcom/google/android/gms/common/api/internal/h0;->a:Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v5

    goto :goto_9

    :goto_8
    monitor-exit v5

    throw v0

    :cond_11
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/v0;->c:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/common/api/internal/x;

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/v0;->b:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/common/api/internal/u0;

    iget v2, v2, Lcom/google/android/gms/common/api/internal/u0;->a:I

    iget-object v4, v1, Lcom/google/android/gms/common/api/internal/x;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v1, v1, Lcom/google/android/gms/common/api/internal/x;->f:Lcom/google/android/gms/common/api/internal/f;

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/common/api/internal/f;->g(Lz5/b;I)V

    :cond_12
    :goto_9
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
