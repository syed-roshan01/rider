.class public final Lk6/n7;
.super Ljava/lang/Object;


# instance fields
.field public a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

.field public b:Ljava/util/ArrayList;

.field public c:Ljava/util/ArrayList;

.field public d:J

.field public final e:Lk6/p7;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/p7;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/n7;->e:Lk6/p7;

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۦۤۢ۠()I

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
    const-string v0, "cfmgxrj"

    invoke-static {v0}, Lg3/۟ۥۣۣۥ;->۟ۢۧۧ۠(Ljava/lang/String;)Ljava/lang/String;

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


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/zzfi$zzj;)V
    .locals 0

    invoke-static {p1}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    iput-object p1, p0, Lk6/n7;->a:Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/measurement/zzfi$zze;J)Z
    .locals 8

    invoke-static {p1}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    invoke-static {p0}, Lj6/ۣۦۢ۠;->۟ۥۣ۠۠(Ljava/lang/Object;)Ljava/util/ArrayList;

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
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk6/n7;->c:Ljava/util/ArrayList;

    :sswitch_3
    invoke-static {p0}, Ld1/ۣۣ۟ۢۨ;->۟ۢۧ۟ۧ(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk6/n7;->b:Ljava/util/ArrayList;

    :sswitch_7
    invoke-static {p0}, Lj6/ۣۦۢ۠;->۟ۥۣ۠۠(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۢۦ۠ۤ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_8
    if-nez v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_2

    :sswitch_a
    invoke-static {p0}, Lj6/ۣۦۢ۠;->۟ۥۣ۠۠(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->۟۟ۤۢۨ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfi$zze;

    invoke-static {v0}, Lk3/ۦ۠ۢۥ;->ۢۢۥۥ(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long/2addr v0, v2

    const-wide/16 v2, 0x3c

    div-long v2, v0, v2

    invoke-static {p1}, Lk3/ۦ۠ۢۥ;->ۢۢۥۥ(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/16 v4, 0x3e8

    div-long/2addr v0, v4

    const-wide/16 v4, 0x3c

    div-long/2addr v0, v4

    const-wide/16 v4, 0x3c

    div-long v4, v0, v4

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_3

    :sswitch_c
    cmp-long v0, v2, v4

    if-eqz v0, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_d
    const/4 v0, 0x0

    :goto_4
    return v0

    :sswitch_e
    invoke-static {p0}, Lx7/۟۟ۦۨۡ;->۟ۦۣۤۤ(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/16 v2, 0x16

    sub-long/2addr v0, v2

    invoke-static {p1}, Lx8/ۢۨۥۨ;->ۦ۟ۦۦ(Ljava/lang/Object;)I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/16 v2, 0x16

    add-long/2addr v2, v0

    invoke-static {p0}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->ۣۣ۟۠ۨ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->ۡ۠ۦۡ(Ljava/lang/Object;)Lk6/f;

    const/4 v4, 0x0

    invoke-static {}, Li6/۟۟ۦۨۧ;->ۣ۟۠۟ۧ()Lk6/x3;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v0, v5}, Le2/۟ۤۢۦ;->۟ۦۦۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ln9/ۤۧۧۤ;->ۣۣۧ۠(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v4, v0}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v0

    int-to-long v4, v0

    const v0, 0xbefb

    :goto_5
    const v6, 0xbf0c

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_f
    const v0, 0xbf39

    goto :goto_5

    :sswitch_10
    cmp-long v0, v2, v4

    if-ltz v0, :cond_4

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_11
    const/4 v0, 0x0

    goto :goto_4

    :sswitch_12
    iput-wide v2, p0, Lk6/n7;->d:J

    invoke-static {p0}, Lj6/ۣۦۢ۠;->۟ۥۣ۠۠(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0, p1}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {p0}, Ld1/ۣۣ۟ۢۨ;->۟ۢۧ۟ۧ(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p2, p3}, Lu8/ۨۡ۠;->۟ۥ۠ۧ(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v2}, Lm7/ۥۨۥ۟;->۟۠۟۠ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-static {p0}, Lj6/ۣۦۢ۠;->۟ۥۣ۠۠(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v1}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->ۡ۠ۦۡ(Ljava/lang/Object;)Lk6/f;

    const/4 v1, 0x1

    invoke-static {}, Lh4/ۣ۟ۢۢۡ;->۠۠ۢۡ()Lk6/x3;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v3}, Le2/۟ۤۢۦ;->۟ۦۦۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ln9/ۤۧۧۤ;->ۣۣۧ۠(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v1, v0}, Lc1/ۣۡۢۦ;->ۣ۟۠ۦۧ(II)I

    move-result v1

    const v0, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_13
    if-lt v2, v1, :cond_5

    const v0, 0xc25f

    goto :goto_6

    :cond_5
    :sswitch_14
    const v0, 0xc240

    goto :goto_6

    :sswitch_15
    const/4 v0, 0x0

    goto/16 :goto_4

    :sswitch_16
    const/4 v0, 0x1

    goto/16 :goto_4

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
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_e
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_f
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_10
        0x7eef -> :sswitch_11
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_16
    .end sparse-switch
.end method
