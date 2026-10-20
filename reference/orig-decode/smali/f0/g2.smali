.class public abstract Lf0/g2;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lf0/f2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lf0/f2;

    invoke-static {}, Ly/ۤۨۧ۟;->ۨۥۡۡ()Lg2/k0;

    move-result-object v1

    invoke-direct {v0, v1, v2, v2}, Lf0/f2;-><init>(Lg2/s;II)V

    sput-object v0, Lf0/g2;->a:Lf0/f2;

    return-void
.end method

.method public static final a(Lg2/l0;La2/e;)Lg2/i0;
    .locals 10

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-string v9, "\u06e0\u06e4\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    move-object v5, v1

    move v6, v7

    move v8, v7

    :goto_0
    invoke-static {v9}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0, p1}, Lg2/ۢۥۥۡ;->۟ۥۦۨ۟(Ljava/lang/Object;Ljava/lang/Object;)Lg2/i0;

    move-result-object v1

    const-string v7, "\u06e0\u06e8\u06e0"

    move-object v4, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_0
    invoke-static {v4}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->۟ۥۡۨۦ(Ljava/lang/Object;)La2/e;

    move-result-object v1

    const-string v7, "\u06df\u06e7\u06e0"

    move-object v2, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_1
    invoke-static {p1}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06e0\u06e2\u06df"

    move-object v5, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_2
    invoke-static {p1}, Lf6/ۣۣۣۣ۟;->۟ۧۦۤۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v7, "\u06df\u06e6\u06e0"

    move-object v5, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_3
    invoke-static {v4}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->۟ۥۡۨۦ(Ljava/lang/Object;)La2/e;

    move-result-object p1

    const-string v1, "\u06e8\u06e7\u06e7"

    move-object v9, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v5}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v7

    const-string v1, "\u06e0\u06e7\u06e7"

    move v8, v7

    move-object v9, v1

    goto :goto_0

    :sswitch_5
    invoke-static {v5}, Ls8/۟ۥۨۨ;->۠ۨۤ۠(Ljava/lang/Object;)I

    move-result v1

    const-string v7, "\u06e1\u06e4"

    move v6, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_6
    new-instance v1, Lg2/i0;

    invoke-direct {v1, v2, v0}, Lg2/i0;-><init>(La2/e;Lg2/s;)V

    const-string v7, "\u06e4\u06e1\u06e6"

    move-object v4, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_7
    invoke-static {v4}, Ldagger/hilt/internal/ۡۡۨۦ;->ۨ۟ۥ۠(Ljava/lang/Object;)Lg2/s;

    move-result-object v1

    const-string v7, "\u06e4\u06df\u06e1"

    move-object v3, v1

    move-object v9, v7

    goto :goto_0

    :sswitch_8
    new-instance v0, Lf0/f2;

    invoke-direct {v0, v3, v6, v8}, Lf0/f2;-><init>(Lg2/s;II)V

    const-string v1, "\u06e2\u06e3\u06e4"

    move-object v9, v1

    goto :goto_0

    :sswitch_9
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc23 -> :sswitch_3
        0x1aa7d9 -> :sswitch_4
        0x1aa7f8 -> :sswitch_1
        0x1aab1d -> :sswitch_5
        0x1aabc0 -> :sswitch_7
        0x1aabd8 -> :sswitch_0
        0x1ab2c3 -> :sswitch_6
        0x1ab9c6 -> :sswitch_8
        0x1aba09 -> :sswitch_9
        0x1ac9c8 -> :sswitch_2
    .end sparse-switch
.end method
