.class public final Lk6/a8;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Lcom/google/android/gms/internal/measurement/zzfi$zzl;

.field public final d:Ljava/util/BitSet;

.field public final e:Ljava/util/BitSet;

.field public final f:Ljava/util/Map;

.field public final g:Lq/f;

.field public final h:Lk6/z7;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/z7;Ljava/lang/String;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/a8;->h:Lk6/z7;

    iput-object p2, p0, Lk6/a8;->a:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk6/a8;->b:Z

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    iput-object v0, p0, Lk6/a8;->d:Ljava/util/BitSet;

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    iput-object v0, p0, Lk6/a8;->e:Ljava/util/BitSet;

    new-instance v0, Lq/f;

    invoke-direct {v0, v1}, Lq/f;-><init>(I)V

    iput-object v0, p0, Lk6/a8;->f:Ljava/util/Map;

    new-instance v0, Lq/f;

    invoke-direct {v0, v1}, Lq/f;-><init>(I)V

    iput-object v0, p0, Lk6/a8;->g:Lq/f;

    invoke-static {}, Lo4/۟۟ۡۧۤ;->ۣۦۧۥ()I

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
    const-string v0, "g0Okay"

    invoke-static {v0}, Lk1/ۨ۟ۧۡ;->ۨۦۡۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public constructor <init>(Lk6/z7;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/zzfi$zzl;Ljava/util/BitSet;Ljava/util/BitSet;Lq/f;Lq/f;)V
    .locals 5

    const/4 v4, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/a8;->h:Lk6/z7;

    iput-object p2, p0, Lk6/a8;->a:Ljava/lang/String;

    iput-object p4, p0, Lk6/a8;->d:Ljava/util/BitSet;

    iput-object p5, p0, Lk6/a8;->e:Ljava/util/BitSet;

    iput-object p6, p0, Lk6/a8;->f:Ljava/util/Map;

    new-instance v0, Lq/f;

    invoke-direct {v0, v4}, Lq/f;-><init>(I)V

    iput-object v0, p0, Lk6/a8;->g:Lq/f;

    invoke-static {p7}, La2/ۢۦۧۦ;->ۥۨۨۧ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Lq/c;

    invoke-static {v0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۧۧۥ;->ۣۡۨۡ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :sswitch_0
    invoke-static {v2}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_2
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_3
    invoke-static {v2}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Integer;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p7, v1}, Lcom/google/firebase/measurement/ۧۤۦۧ;->۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-static {v3, v0}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {p0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->۟ۦۧۨ۠(Ljava/lang/Object;)Lq/f;

    move-result-object v0

    invoke-static {v0, v1, v3}, Lg3/۟ۥۣۣۥ;->۠۠ۡۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_5
    iput-boolean v4, p0, Lk6/a8;->b:Z

    iput-object p3, p0, Lk6/a8;->c:Lcom/google/android/gms/internal/measurement/zzfi$zzl;

    invoke-static {}, Lv6/۟ۦۣۧۦ;->۟۟۠۟ۤ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-gtz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const-string v0, "HzHlcvdqGeUkt"

    invoke-static {v0}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->ۤۨۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_9
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lk6/d;)V
    .locals 10

    const-wide/16 v8, 0x3e8

    invoke-static {p1}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->۟ۦۨۨۥ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p1}, Lo1/۟ۡۡۦۣ;->ۤۡۥۤ(Ljava/lang/Object;)Ljava/lang/Boolean;

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lr7/۟۟ۡ۟ۢ;->ۨۦۣۢ(Ljava/lang/Object;)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {v1}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v0, v2, v1}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۥۣۧ۠(Ljava/lang/Object;IZ)V

    :sswitch_3
    invoke-static {p1}, Lv5/ۧۥۢۡ;->ۣۤۨۨ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {p0}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->۟۠ۧۦۤ(Ljava/lang/Object;)Ljava/util/BitSet;

    move-result-object v0

    invoke-static {v1}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {v0, v2, v1}, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۥۣۧ۠(Ljava/lang/Object;IZ)V

    :sswitch_7
    invoke-static {p1}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->۟ۢ۟۟ۡ(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_8
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_2

    :sswitch_a
    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0}, Lf0/ۣۦۦ۠;->۟ۢۤ۟۠(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v3, v0}, Lz3/ۦۤۡۤ;->ۥۢ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-static {p1}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->۟ۢ۟۟ۡ(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lz7/۠ۡ۟ۦ;->۟۠ۢۡ۠(Ljava/lang/Object;)J

    move-result-wide v4

    div-long/2addr v4, v8

    const v1, 0xbe7f

    :goto_3
    const v6, 0xbe90

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_b
    const v1, 0xbebd

    goto :goto_3

    :sswitch_c
    if-eqz v0, :cond_3

    const v1, 0xbedc

    goto :goto_3

    :sswitch_d
    invoke-static {v0}, Lz7/۠ۡ۟ۦ;->۟۠ۢۡ۠(Ljava/lang/Object;)J

    move-result-wide v6

    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_4
    :sswitch_e
    const v0, 0xbf39

    goto :goto_4

    :sswitch_f
    cmp-long v0, v4, v6

    if-lez v0, :cond_4

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_10
    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v4, v5}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v3, v0, v1}, Ld1/۟۟ۥۡۡ;->۟ۤۧۦ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_11
    invoke-static {p1}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۠ۡۥۡ(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v1

    const v0, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_12
    if-eqz v1, :cond_5

    const v0, 0xc25f

    goto :goto_5

    :cond_5
    :sswitch_13
    const v0, 0xc240

    goto :goto_5

    :sswitch_14
    invoke-static {p0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->۟ۦۧۨ۠(Ljava/lang/Object;)Lq/f;

    move-result-object v3

    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/google/firebase/measurement/ۧۤۦۧ;->۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const v1, 0xc27e

    :goto_6
    const v4, 0xc28f

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_6

    goto :goto_6

    :cond_6
    :sswitch_15
    const v1, 0xc2bc

    goto :goto_6

    :sswitch_16
    if-nez v0, :cond_6

    const v1, 0xc2db

    goto :goto_6

    :sswitch_17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2}, Lc0/ۦۢۦۥ;->۟۠ۡۧۥ(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3, v1, v0}, Lg3/۟ۥۣۣۥ;->۠۠ۡۨ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_18
    invoke-static {p1}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->۟۠۠۟ۡ(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc2fa

    :goto_7
    const v3, 0xc30b

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_7

    goto :goto_7

    :sswitch_19
    if-eqz v2, :cond_7

    const v1, 0xc5e2

    goto :goto_7

    :cond_7
    :sswitch_1a
    const v1, 0xc5c3

    goto :goto_7

    :sswitch_1b
    invoke-static {v0}, Landroidx/compose/foundation/layout/ۧۦۧۦ;->ۥ۠ۨۢ(Ljava/lang/Object;)V

    :sswitch_1c
    invoke-static {}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۨۢۤۨ()Z

    move-result v2

    invoke-static {p0}, Ls8/ۣۡۡ۠;->ۣ۟ۧۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Laa/ۣۣ۟۟;->۟ۢۤ۠ۢ(Ljava/lang/Object;)Lk6/z7;

    move-result-object v4

    const v1, 0xc601

    :goto_8
    const v5, 0xc612

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_8

    goto :goto_8

    :sswitch_1d
    if-eqz v2, :cond_8

    const v1, 0xc65e

    goto :goto_8

    :cond_8
    :sswitch_1e
    const v1, 0xc63f

    goto :goto_8

    :sswitch_1f
    invoke-static {v4}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v1

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۢ۠۠ۤ()Lk6/x3;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۢۨۥۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc67d

    :goto_9
    const v5, 0xc68e

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_9

    goto :goto_9

    :cond_9
    :sswitch_20
    const v1, 0xc6bb

    goto :goto_9

    :sswitch_21
    if-eqz v2, :cond_9

    const v1, 0xc965

    goto :goto_9

    :sswitch_22
    invoke-static {p1}, Lcom/google/android/datatransport/cct/ۨۡ۠ۦ;->۟۠ۤۦ۟(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc984

    :goto_a
    const v5, 0xc995

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_a

    goto :goto_a

    :sswitch_23
    if-eqz v2, :cond_a

    const v1, 0xc9e1

    goto :goto_a

    :cond_a
    :sswitch_24
    const v1, 0xc9c2

    goto :goto_a

    :sswitch_25
    invoke-static {v0}, Landroidx/compose/foundation/layout/ۧۦۧۦ;->ۥ۠ۨۢ(Ljava/lang/Object;)V

    :sswitch_26
    invoke-static {}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۨۢۤۨ()Z

    move-result v2

    const v1, 0xca00

    :goto_b
    const v5, 0xca11

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_b

    goto :goto_b

    :cond_b
    :sswitch_27
    const v1, 0xca3e

    goto :goto_b

    :sswitch_28
    if-eqz v2, :cond_b

    const v1, 0xca5d

    goto :goto_b

    :sswitch_29
    invoke-static {v4}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v1

    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۢ۠۠ۤ()Lk6/x3;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۢۨۥۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xca7c

    :goto_c
    const v3, 0xca8d

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_c

    goto :goto_c

    :sswitch_2a
    if-eqz v2, :cond_c

    const v1, 0xcd64

    goto :goto_c

    :cond_c
    :sswitch_2b
    const v1, 0xcd45

    goto :goto_c

    :sswitch_2c
    invoke-static {p1}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۠ۡۥۡ(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lz7/۠ۡ۟ۦ;->۟۠ۢۡ۠(Ljava/lang/Object;)J

    move-result-wide v2

    div-long/2addr v2, v8

    invoke-static {v2, v3}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۡ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v1, 0xcd83

    :goto_d
    const v5, 0xcd94

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_d

    goto :goto_d

    :sswitch_2d
    if-nez v4, :cond_d

    const v1, 0xcde0

    goto :goto_d

    :cond_d
    :sswitch_2e
    const v1, 0xcdc1

    goto :goto_d

    :sswitch_2f
    invoke-static {v2, v3}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Ll9/۟ۦۥۣۢ;->۟ۢ۟ۡۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :goto_e
    :sswitch_30
    return-void

    :sswitch_31
    invoke-static {p1}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۠ۡۥۡ(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1}, Lz7/۠ۡ۟ۦ;->۟۠ۢۡ۠(Ljava/lang/Object;)J

    move-result-wide v2

    div-long/2addr v2, v8

    invoke-static {v2, v3}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Ll9/۟ۦۥۣۢ;->۟ۢ۟ۡۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_e

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_11
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_10
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_12
        0x32 -> :sswitch_13
        0x4c -> :sswitch_14
        0x53 -> :sswitch_30
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_15
        0x33 -> :sswitch_18
        0x54 -> :sswitch_17
        0xf1 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_19
        0x6af -> :sswitch_1a
        0x6c8 -> :sswitch_1c
        0x6e9 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1d
        0x2d -> :sswitch_26
        0x32 -> :sswitch_1e
        0x4c -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_20
        0x35 -> :sswitch_26
        0xf3 -> :sswitch_21
        0xfeb -> :sswitch_22
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_23
        0x36 -> :sswitch_24
        0x57 -> :sswitch_26
        0x74 -> :sswitch_25
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_27
        0x11 -> :sswitch_28
        0x2f -> :sswitch_31
        0x4c -> :sswitch_29
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_2a
        0x7ab -> :sswitch_2b
        0x7c8 -> :sswitch_31
        0x7e9 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_2d
        0x36 -> :sswitch_2e
        0x55 -> :sswitch_30
        0x74 -> :sswitch_2f
    .end sparse-switch
.end method
