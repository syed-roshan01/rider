.class public final Lk6/h6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lk6/s5;

.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:Lk6/s5;

.field public final f:Lk6/y5;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/y5;Lk6/s5;JJZLk6/s5;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/h6;->f:Lk6/y5;

    iput-object p2, p0, Lk6/h6;->a:Lk6/s5;

    iput-wide p3, p0, Lk6/h6;->b:J

    iput-wide p5, p0, Lk6/h6;->c:J

    iput-boolean p7, p0, Lk6/h6;->d:Z

    iput-object p8, p0, Lk6/h6;->e:Lk6/s5;

    invoke-static {}, Ldagger/hilt/internal/ۡۡۨۦ;->ۣۢ۠ۧ()I

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
    const-string v0, "UUUHOFYEFzYdoFPyx17SNtwWyn"

    invoke-static {v0}, Landroidx/activity/ۣۧۧۢ;->ۣ۟ۨ۠۠(Ljava/lang/String;)Ljava/lang/String;

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
.method public final run()V
    .locals 8

    invoke-static {p0}, Ld1/ۣۧۡۡ;->ۨۨۢۦ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v6

    invoke-static {p0}, Lw4/ۥۧۡۥ;->ۡۨۡۥ(Ljava/lang/Object;)Lk6/s5;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۢۥۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lk3/۟ۧ۠۠ۦ;->ۣۤۢ۟(Ljava/lang/Object;)J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v6, v0, v1, v2}, Li6/۟۟ۦۨۧ;->۠ۦ۠ۢ(Ljava/lang/Object;JZ)V

    invoke-static {p0}, Ld1/ۣۧۡۡ;->ۨۨۢۦ(Ljava/lang/Object;)Lk6/y5;

    move-result-object v0

    invoke-static {p0}, Lw4/ۥۧۡۥ;->ۡۨۡۥ(Ljava/lang/Object;)Lk6/s5;

    move-result-object v1

    invoke-static {p0}, Lq0/ۥۣۡۧ;->۟۟ۨۡۤ(Ljava/lang/Object;)J

    move-result-wide v2

    const/4 v4, 0x1

    invoke-static {p0}, Ls7/ۧۤۦۤ;->۟ۡۥ۟(Ljava/lang/Object;)Z

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->۟ۨۦۨ(Ljava/lang/Object;Ljava/lang/Object;JZZ)V

    invoke-static {}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۣۤۧۥ()Z

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v6}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {}, Lh3/۟ۡۥ۠۠;->ۣۣۧۧ()Lk6/x3;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۢۨۥۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lc4/۟ۢۨۥۡ;->۟۠۠ۡۤ(Ljava/lang/Object;)Lk6/s5;

    move-result-object v0

    invoke-static {v6, v7, v0}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->۟ۢۦۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_5
    .end sparse-switch
.end method
