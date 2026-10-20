.class public abstract Lf0/o1;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String;

.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    new-array v0, v3, [S

    const/16 v1, 0x5be

    aput-short v1, v0, v2

    sput-object v0, Lf0/o1;->short:[S

    invoke-static {}, Lf0/o1;->ۦۥۢۨ()[S

    move-result-object v0

    const/16 v1, 0x5f6

    invoke-static {v0, v2, v3, v1}, Lcom/google/firebase/messaging/reporting/ۥۡ۠ۥ;->ۥۨۡۥ([SIII)Ljava/lang/String;

    move-result-object v0

    sget v1, Lcom/auto/accept/ui/viewmodel/ۣۨ۠ۧ;->ۣ۟۠۠ۧ:I

    xor-int/lit16 v1, v1, 0x10b

    invoke-static {v1, v0}, Ldagger/hilt/codegen/۟ۡۦ۟ۡ;->۟ۢۤۡۥ(ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lf0/o1;->a:Ljava/lang/String;

    return-void
.end method

.method public static final a(La2/c0;Lm2/b;Lf2/d;Ljava/lang/String;I)J
    .locals 12

    const/4 v6, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v11, 0x0

    const-string v4, "\u06e1\u06e6\u06e2"

    move-object v9, v1

    move v10, v5

    move/from16 v7, p4

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Lq0/ۥۣۡۧ;->ۥ۠۠ۢ()Lr8/r;

    move-result-object v6

    const-string v1, "\u06e5\u06e1\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v9}, Lz/ۨۤۥۨ;->۟۟ۦۥۣ(Ljava/lang/Object;)F

    move-result v5

    const-string v1, "\u06e5\u06e3\u06e2"

    move-object v4, v1

    move v11, v5

    goto :goto_0

    :sswitch_1
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v2, v8}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->ۣ۟۠ۢۤ(III)J

    move-result-wide v2

    const-string v1, "\u06e4\u06e1\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    xor-int/lit16 v8, v10, -0x3c9

    const-string v1, "\u06e5\u06e6\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    sget v5, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->ۣۡ۠ۤ:I

    const-string v1, "\u06e0\u06e1\u06e5"

    move-object v4, v1

    move v10, v5

    goto :goto_0

    :sswitch_4
    sget v5, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۣ۟ۤۡ۠:I

    const-string v1, "\u06e0\u06e0\u06e2"

    move-object v4, v1

    move v10, v5

    goto :goto_0

    :sswitch_5
    move-object v0, p3

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v8}, Lx5/ۡۦۦۥ;->ۣۡۧۤ(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)La2/a;

    move-result-object v0

    const-string v1, "\u06e7\u06e3\u06e3"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v11}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣ۠ۢۨ(F)I

    move-result v7

    const-string v1, "\u06df\u06df\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_7
    invoke-static {v0}, Lcom/google/android/gms/common/util/۟ۧۤ۟ۥ;->ۢۡۥۥ(Ljava/lang/Object;)Li2/d;

    move-result-object v1

    const-string v4, "\u06e6\u06df\u06e2"

    move-object v9, v1

    goto :goto_0

    :sswitch_8
    xor-int/lit16 v8, v10, 0x128

    const-string v1, "\u06e6\u06e1\u06e8"

    move-object v4, v1

    goto :goto_0

    :sswitch_9
    invoke-static {v11}, Landroidx/annotation/۟ۦۤ۟ۤ;->ۣ۠ۢۨ(F)I

    move-result v5

    const-string v1, "\u06e5\u06e6\u06e5"

    move-object v4, v1

    move v10, v5

    goto :goto_0

    :sswitch_a
    invoke-static {v0}, Lh8/۟ۨۧ;->ۣۣۢۢ(Ljava/lang/Object;)F

    move-result v5

    const-string v1, "\u06e3\u06e4\u06e2"

    move-object v4, v1

    move v11, v5

    goto :goto_0

    :sswitch_b
    invoke-static {v10, v7}, La/ۥۡۢۨ;->۟ۡۥ۟(II)J

    move-result-wide v2

    const-string v1, "\u06e2\u06e6\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_c
    return-wide v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa705 -> :sswitch_b
        0x1aaae2 -> :sswitch_2
        0x1aab04 -> :sswitch_8
        0x1ab323 -> :sswitch_c
        0x1ab6a1 -> :sswitch_6
        0x1aba03 -> :sswitch_4
        0x1abdc3 -> :sswitch_3
        0x1abe04 -> :sswitch_9
        0x1abe60 -> :sswitch_5
        0x1abe64 -> :sswitch_a
        0x1ac149 -> :sswitch_0
        0x1ac18d -> :sswitch_1
        0x1ac587 -> :sswitch_7
    .end sparse-switch
.end method

.method public static synthetic b(La2/c0;Lm2/b;Lf2/d;)J
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    const-string v1, "\u06e4\u06e2\u06e3"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-wide v2

    :sswitch_0
    const/4 v1, 0x1

    invoke-static {p0, p1, p2, v0, v1}, Lw2/ۧۦۧ;->ۦۢ۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)J

    move-result-wide v2

    const-string v1, "\u06e1\u06e5\u06e7"

    goto :goto_0

    :sswitch_1
    invoke-static {}, Landroid/support/v4/app/ۥۣۡ;->ۣ۟ۢۡۤ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u06e6\u06e1"

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdcbb -> :sswitch_0
        0x1aba25 -> :sswitch_1
    .end sparse-switch
.end method

.method public static ۦۥۢۨ()[S
    .locals 2

    invoke-static {}, Ln7/۟ۡۢۦ;->۠ۧۦ()I

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
    sget-object v0, Lf0/o1;->short:[S

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
