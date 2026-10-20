.class public final synthetic Lr5/i;
.super Ljava/lang/Object;

# interfaces
.implements Lr5/k;
.implements Lcom/google/firebase/firestore/util/Listener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/io/Serializable;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/i;->a:Ljava/lang/Object;

    iput-object p2, p0, Lr5/i;->b:Ljava/io/Serializable;

    iput-object p3, p0, Lr5/i;->c:Ljava/lang/Object;

    iput-object p4, p0, Lr5/i;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lr5/i;->a:Ljava/lang/Object;

    check-cast v0, Lr5/m;

    iget-object v1, p0, Lr5/i;->b:Ljava/io/Serializable;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lr5/i;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    iget-object v3, p0, Lr5/i;->d:Ljava/lang/Object;

    check-cast v3, Li3/a0;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {p1, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    new-instance v1, Lp5/b;

    const/4 v4, 0x4

    invoke-direct {v1, v0, v2, v3, v4}, Lp5/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p1, v1}, Lr5/m;->q(Landroid/database/Cursor;Lr5/k;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo5/a;

    return-object p1
.end method

.method public final onValue(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lr5/i;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/firestore/core/FirestoreClient;

    iget-object v1, p0, Lr5/i;->b:Ljava/io/Serializable;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, Lr5/i;->c:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v3, p0, Lr5/i;->d:Ljava/lang/Object;

    check-cast v3, Lcom/google/firebase/firestore/util/AsyncQueue;

    check-cast p1, Lcom/google/firebase/firestore/auth/User;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/google/firebase/firestore/core/FirestoreClient;->w(Lcom/google/firebase/firestore/core/FirestoreClient;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/firestore/util/AsyncQueue;Lcom/google/firebase/firestore/auth/User;)V

    return-void
.end method
