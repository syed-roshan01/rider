.class public final Ld5/d;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final c:Lm0/g1;

.field public final d:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x24

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/d;->short:[S

    return-void

    :array_0
    .array-data 2
        0xb4cs
        0xb44s
        0xb48s
        0xb40s
        0xb45s
        0x233s
        0x238s
        0x22as
        0x218s
        0x230s
        0x23cs
        0x234s
        0x231s
        0xa6cs
        0xa7as
        0xa7ds
        0xa7ds
        0xa6as
        0xa61s
        0xa7bs
        0xa5fs
        0xa6es
        0xa7cs
        0xa7cs
        0xa78s
        0xa60s
        0xa7ds
        0xa6bs
        0x723s
        0x732s
        0x720s
        0x720s
        0x724s
        0x73cs
        0x721s
        0x737s
    .end array-data
.end method

.method public synthetic constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/g1;Lm0/g1;I)V
    .locals 2

    iput p4, p0, Ld5/d;->a:I

    iput-object p1, p0, Ld5/d;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Ld5/d;->c:Lm0/g1;

    iput-object p3, p0, Ld5/d;->d:Lm0/g1;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Landroidx/compose/ui/graphics/۟ۥۨۧۥ;->۟۟۠ۤۧ()I

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
    const-string v0, "u4jlECq9i7V8XtnYwWQn4aXu55ZIR"

    invoke-static {v0}, Lg5/ۣۡۦۣ;->ۨۡۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static ۟ۢۤۡۦ()[S
    .locals 2

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

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
    sget-object v0, Ld5/d;->short:[S

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
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lv0/۟ۦۣ۟ۤ;->۟۟ۡۧ۟(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    invoke-static {p0}, Lm9/۟ۤۢۦ۠;->ۡۤۤۥ(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :pswitch_0
    invoke-static {p0}, Lm9/۟ۤۢۦ۠;->ۡۤۤۥ(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    invoke-static {p0}, Lm9/۟ۤۢۦ۠;->ۡۤۤۥ(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_2
    invoke-static {p0}, Lm9/۟ۤۢۦ۠;->ۡۤۤۥ(Ljava/lang/Object;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()V
    .locals 10

    const/4 v9, 0x0

    const/4 v8, 0x0

    sget v0, Lc0/ۦ۠۟ۥ;->ۣۨۤ۠:I

    xor-int/lit16 v1, v0, -0x34f

    invoke-static {p0}, Lv0/۟ۦۣ۟ۤ;->۟۟ۡۧ۟(Ljava/lang/Object;)I

    move-result v0

    invoke-static {}, Ld5/d;->۟ۢۤۡۦ()[S

    move-result-object v2

    sget v3, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣ۟ۢ۠ۥ:I

    xor-int/lit16 v3, v3, -0x81

    const/16 v4, 0xb29

    invoke-static {v2, v9, v3, v4}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۥۣۨۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۣۣۡۥ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v3

    invoke-static {p0}, Lj2/۠ۤۨۤ;->ۡ۠ۤۤ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v4

    invoke-static {p0}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۣۣۧۢ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v5

    packed-switch v0, :pswitch_data_0

    invoke-static {v5}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

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
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۦۣ۠۠(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    xor-int/lit8 v0, v1, -0x1

    and-int/lit8 v0, v0, 0x1

    and-int/lit8 v2, v1, -0x2

    or-int/2addr v0, v2

    if-eqz v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->۟ۧۧۤ۠(Ljava/lang/Object;)V

    invoke-static {v3, v1, v0}, Lq6/ۡۨۧۨ;->ۦۦۣۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_6
    invoke-static {}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->ۣۣۤۦ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-ltz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    const-string v0, "H6"

    invoke-static {v0}, Ld9/ۣ۟۠ۢۡ;->۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :goto_3
    :sswitch_a
    return-void

    :pswitch_0
    invoke-static {v5}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۦۣ۠۠(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbe7f

    :goto_4
    const v6, 0xbe90

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_4

    :sswitch_c
    xor-int/lit8 v0, v2, -0x1

    and-int/lit8 v0, v0, 0x1

    and-int/lit8 v6, v2, -0x2

    or-int/2addr v0, v6

    if-eqz v0, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_d
    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۦۣ۠۠(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbefb

    :goto_5
    const v6, 0xbf0c

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_e
    const v0, 0xbf39

    goto :goto_5

    :sswitch_f
    xor-int/lit8 v0, v2, -0x1

    and-int/lit8 v0, v0, 0x1

    and-int/lit8 v6, v2, -0x2

    or-int/2addr v0, v6

    if-eqz v0, :cond_4

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_10
    invoke-static {v5}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v3}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Ld5/d;->۟ۢۤۡۦ()[S

    move-result-object v4

    const/4 v5, 0x5

    sget v6, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۤ۠ۤۤ;->ۥۥۤۦ:I

    xor-int/lit16 v6, v6, -0x3b4

    const/16 v7, 0x25d

    invoke-static {v4, v5, v6, v7}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->۟ۡۢ۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ld5/d;->۟ۢۤۡۦ()[S

    move-result-object v4

    const/16 v5, 0xd

    sget v6, Lcom/google/firebase/installations/local/ۧۤۦۡ;->ۣ۟۟۟ۨ:I

    xor-int/lit16 v6, v6, -0x330

    const/16 v7, 0xa0f

    invoke-static {v4, v5, v6, v7}, Lp5/۟ۡۧۡۨ;->۠ۢۤۧ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/google/firebase/abt/ۢۦۨۤ;->۟۟ۡۤۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v4

    new-instance v5, Lf5/c0;

    invoke-direct {v5, v3, v0, v2, v8}, Lf5/c0;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Lu8/e;)V

    invoke-static {v4, v8, v9, v5, v1}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    goto/16 :goto_3

    :pswitch_1
    invoke-static {v5}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {v0, v2}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/google/firebase/abt/ۢۦۨۤ;->۟۟ۡۤۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v2

    new-instance v5, Lf5/w;

    invoke-direct {v5, v3, v0, v8}, Lf5/w;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lu8/e;)V

    invoke-static {v2, v8, v9, v5, v1}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    invoke-static {}, Lw1/ۦۣۦۧ;->ۣ۟۟۠ۥ()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v4, v0}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_2
    invoke-static {v3}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {v0, v8}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v5, v2}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ld5/d;->۟ۢۤۡۦ()[S

    move-result-object v2

    const/16 v4, 0x1c

    sget v6, Ldagger/hilt/internal/componenttreedeps/۟ۡۢۥۥ;->ۦ۠ۤ۟:I

    xor-int/lit8 v6, v6, 0x35

    const/16 v7, 0x753

    invoke-static {v2, v4, v6, v7}, Lk1/ۨ۟ۧۡ;->۟ۡۥۢ۟([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/google/firebase/abt/ۢۦۨۤ;->۟۟ۡۤۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v2

    new-instance v4, Lf5/r;

    invoke-direct {v4, v3, v5, v0, v8}, Lf5/r;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Lu8/e;)V

    invoke-static {v2, v8, v9, v4, v1}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    goto/16 :goto_3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_a
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_a
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch
.end method
