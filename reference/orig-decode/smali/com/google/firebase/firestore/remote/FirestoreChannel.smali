.class public Lcom/google/firebase/firestore/remote/FirestoreChannel;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;
    }
.end annotation


# static fields
.field private static final RESOURCE_PREFIX_HEADER:Le8/i1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le8/i1;"
        }
    .end annotation
.end field

.field private static final X_GOOG_API_CLIENT_HEADER:Le8/i1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le8/i1;"
        }
    .end annotation
.end field

.field private static final X_GOOG_REQUEST_PARAMS_HEADER:Le8/i1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le8/i1;"
        }
    .end annotation
.end field

.field private static volatile clientLanguage:Ljava/lang/String;


# instance fields
.field private final appCheckProvider:Lcom/google/firebase/firestore/auth/CredentialsProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/firestore/auth/CredentialsProvider<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final asyncQueue:Lcom/google/firebase/firestore/util/AsyncQueue;

.field private final authProvider:Lcom/google/firebase/firestore/auth/CredentialsProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/firestore/auth/CredentialsProvider<",
            "Lcom/google/firebase/firestore/auth/User;",
            ">;"
        }
    .end annotation
.end field

.field private final callProvider:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

.field private final metadataProvider:Lcom/google/firebase/firestore/remote/GrpcMetadataProvider;

.field private final resourcePrefixValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Le8/l1;->d:Lx9/v;

    sget-object v1, Le8/i1;->d:Ljava/util/BitSet;

    new-instance v1, Le8/g1;

    const-string v2, "x-goog-api-client"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lcom/google/firebase/firestore/remote/FirestoreChannel;->X_GOOG_API_CLIENT_HEADER:Le8/i1;

    new-instance v1, Le8/g1;

    const-string v2, "google-cloud-resource-prefix"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lcom/google/firebase/firestore/remote/FirestoreChannel;->RESOURCE_PREFIX_HEADER:Le8/i1;

    new-instance v1, Le8/g1;

    const-string v2, "x-goog-request-params"

    invoke-direct {v1, v2, v0}, Le8/g1;-><init>(Ljava/lang/String;Lx9/v;)V

    sput-object v1, Lcom/google/firebase/firestore/remote/FirestoreChannel;->X_GOOG_REQUEST_PARAMS_HEADER:Le8/i1;

    const-string v0, "gl-java/"

    sput-object v0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->clientLanguage:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/firestore/util/AsyncQueue;Landroid/content/Context;Lcom/google/firebase/firestore/auth/CredentialsProvider;Lcom/google/firebase/firestore/auth/CredentialsProvider;Lcom/google/firebase/firestore/core/DatabaseInfo;Lcom/google/firebase/firestore/remote/GrpcMetadataProvider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/util/AsyncQueue;",
            "Landroid/content/Context;",
            "Lcom/google/firebase/firestore/auth/CredentialsProvider<",
            "Lcom/google/firebase/firestore/auth/User;",
            ">;",
            "Lcom/google/firebase/firestore/auth/CredentialsProvider<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/firebase/firestore/core/DatabaseInfo;",
            "Lcom/google/firebase/firestore/remote/GrpcMetadataProvider;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->asyncQueue:Lcom/google/firebase/firestore/util/AsyncQueue;

    iput-object p6, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->metadataProvider:Lcom/google/firebase/firestore/remote/GrpcMetadataProvider;

    iput-object p3, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->authProvider:Lcom/google/firebase/firestore/auth/CredentialsProvider;

    iput-object p4, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->appCheckProvider:Lcom/google/firebase/firestore/auth/CredentialsProvider;

    new-instance p6, Lcom/google/firebase/firestore/remote/FirestoreCallCredentials;

    invoke-direct {p6, p3, p4}, Lcom/google/firebase/firestore/remote/FirestoreCallCredentials;-><init>(Lcom/google/firebase/firestore/auth/CredentialsProvider;Lcom/google/firebase/firestore/auth/CredentialsProvider;)V

    new-instance p3, Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    invoke-direct {p3, p1, p2, p5, p6}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;-><init>(Lcom/google/firebase/firestore/util/AsyncQueue;Landroid/content/Context;Lcom/google/firebase/firestore/core/DatabaseInfo;Le8/f;)V

    iput-object p3, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->callProvider:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    invoke-virtual {p5}, Lcom/google/firebase/firestore/core/DatabaseInfo;->getDatabaseId()Lcom/google/firebase/firestore/model/DatabaseId;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/model/DatabaseId;->getProjectId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/firebase/firestore/model/DatabaseId;->getDatabaseId()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "projects/%s/databases/%s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->resourcePrefixValue:Ljava/lang/String;

    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/firestore/remote/FirestoreChannel;Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->lambda$runRpc$2(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/google/firebase/firestore/remote/FirestoreChannel;)Lcom/google/firebase/firestore/util/AsyncQueue;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->asyncQueue:Lcom/google/firebase/firestore/util/AsyncQueue;

    return-object p0
