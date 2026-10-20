.class public final Lk6/r;
.super Lk6/o5;


# static fields
.field private static final short:[S


# instance fields
.field public c:J

.field public d:Ljava/lang/String;

.field public e:Landroid/accounts/AccountManager;

.field public f:Ljava/lang/Boolean;

.field public g:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [S

    const/4 v1, 0x0

    const/16 v2, 0x557

    aput-short v2, v0, v1

    sput-object v0, Lk6/r;->short:[S

    return-void
.end method

.method public static ۟ۦۡۦۣ()[S
    .locals 2

    invoke-static {}, Ld1/۟۟ۥۡۡ;->ۨۤۦ()I

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
    sget-object v0, Lk6/r;->short:[S

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
.method public final o()Z
    .locals 21

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/4 v6, 0x0

    const-wide/16 v14, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v9, 0x0

    const-string v12, "\u06e8\u06e4\u06e5"

    :goto_0
    invoke-static {v12}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    invoke-static {v7, v11, v8}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣۣ۟ۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v12, "\u06e7\u06e0\u06df"

    goto :goto_0

    :sswitch_0
    invoke-static {v5, v13}, Lm3/۟ۦۦۡۢ;->ۣ۟ۢ۟ۢ(Ljava/lang/Object;I)I

    move-result v19

    const-string v12, "\u06e7\u06e2\u06e3"

    goto :goto_0

    :sswitch_1
    move/from16 v0, v19

    xor-int/lit16 v13, v0, -0x187

    const-string v12, "\u06e1\u06e8\u06e2"

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lc7/۟ۦۣۢۦ;->ۣ۟ۧۥ()Ljava/util/Locale;

    move-result-object v3

    const-string v12, "\u06e4\u06e2"

    goto :goto_0

    :sswitch_3
    invoke-static {v11, v4}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const-string v12, "\u06e3\u06e7\u06e4"

    goto :goto_0

    :sswitch_4
    invoke-static {v11, v4}, Ln7/۟ۤ۠۟ۥ;->ۣ۟ۢۤۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v12, "\u06e8\u06e7\u06e5"

    goto :goto_0

    :sswitch_5
    const/4 v11, 0x0

    const/4 v12, 0x1

    const/16 v20, 0x57a

    move/from16 v0, v20

    invoke-static {v2, v11, v12, v0}, Lh7/ۥۥۢ۟;->۟ۤۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v11

    const-string v12, "\u06e1\u06e6\u06df"

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lk6/r;->۟ۦۡۦۣ()[S

    move-result-object v2

    const-string v12, "\u06e0\u06e5\u06e7"

    goto :goto_0

    :sswitch_7
    move/from16 v0, v19

    int-to-long v0, v0

    move-wide/from16 v16, v0

    const-string v12, "\u06e5\u06e2\u06e2"

    goto :goto_0

    :sswitch_8
    invoke-static {v3}, Lf4/ۡۤۡ;->ۣۨ۠ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "\u06e0\u06e2\u06e0"

    goto :goto_0

    :sswitch_9
    sget v19, Ls7/۟ۢ۟ۤۧ;->۟ۦۤۥۥ:I

    const-string v12, "\u06e0\u06e6\u06e4"

    goto :goto_0

    :sswitch_a
    rsub-int/lit8 v13, v19, 0x0

    const-string v12, "\u06e2\u06e0\u06e2"

    goto :goto_0

    :sswitch_b
    move-wide/from16 v0, v16

    invoke-static {v10, v0, v1, v6}, Lc3/۟ۥ۠ۡۧ;->۟ۡۤ۠ۨ(Ljava/lang/Object;JLjava/lang/Object;)J

    move-result-wide v14

    const-string v12, "\u06e5\u06e0\u06e3"

    goto :goto_0

    :sswitch_c
    move-object/from16 v0, p0

    iput-wide v14, v0, Lk6/r;->c:J

    const-string v12, "\u06e2\u06e6"

    goto :goto_0

    :sswitch_d
    invoke-static {}, Lv/ۣۢ۟ۧ;->۟ۥۨ۟ۡ()Ljava/util/Calendar;

    move-result-object v5

    const-string v12, "\u06e5\u06e0\u06df"

    goto :goto_0

    :sswitch_e
    move/from16 v0, v19

    invoke-static {v5, v0}, Lm3/۟ۦۦۡۢ;->ۣ۟ۢ۟ۢ(Ljava/lang/Object;I)I

    move-result v18

    const-string v12, "\u06e3\u06e3"

    goto :goto_0

    :sswitch_f
    sget v18, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->ۣ۟ۢۨۤ:I

    const-string v12, "\u06e7\u06e6\u06e6"

    goto/16 :goto_0

    :sswitch_10
    const/4 v2, 0x0

    return v2

    :sswitch_11
    move-object/from16 v0, p0

    iput-object v9, v0, Lk6/r;->d:Ljava/lang/String;

    const-string v12, "\u06e2\u06e4\u06e3"

    goto/16 :goto_0

    :sswitch_12
    move/from16 v0, v18

    xor-int/lit16 v0, v0, -0x39e

    move/from16 v19, v0

    const-string v12, "\u06e6\u06e6\u06e2"

    goto/16 :goto_0

    :sswitch_13
    invoke-static {}, Lh8/۟ۨۧ;->ۣ۟ۤ۠ۡ()Ljava/util/Locale;

    move-result-object v4

    const-string v12, "\u06e2\u06e8"

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Ld9/ۨۧۧۦ;->ۦۢ۟ۧ()Ljava/util/concurrent/TimeUnit;

    move-result-object v10

    const-string v12, "\u06e5\u06e2\u06e0"

    goto/16 :goto_0

    :sswitch_15
    sub-int v19, v18, v13

    const-string v12, "\u06e7\u06e2"

    goto/16 :goto_0

    :sswitch_16
    invoke-static {v3}, Lh5/۟ۦۣۣ;->ۣۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "\u06e2\u06e0\u06e5"

    goto/16 :goto_0

    :sswitch_17
    invoke-static {}, Lx7/۟ۤۡ۟ۦ;->۟ۤۧۢۡ()Ljava/util/concurrent/TimeUnit;

    move-result-object v6

    const-string v12, "\u06e2\u06e0\u06e6"

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc44 -> :sswitch_2
        0xdc46 -> :sswitch_4
        0xdc60 -> :sswitch_9
        0xdc7e -> :sswitch_16
        0xdcdb -> :sswitch_7
        0x1aab1e -> :sswitch_3
        0x1aab82 -> :sswitch_5
        0x1aab9e -> :sswitch_1
        0x1aaf9b -> :sswitch_0
        0x1ab264 -> :sswitch_15
        0x1ab267 -> :sswitch_13
        0x1ab268 -> :sswitch_b
        0x1ab2e1 -> :sswitch_10
        0x1ab700 -> :sswitch_6
        0x1abda4 -> :sswitch_14
        0x1abda8 -> :sswitch_c
        0x1abde3 -> :sswitch_f
        0x1abde5 -> :sswitch_17
        0x1ac222 -> :sswitch_e
        0x1ac526 -> :sswitch_11
        0x1ac568 -> :sswitch_a
        0x1ac5e7 -> :sswitch_12
        0x1ac969 -> :sswitch_d
        0x1ac9c6 -> :sswitch_8
    .end sparse-switch
.end method

.method public final p()J
    .locals 2

    invoke-static {p0}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۦۦۥۡ(Ljava/lang/Object;)V

    invoke-static {p0}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->ۥۨۢ۟(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۦۦۥۡ(Ljava/lang/Object;)V

    invoke-static {p0}, Lp7/ۣۣۦۤ;->ۣ۟ۡۢۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
