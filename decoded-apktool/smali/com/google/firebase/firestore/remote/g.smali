.class public final synthetic Lcom/google/firebase/firestore/remote/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/firebase/firestore/remote/GrpcCallProvider;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/firestore/remote/GrpcCallProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/g;->a:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/g;->a:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->d(Lcom/google/firebase/firestore/remote/GrpcCallProvider;)Le8/c1;

    move-result-object v0

    return-object v0
.end method
