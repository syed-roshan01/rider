.class public final Lf0/z0;
.super Ljava/lang/Object;


# static fields
.field private static final short:[S


# instance fields
.field public final a:Lu1/t2;

.field public b:Lf0/a1;

.field public c:Lc1/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xf

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lf0/z0;->short:[S

    return-void

    :array_0
    .array-data 2
        0x656s
        0x658s
        0x644s
        0x65fs
        0x652s
        0x65cs
        0x64fs
        0x659s
        0x67cs
        0x65es
        0x649s
        0x654s
        0x652s
        0x653s
        0x64es
    .end array-data
.end method

.method public constructor <init>(Lu1/t2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/z0;->a:Lu1/t2;

    invoke-static {}, Ls/ۣۡۡۧ;->ۣ۟ۦ۟۟()I

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
    const-string v0, "RMtPRIiuepJ8tXPRv1I46A3iUun"

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->۠۟ۨۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۟ۥ۟۟ۦ()[S
    .locals 2

    invoke-static {}, Lu/ۣۤۧ۠;->ۣۨۧۦ()I

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
    sget-object v0, Lf0/z0;->short:[S

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
.method public final a()Lf0/a1;
    .locals 4

    invoke-static {p0}, Lj2/۠ۤۨۤ;->۟ۦۡ۟ۧ(Ljava/lang/Object;)Lf0/a1;

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
    invoke-static {}, Lf0/z0;->۟ۥ۟۟ۦ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v2, Landroidx/appcompat/widget/ۣۡۧۤ;->ۣ۟ۥ۟ۧ:I

    xor-int/lit16 v2, v2, -0x296

    const/16 v3, 0x63d

    invoke-static {v0, v1, v2, v3}, Lz0/ۣ۟۠ۤ۟;->۟۠۠۟۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/firestore/ktx/۟ۢۡۧۨ;->۠ۧ۠۟(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :sswitch_3
    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method
