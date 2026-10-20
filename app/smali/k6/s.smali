.class public final Lk6/s;
.super La6/a;

# interfaces
.implements Ljava/lang/Iterable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lk6/s;",
            ">;"
        }
    .end annotation
.end field

.field private static final short:[S


# instance fields
.field public final a:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x5

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/s;->short:[S

    new-instance v0, Lz5/n;

    sget v1, Lr2/ۡۧۥۧ;->ۧۤۧ:I

    xor-int/lit16 v1, v1, -0xc4

    invoke-direct {v0, v1}, Lz5/n;-><init>(I)V

    sput-object v0, Lk6/s;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void

    :array_0
    .array-data 2
        0x2b4s
        0x2a3s
        0x2aes
        0x2b7s
        0x2a7s
    .end array-data
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/s;->a:Landroid/os/Bundle;

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
    const-string v0, "lBBTsuK7"

    invoke-static {v0}, Lf6/ۦۣۦ۟;->ۣ۟ۨۧۦ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۢۤ()[S
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lk6/s;->short:[S

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
.method public final e()Ljava/lang/Double;
    .locals 12

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-wide/16 v10, 0x0

    const-string v5, "\u06e6\u06e3\u06e7"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lk6/s;->ۣۢۤ()[S

    move-result-object v1

    const-string v5, "\u06e0\u06df\u06e0"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    const/16 v1, 0x2c2

    invoke-static {v3, v7, v6, v1}, La8/ۣۡۨ۠;->ۣ۟۟۠ۦ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e1\u06e8\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    xor-int/lit16 v6, v8, -0x194

    const-string v1, "\u06e5\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۠ۨۤ۠(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "\u06df\u06e5"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v0, v4}, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۥۦۣۡ(Ljava/lang/Object;Ljava/lang/Object;)D

    move-result-wide v10

    const-string v1, "\u06e4\u06e2\u06e1"

    move-object v5, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v10, v11}, Lt2/۟ۦۢۡۧ;->ۣ۟ۡۡۧ(D)Ljava/lang/Double;

    move-result-object v1

    const-string v5, "\u06e5\u06e4\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_5
    sget v8, Ls7/۟ۢ۟ۤۧ;->۟ۦۤۥۥ:I

    const-string v1, "\u06e3\u06e6\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_6
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0xdbe6 -> :sswitch_3
        0xdca3 -> :sswitch_0
        0x1aaac1 -> :sswitch_5
        0x1aaf9c -> :sswitch_2
        0x1ab6dc -> :sswitch_1
        0x1aba23 -> :sswitch_4
        0x1abe22 -> :sswitch_6
    .end sparse-switch
.end method

.method public final g()Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-static {p0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۠ۨۤ۠(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lk6/u;

    invoke-direct {v0, p0}, Lk6/u;-><init>(Lk6/s;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/firestore/core/۟ۥۣ۠ۧ;->۟۠ۨۤ۠(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lx8/ۢۨۥۨ;->ۣۥۨۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    const/4 v3, 0x0

    const/4 v0, 0x0

    const-string v1, "\u06e0\u06e0\u06e3"

    move v2, v3

    move v4, v3

    move v5, v3

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    xor-int/lit16 v3, v5, 0x4e44

    const-string v1, "\u06e5\u06df\u06e5"

    move v4, v3

    goto :goto_0

    :sswitch_0
    invoke-static {v4, p1}, Lcom/google/android/gms/common/ۦۢۨ;->ۣ۟ۧۡۤ(ILjava/lang/Object;)I

    move-result v3

    const-string v1, "\u06e4\u06e6\u06df"

    move v5, v3

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Ls7/ۧۤۦۤ;->ۧ۟۟ۢ(Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "\u06e5\u06e3\u06df"

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v2, v4, -0x1a0

    const-string v1, "\u06e0\u06e6\u06e7"

    goto :goto_0

    :sswitch_3
    invoke-static {v5, p1}, Li5/ۢۤۡ;->۟ۡ۟ۤ۟(ILjava/lang/Object;)V

    const-string v1, "\u06df\u06e2\u06e1"

    goto :goto_0

    :sswitch_4
    sget v3, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->ۣ۟۠۠ۧ:I

    const-string v1, "\u06e0\u06e7\u06e1"

    move v5, v3

    goto :goto_0

    :sswitch_5
    sget v3, Lg/۟ۦۥۥۤ;->۟ۡۤ۠ۥ:I

    const-string v1, "\u06e3\u06e1\u06e0"

    move v4, v3

    goto :goto_0

    :sswitch_6
    invoke-static {p1, v2, v0}, Lc1/ۢۥۥ۟;->ۣ۠ۥۧ(Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v1, "\u06df\u06e0\u06e3"

    goto :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa722 -> :sswitch_3
        0x1aa75e -> :sswitch_7
        0x1aaae3 -> :sswitch_4
        0x1aaba1 -> :sswitch_6
        0x1ab642 -> :sswitch_2
        0x1aba9d -> :sswitch_1
        0x1abd8b -> :sswitch_0
        0x1abe01 -> :sswitch_5
    .end sparse-switch
.end method
