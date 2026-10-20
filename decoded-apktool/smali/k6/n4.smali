.class public final Lk6/n4;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public c:Z

.field public d:Z

.field public final e:Lk6/l4;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/l4;Ljava/lang/String;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/n4;->e:Lk6/l4;

    invoke-static {p2}, Lfa/ۦۣۡۢ;->۟ۡۧۢ۠(Ljava/lang/Object;)V

    iput-object p2, p0, Lk6/n4;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lk6/n4;->b:Z

    invoke-static {}, Lc7/۟ۦۣۢۦ;->۟ۦۨۢ()I

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
    const-string v0, "rWIvoP0XY"

    invoke-static {v0}, Lh0/۟ۥ۟ۡۦ;->ۣۨۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

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
.method public final a(Z)V
    .locals 6

    const/4 v1, 0x0

    const-string v5, "\u06e1\u06e5\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0}, Ln/ۣۣۢۢ;->ۣۣ۟ۦۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v5, "\u06e7\u06e4\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {v3, v4, p1}, Lz0/ۣ۟۠ۤ۟;->۟ۤۤۨ(Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/content/SharedPreferences$Editor;

    const-string v1, "\u06e8\u06e4\u06e8"

    move-object v5, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->ۣ۟ۤۡۦ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v0

    const-string v1, "\u06df\u06e8\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v3}, Lk2/۟ۢۦۤۤ;->ۧۧۥ۟(Ljava/lang/Object;)V

    const-string v1, "\u06e8\u06e8\u06e3"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v2}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v5, "\u06e5\u06e1\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    iput-boolean p1, p0, Lk6/n4;->d:Z

    const-string v1, "\u06e6\u06e1\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroid/os/ۣۣ۟ۤۨ;->۟ۦۥ۟ۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e5\u06e1\u06e4"

    move-object v4, v1

    goto :goto_0

    :sswitch_6
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf3f -> :sswitch_1
        0x1abdc6 -> :sswitch_5
        0x1abdc8 -> :sswitch_0
        0x1ac18c -> :sswitch_6
        0x1ac5a3 -> :sswitch_3
        0x1ac96c -> :sswitch_2
        0x1ac9e3 -> :sswitch_4
    .end sparse-switch
.end method

.method public final b()Z
    .locals 3

    invoke-static {p0}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟ۡۤ۠(Ljava/lang/Object;)Z

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lk6/n4;->c:Z

    invoke-static {p0}, Lcom/google/gson/internal/bind/ۥۣۨۡ;->ۣ۟ۤۡۦ(Ljava/lang/Object;)Lk6/l4;

    move-result-object v0

    invoke-static {v0}, Ln/ۣۣۢۢ;->ۣۣ۟ۦۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {p0}, Landroid/os/ۣۣ۟ۤۨ;->۟ۦۥ۟ۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Landroidx/core/app/ۣۥۢۧ;->۟ۡۢۢۥ(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/google/firebase/firestore/auth/۠ۦۣۢ;->۟ۥ۟ۤۦ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v0

    iput-boolean v0, p0, Lk6/n4;->d:Z

    :sswitch_3
    invoke-static {p0}, Lu1/ۢۥ۠ۤ;->ۦۢ۠ۢ(Ljava/lang/Object;)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
