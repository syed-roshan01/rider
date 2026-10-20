.class public final synthetic Lf5/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Landroid/app/Application;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x80

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf5/n;->short:[S

    return-void

    :array_0
    .array-data 2
        0x21f6s
        -0x6a7s
        0x776s
        0x714s
        0x733s
        0x722s
        0x737s
        0x776s
        0x724s
        0x733s
        0x727s
        0x723s
        0x73fs
        0x724s
        0x733s
        0x725s
        0x776s
        0x738s
        0x733s
        0x722s
        0x721s
        0x739s
        0x724s
        0x73ds
        0x776s
        0x735s
        0x739s
        0x738s
        0x738s
        0x733s
        0x735s
        0x722s
        0x73fs
        0x739s
        0x738s
        0x246cs
        -0x33ds
        0x2ecs
        0x28es
        0x2a9s
        0x2b8s
        0x2ads
        0x2f6s
        0x2ecs
        0x28as
        0x2a5s
        0x2bes
        0x2a9s
        0x2aes
        0x2ads
        0x2bfs
        0x2a9s
        0x2ecs
        0x2afs
        0x2a3s
        0x2a2s
        0x2a2s
        0x2a9s
        0x2afs
        0x2b8s
        0x2a5s
        0x2a3s
        0x2a2s
        0x2ecs
        0x2aas
        0x2ads
        0x2a5s
        0x2a0s
        0x2a9s
        0x2a8s
        0x20a3s
        -0x7f4s
        0x623s
        0x641s
        0x666s
        0x677s
        0x662s
        0x623s
        0x662s
        0x660s
        0x660s
        0x666s
        0x670s
        0x670s
        0x623s
        0x671s
        0x666s
        0x675s
        0x66cs
        0x668s
        0x666s
        0x667s
        0x2de7s
        -0xab8s
        0xb67s
        0xb05s
        0xb22s
        0xb33s
        0xb26s
        0xb67s
        0xb35s
        0xb22s
        0xb36s
        0xb32s
        0xb2es
        0xb35s
        0xb22s
        0xb34s
        0xb67s
        0xb2es
        0xb29s
        0xb33s
        0xb22s
        0xb35s
        0xb29s
        0xb22s
        0xb33s
        0xb67s
        0xb24s
        0xb28s
        0xb29s
        0xb29s
        0xb22s
        0xb24s
        0xb33s
        0xb2es
        0xb28s
        0xb29s
    .end array-data
.end method

.method public synthetic constructor <init>(Landroid/app/Application;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lf5/n;->a:I

    iput-object p1, p0, Lf5/n;->b:Landroid/app/Application;

    invoke-static {}, Lq9/۟ۧۦۤۨ;->۟ۤۧۦ۟()I

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
    const-string v0, "fnMUq90QVLOxc4Yg2IunfmpGa"

    invoke-static {v0}, Lr1/۟ۤۤۡ۠;->ۨۧۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method public static ۢۨۢۦ()[S
    .locals 2

    invoke-static {}, Lg9/۠ۨۧۤ;->۟ۥ۟ۧۦ()I

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
    sget-object v0, Lf5/n;->short:[S

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
.method public final run()V
    .locals 8

    const/4 v7, 0x1

    invoke-static {p0}, La2/۟ۡۥۦ۟;->۟ۦ۠ۧۧ(Ljava/lang/Object;)I

    move-result v0

    const-wide/16 v2, -0x535

    sget v1, Ld9/ۡۥۣۡ;->۟ۥۥ۟۟:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {p0}, Lq6/۟ۥۦۡ۟;->ۣۨۥۦ(Ljava/lang/Object;)Landroid/app/Application;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lf5/n;->ۢۨۢۦ()[S

    move-result-object v0

    const/4 v4, 0x0

    sget v5, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۦ۠ۡ۟:I

    xor-int/lit16 v5, v5, 0x286

    const/16 v6, 0x756

    invoke-static {v0, v4, v5, v6}, Lf4/ۡۥۣۢ;->ۣۤۡۢ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v7}, Lm7/ۡۢۦۢ;->۟ۧۢۥۧ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۢۦۢ(Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lb5/j;

    sget v4, Lq7/۟ۢۡ۟۟;->ۣۥۦۨ:I

    xor-int/lit16 v4, v4, 0xc5

    invoke-direct {v1, v4}, Lb5/j;-><init>(I)V

    invoke-static {v0, v1, v2, v3}, Lk4/۟۠ۦ۟ۤ;->ۨۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    :goto_0
    :sswitch_0
    return-void

    :pswitch_0
    invoke-static {}, Lf5/n;->ۢۨۢۦ()[S

    move-result-object v0

    const/16 v4, 0x23

    sget v5, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۣۨ۠ۥ:I

    xor-int/lit16 v5, v5, 0x30a

    const/16 v6, 0x2cc

    invoke-static {v0, v4, v5, v6}, Landroid/support/v4/app/۟۟۠ۡۥ;->ۤۥۢۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v7}, Lm7/ۡۢۦۢ;->۟ۧۢۥۧ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۢۦۢ(Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lb5/j;

    sget v4, Ld9/ۥۡۧۡ;->۟ۡۨ:I

    xor-int/lit16 v4, v4, 0x356

    invoke-direct {v1, v4}, Lb5/j;-><init>(I)V

    invoke-static {v0, v1, v2, v3}, Lk4/۟۠ۦ۟ۤ;->ۨۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    goto :goto_0

    :pswitch_1
    invoke-static {}, Lf5/n;->ۢۨۢۦ()[S

    move-result-object v0

    const/16 v4, 0x46

    sget v5, Le2/ۨۥۦۡ;->۟۠ۢۢۧ:I

    xor-int/lit16 v5, v5, 0x20e

    const/16 v6, 0x603

    invoke-static {v0, v4, v5, v6}, Landroidx/compose/ui/layout/۟ۢ۠ۨ۠;->ۣۣۣۣ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v7}, Lm7/ۡۢۦۢ;->۟ۧۢۥۧ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۢۦۢ(Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lb5/j;

    sget v4, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->ۨۥۣۢ:I

    xor-int/lit16 v4, v4, -0x13c

    invoke-direct {v1, v4}, Lb5/j;-><init>(I)V

    invoke-static {v0, v1, v2, v3}, Lk4/۟۠ۦ۟ۤ;->ۨۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    goto :goto_0

    :pswitch_2
    invoke-static {}, Lf5/n;->ۢۨۢۦ()[S

    move-result-object v0

    const/16 v4, 0x5c

    sget v5, Ld1/ۣۧۡۡ;->ۧ۠ۦۣ:I

    xor-int/lit16 v5, v5, 0xe8

    const/16 v6, 0xb47

    invoke-static {v0, v4, v5, v6}, Landroidx/preference/۟ۤۥۦۧ;->۟ۥۥۦۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v7}, Lm7/ۡۢۦۢ;->۟ۧۢۥۧ(Ljava/lang/Object;Ljava/lang/Object;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۢۦۢ(Ljava/lang/Object;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->۟ۡۨۢۨ()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lb5/j;

    invoke-direct {v1, v7}, Lb5/j;-><init>(I)V

    invoke-static {v0, v1, v2, v3}, Lk4/۟۠ۦ۟ۤ;->ۨۨۧۢ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    invoke-static {}, Ld9/ۨۧۧۦ;->ۨۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_1
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_1

    :sswitch_2
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_1

    :sswitch_3
    const-string v0, "AZnlWLx2omeXRjgKzxvaYjJTWiW1O"

    invoke-static {v0}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->ۣ۟ۦۨۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_0
    .end sparse-switch
.end method
