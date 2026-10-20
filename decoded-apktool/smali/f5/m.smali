.class public final Lf5/m;
.super Lw8/c;


# instance fields
.field public a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public b:Ljava/lang/Object;

.field public c:Ljava/util/Iterator;

.field public d:Ljava/lang/Object;

.field public final e:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lu8/e;)V
    .locals 2

    iput-object p1, p0, Lf5/m;->e:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    invoke-static {}, Lh/ۥۦۡۧ;->ۥ۟ۦ()I

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
    const-string v0, "q5e3wIhD2K8EdONz2uxbTY"

    invoke-static {v0}, La/ۥۡۢۨ;->۟ۥۡۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    const/high16 v9, -0x80000000

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e7\u06e4\u06e1"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    move v8, v5

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    xor-int v4, v7, v9

    const-string v3, "\u06e3\u06e7\u06e6"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lcom/google/firebase/platforminfo/۟۟۟ۥ۟;->ۣۧۡۤ(Ljava/lang/Object;)I

    move-result v5

    const-string v3, "\u06e0\u06e5\u06e5"

    move v7, v5

    goto :goto_0

    :sswitch_1
    or-int v5, v4, v8

    const-string v3, "\u06e7\u06e1\u06df"

    move v6, v5

    goto :goto_0

    :sswitch_2
    and-int v5, v7, v9

    const-string v3, "\u06e2\u06e5"

    move v8, v5

    goto :goto_0

    :sswitch_3
    invoke-static {v0, v1, v1, p0}, Lc1/ۢۥۥ۟;->۟ۦۢ۟ۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "\u06e1\u06e8"

    goto :goto_0

    :sswitch_4
    iput-object p1, p0, Lf5/m;->d:Ljava/lang/Object;

    const-string v3, "\u06e7\u06e0\u06e6"

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Ldagger/hilt/android/internal/earlyentrypoint/۟ۢ۟ۥۣ;->ۦ۠ۨۧ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v3, "\u06df\u06e0\u06e2"

    goto :goto_0

    :sswitch_6
    iput v6, p0, Lf5/m;->f:I

    const-string v3, "\u06e2\u06e4\u06e6"

    goto :goto_0

    :sswitch_7
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc27 -> :sswitch_7
        0x1aa721 -> :sswitch_3
        0x1aab80 -> :sswitch_2
        0x1ab2e4 -> :sswitch_5
        0x1ab702 -> :sswitch_1
        0x1ac52d -> :sswitch_0
        0x1ac545 -> :sswitch_6
        0x1ac5a4 -> :sswitch_4
    .end sparse-switch
.end method
