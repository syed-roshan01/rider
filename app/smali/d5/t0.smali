.class public final Ld5/t0;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final a:Lm9/d0;

.field public final b:Lb0/h0;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm9/d0;Lb0/h0;I)V
    .locals 2

    iput-object p1, p0, Ld5/t0;->a:Lm9/d0;

    iput-object p2, p0, Ld5/t0;->b:Lb0/h0;

    iput p3, p0, Ld5/t0;->c:I

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Landroidx/compose/ui/graphics/ۦۦۡۦ;->ۣ۟ۥۧۧ()I

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
    const-string v0, "H6jIov5d21BIgWRKkySKQF"

    invoke-static {v0}, Lcom/google/firebase/firestore/bundle/ۣۡۦۡ;->۠ۡ۟ۧ(Ljava/lang/String;)Ljava/lang/String;

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
.method public final invoke()Ljava/lang/Object;
    .locals 9

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v5, "\u06e2\u06e1\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    sget v8, Lcom/google/firebase/messaging/reporting/ۦۦۦۥ;->۟ۢۥ۠ۧ:I

    const-string v5, "\u06e7\u06e5\u06e6"

    goto :goto_0

    :sswitch_0
    xor-int/lit8 v6, v8, -0x28

    const-string v5, "\u06e3\u06e5\u06e8"

    goto :goto_0

    :sswitch_1
    invoke-static {v3, v1, v7, v0, v6}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    const-string v5, "\u06df\u06df\u06e8"

    goto :goto_0

    :sswitch_2
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v4

    const-string v5, "\u06e7\u06e4\u06e7"

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Ldagger/hilt/internal/definecomponent/ۨۢۥ۟;->ۣۧ۟(Ljava/lang/Object;)I

    move-result v8

    const-string v5, "\u06e1\u06e8\u06e8"

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lq6/ۡۨۧۨ;->۟ۧۧۡۡ(Ljava/lang/Object;)Lb0/h0;

    move-result-object v2

    const-string v5, "\u06df\u06e0\u06e0"

    goto :goto_0

    :sswitch_5
    new-instance v0, Ld5/s0;

    invoke-direct {v0, v2, v8, v1}, Ld5/s0;-><init>(Lb0/h0;ILu8/e;)V

    const-string v5, "\u06e5\u06e2\u06e7"

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lc1/ۣۢۧۨ;->۟ۡۧۦۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v3

    const-string v5, "\u06e8\u06e8\u06e8"

    goto :goto_0

    :sswitch_7
    return-object v4

    :sswitch_data_0
    .sparse-switch
        0x1aa708 -> :sswitch_2
        0x1aa71f -> :sswitch_3
        0x1aafa1 -> :sswitch_5
        0x1ab282 -> :sswitch_4
        0x1ab6c6 -> :sswitch_6
        0x1ac5aa -> :sswitch_7
        0x1ac5c8 -> :sswitch_0
        0x1ac9e8 -> :sswitch_1
    .end sparse-switch
.end method
