.class public final Lk0/w0;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:F

.field public final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(FJ)V
    .locals 2

    iput p1, p0, Lk0/w0;->a:F

    iput-wide p2, p0, Lk0/w0;->b:J

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->۠ۨۡ()I

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
    const-string v0, "vZxwd"

    invoke-static {v0}, Lrikka/shizuku/۟ۤۦ۟ۦ;->ۤۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    const/4 v3, 0x0

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    const-string v11, "\u06e2\u06e2\u06e7"

    move-object v13, v2

    :goto_0
    invoke-static {v11}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    invoke-static {v8, v9}, Ll6/ۥۦۣ۟;->ۣۣۧ۠(J)F

    move-result v18

    const-string v2, "\u06e4\u06e4"

    move-object v11, v2

    goto :goto_0

    :sswitch_0
    move/from16 v0, v17

    invoke-static {v3, v0}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۤۤۦۨ(Ljava/lang/Object;F)F

    move-result v16

    const-string v2, "\u06e3\u06e5\u06df"

    move-object v11, v2

    goto :goto_0

    :sswitch_1
    const/4 v11, 0x0

    invoke-static/range {v3 .. v12}, Lt7/۟ۡ۠ۨ۟;->ۣ۟ۡۧۢ(Ljava/lang/Object;JJJFII)V

    const-string v2, "\u06e8\u06e8\u06e8"

    move-object v11, v2

    goto :goto_0

    :sswitch_2
    sget v14, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣۣ۟۠۟:I

    const-string v2, "\u06e7\u06e7\u06e1"

    move-object v11, v2

    goto :goto_0

    :sswitch_3
    div-float v17, v16, v15

    const-string v2, "\u06e6\u06e7\u06e5"

    move-object v11, v2

    goto :goto_0

    :sswitch_4
    int-to-float v15, v12

    const-string v2, "\u06e6\u06e8\u06e8"

    move-object v11, v2

    goto :goto_0

    :sswitch_5
    const/4 v2, 0x0

    move/from16 v0, v16

    invoke-static {v2, v0}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۨ۟۟ۨ(FF)J

    move-result-wide v6

    const-string v2, "\u06e1\u06e2\u06e6"

    move-object v11, v2

    goto :goto_0

    :sswitch_6
    xor-int/lit16 v12, v14, 0x125

    const-string v2, "\u06df\u06e7\u06df"

    move-object v11, v2

    goto :goto_0

    :sswitch_7
    invoke-static/range {p0 .. p0}, Lm0/۟ۤۡۤۤ;->ۢۥ۟ۥ(Ljava/lang/Object;)J

    move-result-wide v4

    const-string v2, "\u06e0\u06e5"

    move-object v11, v2

    goto :goto_0

    :sswitch_8
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v2

    const-string v11, "\u06e0\u06e2"

    move-object v13, v2

    goto :goto_0

    :sswitch_9
    invoke-static/range {p0 .. p0}, Lp3/۟ۢ۟۟ۥ;->ۣۦۢۤ(Ljava/lang/Object;)F

    move-result v17

    const-string v2, "\u06e5\u06e7\u06e6"

    move-object v11, v2

    goto :goto_0

    :sswitch_a
    move/from16 v0, v17

    invoke-static {v3, v0}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۤۤۦۨ(Ljava/lang/Object;F)F

    move-result v18

    const-string v2, "\u06e3\u06df\u06e3"

    move-object v11, v2

    goto :goto_0

    :sswitch_b
    xor-int/lit16 v12, v14, 0x3c8

    const-string v2, "\u06e3\u06e6"

    move-object v11, v2

    goto :goto_0

    :sswitch_c
    div-float v16, v18, v15

    const-string v2, "\u06e8\u06e3\u06e5"

    move-object v11, v2

    goto :goto_0

    :sswitch_d
    move-object/from16 v2, p1

    check-cast v2, Lg1/g;

    const-string v11, "\u06e2\u06df\u06df"

    move-object v3, v2

    goto :goto_0

    :sswitch_e
    sget v14, Lcom/google/firebase/firestore/remote/۟ۦۨۧۡ;->ۣۡ۠ۤ:I

    const-string v2, "\u06e7\u06e1\u06e2"

    move-object v11, v2

    goto :goto_0

    :sswitch_f
    move/from16 v0, v17

    invoke-static {v3, v0}, Lcom/google/firebase/analytics/connector/internal/۟ۦ۟۠ۢ;->ۤۤۦۨ(Ljava/lang/Object;F)F

    move-result v10

    const-string v2, "\u06e2\u06e4\u06e3"

    move-object v11, v2

    goto/16 :goto_0

    :sswitch_10
    move/from16 v0, v18

    move/from16 v1, v17

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/remote/۟۟ۢۥۤ;->ۨ۟۟ۨ(FF)J

    move-result-wide v8

    const-string v2, "\u06e3\u06e2\u06e7"

    move-object v11, v2

    goto/16 :goto_0

    :sswitch_11
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->ۣۣۨۢ(Ljava/lang/Object;)J

    move-result-wide v8

    const-string v2, "\u06e6\u06e6"

    move-object v11, v2

    goto/16 :goto_0

    :sswitch_12
    return-object v13

    :sswitch_data_0
    .sparse-switch
        0xdc02 -> :sswitch_12
        0xdc05 -> :sswitch_2
        0xdc63 -> :sswitch_1
        0xdc80 -> :sswitch_0
        0x1aa7f7 -> :sswitch_4
        0x1aaee5 -> :sswitch_11
        0x1ab242 -> :sswitch_9
        0x1ab2a7 -> :sswitch_d
        0x1ab2e1 -> :sswitch_a
        0x1ab607 -> :sswitch_e
        0x1ab668 -> :sswitch_7
        0x1ab6bd -> :sswitch_3
        0x1abe84 -> :sswitch_f
        0x1ac244 -> :sswitch_10
        0x1ac266 -> :sswitch_c
        0x1ac548 -> :sswitch_6
        0x1ac601 -> :sswitch_b
        0x1ac94a -> :sswitch_5
        0x1ac9e8 -> :sswitch_8
    .end sparse-switch
.end method
