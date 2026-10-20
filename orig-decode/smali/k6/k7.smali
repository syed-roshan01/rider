.class public abstract Lk6/k7;
.super Lf4/y;


# instance fields
.field public final b:Lk6/p7;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/p7;)V
    .locals 2

    invoke-static {p1}, Lh8/۟ۤۨۨۦ;->ۣۧۤۢ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v0

    invoke-direct {p0, v0}, Lf4/y;-><init>(Lk6/f5;)V

    iput-object p1, p0, Lk6/k7;->b:Lk6/p7;

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣ۟۟ۥۣ()I

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
    const-string v0, "qyI8imv2wwW6xQnUKdIvq8sE"

    invoke-static {v0}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->ۣ۠ۨۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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
.method public final m()Lk6/r7;
    .locals 1

    invoke-static {p0}, Lo8/۟ۢۧۢۤ;->ۤۢۨ۟(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟۠ۢۧ(Ljava/lang/Object;)Lk6/r7;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟۠ۥۡ۟(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final n()Lk6/k;
    .locals 1

    invoke-static {p0}, Lo8/۟ۢۧۢۤ;->ۤۢۨ۟(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->ۧۦۡۧ(Ljava/lang/Object;)Lk6/k;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟۠ۥۡ۟(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final o()Lk6/t4;
    .locals 1

    invoke-static {p0}, Lo8/۟ۢۧۢۤ;->ۤۢۨ۟(Ljava/lang/Object;)Lk6/p7;

    move-result-object v0

    invoke-static {v0}, Ly6/۟ۤۥۥۥ;->۟ۥۤۡۦ(Ljava/lang/Object;)Lk6/t4;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟۠ۥۡ۟(Ljava/lang/Object;)V

    return-object v0
.end method
