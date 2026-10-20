.class public final synthetic Lcom/google/firebase/firestore/core/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/firebase/firestore/ListenerRegistration;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/ListenerRegistration;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/firebase/firestore/core/a;->a:I

    iput-object p1, p0, Lcom/google/firebase/firestore/core/a;->b:Lcom/google/firebase/firestore/ListenerRegistration;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lcom/google/firebase/firestore/core/a;->a:I

    iget-object v1, p0, Lcom/google/firebase/firestore/core/a;->b:Lcom/google/firebase/firestore/ListenerRegistration;

    invoke-interface {v1}, Lcom/google/firebase/firestore/ListenerRegistration;->remove()V

    return-void
.end method
