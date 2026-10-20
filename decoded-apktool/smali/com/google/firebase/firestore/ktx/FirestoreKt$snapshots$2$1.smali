.class final Lcom/google/firebase/firestore/ktx/FirestoreKt$snapshots$2$1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/firestore/ktx/FirestoreKt$snapshots$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld9/j;",
        "Lc9/a;"
    }
.end annotation


# instance fields
.field final synthetic $registration:Lcom/google/firebase/firestore/ListenerRegistration;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/ListenerRegistration;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/firestore/ktx/FirestoreKt$snapshots$2$1;->$registration:Lcom/google/firebase/firestore/ListenerRegistration;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ld9/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/firestore/ktx/FirestoreKt$snapshots$2$1;->invoke()V

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/ktx/FirestoreKt$snapshots$2$1;->$registration:Lcom/google/firebase/firestore/ListenerRegistration;

    .line 2
    invoke-interface {v0}, Lcom/google/firebase/firestore/ListenerRegistration;->remove()V

    return-void
.end method
