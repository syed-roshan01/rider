.class public final Lcom/google/firebase/auth/internal/zzv;
.super Lcom/google/firebase/auth/ActionCodeMultiFactorInfo;


# instance fields
.field private final zza:Lcom/google/firebase/auth/MultiFactorInfo;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/firebase/auth/MultiFactorInfo;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/ActionCodeMultiFactorInfo;-><init>()V

    invoke-static {p1}, Lf6/a;->u(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/firebase/auth/ActionCodeInfo;->email:Ljava/lang/String;

    if-eqz p2, :cond_0

    iput-object p2, p0, Lcom/google/firebase/auth/internal/zzv;->zza:Lcom/google/firebase/auth/MultiFactorInfo;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null reference"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final getMultiFactorInfo()Lcom/google/firebase/auth/MultiFactorInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/internal/zzv;->zza:Lcom/google/firebase/auth/MultiFactorInfo;

    return-object v0
.end method
