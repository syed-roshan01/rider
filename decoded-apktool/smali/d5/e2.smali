.class public final Ld5/e2;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JI)V
    .locals 2

    iput-object p1, p0, Ld5/e2;->a:Ljava/lang/String;

    iput-wide p2, p0, Ld5/e2;->b:J

    iput p4, p0, Ld5/e2;->c:I

    sget v0, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->۟۠ۦۤ۠:I

    xor-int/lit16 v0, v0, 0x99

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lt2/۟ۧۢ۟ۢ;->۟ۧۢۥۧ()I

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
    const-string v0, "bbfUmMb69p8Or2pDRY87o2T2"

    invoke-static {v0}, Lo8/۟ۢۧۢۤ;->ۣۦ۠۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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
    .locals 13

    const/4 v0, 0x0

    const/4 v9, 0x0

    const-wide/16 v6, 0x0

    const-string v5, "\u06df\u06e6\u06e0"

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    move v8, v9

    move v10, v9

    move v11, v9

    move v12, v9

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->۟۟ۥۣۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "\u06e5\u06e0\u06e3"

    move-object v3, v0

    goto :goto_0

    :sswitch_0
    move-object v0, p1

    check-cast v0, Lm0/m;

    const-string v5, "\u06e6\u06e0\u06e3"

    move-object v1, v0

    goto :goto_0

    :sswitch_1
    xor-int/lit8 v9, v12, 0x1

    const-string v0, "\u06e4\u06e6\u06e6"

    move-object v5, v0

    move v11, v9

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, La7/۠ۢۧ;->ۡۧۦۣ(Ljava/lang/Object;)J

    move-result-wide v6

    const-string v0, "\u06e6\u06e1\u06df"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    move-object v0, p2

    check-cast v0, Ljava/lang/Number;

    const-string v5, "\u06e2\u06e4\u06e7"

    move-object v2, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v5, "\u06e4\u06e6\u06e3"

    move-object v4, v0

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Ln7/۟ۡۢۦ;->ۢ۟۠ۦ(Ljava/lang/Object;)I

    move-result v9

    const-string v0, "\u06e7\u06e5"

    move-object v5, v0

    move v12, v9

    goto :goto_0

    :sswitch_6
    invoke-static {v10}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v9

    const-string v0, "\u06e0\u06e5\u06e0"

    move-object v5, v0

    move v12, v9

    goto :goto_0

    :sswitch_7
    and-int/lit8 v8, v12, 0x1

    const-string v0, "\u06e0\u06e3\u06e2"

    move-object v5, v0

    goto :goto_0

    :sswitch_8
    or-int v9, v11, v8

    const-string v0, "\u06e5\u06e8\u06e3"

    move-object v5, v0

    move v10, v9

    goto :goto_0

    :sswitch_9
    invoke-static {v3, v6, v7, v1, v12}, Ldagger/hilt/android/components/ۡۢۥ۠;->ۡۡۢۨ(Ljava/lang/Object;JLjava/lang/Object;I)V

    const-string v0, "\u06e3\u06e0\u06e6"

    move-object v5, v0

    goto :goto_0

    :sswitch_a
    invoke-static {v2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v9

    const-string v0, "\u06e5\u06df\u06e7"

    move-object v5, v0

    move v12, v9

    goto :goto_0

    :sswitch_b
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0xdcde -> :sswitch_7
        0x1aa7d9 -> :sswitch_0
        0x1aab3f -> :sswitch_1
        0x1ab2e5 -> :sswitch_a
        0x1ab629 -> :sswitch_4
        0x1abaa1 -> :sswitch_b
        0x1abaa4 -> :sswitch_8
        0x1abd8d -> :sswitch_5
        0x1abda8 -> :sswitch_2
        0x1abea0 -> :sswitch_6
        0x1ac169 -> :sswitch_3
        0x1ac184 -> :sswitch_9
    .end sparse-switch
.end method
