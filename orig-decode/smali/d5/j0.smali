.class public final Ld5/j0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Z

.field public final d:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x36

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/j0;->short:[S

    return-void

    :array_0
    .array-data 2
        0x965s
        0x973s
        0x975s
        0x949s
        0x97as
        0x979s
        0x975s
        0x977s
        0x962s
        0x97fs
        0x979s
        0x978s
        0x949s
        0x970s
        0x97fs
        0x97as
        0x962s
        0x973s
        0x964s
        0x949s
        0x973s
        0x978s
        0x977s
        0x974s
        0x97as
        0x973s
        0x972s
        0x2das
        0x2ccs
        0x2cas
        0x2f6s
        0x2cds
        0x2c0s
        0x2das
        0x2dds
        0x2c8s
        0x2c7s
        0x2cas
        0x2ccs
        0x2f6s
        0x2cfs
        0x2c0s
        0x2c5s
        0x2dds
        0x2ccs
        0x2dbs
        0x2f6s
        0x2ccs
        0x2c7s
        0x2c8s
        0x2cbs
        0x2c5s
        0x2ccs
        0x2cds
    .end array-data
.end method

.method public synthetic constructor <init>(ILm0/g1;Lcom/auto/accept/ui/viewmodel/MainViewModel;Z)V
    .locals 2

    iput p1, p0, Ld5/j0;->a:I

    iput-object p3, p0, Ld5/j0;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-boolean p4, p0, Ld5/j0;->c:Z

    iput-object p2, p0, Ld5/j0;->d:Lm0/g1;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Li6/۟۟ۦۨۧ;->۟ۡۦۥ۟()I

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
    const-string v0, "zZOEzEa9CQUhU8Fo9OP0sOZkhU"

    invoke-static {v0}, Lv5/ۧۥۢۡ;->۟ۢ۟ۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۨۢۧۢ()[S
    .locals 2

    invoke-static {}, Lz/۟ۥۣۣ۠;->۟ۢۧۨ۠()I

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
    sget-object v0, Ld5/j0;->short:[S

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
.method public final a(Z)V
    .locals 8

    invoke-static {p0}, Lcom/google/android/gms/measurement/internal/ۥۦۤ;->۟ۨۡۥ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lr6/۟ۡ۠۟ۡ;->۟ۢ۟ۨۨ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/messaging/۟۟ۧ۟;->ۡ۠ۡ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {p0}, Lr1/۟ۤۤۡ۠;->ۣ۟ۡۥ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v3

    packed-switch v0, :pswitch_data_0

    invoke-static {v3}, Lf6/ۦۣۦ۟;->۟۟ۨۦ۟(Ljava/lang/Object;)Lz4/d;

    move-result-object v0

    invoke-static {v0}, Lr1/۟ۤۤۡ۠;->۟ۡۤۦ۠(Ljava/lang/Object;)Lz4/b;

    move-result-object v3

    invoke-static {v3}, Lt2/۟ۦۣۡۤ;->ۣ۟ۡ۟ۨ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-static {v3}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-static {}, Ld5/j0;->ۨۢۧۢ()[S

    move-result-object v4

    const/4 v5, 0x0

    sget v6, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۢۦۦ:I

    xor-int/lit8 v6, v6, -0x5f

    const/16 v7, 0x916

    invoke-static {v4, v5, v6, v7}, Lh0/۟ۥ۟ۡۦ;->ۣۨ۟۠([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, p1}, Lz0/ۣ۟۠ۤ۟;->۟ۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-static {v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۢۢۦۢ(Ljava/lang/Object;)Z

    invoke-static {v0}, Lq9/۟ۧۦۤۨ;->۟۠ۤۤۡ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {p1}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

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
    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v1, v0}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    :sswitch_3
    return-void

    :pswitch_0
    invoke-static {v3}, Lf6/ۦۣۦ۟;->۟۟ۨۦ۟(Ljava/lang/Object;)Lz4/d;

    move-result-object v0

    invoke-static {v0}, Lr1/۟ۤۤۡ۠;->۟ۡۤۦ۠(Ljava/lang/Object;)Lz4/b;

    move-result-object v3

    invoke-static {v3}, Lt2/۟ۦۣۡۤ;->ۣ۟ۡ۟ۨ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-static {v3}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-static {}, Ld5/j0;->ۨۢۧۢ()[S

    move-result-object v4

    const/16 v5, 0x1b

    sget v6, Lp5/۟ۡۧۡۨ;->۟ۦ۟ۨ۟:I

    xor-int/lit16 v6, v6, 0xa4

    const/16 v7, 0x2a9

    invoke-static {v4, v5, v6, v7}, Lg2/۟۠ۡۡۦ;->ۡۡۥۡ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, p1}, Lz0/ۣ۟۠ۤ۟;->۟ۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-static {v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۢۢۦۢ(Ljava/lang/Object;)Z

    invoke-static {v0}, Lcom/google/android/gms/common/ۦۢۨ;->۟ۦۦۦ۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {p1}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0, v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_6
    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v1, v0}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

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
        0x1d7 -> :sswitch_3
        0x1f4 -> :sswitch_6
    .end sparse-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lcom/google/android/gms/measurement/internal/ۥۦۤ;->۟ۨۡۥ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {p0, v1}, Lr2/ۡۧۥۧ;->ۣۢۦۥ(Ljava/lang/Object;Z)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v1

    invoke-static {p0, v1}, Lr2/ۡۧۥۧ;->ۣۢۦۥ(Ljava/lang/Object;Z)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
