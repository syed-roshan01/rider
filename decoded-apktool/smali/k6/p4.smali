.class public final Lk6/p4;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public c:Z

.field public d:J

.field public final e:Lk6/l4;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/l4;Ljava/lang/String;J)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/p4;->e:Lk6/l4;

    invoke-static {p2}, Lfa/ۦۣۡۢ;->۟ۡۧۢ۠(Ljava/lang/Object;)V

    iput-object p2, p0, Lk6/p4;->a:Ljava/lang/String;

    iput-wide p3, p0, Lk6/p4;->b:J

    invoke-static {}, Lg7/۠ۤۧ;->ۨ۟ۥۤ()I

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
    const-string v0, "NAYhBRitD8hhp8khv9Ke6RqrcQ"

    invoke-static {v0}, Lb4/ۦۣۧ۟;->ۣۨ۟۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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
.method public final a()J
    .locals 4

    invoke-static {p0}, Ll8/ۣ۟ۧۢ۠;->ۣ۟ۤۤ۠(Ljava/lang/Object;)Z

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

    iput-boolean v0, p0, Lk6/p4;->c:Z

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/ۣۡۧۥ;->ۢۢۤ۠(Ljava/lang/Object;)Lk6/l4;

    move-result-object v0

    invoke-static {v0}, Ln/ۣۣۢۢ;->ۣۣ۟ۦۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {p0}, Lt2/۟ۢ۟ۢ۟;->۟۠ۢۥ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lcom/google/firebase/measurement/۟۠۟ۤۧ;->۟۟۠ۧۨ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ldagger/hilt/internal/aggregatedroot/codegen/۟۠۟ۨ۠;->ۦ۟ۥ۟(Ljava/lang/Object;Ljava/lang/Object;J)J

    move-result-wide v0

    iput-wide v0, p0, Lk6/p4;->d:J

    :sswitch_3
    invoke-static {p0}, Lg4/۠ۤۢۥ;->ۨۥۧۨ(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public final b(J)V
    .locals 3

    invoke-static {p0}, Lcom/google/crypto/tink/shaded/protobuf/ۣۡۧۥ;->ۢۢۤ۠(Ljava/lang/Object;)Lk6/l4;

    move-result-object v0

    invoke-static {v0}, Ln/ۣۣۢۢ;->ۣۣ۟ۦۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/heartbeatinfo/ۤ۠ۥۦ;->ۣۦۤۤ(Ljava/lang/Object;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-static {p0}, Lt2/۟ۢ۟ۢ۟;->۟۠ۢۥ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1, p2}, Lq6/ۡۨۧۨ;->ۦۦۢۡ(Ljava/lang/Object;Ljava/lang/Object;J)Landroid/content/SharedPreferences$Editor;

    invoke-static {v0}, Lk2/۟ۢۦۤۤ;->ۧۧۥ۟(Ljava/lang/Object;)V

    iput-wide p1, p0, Lk6/p4;->d:J

    invoke-static {}, Lx4/ۣۡۢ۠;->ۡ۟۠ۥ()I

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
    const-string v0, "Iozjx7gQO5"

    invoke-static {v0}, Lj3/۟ۧۧۦۤ;->۟۠ۦۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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
