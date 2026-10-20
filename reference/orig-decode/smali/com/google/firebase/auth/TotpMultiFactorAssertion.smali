.class public Lcom/google/firebase/auth/TotpMultiFactorAssertion;
.super Lcom/google/firebase/auth/MultiFactorAssertion;


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Lcom/google/firebase/auth/TotpSecret;

.field private final zzc:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/firebase/auth/TotpSecret;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/auth/MultiFactorAssertion;-><init>()V

    invoke-static {p1}, Lf6/a;->u(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zza:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zzb:Lcom/google/firebase/auth/TotpSecret;

    iput-object p3, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zzc:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getFactorId()Ljava/lang/String;
    .locals 1

    const-string v0, "totp"

    return-object v0
.end method

.method public final zza()Lcom/google/firebase/auth/TotpSecret;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zzb:Lcom/google/firebase/auth/TotpSecret;

    return-object v0
.end method

.method public final zzb()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/auth/TotpMultiFactorAssertion;->zza:Ljava/lang/String;

    return-object v0
.end method
