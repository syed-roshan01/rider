.class public final Lk6/g7;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ll/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ll/t;JJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/g7;->c:Ll/t;

    iput-wide p2, p0, Lk6/g7;->a:J

    iput-wide p4, p0, Lk6/g7;->b:J

    invoke-static {}, Lz/۟ۥۣۣ۠;->۟ۢۧۨ۠()I

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
    const-string v0, "pmV2P"

    invoke-static {v0}, Landroidx/compose/ui/node/ۦ۠ۦۧ;->۟ۡ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

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


# virtual methods
.method public final run()V
    .locals 10

    const/4 v8, 0x0

    const/4 v0, 0x0

    const-string v6, "\u06e0\u06e7\u06e5"

    move-object v2, v0

    move-object v3, v0

    move-object v1, v0

    move-object v4, v0

    move-object v5, v0

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {v5, v2}, Ll3/ۥۣۤ۟;->۠ۨۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e6\u06e5"

    move-object v6, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Ln/ۣۣۢۢ;->۟ۦۡۥۦ(Ljava/lang/Object;)Ll/t;

    move-result-object v0

    const-string v6, "\u06e0\u06e3\u06e5"

    move-object v3, v0

    goto :goto_0

    :sswitch_1
    invoke-static {v4}, Lcom/google/gson/internal/sql/ۣ۟ۧۨۧ;->ۢۢۨ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    const-string v6, "\u06e3\u06df\u06df"

    move-object v5, v0

    goto :goto_0

    :sswitch_2
    invoke-static {v3}, La/ۥۦۥۡ;->۟ۤۨۡۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e2\u06e2\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    sget v7, Lg5/ۣۡۦۣ;->ۥۥۨۡ:I

    const-string v0, "\u06e8\u06e5\u06e2"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v1

    check-cast v0, Lk6/d7;

    const-string v6, "\u06e0\u06e4\u06e2"

    move-object v4, v0

    goto :goto_0

    :sswitch_5
    xor-int/lit16 v8, v7, -0x37c

    const-string v0, "\u06e4\u06e1\u06e2"

    move-object v6, v0

    move v9, v8

    goto :goto_0

    :sswitch_6
    new-instance v0, Lh/a;

    invoke-direct {v0, p0, v9}, Lh/a;-><init>(Ljava/lang/Object;I)V

    const-string v6, "\u06e2\u06df\u06e5"

    move-object v2, v0

    goto :goto_0

    :sswitch_7
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcbf -> :sswitch_7
        0x1aab42 -> :sswitch_2
        0x1aab5e -> :sswitch_1
        0x1aabbe -> :sswitch_0
        0x1ab2a6 -> :sswitch_4
        0x1ab603 -> :sswitch_3
        0x1aba05 -> :sswitch_6
        0x1ac985 -> :sswitch_5
    .end sparse-switch
.end method
