.class public final Lk6/o0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lk6/q3;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lk6/q3;JI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p4, p0, Lk6/o0;->a:I

    iput-object p1, p0, Lk6/o0;->c:Lk6/q3;

    iput-wide p2, p0, Lk6/o0;->b:J

    invoke-static {}, Ll6/ۣۧۧۧ;->۟ۤۢۢۧ()I

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
    const-string v0, "v4yOvdx"

    invoke-static {v0}, Lcom/google/android/gms/auth/api/signin/ۣ۟۟ۧۨ;->۟ۦۢۢ۠(Ljava/lang/String;)Ljava/lang/String;

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
.method public final run()V
    .locals 4

    invoke-static {p0}, Lc4/۟ۦۧۦۤ;->۟ۡۡۨۢ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lo1/۟ۡۡۦۣ;->ۨۢ۟ۨ(Ljava/lang/Object;)J

    move-result-wide v2

    invoke-static {p0}, Lh3/ۣ۟ۢۡۤ;->۟ۥۥۣۨ(Ljava/lang/Object;)Lk6/q3;

    move-result-object v0

    packed-switch v1, :pswitch_data_0

    check-cast v0, Lk6/p6;

    invoke-static {v0}, Lcom/google/firebase/firestore/remote/ۣۣ۟۟۟;->۟ۥۣۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk6/f5;

    invoke-static {v1}, Lcom/google/firebase/analytics/ktx/ktxtesting/۟ۦۣۧۧ;->۟ۧۡ۟ۨ(Ljava/lang/Object;)Lk6/q;

    move-result-object v1

    invoke-static {v1, v2, v3}, Lt2/۟ۧۢ۟ۢ;->ۣ۟ۧ۟ۡ(Ljava/lang/Object;J)V

    const/4 v1, 0x0

    iput-object v1, v0, Lk6/p6;->e:Lk6/q6;

    :goto_0
    :sswitch_0
    return-void

    :pswitch_0
    check-cast v0, Lk6/q;

    invoke-static {v0, v2, v3}, Lcom/google/firebase/messaging/۟۟ۧ۟;->۠۟ۤ۠(Ljava/lang/Object;J)V

    invoke-static {}, Lr2/ۡۧۥۧ;->ۢۥۤۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_1
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_1
    const/16 v0, 0x68e

    goto :goto_1

    :sswitch_2
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_1

    :sswitch_3
    const-string v0, "xsq"

    invoke-static {v0}, Lcom/google/firebase/dynamicloading/ۣ۟۠ۨۢ;->ۣ۟ۧۧۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_1
        0x31 -> :sswitch_2
        0xcc -> :sswitch_3
        0xef -> :sswitch_0
    .end sparse-switch
.end method