.end method

.method public static synthetic access$100(Lcom/google/firebase/firestore/remote/FirestoreChannel;Le8/c2;)Lcom/google/firebase/firestore/FirebaseFirestoreException;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->exceptionFromStatus(Le8/c2;)Lcom/google/firebase/firestore/FirebaseFirestoreException;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/google/firebase/firestore/remote/FirestoreChannel;[Le8/k;Lcom/google/firebase/firestore/remote/IncomingStreamObserver;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->lambda$runBidiStreamingRpc$0([Le8/k;Lcom/google/firebase/firestore/remote/IncomingStreamObserver;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic c(Lcom/google/firebase/firestore/remote/FirestoreChannel;Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->lambda$runStreamingResponseRpc$1(Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method private exceptionFromStatus(Le8/c2;)Lcom/google/firebase/firestore/FirebaseFirestoreException;
    .locals 3

    invoke-static {p1}, Lcom/google/firebase/firestore/remote/Datastore;->isMissingSslCiphers(Le8/c2;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/firebase/firestore/FirebaseFirestoreException;

    iget-object v1, p1, Le8/c2;->a:Le8/z1;

    iget v1, v1, Le8/z1;->a:I

    invoke-static {v1}, Lcom/google/firebase/firestore/FirebaseFirestoreException$Code;->fromValue(I)Lcom/google/firebase/firestore/FirebaseFirestoreException$Code;

    move-result-object v1

    const-string v2, "The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices."

    iget-object p1, p1, Le8/c2;->c:Ljava/lang/Throwable;

    invoke-direct {v0, v2, v1, p1}, Lcom/google/firebase/firestore/FirebaseFirestoreException;-><init>(Ljava/lang/String;Lcom/google/firebase/firestore/FirebaseFirestoreException$Code;Ljava/lang/Throwable;)V

    return-object v0

    :cond_0
    invoke-static {p1}, Lcom/google/firebase/firestore/util/Util;->exceptionFromStatus(Le8/c2;)Lcom/google/firebase/firestore/FirebaseFirestoreException;

    move-result-object p1

    return-object p1
.end method

.method private getGoogApiClientValue()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->clientLanguage:Ljava/lang/String;

    const-string v1, "24.10.1"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s fire/%s grpc/"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private synthetic lambda$runBidiStreamingRpc$0([Le8/k;Lcom/google/firebase/firestore/remote/IncomingStreamObserver;Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Le8/k;

    const/4 v0, 0x0

    aput-object p3, p1, v0

    new-instance v1, Lcom/google/firebase/firestore/remote/FirestoreChannel$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/google/firebase/firestore/remote/FirestoreChannel$1;-><init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;Lcom/google/firebase/firestore/remote/IncomingStreamObserver;[Le8/k;)V

    invoke-direct {p0}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->requestHeaders()Le8/l1;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Le8/k;->start(Le8/j;Le8/l1;)V

    invoke-interface {p2}, Lcom/google/firebase/firestore/remote/IncomingStreamObserver;->onOpen()V

    aget-object p1, p1, v0

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Le8/k;->request(I)V

    return-void
.end method

.method private synthetic lambda$runRpc$2(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Le8/k;

    new-instance v0, Lcom/google/firebase/firestore/remote/FirestoreChannel$4;

    invoke-direct {v0, p0, p1}, Lcom/google/firebase/firestore/remote/FirestoreChannel$4;-><init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-direct {p0}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->requestHeaders()Le8/l1;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Le8/k;->start(Le8/j;Le8/l1;)V

    const/4 p1, 0x2

    invoke-virtual {p3, p1}, Le8/k;->request(I)V

    invoke-virtual {p3, p2}, Le8/k;->sendMessage(Ljava/lang/Object;)V

    invoke-virtual {p3}, Le8/k;->halfClose()V

    return-void
.end method

.method private synthetic lambda$runStreamingResponseRpc$1(Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;Ljava/lang/Object;Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Le8/k;

    new-instance v0, Lcom/google/firebase/firestore/remote/FirestoreChannel$3;

    invoke-direct {v0, p0, p1, p3}, Lcom/google/firebase/firestore/remote/FirestoreChannel$3;-><init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;Le8/k;)V

    invoke-direct {p0}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->requestHeaders()Le8/l1;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Le8/k;->start(Le8/j;Le8/l1;)V

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Le8/k;->request(I)V

    invoke-virtual {p3, p2}, Le8/k;->sendMessage(Ljava/lang/Object;)V

    invoke-virtual {p3}, Le8/k;->halfClose()V

    return-void
.end method

.method private requestHeaders()Le8/l1;
    .locals 3

    new-instance v0, Le8/l1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lcom/google/firebase/firestore/remote/FirestoreChannel;->X_GOOG_API_CLIENT_HEADER:Le8/i1;

    invoke-direct {p0}, Lcom/google/firebase/firestore/remote/FirestoreChannel;->getGoogApiClientValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Le8/l1;->f(Le8/i1;Ljava/io/Serializable;)V

    sget-object v1, Lcom/google/firebase/firestore/remote/FirestoreChannel;->RESOURCE_PREFIX_HEADER:Le8/i1;

    iget-object v2, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->resourcePrefixValue:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Le8/l1;->f(Le8/i1;Ljava/io/Serializable;)V

    sget-object v1, Lcom/google/firebase/firestore/remote/FirestoreChannel;->X_GOOG_REQUEST_PARAMS_HEADER:Le8/i1;

    iget-object v2, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->resourcePrefixValue:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Le8/l1;->f(Le8/i1;Ljava/io/Serializable;)V

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->metadataProvider:Lcom/google/firebase/firestore/remote/GrpcMetadataProvider;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/google/firebase/firestore/remote/GrpcMetadataProvider;->updateMetadata(Le8/l1;)V

    :cond_0
    return-object v0
.end method

.method public static setClientLanguage(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->clientLanguage:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public invalidateToken()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->authProvider:Lcom/google/firebase/firestore/auth/CredentialsProvider;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/auth/CredentialsProvider;->invalidateToken()V

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->appCheckProvider:Lcom/google/firebase/firestore/auth/CredentialsProvider;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/auth/CredentialsProvider;->invalidateToken()V

    return-void
.end method

.method public runBidiStreamingRpc(Le8/p1;Lcom/google/firebase/firestore/remote/IncomingStreamObserver;)Le8/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Le8/p1;",
            "Lcom/google/firebase/firestore/remote/IncomingStreamObserver<",
            "TRespT;>;)",
            "Le8/k;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v1, v0, [Le8/k;

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput-object v3, v1, v2

    iget-object v2, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->callProvider:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    invoke-virtual {v2, p1}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->createClientCall(Le8/p1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object v2, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->asyncQueue:Lcom/google/firebase/firestore/util/AsyncQueue;

    invoke-virtual {v2}, Lcom/google/firebase/firestore/util/AsyncQueue;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lcom/google/firebase/firestore/remote/e;

    invoke-direct {v3, p0, v1, p2, v0}, Lcom/google/firebase/firestore/remote/e;-><init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    new-instance p2, Lcom/google/firebase/firestore/remote/FirestoreChannel$2;

    invoke-direct {p2, p0, v1, p1}, Lcom/google/firebase/firestore/remote/FirestoreChannel$2;-><init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;[Le8/k;Lcom/google/android/gms/tasks/Task;)V

    return-object p2
.end method

.method public runRpc(Le8/p1;Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Le8/p1;",
            "TReqT;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TRespT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->callProvider:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    invoke-virtual {v1, p1}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->createClientCall(Le8/p1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->asyncQueue:Lcom/google/firebase/firestore/util/AsyncQueue;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/util/AsyncQueue;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lcom/google/firebase/firestore/remote/e;

    const/4 v3, 0x3

    invoke-direct {v2, p0, v0, p2, v3}, Lcom/google/firebase/firestore/remote/e;-><init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public runStreamingResponseRpc(Le8/p1;Ljava/lang/Object;Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Le8/p1;",
            "TReqT;",
            "Lcom/google/firebase/firestore/remote/FirestoreChannel$StreamingListener<",
            "TRespT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->callProvider:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    invoke-virtual {v0, p1}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->createClientCall(Le8/p1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->asyncQueue:Lcom/google/firebase/firestore/util/AsyncQueue;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/util/AsyncQueue;->getExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v1, Lcom/google/firebase/firestore/remote/e;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p3, p2, v2}, Lcom/google/firebase/firestore/remote/e;-><init>(Lcom/google/firebase/firestore/remote/FirestoreChannel;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public shutdown()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/remote/FirestoreChannel;->callProvider:Lcom/google/firebase/firestore/remote/GrpcCallProvider;

    invoke-virtual {v0}, Lcom/google/firebase/firestore/remote/GrpcCallProvider;->shutdown()V

    return-void
.end method
