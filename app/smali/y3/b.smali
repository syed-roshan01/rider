.class public final Ly3/b;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ly3/d;

.field public final c:[B

.field public final d:Ljava/io/File;

.field public final e:Ljava/lang/String;

.field public f:Z

.field public g:[Ly3/c;

.field public h:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ly3/b;->short:[S

    return-void

    :array_0
    .array-data 2
        0x391s
        0x39ds
        0x39fs
        0x382s
        0x380s
        0x397s
        0x381s
        0x381s
        0x397s
        0x396s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/res/AssetManager;Lm/a;Ly3/d;Ljava/lang/String;Ljava/io/File;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly3/b;->f:Z

    iput-object p2, p0, Ly3/b;->a:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Ly3/b;->b:Ly3/d;

    iput-object p4, p0, Ly3/b;->e:Ljava/lang/String;

    iput-object p5, p0, Ly3/b;->d:Ljava/io/File;

    invoke-static {}, Ln9/ۤۧۧۤ;->۟ۡۤۢۦ()I

    move-result v2

    const/4 v0, 0x0

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
    const/16 v1, 0x22

    if-le v2, v1, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    packed-switch v2, :pswitch_data_0

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_5
    const v1, 0xbe22

    goto :goto_2

    :pswitch_0
    invoke-static {}, Lcom/google/firebase/remoteconfig/interop/ۣۨۡ۟;->ۦۤۦۣ()[B

    move-result-object v0

    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_6
    iput-object v0, p0, Ly3/b;->c:[B

    invoke-static {}, Lcom/google/firebase/firestore/core/ۧۤۡۧ;->۟ۦۣ۟۟()I

    move-result v1

    const v0, 0xc27e

    :goto_5
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_1
    :sswitch_7
    const v0, 0xc2bc

    goto :goto_5

    :sswitch_8
    const v1, 0xbe9e

    goto :goto_3

    :pswitch_1
    invoke-static {}, Lg7/۠ۤۧ;->۟ۡۢۨ()[B

    move-result-object v0

    const v1, 0xbefb

    :goto_6
    const v2, 0xbf0c

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_5

    goto :goto_6

    :sswitch_9
    const v1, 0xbf1a

    goto :goto_6

    :pswitch_2
    invoke-static {}, Lf0/ۣۦۦ۠;->ۤۦۧۤ()[B

    move-result-object v0

    const v1, 0xc202

    :goto_7
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_a
    const v1, 0xc221

    goto :goto_7

    :pswitch_3
    invoke-static {}, Lcom/google/firebase/dynamicloading/ۣ۟۠ۨۢ;->۟ۦۣۤ۟()[B

    move-result-object v0

    goto :goto_4

    :sswitch_b
    if-ltz v1, :cond_1

    const v0, 0xc2db

    goto :goto_5

    :sswitch_c
    const-string v0, "D25rNeA3"

    invoke-static {v0}, Lm3/۟ۦۦۡۢ;->۟ۥ۟۠۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_d
    return-void

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
        0x36 -> :sswitch_6
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb97b -> :sswitch_6
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_6
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x12 -> :sswitch_7
        0x33 -> :sswitch_d
        0x54 -> :sswitch_c
        0xf1 -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_6
        0x1f7 -> :sswitch_9
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_a
        0x32 -> :sswitch_6
    .end sparse-switch
.end method

.method public static ۡ۠ۤۦ()[S
    .locals 2

    invoke-static {}, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->۟۠ۤۤۧ()I

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
    sget-object v0, Ly3/b;->short:[S

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
.method public final a(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 5

    :try_start_0
    invoke-static {p1, p2}, Ldagger/hilt/internal/aggregatedroot/ۢ۟ۤۧ;->۟ۥۨۤۢ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v0

    invoke-static {v0}, La/ۥۦۥۡ;->ۣۣۨ(Ljava/lang/Object;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :goto_1
    :sswitch_0
    return-object v0

    :sswitch_1
    const/16 v1, 0x66f

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v0}, Ld1/۟ۡۨۧۢ;->۟۟ۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_2
    if-eqz v1, :cond_0

    const/16 v0, 0x729

    goto :goto_2

    :cond_0
    :sswitch_3
    const/16 v0, 0x70a

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ly3/b;->ۡ۠ۤۦ()[S

    move-result-object v0

    const/4 v2, 0x0

    sget v3, Lfa/ۣ۟ۥۤ;->ۣۢۡۥ:I

    xor-int/lit16 v3, v3, -0x1ca

    const/16 v4, 0x3f2

    invoke-static {v0, v2, v3, v4}, Ll6/ۥۦۣ۟;->ۧۨۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ldagger/hilt/internal/aliasof/۟ۢۢ۠۠;->ۨۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-eqz v1, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :cond_1
    :sswitch_6
    const v0, 0xbe41

    goto :goto_3

    :sswitch_7
    invoke-static {p0}, Lh8/۟ۨۧ;->۟ۦۤۥۣ(Ljava/lang/Object;)Ly3/d;

    move-result-object v0

    invoke-static {v0}, La/ۨۥۥۤ;->ۦۧ۠ۡ(Ljava/lang/Object;)V

    :sswitch_8
    const/4 v0, 0x0

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_2
        0x36 -> :sswitch_3
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_8
        0xb939 -> :sswitch_7
        0xb97b -> :sswitch_6
    .end sparse-switch
.end method

.method public final b(ILjava/io/Serializable;)V
    .locals 2

    new-instance v0, Ly3/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Ly3/a;-><init>(Ljava/lang/Object;ILjava/io/Serializable;I)V

    invoke-static {p0}, Lv7/ۤۦۧ۟;->۟ۥۦۣۨ(Ljava/lang/Object;)Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/firebase/firestore/util/ۣۣ۠;->۠ۦۨۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/google/firebase/measurement_impl/۟ۧۢۢۢ;->ۤۨۡۡ()I

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
    const-string v0, "IRxS3Nql6v6kKMPbo4SHNruh"

    invoke-static {v0}, Lr/۠ۡ۠;->ۨ۠ۥۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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
