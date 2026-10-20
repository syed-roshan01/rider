.class final Lcom/google/firebase/auth/zzw;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/Continuation<",
        "Lcom/google/android/gms/internal/firebase-auth-api/zzagi;",
        "Lcom/google/android/gms/tasks/Task<",
        "Lcom/google/firebase/auth/TotpSecret;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final synthetic zza:Lcom/google/firebase/auth/FirebaseAuth;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/auth/zzw;->zza:Lcom/google/firebase/auth/FirebaseAuth;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 10

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Lf6/a;->x(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzagi;

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzago;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzago;

    new-instance v9, Lcom/google/firebase/auth/internal/zzcd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzago;->zzf()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lf6/a;->u(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzago;->zze()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lf6/a;->u(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzago;->zzc()I

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzago;->zzb()I

    move-result v4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzago;->zzd()J

    move-result-wide v5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzago;->zza()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lf6/a;->u(Ljava/lang/String;)V

    iget-object v8, p0, Lcom/google/firebase/auth/zzw;->zza:Lcom/google/firebase/auth/FirebaseAuth;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/firebase/auth/internal/zzcd;-><init>(Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/String;Lcom/google/firebase/auth/FirebaseAuth;)V

    invoke-static {v9}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Response should be an instance of StartTotpMfaEnrollmentResponse but was "

    const-string v2, "."

    invoke-static {v1, p1, v2}, Ll/q;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
