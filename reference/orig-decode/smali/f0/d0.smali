.class public final Lf0/d0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/d0;->short:[S

    return-void

    :array_0
    .array-data 2
        0xaabs
        0xaa4s
        0xaaes
        0xab8s
        0xaa5s
        0xaa3s
        0xaaes
        0xae4s
        0xab9s
        0xaafs
        0xabes
        0xabes
        0xaa3s
        0xaa4s
        0xaads
        0xab9s
        0xae4s
        0xa99s
        0xa8fs
        0xa9es
        0xa9es
        0xa83s
        0xa84s
        0xa8ds
        0xa99s
        0x64cs
        0x64ds
        0x65es
        0x677s
        0x647s
        0x658s
        0x65cs
        0x641s
        0x647s
        0x646s
        0x65bs
        0x677s
        0x64cs
        0x641s
        0x65bs
        0x649s
        0x64as
        0x644s
        0x64ds
        0x64cs
        0x677s
        0x65cs
        0x647s
        0x649s
        0x65bs
        0x65cs
        0x466s
        0x469s
        0x463s
        0x475s
        0x468s
        0x46es
        0x463s
        0x429s
        0x474s
        0x462s
        0x473s
        0x473s
        0x46es
        0x469s
        0x460s
        0x474s
        0x429s
        0x443s
        0x442s
        0x451s
        0x44es
        0x444s
        0x442s
        0x458s
        0x44es
        0x449s
        0x441s
        0x448s
        0x458s
        0x454s
        0x442s
        0x453s
        0x453s
        0x44es
        0x449s
        0x440s
        0x454s
        0x9afs
        0x9a0s
        0x9aas
        0x9bcs
        0x9a1s
        0x9a7s
        0x9aas
        0x9e0s
        0x9bds
        0x9abs
        0x9bas
        0x9bas
        0x9a7s
        0x9a0s
        0x9a9s
        0x9bds
        0x9e0s
        0x98fs
        0x99es
        0x99es
        0x982s
        0x987s
        0x98ds
        0x98fs
        0x99as
        0x987s
        0x981s
        0x980s
        0x991s
        0x98as
        0x98bs
        0x998s
        0x98bs
        0x982s
        0x981s
        0x99es
        0x983s
        0x98bs
        0x980s
        0x99as
        0x991s
        0x99ds
        0x98bs
        0x99as
        0x99as
        0x987s
        0x980s
        0x989s
        0x99ds
        0x694s
        0x69as
        0x686s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 2

    iput p1, p0, Lf0/d0;->a:I

    iput-boolean p4, p0, Lf0/d0;->b:Z

    iput-object p2, p0, Lf0/d0;->c:Ljava/lang/Object;

    iput-object p3, p0, Lf0/d0;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lt2/۟ۧۢ۟ۢ;->۟ۧۢۥۧ()I

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
    const-string v0, "ALDHSfBLmytPFeEIDqt8R0u4szL"

    invoke-static {v0}, Lp8/۟۟ۢ۟ۢ;->۟ۧ۟۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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

.method public constructor <init>(Lf0/c2;Lc1/k;Z)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lf0/d0;->a:I

    iput-object p1, p0, Lf0/d0;->c:Ljava/lang/Object;

    iput-object p2, p0, Lf0/d0;->d:Ljava/lang/Object;

    iput-boolean p3, p0, Lf0/d0;->b:Z

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lh5/ۢ۠۠۟;->۟ۦ۠ۡۨ()I

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
    const-string v0, "CzOTYlJG5LvS5Ww8k"

    invoke-static {v0}, Lj2/ۥ۠ۨۢ;->ۤۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method public static ۢۧ۟ۨ()[S
    .locals 2

    invoke-static {}, Ldagger/hilt/migration/۟ۦۨۥۣ;->ۢۧۡ()I

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
    sget-object v0, Lf0/d0;->short:[S

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
    .locals 5

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۣۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    invoke-static {p0}, Lo8/۟ۢۧۢۤ;->۟ۦ۠ۡۤ(Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :pswitch_0
    invoke-static {p0}, Lo8/۟ۢۧۢۤ;->۟ۦ۠ۡۤ(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    invoke-static {p0}, Lt0/ۣ۟۠ۡۢ;->ۨۢۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/c2;

    invoke-static {p0}, Lp8/۟۟ۢ۟ۢ;->۠ۢۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc1/k;

    invoke-static {p0}, Lcom/auto/accept/service/۟۠ۧۧۢ;->۟۠ۤۨۨ(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v0}, Lj2/ۥ۠ۨۢ;->۟ۡۦۥۦ(Ljava/lang/Object;)Z

    move-result v4

    const/16 v2, 0x650

    :goto_1
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_1

    :sswitch_1
    if-nez v4, :cond_0

    const/16 v2, 0x6ad

    goto :goto_1

    :sswitch_2
    invoke-static {v1}, Lcom/google/firebase/firestore/ktx/۟ۥۧۧۡ;->ۣۧۦۨ(Ljava/lang/Object;)Z

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_2

    :sswitch_4
    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    xor-int/lit8 v1, v3, -0x1

    and-int/lit8 v1, v1, 0x1

    and-int/lit8 v2, v3, -0x2

    or-int/2addr v1, v2

    if-eqz v1, :cond_1

    const v1, 0xbe60

    goto :goto_3

    :cond_1
    :sswitch_6
    const v1, 0xbe41

    goto :goto_3

    :sswitch_7
    invoke-static {v0}, Ldagger/hilt/internal/۟ۤۧۨ۟;->ۡۧ۟ۥ(Ljava/lang/Object;)Lu1/t2;

    move-result-object v0

    const v1, 0xbe7f

    :goto_4
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_8
    const v1, 0xbebd

    goto :goto_4

    :sswitch_9
    if-eqz v0, :cond_2

    const v1, 0xbedc

    goto :goto_4

    :sswitch_a
    check-cast v0, Lu1/u1;

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟۠ۨ۠۟(Ljava/lang/Object;)Lg2/b0;

    move-result-object v2

    invoke-static {v2}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۣ۟۠۠ۤ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v0

    invoke-static {v0}, Lz7/۠ۡ۟ۦ;->۟۟ۡۧۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg2/h0;

    const v1, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_b
    const v1, 0xbf39

    goto :goto_5

    :sswitch_c
    if-eqz v0, :cond_3

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_d
    invoke-static {v2}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->۟ۤۨۢ(Ljava/lang/Object;)Lg2/v;

    move-result-object v0

    check-cast v0, Lg2/e0;

    invoke-static {}, La/ۥۡۢۨ;->۟ۤ۠ۧۦ()Lg2/c0;

    move-result-object v1

    invoke-static {v0, v1}, Lq9/۟ۧۦۤۨ;->۟ۢۧ۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_e
    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v0

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_e
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_e
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
.end method

.method public final invoke()V
    .locals 9

    invoke-static {p0}, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->ۣۧۨ۠(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lp8/۟۟ۢ۟ۢ;->۠ۢۥ۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0}, Lt0/ۣ۟۠ۡۢ;->ۨۢۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p0}, Lcom/auto/accept/service/۟۠ۧۧۢ;->۟۠ۤۨۨ(Ljava/lang/Object;)Z

    move-result v4

    packed-switch v1, :pswitch_data_0

    invoke-static {}, Lf0/d0;->ۢۧ۟ۨ()[S

    move-result-object v1

    const/4 v5, 0x0

    sget v6, Landroidx/compose/ui/input/pointer/ۨۦۥۦ;->ۣۨۡۧ:I

    xor-int/lit16 v6, v6, 0x21e

    const/16 v7, 0xaca

    invoke-static {v1, v5, v6, v7}, Lfa/ۣ۟ۥۤ;->ۣ۟ۨۡ([SIII)Ljava/lang/String;

    move-result-object v5

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
    if-nez v4, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v1, v2

    check-cast v1, Landroid/content/Context;

    invoke-static {}, Li5/ۢۤۡ;->ۣۡۥۧ()Ljava/util/List;

    check-cast v3, Lm0/l3;

    invoke-static {v3}, Lt0/ۣ۟۠ۡۢ;->ۣ۟ۡۡۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Lf0/d0;->ۢۧ۟ۨ()[S

    move-result-object v4

    const/16 v6, 0x19

    sget v7, Lf/۟ۤۧ۠ۡ;->ۣۡۡۡ:I

    xor-int/lit16 v7, v7, -0x2c4

    const/16 v8, 0x628

    invoke-static {v4, v6, v7, v8}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۣۧۨۧ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Li/ۣۢۦ۠;->۟۠ۦۣ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v1, v3, v4}, Lm7/ۡۢۦۢ;->۟ۧۢۥۧ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۢۦۢ(Ljava/lang/Object;)V

    :try_start_0
    move-object v0, v2

    check-cast v0, Landroid/content/Context;

    move-object v1, v0

    new-instance v3, Landroid/content/Intent;

    invoke-static {}, Lf0/d0;->ۢۧ۟ۨ()[S

    move-result-object v4

    const/16 v6, 0x33

    sget v7, Lr1/۟ۤۤۡ۠;->ۦۥۢ:I

    xor-int/lit16 v7, v7, 0x130

    const/16 v8, 0x407

    invoke-static {v4, v6, v7, v8}, Lv9/۟۟ۤۥ;->ۣ۟ۢۡۤ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v3}, Lq5/۟ۥۣۢۨ;->ۣۤۤۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    check-cast v2, Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v1}, Lq5/۟ۥۣۢۨ;->ۣۤۤۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    const v1, 0xbe22

    goto :goto_2

    :sswitch_5
    :try_start_2
    move-object v0, v2

    check-cast v0, Landroid/content/Context;

    move-object v1, v0

    new-instance v3, Landroid/content/Intent;

    invoke-static {}, Lf0/d0;->ۢۧ۟ۨ()[S

    move-result-object v4

    const/16 v6, 0x58

    sget v7, Lc0/ۦ۠۟ۥ;->ۣۨۤ۠:I

    xor-int/lit16 v7, v7, -0x37d

    const/16 v8, 0x9ce

    invoke-static {v4, v6, v7, v8}, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->ۣ۟ۤۧۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v3}, Lq5/۟ۥۣۢۨ;->ۣۤۤۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_6
    return-void

    :sswitch_7
    const v1, 0xbe9e

    goto :goto_3

    :catch_1
    move-exception v1

    check-cast v2, Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v1}, Lq5/۟ۥۣۢۨ;->ۣۤۤۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :pswitch_0
    const v1, 0xbefb

    :goto_5
    const v5, 0xbf0c

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :cond_1
    :sswitch_8
    const v1, 0xbf39

    goto :goto_5

    :sswitch_9
    if-eqz v4, :cond_1

    const v1, 0xc1e3

    goto :goto_5

    :sswitch_a
    check-cast v2, Lb4/e;

    check-cast v3, Ljava/lang/String;

    invoke-static {v2}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۥ۟ۡۤ(Ljava/lang/Object;)Ljava/lang/Class;

    invoke-static {}, Lf0/d0;->ۢۧ۟ۨ()[S

    move-result-object v1

    const/16 v4, 0x89

    sget v5, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۢۢۡۤ:I

    xor-int/lit16 v5, v5, 0x135

    const/16 v6, 0x6ff

    invoke-static {v1, v4, v5, v6}, Ll0/ۡۦۦۡ;->۠۟ۦۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lp3/۟ۢ۟۟ۥ;->۟ۦۥ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Ldagger/hilt/android/internal/earlyentrypoint/ۨۢۡۢ;->ۣۨ۟ۨ(Ljava/lang/Object;)Ln/g;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->ۣۡ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :sswitch_b
    invoke-static {}, Lc4/۟ۢۨۥۡ;->ۦۣ۟ۤ()I

    move-result v2

    const v1, 0xc202

    :goto_6
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_c
    if-gtz v2, :cond_2

    const v1, 0xc25f

    goto :goto_6

    :cond_2
    :sswitch_d
    const v1, 0xc240

    goto :goto_6

    :sswitch_e
    const-string v1, "44Lwi0"

    invoke-static {v1}, Ly/۟ۤۥۨ;->۟۠ۥۨۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_4

    :catch_2
    move-exception v1

    const v1, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_f
    const v1, 0xc29d

    goto :goto_7

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_6
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_8
        0x35 -> :sswitch_b
        0x1f7 -> :sswitch_9
        0x7eef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_c
        0x32 -> :sswitch_d
        0x4c -> :sswitch_e
        0x53 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_6
        0xf1 -> :sswitch_f
    .end sparse-switch
.end method
