.class public final Ld5/y1;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:Lc9/a;

.field public final e:Lc9/a;

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;IILc9/a;Lc9/a;I)V
    .locals 2

    iput-object p1, p0, Ld5/y1;->a:Ljava/util/List;

    iput p2, p0, Ld5/y1;->b:I

    iput p3, p0, Ld5/y1;->c:I

    iput-object p4, p0, Ld5/y1;->d:Lc9/a;

    iput-object p5, p0, Ld5/y1;->e:Lc9/a;

    iput p6, p0, Ld5/y1;->f:I

    sget v0, Lg2/ۢۥۥۡ;->۟ۧۥۦۤ:I

    xor-int/lit16 v0, v0, -0x21f

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lq5/۟ۥۣۢۨ;->۟ۡ۟ۦ۟()I

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
    const-string v0, "jif3n6orYfTk"

    invoke-static {v0}, Lr5/۟ۤۨۥۡ;->۟۠۟ۡۡ(Ljava/lang/String;)Ljava/lang/String;

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
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    const/4 v5, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v7, 0x0

    const-string v10, "\u06df\u06e5\u06e7"

    move-object v8, v7

    :goto_0
    invoke-static {v10}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    invoke-static {p0}, Lcom/google/firebase/installations/interop/ۧ۟ۨۧ;->۟ۦۨۥۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v7, "\u06e8\u06e7\u06e6"

    move-object v10, v7

    goto :goto_0

    :sswitch_0
    invoke-static {v9}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    const-string v7, "\u06e5\u06e7\u06e0"

    move-object v10, v7

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/ۦۢ۟ۧ;->ۨۢۡ(Ljava/lang/Object;)I

    move-result v2

    const-string v7, "\u06e8\u06e3\u06e2"

    move-object v10, v7

    goto :goto_0

    :sswitch_2
    and-int/lit8 v11, v6, 0x1

    const-string v7, "\u06e3\u06e5\u06e6"

    move-object v10, v7

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Ls7/۟ۢ۟ۤۧ;->۟ۡۡۦۨ(Ljava/lang/Object;)I

    move-result v6

    const-string v7, "\u06e4\u06e5\u06e0"

    move-object v10, v7

    goto :goto_0

    :sswitch_4
    invoke-static {v13}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v6

    const-string v7, "\u06e1\u06e4\u06e6"

    move-object v10, v7

    goto :goto_0

    :sswitch_5
    invoke-static/range {v0 .. v6}, Ldagger/hilt/android/lifecycle/۟۠ۢ۠۟;->ۢ۟ۤۤ(Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v7, "\u06e4\u06e6\u06e3"

    move-object v10, v7

    goto :goto_0

    :sswitch_6
    move-object v5, p1

    check-cast v5, Lm0/m;

    const-string v7, "\u06e6\u06e2\u06e2"

    move-object v10, v7

    goto :goto_0

    :sswitch_7
    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v7

    const-string v10, "\u06df\u06e2\u06e0"

    move-object v8, v7

    goto :goto_0

    :sswitch_8
    move-object/from16 v7, p2

    check-cast v7, Ljava/lang/Number;

    const-string v10, "\u06e4\u06e8\u06e3"

    move-object v9, v7

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Landroidx/activity/ۣۧۧۢ;->۟ۥۣۨۡ(Ljava/lang/Object;)I

    move-result v1

    const-string v7, "\u06e1\u06e6"

    move-object v10, v7

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lw/ۥۣۡۡ;->۟ۦۥۥۧ(Ljava/lang/Object;)Lc9/a;

    move-result-object v3

    const-string v7, "\u06e2\u06df\u06e2"

    move-object v10, v7

    goto :goto_0

    :sswitch_b
    xor-int/lit8 v12, v6, 0x1

    const-string v7, "\u06e1\u06e1\u06e4"

    move-object v10, v7

    goto :goto_0

    :sswitch_c
    or-int v13, v12, v11

    const-string v7, "\u06e6\u06df\u06e2"

    move-object v10, v7

    goto :goto_0

    :sswitch_d
    invoke-static {p0}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->۟ۤ۟ۦۨ(Ljava/lang/Object;)Lc9/a;

    move-result-object v4

    const-string v7, "\u06e6\u06e4\u06e7"

    move-object v10, v7

    goto :goto_0

    :sswitch_e
    return-object v8

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc25 -> :sswitch_1
        0x1aa75d -> :sswitch_e
        0x1aa7c1 -> :sswitch_6
        0x1aaec4 -> :sswitch_c
        0x1aaf23 -> :sswitch_5
        0x1ab245 -> :sswitch_d
        0x1ab6c4 -> :sswitch_b
        0x1aba7f -> :sswitch_2
        0x1abaa1 -> :sswitch_7
        0x1abadf -> :sswitch_0
        0x1ac149 -> :sswitch_4
        0x1ac1a6 -> :sswitch_8
        0x1ac1e9 -> :sswitch_3
        0x1ac947 -> :sswitch_a
        0x1ac9c7 -> :sswitch_9
    .end sparse-switch
.end method
