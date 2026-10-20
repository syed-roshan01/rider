.class public final Ld5/h1;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

.field public final b:Lcom/auto/accept/data/model/UserProfile;

.field public final c:Lc9/a;

.field public final d:Lc9/a;

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/auto/accept/ui/viewmodel/MainViewModel;Lcom/auto/accept/data/model/UserProfile;Lc9/a;Lc9/a;I)V
    .locals 2

    iput-object p1, p0, Ld5/h1;->a:Lcom/auto/accept/ui/viewmodel/MainViewModel;

    iput-object p2, p0, Ld5/h1;->b:Lcom/auto/accept/data/model/UserProfile;

    iput-object p3, p0, Ld5/h1;->c:Lc9/a;

    iput-object p4, p0, Ld5/h1;->d:Lc9/a;

    iput p5, p0, Ld5/h1;->e:I

    sget v0, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->ۣ۟ۤۡ۠:I

    xor-int/lit16 v0, v0, -0x38b

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Landroidx/compose/foundation/relocation/۟۟ۢۥ۟;->ۥۨ۠۟()I

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
    const-string v0, "Av7G49yI4B77jB"

    invoke-static {v0}, Ln/ۣۣۢۢ;->۟ۡ۠ۥۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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
    .locals 13

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v12, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v6, 0x0

    const-string v9, "\u06e3\u06df\u06e2"

    move-object v7, v6

    :goto_0
    invoke-static {v9}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    or-int v11, v10, v12

    const-string v6, "\u06e3\u06e0\u06e1"

    move-object v9, v6

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lv0/ۣ۟۟ۤۧ;->ۣۢۡۨ(Ljava/lang/Object;)Lcom/auto/accept/ui/viewmodel/MainViewModel;

    move-result-object v0

    const-string v6, "\u06e6\u06e1\u06df"

    move-object v9, v6

    goto :goto_0

    :sswitch_1
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v6

    const-string v9, "\u06e6\u06df\u06e1"

    move-object v7, v6

    goto :goto_0

    :sswitch_2
    and-int/lit8 v12, v5, 0x1

    const-string v6, "\u06e5\u06e2\u06e0"

    move-object v9, v6

    goto :goto_0

    :sswitch_3
    move-object v6, p2

    check-cast v6, Ljava/lang/Number;

    const-string v9, "\u06e0\u06e7\u06e7"

    move-object v8, v6

    goto :goto_0

    :sswitch_4
    xor-int/lit8 v10, v5, 0x1

    const-string v6, "\u06e0\u06e8\u06e3"

    move-object v9, v6

    goto :goto_0

    :sswitch_5
    invoke-static {v8}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v5

    const-string v6, "\u06df\u06e8\u06e2"

    move-object v9, v6

    goto :goto_0

    :sswitch_6
    move-object v4, p1

    check-cast v4, Lm0/m;

    const-string v6, "\u06e4\u06e2\u06e7"

    move-object v9, v6

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Le1/ۦۣۢۥ;->ۣ۟ۥۣۤ(Ljava/lang/Object;)I

    move-result v5

    const-string v6, "\u06df\u06e7"

    move-object v9, v6

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, La/ۥۡۢۨ;->ۣۡ۟ۡ(Ljava/lang/Object;)Lcom/auto/accept/data/model/UserProfile;

    move-result-object v1

    const-string v6, "\u06e1\u06e5\u06e8"

    move-object v9, v6

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Lh3/ۣ۟ۢۡۤ;->ۦۡۥۣ(Ljava/lang/Object;)Lc9/a;

    move-result-object v2

    const-string v6, "\u06e8\u06e7"

    move-object v9, v6

    goto :goto_0

    :sswitch_a
    invoke-static {v11}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v5

    const-string v6, "\u06e7\u06e4\u06e1"

    move-object v9, v6

    goto :goto_0

    :sswitch_b
    invoke-static/range {v0 .. v5}, Ls2/۟ۧ۟ۧۤ;->ۣۣۨ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v6, "\u06e0\u06e8\u06e5"

    move-object v9, v6

    goto :goto_0

    :sswitch_c
    invoke-static {p0}, Lp0/۟ۢۤۧ;->۟ۤۨۢۨ(Ljava/lang/Object;)Lc9/a;

    move-result-object v3

    const-string v6, "\u06e6\u06e1\u06e2"

    move-object v9, v6

    goto :goto_0

    :sswitch_d
    return-object v7

    nop

    :sswitch_data_0
    .sparse-switch
        0xdbe8 -> :sswitch_2
        0xdcff -> :sswitch_c
        0x1aa819 -> :sswitch_0
        0x1aabc0 -> :sswitch_5
        0x1aabdd -> :sswitch_1
        0x1aaf44 -> :sswitch_9
        0x1ab606 -> :sswitch_6
        0x1ab624 -> :sswitch_a
        0x1aba29 -> :sswitch_3
        0x1abde3 -> :sswitch_4
        0x1ac148 -> :sswitch_d
        0x1ac184 -> :sswitch_8
        0x1ac187 -> :sswitch_7
        0x1ac5a4 -> :sswitch_b
    .end sparse-switch
.end method
