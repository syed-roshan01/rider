.class public final Lk6/w6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Lk6/x7;

.field public final c:Z

.field public final d:Lk6/s6;

.field public final e:La6/a;

.field public final f:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x74

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/w6;->short:[S

    return-void

    :array_0
    .array-data 2
        0x731s
        0x71cs
        0x706s
        0x716s
        0x714s
        0x707s
        0x711s
        0x71cs
        0x71bs
        0x712s
        0x755s
        0x711s
        0x714s
        0x701s
        0x714s
        0x75bs
        0x755s
        0x733s
        0x714s
        0x71cs
        0x719s
        0x710s
        0x711s
        0x755s
        0x701s
        0x71as
        0x755s
        0x706s
        0x710s
        0x71bs
        0x711s
        0x755s
        0x716s
        0x71as
        0x71bs
        0x711s
        0x71cs
        0x701s
        0x71cs
        0x71as
        0x71bs
        0x714s
        0x719s
        0x755s
        0x700s
        0x706s
        0x710s
        0x707s
        0x755s
        0x705s
        0x707s
        0x71as
        0x705s
        0x710s
        0x707s
        0x701s
        0x70cs
        0x755s
        0x701s
        0x71as
        0x755s
        0x706s
        0x710s
        0x707s
        0x703s
        0x71cs
        0x716s
        0x710s
        0x6c7s
        0x6eas
        0x6f0s
        0x6e0s
        0x6e2s
        0x6f1s
        0x6e7s
        0x6eas
        0x6eds
        0x6e4s
        0x6a3s
        0x6e7s
        0x6e2s
        0x6f7s
        0x6e2s
        0x6ads
        0x6a3s
        0x6c5s
        0x6e2s
        0x6eas
        0x6efs
        0x6e6s
        0x6e7s
        0x6a3s
        0x6f7s
        0x6ecs
        0x6a3s
        0x6f0s
        0x6e6s
        0x6eds
        0x6e7s
        0x6a3s
        0x6e6s
        0x6f5s
        0x6e6s
        0x6eds
        0x6f7s
        0x6a3s
        0x6f7s
        0x6ecs
        0x6a3s
        0x6f0s
        0x6e6s
        0x6f1s
        0x6f5s
        0x6eas
        0x6e0s
        0x6e6s
    .end array-data
.end method

.method public constructor <init>(Lk6/s6;Lk6/x7;ZLk6/e;Lk6/e;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lk6/w6;->a:I

    iput-object p1, p0, Lk6/w6;->d:Lk6/s6;

    iput-object p2, p0, Lk6/w6;->b:Lk6/x7;

    iput-boolean p3, p0, Lk6/w6;->c:Z

    iput-object p4, p0, Lk6/w6;->e:La6/a;

    invoke-static {}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->۟ۤۦۨ۠()I

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
    const-string v0, "TUXSYzhMfiOCiqKLHwcCOyhxUouE"

    invoke-static {v0}, Lh/ۢۢۨۨ;->۟ۦ۠ۡۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public constructor <init>(Lk6/s6;Lk6/x7;ZLk6/v;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lk6/w6;->a:I

    iput-object p1, p0, Lk6/w6;->d:Lk6/s6;

    iput-object p2, p0, Lk6/w6;->b:Lk6/x7;

    iput-boolean p3, p0, Lk6/w6;->c:Z

    iput-object p4, p0, Lk6/w6;->e:La6/a;

    invoke-static {}, Lm7/ۡۢۦۢ;->ۣ۟ۡۡۤ()I

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
    const-string v0, "i6giidtsBszskQIKgLLd"

    invoke-static {v0}, Lf/ۣ۟ۤۤ;->ۣ۟ۧۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public static ۟۠ۥۨ۟()[S
    .locals 2

    invoke-static {}, Lr9/۟ۢۢۤۨ;->ۣ۟ۤۨۨ()I

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
    sget-object v0, Lk6/w6;->short:[S

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

    const/4 v1, 0x0

    invoke-static {p0}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->ۧۨۥۡ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->۟ۢۧۥ۠(Ljava/lang/Object;)La6/a;

    move-result-object v0

    invoke-static {p0}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->۟ۥ۟ۦۦ(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {p0}, Landroid/support/v4/app/ۥۣۡ;->ۡۨۦۤ(Ljava/lang/Object;)Lk6/x7;

    move-result-object v4

    invoke-static {p0}, Lm5/ۣۢ۟ۧ;->ۧ۠ۨۤ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v5

    packed-switch v2, :pswitch_data_0

    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟ۥۣۤ۠(Ljava/lang/Object;)Lk6/y3;

    move-result-object v6

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-nez v6, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v5}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {}, Lk6/w6;->۟۠ۥۨ۟()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->ۣ۟ۧۤۡ:I

    xor-int/lit16 v3, v3, -0x270

    const/16 v4, 0x775

    invoke-static {v1, v2, v3, v4}, Lr2/ۡۧۥۧ;->ۥ۠۠۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {v4}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    if-eqz v3, :cond_1

    const v2, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_6
    const v2, 0xbe41

    goto :goto_2

    :sswitch_7
    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_8
    move-object v0, v1

    :goto_4
    invoke-static {v5, v6, v0, v4}, Lw2/ۤ۠ۨۤ;->۟ۧۦۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lh7/۟۟ۧۨ۟;->ۧۡ۠ۢ(Ljava/lang/Object;)V

    :goto_5
    :sswitch_9
    return-void

    :sswitch_a
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_b
    check-cast v0, Lk6/e;

    goto :goto_4

    :pswitch_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟ۥۣۤ۠(Ljava/lang/Object;)Lk6/y3;

    move-result-object v6

    const v2, 0xbefb

    :goto_6
    const v7, 0xbf0c

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_c
    const v2, 0xbf39

    goto :goto_6

    :sswitch_d
    if-nez v6, :cond_2

    const v2, 0xc1e3

    goto :goto_6

    :sswitch_e
    invoke-static {v5}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {}, Lk6/w6;->۟۠ۥۨ۟()[S

    move-result-object v1

    const/16 v2, 0x44

    sget v3, Lcom/google/firebase/concurrent/ۣۦۨ۠;->ۣ۟ۧ۟ۢ:I

    xor-int/lit8 v3, v3, 0x52

    const/16 v4, 0x683

    invoke-static {v1, v2, v3, v4}, Lj5/۟ۢۥۨۦ;->۟۠ۤۨۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lw0/۟ۤۧۥۥ;->ۣۡۢ۠(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc202

    :goto_7
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_f
    const v0, 0xc221

    goto :goto_7

    :sswitch_10
    invoke-static {v4}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    const v2, 0xc27e

    :goto_8
    const v7, 0xc28f

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_6

    goto :goto_8

    :cond_3
    :sswitch_11
    const v2, 0xc2bc

    goto :goto_8

    :sswitch_12
    if-eqz v3, :cond_3

    const v2, 0xc2db

    goto :goto_8

    :sswitch_13
    const v0, 0xc2fa

    :goto_9
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_7

    goto :goto_9

    :sswitch_14
    const v0, 0xc5a4

    goto :goto_9

    :sswitch_15
    check-cast v0, Lk6/v;

    move-object v1, v0

    :sswitch_16
    invoke-static {v5, v6, v1, v4}, Lw2/ۤ۠ۨۤ;->۟ۧۦۢ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lh7/۟۟ۧۨ۟;->ۧۡ۠ۢ(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_data_0
    .packed-switch 0x0
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
        0x36 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_b
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_15
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_16
    .end sparse-switch
.end method
