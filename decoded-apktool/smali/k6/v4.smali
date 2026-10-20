.class public final synthetic Lk6/v4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public a:Lk6/t4;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzr;

    invoke-static {p0}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۣۢ۠(Ljava/lang/Object;)Lk6/t4;

    move-result-object v1

    invoke-static {v1}, Lh8/۟ۤۨۨۦ;->ۥۡ۟ۨ(Ljava/lang/Object;)Lk6/w4;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzr;-><init>(Lcom/google/android/gms/internal/measurement/zzv;)V

    return-object v0
.end method
