.class public abstract Lk6/p2;
.super Lk6/q3;


# static fields
.field private static final short:[S


# instance fields
.field public b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x25

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/p2;->short:[S

    return-void

    :array_0
    .array-data 2
        0xa60s
        0xa41s
        0xa5as
        0xa0es
        0xa47s
        0xa40s
        0xa47s
        0xa5as
        0xa47s
        0xa4fs
        0xa42s
        0xa47s
        0xa54s
        0xa4bs
        0xa4as
        0xc0as
        0xc28s
        0xc27s
        0xc6es
        0xc3ds
        0xc69s
        0xc20s
        0xc27s
        0xc20s
        0xc3ds
        0xc20s
        0xc28s
        0xc25s
        0xc20s
        0xc33s
        0xc2cs
        0xc69s
        0xc3ds
        0xc3es
        0xc20s
        0xc2as
        0xc2cs
    .end array-data
.end method

.method public constructor <init>(Lk6/f5;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lf/۟ۤۧ۠ۡ;->ۥۧۥۡ(Ljava/lang/Object;)V

    iput-object p1, p0, Lf4/y;->a:Ljava/lang/Object;

    invoke-static {p1}, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۢ۟ۡ۟(Ljava/lang/Object;)I

    move-result v0

    sget v1, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->ۣ۟ۡۤۤ:I

    xor-int/lit8 v1, v1, 0x42

    add-int/2addr v0, v1

    iput v0, p1, Lk6/f5;->E:I

    invoke-static {}, Lcom/google/firebase/database/collection/ۨۤ۟ۧ;->۟ۢۡۨۡ()I

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
    const-string v0, "bSb15iD65F7u"

    invoke-static {v0}, Ldagger/hilt/android/internal/modules/ۣۨۨ۠;->۟ۦ۟ۨۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۣ۟ۤ۟()[S
    .locals 2

    invoke-static {}, Lg0/۟ۥۢۥۢ;->ۥۧ۟ۦ()I

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
    sget-object v0, Lk6/p2;->short:[S

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
.method public final s()V
    .locals 5

    invoke-static {p0}, Lg5/ۣۡۦۣ;->۟ۡۡۥۣ(Ljava/lang/Object;)Z

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lcom/google/android/datatransport/runtime/backends/ۦۣۥۤ;->۟ۡۨۡۧ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    const-string v0, "IaZiKt"

    invoke-static {v0}, Lq9/۟ۧۦۤۨ;->۟۟ۢۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_6
    return-void

    :sswitch_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lk6/p2;->ۣ۟ۤ۟()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lz/ۨۤۥۨ;->ۡۡۧۤ:I

    xor-int/lit16 v3, v3, -0x228

    const/16 v4, 0xa2e

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/measurement/ۧۦ۠ۧ;->۟ۦۦۦۦ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method public final t()V
    .locals 5

    invoke-static {p0}, Lg5/ۣۡۦۣ;->۟ۡۡۥۣ(Ljava/lang/Object;)Z

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
    invoke-static {p0}, Ld5/ۣۦۢۢ;->۟ۦ۠ۦۣ(Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/f5;

    invoke-static {v0}, Lr7/ۧ۠۠ۤ;->ۤۤ۠ۧ(Ljava/lang/Object;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۨۨۦۦ(Ljava/lang/Object;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk6/p2;->b:Z

    :sswitch_6
    return-void

    :sswitch_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {}, Lk6/p2;->ۣ۟ۤ۟()[S

    move-result-object v1

    const/16 v2, 0xf

    sget v3, Lq7/۟ۢۢ۟ۧ;->۟ۦۤۤ۟:I

    xor-int/lit16 v3, v3, -0x12d

    const/16 v4, 0xc49

    invoke-static {v1, v2, v3, v4}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->۠ۦۡۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method

.method public abstract u()Z
.end method
