.class public final Lcom/google/android/gms/internal/measurement/zzpa;
.super Ljava/lang/Object;

# interfaces
.implements Lq6/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq6/m;"
    }
.end annotation


# static fields
.field private static zza:Lcom/google/android/gms/internal/measurement/zzpa;


# instance fields
.field private final zzb:Lq6/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq6/m;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzpa;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzpa;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzpa;->zza:Lcom/google/android/gms/internal/measurement/zzpa;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzpc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzpc;-><init>()V

    new-instance v1, Lq6/p;

    invoke-direct {v1, v0}, Lq6/p;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzpa;->zzb:Lq6/m;

    return-void
.end method

.method public static zza()D
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzpa;->zza:Lcom/google/android/gms/internal/measurement/zzpa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzpa;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzpd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzpd;->zza()D

    move-result-wide v0

    return-wide v0
.end method

.method public static zzb()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzpa;->zza:Lcom/google/android/gms/internal/measurement/zzpa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzpa;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzpd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzpd;->zzb()J

    move-result-wide v0

    return-wide v0
.end method

.method public static zzc()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzpa;->zza:Lcom/google/android/gms/internal/measurement/zzpa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzpa;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzpd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzpd;->zzc()J

    move-result-wide v0

    return-wide v0
.end method

.method public static zzd()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzpa;->zza:Lcom/google/android/gms/internal/measurement/zzpa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzpa;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzpd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzpd;->zzd()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static zze()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzpa;->zza:Lcom/google/android/gms/internal/measurement/zzpa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzpa;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzpd;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzpd;->zze()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzpa;->zzb:Lq6/m;

    invoke-interface {v0}, Lq6/m;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzpd;

    return-object v0
.end method
