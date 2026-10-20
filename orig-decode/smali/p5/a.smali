.class public final synthetic Lp5/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p5, p0, Lp5/a;->a:I

    iput-object p1, p0, Lp5/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lp5/a;->c:Ljava/lang/Object;

    iput-object p3, p0, Lp5/a;->d:Ljava/lang/Object;

    iput-object p4, p0, Lp5/a;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, Lp5/a;->a:I

    iget-object v1, p0, Lp5/a;->e:Ljava/lang/Object;

    iget-object v2, p0, Lp5/a;->d:Ljava/lang/Object;

    iget-object v3, p0, Lp5/a;->c:Ljava/lang/Object;

    iget-object v4, p0, Lp5/a;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v4, Lcom/google/firebase/firestore/core/FirestoreClient;

    check-cast v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    check-cast v2, Landroid/content/Context;

    check-cast v1, Lcom/google/firebase/firestore/FirebaseFirestoreSettings;

    invoke-static {v4, v3, v2, v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->g(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;Lcom/google/firebase/firestore/FirebaseFirestoreSettings;)V

    return-void

    :pswitch_0
    check-cast v4, Lcom/google/firebase/firestore/core/FirestoreClient;

    check-cast v3, Lcom/google/firebase/firestore/core/Query;

    check-cast v2, Ljava/util/List;

    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v4, v3, v2, v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->p(Lcom/google/firebase/firestore/core/FirestoreClient;Lcom/google/firebase/firestore/core/Query;Ljava/util/List;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void

    :pswitch_1
    check-cast v4, Lp5/c;

    check-cast v3, Ll5/j;

    check-cast v2, Lb0/l0;

    check-cast v1, Ll5/i;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lp5/c;->f:Ljava/util/logging/Logger;

    :try_start_0
    iget-object v5, v4, Lp5/c;->c:Lm5/f;

    iget-object v6, v3, Ll5/j;->a:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lm5/f;->a(Ljava/lang/String;)Lm5/h;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    const-string v1, "Transport backend \'%s\' is not registered"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v3, v3, Ll5/j;->a:Ljava/lang/String;

    aput-object v3, v4, v6

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :cond_0
    check-cast v5, Lj5/d;

    invoke-virtual {v5, v1}, Lj5/d;->a(Ll5/i;)Ll5/i;

    move-result-object v1

    iget-object v5, v4, Lp5/c;->e:Ls5/c;

    new-instance v7, Lp5/b;

    invoke-direct {v7, v4, v3, v1, v6}, Lp5/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    check-cast v5, Lr5/m;

    invoke-virtual {v5, v7}, Lr5/m;->g(Ls5/b;)Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error scheduling event "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
