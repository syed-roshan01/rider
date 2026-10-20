.class public final Ld5/k0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final b:Z

.field public final c:Landroid/content/Context;

.field public final d:Lm0/g1;

.field public final e:Lm0/g1;

.field public final f:Lm0/g1;

.field public final n:Lm0/g1;

.field public final o:Lm0/g1;

.field public final p:Lm0/g1;

.field public final q:Lm0/l3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x4c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/k0;->short:[S

    return-void

    :array_0
    .array-data 2
        0x910s
        0x906s
        0x900s
        0x93cs
        0x90es
        0x90as
        0x90ds
        0x93cs
        0x913s
        0x90as
        0x900s
        0x908s
        0x916s
        0x913s
        0x93cs
        0x908s
        0x90es
        0x26es
        0x278s
        0x27es
        0x242s
        0x270s
        0x27cs
        0x265s
        0x242s
        0x26ds
        0x274s
        0x27es
        0x276s
        0x268s
        0x26ds
        0x242s
        0x276s
        0x270s
        0x182s
        0x194s
        0x192s
        0x1aes
        0x19cs
        0x198s
        0x19fs
        0x1aes
        0x195s
        0x183s
        0x19es
        0x181s
        0x1aes
        0x19as
        0x19cs
        0x701s
        0x717s
        0x711s
        0x72ds
        0x71fs
        0x713s
        0x70as
        0x72ds
        0x716s
        0x700s
        0x71ds
        0x702s
        0x72ds
        0x719s
        0x71fs
        0xc31s
        0xc3es
        0xc3bs
        0xc23s
        0xc32s
        0xc25s
        0xc08s
        0xc24s
        0xc36s
        0xc21s
        0xc32s
        0xc33s
    .end array-data
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;ZLandroid/content/Context;Lm0/g1;Lm0/g1;Lm0/g1;Lm0/g1;Lm0/g1;Lm0/g1;Lm0/l3;)V
    .locals 2

    iput-object p1, p0, Ld5/k0;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-boolean p2, p0, Ld5/k0;->b:Z

    iput-object p3, p0, Ld5/k0;->c:Landroid/content/Context;

    iput-object p4, p0, Ld5/k0;->d:Lm0/g1;

    iput-object p5, p0, Ld5/k0;->e:Lm0/g1;

    iput-object p6, p0, Ld5/k0;->f:Lm0/g1;

    iput-object p7, p0, Ld5/k0;->n:Lm0/g1;

    iput-object p8, p0, Ld5/k0;->o:Lm0/g1;

    iput-object p9, p0, Ld5/k0;->p:Lm0/g1;

    iput-object p10, p0, Ld5/k0;->q:Lm0/l3;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Ld5/ۣۦۢۢ;->ۤ۠ۧۤ()I

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
    const-string v0, "4la5Q"

    invoke-static {v0}, Lh6/ۧۧۤ۟;->۟۠۠ۤ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۨ۟۠()[S
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->۟۠ۡ۟()I

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
    sget-object v0, Ld5/k0;->short:[S

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
    .locals 10

    const/4 v9, 0x0

    const/4 v2, 0x0

    invoke-static {p0}, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣ۟ۥۡ۟(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lc4/ۡ۟۠ۥ;->ۥۢۨۧ(Ljava/lang/Object;)Ljava/lang/Float;

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
    invoke-static {v1}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۥۨۥ۠(Ljava/lang/Object;)F

    move-result v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    move v1, v0

    :goto_2
    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->ۣۢۧ۟(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lc4/ۡ۟۠ۥ;->ۥۢۨۧ(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v3

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-eqz v3, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :sswitch_6
    move v1, v2

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    invoke-static {v3}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۥۨۥ۠(Ljava/lang/Object;)F

    move-result v0

    const v3, 0xbe7f

    :goto_4
    const v4, 0xbe90

    xor-int/2addr v3, v4

    sparse-switch v3, :sswitch_data_3

    goto :goto_4

    :sswitch_9
    move v3, v0

    :goto_5
    invoke-static {p0}, Lj4/ۣۧۤ;->۟ۡۨ۟۟(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lc4/ۡ۟۠ۥ;->ۥۢۨۧ(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v4

    const v0, 0xbefb

    :goto_6
    const v5, 0xbf0c

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_a
    const v0, 0xbf39

    goto :goto_6

    :sswitch_b
    const v3, 0xbe9e

    goto :goto_4

    :sswitch_c
    const/high16 v0, 0x42480000    # 50.0f

    move v3, v0

    goto :goto_5

    :sswitch_d
    if-eqz v4, :cond_2

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_e
    invoke-static {v4}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۥۨۥ۠(Ljava/lang/Object;)F

    move-result v2

    :sswitch_f
    invoke-static {p0}, Ll9/۟ۦۥۣۢ;->ۡۨ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lc4/ۡ۟۠ۥ;->ۥۢۨۧ(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v4

    const v0, 0xc202

    :goto_7
    const v5, 0xc213

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_10
    if-eqz v4, :cond_3

    const v0, 0xc25f

    goto :goto_7

    :cond_3
    :sswitch_11
    const v0, 0xc240

    goto :goto_7

    :sswitch_12
    invoke-static {v4}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۥۨۥ۠(Ljava/lang/Object;)F

    move-result v0

    const v4, 0xc27e

    :goto_8
    const v5, 0xc28f

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_6

    goto :goto_8

    :goto_9
    :sswitch_13
    invoke-static {p0}, Lfa/ۣ۟ۥۤ;->ۣ۟۟ۥ۠(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v4

    invoke-static {v4}, Lf6/ۦۣۦ۟;->۟۟ۨۦ۟(Ljava/lang/Object;)Lz4/d;

    move-result-object v4

    invoke-static {v4}, Lr1/۟ۤۤۡ۠;->۟ۡۤۦ۠(Ljava/lang/Object;)Lz4/b;

    move-result-object v5

    invoke-static {v5}, Lt2/۟ۦۣۡۤ;->ۣ۟ۡ۟ۨ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v5

    invoke-static {v5}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    invoke-static {}, Ld5/k0;->ۣۨ۟۠()[S

    move-result-object v6

    sget v7, Ls7/ۧۤۦۤ;->ۨۥ۟ۥ:I

    xor-int/lit16 v7, v7, 0x31c

    const/16 v8, 0x963

    invoke-static {v6, v9, v7, v8}, Ld4/۟۠۠۟ۢ;->۟ۤۤ۟ۦ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v1}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۧۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-static {v1}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۢۢۦۢ(Ljava/lang/Object;)Z

    invoke-static {v4}, Lr1/۟ۤۤۡ۠;->۟ۡۤۦ۠(Ljava/lang/Object;)Lz4/b;

    move-result-object v1

    invoke-static {v1}, Lt2/۟ۦۣۡۤ;->ۣ۟ۡ۟ۨ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v4

    invoke-static {v4}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-static {}, Ld5/k0;->ۣۨ۟۠()[S

    move-result-object v5

    const/16 v6, 0x11

    sget v7, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۦ۠ۡ۟:I

    xor-int/lit16 v7, v7, 0x2b4

    const/16 v8, 0x21d

    invoke-static {v5, v6, v7, v8}, Lw1/ۦۣۦۧ;->ۣ۟ۧۥ۠([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v3}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۧۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-static {v3}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۢۢۦۢ(Ljava/lang/Object;)Z

    invoke-static {v1}, Lt2/۟ۦۣۡۤ;->ۣ۟ۡ۟ۨ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-static {v3}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-static {}, Ld5/k0;->ۣۨ۟۠()[S

    move-result-object v4

    const/16 v5, 0x22

    sget v6, Le1/۟ۢ۟ۤۡ;->ۨ۠ۡ۟:I

    xor-int/lit16 v6, v6, 0x2eb

    const/16 v7, 0x1f1

    invoke-static {v4, v5, v6, v7}, Lu8/ۨۡ۠;->ۨۢۢۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v2}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۧۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-static {v2}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۢۢۦۢ(Ljava/lang/Object;)Z

    invoke-static {v1}, Lt2/۟ۦۣۡۤ;->ۣ۟ۡ۟ۨ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-static {}, Ld5/k0;->ۣۨ۟۠()[S

    move-result-object v2

    const/16 v3, 0x31

    sget v4, Lq7/۟ۢۢ۟ۧ;->۟ۦۤۤ۟:I

    xor-int/lit16 v4, v4, -0x136

    const/16 v5, 0x772

    invoke-static {v2, v3, v4, v5}, Lg/۟ۧ۠ۤ;->۟۠۟۠۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۧۢۢۤ(Ljava/lang/Object;Ljava/lang/Object;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {v0}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۟ۢۢۦۢ(Ljava/lang/Object;)Z

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p0}, Ln8/ۢۡۨۨ;->۟۟ۡ۠ۨ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    invoke-static {v0, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۧ۠ۨۢ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc2fa

    :goto_a
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_a

    :sswitch_14
    if-eqz v2, :cond_4

    const v0, 0xc5e2

    goto :goto_a

    :sswitch_15
    const v4, 0xc29d

    goto/16 :goto_8

    :sswitch_16
    const/high16 v0, 0x42c80000    # 100.0f

    goto/16 :goto_9

    :cond_4
    :sswitch_17
    const v0, 0xc5c3

    goto :goto_a

    :sswitch_18
    invoke-static {p0}, Lh7/ۣ۟ۤ۠۠;->۟ۡۨۡۢ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    invoke-static {v0, v1}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_19
    invoke-static {}, Li5/ۢۤۡ;->ۣۡۥۧ()Ljava/util/List;

    invoke-static {p0}, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->۟ۡۦۦۡ(Ljava/lang/Object;)Lm0/l3;

    move-result-object v0

    invoke-static {v0}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Ld5/k0;->ۣۨ۟۠()[S

    move-result-object v1

    const/16 v2, 0x40

    sget v3, Le2/۟۟ۥۦ;->۟ۢ۠ۨۥ:I

    xor-int/lit16 v3, v3, -0x2f9

    const/16 v4, 0xc57

    invoke-static {v1, v2, v3, v4}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->۟۠۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Li/ۣۢۦ۠;->۟۠ۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lv8/۟ۧۢ۟ۢ;->۟ۤۢ۟ۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0, v9}, Lm7/ۡۢۦۢ;->۟ۧۢۥۧ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۢۦۢ(Ljava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

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
        0xb918 -> :sswitch_c
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
        0x16 -> :sswitch_a
        0x35 -> :sswitch_f
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_19
        0x6e9 -> :sswitch_18
    .end sparse-switch
.end method
