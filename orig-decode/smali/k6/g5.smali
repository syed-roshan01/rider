.class public final synthetic Lk6/g5;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public a:Lk6/f5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/g5;->short:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x22bs
        0x23fs
        0x23es
        0x225s
    .end array-data
.end method

.method public synthetic constructor <init>(Lk6/f5;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/g5;->a:Lk6/f5;

    invoke-static {}, Lga/۟ۢۧ۟ۦ;->۟۠ۢۢۧ()I

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
    const-string v0, "mnqPoDIbE9"

    invoke-static {v0}, Lcom/google/firebase/database/collection/ۨۤ۟ۧ;->ۦۦۥۡ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟۠ۨ۠()[S
    .locals 2

    invoke-static {}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->ۣ۟۠۠ۨ()I

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
    sget-object v0, Lk6/g5;->short:[S

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
.method public final a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 6

    invoke-static {p0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->ۥۧۢۥ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v2

    invoke-static {v2}, Lv5/ۥۧ۟ۦ;->ۣ۟۟۠۟(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    invoke-static {v0}, Lc3/۟ۥ۠ۡۧ;->۠ۨۨ۠(Ljava/lang/Object;)V

    invoke-static {v2}, Lt2/۟ۦۣۡۤ;->۟ۥ۟۠ۤ(Ljava/lang/Object;)Z

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p2}, Lcom/google/firebase/remoteconfig/internal/ۨ۟۟۠;->ۣ۟ۡۦ۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-eqz p1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {p1}, Lw2/ۧۦۧ;->۟۠ۥۥ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbf39

    goto :goto_4

    :sswitch_c
    if-eqz v1, :cond_3

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_d
    invoke-static {}, Lk6/g5;->ۣ۟۠ۨ۠()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v3, Lm5/ۣۢ۟ۧ;->۟ۥۧۡۧ:I

    xor-int/lit8 v3, v3, -0x76

    const/16 v4, 0x24a

    invoke-static {v0, v1, v3, v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟ۡۤۨۧ([SIII)Ljava/lang/String;

    move-result-object p1

    :sswitch_e
    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    invoke-static {v1, p1}, Lg8/ۣۣۣ۟;->۟۠۟۟ۦ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/net/Uri$Builder;

    invoke-static {p2}, Lc1/ۣۢۧۨ;->ۤۧۢ۠(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lf0/ۣۤ۠۟;->ۧ۠۠ۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_f
    invoke-static {v3}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v4

    const v0, 0xc202

    :goto_5
    const v5, 0xc213

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_10
    if-eqz v4, :cond_4

    const v0, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_11
    const v0, 0xc240

    goto :goto_5

    :sswitch_12
    invoke-static {v3}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, v0}, Lcom/google/firebase/auth/ktx/۟ۢۥۣۢ;->ۡۤۨۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v0, v4}, Lv0/۟ۦۣ۟ۤ;->ۧۦۡۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/net/Uri$Builder;

    const v0, 0xc27e

    :goto_6
    const v4, 0xc28f

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_13
    const v0, 0xc29d

    goto :goto_6

    :sswitch_14
    invoke-static {v1}, La8/ۡۦۨۡ;->۟ۦۣۡۡ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/graphics/ۣۤۧۢ;->۠ۧۢ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :sswitch_15
    invoke-static {v0}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->ۣ۠۟ۡ(Ljava/lang/Object;)Z

    move-result v3

    const v1, 0xc2fa

    :goto_7
    const v4, 0xc30b

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_7

    goto :goto_7

    :sswitch_16
    if-nez v3, :cond_5

    const v1, 0xc5e2

    goto :goto_7

    :cond_5
    :sswitch_17
    const v1, 0xc5c3

    goto :goto_7

    :sswitch_18
    invoke-static {v2}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۣ۟۠ۢۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v1

    invoke-static {v1}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۤۤ(Ljava/lang/Object;)V

    invoke-static {v1}, Li/ۢۥۣ۟;->ۣ۟ۡۡۨ(Ljava/lang/Object;)Lj0/b0;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->۟ۥ۟ۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۤۤ(Ljava/lang/Object;)V

    invoke-static {v2}, Ln1/۟۠۟ۤۤ;->ۥۧۦۣ(Ljava/lang/Object;)Le6/c;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v2

    invoke-static {v1}, Ln7/۟ۡۢۦ;->۟ۡۢۨ۠(Ljava/lang/Object;)Lk6/p4;

    move-result-object v0

    invoke-static {v0, v2, v3}, Lt8/ۦۣ۠;->ۣۡ۟ۨ(Ljava/lang/Object;J)V

    :sswitch_19
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_19
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_15
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_d
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_18
    .end sparse-switch
.end method

.method public final b()Z
    .locals 3

    invoke-static {p0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->ۥۧۢۥ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣۤۡۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->ۣ۠۟ۡ(Ljava/lang/Object;)Z

    move-result v2

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
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v1}, Lcom/google/firebase/ktx/ۨۢۤۧ;->ۣ۟۠ۥۧ(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Le1/۟ۡۡۤۡ;->ۥۦۨ۟(Ljava/lang/Object;)V

    sget v1, Le1/۟ۢ۟ۤۡ;->ۨ۠ۡ۟:I

    xor-int/lit16 v1, v1, 0x2e7

    invoke-static {v0, v1}, Ls7/ۧۤۦۤ;->ۥۣۡ(Ljava/lang/Object;I)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x1

    :goto_2
    return v0

    :sswitch_6
    const/4 v0, 0x0

    goto :goto_2

    nop

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
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method public final c()Z
    .locals 4

    invoke-static {p0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->ۥۧۢۥ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v0

    invoke-static {v0}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۣ۟۠ۢۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v0

    invoke-static {v0}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۤۤ(Ljava/lang/Object;)V

    invoke-static {v0}, Ln7/۟ۡۢۦ;->۟ۡۢۨ۠(Ljava/lang/Object;)Lk6/p4;

    move-result-object v0

    invoke-static {v0}, Ln7/۟ۡۢۦ;->۟۠ۦۧۢ(Ljava/lang/Object;)J

    move-result-wide v2

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
    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x1

    :goto_1
    return v0

    :sswitch_3
    const/4 v0, 0x0

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public final d()Z
    .locals 12

    const-wide/16 v10, 0xc

    const/4 v0, 0x0

    invoke-static {p0}, Landroidx/compose/ui/semantics/ۣ۟ۦ۠ۢ;->ۣۡ۟ۦ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->ۥۧۢۥ(Ljava/lang/Object;)Lk6/f5;

    move-result-object v1

    invoke-static {v1}, Ln1/۟۠۟ۤۤ;->ۥۧۦۣ(Ljava/lang/Object;)Le6/c;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lr6/۟ۡ۠۟ۡ;->۟ۥۤ۟۠()J

    move-result-wide v2

    invoke-static {v1}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۣ۟۠ۢۡ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v4

    invoke-static {v4}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۤۤ(Ljava/lang/Object;)V

    invoke-static {v4}, Ln7/۟ۡۢۦ;->۟ۡۢۨ۠(Ljava/lang/Object;)Lk6/p4;

    move-result-object v4

    invoke-static {v4}, Ln7/۟ۡۢۦ;->۟۠ۦۧۢ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {}, Ldagger/hilt/android/۟ۤ۟ۡۦ;->۟ۥۨۧ()Lk6/x3;

    move-result-object v6

    invoke-static {v1}, Lu7/ۣ۟ۡ۟;->۟۟ۢ۟ۨ(Ljava/lang/Object;)Lk6/f;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v1, v7, v6}, Lp8/۟۟ۢ۟ۢ;->۟ۡ۠ۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v6

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    sub-long v8, v2, v10

    sub-long/2addr v8, v4

    add-long/2addr v8, v10

    cmp-long v1, v8, v6

    if-lez v1, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/4 v0, 0x1

    :sswitch_6
    return v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_6
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method
