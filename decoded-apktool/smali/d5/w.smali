.class public final Ld5/w;
.super Landroid/content/BroadcastReceiver;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lm0/f1;

.field public final c:Lm0/g1;

.field public final d:Lm0/g1;

.field public final e:Lm0/d1;

.field public final f:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x68

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/w;->short:[S

    return-void

    :array_0
    .array-data 2
        0xa64s
        0xa79s
        0xa75s
        0xa73s
        0xa60s
        0xa5es
        0xa65s
        0xa6es
        0xa76s
        0xa6fs
        0xa6ds
        0xa6es
        0xa60s
        0xa65s
        0xa5es
        0xa68s
        0xa65s
        0x9ccs
        0x9c7s
        0x9dfs
        0x9c6s
        0x9c4s
        0x9c7s
        0x9c9s
        0x9ccs
        0xb06s
        0xb1ds
        0xb04s
        0xb04s
        0xb48s
        0xb0bs
        0xb09s
        0xb06s
        0xb06s
        0xb07s
        0xb1cs
        0xb48s
        0xb0as
        0xb0ds
        0xb48s
        0xb0bs
        0xb09s
        0xb1bs
        0xb1cs
        0xb48s
        0xb1cs
        0xb07s
        0xb48s
        0xb06s
        0xb07s
        0xb06s
        0xb45s
        0xb06s
        0xb1ds
        0xb04s
        0xb04s
        0xb48s
        0xb1cs
        0xb11s
        0xb18s
        0xb0ds
        0xb48s
        0xb09s
        0xb06s
        0xb0cs
        0xb1as
        0xb07s
        0xb01s
        0xb0cs
        0xb46s
        0xb09s
        0xb18s
        0xb18s
        0xb46s
        0xb2cs
        0xb07s
        0xb1fs
        0xb06s
        0xb04s
        0xb07s
        0xb09s
        0xb0cs
        0xb25s
        0xb09s
        0xb06s
        0xb09s
        0xb0fs
        0xb0ds
        0xb1as
        0x6f6s
        0x6f1s
        0x6e4s
        0x6f1s
        0x6f0s
        0x6f6s
        0xcd6s
        0xcd5s
        0xcd9s
        0xcdbs
        0xcd6s
        0xce5s
        0xccfs
        0xcc8s
        0xcd3s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lm0/f1;Lm0/g1;Lm0/g1;Lm0/d1;Lm0/g1;)V
    .locals 2

    iput-object p1, p0, Ld5/w;->a:Landroid/content/Context;

    iput-object p2, p0, Ld5/w;->b:Lm0/f1;

    iput-object p3, p0, Ld5/w;->c:Lm0/g1;

    iput-object p4, p0, Ld5/w;->d:Lm0/g1;

    iput-object p5, p0, Ld5/w;->e:Lm0/d1;

    iput-object p6, p0, Ld5/w;->f:Lm0/g1;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    invoke-static {}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۧۦۨ۟()I

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
    const-string v0, "Nso4COpZKGATPfdtWIqooWB"

    invoke-static {v0}, Lt2/۟ۢ۟ۢ۟;->ۣ۟۟ۧۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۣۣ۟ۧۡ()[S
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Ld5/w;->short:[S

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
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    const/4 v7, 0x0

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
    if-eqz p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ld5/w;->ۣۣ۟ۧۡ()[S

    move-result-object v0

    sget v1, Lm0/۟ۤۡۤۤ;->ۢ۟ۨۢ:I

    xor-int/lit16 v1, v1, 0x338

    const/16 v2, 0xa01

    invoke-static {v0, v7, v1, v2}, Lc6/۟ۧۧ۠ۤ;->ۢۦۡۡ([SIII)Ljava/lang/String;

    move-result-object v0

    const-wide/16 v2, 0x7

    sget v1, La7/۠ۢۧ;->۟۟ۧ۟ۡ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {p2, v0, v2, v3}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->ۧۥ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v1, v0

    :goto_2
    invoke-static {p0}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->ۤۧۡۥ(Ljava/lang/Object;)Lm0/f1;

    move-result-object v0

    check-cast v0, Lm0/w2;

    invoke-static {v0}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->ۧۨۡ۠(Ljava/lang/Object;)J

    move-result-wide v4

    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-nez v1, :cond_1

    const v2, 0xbe60

    goto :goto_3

    :sswitch_6
    const/4 v0, 0x0

    move-object v1, v0

    goto :goto_2

    :cond_1
    :sswitch_7
    const v2, 0xbe41

    goto :goto_3

    :sswitch_8
    const v0, 0xbe7f

    :goto_4
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :goto_5
    :sswitch_9
    return-void

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_4

    :sswitch_b
    invoke-static {v1}, Lz7/۠ۡ۟ۦ;->۟۠ۢۡ۠(Ljava/lang/Object;)J

    move-result-wide v2

    const v1, 0xbefb

    :goto_6
    const v6, 0xbf0c

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_c
    const v1, 0xbf39

    goto :goto_6

    :sswitch_d
    cmp-long v1, v2, v4

    if-nez v1, :cond_2

    const v1, 0xc1e3

    goto :goto_6

    :sswitch_e
    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p0}, Lcom/google/android/gms/internal/tasks/ۣۧۧۡ;->ۣ۟۠۟۟(Ljava/lang/Object;)Lm0/g1;

    move-result-object v2

    invoke-static {v2, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p0}, Le8/۟۠ۦ۟ۢ;->ۣ۟ۡۦ۠(Ljava/lang/Object;)Lm0/g1;

    move-result-object v2

    invoke-static {v2, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/firebase/measurement/ۧۤۦۧ;->ۧ۠ۥۢ(Ljava/lang/Object;)Lm0/d1;

    move-result-object v1

    check-cast v1, Lm0/s2;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۣ۟ۢۦۡ(Ljava/lang/Object;F)V

    invoke-static {p0}, La/ۥۡۢۨ;->۟ۦ۟۟۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Ld5/w;->ۣۣ۟ۧۡ()[S

    move-result-object v2

    const/16 v3, 0x11

    sget v4, Lz3/۟ۢۢ۟ۢ;->ۤۢۤۤ:I

    xor-int/lit16 v4, v4, 0xec

    const/16 v5, 0x9a8

    invoke-static {v2, v3, v4, v5}, Lc3/۟ۡۧۢۥ;->۟ۡۦۦۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Ld4/۟۠۠۟ۢ;->۟ۤ۟ۧۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Ld5/w;->ۣۣ۟ۧۡ()[S

    move-result-object v2

    const/16 v3, 0x19

    sget v4, Lq6/ۣ۟ۢ۟ۤ;->ۡ۠ۢۦ:I

    xor-int/lit16 v4, v4, -0x2df

    const/16 v5, 0xb68

    invoke-static {v2, v3, v4, v5}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۦ۟ۢ۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lh3/۟ۡۥ۠۠;->۟۠۟ۢۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    check-cast v1, Landroid/app/DownloadManager;

    new-instance v2, Landroid/app/DownloadManager$Query;

    invoke-direct {v2}, Landroid/app/DownloadManager$Query;-><init>()V

    const/4 v3, 0x1

    new-array v3, v3, [J

    invoke-static {v0}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->ۧۨۡ۠(Ljava/lang/Object;)J

    move-result-wide v4

    aput-wide v4, v3, v7

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->ۥۣۡۢ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/app/DownloadManager$Query;

    move-result-object v0

    invoke-static {v1, v0}, Lh0/۟ۥ۟ۡۦ;->۟ۥۣۡۦ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/database/Cursor;

    move-result-object v2

    const v0, 0xc202

    :goto_7
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_f
    if-eqz v2, :cond_3

    const v0, 0xc25f

    goto :goto_7

    :cond_3
    :sswitch_10
    const v0, 0xc240

    goto :goto_7

    :sswitch_11
    invoke-static {v2}, Lh8/۟ۤۨۨۦ;->ۣۣۤۨ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc27e

    :goto_8
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_8

    :cond_4
    :sswitch_12
    const v0, 0xc2bc

    goto :goto_8

    :sswitch_13
    if-eqz v1, :cond_4

    const v0, 0xc2db

    goto :goto_8

    :sswitch_14
    invoke-static {}, Ld5/w;->ۣۣ۟ۧۡ()[S

    move-result-object v0

    const/16 v1, 0x59

    sget v3, Lb7/ۣ۟۟ۦ۟;->۟ۥ۟ۢۨ:I

    xor-int/lit16 v3, v3, 0x148

    const/16 v4, 0x685

    invoke-static {v0, v1, v3, v4}, Lh8/۟ۨۧ;->۟ۢۧۢۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lm0/۟ۤۡۤۤ;->ۥۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-static {v2, v0}, Lq7/۟ۢۢ۟ۧ;->۟۠ۢۢ۠(Ljava/lang/Object;I)I

    move-result v1

    const v0, 0xc2fa

    :goto_9
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_15
    const/16 v0, 0x8

    if-ne v1, v0, :cond_5

    const v0, 0xc5e2

    goto :goto_9

    :cond_5
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_9

    :sswitch_17
    invoke-static {}, Ld5/w;->ۣۣ۟ۧۡ()[S

    move-result-object v0

    const/16 v1, 0x5f

    sget v3, Lp0/۟ۢۤۧ;->۟ۢ۠ۦۦ:I

    xor-int/lit16 v3, v3, -0x354

    const/16 v4, 0xcba

    invoke-static {v0, v1, v3, v4}, Lw4/ۥۤ۟۠;->۟۟۠ۤ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lm0/۟ۤۡۤۤ;->ۥۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    invoke-static {v2, v0}, Lc4/۟ۦۧۦۤ;->ۥۥۣۤ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    const v0, 0xc601

    :goto_a
    const v3, 0xc612

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    if-eqz v1, :cond_6

    const v0, 0xc65e

    goto :goto_a

    :cond_6
    :sswitch_19
    const v0, 0xc63f

    goto :goto_a

    :sswitch_1a
    invoke-static {v1}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۧ۟۟ۡ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ld7/ۢۧۧۢ;->ۣۡ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const v1, 0xc67d

    :goto_b
    const v3, 0xc68e

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_9

    goto :goto_b

    :cond_7
    :sswitch_1b
    const v1, 0xc6bb

    goto :goto_b

    :sswitch_1c
    if-nez v0, :cond_7

    const v1, 0xc965

    goto :goto_b

    :sswitch_1d
    invoke-static {}, Lv/ۣۢ۟ۧ;->ۤ۠ۦۦ()Ljava/lang/String;

    move-result-object v0

    :sswitch_1e
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lh7/۟۟ۧۨ۟;->ۣ۟ۡۢۦ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    invoke-static {v0, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1f
    const v0, 0xc984

    :goto_c
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_c

    :sswitch_20
    if-eqz v2, :cond_8

    const v0, 0xc9e1

    goto :goto_c

    :cond_8
    :sswitch_21
    const v0, 0xc9c2

    goto :goto_c

    :sswitch_22
    invoke-static {v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۣۨ۠(Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_9
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_1f
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_1f
        0x6e9 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1f
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_1e
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_20
        0x36 -> :sswitch_21
        0x57 -> :sswitch_9
        0x74 -> :sswitch_22
    .end sparse-switch
.end method
