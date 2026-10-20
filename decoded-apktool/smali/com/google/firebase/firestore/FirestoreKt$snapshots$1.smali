.class final Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/firestore/FirestoreKt;->snapshots(Lcom/google/firebase/firestore/DocumentReference;Lcom/google/firebase/firestore/MetadataChanges;)Lp9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw8/i;",
        "Lc9/e;"
    }
.end annotation

.annotation runtime Lw8/e;
    c = "com.google.firebase.firestore.FirestoreKt$snapshots$1"
    f = "Firestore.kt"
    l = {
        0xf3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $metadataChanges:Lcom/google/firebase/firestore/MetadataChanges;

.field final synthetic $this_snapshots:Lcom/google/firebase/firestore/DocumentReference;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/DocumentReference;Lcom/google/firebase/firestore/MetadataChanges;Lu8/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/DocumentReference;",
            "Lcom/google/firebase/firestore/MetadataChanges;",
            "Lu8/e;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->$this_snapshots:Lcom/google/firebase/firestore/DocumentReference;

    iput-object p2, p0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->$metadataChanges:Lcom/google/firebase/firestore/MetadataChanges;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lw8/i;-><init>(ILu8/e;)V

    return-void
.end method

.method public static synthetic h(Lo9/r;Lcom/google/firebase/firestore/DocumentSnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->invokeSuspend$lambda-0(Lo9/r;Lcom/google/firebase/firestore/DocumentSnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V

    return-void
.end method

.method private static final invokeSuspend$lambda-0(Lo9/r;Lcom/google/firebase/firestore/DocumentSnapshot;Lcom/google/firebase/firestore/FirebaseFirestoreException;)V
    .locals 0

    if-eqz p2, :cond_0

    const-string p1, "Error getting DocumentReference snapshot"

    invoke-static {p0, p1, p2}, Ld7/a;->h(Lm9/d0;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-static {p0, p1}, Lh6/g;->z0(Lo9/t;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lu8/e;",
            ")",
            "Lu8/e;"
        }
    .end annotation

    new-instance v0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;

    iget-object v1, p0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->$this_snapshots:Lcom/google/firebase/firestore/DocumentReference;

    iget-object v2, p0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->$metadataChanges:Lcom/google/firebase/firestore/MetadataChanges;

    invoke-direct {v0, v1, v2, p2}, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;-><init>(Lcom/google/firebase/firestore/DocumentReference;Lcom/google/firebase/firestore/MetadataChanges;Lu8/e;)V

    iput-object p1, v0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lo9/r;

    check-cast p2, Lu8/e;

    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->invoke(Lo9/r;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lo9/r;Lu8/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo9/r;",
            "Lu8/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->create(Ljava/lang/Object;Lu8/e;)Lu8/e;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;

    sget-object p2, Lq8/l;->a:Lq8/l;

    invoke-virtual {p1, p2}, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lv8/a;->a:Lv8/a;

    iget v1, p0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ld7/t;->v0(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lo9/r;

    iget-object v1, p0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->$this_snapshots:Lcom/google/firebase/firestore/DocumentReference;

    sget-object v3, Lcom/google/firebase/firestore/util/Executors;->BACKGROUND_EXECUTOR:Ljava/util/concurrent/Executor;

    iget-object v4, p0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->$metadataChanges:Lcom/google/firebase/firestore/MetadataChanges;

    new-instance v5, Lcom/google/firebase/firestore/h;

    const/4 v6, 0x0

    invoke-direct {v5, p1, v6}, Lcom/google/firebase/firestore/h;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v3, v4, v5}, Lcom/google/firebase/firestore/DocumentReference;->addSnapshotListener(Ljava/util/concurrent/Executor;Lcom/google/firebase/firestore/MetadataChanges;Lcom/google/firebase/firestore/EventListener;)Lcom/google/firebase/firestore/ListenerRegistration;

    move-result-object v1

    const-string v3, "addSnapshotListener(BACK\u2026apshot)\n        }\n      }"

    invoke-static {v1, v3}, Ld7/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1$1;

    invoke-direct {v3, v1}, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1$1;-><init>(Lcom/google/firebase/firestore/ListenerRegistration;)V

    iput v2, p0, Lcom/google/firebase/firestore/FirestoreKt$snapshots$1;->label:I

    invoke-static {p1, v3, p0}, Ld7/t;->E(Lo9/r;Lc9/a;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lq8/l;->a:Lq8/l;

    return-object p1
.end method
