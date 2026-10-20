.class public final Lk0/t4;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:J

.field public final b:La2/c0;

.field public final c:Lc9/e;

.field public final d:I

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLa2/c0;Lc9/e;II)V
    .locals 3

    iput-wide p1, p0, Lk0/t4;->a:J

    iput-object p3, p0, Lk0/t4;->b:La2/c0;

    iput-object p4, p0, Lk0/t4;->c:Lc9/e;

    iput p5, p0, Lk0/t4;->d:I

    iput p6, p0, Lk0/t4;->e:I

    sget v0, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->ۣۣ۟ۨۤ:I

    xor-int/lit16 v0, v0, -0x25e

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lc1/ۢۥۥ۟;->۟ۢۨۧۤ()I

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
    const-string v0, "NaMw87Hpnu"

    invoke-static {v0}, Lv9/۟۟ۤۥ;->۟۟ۨۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v10, "\u06e6\u06e8"

    move-object v8, v7

    :goto_0
    invoke-static {v10}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v7

    const-string v10, "\u06e2\u06e6\u06e7"

    move-object v8, v7

    goto :goto_0

    :sswitch_0
    move-object v4, p1

    check-cast v4, Lm0/m;

    const-string v7, "\u06df\u06e3\u06e7"

    move-object v10, v7

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lr7/۟۟ۡ۟ۢ;->۠ۢۥۥ(Ljava/lang/Object;)Lc9/e;

    move-result-object v3

    const-string v7, "\u06e3\u06e3\u06e6"

    move-object v10, v7

    goto :goto_0

    :sswitch_2
    xor-int/lit8 v13, v5, 0x1

    const-string v7, "\u06e8\u06e3\u06df"

    move-object v10, v7

    goto :goto_0

    :sswitch_3
    invoke-static {v12}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v5

    const-string v7, "\u06e7\u06e2\u06e3"

    move-object v10, v7

    goto :goto_0

    :sswitch_4
    and-int/lit8 v11, v5, 0x1

    const-string v7, "\u06e2\u06e5\u06e1"

    move-object v10, v7

    goto :goto_0

    :sswitch_5
    invoke-static/range {v0 .. v6}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡ۟ۧ۟(JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    const-string v7, "\u06e1\u06e5\u06df"

    move-object v10, v7

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lu8/ۨۡ۠;->ۣۢ۠ۧ(Ljava/lang/Object;)I

    move-result v6

    const-string v7, "\u06e7\u06e2\u06e5"

    move-object v10, v7

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۢۧۡۤ(Ljava/lang/Object;)La2/c0;

    move-result-object v2

    const-string v7, "\u06e4\u06e6"

    move-object v10, v7

    goto :goto_0

    :sswitch_8
    move-object/from16 v7, p2

    check-cast v7, Ljava/lang/Number;

    const-string v10, "\u06e3\u06e4\u06e7"

    move-object v9, v7

    goto :goto_0

    :sswitch_9
    invoke-static {v9}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v5

    const-string v7, "\u06e8\u06e7\u06e3"

    move-object v10, v7

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->۠ۧۥ۠(Ljava/lang/Object;)I

    move-result v5

    const-string v7, "\u06e2\u06e7\u06e2"

    move-object v10, v7

    goto :goto_0

    :sswitch_b
    invoke-static {p0}, Lz3/۟ۡ۠ۦۣ;->ۥۡۤۢ(Ljava/lang/Object;)J

    move-result-wide v0

    const-string v7, "\u06e6\u06df\u06e5"

    move-object v10, v7

    goto :goto_0

    :sswitch_c
    or-int v12, v13, v11

    const-string v7, "\u06df\u06e4\u06e4"

    move-object v10, v7

    goto :goto_0

    :sswitch_d
    return-object v8

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc82 -> :sswitch_1
        0xdcc2 -> :sswitch_0
        0x1aa783 -> :sswitch_8
        0x1aa79f -> :sswitch_3
        0x1ab2fe -> :sswitch_2
        0x1ab323 -> :sswitch_d
        0x1ab33d -> :sswitch_4
        0x1ab686 -> :sswitch_a
        0x1ab6a6 -> :sswitch_9
        0x1ac14c -> :sswitch_7
        0x1ac568 -> :sswitch_6
        0x1ac56a -> :sswitch_5
        0x1ac944 -> :sswitch_c
        0x1ac9c4 -> :sswitch_b
    .end sparse-switch
.end method
