.class public final Lk0/j1;
.super Ljava/lang/Object;

# interfaces
.implements Ly/i1;


# instance fields
.field public final a:Lm0/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly/i1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/ۨۢ۟;->۟۟۟ۨ()Lm0/o3;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->ۡۥۡ(Ljava/lang/Object;Ljava/lang/Object;)Lm0/n1;

    move-result-object v0

    iput-object v0, p0, Lk0/j1;->a:Lm0/n1;

    invoke-static {}, Lu2/۟ۥۢۥۨ;->۟ۥۣۡ۠()I

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
    const-string v0, "1n"

    invoke-static {v0}, Lcom/auto/accept/ui/viewmodel/ۦۨۡۨ;->۟ۡۧۥۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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
.method public final a(Lm2/b;Lm2/l;)I
    .locals 6

    const/4 v0, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e4\u06e5\u06e2"

    move-object v2, v0

    move-object v1, v0

    move-object v3, v0

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Ly/i1;

    const-string v4, "\u06e6\u06df"

    move-object v3, v0

    goto :goto_0

    :sswitch_0
    invoke-static {v3, p1, p2}, Lt2/۟ۢ۟ۢ۟;->۟ۦۥۨ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    const-string v0, "\u06e3\u06e0\u06e2"

    move-object v4, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->۟ۤۨۥۧ(Ljava/lang/Object;)Lm0/n1;

    move-result-object v0

    const-string v4, "\u06e5\u06e6\u06e6"

    move-object v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {v2}, Lw2/ۤ۠ۨۤ;->۠۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e4\u06e5\u06df"

    move-object v4, v0

    goto :goto_0

    :sswitch_3
    return v5

    :sswitch_data_0
    .sparse-switch
        0xdcb9 -> :sswitch_0
        0x1ab625 -> :sswitch_3
        0x1aba81 -> :sswitch_1
        0x1abe65 -> :sswitch_2
    .end sparse-switch
.end method

.method public final b(Lm2/b;)I
    .locals 6

    const/4 v2, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e2\u06e6"

    move-object v0, v2

    move-object v3, v2

    move-object v1, v2

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->۟ۤۨۥۧ(Ljava/lang/Object;)Lm0/n1;

    move-result-object v2

    const-string v4, "\u06e8\u06e2\u06e7"

    move-object v3, v2

    goto :goto_0

    :sswitch_0
    invoke-static {v3}, Lw2/ۤ۠ۨۤ;->۠۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "\u06e8\u06e6\u06e3"

    move-object v4, v2

    goto :goto_0

    :sswitch_1
    move-object v0, v1

    check-cast v0, Ly/i1;

    const-string v2, "\u06e2\u06e1"

    move-object v4, v2

    goto :goto_0

    :sswitch_2
    invoke-static {v0, p1}, Lcom/google/firebase/messaging/ktx/ۦۣۨ۟;->ۢ۟ۦۥ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    const-string v2, "\u06df\u06e3\u06e7"

    move-object v4, v2

    goto :goto_0

    :sswitch_3
    return v5

    :sswitch_data_0
    .sparse-switch
        0xdc3f -> :sswitch_2
        0x1aa783 -> :sswitch_3
        0x1ac92d -> :sswitch_0
        0x1ac9a5 -> :sswitch_1
    .end sparse-switch
.end method

.method public final c(Lm2/b;Lm2/l;)I
    .locals 6

    const/4 v0, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e4\u06e5"

    move-object v2, v0

    move-object v3, v0

    move-object v1, v0

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->۟ۤۨۥۧ(Ljava/lang/Object;)Lm0/n1;

    move-result-object v0

    const-string v4, "\u06e7\u06e7\u06e8"

    move-object v2, v0

    goto :goto_0

    :sswitch_0
    invoke-static {v2}, Lw2/ۤ۠ۨۤ;->۠۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e4\u06e3\u06e2"

    move-object v4, v0

    goto :goto_0

    :sswitch_1
    invoke-static {v3, p1, p2}, Lcom/google/firebase/ktx/ۨۢۤۧ;->۟ۢ۠۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    const-string v0, "\u06e4\u06e4\u06e8"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Ly/i1;

    const-string v4, "\u06e0\u06e6\u06e4"

    move-object v3, v0

    goto :goto_0

    :sswitch_3
    return v5

    :sswitch_data_0
    .sparse-switch
        0x1aab9e -> :sswitch_1
        0x1aba43 -> :sswitch_2
        0x1aba68 -> :sswitch_3
        0x1ac608 -> :sswitch_0
    .end sparse-switch
.end method

.method public final d(Lm2/b;)I
    .locals 6

    const/4 v0, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e4\u06e0\u06e5"

    move-object v2, v0

    move-object v1, v0

    move-object v3, v0

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {v3, p1}, Lc4/ۡ۟۠ۥ;->ۦۡۤۦ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v5

    const-string v0, "\u06e3\u06e4\u06e8"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    invoke-static {v2}, Lw2/ۤ۠ۨۤ;->۠۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e4\u06e1\u06e5"

    move-object v4, v0

    goto :goto_0

    :sswitch_1
    move-object v0, v1

    check-cast v0, Ly/i1;

    const-string v4, "\u06e8\u06e1\u06e3"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lg0/۟ۥۢۥۢ;->۟ۤۨۥۧ(Ljava/lang/Object;)Lm0/n1;

    move-result-object v0

    const-string v4, "\u06e8\u06e8\u06e8"

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    return v5

    :sswitch_data_0
    .sparse-switch
        0x1ab6a7 -> :sswitch_3
        0x1ab9e9 -> :sswitch_2
        0x1aba08 -> :sswitch_1
        0x1ac9e8 -> :sswitch_0
    .end sparse-switch
.end method
