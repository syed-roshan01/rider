.class public final Lk6/d7;
.super Lk6/p2;


# instance fields
.field public c:Lcom/google/android/gms/internal/measurement/zzcp;

.field public d:Z

.field public final e:Lk6/w4;

.field public final f:Lk6/h7;

.field public final g:Ll/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/f5;)V
    .locals 2

    invoke-direct {p0, p1}, Lk6/p2;-><init>(Lk6/f5;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk6/d7;->d:Z

    new-instance v0, Lk6/w4;

    sget v1, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۤۥۡ۠:I

    xor-int/lit16 v1, v1, -0x38e

    invoke-direct {v0, p0, v1}, Lk6/w4;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lk6/d7;->e:Lk6/w4;

    new-instance v0, Lk6/h7;

    invoke-direct {v0, p0}, Lk6/h7;-><init>(Lk6/d7;)V

    iput-object v0, p0, Lk6/d7;->f:Lk6/h7;

    new-instance v0, Ll/t;

    invoke-direct {v0, p0}, Ll/t;-><init>(Lk6/d7;)V

    iput-object v0, p0, Lk6/d7;->g:Ll/t;

    invoke-static {}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->۟ۤۥۦۣ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "DASTqL4dhPx"

    invoke-static {v0}, Ld3/ۡۨۢۦ;->ۥۣۣ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final u()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final v()V
    .locals 2

    invoke-static {p0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {p0}, Ly/ۤۨۧ۟;->ۨۥۤۡ(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzcp;

    move-result-object v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcp;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/zzcp;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lk6/d7;->c:Lcom/google/android/gms/internal/measurement/zzcp;

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
