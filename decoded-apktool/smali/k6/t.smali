.class public final Lk6/t;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:Ljava/lang/Long;

.field public final i:Ljava/lang/Long;

.field public final j:Ljava/lang/Long;

.field public final k:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 19

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v10, p3

    invoke-direct/range {v1 .. v17}, Lk6/t;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    invoke-static {}, Lcom/google/firebase/firestore/auth/ۨۢۥ۠;->ۣۣ۟ۡۤ()I

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
    const-string v0, "A9Lp4wzRWghech1Z9S"

    invoke-static {v0}, Lu8/ۨۡ۠;->ۨۨۤۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lfa/ۦۣۡۢ;->۟ۡۧۢ۠(Ljava/lang/Object;)V

    invoke-static {p2}, Lfa/ۦۣۡۢ;->۟ۡۧۢ۠(Ljava/lang/Object;)V

    const/4 v3, 0x1

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
    const-wide/16 v4, 0x0

    cmp-long v2, p3, v4

    if-ltz v2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v2, 0x1

    const/16 v4, 0x6cc

    :goto_1
    xor-int/lit16 v4, v4, 0x6dd

    sparse-switch v4, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v4, 0x6eb

    goto :goto_1

    :sswitch_4
    const/4 v2, 0x0

    :sswitch_5
    invoke-static {v2}, Le2/۟۟ۥۦ;->۠ۥۣۦ(Z)V

    const/16 v2, 0x748

    :goto_2
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const-wide/16 v4, 0x0

    cmp-long v2, p5, v4

    if-ltz v2, :cond_1

    const v2, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v2, 0xbe41

    goto :goto_2

    :sswitch_8
    const/4 v2, 0x1

    const v4, 0xbe7f

    :goto_3
    const v5, 0xbe90

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    invoke-static {v2}, Le2/۟۟ۥۦ;->۠ۥۣۦ(Z)V

    const v2, 0xbefb

    :goto_5
    const v4, 0xbf0c

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v2, 0xbf39

    goto :goto_5

    :sswitch_b
    const v4, 0xbe9e

    goto :goto_3

    :sswitch_c
    const/4 v2, 0x0

    goto :goto_4

    :sswitch_d
    const-wide/16 v4, 0x0

    cmp-long v2, p7, v4

    if-ltz v2, :cond_2

    const v2, 0xc1e3

    goto :goto_5

    :sswitch_e
    const/4 v2, 0x1

    const v4, 0xc202

    :goto_6
    const v5, 0xc213

    xor-int/2addr v4, v5

    sparse-switch v4, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    const v4, 0xc221

    goto :goto_6

    :sswitch_10
    const/4 v2, 0x0

    :sswitch_11
    invoke-static {v2}, Le2/۟۟ۥۦ;->۠ۥۣۦ(Z)V

    const v2, 0xc27e

    :goto_7
    const v4, 0xc28f

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_6

    goto :goto_7

    :cond_3
    :sswitch_12
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_13
    const-wide/16 v4, 0x0

    cmp-long v2, p11, v4

    if-ltz v2, :cond_3

    const v2, 0xc2db

    goto :goto_7

    :sswitch_14
    const v2, 0xc2fa

    :goto_8
    const v4, 0xc30b

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    const v2, 0xc5a4

    goto :goto_8

    :sswitch_16
    move v2, v3

    :goto_9
    invoke-static {v2}, Le2/۟۟ۥۦ;->۠ۥۣۦ(Z)V

    iput-object p1, p0, Lk6/t;->a:Ljava/lang/String;

    iput-object p2, p0, Lk6/t;->b:Ljava/lang/String;

    iput-wide p3, p0, Lk6/t;->c:J

    iput-wide p5, p0, Lk6/t;->d:J

    iput-wide p7, p0, Lk6/t;->e:J

    move-wide/from16 v0, p9

    iput-wide v0, p0, Lk6/t;->f:J

    move-wide/from16 v0, p11

    iput-wide v0, p0, Lk6/t;->g:J

    move-object/from16 v0, p13

    iput-object v0, p0, Lk6/t;->h:Ljava/lang/Long;

    move-object/from16 v0, p14

    iput-object v0, p0, Lk6/t;->i:Ljava/lang/Long;

    move-object/from16 v0, p15

    iput-object v0, p0, Lk6/t;->j:Ljava/lang/Long;

    move-object/from16 v0, p16

    iput-object v0, p0, Lk6/t;->k:Ljava/lang/Boolean;

    invoke-static {}, Lcom/google/firebase/iid/ۥۣۣۡ;->ۣ۟۟۟ۧ()I

    move-result v3

    const v2, 0xc601

    :goto_a
    const v4, 0xc612

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_8

    goto :goto_a

    :sswitch_17
    if-ltz v3, :cond_4

    const v2, 0xc65e

    goto :goto_a

    :sswitch_18
    const/4 v2, 0x0

    goto :goto_9

    :cond_4
    :sswitch_19
    const v2, 0xc63f

    goto :goto_a

    :sswitch_1a
    const-string v2, "iZQQfUnTmV"

    invoke-static {v2}, Lcom/google/android/gms/measurement/internal/۟۟ۨ۠ۢ;->ۧۧۢۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_1b
    return-void

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_10
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_18
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_1b
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch
.end method


# virtual methods
.method public final a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Lk6/t;
    .locals 18

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
    if-eqz p3, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static/range {p3 .. p3}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

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
    const/16 p3, 0x0

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    move-object/from16 v17, p3

    :goto_3
    new-instance v1, Lk6/t;

    invoke-static/range {p0 .. p0}, Lp3/۟ۢ۟۟ۥ;->ۣ۟ۤۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lc4/۟ۦۧۦۤ;->۟ۦۧۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Lj9/۠۠ۨ;->۠ۦ۟ۡ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static/range {p0 .. p0}, Ll2/ۦۣ۠ۥ;->۠ۤۥ(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-static/range {p0 .. p0}, Lc7/ۨۤۦۢ;->ۨۢۦۤ(Ljava/lang/Object;)J

    move-result-wide v8

    invoke-static/range {p0 .. p0}, Lg5/ۣۡۦۣ;->ۡ۠ۡ۟(Ljava/lang/Object;)J

    move-result-wide v10

    invoke-static/range {p0 .. p0}, Lg7/۠ۤۧ;->ۨۦ۠۠(Ljava/lang/Object;)J

    move-result-wide v12

    invoke-static/range {p0 .. p0}, La0/ۣ۟ۤۨۧ;->ۣ۠۟ۧ(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v14

    move-object/from16 v15, p1

    move-object/from16 v16, p2

    invoke-direct/range {v1 .. v17}, Lk6/t;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-object v1

    :sswitch_8
    move-object/from16 v17, p3

    goto :goto_3

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_8
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_7
    .end sparse-switch
.end method
