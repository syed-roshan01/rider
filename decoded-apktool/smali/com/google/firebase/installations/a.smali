.class public final synthetic Lcom/google/firebase/installations/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/firebase/installations/a;->a:I

    iput-object p2, p0, Lcom/google/firebase/installations/a;->b:Ljava/lang/Object;

    iput-boolean p3, p0, Lcom/google/firebase/installations/a;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcom/google/firebase/installations/a;->a:I

    iget-boolean v1, p0, Lcom/google/firebase/installations/a;->c:Z

    iget-object v2, p0, Lcom/google/firebase/installations/a;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v2, Lcom/google/firebase/firestore/core/FirestoreClient;

    invoke-static {v2, v1}, Lcom/google/firebase/firestore/core/FirestoreClient;->s(Lcom/google/firebase/firestore/core/FirestoreClient;Z)V

    return-void

    :pswitch_0
    check-cast v2, Lcom/google/firebase/installations/FirebaseInstallations;

    invoke-static {v2, v1}, Lcom/google/firebase/installations/FirebaseInstallations;->d(Lcom/google/firebase/installations/FirebaseInstallations;Z)V

    return-void

    :pswitch_1
    check-cast v2, Lcom/google/firebase/installations/FirebaseInstallations;

    invoke-static {v2, v1}, Lcom/google/firebase/installations/FirebaseInstallations;->c(Lcom/google/firebase/installations/FirebaseInstallations;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
