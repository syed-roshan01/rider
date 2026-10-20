.class public final Ld5/z;
.super Lw8/i;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:Z

.field public final b:Lm0/g1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLm0/g1;Lu8/e;)V
    .locals 2

    iput-boolean p1, p0, Ld5/z;->a:Z

    iput-object p2, p0, Ld5/z;->b:Lm0/g1;

    sget v0, Lcom/google/firebase/appcheck/interop/۟ۦۨۥ;->۠۠ۢ۟:I

    xor-int/lit8 v0, v0, -0x3b

    invoke-direct {p0, v0, p3}, Lw8/i;-><init>(ILu8/e;)V

    invoke-static {}, Lv0/۟ۤۧ۠ۧ;->۟ۤ۠ۤۡ()I

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
    const-string v0, "DFoFB"

    invoke-static {v0}, Landroidx/fragment/app/ۣۣۣۨ;->ۥۣۧ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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
    .locals 3

    const/4 v1, 0x0

    const/4 v0, 0x0

    const-string v2, "\u06e7\u06e3\u06e5"

    :goto_0
    invoke-static {v2}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    invoke-static {p0}, La8/ۣۡۨ۠;->ۣ۠ۧ۟(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    const-string v2, "\u06e7\u06e8"

    goto :goto_0

    :sswitch_0
    new-instance p0, Ld5/z;

    invoke-direct {p0, v1, v0, p2}, Ld5/z;-><init>(ZLm0/g1;Lu8/e;)V

    const-string v2, "\u06e3\u06e5\u06e0"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lh6/ۧۧۤ۟;->ۣۣ۟(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "\u06e4\u06e1\u06e8"

    goto :goto_0

    :sswitch_2
    return-object p0

    :sswitch_data_0
    .sparse-switch
        0xdce1 -> :sswitch_0
        0x1ab6be -> :sswitch_2
        0x1ac589 -> :sswitch_1
    .end sparse-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    const-string v6, "\u06e5\u06e8"

    move-object v3, v0

    move-object v1, p1

    move-object v2, v0

    move-object v4, v0

    move-object v5, v0

    :goto_0
    invoke-static {v6}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    move-object v0, v1

    check-cast v0, Lm9/d0;

    const-string v6, "\u06e3\u06e6\u06e6"

    move-object v5, v0

    goto :goto_0

    :sswitch_0
    invoke-static {p0, v5, v3}, Ll0/ۡۦۦۡ;->ۡۤۥۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu8/e;

    move-result-object v2

    const-string v0, "\u06e3\u06e4\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    move-object v0, p2

    check-cast v0, Lu8/e;

    const-string v6, "\u06df\u06e7\u06e4"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    invoke-static {p0, v4}, Lcom/google/firebase/firestore/model/ۤۥۥۣ;->ۤۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e8\u06df\u06e6"

    move-object v6, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v2

    check-cast v0, Ld5/z;

    const-string v6, "\u06e7\u06e5\u06e3"

    move-object p0, v0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    const-string v6, "\u06e1\u06df"

    move-object v4, v0

    goto :goto_0

    :sswitch_5
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc1e -> :sswitch_2
        0x1aa7fc -> :sswitch_0
        0x1ab6a5 -> :sswitch_3
        0x1ab6e3 -> :sswitch_1
        0x1ac5c5 -> :sswitch_4
        0x1ac8cf -> :sswitch_5
    .end sparse-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e4\u06e8\u06df"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p1}, Lj9/۠۠ۨ;->ۣۨۧ۟(Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06e3\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, La8/ۣۡۨ۠;->ۣ۠ۧ۟(Ljava/lang/Object;)Lm0/g1;

    move-result-object v0

    const-string v1, "\u06df\u06e0\u06e7"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    const-string v1, "\u06e1\u06e1"

    move-object v4, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lh6/ۧۧۤ۟;->ۣۣ۟(Ljava/lang/Object;)Z

    move-result v5

    const-string v1, "\u06df\u06df\u06df"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v5}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v4, "\u06e6\u06e3\u06e7"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v0, v3}, Ld9/ۥۡۧۡ;->۟ۥۥۦۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e2\u06e1\u06e5"

    move-object v4, v1

    goto :goto_0

    :sswitch_5
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v1

    const-string v4, "\u06e8\u06e3\u06e2"

    move-object v2, v1

    goto :goto_0

    :sswitch_6
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x1aa6ff -> :sswitch_3
        0x1aa726 -> :sswitch_4
        0x1aab3f -> :sswitch_2
        0x1ab286 -> :sswitch_5
        0x1abadb -> :sswitch_1
        0x1ac1ca -> :sswitch_0
        0x1ac947 -> :sswitch_6
    .end sparse-switch
.end method
