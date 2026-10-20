.class public final Lk6/f7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lk6/d7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/f7;->short:[S

    return-void

    :array_0
    .array-data 2
        0x3d2s
        0x3f0s
        0x3e7s
        0x3fas
        0x3e5s
        0x3fas
        0x3e7s
        0x3eas
        0x3b3s
        0x3e1s
        0x3f6s
        0x3e0s
        0x3e6s
        0x3fes
        0x3f6s
        0x3f7s
        0x3bfs
        0x3b3s
        0x3e7s
        0x3fas
        0x3fes
        0x3f6s
        0x41ds
        0x43fs
        0x428s
        0x435s
        0x42as
        0x435s
        0x428s
        0x425s
        0x47cs
        0x42cs
        0x43ds
        0x429s
        0x42fs
        0x439s
        0x438s
        0x470s
        0x47cs
        0x428s
        0x435s
        0x431s
        0x439s
    .end array-data
.end method

.method public synthetic constructor <init>(Lk6/d7;JI)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lk6/f7;->a:I

    iput-object p1, p0, Lk6/f7;->c:Lk6/d7;

    iput-wide p2, p0, Lk6/f7;->b:J

    invoke-static {}, Lq6/۟ۥۦۡ۟;->۟ۦۥۢ()I

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "NszTVWXz8QS4nS1"

    invoke-static {v0}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۤۨۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۣ۠۟ۤ()[S
    .locals 2

    invoke-static {}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۦۣۡۡ()I

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
    sget-object v0, Lk6/f7;->short:[S

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
.method public final run()V
    .locals 9

    const/4 v8, 0x0

    invoke-static {p0}, Ldagger/hilt/ۣ۟ۧۤ۠;->ۧۥۦۧ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lr6/۟ۡ۠۟ۡ;->ۦۥۤۡ(Ljava/lang/Object;)Lk6/d7;

    move-result-object v6

    packed-switch v0, :pswitch_data_0

    invoke-static {v6}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v6}, Lu8/ۨۡ۠;->ۣ۟ۤۡۦ(Ljava/lang/Object;)V

    invoke-static {v6}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {p0}, Landroidx/lifecycle/ۧۥۡۨ;->ۡۢ۟ۤ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {v2, v3}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/f7;->ۣ۠۟ۤ()[S

    move-result-object v4

    sget v5, La/ۨۥۥۤ;->۠ۥ۟ۧ:I

    xor-int/lit8 v5, v5, -0x1e

    const/16 v7, 0x393

    invoke-static {v4, v8, v5, v7}, Lz3/ۦۤۡۤ;->۟۠ۦ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4, v1}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {}, Lh/ۥۦۡۧ;->۟۟۠ۦۨ()Lk6/x3;

    move-result-object v4

    invoke-static {v0, v1, v4}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۢۨۥۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v6}, Lp8/۟۟ۢ۟ۢ;->ۣۣ۠ۥ(Ljava/lang/Object;)Lk6/h7;

    move-result-object v4

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v6}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    invoke-static {v0}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v6}, Ll9/۟ۦۥۣۢ;->۟ۢۥۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {v4}, Landroid/support/v4/app/ۥۣۡ;->ۤ۠ۡۨ(Ljava/lang/Object;)Lk6/d7;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v4}, Lf/ۣ۟ۤۤ;->ۣ۟ۢۦ(Ljava/lang/Object;)Lk6/f6;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۥۣ۟ۢ(Ljava/lang/Object;)V

    iput-wide v2, v4, Lk6/h7;->a:J

    iput-wide v2, v4, Lk6/h7;->b:J

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {v6}, Lh0/۟ۥ۟ۡۦ;->ۣ۟۟۟۠(Ljava/lang/Object;)Ll/t;

    move-result-object v2

    invoke-static {v2}, La/ۥۦۥۡ;->۟ۤۨۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/d7;

    invoke-static {v0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v2}, Le2/۟۟ۥۦ;->ۤۨۢۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/g7;

    const v1, 0xc27e

    :goto_5
    const v3, 0xc28f

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_a
    const v1, 0xc2bc

    goto :goto_5

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_c
    invoke-static {v6}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    invoke-static {v0}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbefb

    :goto_6
    const v5, 0xbf0c

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :cond_4
    :sswitch_d
    const v0, 0xbf39

    goto :goto_6

    :sswitch_e
    if-nez v1, :cond_4

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_f
    invoke-static {v6}, Lk8/ۣ۠ۨۤ;->۟ۢۤۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v0

    invoke-static {v0}, Lr1/۟ۤۤۡ۠;->۟ۦۤ۠ۨ(Ljava/lang/Object;)Lk6/n4;

    move-result-object v0

    invoke-static {v0}, Lq9/۟ۧۦۤۨ;->۟۠۟ۥ۟(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc202

    :goto_7
    const v5, 0xc213

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_10
    if-eqz v1, :cond_5

    const v0, 0xc25f

    goto :goto_7

    :cond_5
    :sswitch_11
    const v0, 0xc240

    goto :goto_7

    :sswitch_12
    invoke-static {v4}, Landroid/support/v4/app/ۥۣۡ;->ۤ۠ۡۨ(Ljava/lang/Object;)Lk6/d7;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v4}, Lf/ۣ۟ۤۤ;->ۣ۟ۢۦ(Ljava/lang/Object;)Lk6/f6;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۥۣ۟ۢ(Ljava/lang/Object;)V

    iput-wide v2, v4, Lk6/h7;->a:J

    iput-wide v2, v4, Lk6/h7;->b:J

    goto :goto_4

    :sswitch_13
    if-eqz v0, :cond_3

    const v1, 0xc2db

    goto :goto_5

    :sswitch_14
    invoke-static {v2}, La/ۥۦۥۡ;->۟ۤۨۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk6/d7;

    invoke-static {v1}, Ly/ۤۨۧ۟;->ۨۥۤۡ(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzcp;

    move-result-object v1

    invoke-static {v1, v0}, Lc4/۟ۦۧۦۤ;->ۥۧۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_15
    invoke-static {v2}, La/ۥۦۥۡ;->۟ۤۨۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/d7;

    invoke-static {v0}, Lk8/ۣ۠ۨۤ;->۟ۢۤۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v0

    invoke-static {v0}, Lr1/۟ۤۤۡ۠;->۟ۦۤ۠ۨ(Ljava/lang/Object;)Lk6/n4;

    move-result-object v0

    invoke-static {v0, v8}, Lp0/۟ۢۤۧ;->ۤ۠ۤ۟(Ljava/lang/Object;Z)V

    invoke-static {v2}, La/ۥۦۥۡ;->۟ۤۨۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/d7;

    invoke-static {v0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    iput-boolean v8, v0, Lk6/d7;->d:Z

    invoke-static {v6}, Lg/۟ۦۥۥۤ;->۟ۥۦۨ۠(Ljava/lang/Object;)Lk6/w4;

    move-result-object v1

    invoke-static {v1}, Ln1/۟۠۟ۤۤ;->ۢۤ۟ۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/d7;

    invoke-static {v0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v1}, Ln1/۟۠۟ۤۤ;->ۢۤ۟ۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/d7;

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lt2/۟ۦۣۡۤ;->۟ۥ۟۠ۤ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    if-eqz v2, :cond_6

    const v0, 0xc5e2

    goto :goto_8

    :cond_6
    :sswitch_17
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_18
    invoke-static {v1}, Ln1/۟۠۟ۤۤ;->ۢۤ۟ۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/d7;

    invoke-static {v0}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v2

    invoke-static {v1, v2, v3, v8}, Lo2/۟ۤۨۡۥ;->ۣ۠ۦۡ(Ljava/lang/Object;JZ)V

    :sswitch_19
    invoke-static {}, Lr6/ۥۡۥۥ;->ۣۢۤۥ()I

    move-result v1

    const v0, 0xc601

    :goto_9
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_1a
    if-gtz v1, :cond_7

    const v0, 0xc65e

    goto :goto_9

    :cond_7
    :sswitch_1b
    const v0, 0xc63f

    goto :goto_9

    :sswitch_1c
    const-string v0, "NIkCzcPEfCtonj3Nt3eObpRwn"

    invoke-static {v0}, Lcom/google/firebase/messaging/۠ۨ۠ۢ;->ۣ۟ۧۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_a
    :sswitch_1d
    return-void

    :pswitch_0
    invoke-static {p0}, Landroidx/lifecycle/ۧۥۡۨ;->ۡۢ۟ۤ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {v6}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v6}, Lu8/ۨۡ۠;->ۣ۟ۤۡۦ(Ljava/lang/Object;)V

    invoke-static {v6}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v4, v5}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/f7;->ۣ۠۟ۤ()[S

    move-result-object v2

    const/16 v3, 0x16

    sget v7, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->ۧ۠ۨۦ:I

    xor-int/lit16 v7, v7, -0x287

    const/16 v8, 0x45c

    invoke-static {v2, v3, v7, v8}, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->۟ۥ۟ۥۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lt1/ۧۦۤۧ;->ۢ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v6}, Lh0/۟ۥ۟ۡۦ;->ۣ۟۟۟۠(Ljava/lang/Object;)Ll/t;

    move-result-object v1

    invoke-static {v1}, La/ۥۦۥۡ;->۟ۤۨۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/d7;

    invoke-static {v0}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۟ۤۥۦ(Ljava/lang/Object;)Le6/b;

    move-result-object v0

    check-cast v0, Le6/c;

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    new-instance v0, Lk6/g7;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v2

    invoke-direct/range {v0 .. v5}, Lk6/g7;-><init>(Ll/t;JJ)V

    iput-object v0, v1, Ll/t;->b:Ljava/lang/Object;

    invoke-static {v1}, La/ۥۦۥۡ;->۟ۤۨۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk6/d7;

    invoke-static {v1}, Ly/ۤۨۧ۟;->ۨۥۤۡ(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzcp;

    move-result-object v1

    const-wide/16 v2, -0x46c

    sget v4, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->ۥۥۤۦ:I

    int-to-long v4, v4

    xor-long/2addr v2, v4

    invoke-static {v1, v0, v2, v3}, Lk4/۟۠ۦ۟ۤ;->ۨۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    invoke-static {v6}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    invoke-static {v0}, Ll6/ۥۦۣ۟;->۟ۡ۟۟ۤ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc67d

    :goto_b
    const v2, 0xc68e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_9

    goto :goto_b

    :cond_8
    :sswitch_1e
    const v0, 0xc6bb

    goto :goto_b

    :sswitch_1f
    if-eqz v1, :cond_8

    const v0, 0xc965

    goto :goto_b

    :sswitch_20
    invoke-static {v6}, Lp8/۟۟ۢ۟ۢ;->ۣۣ۠ۥ(Ljava/lang/Object;)Lk6/h7;

    move-result-object v0

    invoke-static {v0}, Lf/ۣ۟ۤۤ;->ۣ۟ۢۦ(Ljava/lang/Object;)Lk6/f6;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۥۣ۟ۢ(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x12 -> :sswitch_a
        0x33 -> :sswitch_15
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x2d -> :sswitch_1d
        0x32 -> :sswitch_1b
        0x4c -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1e
        0x35 -> :sswitch_1d
        0xf3 -> :sswitch_1f
        0xfeb -> :sswitch_20
    .end sparse-switch
.end method
