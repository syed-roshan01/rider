.class public final Ld5/m0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final b:I

.field public final c:Z

.field public final d:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/m0;->short:[S

    return-void

    :array_0
    .array-data 2
        0x1ebs
        0x1f0s
        0x1d5s
        0x1ecs
        0x1f0s
        0x1f1s
        0x1b7s
        0x1b1s
        0x1b1s
        0x1b1s
        0x1b6s
    .end array-data
.end method

.method public constructor <init>(ILm0/g1;Lcom/auto/accept/ui/viewmodel/MainViewModel;Z)V
    .locals 2

    iput-object p3, p0, Ld5/m0;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput p1, p0, Ld5/m0;->b:I

    iput-boolean p4, p0, Ld5/m0;->c:Z

    iput-object p2, p0, Ld5/m0;->d:Lm0/g1;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Ldagger/hilt/android/internal/modules/ۣۨۨ۠;->۟ۥۡۡۡ()I

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
    const-string v0, "gXKu05D3jj"

    invoke-static {v0}, Lcom/google/android/gms/internal/auth-api-phone/۟ۢۦۧۨ;->ۧۥۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۧۥ۟۟()[S
    .locals 2

    invoke-static {}, Lv8/۟ۧۢ۟ۢ;->ۨۥۦۤ()I

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
    sget-object v0, Ld5/m0;->short:[S

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
.method public final invoke()Ljava/lang/Object;
    .locals 7

    invoke-static {p0}, Ld5/ۣۦۢۢ;->۟ۧۦ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    invoke-static {v0}, Lf6/ۦۣۦ۟;->۟۟ۨۦ۟(Ljava/lang/Object;)Lz4/d;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->۟۟ۢۦ۟(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Ls7/ۧۤۦۤ;->ۣۣ۟۠(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۣۧۤۦ(Ljava/lang/Object;)I

    move-result v3

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
    if-ltz v3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v2}, Ldagger/hilt/codegen/۟۟ۡ۠ۥ;->ۦۧ(Ljava/lang/Object;)I

    move-result v4

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-ge v3, v4, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->۠ۡۥۢ(Ljava/lang/Object;I)Ljava/lang/Object;

    invoke-static {v1}, Lh5/ۧ۟ۨۧ;->۟ۢۤۧۦ(Ljava/lang/Object;)Lp7/n;

    move-result-object v0

    invoke-static {v0, v2}, Lm5/۟ۥۣۧۥ;->ۦ۠ۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ld5/m0;->ۧۥ۟۟()[S

    move-result-object v3

    const/4 v4, 0x0

    sget v5, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۧ۠ۡ۟:I

    xor-int/lit16 v5, v5, -0x325

    const/16 v6, 0x19f

    invoke-static {v3, v4, v5, v6}, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->۠ۦۤۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lk3/ۦ۠ۢۥ;->۟ۥۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lr1/۟ۤۤۡ۠;->۟ۡۤۦ۠(Ljava/lang/Object;)Lz4/b;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۣۢۨ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/google/firebase/messaging/reporting/۟ۤ۠ۡ۟;->ۥۢۤۡ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {v0, v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_6
    invoke-static {p0}, Landroidx/compose/ui/layout/ۢۡۤۤ;->۟ۦ۟ۤۡ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-eqz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p0}, Lv7/ۤۦۧ۟;->ۣ۟۟۠ۥ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v1

    invoke-static {v1, v0}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_a
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

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

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method
