.class public final Ld5/o0;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:Lcom/auto/accept/ui/viewmodel/MainViewModel;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Ld5/o0;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    sget v0, Landroidx/startup/ۨۤ۟ۡ;->ۤۢۢۥ:I

    xor-int/lit16 v0, v0, 0x3cd

    invoke-direct {p0, v0, p2}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->ۣۣ۟ۥ۠()I

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
    const-string v0, "ZqY3jA6vweGUoPb8y17"

    invoke-static {v0}, Lp8/ۡۤ;->ۢۧ۟ۦ(Ljava/lang/String;)Ljava/lang/String;

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


# virtual methods
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e3\u06e8\u06df"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lu4/۟ۡۢۦۣ;->۠۠ۧۧ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e0\u06e1\u06e1"

    goto :goto_0

    :sswitch_0
    new-instance p0, Ld5/o0;

    invoke-direct {p0, v0, p2}, Ld5/o0;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V

    const-string v1, "\u06e4\u06e6\u06df"

    goto :goto_0

    :sswitch_1
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x1aab00 -> :sswitch_0
        0x1aba9d -> :sswitch_1
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e7\u06e3\u06e0"

    move-object v3, v0

    move-object v2, p1

    move-object v4, v0

    move-object v1, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e5\u06e0\u06e5"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v3, v4}, Lcom/google/firebase/analytics/ktxtesting/ۤۢۤۡ;->ۣۧۦۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e4\u06e6\u06e8"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e3\u06e8\u06e6"

    move-object v5, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v5}, Lm1/ۣۡ۠ۧ;->ۣۡۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e3\u06e6\u06e2"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v1

    check-cast v0, Ld5/o0;

    const-string v6, "\u06e4\u06e6\u06e4"

    move-object p0, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e7\u06df\u06e2"

    move-object v3, v0

    goto :goto_0

    :sswitch_5
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0x1ab6df -> :sswitch_5
        0x1ab721 -> :sswitch_2
        0x1abaa2 -> :sswitch_1
        0x1abaa6 -> :sswitch_3
        0x1abdaa -> :sswitch_0
        0x1ac584 -> :sswitch_4
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v1, 0x0

    const-string v6, "\u06e5\u06e3\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v4, v5}, Ldagger/hilt/android/components/ۣ۟۟ۧۡ;->ۢۡۥۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e1\u06e8"

    move-object v6, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0}, Lcom/google/firebase/۟ۥۧۡۨ;->ۣ۟ۢ۠(Ljava/lang/Object;)Lp9/q0;

    move-result-object v1

    const-string v6, "\u06e8\u06e3\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v1

    const-string v6, "\u06e1\u06e6\u06e5"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lu4/۟ۡۢۦۣ;->۠۠ۧۧ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e0\u06e1\u06e1"

    move-object v6, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e3"

    move-object v6, v1

    goto :goto_0

    :sswitch_4
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    const-string v1, "\u06e8\u06e0\u06e7"

    move-object v6, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v0}, Lv6/۟ۦۣۧۦ;->۟۠ۢۡۢ(Ljava/lang/Object;)Lz4/g;

    move-result-object v1

    const-string v6, "\u06e2\u06e7\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_6
    invoke-static {v3}, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->۟۠ۤۨ۟(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v6, "\u06e0\u06e0\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_7
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe4 -> :sswitch_2
        0x1aaae8 -> :sswitch_0
        0x1aab00 -> :sswitch_5
        0x1aaf60 -> :sswitch_7
        0x1ab289 -> :sswitch_1
        0x1ab341 -> :sswitch_6
        0x1abe03 -> :sswitch_4
        0x1ac8ef -> :sswitch_3
    .end sparse-switch
.end method
