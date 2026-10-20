.class public final Lf5/v;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# static fields
.field private static final short:[S


# instance fields
.field public a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x7d

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/v;->short:[S

    return-void

    :array_0
    .array-data 2
        0xb22s
        0xb20s
        0xb2ds
        0xb2ds
        0xb61s
        0xb35s
        0xb2es
        0xb61s
        0xb66s
        0xb33s
        0xb24s
        0xb32s
        0xb34s
        0xb2cs
        0xb24s
        0xb66s
        0xb61s
        0xb23s
        0xb24s
        0xb27s
        0xb2es
        0xb33s
        0xb24s
        0xb61s
        0xb66s
        0xb28s
        0xb2fs
        0xb37s
        0xb2es
        0xb2as
        0xb24s
        0xb66s
        0xb61s
        0xb36s
        0xb28s
        0xb35s
        0xb29s
        0xb61s
        0xb22s
        0xb2es
        0xb33s
        0xb2es
        0xb34s
        0xb35s
        0xb28s
        0xb2fs
        0xb24s
        0x4fcs
        0x4d4s
        0x4d8s
        0x4d0s
        0x4d5s
        0x499s
        0x4d7s
        0x4d6s
        0x4cds
        0x499s
        0x4cfs
        0x4dcs
        0x4cbs
        0x4d0s
        0x4dfs
        0x4d0s
        0x4dcs
        0x4dds
        0x499s
        0x4c0s
        0x4dcs
        0x4cds
        0x497s
        0x499s
        0x4e9s
        0x4d5s
        0x4dcs
        0x4d8s
        0x4cas
        0x4dcs
        0x499s
        0x4das
        0x4d1s
        0x4dcs
        0x4das
        0x4d2s
        0x499s
        0x4c0s
        0x4d6s
        0x4ccs
        0x4cbs
        0x499s
        0x4d0s
        0x4d7s
        0x4dbs
        0x4d6s
        0x4c1s
        0x497s
        0x473s
        0x454s
        0x45cs
        0x459s
        0x450s
        0x451s
        0x415s
        0x441s
        0x45as
        0x415s
        0x456s
        0x45ds
        0x450s
        0x456s
        0x45es
        0x415s
        0x443s
        0x450s
        0x447s
        0x45cs
        0x453s
        0x45cs
        0x456s
        0x454s
        0x441s
        0x45cs
        0x45as
        0x45bs
        0x40fs
        0x415s
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/v;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    sget v0, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣۣ۟۠۟:I

    xor-int/lit16 v0, v0, 0x23a

    invoke-direct {p0, v0, p2}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۦۨۧۥ()I

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
    const-string v0, "e58Jy82dGbqJAlg5Dg04bq"

    invoke-static {v0}, Lcom/google/firebase/iid/ۣۨۥۣ;->ۢۢۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۦۧۥ۟()[S
    .locals 2

    invoke-static {}, Lja/ۥۣۨ۠;->۟ۡۨ۠ۢ()I

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
    sget-object v0, Lf5/v;->short:[S

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
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e6\u06e4\u06e1"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-object p0

    :sswitch_0
    invoke-static {p0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۨۢۢ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e8\u06e4\u06df"

    goto :goto_0

    :sswitch_1
    new-instance p0, Lf5/v;

    invoke-direct {p0, v0, p2}, Lf5/v;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V

    const-string v1, "\u06e2\u06e6"

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1ac1e3 -> :sswitch_0
        0x1ac963 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e0\u06e7\u06e8"

    move-object v1, p1

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v2, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e2\u06e7\u06e5"

    move-object v5, v0

    goto :goto_0

    :sswitch_0
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e4\u06e3\u06e0"

    move-object v4, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0, v5}, Lr5/۟ۤۨۥۡ;->۟۟ۦ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e0\u06df\u06e1"

    move-object v6, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e1\u06df\u06e0"

    move-object v3, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v3, v4}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->۠ۤۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e2\u06e3\u06e7"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v2

    check-cast v0, Lf5/v;

    const-string v6, "\u06e0\u06e7\u06e0"

    move-object p0, v0

    goto :goto_0

    :sswitch_5
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaac2 -> :sswitch_5
        0x1aabc1 -> :sswitch_2
        0x1aae82 -> :sswitch_0
        0x1ab2c6 -> :sswitch_4
        0x1ab340 -> :sswitch_1
        0x1aba41 -> :sswitch_3
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/4 v6, 0x1

    const/4 v5, 0x0

    const/4 v4, 0x0

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v0

    invoke-static {p0}, Lh/ۢۢۨۨ;->ۣۡۦۣ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۟ۨۢۢ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v3

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
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ne v2, v6, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    :try_start_0
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    move-object v0, p1

    :goto_3
    check-cast v0, Ljava/lang/Void;

    :sswitch_8
    invoke-static {}, Lv0/۟ۤۧ۠ۧ;->۟ۤۨۤۨ()Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-static {v0}, Lf6/ۣۣۣۣ۟;->ۣ۟۟ۨۦ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseUser;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    const v0, 0xc2fa

    :goto_4
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :sswitch_9
    if-eqz v1, :cond_5

    const v0, 0xc5e2

    goto :goto_4

    :catch_0
    move-exception v0

    const v1, 0xbe7f

    :goto_5
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :sswitch_a
    invoke-static {v3}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {}, Lf5/v;->ۦۧۥ۟()[S

    move-result-object v4

    const/16 v5, 0x5f

    sget v6, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۢۦۦ:I

    xor-int/lit8 v6, v6, -0x5c

    const/16 v7, 0x435

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/ۧۥۡۨ;->ۣ۟ۥۥۦ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->۟ۤۦۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lv0/ۣ۟۟ۤۧ;->ۨۥۣۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v3}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {v1, v0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_b
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    :sswitch_c
    return-object v0

    :sswitch_d
    const v1, 0xbe9e

    goto :goto_5

    :sswitch_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lf5/v;->ۦۧۥ۟()[S

    move-result-object v1

    sget v2, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۧۦۨۦ:I

    xor-int/lit16 v2, v2, 0x39f

    const/16 v3, 0xb41

    invoke-static {v1, v5, v2, v3}, Lu8/ۨۡ۠;->ۨۢۢۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_f
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    invoke-static {v1, v4}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :try_start_1
    invoke-static {v3}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v1

    invoke-static {v1}, Landroidx/appcompat/widget/ۣۡۧۤ;->۟ۦۡۡۢ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v1

    invoke-static {v1}, Lf6/ۣۣۣۣ۟;->ۣ۟۟ۨۦ(Ljava/lang/Object;)Lcom/google/firebase/auth/FirebaseUser;

    move-result-object v2

    const v1, 0xbefb

    :goto_6
    const v4, 0xbf0c

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :cond_2
    :sswitch_10
    const v1, 0xbf39

    goto :goto_6

    :sswitch_11
    if-eqz v2, :cond_2

    const v1, 0xc1e3

    goto :goto_6

    :sswitch_12
    invoke-static {v2}, Landroidx/lifecycle/ۧۥۡۨ;->۟ۨۥۢ(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    const v1, 0xc202

    :goto_7
    const v4, 0xc213

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_13
    if-eqz v2, :cond_3

    const v1, 0xc25f

    goto :goto_7

    :cond_3
    :sswitch_14
    const v1, 0xc240

    goto :goto_7

    :sswitch_15
    const/4 v1, 0x1

    iput v1, p0, Lf5/v;->a:I

    invoke-static {v2, p0}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->ۡۤ۠ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const v1, 0xc27e

    :goto_8
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_7

    goto :goto_8

    :cond_4
    :sswitch_16
    const v1, 0xc2bc

    goto :goto_8

    :sswitch_17
    if-ne p1, v0, :cond_4

    const v1, 0xc2db

    goto :goto_8

    :cond_5
    :sswitch_18
    const v0, 0xc5c3

    goto/16 :goto_4

    :sswitch_19
    invoke-static {v1}, Lf/۟ۤۧ۠ۡ;->۟ۢۤۨۤ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xc601

    :goto_9
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_1a
    if-eqz v1, :cond_6

    const v0, 0xc65e

    goto :goto_9

    :cond_6
    :sswitch_1b
    const v0, 0xc63f

    goto :goto_9

    :sswitch_1c
    invoke-static {v3}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/google/firebase/abt/ۢۦۨۤ;->۟۟ۡۤۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v0

    new-instance v1, Lf5/j;

    const/4 v2, 0x0

    invoke-direct {v1, v3, v2}, Lf5/j;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V

    const/4 v2, 0x0

    const/4 v4, 0x0

    sget v5, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->۟ۧۧ۠ۥ:I

    xor-int/lit16 v5, v5, 0x3c7

    invoke-static {v0, v2, v4, v1, v5}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    const v0, 0xc67d

    :goto_a
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_a

    :sswitch_1d
    const v0, 0xc69c

    goto :goto_a

    :sswitch_1e
    invoke-static {v3}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {}, Lf5/v;->ۦۧۥ۟()[S

    move-result-object v1

    const/16 v2, 0x2f

    sget v4, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۤۤۦۥ:I

    xor-int/lit16 v4, v4, -0x167

    const/16 v5, 0x4b9

    invoke-static {v1, v2, v4, v5}, Ls/ۧۥ۟۟;->ۣ۟ۧۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۨۧۥۨ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const v0, 0xc984

    :goto_b
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :sswitch_1f
    const v0, 0xc9a3

    goto :goto_b

    :sswitch_20
    move-object v0, p1

    goto/16 :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_e
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x1f1 -> :sswitch_9
        0x6af -> :sswitch_18
        0x6c8 -> :sswitch_1e
        0x6e9 -> :sswitch_19
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0xe -> :sswitch_a
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_10
        0x35 -> :sswitch_8
        0x1f7 -> :sswitch_11
        0x7eef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_13
        0x32 -> :sswitch_14
        0x4c -> :sswitch_15
        0x53 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_16
        0x33 -> :sswitch_20
        0x54 -> :sswitch_c
        0xf1 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1a
        0x2d -> :sswitch_1e
        0x32 -> :sswitch_1b
        0x4c -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_b
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_b
    .end sparse-switch
.end method
