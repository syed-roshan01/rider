.class final Lcom/google/android/gms/internal/measurement/zzdf$zzc;
.super Lcom/google/android/gms/internal/measurement/zzcz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/measurement/zzdf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "zzc"
.end annotation


# instance fields
.field private final zza:Lk6/v5;


# direct methods
.method public constructor <init>(Lk6/v5;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzcz;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdf$zzc;->zza:Lk6/v5;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf$zzc;->zza:Lk6/v5;

    .line 1
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdf$zzc;->zza:Lk6/v5;

    move-object v1, v0

    check-cast v1, Ll/t;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    .line 2
    invoke-virtual/range {v1 .. v6}, Ll/t;->e(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void
.end method
