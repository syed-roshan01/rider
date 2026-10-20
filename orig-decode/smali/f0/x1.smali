.class public final Lf0/x1;
.super Ljava/lang/Object;

# interfaces
.implements Lv/f2;


# instance fields
.field public final a:Lv/f2;

.field public final b:Lm0/j0;

.field public final c:Lm0/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lv/f2;Lf0/a2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/x1;->a:Lv/f2;

    new-instance v0, Lf0/w1;

    const/4 v1, 0x1

    invoke-direct {v0, p2, v1}, Lf0/w1;-><init>(Lf0/a2;I)V

    invoke-static {v0}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->ۡۦۥ۟(Ljava/lang/Object;)Lm0/j0;

    move-result-object v0

    iput-object v0, p0, Lf0/x1;->b:Lm0/j0;

    new-instance v0, Lf0/w1;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lf0/w1;-><init>(Lf0/a2;I)V

    invoke-static {v0}, Landroidx/versionedparcelable/۟ۦۦ۟ۧ;->ۡۦۥ۟(Ljava/lang/Object;)Lm0/j0;

    move-result-object v0

    iput-object v0, p0, Lf0/x1;->c:Lm0/j0;

    invoke-static {}, Li/ۣۢۦ۠;->۟۠ۡۥۣ()I

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
    const-string v0, "kX6Oxd8X"

    invoke-static {v0}, Lm7/ۥۨۥ۟;->ۤۡۡۧ(Ljava/lang/String;)Ljava/lang/String;

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
.method public final a()Z
    .locals 6

    const/4 v0, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e0\u06e4\u06e2"

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۠ۧۤۡ(Ljava/lang/Object;)Lm0/j0;

    move-result-object v0

    const-string v4, "\u06e5\u06e2\u06df"

    move-object v3, v0

    goto :goto_0

    :sswitch_0
    invoke-static {v3}, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->ۧ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e2\u06df\u06e3"

    move-object v4, v0

    goto :goto_0

    :sswitch_1
    invoke-static {v2}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v5

    const-string v0, "\u06e7\u06e6\u06e3"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    move-object v0, v1

    check-cast v0, Ljava/lang/Boolean;

    const-string v4, "\u06df\u06df\u06e1"

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    return v5

    :sswitch_data_0
    .sparse-switch
        0x1aa701 -> :sswitch_1
        0x1ab246 -> :sswitch_2
        0x1abde2 -> :sswitch_0
        0x1ac5e4 -> :sswitch_3
    .end sparse-switch
.end method

.method public final b()Z
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۦۨۨۤ(Ljava/lang/Object;)Lv/f2;

    move-result-object v0

    invoke-static {v0}, Lm9/۟ۤۢۦ۠;->ۣ۟ۢۡۥ(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final c(Lu/s1;Lc9/e;Lu8/e;)Ljava/lang/Object;
    .locals 4

    const/4 v1, 0x0

    const-string v3, "\u06e5\u06df\u06e4"

    move-object v0, v1

    move-object v2, v1

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۦۨۨۤ(Ljava/lang/Object;)Lv/f2;

    move-result-object v0

    const-string v1, "\u06e0\u06e1\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v0, p1, p2, p3}, Lp0/۟ۧۧۧ۟;->ۨۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "\u06df\u06e6\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7dc -> :sswitch_1
        0x1aab02 -> :sswitch_0
    .end sparse-switch
.end method

.method public final d()Z
    .locals 6

    const/4 v0, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e6\u06e6\u06e7"

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    :goto_0
    invoke-static {v4}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {v2}, La/ۥۡۢۨ;->۠ۨۦ(Ljava/lang/Object;)Z

    move-result v5

    const-string v0, "\u06e0\u06e0\u06e4"

    move-object v4, v0

    goto :goto_0

    :sswitch_0
    move-object v0, v1

    check-cast v0, Ljava/lang/Boolean;

    const-string v4, "\u06e8\u06df\u06e5"

    move-object v2, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/۟ۥۤۧۧ;->۠ۢۧۡ(Ljava/lang/Object;)Lm0/j0;

    move-result-object v0

    const-string v4, "\u06e3\u06e3\u06e7"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    invoke-static {v3}, Lcom/google/android/datatransport/cct/ۤۨۧۧ;->ۧ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e0\u06e4\u06e1"

    move-object v4, v0

    goto :goto_0

    :sswitch_3
    return v5

    :sswitch_data_0
    .sparse-switch
        0x1aaae4 -> :sswitch_3
        0x1aab5d -> :sswitch_0
        0x1ab687 -> :sswitch_2
        0x1ac227 -> :sswitch_1
    .end sparse-switch
.end method

.method public final e(F)F
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۦۨۨۤ(Ljava/lang/Object;)Lv/f2;

    move-result-object v0

    invoke-static {v0, p1}, Lj6/ۣۦۢ۠;->ۢ۟ۡۨ(Ljava/lang/Object;F)F

    move-result v0

    return v0
.end method
