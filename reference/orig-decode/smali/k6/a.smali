.class public final Lk6/a;
.super Ljava/lang/Object;

# interfaces
.implements Lk6/u5;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/zzda;

.field public final b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/a;->short:[S

    return-void

    :array_0
    .array-data 2
        0x267s
        0x254s
        0x247s
        0x24cs
        0x256s
        0x202s
        0x24es
        0x24bs
        0x251s
        0x256s
        0x247s
        0x24cs
        0x247s
        0x250s
        0x202s
        0x256s
        0x24as
        0x250s
        0x247s
        0x255s
        0x202s
        0x247s
        0x25as
        0x241s
        0x247s
        0x252s
        0x256s
        0x24bs
        0x24ds
        0x24cs
    .end array-data
.end method

.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/google/android/gms/internal/measurement/zzda;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/a;->b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iput-object p2, p0, Lk6/a;->a:Lcom/google/android/gms/internal/measurement/zzda;

    invoke-static {}, Lcom/google/android/play/core/integrity/model/۟ۡۡۤۧ;->ۦۡ۠ۨ()I

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
    const-string v0, "PDzqzAy"

    invoke-static {v0}, Lf1/ۥۦ۟ۥ;->۟ۢۢۦۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۣۨۨۥ()[S
    .locals 2

    invoke-static {}, Lcom/google/android/datatransport/cct/ۨۡ۠ۦ;->ۢۥۦۧ()I

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
    sget-object v0, Lk6/a;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6

    :try_start_0
    invoke-static {p0}, Lg4/۠ۤۢۥ;->۟ۥۣۨۡ(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzda;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-static/range {v0 .. v5}, Lv0/ۣ۟۟ۤۧ;->۟ۦۦۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    :sswitch_0
    return-void

    :catch_0
    move-exception v0

    invoke-static {p0}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->ۥۥۦۦ(Ljava/lang/Object;)Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    move-result-object v1

    invoke-static {v1}, Le2/ۨۥۦۡ;->ۣۤۢ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v2

    const/16 v1, 0x650

    :goto_1
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_1
    const/16 v1, 0x68e

    goto :goto_1

    :sswitch_2
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_1

    :sswitch_3
    invoke-static {v2}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v1

    invoke-static {v1}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {}, Lk6/a;->ۣۨۨۥ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Lr1/۟ۤۤۡ۠;->ۦۥۢ:I

    xor-int/lit16 v4, v4, 0x10b

    const/16 v5, 0x222

    invoke-static {v2, v3, v4, v5}, Lg/۟ۦۥۥۤ;->ۥۣۧۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lja/ۥۣۨ۠;->ۢۦۨ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v1

    invoke-static {v1, v2, v0}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_0
    .end sparse-switch
.end method
