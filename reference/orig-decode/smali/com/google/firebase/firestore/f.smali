.class public final synthetic Lcom/google/firebase/firestore/f;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/firestore/ListenerRegistration;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public final synthetic b:Lcom/google/firebase/firestore/core/AsyncEventListener;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/core/AsyncEventListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/f;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p2, p0, Lcom/google/firebase/firestore/f;->b:Lcom/google/firebase/firestore/core/AsyncEventListener;

    return-void
.end method


# virtual methods
.method public final remove()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/f;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    iget-object v1, p0, Lcom/google/firebase/firestore/f;->b:Lcom/google/firebase/firestore/core/AsyncEventListener;

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->e(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/core/AsyncEventListener;)V

    return-void
.end method
