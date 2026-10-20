.class public final Lk6/j6;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Lk6/p2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/p6;Lk6/q6;Lk6/q6;JZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lk6/j6;->a:I

    iput-object p1, p0, Lk6/j6;->f:Lk6/p2;

    iput-object p2, p0, Lk6/j6;->d:Ljava/lang/Object;

    iput-object p3, p0, Lk6/j6;->e:Ljava/lang/Object;

    iput-wide p4, p0, Lk6/j6;->b:J

    iput-boolean p6, p0, Lk6/j6;->c:Z

    invoke-static {}, Lv8/۟ۧۢ۟ۢ;->ۨۥۦۤ()I

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
    const-string v0, "rCzMOroLPLRgNo5C0HXDWuVlzVX"

    invoke-static {v0}, Lcom/google/android/gms/internal/stats/ۧۦۣ۟;->۟۠ۧۦۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public constructor <init>(Lk6/y5;Lk6/s5;JZLk6/s5;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lk6/j6;->a:I

    iput-object p1, p0, Lk6/j6;->f:Lk6/p2;

    iput-object p2, p0, Lk6/j6;->d:Ljava/lang/Object;

    iput-wide p3, p0, Lk6/j6;->b:J

    iput-boolean p5, p0, Lk6/j6;->c:Z

    iput-object p6, p0, Lk6/j6;->e:Ljava/lang/Object;

    invoke-static {}, Lp8/ۡۤ;->ۦ۠ۢۧ()I

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
    const-string v0, "F3cSnghCB"

    invoke-static {v0}, Lj2/ۥ۠ۨۢ;->ۤۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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
.method public final run()V
    .locals 8

    const/4 v7, 0x0

    invoke-static {p0}, Lv5/ۧۥۢۡ;->ۣۣۣ۟ۧ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lm9/۟ۤۢۦ۠;->۟ۥۧ۟ۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {p0}, Lf0/ۣۦۦ۠;->ۣ۟ۡ۠ۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p0}, Laa/۟ۦۣۢۨ;->ۣ۟۟۟ۨ(Ljava/lang/Object;)Lk6/p2;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lk6/p6;

    check-cast v2, Lk6/q6;

    move-object v3, v6

    check-cast v3, Lk6/q6;

    invoke-static {p0}, Lq0/۟ۧۤۧ;->۟ۢۨ۠ۨ(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static {p0}, Lw/ۥۣۡۡ;->۟ۤۤۨۤ(Ljava/lang/Object;)Z

    move-result v6

    invoke-static/range {v1 .. v7}, Lh4/ۣ۟ۢۢۡ;->۟۟ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JZLjava/lang/Object;)V

    :goto_0
    :sswitch_0
    return-void

    :pswitch_0
    move-object v0, v1

    check-cast v0, Lk6/y5;

    move-object v1, v2

    check-cast v1, Lk6/s5;

    invoke-static {v0, v1}, Lcom/google/firebase/firestore/index/ۣ۟۠ۤۨ;->ۢۥۤ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lq0/۟ۧۤۧ;->۟ۢۨ۠ۨ(Ljava/lang/Object;)J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-static {p0}, Lw/ۥۣۡۡ;->۟ۤۤۨۤ(Ljava/lang/Object;)Z

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/google/firebase/firestore/bundle/ۡۦۤۡ;->۟ۨۦۨ(Ljava/lang/Object;Ljava/lang/Object;JZZ)V

    invoke-static {}, Lcom/google/firebase/encoders/ۣۢۦۢ;->ۣۤۧۥ()Z

    move-result v3

    const/16 v2, 0x650

    :goto_1
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_1
    const/16 v2, 0x68e

    goto :goto_1

    :sswitch_2
    if-eqz v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_1

    :sswitch_3
    invoke-static {v0}, Lcom/google/android/gms/internal/auth-api-phone/ۣۨۢۧ;->ۤۥ۟(Ljava/lang/Object;)Lk6/f;

    move-result-object v2

    invoke-static {}, Lh3/۟ۡۥ۠۠;->ۣۣۧۧ()Lk6/x3;

    move-result-object v3

    invoke-static {v2, v7, v3}, Lcom/google/firebase/messaging/reporting/۟ۤ۟ۡۨ;->ۢۨۥۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    if-eqz v3, :cond_1

    const/16 v2, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v2, 0x70a

    goto :goto_2

    :sswitch_6
    check-cast v6, Lk6/s5;

    invoke-static {v0, v1, v6}, Lcom/google/android/gms/common/util/ۣۤۡۢ;->۟ۢۦۤ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_7
    invoke-static {}, Lu1/ۢۥ۠ۤ;->ۦۡۧۥ()I

    move-result v1

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-gtz v1, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    const-string v0, "Iaoj"

    invoke-static {v0}, Lc1/ۣۡۢۦ;->۟ۥۧۧۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_0
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch
.end method
