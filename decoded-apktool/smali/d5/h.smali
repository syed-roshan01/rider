.class public final Ld5/h;
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

.field public final e:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ld5/h;->short:[S

    return-void

    :array_0
    .array-data 2
        0x6f6s
        0x6e0s
        0x6e7s
        0x6e7s
        0x6f0s
        0x6fbs
        0x6e1s
        0x6c5s
        0x6f4s
        0x6e6s
        0x6e6s
        0x6e2s
        0x6fas
        0x6e7s
        0x6f1s
        0x956s
        0x95ds
        0x94fs
        0x968s
        0x959s
        0x94bs
        0x94bs
        0x94fs
        0x957s
        0x94as
        0x95cs
        0xbe6s
        0xbe9s
        0xbe5s
        0xbeds
        0x5b9s
        0x5b1s
        0x5bds
        0x5b5s
        0x5b0s
        0x895s
        0x884s
        0x896s
        0x896s
        0x892s
        0x88as
        0x897s
        0x881s
    .end array-data
.end method

.method public synthetic constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lm0/g1;Lm0/g1;Lm0/g1;I)V
    .locals 2

    iput p5, p0, Ld5/h;->a:I

    iput-object p1, p0, Ld5/h;->b:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Ld5/h;->c:Lm0/g1;

    iput-object p3, p0, Ld5/h;->d:Lm0/g1;

    iput-object p4, p0, Ld5/h;->e:Lm0/g1;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->۟ۦۣۣۡ()I

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
    const-string v0, "O9Nr4bMmx0GC9OB7vNHmBHas6w"

    invoke-static {v0}, Lr2/ۧۧۢۢ;->ۥۥ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۧۢۥۢ()[S
    .locals 2

    invoke-static {}, Lcom/google/firebase/dynamicloading/ۣ۟۠ۨۢ;->۟ۤۦ۠()I

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Ld5/h;->short:[S

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

    invoke-static {p0}, Le8/۟۠ۦ۟ۢ;->ۣۦۡ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    invoke-static {p0}, Lea/۟ۦۢۦۤ;->ۣ۟ۧ۟۠(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :pswitch_0
    invoke-static {p0}, Lea/۟ۦۢۦۤ;->ۣ۟ۧ۟۠(Ljava/lang/Object;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke()V
    .locals 11

    const/4 v10, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    invoke-static {p0}, Le8/۟۠ۦ۟ۢ;->ۣۦۡ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۥۦۥ۟(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v1

    invoke-static {p0}, Lb3/۟ۧ۠ۡۥ;->۟۠ۥۣۡ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v3

    invoke-static {p0}, Ln1/۟۠۟ۤۤ;->ۤ۠ۦۡ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v2

    invoke-static {p0}, Ldagger/hilt/internal/aliasof/۟ۢۢ۠۠;->۟۠۟ۥۨ(Ljava/lang/Object;)Lm0/g1;

    move-result-object v4

    packed-switch v0, :pswitch_data_0

    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v6

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
    const/4 v0, 0x6

    if-lt v6, v0, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v2}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v2}, Ldagger/hilt/android/components/۟ۦۦۢۤ;->۟ۦۥۣ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {v3}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Ld5/h;->ۧۢۥۢ()[S

    move-result-object v3

    sget v4, Lw4/۟ۤ۠۟ۨ;->ۨۧۦ۠:I

    xor-int/lit16 v4, v4, 0x2f7

    const/16 v6, 0x695

    invoke-static {v3, v9, v4, v6}, Lcom/google/firebase/appcheck/ۤۦۣۤ;->ۣۡۧ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ld5/h;->ۧۢۥۢ()[S

    move-result-object v3

    const/16 v4, 0xf

    sget v6, Lw9/۟۠۠ۢ۟;->ۨۤۨۧ:I

    xor-int/lit16 v6, v6, 0xdd

    const/16 v7, 0x938

    invoke-static {v3, v4, v6, v7}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->۟ۢۦۡۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/google/firebase/abt/ۢۦۨۤ;->۟۟ۡۤۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v3

    new-instance v4, Lf5/i;

    invoke-direct {v4, v1, v0, v2, v5}, Lf5/i;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Lu8/e;)V

    invoke-static {v3, v5, v9, v4, v10}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    :goto_2
    :sswitch_6
    return-void

    :pswitch_0
    invoke-static {v1}, Lp8/۟۟ۢ۟ۢ;->۟ۢۥ۟ۥ(Ljava/lang/Object;)Lp9/q0;

    move-result-object v0

    invoke-static {v0, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lg/۟ۦۥۥۤ;->ۨۡۥۨ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۡۨۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Ld5/h;->ۧۢۥۢ()[S

    move-result-object v0

    const/16 v6, 0x1a

    sget v7, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->۠ۢۢۦ:I

    xor-int/lit16 v7, v7, 0xa6

    const/16 v8, 0xb88

    invoke-static {v0, v6, v7, v8}, Lr2/۠ۨۦۢ;->ۤۢۦ۟([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ld5/h;->ۧۢۥۢ()[S

    move-result-object v0

    const/16 v6, 0x1e

    sget v7, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣۣ۟۠۟:I

    xor-int/lit16 v7, v7, 0x23d

    const/16 v8, 0x5dc

    invoke-static {v0, v6, v7, v8}, Lj9/۠۠ۨ;->۟ۢۨۨ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ld5/h;->ۧۢۥۢ()[S

    move-result-object v0

    const/16 v6, 0x23

    sget v7, Landroidx/startup/ۨۤ۟ۡ;->ۤۢۢۥ:I

    xor-int/lit16 v7, v7, 0x3c7

    const/16 v8, 0x8e5

    invoke-static {v0, v6, v7, v8}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۣۣ۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/google/firebase/abt/ۢۦۨۤ;->۟۟ۡۤۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v6

    new-instance v0, Lf5/z;

    invoke-direct/range {v0 .. v5}, Lf5/z;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu8/e;)V

    invoke-static {v6, v5, v9, v0, v10}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    invoke-static {}, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->ۣ۟ۤۢۦ()I

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_7
    if-gtz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_3

    :sswitch_9
    const-string v0, "4MMpCrtE5pvmMu05rh"

    invoke-static {v0}, Le2/ۨۥۦۡ;->۟ۢۤۦۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_data_0
    .packed-switch 0x0
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
        0xb918 -> :sswitch_6
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch
.end method
