.class public final Lk6/y6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Lk6/y3;

.field public final c:Lk6/z6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/y6;->short:[S

    return-void

    :array_0
    .array-data 2
        0x57ds
        0x551s
        0x550s
        0x550s
        0x55bs
        0x55ds
        0x54as
        0x55bs
        0x55as
        0x51es
        0x54as
        0x551s
        0x51es
        0x54cs
        0x55bs
        0x553s
        0x551s
        0x54as
        0x55bs
        0x51es
        0x54ds
        0x55bs
        0x54cs
        0x548s
        0x557s
        0x55ds
        0x55bs
        0xc16s
        0xc3as
        0xc3bs
        0xc3bs
        0xc30s
        0xc36s
        0xc21s
        0xc30s
        0xc31s
        0xc75s
        0xc21s
        0xc3as
        0xc75s
        0xc26s
        0xc30s
        0xc27s
        0xc23s
        0xc3cs
        0xc36s
        0xc30s
    .end array-data
.end method

.method public synthetic constructor <init>(Lk6/z6;Lk6/y3;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lk6/y6;->a:I

    iput-object p1, p0, Lk6/y6;->c:Lk6/z6;

    iput-object p2, p0, Lk6/y6;->b:Lk6/y3;

    invoke-static {}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->ۣ۟ۧۦۦ()I

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
    const-string v0, "oAkDSETme"

    invoke-static {v0}, Lu/ۣۤۧ۠;->۠۠۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public static ۤۤ۟۟()[S
    .locals 2

    invoke-static {}, Lm7/ۥۨۥ۟;->۟ۡ۟ۤ۠()I

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
    sget-object v0, Lk6/y6;->short:[S

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
    .locals 6

    invoke-static {p0}, Lm1/۟ۧۥ۟ۨ;->۟ۥۡۤۧ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lk6/z6;->a:Z

    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v0

    invoke-static {v0}, Lo5/۟ۧۡۧۦ;->ۣ۠ۧۧ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    invoke-static {v0}, Lu3/ۣۡۡۢ;->۟۟ۦ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v0

    invoke-static {v0}, Lo5/۟ۧۡۧۦ;->ۣ۠ۧۧ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Lw9/۟۠۠ۢ۟;->ۣۣۥۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/y6;->ۤۤ۟۟()[S

    move-result-object v1

    const/4 v3, 0x0

    sget v4, Lz/ۨۤۥۨ;->ۡۡۧۤ:I

    xor-int/lit16 v4, v4, -0x234

    const/16 v5, 0x53e

    invoke-static {v1, v3, v4, v5}, Ldagger/hilt/ۣ۟ۧۤ۠;->ۣۧ۟ۥ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v0

    invoke-static {v0}, Lo5/۟ۧۡۧۦ;->ۣ۠ۧۧ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    invoke-static {p0}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۣ۟۟ۧ۠(Ljava/lang/Object;)Lk6/y3;

    move-result-object v1

    invoke-static {v0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v1}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    iput-object v1, v0, Lk6/s6;->d:Lk6/y3;

    invoke-static {v0}, Lh7/۟۟ۧۨ۟;->ۧۡ۠ۢ(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->۟ۧۦۧۢ(Ljava/lang/Object;)V

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :catchall_0
    move-exception v0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    const v1, 0xbe22

    goto :goto_2

    :sswitch_5
    monitor-exit v2

    invoke-static {}, Landroid/support/v4/app/ۥۣۡ;->ۣ۠۠ۧ()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_1
    :sswitch_6
    const v0, 0xbebd

    goto :goto_3

    :sswitch_7
    if-ltz v1, :cond_1

    const v0, 0xbedc

    goto :goto_3

    :sswitch_8
    const-string v0, "MRfshV"

    invoke-static {v0}, Lt9/ۧۦۥ۟;->ۨۧۥ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_4
    :sswitch_9
    return-void

    :sswitch_a
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :pswitch_0
    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v2

    monitor-enter v2

    :try_start_1
    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lk6/z6;->a:Z

    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v0

    invoke-static {v0}, Lo5/۟ۧۡۧۦ;->ۣ۠ۧۧ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    invoke-static {v0}, Lu3/ۣۡۡۢ;->۟۟ۦ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_b
    const v0, 0xbf39

    goto :goto_5

    :sswitch_c
    if-nez v1, :cond_2

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_d
    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v0

    invoke-static {v0}, Lo5/۟ۧۡۧۦ;->ۣ۠ۧۧ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/draw/ۧۤۤ۠;->ۥۣۨ۠(Ljava/lang/Object;)Lk6/d4;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->ۦۡۦۥ(Ljava/lang/Object;)Lk6/f4;

    move-result-object v0

    invoke-static {}, Lk6/y6;->ۤۤ۟۟()[S

    move-result-object v1

    const/16 v3, 0x1b

    sget v4, Ll6/ۥۦۣ۟;->ۣۡۧۧ:I

    xor-int/lit16 v4, v4, 0x18b

    const/16 v5, 0xc55

    invoke-static {v1, v3, v4, v5}, Lu1/ۢۥ۠ۤ;->۟ۦۢ۠۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۦ۠ۥۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->۟ۡ۠ۥۤ(Ljava/lang/Object;)Lk6/z6;

    move-result-object v0

    invoke-static {v0}, Lo5/۟ۧۡۧۦ;->ۣ۠ۧۧ(Ljava/lang/Object;)Lk6/s6;

    move-result-object v0

    invoke-static {p0}, Lcom/google/firebase/firestore/model/۟ۧۦۨۢ;->ۣ۟۟ۧ۠(Ljava/lang/Object;)Lk6/y3;

    move-result-object v1

    invoke-static {v0}, Landroidx/core/app/ۣۥۢۧ;->ۢۤۥ(Ljava/lang/Object;)V

    invoke-static {v1}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    iput-object v1, v0, Lk6/s6;->d:Lk6/y3;

    invoke-static {v0}, Lh7/۟۟ۧۨ۟;->ۧۡ۠ۢ(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/google/firebase/emulators/ۣۧ۟ۨ;->۟ۧۦۧۢ(Ljava/lang/Object;)V

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_e
    const v0, 0xc221

    goto :goto_6

    :catchall_1
    move-exception v0

    const v1, 0xc27e

    :goto_7
    const v3, 0xc28f

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_f
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    :sswitch_10
    const v1, 0xc29d

    goto :goto_7

    :sswitch_11
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto/16 :goto_4

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0xb97b -> :sswitch_a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_6
        0x2d -> :sswitch_9
        0x4c -> :sswitch_8
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_f
        0xf1 -> :sswitch_10
    .end sparse-switch
.end method
