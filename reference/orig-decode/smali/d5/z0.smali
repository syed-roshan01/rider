.class public final Ld5/z0;
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

    iput-object p1, p0, Ld5/z0;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    sget v0, Lr6/۟ۡ۠۟ۡ;->ۣۧۡ:I

    xor-int/lit16 v0, v0, -0x20f

    invoke-direct {p0, v0, p2}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lca/ۨۤۢۥ;->ۢۥۣۧ()I

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
    const-string v0, "HBxZ"

    invoke-static {v0}, Lw5/ۣۨۧ۠;->۟ۦۣۣ۟(Ljava/lang/String;)Ljava/lang/String;

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
.method public final create(Ljava/lang/Object;Lu8/e;)Lu8/e;
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e3\u06df"

    :goto_0
    invoke-static {v1}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    new-instance p0, Ld5/z0;

    invoke-direct {p0, v0, p2}, Ld5/z0;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V

    const-string v1, "\u06e4\u06e8\u06e6"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lrikka/shizuku/۟ۤۦ۟ۦ;->ۣۣ۟۟ۧ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v1, "\u06e1\u06e6\u06df"

    goto :goto_0

    :sswitch_1
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0x1aba40 -> :sswitch_0
        0x1abae2 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e7\u06e7\u06e6"

    move-object v3, v0

    move-object v2, p1

    move-object v4, v0

    move-object v5, v0

    move-object v1, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0, v3, v4}, Lm4/۟ۧۤ۠;->ۥۢۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v1

    const-string v0, "\u06e1\u06e1\u06e3"

    move-object v6, v0

    goto :goto_0

    :sswitch_0
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06df\u06e5\u06e7"

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06e3\u06e0\u06e8"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Ld5/z0;

    const-string v6, "\u06e8\u06e0\u06e1"

    move-object p0, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0, v5}, Lcom/google/firebase/analytics/connector/۟ۡۨۦ۟;->۟ۡۧۡ۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v0, "\u06e7\u06e6\u06e5"

    move-object v6, v0

    goto :goto_0

    :sswitch_4
    move-object v0, v2

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e6\u06df"

    move-object v3, v0

    goto :goto_0

    :sswitch_5
    return-object v5

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcb9 -> :sswitch_1
        0x1aa7c1 -> :sswitch_3
        0x1aaec3 -> :sswitch_2
        0x1ac5e6 -> :sswitch_5
        0x1ac606 -> :sswitch_4
        0x1ac8e9 -> :sswitch_0
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v5, 0x0

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    invoke-static {p0}, Lrikka/shizuku/۟ۤۦ۟ۦ;->ۣۣ۟۟ۧ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v1

    invoke-static {v1}, Lp8/ۡۤ;->۟ۧۧ۠(Ljava/lang/Object;)La5/j;

    move-result-object v0

    invoke-static {v0}, Lh1/۟۟ۨۦۦ;->ۥۨۡۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

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
    if-nez v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {v1}, Lcom/google/firebase/abt/ۢۦۨۤ;->۟۟ۡۤۦ(Ljava/lang/Object;)Lm9/d0;

    move-result-object v0

    const/4 v3, 0x0

    new-instance v4, Lf5/p;

    invoke-direct {v4, v1, v2, v5}, Lf5/p;-><init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Ljava/lang/String;Lu8/e;)V

    sget v1, Li6/ۡۤۦ;->ۢۢۡۡ:I

    xor-int/lit16 v1, v1, -0x327

    invoke-static {v0, v5, v3, v4, v1}, Lq1/۠۠ۤ;->۟ۢۧۢۧ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)Lm9/x1;

    :sswitch_5
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    return-object v0

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
.end method
