.class public final Lk0/y1;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:Lc9/a;

.field public final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JILc9/a;J)V
    .locals 3

    iput-wide p1, p0, Lk0/y1;->a:J

    iput p3, p0, Lk0/y1;->b:I

    iput-object p4, p0, Lk0/y1;->c:Lc9/a;

    iput-wide p5, p0, Lk0/y1;->d:J

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lk4/۟۠ۦ۟ۤ;->۟۠ۧۥ()I

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
    const-string v0, "ygqvRO"

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/ۣ۟۠ۥۥ;->۟ۥۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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
    .locals 16

    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v8, 0x0

    const-string v9, "\u06df\u06e2\u06e2"

    move-object v13, v6

    move-object/from16 v12, p1

    move-object v14, v7

    move-object v15, v8

    :goto_0
    invoke-static {v9}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    invoke-static/range {p0 .. p0}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->۟۠ۡۡۡ(Ljava/lang/Object;)I

    move-result v5

    const-string v6, "\u06e2\u06df\u06df"

    move-object v9, v6

    goto :goto_0

    :sswitch_0
    move-object v0, v12

    check-cast v0, Lg1/g;

    const-string v6, "\u06e8\u06e4\u06e8"

    move-object v9, v6

    goto :goto_0

    :sswitch_1
    invoke-static/range {p0 .. p0}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->۟۠ۡۡۡ(Ljava/lang/Object;)I

    move-result v5

    const-string v6, "\u06e4\u06e0"

    move-object v9, v6

    goto :goto_0

    :sswitch_2
    invoke-static/range {p0 .. p0}, Ln7/۟ۡۢۦ;->۟ۢۨۥۦ(Ljava/lang/Object;)Lc9/a;

    move-result-object v6

    const-string v7, "\u06e5\u06e1\u06e3"

    move-object v13, v6

    move-object v9, v7

    goto :goto_0

    :sswitch_3
    move-object v6, v12

    check-cast v6, Ljava/lang/Number;

    const-string v7, "\u06e4\u06e6\u06e4"

    move-object v14, v6

    move-object v9, v7

    goto :goto_0

    :sswitch_4
    invoke-static {v0}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->ۣۣۨۢ(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v6, "\u06e8\u06e6\u06e3"

    move-object v9, v6

    goto :goto_0

    :sswitch_5
    invoke-static/range {p0 .. p0}, Le2/ۨۥۦۡ;->ۦۣ۠۟(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v6, "\u06e3\u06e7\u06e1"

    move-object v9, v6

    goto :goto_0

    :sswitch_6
    invoke-static/range {p0 .. p0}, Ldagger/hilt/android/lifecycle/۟۠ۥ۟ۧ;->ۣ۟۟ۨۢ(Ljava/lang/Object;)J

    move-result-wide v2

    const-string v6, "\u06e7\u06e8"

    move-object v9, v6

    goto :goto_0

    :sswitch_7
    invoke-static {v14}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۡۧۦۡ(Ljava/lang/Object;)F

    move-result v1

    const-string v6, "\u06e5\u06df\u06e7"

    move-object v9, v6

    goto :goto_0

    :sswitch_8
    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->ۣ۟ۦ۠(Ljava/lang/Object;FJFI)V

    const-string v6, "\u06e4\u06e2\u06e5"

    move-object v9, v6

    goto :goto_0

    :sswitch_9
    const/high16 v7, 0x3f800000    # 1.0f

    move-object v6, v0

    move-wide v8, v2

    move v10, v4

    move v11, v5

    invoke-static/range {v6 .. v11}, Lcom/google/android/gms/dynamite/descriptors/com/google/firebase/auth/ۧۡۧۦ;->ۣ۟ۦ۠(Ljava/lang/Object;FJFI)V

    const-string v6, "\u06e1\u06e3\u06df"

    move-object v9, v6

    goto :goto_0

    :sswitch_a
    invoke-static {v13}, Le2/۟۟ۥۦ;->ۨۧۧۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    const-string v6, "\u06e6\u06e2\u06e5"

    move-object v9, v6

    goto :goto_0

    :sswitch_b
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v6

    const-string v7, "\u06e7\u06e4\u06e8"

    move-object v15, v6

    move-object v9, v7

    goto :goto_0

    :sswitch_c
    invoke-static {v2, v3}, Ls7/ۧۤۦۤ;->ۡ۟ۨۢ(J)F

    move-result v4

    const-string v6, "\u06e5\u06e1\u06e8"

    move-object v9, v6

    goto :goto_0

    :sswitch_d
    return-object v15

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7c -> :sswitch_9
        0x1aa75f -> :sswitch_0
        0x1aaefd -> :sswitch_2
        0x1ab242 -> :sswitch_8
        0x1ab6fd -> :sswitch_1
        0x1aba27 -> :sswitch_b
        0x1abaa2 -> :sswitch_7
        0x1abd8d -> :sswitch_6
        0x1abdc7 -> :sswitch_a
        0x1abdcc -> :sswitch_5
        0x1ac1a9 -> :sswitch_3
        0x1ac5ab -> :sswitch_d
        0x1ac96c -> :sswitch_4
        0x1ac9a5 -> :sswitch_c
    .end sparse-switch
.end method
