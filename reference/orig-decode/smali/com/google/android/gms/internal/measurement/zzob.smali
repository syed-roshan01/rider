.class public final Lcom/google/android/gms/internal/measurement/zzob;
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
.field private static zza:Lcom/google/android/gms/internal/measurement/zzob;


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

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzob;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzob;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzob;->zza:Lcom/google/android/gms/internal/measurement/zzob;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzod;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/zzod;-><init>()V

    new-instance v1, Lq6/p;

    invoke-direct {v1, v0}, Lq6/p;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/measurement/zzob;->zzb:Lq6/m;

    return-void
.end method

.method public static zza()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzob;->zza:Lcom/google/android/gms/internal/measurement/zzob;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzob;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzoa;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzoa;->zza()Z

    move-result v0

    return v0
.end method

.method public static zzb()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzob;->zza:Lcom/google/android/gms/internal/measurement/zzob;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzob;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzoa;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzoa;->zzb()Z

    move-result v0

    return v0
.end method

.method public static zzc()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzob;->zza:Lcom/google/android/gms/internal/measurement/zzob;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzob;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzoa;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzoa;->zzc()Z

    move-result v0

    return v0
.end method

.method public static zzd()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzob;->zza:Lcom/google/android/gms/internal/measurement/zzob;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzob;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzoa;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/zzoa;->zzd()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzob;->zzb:Lq6/m;

    invoke-interface {v0}, Lq6/m;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzoa;

    return-object v0
.end method
