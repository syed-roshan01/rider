.class public final Lk6/u;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Iterable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x14

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/u;->short:[S

    return-void

    :array_0
    .array-data 2
        0x49bs
        0x4acs
        0x4a4s
        0x4a6s
        0x4bfs
        0x4acs
        0x4e9s
        0x4a7s
        0x4a6s
        0x4bds
        0x4e9s
        0x4bas
        0x4bcs
        0x4b9s
        0x4b9s
        0x4a6s
        0x4bbs
        0x4bds
        0x4acs
        0x4ads
    .end array-data
.end method

.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/r1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lk6/u;->a:I

    iput-object p1, p0, Lk6/u;->c:Ljava/lang/Iterable;

    invoke-static {p1}, La6/۟ۤۨۨ۟;->ۣ۠ۦ۠(Ljava/lang/Object;)Lcom/google/crypto/tink/shaded/protobuf/k0;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۦۢۥ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lk6/u;->b:Ljava/lang/Object;

    invoke-static {}, Lcom/google/firebase/emulators/۟ۥۦۣۢ;->۠۠ۤۤ()I

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
    const-string v0, "zEX5nrncRA3vGCPDic9PtynaIT"

    invoke-static {v0}, Lcom/google/firebase/analytics/connector/internal/ۣۦ۟۟;->۟ۦۧۦۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public constructor <init>(Lcom/google/protobuf/n;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Lk6/u;->a:I

    instance-of v1, p1, Lcom/google/protobuf/h2;

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
    check-cast p1, Lcom/google/protobuf/h2;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-static {p1}, Lx5/ۡۦۦۥ;->ۨۥۡۡ(Ljava/lang/Object;)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object v0, p0, Lk6/u;->b:Ljava/lang/Object;

    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۨۨ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lr4/۟ۦۦ۠ۥ;->ۦۢ۟ۢ(Ljava/lang/Object;)Lcom/google/protobuf/n;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۨۡۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/protobuf/l;

    move-result-object v0

    iput-object v0, p0, Lk6/u;->c:Ljava/lang/Iterable;

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    const/4 v0, 0x0

    iput-object v0, p0, Lk6/u;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/protobuf/l;

    iput-object p1, p0, Lk6/u;->c:Ljava/lang/Iterable;

    :sswitch_5
    invoke-static {}, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->۟ۧۦۥ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-gtz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    const-string v0, "bF1fLfBe4rek5GhjxDIdAYLE1Imo"

    invoke-static {v0}, Landroidx/lifecycle/ۧۥۡۨ;->ۡۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_9
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
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/n;I)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lk6/u;->a:I

    invoke-direct {p0, p1}, Lk6/u;-><init>(Lcom/google/protobuf/n;)V

    invoke-static {}, Landroidx/compose/foundation/۟ۥۦ۟ۨ;->ۣ۟۠۠ۨ()I

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
    const-string v0, "ZqXA2kdjVExprEYceu"

    invoke-static {v0}, Le7/ۧ۠ۧ;->۟ۢۨۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public constructor <init>(Lcom/google/protobuf/u2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lk6/u;->a:I

    iput-object p1, p0, Lk6/u;->c:Ljava/lang/Iterable;

    invoke-static {p1}, Landroidx/compose/ui/graphics/۟ۥۨۧۥ;->۟ۢ۠ۡۢ(Ljava/lang/Object;)Lcom/google/protobuf/e1;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/play/core/integrity/client/۟ۢ۟۠ۤ;->ۧۦۢۥ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lk6/u;->b:Ljava/lang/Object;

    invoke-static {}, Lw0/۟ۤۧۥۥ;->ۣۣ۟ۧۡ()I

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
    const-string v0, "vs8AwaPuzxXBhdwumJPS3Dr"

    invoke-static {v0}, Li4/ۨ۟ۨ;->ۣۥۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public constructor <init>(Lk6/s;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lk6/u;->a:I

    iput-object p1, p0, Lk6/u;->c:Ljava/lang/Iterable;

    invoke-static {p1}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۠ۨۤ۠(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lc1/ۣۢۧۨ;->ۤۧۢ۠(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lf0/ۣۤ۠۟;->ۧ۠۠ۨ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lk6/u;->b:Ljava/lang/Object;

    invoke-static {}, Lq1/۠۠ۤ;->ۧۢۦۣ()I

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
    const-string v0, "UkwxYmf1OJirludo9"

    invoke-static {v0}, Lb8/ۣ۟ۨۢۥ;->ۦۣۣۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۧۦۣۦ()[S
    .locals 2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟ۦ۟ۡۧ()I

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
    sget-object v0, Lk6/u;->short:[S

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
.method public final a(Lcom/google/protobuf/n;)Lcom/google/protobuf/l;
    .locals 3

    move-object v0, p1

    :sswitch_0
    instance-of v2, v0, Lcom/google/protobuf/h2;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_1
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_2
    if-eqz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_3
    check-cast v0, Lcom/google/protobuf/h2;

    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayDeque;

    invoke-static {v1, v0}, Lcom/google/firebase/remoteconfig/۟ۡ۟۠ۦ;->ۨۨ۟۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lr4/۟ۦۦ۠ۥ;->ۦۢ۟ۢ(Ljava/lang/Object;)Lcom/google/protobuf/n;

    move-result-object v0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_5
    check-cast v0, Lcom/google/protobuf/l;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_0
    .end sparse-switch
.end method

.method public final b()Lcom/google/protobuf/l;
    .locals 5

    invoke-static {p0}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Lcom/google/protobuf/l;

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
    if-eqz v0, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast v1, Lcom/google/protobuf/l;

    :sswitch_3
    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayDeque;

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-eqz v0, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {v0}, Lp8/۟۟ۢ۟ۢ;->ۥۤ۠ۤ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-eqz v2, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :sswitch_a
    const/4 v0, 0x0

    :sswitch_b
    iput-object v0, p0, Lk6/u;->c:Ljava/lang/Iterable;

    return-object v1

    :sswitch_c
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_d
    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-static {v0}, Lm4/۟ۧۤ۠;->۟ۥۤۢۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/h2;

    invoke-static {v0}, Landroid/support/v4/app/ۥۣۡ;->ۢ۠ۤ(Ljava/lang/Object;)Lcom/google/protobuf/n;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/firebase/abt/ۢۦۨۤ;->ۨۡۢۦ(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/protobuf/l;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->۟ۢ۠ۥۤ(Ljava/lang/Object;)Z

    move-result v3

    const v2, 0xbefb

    :goto_4
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_e
    const v2, 0xbf39

    goto :goto_4

    :sswitch_f
    if-nez v3, :cond_3

    const v2, 0xc1e3

    goto :goto_4

    :sswitch_10
    const v2, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_5

    goto :goto_5

    :sswitch_11
    const v2, 0xc221

    goto :goto_5

    :sswitch_12
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_12
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_a
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_d
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_3
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_b
    .end sparse-switch
.end method

.method public final hasNext()Z
    .locals 2

    invoke-static {p0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->۟ۧۦۣۢ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-static {v0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    :sswitch_0
    return v0

    :pswitch_0
    invoke-static {p0}, Lcom/google/android/gms/tasks/ۡۤۢۧ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/l;

    const/16 v1, 0x650

    :goto_1
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_1
    const/16 v1, 0x68e

    goto :goto_1

    :sswitch_2
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_1

    :sswitch_3
    const/4 v0, 0x1

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    const/16 v1, 0x6eb

    goto :goto_2

    :sswitch_5
    const/4 v0, 0x0

    goto :goto_0

    :pswitch_1
    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-static {v0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :pswitch_2
    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-static {v0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۧۤۦ۠(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

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
        0xef -> :sswitch_5
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_0
    .end sparse-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    invoke-static {p0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->۟ۧۦۣۢ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-static {v0}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

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

    :pswitch_0
    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-static {v0}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_1

    :pswitch_1
    invoke-static {p0}, Lh/ۢۢۨۨ;->ۦۤۤۧ(Ljava/lang/Object;)Lcom/google/protobuf/l;

    move-result-object v0

    goto :goto_1

    :pswitch_2
    packed-switch v0, :pswitch_data_2

    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-static {v0}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_2
    const/16 v1, 0x6eb

    goto :goto_2

    :pswitch_3
    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-static {v0}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_1

    :pswitch_4
    invoke-static {p0}, Lm1/ۣۡ۠ۧ;->ۤۢۤۦ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-static {v0}, Ls6/۟ۡ۟ۧۢ;->ۥۧۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_3
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_2
        0x36 -> :sswitch_0
    .end sparse-switch
.end method

.method public final remove()V
    .locals 5

    invoke-static {p0}, Lcom/google/firebase/concurrent/ۣ۟ۧۨۨ;->۟ۧۦۣۢ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-static {}, Lk6/u;->ۧۦۣۦ()[S

    move-result-object v1

    const/4 v2, 0x0

    sget v3, Lf6/ۣۣۣۣ۟;->۟۠ۢۧۨ:I

    xor-int/lit16 v3, v3, -0x1a6

    const/16 v4, 0x4c9

    invoke-static {v1, v2, v3, v4}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۦۣ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
